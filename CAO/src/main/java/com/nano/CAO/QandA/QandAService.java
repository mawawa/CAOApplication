package com.nano.CAO.QandA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.naming.ldap.SortKey;
import java.util.ArrayList;
import java.util.List;

@Service
public class QandAService {
    @Autowired
    QARepository qaRepository;

    public void addQuestion(QuestionAnswer questionAnswer){
        qaRepository.save(questionAnswer);
    }
    public void deleteQuestionById(Long questionAnswer){
        qaRepository.deleteById(questionAnswer);
    }
    public void deleteQuestion(QuestionAnswer questionAnswer){
        qaRepository.delete(questionAnswer);
    }

    public List<QuestionAnswer> getQuestions(){
        return qaRepository.findAll(Sort.by(Sort.Direction.ASC, "number"));
    }

    public List<QuestionAnswer> getQuestions(int tutorial){
        List<QuestionAnswer> questionAnswers = new ArrayList<>();
        for(QuestionAnswer qandA: qaRepository.findAll(Sort.by(Sort.Direction.ASC, "number"))){
            if(qandA.getTutorial()== tutorial){
                questionAnswers.add(qandA);
            }
        }
        return  questionAnswers;
    }



}

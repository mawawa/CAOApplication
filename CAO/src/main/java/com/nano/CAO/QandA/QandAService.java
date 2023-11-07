package com.nano.CAO.QandA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return qaRepository.findAll();
    }

}

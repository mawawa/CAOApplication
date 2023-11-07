package com.nano.CAO.QandA;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QARepository extends JpaRepository<QuestionAnswer, Long> {
}

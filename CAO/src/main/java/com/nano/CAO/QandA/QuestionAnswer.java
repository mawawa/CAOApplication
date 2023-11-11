package com.nano.CAO.QandA;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class QuestionAnswer {
    @SequenceGenerator(
            name = "qaGenerator", sequenceName = "qaGenerator", initialValue = 1, allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE, generator = "qaGenerator"
    )
    @Id
    private Long sysId;
    private String number;
    private int tutorial;

    @Column(length = 1000)
    private String question;

    @Column(length = 1000)
    private String answer;


}

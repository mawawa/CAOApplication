package com.nano.CAO.computer;

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
public class CAOComputer {
    @SequenceGenerator(name = "computerGenerator", sequenceName = "computerGenerator", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "computerGenerator", strategy = GenerationType.SEQUENCE)
    @Id
    private Long sysID;
    private String description;
}

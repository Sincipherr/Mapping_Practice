package com.geekster.Mapping.Practice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    private Integer studentAge;
    private String studentNumber;
    private String studentBranch;
    private String studentDepartment;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;


}

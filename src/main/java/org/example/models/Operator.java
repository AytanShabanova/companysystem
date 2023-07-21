package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Operator extends Employee {
    public Operator(Long id, int salary) {
        super(id, salary);
    }

}

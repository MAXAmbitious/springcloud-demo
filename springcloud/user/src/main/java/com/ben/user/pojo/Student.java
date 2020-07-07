package com.ben.user.pojo;

import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@Table(name = "student")
public class Student {
    @NonNull
    private String id;
    private String name;
    private String age;
}
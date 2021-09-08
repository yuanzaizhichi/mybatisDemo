package com.cxf.mybatisdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;
}

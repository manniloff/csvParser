package com.csvparser.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Csv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String a;

    private String b;

    private String c;

    private String d;

    private String e;

    private String f;

    private String h;

    private String i;

    private String j;
}

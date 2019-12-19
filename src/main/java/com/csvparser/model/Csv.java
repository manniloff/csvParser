package com.csvparser.model;

import lombok.Data;

import javax.persistence.*;

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

    @Lob
    private String e;

    private String f;

    private String g;

    private String h;

    private String i;

    private String j;
}

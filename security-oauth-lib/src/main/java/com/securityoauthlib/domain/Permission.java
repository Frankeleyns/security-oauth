package com.securityoauthlib.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Permission {

    @Id
    private String id;

    private String url;

    private String name;

    private String description;

    private String pid;


}

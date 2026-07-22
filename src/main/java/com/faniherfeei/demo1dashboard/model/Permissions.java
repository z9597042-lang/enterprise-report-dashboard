package com.faniherfeei.demo1dashboard.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "dashboard")
@Getter
@Setter
public class Permissions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int permissionId;

    @Column(nullable = false,unique = true)
    private String permissionName;

}

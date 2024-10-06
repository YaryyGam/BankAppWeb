package com.yaryy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@Table(name="users")
public class User {
    @Id
    private int id;
    private String role;
    private String username;
    private String password;
}
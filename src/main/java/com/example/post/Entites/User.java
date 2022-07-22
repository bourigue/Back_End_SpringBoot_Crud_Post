package com.example.post.Entites;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class User  implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private int age;
    @ManyToMany
    private Collection<userRole> useroles;

}

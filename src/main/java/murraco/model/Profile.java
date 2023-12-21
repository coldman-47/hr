package murraco.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Profile {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

}

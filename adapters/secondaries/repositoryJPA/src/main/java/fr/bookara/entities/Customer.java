package fr.bookara.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Boolean advertising = false;

    @OneToOne(cascade = CascadeType.PERSIST)
    private UserAccount user;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Appointement> appointements = new ArrayList<>();

}
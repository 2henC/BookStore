package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    @Column(nullable = false)
    private String name;
    private String bio;
    @Column(nullable = false)
    private String contact;
    private String address;

    @OneToMany(mappedBy = "author")
    protected Set<Book> books = new HashSet<>();
}

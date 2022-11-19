package peaksoft.entity;

import jakarta.persistence.Entity;
import javaks.persistence.*;
import lombok.*;
import org.hibernate.annotations.Table;

import java.util.List;

@Entity
@Table(name="companies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String locatedCountry;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "company")
    private List<Course> courses;
}

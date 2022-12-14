package kg.peaksoft.peaksoftlmsab4.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "results")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean accepted;
    private String studentName;
    private int error;
    private int correct;
    private int points;

    @CreatedDate
    private LocalDate localDate;
}

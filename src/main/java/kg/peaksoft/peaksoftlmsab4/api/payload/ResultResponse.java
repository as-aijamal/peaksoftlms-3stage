package kg.peaksoft.peaksoftlmsab4.api.payload;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ResultResponse {


    private String studentName;
    private int error;
    private int correct;
    private int point;
    private LocalDate localDate;
}

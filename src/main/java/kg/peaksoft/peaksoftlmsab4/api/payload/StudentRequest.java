package kg.peaksoft.peaksoftlmsab4.api.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import kg.peaksoft.peaksoftlmsab4.model.enums.StudyFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NotBlank
public class StudentRequest {
    private String firstName;
    private String lastName;
    private String mobilePhone;
    private String password;
    private String email;
    @Enumerated(value = EnumType.STRING)
    private StudyFormat studyFormat;
}

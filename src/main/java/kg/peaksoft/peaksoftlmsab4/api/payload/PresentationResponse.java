package kg.peaksoft.peaksoftlmsab4.api.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
public class PresentationResponse {
    Long id;
    @JsonProperty("presentation_name")
    private String presentationName;
    private String description;
    private String link;
}

package de.herhackathon.backendservice.model.respoonse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import de.herhackathon.backendservice.model.DietaryInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserResponseDto {

    private int id;
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String birthdate;
    private String phoneNumber;
    private List<String> allergies;
    private List<DietaryInfo> dietaryInfos;
    private List<String> diseases;
    private List<String> communities;
    private int rewardPoints;
}

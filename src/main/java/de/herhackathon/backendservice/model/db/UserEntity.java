package de.herhackathon.backendservice.model.db;

import de.herhackathon.backendservice.model.DietaryInfo;
import de.herhackathon.backendservice.model.db.AddressEntity;
import de.herhackathon.backendservice.model.db.CommunityEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@Entity(name = "userentity")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id", nullable = false)
    private int id;
    private String email;
    private String firstName;
    private String lastName;
    //private AddressEntity address;
    private String birthdate;
    private String phoneNumber;
  //  private List<String> allergies;
    //private List<DietaryInfo> dietaryInfos;
    //private List<String> diseases;
    //private List<CommunityEntity> communities;
    private int rewardPoints;
}

package de.herhackathon.backendservice.model.db;

import de.herhackathon.backendservice.model.DietaryInfo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
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

    @ManyToMany(mappedBy = "users")
    private List<CommunityEntity> communities;

    private int rewardPoints;
}

package de.herhackathon.backendservice.model.db;

import de.herhackathon.backendservice.model.CommunityType;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@Entity(name = "community")
public class CommunityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    private CommunityType type;
    //private List<UserEntity> users;
    //private List<RequestEntity> requests;
}

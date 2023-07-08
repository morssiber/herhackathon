package de.herhackathon.backendservice.model.db;

import de.herhackathon.backendservice.model.RequestStatus;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
@Entity(name = "request")
public class RequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    private String description;
    //private List<ArticleEntity> articles;
    private RequestStatus status;
    private Date deadline;
    //private UserEntity request;
    //private UserEntity helper;
}

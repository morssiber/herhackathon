package de.herhackathon.backendservice.model.db;

import de.herhackathon.backendservice.model.RequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "requests")
public class RequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @OneToMany(mappedBy = "request")
    private List<ArticleEntity> articles;

    private RequestStatus status;

    private String deadline;

    @ManyToOne
    @JoinColumn(name = "requester_id", nullable = false)
    private UserEntity requester;

    @ManyToOne
    @JoinColumn(name = "helper_id", nullable = false)
    private UserEntity helper;
}

package de.herhackathon.backendservice.model.db;

import com.fasterxml.jackson.annotation.JsonBackReference;
import de.herhackathon.backendservice.model.RequestStatus;
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
@Entity(name = "requests")
public class RequestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @OneToMany(mappedBy = "request", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ArticleEntity> articles;

    private RequestStatus status;

    private String deadline;

    private int requesterId;

    private int helperId;
}

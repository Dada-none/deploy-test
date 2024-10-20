package com.dada.deploytest.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "profile")
public class Profile {

    @Id
    @Column(name = "profile_uid", length = 36, nullable = false)
    private String profileUid;

    @Column(name = "name", length = 20, nullable = false)
    private String name;
}

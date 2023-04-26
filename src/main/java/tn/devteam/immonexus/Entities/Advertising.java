package tn.devteam.immonexus.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Advertising implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAd;
    private String title;
    private String description;
    private String startDate;
    private String endDate;

    private String image;
    private double coutParJour;
    private double nbrVuesCible;
    private double coutParVueCible;
    private double gainPublicitaire; // ***
    private double nbrVuesFinal;
    private String socityName;

}

package tn.devteam.immonexus.Entities;

import lombok.*;

import java.io.Serializable;




@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdvInput implements Serializable {

    private String start;
    private String end;


}

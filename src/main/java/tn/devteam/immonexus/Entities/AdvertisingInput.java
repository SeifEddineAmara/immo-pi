package tn.devteam.immonexus.Entities;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdvertisingInput {
    Advertising advertising;
    MultipartFile file;
}

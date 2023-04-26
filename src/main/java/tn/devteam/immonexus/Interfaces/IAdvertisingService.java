package tn.devteam.immonexus.Interfaces;

import tn.devteam.immonexus.Entities.Advertising;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.util.List;

public interface IAdvertisingService {
    List<Advertising> getAllAdvertising(); // ok
    void deleteById(Long idAdvertising); // ok
    Advertising addAdvertising(Advertising ad);
    Advertising updateAdvertising(Advertising add);
    Advertising getAdvertisingById(Long idAd);


}

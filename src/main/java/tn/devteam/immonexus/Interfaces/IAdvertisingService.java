package tn.devteam.immonexus.Interfaces;

import tn.devteam.immonexus.Entities.Advertising;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IAdvertisingService {
    List<Advertising> getAllAdvertising(); // ok
    void deleteById(Long idAdvertising); // ok
    Advertising addAdvertising(Advertising ad);
    Advertising updateAdvertising(Advertising add);
    Advertising getAdvertisingById(Long idAd);


    double calculerGainPublicitaire(Advertising advertising);

    Long calculerNbreDesJours(Advertising advertising);


    List<Advertising> getAdvertisingBetweenTwoDates(Date startDate, Date endDate);
}

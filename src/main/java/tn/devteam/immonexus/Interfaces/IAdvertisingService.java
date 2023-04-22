package tn.devteam.immonexus.Interfaces;

import tn.devteam.immonexus.Entities.Advertising;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.util.List;

public interface IAdvertisingService {
    List<Advertising> getAllAdvertising(); // ok
    void deleteById(Long idAdvertising); // ok


    String nbrAdvertisingsBySponsor();

    Advertising addAdvertising(Advertising ad);

    double calculerGainPublicitaire(Advertising advertising);

    Long calculerNbreDesJours(Advertising advertising);

    void incrementerNombreDeVue(Long id, HttpServletRequest request);

    Advertising getAdvertisingById(Long idAd);

    Advertising updateAdvertising(Advertising add);


    void deleteAll();

  //  void affectAdvertisingToSponsor(Long idSponsor, Long idAd);

    List<Advertising> getAllActualAdvertising(LocalDate startDate, LocalDate endDate,HttpServletRequest request);
}

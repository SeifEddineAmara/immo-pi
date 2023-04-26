package tn.devteam.immonexus.Services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.devteam.immonexus.Entities.*;
import tn.devteam.immonexus.Interfaces.IAdvertisingService;
import tn.devteam.immonexus.Repository.AdevertisingRepository;
import tn.devteam.immonexus.Repository.SponsorsRepository;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
@Slf4j
public class AdvertisingService implements IAdvertisingService {
    @Autowired
    AdevertisingRepository adevertisingRepository;

    @Override
    public List<Advertising> getAllAdvertising() {
        List<Advertising> advertisings = adevertisingRepository.findAll();
        return advertisings;
    }

    @Override
    public Advertising addAdvertising(Advertising ad){
        return adevertisingRepository.save(ad) ;
    }

    @Override
    public Advertising getAdvertisingById(Long idAd)
    {
        return adevertisingRepository.findById(idAd).orElse(null);
    }

    @Override
    public Advertising updateAdvertising(Advertising add){
        return adevertisingRepository.save(add);
    }

    @Override
    public void deleteById(Long idAdvertising){
        adevertisingRepository.deleteById(idAdvertising);
    }


}

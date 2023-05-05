package tn.devteam.immonexus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.devteam.immonexus.Entities.Advertising;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface AdevertisingRepository extends JpaRepository<Advertising, Long> {
    List<Advertising> findByStartDateBetweenAndEndDateBetween(LocalDate startDate1, LocalDate endDate1, LocalDate startDate2, LocalDate endDate2);
    List<Advertising> findByStartDateBetween(Date start, Date end);
    List<Advertising> findByStartDateGreaterThanEqualAndEndDateLessThanEqual(Date startDate, Date endDate);


}

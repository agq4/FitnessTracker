package pl.wsb.fitnesstracker.event;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import jakarta.persistence.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDate;
public interface EventRepository extends JpaRepository<Event, Long>{
    @Query("SELECT e FROM Event e WHERE e.startDate > :now ORDER BY e.startDate")
    static List<Event> findUpcoming(@Param("now") LocalDate now) {
        return null;
    }
}

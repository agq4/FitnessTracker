package pl.wsb.fitnesstracker.event;

import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.type.descriptor.java.LocalDateTimeJavaType;
import pl.wsb.fitnesstracker.training.api.Training;
import java.time.LocalDate;

@Entity
@Table(name = "event")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)

// TODO: Define the Event entity with appropriate fields and annotations
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false)
    private String name;
    private LocalDate startDate;
    private String location;
    public Event (String name, LocalDate startDate, String location) {
        this.name = name;
        this.startDate = startDate;
        this.location = location;
    }
}

package pl.wsb.fitnesstracker.workoutsession;

import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.type.descriptor.java.LocalDateTimeJavaType;
import pl.wsb.fitnesstracker.training.api.Training;

@Entity
@Table(name = "workout_session")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString

// TODO: Define the Event entity with appropriate fields and annotations
public class WorkoutSession {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = training_id)
    private Training training;
    private LocalDateTimeJavaType timestamp;
    private double startLatitude;
    private double startLongitude;
    private double endLatitude;
    private double endLongitude;
    private double altitude;
    public WorkoutSession (Training training, LocalDateTimeJavaType timestamp, double startLatitude, double startLongitude, double endLatitude, double endLongitude, double altitude)
        this.training = training;
    this.timestamp = timestamp;
    this.startLatitude = startLatitude;
    this.startLongitude = startLongitude;
    this.endLatitude = endLatitude;
    this.endLongitude = endLongitude;
    this.altitude = altitude;
}
]

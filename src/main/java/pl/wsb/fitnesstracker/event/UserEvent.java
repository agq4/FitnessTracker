package pl.wsb.fitnesstracker.event;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.type.descriptor.java.LocalDateTimeJavaType;
import pl.wsb.fitnesstracker.user.api.User;
import java.time.LocalDate;

@Entity
@Table(name = "user_event")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn (name = "user_id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn (name= "event_id", nullable = false)
    private Event event;
            private LocalDate registrationDate;
    public UserEvent(User user, Event event, LocalDate registrationDate) {
        this.user = user;
        this.event = event;
        this.registrationDate = registrationDate;
    }
}

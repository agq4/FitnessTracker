package pl.wsb.fitnesstracker.training.api;

import lombok.Getter;
import pl.wsb.fitnesstracker.training.internal.ActivityType;
import pl.wsb.fitnesstracker.user.api.User;

import java.util.Date;

@Getter
public class Training {

    private Long id;

    private User user;

    private Date startTime;

    private Date endTime;

    private ActivityType activityType;

    private double distance;

    private double averageSpeed;

    public class Training {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user;
        @Column(nullable = false)
        private Date startTime;
        private Date endTime;
        @Column(nullable = false)
        private ActivityType activityType;
        private double distance;
        private double averageSpeed;

        public void setUser(User user) {
            this.user = user;
        }

        public Training(
                final User user,
                final Date startTime,
                final Date endTime,
                final ActivityType activityType,
                final double distance,
                final double averageSpeed) {
            this.user = user;
            this.startTime = startTime;
            this.endTime = endTime;
            this.activityType = activityType;
            this.distance = distance;
            this.averageSpeed = averageSpeed;
        }
    }
}
package pl.wsb.fitnesstracker.training.api;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "healthmetrics")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString

public class HealthMetrics {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Nullable
private Long id;

@Column(name = "date", nullable = false)
private Date date;

@Column(name = "weight", nullable = false)
private int weight;

@Column(name = "height", nullable = false)
private double height;

@Column(name = "HeartRate", nullable = false)
private double HeartRate;

    public HealthMetrics(Date date, int weight, double height, double heartRate) {
        this.date = date;
        this.weight = weight;
        this.height = height;
        this.HeartRate = heartRate;
    }

}


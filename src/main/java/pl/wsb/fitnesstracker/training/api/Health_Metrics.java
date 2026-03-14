package pl.wsb.fitnesstracker.training.api;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Date;

public class Health_Metrics {
}
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
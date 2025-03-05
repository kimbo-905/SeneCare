package com.example.projetmemoire.Model;
import jakarta.persistence.*;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "logEntries")
@NoArgsConstructor
public class LogEntries {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "actionType")
	private String actionType;

	@Column(name = "actionDescription")
	private String actionDescription;

	@Column(name = "timestamp", nullable = false, updatable = false)
	private LocalDateTime timestamp = LocalDateTime.now();

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private Utilisateur utilisateur;

	public LogEntries(String actionType, String actionDescription, LocalDateTime timestamp, Utilisateur utilisateur) {
		this.actionType = actionType;
		this.actionDescription = actionDescription;
		this.timestamp = timestamp;
		this.utilisateur = utilisateur;
	}

}

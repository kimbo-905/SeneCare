//package com.example.projetmemoire.Controllers;
//
//import com.example.projetmemoire.Model.LogEntries;
//import com.example.projetmemoire.Model.Utilisateur;
//import com.example.projetmemoire.Repository.LogEntriesRepository;
//import org.springframework.stereotype.Service;
//
//@Service
//public class LogService {
//
//	private final LogEntriesRepository logEntriesRepository;
//
//	public LogService(LogEntriesRepository logEntriesRepository) {
//		this.logEntriesRepository = logEntriesRepository;
//	}
//
//	public void createLog(Utilisateurs user, String actionType, String actionDescription) {
//		LogEntries log = new LogEntries();
//		log.setUser(user);
//		log.setActionType(actionType);
//		log.setActionDescription(actionDescription);
//		logEntriesRepository.save(log);
//	}
//}

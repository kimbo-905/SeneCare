package com.example.projetmemoire.Controllers;

import com.example.projetmemoire.Model.Utilisateur;

public class SessionManager {
	private static Utilisateur currentUser;

	public static void setCurrentUser(Utilisateur user) {
		currentUser = user;
	}

	public static Utilisateur getCurrentUser() {
		return currentUser;
	}
}

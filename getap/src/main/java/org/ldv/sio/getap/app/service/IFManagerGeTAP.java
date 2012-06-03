package org.ldv.sio.getap.app.service;

import java.util.List;

import org.ldv.sio.getap.app.AccPersonalise;
import org.ldv.sio.getap.app.Classe;
import org.ldv.sio.getap.app.DemandeConsoTempsAccPers;
import org.ldv.sio.getap.app.Discipline;
import org.ldv.sio.getap.app.Role;
import org.ldv.sio.getap.app.User;
import org.ldv.sio.getap.app.UserSearchCriteria;

/**
 * Contrat de services pour les cas d'utilisation
 * 
 * @author VINSII - projet GeTAP - SIO MELUN
 * 
 */
public interface IFManagerGeTAP {

	// CRUD DCTAP
	public List<DemandeConsoTempsAccPers> getAllDCTAPByEleve(User eleve);

	public List<DemandeConsoTempsAccPers> getAllDCTAPByProfInterv(User profi);

	public List<DemandeConsoTempsAccPers> getAllDCTAPByProfPrinc(User profp);

	public List<DemandeConsoTempsAccPers> getAllDCTAPByClasse(String classe);

	public int getAllDCTAPByEtat(int etat, Long id);

	public int getAllDCTAPModifByEtat(Long id);

	public DemandeConsoTempsAccPers getDCTAPById(Long id);

	public void addDCTAP(DemandeConsoTempsAccPers dctap);

	public void updateDCTAP(DemandeConsoTempsAccPers dctap);

	public void deleteDCTAP(DemandeConsoTempsAccPers dctap);

	public boolean deleteDCTAPById(Long id);

	// CRUD User
	public List<User> getAllProf();

	public List<User> getAllProfInter();

	public List<User> getAllProfPrinc();

	public List<User> getAllEleve();

	public List<User> getAllEleveByClasse();

	public List<User> getAllEleveByPP(User user);

	public User getUserById(Long id);

	public User addUser(User user);

	public void updatePass(User user);

	public void updateUser(User user);

	public void updateProfil(User user);

	public void deleteUser(User user);

	// CRUD de AP
	public List<AccPersonalise> getAllAPForEleve();

	public List<AccPersonalise> getAllAPForProf();

	public List<AccPersonalise> getAllAPForAdmin();

	public AccPersonalise getAPById(int id);

	public AccPersonalise getAPByNom(String nom);

	public void addAP(AccPersonalise ap);

	public void upDateAP(AccPersonalise ap);

	public void deleteAP(AccPersonalise ap);

	public List<AccPersonalise> getApByType();

	// CRUD Disciplines
	public List<Discipline> getAllDiscipline();

	public Discipline getDisciplineById(int id);

	public void addDiscipline(Discipline dis);

	public void upDateDiscipline(Discipline dis);

	public void deleteDiscipline(Discipline dis);

	// CRUD de classe
	public List<Classe> getAllClasse();

	public Classe getClasseById(int id);

	public void addClasse(Classe classe);

	public void upDateClasse(Classe classe);

	public void deleteClasse(Classe classe);

	public int countClasses();

	public List<Classe> getAllClasseByProf(Long id);

	// CRUD des roles
	public List<Role> getAllRole();

	// Opération sur annee scolaire (mise à jour lors d'une importation)
	public String getCurrentAnneeScolaire();

	public List<String> getAllAnneeScolaire();

	// Opération sur la personnalisation de l'accueil
	public void addAccueil(String img, String logo, String titre, String texte);

	public List<String> getInfoAccueil();

	// Opération Search User
	public List<User> searchEleve(UserSearchCriteria userSearchCriteria);

	public List<User> searchProf(UserSearchCriteria userSearchCriteria);

	public List<User> searchClasse(UserSearchCriteria userSearchCriteria);

	public List<DemandeConsoTempsAccPers> searchDctap(
			UserSearchCriteria userSearchCriteria);

	public List<DemandeConsoTempsAccPers> searchDctapClasse(
			UserSearchCriteria userSearchCriteria);

	public User getUser(Long id);

	/**
	 * 
	 * @param login
	 *            login to test
	 * @param pw
	 *            password to test
	 * @return User havin login and pw or null
	 */
	public User getUserByLogin(String login, String pw);

}

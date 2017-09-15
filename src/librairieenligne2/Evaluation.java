package librairieenligne2;

import java.net.InetAddress;
import java.sql.Date;
import java.sql.Statement;

public class Evaluation {
    private String idEvaluation;
    private Client newClient;
    private LigneCommande newLigneCommande;
    private Livre newLivre;
    private Statut newStatut;
    private Salarie newSalarie;
    private Date dateEvaluation;
    private Double noteEvaluation;
    private String commentaireEvaluation;
    private String moderationEvaluation;
    private InetAddress adresseIPEvaluation;

    public Evaluation(String idEvaluation, Client newClient, LigneCommande newLigneCommande, Livre newLivre,
                      Statut newStatut, Salarie newSalarie, Date dateEvaluation, Double noteEvaluation,
                      String commentaireEvaluation, String moderationEvaluation, InetAddress adresseIPEvaluation) {
        this.idEvaluation = idEvaluation;
        this.newClient = newClient;
        this.newLigneCommande = newLigneCommande;
        this.newLivre = newLivre;
        this.newStatut = newStatut;
        this.newSalarie = newSalarie;
        this.dateEvaluation = dateEvaluation;
        this.noteEvaluation = noteEvaluation;
        this.commentaireEvaluation = commentaireEvaluation;
        this.moderationEvaluation = moderationEvaluation;
        this.adresseIPEvaluation = adresseIPEvaluation;
    }

    public Evaluation() {
    }

    public String getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(String idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public Client getNewClient() {
        return newClient;
    }

    public void setNewClient(Client newClient) {
        this.newClient = newClient;
    }

    public LigneCommande getNewLigneCommande() {
        return newLigneCommande;
    }

    public void setNewLigneCommande(LigneCommande newLigneCommande) {
        this.newLigneCommande = newLigneCommande;
    }

    public Livre getNewLivre() {
        return newLivre;
    }

    public void setNewLivre(Livre newLivre) {
        this.newLivre = newLivre;
    }

    public Statut getNewStatut() {
        return newStatut;
    }

    public void setNewStatut(Statut newStatut) {
        this.newStatut = newStatut;
    }

    public Salarie getNewSalarie() {
        return newSalarie;
    }

    public void setNewSalarie(Salarie newSalarie) {
        this.newSalarie = newSalarie;
    }

    public Date getDateEvaluation() {
        return dateEvaluation;
    }

    public void setDateEvaluation(Date dateEvaluation) {
        this.dateEvaluation = dateEvaluation;
    }

    public Double getNoteEvaluation() {
        return noteEvaluation;
    }

    public void setNoteEvaluation(Double noteEvaluation) {
        this.noteEvaluation = noteEvaluation;
    }

    public String getCommentaireEvaluation() {
        return commentaireEvaluation;
    }

    public void setCommentaireEvaluation(String commentaireEvaluation) {
        this.commentaireEvaluation = commentaireEvaluation;
    }

    public String getModerationEvaluation() {
        return moderationEvaluation;
    }

    public void setModerationEvaluation(String moderationEvaluation) {
        this.moderationEvaluation = moderationEvaluation;
    }

    public InetAddress getAdresseIPEvaluation() {
        return adresseIPEvaluation;
    }

    public void setAdresseIPEvaluation(InetAddress adresseIPEvaluation) {
        this.adresseIPEvaluation = adresseIPEvaluation;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "idEvaluation='" + idEvaluation + '\'' +
                ", newClient=" + newClient +
                ", newLigneCommande=" + newLigneCommande +
                ", newLivre=" + newLivre +
                ", newStatut=" + newStatut +
                ", newSalarie=" + newSalarie +
                ", dateEvaluation=" + dateEvaluation +
                ", noteEvaluation=" + noteEvaluation +
                ", commentaireEvaluation='" + commentaireEvaluation + '\'' +
                ", moderationEvaluation='" + moderationEvaluation + '\'' +
                ", adresseIPEvaluation=" + adresseIPEvaluation +
                '}';
    }
}

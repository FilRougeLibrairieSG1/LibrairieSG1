package librairieenligne2;


abstract class Utilisateur {
    private String nomUtilisateur;
    private String prenomUtilisateur;
    private String emailUtilisateur;
    private String loginUtilisateur;
    private String motDePasse;
    private String telephoneUtilisateur;

    public Utilisateur() {
    }

    public Utilisateur(String nomUtilisateur, String prenomUtilisateur, String emailUtilisateur, String loginUtilisateur, String motDePasse, String telephoneUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur;
        this.emailUtilisateur = emailUtilisateur;
        this.loginUtilisateur = loginUtilisateur;
        this.motDePasse = motDePasse;
        this.telephoneUtilisateur = telephoneUtilisateur;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getPrenomUtilisateur() {
        return prenomUtilisateur;
    }

    public void setPrenomUtilisateur(String prenomUtilisateur) {
        this.prenomUtilisateur = prenomUtilisateur;
    }

    public String getEmailUtilisteur() {
        return emailUtilisateur;
    }

    public void setEmailUtilisteur(String emailUtilisteur) {
        this.emailUtilisateur = emailUtilisteur;
    }

    public String getLoginUtilisateur() {
        return loginUtilisateur;
    }

    public void setLoginUtilisateur(String loginUtilisateur) {
        this.loginUtilisateur = loginUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getTelephoneUtilisateur() {
        return telephoneUtilisateur;
    }

    public void setTelephoneUtilisateur(String telephoneUtilisateur) {
        this.telephoneUtilisateur = telephoneUtilisateur;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "nomUtilisateur='" + nomUtilisateur + '\'' +
                ", prenomUtilisateur='" + prenomUtilisateur + '\'' +
                ", emailUtilisateur='" + emailUtilisateur + '\'' +
                ", loginUtilisateur='" + loginUtilisateur + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", telephoneUtilisateur='" + telephoneUtilisateur + '\'' +
                '}';
    }
}

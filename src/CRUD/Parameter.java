
package CRUD;

public abstract class Parameter {
  
    private String url = "jdbc:sqlserver://localhost;database=LibrairieEnLigne";
    private String user = "sa";
    private String mdp = "sa";
    private String req = "";

    public Parameter() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("1) erreur de chargement du pilote");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getReq() {
        return req;
    }

    public void setReq(String req) {
        this.req = req;
    }
        
    

    
}

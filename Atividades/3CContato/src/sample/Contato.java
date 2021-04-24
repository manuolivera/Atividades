package sample;

public class Contato {
    //Atributos
    private String whatsapp;
    private String email;
    private String twitter;

    //getting and setter

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

//too string
    public String toString(){
        return "Whatsapp: " + whatsapp
                + " E-mail: " + email
                + " Twitter: " + twitter;
    }
}







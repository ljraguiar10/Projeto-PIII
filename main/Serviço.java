package main;

public abstract class Serviço {

    private String vermifugação;
    private String vacinação;
    private String tosa;

    public Serviço (String vermifugacão, String vacinação, String tosa) {
        this.vermifugação = vermifugacão;
        this.vacinação = vacinação;
        this.tosa = tosa;
    }
    
    public String getTosa(){
        return this.tosa;
    }
    public void setTosa (String tosa) {
        this.tosa = tosa;
    }
    public String getVermifugação(){
        return this.vermifugação;
    }
    public void setVermifugação (String vermifugação) {
        this.vermifugação = vermifugação;
    }
    public String getVacinação(){
        return this.vacinação;
    }
    public void setVacinação (String vacinação) {
        this.vacinação = vacinação;
    }

    @Override
    public String toString (){
        return "vermifugaçao : " + this.vermifugação + " vacinação : " + this.vacinação + " tosa : " + this.tosa ;
    }
}

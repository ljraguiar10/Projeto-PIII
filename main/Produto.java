package main;

public class Produto {

    private String shampoo;
    private String brinquedo;
    private String ração;

    public Produto (String shampoo, String brinquedo, String ração) {
        
        this.shampoo = shampoo;
        this.brinquedo = brinquedo;
        this. ração = ração;
    }
    public String getShampoo(){
        return this.shampoo;
    }
    public void setShampoo (String shampoo) {
        this.shampoo = shampoo;
    }
    public String getBrinquedo(){
        return this.brinquedo;
    }
    public void setBrinquedo (String brinquedo) {
        this.brinquedo = brinquedo;
    }
    public String getRação(){
        return this.ração;
    }
    public void setRação (String ração) {
        this.ração = ração;
    }
}

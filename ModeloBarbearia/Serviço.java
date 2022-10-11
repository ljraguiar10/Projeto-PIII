package ModeloBarbearia;

public class Serviço {
 
   private int id; 
   private String descrição;
   private float valor;

   public Serviço(int id, String descrição, float valor) {
   this.id = id;
   this.descrição = descrição;
   this.valor = valor;
  }

   public String getDescrição() {
  return descrição;
   }

   public void setDescrição(String descrição) {
  this.descrição = descrição;
   }

   public float getValor() {
  return valor;
   }

   public void setValor(float valor) {
  this.valor = valor;
   }

}
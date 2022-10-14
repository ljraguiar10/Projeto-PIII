package ModeloBarbearia;

public abstract class Pessoa {

private int id;
private String nome;
private char sexo;
private Date dataNascimento;
private String telefone;
private String email;
private String rg;

public Pessoa (int id, String nome) {
    this.id = id;
    this.nome = nome;
   }

public Pessoa (int id, String nome, char sexo, Date dataNascimento, String telefone, String email, String rg) {
    this.id = id;
    this.nome = nome;
    this.sexo = sexo;
    this.dataNascimento = dataNascimento;
    this.telefone = telefone;
    this.email = email;
    this.rg = rg;
   }

public int getId() {
    return id;
   }
  
public void setId(int id) {
    this.id = id;
   }
public String getNome() {
    return nome;
   }
  
public void setNome(String nome) {
    this.nome = nome;
   }
public char getSexo() {
    return sexo;
   }
  
public void setSexo(char sexo) {
    this.sexo = sexo;
   }
public Date getDataNascimento() {
    return dataNascimento;
   }
public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
   }
   public String getTelefone() {
    return telefone;
   }
  
   public void setTelefone(String telefone) {
    this.telefone = telefone;
   }
   public String getEmail() {
    return email;
   }
  
   public void setEmail(String email) {
    this.email = email;
   }
   public String getRg() {
    return rg;
   }
  
   public void setRg(String rg) {
    this.rg = rg;
   }

}
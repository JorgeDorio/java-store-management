package q1;

public class ClientePessoaFisica extends Cliente{
  private String cpf;
  
  public float returnOff (float value) {
    float off = 0;
    if(value > 150) {
       off = (float)(value*0.88);      
    } else {
      off = (float)(value*0.92); 
    }
    return off;
  }
  
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}

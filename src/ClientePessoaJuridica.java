package q1;

public class ClientePessoaJuridica extends Cliente{
  private String cnpj;
  
  public float returnOff (float value) {
    float off = 0;
    if(value > 200) {
       off = (float)(value*0.88);      
    } else {
      off = (float)(value*0.93); 
    }
    return off;
  }

  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }
}

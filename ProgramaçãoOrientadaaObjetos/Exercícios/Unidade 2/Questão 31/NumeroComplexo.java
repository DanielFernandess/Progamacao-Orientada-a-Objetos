public class NumeroComplexo {
  //private: Apenas a própria classe que implementa o método tem acesso a este método.
  private float valorReal;
  private float valorImaginario;
     
  //set: usado para validar tentativas de modificações nos dados private;
  //get: usado para controlar como os dados são apresentados para o chamador;

  public NumeroComplexo(float valorReal, float valorImaginario){
    this.setValorReal(valorReal);
    this.setImaginario(valorImaginario);
  }
    
  public NumeroComplexo(float valorReal){
    this.setValorReal(valorReal);
    this.setImaginario(0); //questao pediu
  }
  
  public NumeroComplexo(){
    this.setValorReal(0);
    this.setImaginario(0);
  }
  
  public void setValorReal(float valorReal){
    this.valorReal = valorReal;
  }
  
  public void setImaginario(float valorImaginario){
    this.valorImaginario = valorImaginario;
  }
  
  public float getValorReal(){ //n vai restringir
    return this.valorReal;
  }
  
  public float getImaginario(){ //vai apresentar
    return this.valorImaginario;
  }
  
  public String toString(){ //retornar representacao textual de dados
    return "O valor real é " +(this.valorReal)+(" e o Valor imaginário é "+(this.valorImaginario));
    }
  }
public abstract class figuraGeometrica {
    protected circulo circulo;
    protected quadrado quadrado;
    protected triangulo triangulo;
  
    public circulo getCirculo() {
      return this.circulo;
    }
  
    public void setCirculo(circulo circulo) {
      this.circulo = circulo;
    }
  
    public quadrado getQuadrado() {
      return this.quadrado;
    }
  
    public void setQuadrado(quadrado quadrado) {
      this.quadrado = quadrado;
    }
  
    public triangulo getTriangulo() {
      return this.triangulo;
    }
  
    public void setTriangulo(triangulo triangulo) {
      this.triangulo = triangulo;
    }
  
    abstract public void desenha();
  }
public class desenho {
  private figuraGeometrica figuraA;
  private figuraGeometrica figuraB;
  private double coordenadaX, coordenadaY;

  desenho(figuraGeometrica figuraA, figuraGeometrica figuraB, double coordenadaX, double coordenadaY){
    this.figuraA = figuraA;
    this.figuraB = figuraB;
    this.coordenadaX = coordenadaX;
    this.coordenadaY = coordenadaY;
  }

  public void apresenta(){
    this.figuraA.desenha();//da classe figuraGeometrica.
    this.figuraB.desenha();
    System.out.println("Coordenada x: "+this.coordenadaX+" y: "+this.coordenadaY);
  }
  
}
public class testeLivraria {
    public static void main(String[] args) {

      //delegação biblioteca.
      livroBiblioteca livroBiblioteca = new livroBiblioteca(new livro("Vida saudavel", "Alef fernandes", personalizarData.dataFormat(2022, 05, 24), "Como tem uma vida saldavel"));
  
      livroBiblioteca.setEmprestado(true);
      livroBiblioteca.setLeitor(" Roberto Carlos");
  
      System.out.println(livroBiblioteca);
      
      //delegação livraria.
      livroLivraria livroLivraria = new livroLivraria(new livro("Vida saldavel", "Alef fernandes", personalizarData.dataFormat(2022, 05, 24), "Como tem uma vida saldavel"), 100, 100.50f);
  
      System.out.println(livroLivraria);
    }
  }
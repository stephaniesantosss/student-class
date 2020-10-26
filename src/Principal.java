import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		
		
		
		Scanner s =  new Scanner (System.in);
		
		
		
		
		Aluno aluno1 = new Aluno(4.0,4.0, 0, 0);
		

  
  System.out.println("digite seu nome");
  
  aluno1.setNome(s.next());
  
  System.out.println("digite sua matricula");
  
  aluno1.setMatricula(s.nextInt());
  
  aluno1.setN1(aluno1.getN1());
  aluno1.setN2(aluno1.getN2());
  aluno1.setN3(aluno1.getN3());
  aluno1.setN4(aluno1.getN4());
  
  
  aluno1.metodo();
  
  
  
  
  
		
		
		
	}

}


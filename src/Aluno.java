import java.util.Scanner;

public class Aluno {private int matricula;
private String nome;

private double n1;
private double n2;
private double n3;
private double n4;

Scanner s = new Scanner(System.in);

public Aluno(double nn1, double nn2, double n1, double n2) {

	this.n1 = n1;
	this.n2 = n2;

}

public void metodo() {
	
System.out.println("Digite sua nota Nº1");	
n1 = s.nextDouble();
System.out.println("Digite sua nota Nº2");	
n2 = s.nextDouble();
System.out.println("Digite sua nota Nº3");	
n3 = s.nextDouble();
System.out.println("Digite sua nota Nº4");	
n4 = s.nextDouble();




	
double calculo =	(n1 + n2+ n3 + n4)  / 4 ;

 System.out.println(nome +" " +" A media da sua nota é  "+ calculo);


	
}

public int getMatricula() {
	return matricula;
}

public void setMatricula(int matricula) {
	this.matricula = matricula;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getN1() {
	return n1;
}

public void setN1(double n1) {
	this.n1 = n1;
}

public double getN2() {
	return n2;
}

public void setN2(double n2) {
	this.n2 = n2;
}

public double getN3() {
	return n3;
}

public void setN3(double n3) {
	this.n3 = n3;
}

public double getN4() {
	return n4;
}

public void setN4(double n4) {
	this.n4 = n4;
}

}

import java.util.Scanner;
class Variaveis2{
public static void main(String args[]){
Scanner teclado = new Scanner(System.in);

// para armazenar um nome
//String nome = "Monica";
System.out.println ("Digite seu nome: ");
String nome = teclado.next();
System.out.println ("Digite seu sobrenome: ");
String sobrenome = teclado.next();
// para armazenar o peso de uma pessoa
System.out.println ("Informe seu peso: ");
float peso = teclado.nextFloat();
// para armazenar a altura de uma pessoa
System.out.println ("Informe sua altura: ");
float altura = teclado.nextFloat();
// idade
System.out.println ("Digite sua idade: ");
int idade = teclado.nextInt();

// variável para armazenar o resultado do IMC
float imc = peso / (altura * altura);


System.out.println("Nome...: " + nome + " " + sobrenome);
System.out.println("Peso...: " + peso);
System.out.println("Altura.: " + altura);
System.out.println("Idade..: " + idade);
System.out.println("Seu IMC: " + imc);
}
}
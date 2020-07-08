import java.util.Scanner;

class DesafioDecisaoComposta{
public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Digite o seu nome");
String nome = teclado.next().toUpperCase() + teclado.nextLine().toUpperCase();
System.out.println("Digite a primeira nota");
float nota1= teclado.nextFloat();
System.out.println("Digite a segunda nota");
float nota2= teclado.nextFloat();
float media = (nota1 + nota2) / 2;
if (media >= 5) {
System.out.println("Media: " + media + " - " + nome.toUpperCase() + " foi aprovado(a)!");
} else
if ((media >=3) && (media <5)) {
System.out.println("Media: " + media + " - " + nome.toUpperCase() + " está de exame!");
} else
if (media<3) {
System.out.println("Media: " + media + " - " + nome.toUpperCase() + " foi reprovado(a)!");
}
}
}
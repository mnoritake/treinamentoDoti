import java.util.Scanner;

class DesafioDecisaoComposta2{
public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Digite o seu nome");
String nome = teclado.next().toUpperCase() + teclado.nextLine().toUpperCase();
System.out.println("Digite a primeira nota");
float nota1= teclado.nextFloat();
System.out.println("Digite a segunda nota");
float nota2= teclado.nextFloat();
//capture a qtde de faltas > 20 - reprovado independente da nota
System.out.println("Digite a quantidade de faltas");
float faltas= teclado.nextFloat();



float media = (nota1 + nota2) / 2;

if (faltas > 20 || media < 3) {
System.out.println("Media: " + media + " - " + nome.toUpperCase() + " foi reprovado(a)!");
} else
if (media >= 5) {
System.out.println("Media: " + media + " - " + nome.toUpperCase() + " foi aprovado(a)!");
} else
//if ((media >=3) && (media <5)) {
{
System.out.println("Media: " + media + " - " + nome.toUpperCase() + " está de exame!");
} 
}
}
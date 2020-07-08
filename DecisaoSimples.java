import java.util.Scanner;

class DecisaoSimples{
public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Digite o nome");
String nome = teclado.next().toUpperCase() + teclado.nextLine().toUpperCase();

System.out.println("Digite a idade");
int idade = teclado.nextInt();
//Votação
//<16 - proibido votar
// 16, 17 ou mais de 65 - facultativo
// maior ou igual a 18 e menor que 65, obrigatório
// && and
// ||

if (idade<16) {
System.out.println(nome + " nao pode votar - proibido");
}
if ((idade==16) || (idade==17) || (idade>65)) {
System.out.println(nome + " eh facultativo");
}
if ((idade>=18) && (idade<=65)) {
System.out.println(nome + " eh obrigatorio");
}
System.out.println("Até logo...");
}
}

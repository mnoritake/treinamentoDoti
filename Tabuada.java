import java.util.Scanner;
class Tabuada {

public static void main (String args[]){
Scanner teclado = new Scanner(System.in);
//Sintaxe do For, formado por três parâmetros separados por ';'
// 1. variável que irá contar
// 2. condição - enquanto o for vai funcionar?
// 3. incremento (evolução), como ele vai contar?
System.out.println("Escolha um número");
int numero = teclado.nextInt();
for (int contador=1;contador<11;contador++){
System.out.println(numero + " x " + contador + " = " + contador * numero);
}

}}


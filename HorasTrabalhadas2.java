import java.util.Scanner;

class HorasTrabalhadas2{
public static void main(String args[]){

Scanner teclado = new Scanner(System.in);
//receba o nome do colaborador
System.out.println ("Digite o nome do colaborador:");
String nome = teclado.next();
//qtde de horas trabalhadas no mês
System.out.println ("Digite a qtd de horas trabalhadas:");
int horasMes = teclado.nextInt();
//160 hrs - mensal
int horasMensalBase = 160;
//valor por hora
System.out.println ("Digite o valor da hora:");
int valorPorHora = teclado.nextInt();
//Exiba: qtde de horas extras
int horasExtras = horasMes - horasMensalBase;
// valor de cada hora extra
float valorHoraExtra = valorPorHora * 1.5f;
// valor total de horas extras
float valorTotalHorasExtras = valorHoraExtra * horasExtras;

System.out.println("Nome do Colaborador....: " + nome);
System.out.println("Quant Hrs Extras.......: " + horasExtras);
System.out.println("Valor Hrs Extras.......: R$" + valorHoraExtra);
System.out.println("Valor Tot Hrs Extras...: R$" + valorTotalHorasExtras);




}
}
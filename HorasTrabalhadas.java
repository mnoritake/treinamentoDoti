class HorasTrabalhadas{
public static void main(String args[]){

//receba o nome do colaborador
String nome = "Monica";
//qtde de horas trabalhadas no mês
int horasMes = 177;
//160 hrs - mensal
int horasMensalBase = 160;
//valor por hora
int valorPorHora = 10;
//Exiba: qtde de horas extras
int horasExtras = horasMes - horasMensalBase;
// valor de cada hora extra
float valorHoraExtra = valorPorHora * 1.6f;
// valor total de horas extras
float valorTotalHorasExtras = valorHoraExtra * horasExtras;

System.out.println("Quant Hrs Extras.......: " + horasExtras);
System.out.println("Valor Hrs Extras.......: R$" + valorHoraExtra);
System.out.println("Valor Tot Hrs Extras...: R$" + valorTotalHorasExtras);




}
}
import javax.swing.JOptionPane;

class Ex01{
public static void main(String args[]){

String nomeDoHospede=JOptionPane.showInputDialog("Informe o nome do hospede:");
float diarias=Float.parseFloat(JOptionPane.showInputDialog("Quantas diárias"));
float taxa = 0;
if (diarias > 15) {taxa = 5.5f;} else
if (diarias < 15) {taxa = 8f;} else
{taxa = 6;}

float valorHospedagem = (diarias * 80f) + (diarias * taxa);


System.out.println("Nome do Hospede: " + nomeDoHospede.toUpperCase());
System.out.println("Diarias: " + diarias + " Taxa de Servico: R$" + taxa);
System.out.println("Valor da Hospedagem: R$" + valorHospedagem);



}
}

//. Um hotel cobra R$ 80,00 a diária e mais uma taxa de serviços. A taxa de serviços é de: 
//•	R$ 5,50 por diária, se o número de diárias for maior que 15; 
//•	R$ 6,00 por diária, se o número de diárias for igual a 15; 
//•	R$ 8,00 por diária, se o número de diárias for menor que 15.
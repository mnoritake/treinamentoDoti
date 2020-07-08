import javax.swing.JOptionPane;

class Ex08{
public static void main(String args[]){
int total = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor desejado"));
int nota100 = total / 100;
int resto100 = total % 100;
int nota50 = resto100 / 50;
int resto50 = resto100 % 50;
int nota20 = resto50 / 20;
int resto20 = resto50 % 20;
int nota10 = resto20 / 10;
int resto10 = resto20 % 10;
int nota5 = resto10 / 5;
int resto5 = resto10 % 5;
int nota2 = resto5 / 2;
int resto2 = resto5 % 2;
int nota1 = resto2 / 1;
int resto1 = resto2 % 1;


if (nota100 > 0) {System.out.println("Notas de 100  :" + nota100);}
if (nota50 > 0) {System.out.println("Notas de 50   :" + nota50);}
if (nota20 > 0) {System.out.println("Notas de 20   :" + nota20);}
if (nota10 > 0) {System.out.println("Notas de 10   :" + nota10);}
if (nota5 > 0) {System.out.println("Notas de 5    :" + nota5);}
if (nota2 > 0) {System.out.println("Notas de 2    :" + nota2);}
if (nota1 > 0) {System.out.println("Notas de 1    :" + nota1);}

}
}
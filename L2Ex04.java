import javax.swing.JOptionPane;

class Ex04{
public static void main(String args[]){


//Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os em ordem decrescente. 
//Utilize seleção encadeada.


int valor1=Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));
int valor2=Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));
int valor3=Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro valor"));
if (valor1 ==valor2 || valor1 ==valor3 || valor2==valor3) 
{System.out.println("Valores inválidos");

} else

if (valor1 > valor2) 
{
	if (valor2 > valor3) {System.out.println(valor1 + " " + valor2 + " " + valor3);}
	else 
		if (valor1 > valor3) {System.out.println(valor1 + " " + valor3 + " " + valor2);}
		else {System.out.println(valor3 + " " + valor1 + " " + valor2);}
}
else
	if (valor2 > valor3) {
		if (valor1 > valor3) {System.out.println(valor2 + " " + valor1 + " " + valor3);}
		else {System.out.println(valor2 + " " + valor3 + " " + valor1);}}
	else 	{System.out.println(valor3 + " " + valor2 + " " + valor1);}
		
}
}

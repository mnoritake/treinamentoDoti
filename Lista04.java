import javax.swing.JOptionPane;
class Lista04 {
public static void main (String args[]){

String nome= "";
int idade=0;
String nomeMaisVelho = "";
String nomeMaisNovo = "";
int idadeMaisVelho = 0;
int idadeMaisNovo = 9999;
int maiorDeIdade = 0;
int mediaIdade = 0;
int contador = 0;
char resposta = 0;

do{
nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
idade =Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
contador++;
mediaIdade =+ idade;
if (idade >=18){maiorDeIdade++;}

if (contador==1){
	nomeMaisVelho = nome;
	idadeMaisVelho = idade;
	nomeMaisNovo = nome;
	idadeMaisNovo = idade;} else {
if (idade > idadeMaisVelho) {
	nomeMaisVelho = nome;
	idadeMaisVelho = idade;
}
if (idade < idadeMaisNovo) {
	nomeMaisNovo = nome;
	idadeMaisNovo = idade;
}}
resposta=JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase().charAt(0);
}while(resposta=='S');


JOptionPane.showMessageDialog(null,"Mais novo = " + nomeMaisNovo + " " + idadeMaisNovo);
JOptionPane.showMessageDialog(null,"Mais velho = " + nomeMaisVelho + " " + idadeMaisVelho);
JOptionPane.showMessageDialog(null,"+18 = " + maiorDeIdade);
JOptionPane.showMessageDialog(null,"Media = " + (mediaIdade/contador));

}

}
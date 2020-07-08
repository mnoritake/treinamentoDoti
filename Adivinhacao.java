import javax.swing.JOptionPane;
class Adivinhacao {
public static void main (String args[]){

//Você digita um número
// e outra pessoa digita outra número, enquanto ela não acertar
// a aplicação fica pedindo outro número


int segredo = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
int chute = 0;
int tentativas = 0;


do{
	chute = Integer.parseInt(JOptionPane.showInputDialog("Tente acertar"));
	if (chute<segredo)
		{JOptionPane.showMessageDialog(null, chute + " eh pouco. Tente numero >");} 
	else if (chute != segredo) 
		{JOptionPane.showMessageDialog(null, chute + " eh muito. Tente numero <");}
tentativas = tentativas + 1;
}while (chute!=segredo);
JOptionPane.showMessageDialog(null, "Parabens voce acertou com " + tentativas + " tentativas");





}

}
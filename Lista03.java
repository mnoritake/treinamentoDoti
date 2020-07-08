import javax.swing.JOptionPane;
class Lista03 {
public static void main (String args[]){

String nivel = "";
int sup = 0;
int pos = 0;
int medio = 0;

do{
	nivel = JOptionPane.showInputDialog("Informe nível de escolaridade (1-Medio / 2-Superior / 3-Pós").toUpperCase();
if (nivel.equals("1")) {medio++;} 
else if (nivel.equals("2")) {sup++;} 
else if (nivel.equals("3")) {pos++;}
else  {JOptionPane.showMessageDialog(null,"Opção Inválida");}

}while(JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);

if ((medio > sup) && (medio > pos)) {
JOptionPane.showMessageDialog(null,"medio = " + medio);}

if ((sup > pos) && (sup > medio)) {
JOptionPane.showMessageDialog(null,"sup = " + sup);}

if ((pos > sup) && (pos > medio)) {
JOptionPane.showMessageDialog(null,"pos = " + pos);}



}

}
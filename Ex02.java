import javax.swing.JOptionPane;

class Ex01{
public static void main(String args[]){
int base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base"));
int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura"));
int areaRetangulo = base * altura;
System.out.println("area do retangulo:" + areaRetangulo);

int raio = Integer.parseInt(JOptionPane.showInputDialog("Informe o raio"));
float areaCirculo = 3.14159265f * (raio ^2);
System.out.println("area do circulo:" + areaCirculo);

}
}
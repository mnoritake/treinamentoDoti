import javax.swing.JOptionPane;
class ManipulaString{
public static void main(String args[]){

String email=JOptionPane.showInputDialog("Digite o e-mail");
System.out.println("Minúsculo: " + email.toLowerCase());
System.out.println("Maiúsculo: " + email.toUpperCase());
System.out.println("Qtd Caract: " + email.length());
System.out.println("Posição @: " + email.indexOf("@"));


//mnoritake@gmail.com
//0123456789
//mnoritake
//-1

System.out.println("3 primeiros caracteres: " + email.substring(0,3));
System.out.println("do 3º em diante: " + email.substring(3));
System.out.println("do 3º em diante: " + email.substring(3, email.length()));
System.out.println("so ate o @: " + email.substring(0, email.indexOf("@")));
System.out.println("servidor: " + email.substring(email.indexOf("@")+1 , email.indexOf(".com")));
System.out.println("é igual a teste@teste? " + email.equals("teste@teste.com"));
}
}
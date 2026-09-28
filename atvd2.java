import javax.swing.JOptionPane;
public class atvd2 {
public static void main(String []args) {
	String nomes[]=new String[5];
	JOptionPane.showMessageDialog(null, "Escolha somente 5 nomes\n       para testar o array");
	
	for (int i=0;  i<5; i++) {
		
		nomes[i]=JOptionPane.showInputDialog("Digite os seus nomes:");
		
	}
	JOptionPane.showMessageDialog(null, "Aqui estão os nomes:\n" + nomes[0]+ " \n "+ nomes[1] +" \n "+nomes[2]+" \n "+nomes[3]+" \n "+ nomes[4] );

	
}
}

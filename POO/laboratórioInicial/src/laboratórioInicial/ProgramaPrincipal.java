package laboratórioInicial;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		/*Criando 4 objetos da classe Aluno*/
		
		Aluno aluno1 = new Aluno("João", 111, 8.0, 6.0, 5.0);
		Aluno aluno2 = new Aluno("Paula", 222, 4.0, 6.0, 3.0);
		Aluno aluno3 = new Aluno("Ana", 333, 3.0, 4.0, 2.0);
		Aluno aluno4 = new Aluno("Renata", 444, 7.0, 8.0, 9.0);
		
		DecimalFormat df = new DecimalFormat("#.00");
		
	
		if(aluno1.calculaMedia()>=7.0) {
			JOptionPane.showMessageDialog(null, "Média Aluno " + aluno1 + " = " + df.format(aluno1.calculaMedia()) + " aprovado!");
		}else {
			JOptionPane.showMessageDialog(null, "Média Aluno " + aluno1 + " = " + df.format(aluno1.calculaMedia()) + " reprovado!");
		}
		
		if(aluno2.calculaMedia()>=7.0) {
			JOptionPane.showMessageDialog(null, "Média Aluno " + aluno2 + " = " + df.format(aluno2.calculaMedia()) + " aprovado!");
		}else {
			JOptionPane.showMessageDialog(null, "Média Aluno " + aluno2 + " = " + df.format(aluno2.calculaMedia()) + " reprovado!");
		}

		if(aluno3.calculaMedia()>=7.0) {
			JOptionPane.showMessageDialog(null, "Média Aluno " + aluno3 + " = " + df.format(aluno3.calculaMedia()) + " aprovado!");
		}else {
			JOptionPane.showMessageDialog(null, "Média Aluno " + aluno3 + " = " + df.format(aluno3.calculaMedia()) + " reprovado!");
		}
		
		if(aluno4.calculaMedia()>=7.0) {
			JOptionPane.showMessageDialog(null, "Média Aluno " + aluno4 + " = " + df.format(aluno4.calculaMedia()) + " aprovado!");
		}else {
			JOptionPane.showMessageDialog(null, "Média Aluno " + aluno4 + " = " + df.format(aluno4.calculaMedia()) + " reprovado!");
		}
		
		
		JOptionPane.showMessageDialog(null, "Média Geral = " + df.format((aluno1.calculaMedia() + aluno2.calculaMedia() + aluno3.calculaMedia() + aluno4.calculaMedia())/4));
		
		
	}

}

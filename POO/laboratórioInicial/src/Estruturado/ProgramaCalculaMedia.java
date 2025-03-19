package Estruturado;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ProgramaCalculaMedia {

	public static void main (String[] args) {
		String nomeAluno1 = "Paulo";
		int matAluno1= 111;
		double nota1Aluno1 = 3.0;
		double nota2Aluno1 = 6.0;
		double nota3Aluno1 = 3.0;
		
		String nomeAluno2 = "Maria";
		int matAluno2= 222;
		double nota1Aluno2 = 9.0;
		double nota2Aluno2 = 6.0;
		double nota3Aluno2 = 3.0;
		
		String nomeAluno3 = "Carolina";
		int matAluno3= 333;
		double nota1Aluno3 = 8.0;
		double nota2Aluno3 = 6.0;
		double nota3Aluno3 = 7.0;
		
		String nomeAluno4 = "José";
		int matAluno4= 444;
		double nota1Aluno4 = 6.0;
		double nota2Aluno4 = 4.0;
		double nota3Aluno4 = 9.0;
		
		double mediaAluno1 = (nota1Aluno1 + nota2Aluno1+ nota3Aluno1)/3;
		double mediaAluno2 = (nota1Aluno2 + nota2Aluno2+ nota3Aluno2)/3;
		double mediaAluno3 = (nota1Aluno3 + nota2Aluno3+ nota3Aluno3)/3;
		double mediaAluno4 = (nota1Aluno4 + nota2Aluno4+ nota3Aluno4)/3;
	
		double mediaGeral = (mediaAluno1+mediaAluno2+mediaAluno3+mediaAluno4)/4;
		
		DecimalFormat df = new DecimalFormat("#.00");

		if(mediaAluno1>=7.0) {
			JOptionPane.showMessageDialog(null, "Média Aluno " + nomeAluno1 + "(Matrícula-" + matAluno1 + ") = " + df.format(mediaAluno1) + " aprovado!");
		}else {
			JOptionPane.showMessageDialog(null, "Média Aluno " + nomeAluno1 + "(Matrícula-" + matAluno1 + ") = " + df.format(mediaAluno1) + " reprovado!");
		}
		
		if(mediaAluno2>=7.0) {
			JOptionPane.showMessageDialog(null, "Média Aluno " + nomeAluno2 + "(Matrícula-" + matAluno2 + ") = " + df.format(mediaAluno2) + " aprovado!");
		}else {
			JOptionPane.showMessageDialog(null, "Média Aluno " + nomeAluno2 + "(Matrícula-" + matAluno2 + ") = " + df.format(mediaAluno2) + " reprovado!");
		}

		if(mediaAluno3>=7.0) {
			JOptionPane.showMessageDialog(null, "Média Aluno " + nomeAluno3 + "(Matrícula-" + matAluno3 + ") = " + df.format(mediaAluno3) + " aprovado!");
		}else {
			JOptionPane.showMessageDialog(null, "Média Aluno " + nomeAluno3 + "(Matrícula-" + matAluno3 + ") = " + df.format(mediaAluno3) + " reprovado!");
		}
		
		if(mediaAluno4>=7.0) {
			JOptionPane.showMessageDialog(null, "Média Aluno " + nomeAluno4 + "(Matrícula-" + matAluno4 +") = " + df.format(mediaAluno4) + " aprovado!");
		}else {
			JOptionPane.showMessageDialog(null, "Média Aluno " + nomeAluno4 + "(Matrícula-" + matAluno4 + ") = " + df.format(mediaAluno4) + " reprovado!");
		}
		
		JOptionPane.showMessageDialog(null,"Média Geral = " + df.format( mediaGeral));
		
	}
	
	
}

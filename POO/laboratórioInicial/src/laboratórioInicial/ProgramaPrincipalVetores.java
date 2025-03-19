package laboratórioInicial;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ProgramaPrincipalVetores {
	
	public static void main(String[] args) {
		/*Criando um vetor com 4 objetos da classe Aluno*/
		Aluno alunos[] = new Aluno[4];
		
		alunos[0] = new Aluno("João", 111, 8.0, 6.0, 5.0);
		alunos[1] = new Aluno("Paula", 222, 4.0, 6.0, 3.0);
		alunos[2] = new Aluno("Ana", 333, 6.0, 4.0, 9.0);
		alunos[3] = new Aluno("Renata", 444, 7.0, 8.0, 9.0);
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		double total = 0;
		for(int i=0; i<=3; i++) {
			if (alunos[i].calculaMedia()>=7.0) {
				JOptionPane.showMessageDialog(null, "VMédia Aluno " + alunos[i] + " = " + df.format(alunos[i].calculaMedia()) + " aprovado!");
			}else {
				JOptionPane.showMessageDialog(null, "VMédia Aluno " + alunos[i] + " = " + df.format(alunos[i].calculaMedia()) + " reprovado!");
			}
			
			total = total + alunos[i].calculaMedia();
		}
		
		JOptionPane.showMessageDialog(null,"Média Geral = " + df.format(total/4));
		
	}

}

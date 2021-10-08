package TestMetodoExercicio;

import DominioMetodoExercicio.Funcionario;

public class Funcionariotest {
	public static void main(String[] args) {
		
		Funcionario funcionario01 = new Funcionario();
		Funcionario funcionario02 = new Funcionario();
		
		funcionario01.nome = "Rhaldney";
		funcionario01.idade = 28;
		funcionario01.salarios = new double[] {2800, 2955, 3120};
		
		funcionario02.nome = "Marcos";
		funcionario02.idade = 35;
		funcionario02.salarios = new double[] {3200, 3555, 3120};
		
		funcionario01.imprime();
		System.out.println("\n");
		funcionario02.imprime();
		
		funcionario01.imprimeMediaSalario();
		
		
	}

}

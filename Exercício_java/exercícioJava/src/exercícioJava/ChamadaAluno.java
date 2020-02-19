package exerc�cioJava;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class ChamadaAluno {

	public static ArrayList<Aluno> lista = new ArrayList();
	
	public static void main(String[] args) {
		
		
		Aluno aluno;
				
		Scanner le;
		String resp = null; 
		String nota = null;
		Double n1, n2;
		boolean contemAluno = false; 
		String nome= null;
		
		boolean sair = false;
		
		while(!sair) {
			
			
			aluno = new Aluno();
			le = new Scanner(System.in);
			
			System.out.println("\nDigite a letra correspondente a op��o \n "
					          + " \n A- Cadastrar aluno\n "
					          + " B- Listar alunos\n"
					          + "  C- Sair\n ");
			
				
				resp = le.nextLine();
				
				if(resp.equals("A")) {
									
					System.out.println("Informe o nome com sobrenome");
					nome = le.nextLine();
					
					if(VerificaAluno(nome)) {
						System.out.println("O aluno j� foi inserido na lista");
		
					}
					else {
						aluno.setNome(nome);
						
						try {
						System.out.println("Informe a n1");
						nota = le.nextLine();
					    n1 = Double.parseDouble(nota);
						aluno.setN1(n1);
						}
						catch(Exception erro) {
							System.out.println("Formato inv�lido, tente novamente");
							nota = le.nextLine();
							n1 = Double.parseDouble(nota);
						}
						try {
						System.out.println("Informe a n2");
						nota = le.nextLine();
					    n2 = Double.parseDouble(nota);
						aluno.setN2(n2);
						}
						catch(Exception e) {
							System.out.println("Formato inv�lido, tente novamente");
							nota = le.nextLine();
							n2 = Double.parseDouble(nota);
						}
						lista.add(aluno);
					}
					
				
				}
				else if (resp.contentEquals("B")) {
					for(int i = 0; i < lista.size();i++) {
						System.out.println("Nome:" + lista.get(i).getNome() +" N1:"+ lista.get(i).getN1()
								+ " N2:"+lista.get(i).getN2() +" M�dia:"+lista.get(i).getMedia() + "\n");
					}			
				}
				
				else if (resp.equals("C")) {
					sair = true;
				}
				else {
					System.out.println("Comando inv�lido");
				}
			
			
			
			//System.out.println("Nome: " + aluno.getNome() + " M�dia: "+ aluno.getMedia());

		}
		
	}
	
	public static boolean VerificaAluno (String aluno) {
		for(int i = 0; i < lista.size(); i++) {
			if(aluno.equals(lista.get(i).getNome())) {
				return true;
			}
		}
		return false;
	}

}



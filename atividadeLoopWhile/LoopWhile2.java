package atividadeLoopWhile;

import java.util.Scanner;

public class LoopWhile2 {
	/*
	 * Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores
	 * da área de Desenvolvimento e precisam de um sistema para analisar os dados.
	 * Escreva um algoritmo em Java, que leia via teclado as seguintes informações
	 * de cada colaborador: Idade (Número inteiro) Identidade de Gênero (Número
	 * Inteiro): 1 – Mulher Cis 2 – Homem Cis 3 – Não Binário 4 – Mulher Trans 5 –
	 * Homem Trans 6 – Outros Pessoa Desenvolvedora (Número Inteiro): 1 – Backend 2
	 * – Frontend 3 – Mobile 4 – FullStack
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade, genero, desenvolvedor,totalIdade=0,totalPessoas=0, media;
		int backend=0, mulherFrontend=0, homemMobileMaior40=0,nBinarioFullStackMenor30=0;
		char continuar = 's';
		Scanner leia = new Scanner(System.in);
		
		while (continuar == 's') {
            System.out.println("Digite a idade do colaborador:");
            idade = leia.nextInt();

            System.out.println("Digite o identidade de gênero do colaborador:");
            System.out.println("1 – Mulher Cis\n2 – Homem Cis\n3 – Não Binário\n4 – Mulher Trans\n5 – Homem Trans\n6 – Outros");
            genero = leia.nextInt();

            System.out.println("Digite o tipo de pessoa desenvolvedora:");
            System.out.println("1 – Backend\n2 – Frontend\n3 – Mobile\n4 – FullStack");
            desenvolvedor = leia.nextInt();

            switch (desenvolvedor) {
                case 1:
                    backend++;
                    break;
                case 2:
                    if (genero == 1 || genero == 4) {
                        mulherFrontend++;
                    
                    }
                    break;
                case 3:
                    if ((genero == 2 || genero == 5) && idade > 40) {
                       homemMobileMaior40++;
                    } 
                    break;
                case 4:
                    if (genero == 3 && idade < 30) {
                        nBinarioFullStackMenor30++;
                    }
                    break;
            }

            totalPessoas++;
            totalIdade += idade;

            System.out.println("Deseja continuar a leitura dos dados de um novo colaborador? (s/n)");
            continuar = leia.next().charAt(0);
        }

        System.out.println("Número de pessoas desenvolvedoras Backend: " + backend);
        System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulherFrontend );
        System.out.println("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homemMobileMaior40);
        System.out.println("Número de Não Binários desenvolvedores FullStack menores de 30 anos: " + nBinarioFullStackMenor30);
        System.out.println("Número total de pessoas que responderam à pesquisa: " + totalPessoas);
        System.out.println("Média de idade das pessoas que responderam à pesquisa: " + (totalIdade / totalPessoas));
    }
}
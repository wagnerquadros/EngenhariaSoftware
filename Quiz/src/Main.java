/******************************************************************************

Propõe-se, assim, que cada grupo elabore um programa de computador que apresente ao
usuário opções de temas, no mínimo dois, e para cada tema exiba cinco questões de
múltipla escolha, sendo que cada questão deve conter quatro opções de resposta. Caso o
usuário informe uma opção inválida1, uma mensagem de alerta (warning) deve ser exibida e
a questão deve ser novamente apresentada. Quando uma opção válida de resposta for
informada pelo usuário, uma mensagem de acerto deve ser mostrada, do contrário uma
mensagem de erro deve ser apresentada. Ao final das cinco questões, os números totais de
acertos e de erros devem ser exibidos. O programa deve encerrar quando o usuário
informar a opção de “sair” no momento de escolha do tema.
São requisitos para o desenvolvimento deste trabalho:
1. apresentar um menu;
2. encerrar o programa quando o usuário desejar;
3. adotar estruturas condicionais;
4. usar estruturas de repetição;
5. usar indentação para tornar o código legível;
6. comentar o código;
7. cinco questões para ao menos dois temas;
8. validar a escolha das opções, com mensagem de alerta para opção inválida;
9. mensagem de acerto ou erro para resposta válida;
10. contadores de acertos e erros, com sua respectiva exibição.
*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		char opcao, respostaQuestao, rejogar;
		int respostasCertas = 0, respostasErradas = 0, sair = 0;
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("|===================================================================|");
		System.out.println("|                                                             4.0.1 |");
		System.out.println("|      QQQQQ   U    U  III  ZZZZZZ    !!             @              |");
		System.out.println("|     Q     Q  U    U   I       Z     !!          |||||             |");   // Tela inicial do Quiz
		System.out.println("|     Q     Q  U    U   I      Z      !!      ---( o o )---         |");    
		System.out.println("|     Q     Q  U    U   I     Z       !!      -----(_)-----         |");    
		System.out.println("|     Q   Q Q  U    U   I    Z                oooO-----Oooo         |");  
		System.out.println("|       QQQQ    UUUU   III  ZZZZZZ    !!      -------------         |");
		System.out.println("|          Q                                                        |");
		System.out.println("|                                                                   |");
		System.out.println("|===================================================================|");
		System.out.println("|                                                     by Ordem Jedi |");
        System.out.println("|===================================================================|");
        System.out.println("|===================================================================|");
        System.out.println("|                                                   Aperte Enter... |");
        System.out.println("|===================================================================|");
        entrada.nextLine ();

        System.out.println(" ");                                                                        
		System.out.println(" ");
        System.out.println("|===================================================================|");
        System.out.println("|  Instruções:                                                      |");
        System.out.println("|  Você poderá escolher entre dois temas. Para cada tema haverá     |");   // Tela de instruções
        System.out.println("|  cinco questões com quatro alternativas. Respostas certas e       |");
        System.out.println("|  erradas serão contabilizadas e apresentadas no final do jogo.    |");
        System.out.println("|===================================================================|");
        System.out.println("|  Para selecionar o tema digite a letra 'A' ou 'B'.                |");    
        System.out.println("|  Para responder as questões digite 'A', 'B', 'C' ou 'D'.          |");
        System.out.println("|  Digite 'S' para sair.                                            |");
        System.out.println("|  Opções inválidas retornam a tela anterior.                       |");
        System.out.println("|===================================================================|");
        System.out.println("|                             Divirta-se!                           |");
        System.out.println("|===================================================================|");
        System.out.println("|                                                   Aperte Enter... |");
        System.out.println("|===================================================================|");
        entrada.nextLine ();

        do { // Fator replay

            do {    
                System.out.println(" ");                                                                        
                System.out.println(" ");    
                System.out.println("|===================================================================|");
                System.out.println("|                                                                   |");
                System.out.println("|  TTTTTTTT EEEEE  MM   MM  AAAAA   SSSS                            |");
                System.out.println("|     TT    E      M M M M  A   A  S                                |");
                System.out.println("|     TT    EEEE   M  M  M  AAAAA  SSSSSS                           |");    // Seleção de temas
                System.out.println("|     TT    E      M     M  A   A       S                           |");
                System.out.println("|     TT    EEEEE  M     M  A   A   SSSS    # # #                   |");
                System.out.println("|                                                                   |");
                System.out.println("|===================================================================|");    
                System.out.println("| A - Tema 01: Chavesmaníaco                                        |");    // São dois os temas. Para selecionar o jogador digita a opção              
                System.out.println("| B - Tema 02: Preparatório ENEM - Geografia                        |");    // do tema ou seleciona a opção de sair, que leva ao fim do jogo  
                System.out.println("|===================================================================|");
                System.out.println("| S - Sair                                                          |");
                System.out.println("|===================================================================|");
                System.out.print  ("| Seleciona 'A' para o Tema 1, 'B' para o Tema 2 ou 'S' para Sair: ");
                opcao = entrada.next().charAt(0);                                                               // entrada da opção digitada
                
                System.out.println(" ");                                                                        
                System.out.println(" ");
                
                
                if (opcao != 'a' && opcao != 'A' && opcao != 'b' && opcao != 'B' && opcao != 's' && opcao != 'S') { //Verificação de opção válida.
                    System.out.println("|===================================================================|");
                    System.out.println("|====                                                           ====|");  // Mensagem de erro
                    System.out.println("|====                      Opção Inválida!                      ====|");  // em caso de opção inválida.
                    System.out.println("|====                                                           ====|");
                    System.out.println("|===================================================================|");

                    System.out.println(" ");
                    System.out.println(" ");
                }
                
            } while (opcao != 'a' && opcao != 'A' && opcao != 'b' && opcao != 'B' && opcao != 's' &&opcao != 'S');  //repete enquanto a opção escolhida não for válida.
            
            switch (opcao) { // Estrutura switch para os temas. Primeiro caso para o Tema 01 e segundo caso para o Tema 02.
            
                case 'a': case 'A':  //Selecionado o Tema 01
                    do { // Loop para respostas inválidas. Repete até uma alternativa válida ser respondida.
                        System.out.println("|======================================================================|");
                        System.out.println("| Quastão 01                                                           |");
                        System.out.println("|======================================================================|");
                        System.out.println("| Qual o animal que come com o rabo?                                   |");
                        System.out.println("|======================================================================|");     // Primeira questão
                        System.out.println("| a - Elefante                                                         |");     // do tema 01.
                        System.out.println("| b - Todos                                                            |");
                        System.out.println("| c - Porco                                                            |");
                        System.out.println("| d - Nenhum                                                           |");
                        System.out.println("|======================================================================|");
                        System.out.println("| S - sair                                                             |");
                        System.out.println("|======================================================================|");
                        System.out.print  ("|Qual a sua resposta? ");
                        respostaQuestao = entrada.next().charAt(0);
                        
                        System.out.println(" ");
                        System.out.println(" ");
                        
                        //Verificação resposta válida.
                        if(respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S') {
                            System.out.println("|====================================|");
                            System.out.println("|                                    |");
                            System.out.println("|  Opção inválida. Tente novamente.  |");  //É mostrado caso digitado algo diferente de 
                            System.out.println("|                                    |");  // 'a', 'A', 'b','B','c','C','s'ou 'S'.
                            System.out.println("|====================================|");

                            System.out.println("                                      ");
                            System.out.println("                                      ");
                        }
                
                    } while (respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S');  
                        
                    switch (respostaQuestao){ //Respostas
                        
                        case 'b': case 'B':  // Resposta Certa
                            System.out.println("|====================================|");
                            System.out.println("|====================================|");
                            System.out.println("|      Isso, isso, isso, isso !!!!   |");
                            System.out.println("|          Certa a resposta!         |");  // Mensagem de resposta 
                            System.out.println("|====================================|");  // certa.
                            System.out.println("|====================================|");
                            System.out.println("                                      ");
                            System.out.println("                                      ");
                            respostasCertas++; // Incrementa o contador de respostas certas
                            break;
                            
                        case 'a': case 'A': case 'c': case 'C': case 'd': case 'D': // Respostas incorretas
                            System.out.println("|====================================|");
                            System.out.println("|====================================|");
                            System.out.println("|         Gentalha, gentalha!        |");
                            System.out.println("|  Resposta incorreta, que peninha.  |");  // Mensagem de resposta 
                            System.out.println("|====================================|");  // incorreta.
                            System.out.println("|====================================|");
                            System.out.println("                                      ");
                            System.out.println("                                      ");
                            respostasErradas++; // Incrementa o contador de respostas erradas
                            break;
                            
                        case 's': case 'S': // Opção sair - Leva ao final do jogo
                            break;
                            
                    }   // a partir deste ponto a estrutura questões seguintes é igual a da primeira questão.
                    
                    if (respostaQuestao!='s' && respostaQuestao!='S') { // Caso opão diferente de 's' ou 'S' o jogo continua, senão vai para o fim
                        
                        do { 
                            System.out.println("|======================================================================|");
                            System.out.println("| Quastão 02                                                           |");
                            System.out.println("|======================================================================|");
                            System.out.println("| Como o Prof. Girafales define um suborno?                            |");
                            System.out.println("|======================================================================|");
                            System.out.println("| a - Propina                                                          |");    
                            System.out.println("| b - Conchavo                                                         |");
                            System.out.println("| c - Lob                                                              |");
                            System.out.println("| d - Peita                                                            |");
                            System.out.println("|======================================================================|");
                            System.out.println("| S - sair                                                             |");
                            System.out.println("|======================================================================|");
                            System.out.print  ("|Qual a sua resposta? ");
                            respostaQuestao = entrada.next().charAt(0);
                        
                            System.out.println(" ");
                            System.out.println(" ");
                        
                            if(respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S') {
                                System.out.println("|====================================|");
                                System.out.println("|                                    |");
                                System.out.println("|  Opção inválida. Tente novamente.  |");    
                                System.out.println("|                                    |");
                                System.out.println("|====================================|");

                                System.out.println("                                      ");
                                System.out.println("                                      ");
                            }
                
                        } while (respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S');  
                        
                        switch (respostaQuestao) { 
                        
                            case 'd': case 'D':
                                System.out.println("|====================================|");
                                System.out.println("|====================================|");
                                System.out.println("|      Isso, isso, isso, isso !!!!   |");
                                System.out.println("|          Certa a resposta!         |");
                                System.out.println("|====================================|");
                                System.out.println("|====================================|");
                                System.out.println("                                      ");
                                System.out.println("                                      ");
                                respostasCertas++;
                                break;
                            
                            case 'a': case 'A': case 'b': case 'B': case 'c': case 'C':
                                System.out.println("|====================================|");
                                System.out.println("|====================================|");
                                System.out.println("|         Gentalha, gentalha!        |");
                                System.out.println("|  Resposta incorreta, que peninha.  |");
                                System.out.println("|====================================|");
                                System.out.println("|====================================|");
                                System.out.println("                                      ");
                                System.out.println("                                      ");
                                respostasErradas++;
                                break;
                            
                            case 's': case 'S':
                                break;
                            
                        }
                        
                        if (respostaQuestao!='s' && respostaQuestao!='S') {
                        
                            do {        
                                System.out.println("|======================================================================|");
                                System.out.println("| Quastão 03                                                           |");
                                System.out.println("|======================================================================|");
                                System.out.println("| Qual o motivo dado por Chaves para o aumento do preço dos refrescos? |");
                                System.out.println("|======================================================================|");
                                System.out.println("| a - Energúmenos                                                      |");    
                                System.out.println("| b - Inflação                                                         |");
                                System.out.println("| c - Choque do petróleo                                               |");
                                System.out.println("| d - Energéticos                                                      |");
                                System.out.println("|======================================================================|");
                                System.out.println("| S - sair                                                             |");
                                System.out.println("|======================================================================|");
                                System.out.print  ("|Qual a sua resposta? ");
                                respostaQuestao = entrada.next().charAt(0);
                    
                                System.out.println(" ");
                                System.out.println(" ");
                            
                                                
                                if (respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S') {
                                    
                                    System.out.println("|====================================|");
                                    System.out.println("|                                    |");
                                    System.out.println("|  Opção inválida. Tente novamente.  |");    
                                    System.out.println("|                                    |");
                                    System.out.println("|====================================|");
        
                                    System.out.println("                                      ");
                                    System.out.println("                                      ");
                                } 
                                        
                            } while (respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S');  
                        
                            switch (respostaQuestao) { 
                            
                                case 'a': case 'A':
                                    System.out.println("|====================================|");
                                    System.out.println("|====================================|");
                                    System.out.println("|      Isso, isso, isso, isso !!!!   |");
                                    System.out.println("|          Certa a resposta!         |");
                                    System.out.println("|====================================|");
                                    System.out.println("|====================================|");
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    respostasCertas++;
                                    break;
                                    
                                case 'd': case 'D': case 'b': case 'B': case 'c': case 'C':
                                    System.out.println("|====================================|");
                                    System.out.println("|====================================|");
                                    System.out.println("|         Gentalha, gentalha!        |");
                                    System.out.println("|  Resposta incorreta, que peninha.  |");
                                    System.out.println("|====================================|");
                                    System.out.println("|====================================|");
                                    System.out.println("                                      ");
                                    System.out.println("                                      ");
                                    respostasErradas++;
                                    break;
                            
                                case 's': case 'S':
                                    break;
                                    
                            }
                            
                            if (respostaQuestao!='s' && respostaQuestao!='S') {
                            
                                do {
                                    
                                    System.out.println("|======================================================================|");
                                    System.out.println("| Quastão 04                                                           |");
                                    System.out.println("|======================================================================|");
                                    System.out.println("| O corpo do Benito é... ?                                             |");
                                    System.out.println("|======================================================================|");
                                    System.out.println("| a - Uma bola quadrada                                                |");    
                                    System.out.println("| b - O Sr. Barriga                                                    |");
                                    System.out.println("| c - Uma bola de boliche                                              |");
                                    System.out.println("| d - Um triciclo                                                      |");
                                    System.out.println("|======================================================================|");
                                    System.out.println("| S - sair                                                             |");
                                    System.out.println("|======================================================================|");
                                    System.out.print  ("|Qual a sua resposta? ");
                                    respostaQuestao = entrada.next().charAt(0);
                        
                                    System.out.println(" ");
                                    System.out.println(" ");
                                                                                    
                                    if (respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S') {
                                        
                                        System.out.println("|====================================|");
                                        System.out.println("|                                    |");
                                        System.out.println("|  Opção inválida. Tente novamente.  |");    
                                        System.out.println("|                                    |");
                                        System.out.println("|====================================|");

                                        System.out.println("                                      ");
                                        System.out.println("                                      ");
                                    } 
                                    
                                } while (respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S');
                                
                                switch (respostaQuestao) { 
                            
                                    case 'c': case 'C':
                                        System.out.println("|====================================|");
                                        System.out.println("|====================================|");
                                        System.out.println("|      Isso, isso, isso, isso !!!!   |");
                                        System.out.println("|          Certa a resposta!         |");
                                        System.out.println("|====================================|");
                                        System.out.println("|====================================|");
                                        System.out.println(" ");
                                        System.out.println(" ");
                                        respostasCertas++;
                                        break;
                                        
                                    case 'd': case 'D': case 'b': case 'B': case 'a': case 'A':
                                        System.out.println("|====================================|");
                                        System.out.println("|====================================|");
                                        System.out.println("|         Gentalha, gentalha!        |");
                                        System.out.println("|  Resposta incorreta, que peninha.  |");
                                        System.out.println("|====================================|");
                                        System.out.println("|====================================|");
                                        System.out.println("                                      ");
                                        System.out.println("                                      ");
                                        respostasErradas++;
                                        break;
                                
                                    case 's': case 'S':
                                        break;
                                        
                                }

                                if (respostaQuestao!='s' && respostaQuestao!='S') {
                                
                                    do {
                                    
                                        System.out.println("|======================================================================|");
                                        System.out.println("| Quastão 05                                                           |");
                                        System.out.println("|======================================================================|");
                                        System.out.println("| O que Hector Bonilla deixa no barril do chaves ao sair da vila?      |");
                                        System.out.println("|======================================================================|");
                                        System.out.println("| a - Uma sanduiche de presunto                                        |");    
                                        System.out.println("| b - Um mascote                                                       |");
                                        System.out.println("| c - Um macaco hidraulico                                             |");
                                        System.out.println("| d - Uma bola de futebol                                              |");
                                        System.out.println("|======================================================================|");
                                        System.out.println("| S - sair                                                             |");
                                        System.out.println("|======================================================================|");
                                        System.out.print  ("|Qual a sua resposta? ");
                                        respostaQuestao = entrada.next().charAt(0);
                            
                                        System.out.println(" ");
                                        System.out.println(" ");
                                                                                        
                                        if (respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S') {
                                        
                                            System.out.println("|====================================|");
                                            System.out.println("|                                    |");
                                            System.out.println("|  Opção inválida. Tente novamente.  |");    
                                            System.out.println("|                                    |");
                                            System.out.println("|====================================|");

                                            System.out.println(" ");
                                            System.out.println(" ");

                                        } 
                                        
                                    } while (respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S');
                                    
                                    switch (respostaQuestao) { 
                                
                                        case 'd': case 'D':
                                            System.out.println("|====================================|");
                                            System.out.println("|====================================|");
                                            System.out.println("|      Isso, isso, isso, isso !!!!   |");
                                            System.out.println("|          Certa a resposta!         |");
                                            System.out.println("|====================================|");
                                            System.out.println("|====================================|");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            respostasCertas++;
                                            break;
                                            
                                        case 'c': case 'C': case 'b': case 'B': case 'a': case 'A':
                                            System.out.println("|====================================|");
                                            System.out.println("|====================================|");
                                            System.out.println("|         Gentalha, gentalha!        |");
                                            System.out.println("|  Resposta incorreta, que peninha.  |");
                                            System.out.println("|====================================|");
                                            System.out.println("|====================================|");
                                            System.out.println("                                      ");
                                            System.out.println("                                      ");
                                            respostasErradas++;
                                            break;
                                    
                                        case 's': case 'S':
                                            break;
                                            
                                    }                
                                                            
                                }    
                        
                            }    
                            
                        }    

                    }

                    //Aqui são mostradas a quantidade de respostas certas e erradas.
                    System.out.println("|=============================================|");
                    System.out.println("|=============================================|");
                    System.out.println("              Respostas Certas: " + respostasCertas );
                    System.out.println("              Respostas Erradas: " + respostasErradas );
                    System.out.println("|=============================================|");
                    System.out.println("|=============================================|");
                    System.out.println(" ");
                    System.out.println(" ");

                    respostasCertas = 0;     // Contador de respostas é zerado.
                    respostasErradas = 0;             
                    break; // Fim do questionário Tema 01
                    
                // Abaixo segue a estrutura do segundo Tema
                case 'b': case 'B':  //Selecionado o Tema 02
                    
                    do {  

                        System.out.println("|======================================================================|");
                        System.out.println("| Quastão 01                                                           |");
                        System.out.println("|======================================================================|");
                        System.out.println("| A única estrela a figurar acima do lema Ordem e Progresso na         |");
                        System.out.println("| bandeira do Brasil representa qual estado?                           |");
                        System.out.println("|======================================================================|");     
                        System.out.println("| a - São Paulo                                                        |");     
                        System.out.println("| b - Amapá                                                            |");
                        System.out.println("| c - Mato Grosso do Sul                                               |");
                        System.out.println("| d - Pará                                                             |");
                        System.out.println("|======================================================================|");
                        System.out.println("| S - sair                                                             |");
                        System.out.println("|======================================================================|");
                        System.out.print  ("|Qual a sua resposta? ");
                        respostaQuestao = entrada.next().charAt(0);
                        
                        System.out.println(" ");
                        System.out.println(" ");
                        
                        if(respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S') {
                                
                                System.out.println("|====================================|");
                                System.out.println("|                                    |");
                                System.out.println("|  Opção inválida. Tente novamente.  |");    
                                System.out.println("|                                    |");
                                System.out.println("|====================================|");

                                System.out.println(" ");
                                System.out.println(" ");
                        }

                    } while (respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S'); 

                    switch (respostaQuestao){ 
                        
                        case 'd': case 'D':
                            System.out.println("|====================================|");
                            System.out.println("|====================================|");
                            System.out.println("|      Essa tem que cair na prova.   |");
                            System.out.println("|          Certa a resposta!         |");  
                            System.out.println("|====================================|");  
                            System.out.println("|====================================|");
                            System.out.println("                                      ");
                            System.out.println("                                      ");
                            respostasCertas++;
                            break;
                            
                        case 'a': case 'A': case 'c': case 'C': case 'b': case 'B':
                            System.out.println("|====================================|");
                            System.out.println("|====================================|");
                            System.out.println("|   Resposta incorreta. Já pensou    |");
                            System.out.println("|   em algum curso pré vestibular?   |");   
                            System.out.println("|====================================|");  
                            System.out.println("|====================================|");
                            System.out.println("                                      ");
                            System.out.println("                                      ");
                            respostasErradas++;
                            break;
                            
                        case 's': case 'S':
                            break;
                            
                    }   

                    if (respostaQuestao!='s' && respostaQuestao!='S') {
                        
                        do { 
                            System.out.println("|======================================================================|");
                            System.out.println("| Quastão 02                                                           |");
                            System.out.println("|======================================================================|");
                            System.out.println("| Qual a capital dos Estados Unidos?                                   |");
                            System.out.println("|======================================================================|");
                            System.out.println("| a - Washington, DC                                                   |");    
                            System.out.println("| b - Nova York                                                        |");
                            System.out.println("| c - Filadélfia                                                       |");
                            System.out.println("| d - Porto Alegre                                                     |");
                            System.out.println("|======================================================================|");
                            System.out.println("| S - sair                                                             |");
                            System.out.println("|======================================================================|");
                            System.out.print  ("|Qual a sua resposta? ");
                            respostaQuestao = entrada.next().charAt(0);
                    
                            System.out.println(" ");
                            System.out.println(" ");
                    
                            if(respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S') {

                                System.out.println("|====================================|");
                                System.out.println("|                                    |");
                                System.out.println("|  Opção inválida. Tente novamente.  |");    
                                System.out.println("|                                    |");
                                System.out.println("|====================================|");

                                System.out.println(" ");
                                System.out.println(" ");
                            }
            
                        } while (respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S');  
                    
                        switch (respostaQuestao) { 
                    
                            case 'a': case 'A':
                                System.out.println("|====================================|");
                                System.out.println("|====================================|");
                                System.out.println("|      Essa tem que cair na prova.   |");
                                System.out.println("|          Certa a resposta!         |");
                                System.out.println("|====================================|");
                                System.out.println("|====================================|");
                                System.out.println("                                      ");
                                System.out.println("                                      ");
                                respostasCertas++;
                                break;
                        
                            case 'd': case 'D': case 'b': case 'B': case 'c': case 'C':
                                System.out.println("|====================================|");
                                System.out.println("|====================================|");
                                System.out.println("|   Resposta incorreta. Já pensou    |");
                                System.out.println("|   em algum curso pré vestibular?   |");
                                System.out.println("|====================================|");
                                System.out.println("|====================================|");
                                System.out.println("                                      ");
                                System.out.println("                                      ");
                                respostasErradas++;
                                break;
                        
                            case 's': case 'S':
                                break;
                        
                        }
                    
                        if (respostaQuestao!='s' && respostaQuestao!='S') {
                    
                            do {      
                                System.out.println("|======================================================================|");
                                System.out.println("| Quastão 03                                                           |");
                                System.out.println("|======================================================================|");
                                System.out.println("| Quantas cidades tem no Rio Grande do Sul?                            |");
                                System.out.println("|======================================================================|");
                                System.out.println("| a - 499                                                              |");    
                                System.out.println("| b - 498                                                              |");
                                System.out.println("| c - 497                                                              |");
                                System.out.println("| d - 496                                                              |");
                                System.out.println("|======================================================================|");
                                System.out.println("| S - sair                                                             |");
                                System.out.println("|======================================================================|");
                                System.out.print  ("|Qual a sua resposta? ");
                                respostaQuestao = entrada.next().charAt(0);
                
                                System.out.println(" ");
                                System.out.println(" ");
                        
                                                
                                if (respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S') {
                                
                                    System.out.println("|====================================|");
                                    System.out.println("|                                    |");
                                    System.out.println("|  Opção inválida. Tente novamente.  |");    
                                    System.out.println("|                                    |");
                                    System.out.println("|====================================|");

                                    System.out.println(" ");
                                    System.out.println(" ");                            

                                } 
                                    
                            } while (respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S');  
                    
                            switch (respostaQuestao) { 
                        
                                case 'c': case 'C':
                                    System.out.println("|====================================|");
                                    System.out.println("|====================================|");
                                    System.out.println("|      Essa tem que cair na prova.   |");
                                    System.out.println("|          Certa a resposta!         |");
                                    System.out.println("|====================================|");
                                    System.out.println("|====================================|");
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    respostasCertas++;
                                    break;
                                
                                case 'd': case 'D': case 'b': case 'B': case 'a': case 'A':
                                    System.out.println("|====================================|");
                                    System.out.println("|====================================|");
                                    System.out.println("|   Resposta incorreta. Já pensou    |");
                                    System.out.println("|   em algum curso pré vestibular?   |");
                                    System.out.println("|====================================|");
                                    System.out.println("|====================================|");
                                    System.out.println("                                      ");
                                    System.out.println("                                      ");
                                    respostasErradas++;
                                    break;
                                
                                case 's': case 'S':
                                    break;
                                        
                            }
                        
                            if (respostaQuestao!='s' && respostaQuestao!='S') {
                        
                                do {
                                
                                    System.out.println("|======================================================================|");
                                    System.out.println("| Quastão 04                                                           |");
                                    System.out.println("|======================================================================|");
                                    System.out.println("| Qual o menor Estado do Brasil?                                       |");
                                    System.out.println("|======================================================================|");
                                    System.out.println("| a - Rio de Janeiro                                                   |");    
                                    System.out.println("| b - Amazonas                                                         |");
                                    System.out.println("| c - Espírito Santo                                                   |");
                                    System.out.println("| d - Sergipe                                                          |");
                                    System.out.println("|======================================================================|");
                                    System.out.println("| S - sair                                                             |");
                                    System.out.println("|======================================================================|");
                                    System.out.print  ("|Qual a sua resposta? ");
                                    respostaQuestao = entrada.next().charAt(0);
                            
                                    System.out.println(" ");
                                    System.out.println(" ");
                                                                                        
                                    if (respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S') {
                                    
                                        System.out.println("|====================================|");
                                        System.out.println("|                                    |");
                                        System.out.println("|  Opção inválida. Tente novamente.  |");    
                                        System.out.println("|                                    |");
                                        System.out.println("|====================================|");

                                        System.out.println(" ");
                                        System.out.println(" ");

                                    } 
                                
                                } while (respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S');
                            
                                switch (respostaQuestao) { 
                        
                                    case 'd': case 'D':
                                        System.out.println("|====================================|");
                                        System.out.println("|====================================|");
                                        System.out.println("|      Essa tem que cair na prova.   |");
                                        System.out.println("|          Certa a resposta!         |");
                                        System.out.println("|====================================|");
                                        System.out.println("|====================================|");
                                        System.out.println(" ");
                                        System.out.println(" ");
                                        respostasCertas++;
                                        break;
                                    
                                    case 'c': case 'C': case 'b': case 'B': case 'a': case 'A':
                                        System.out.println("|====================================|");
                                        System.out.println("|====================================|");
                                        System.out.println("|   Resposta incorreta. Já pensou    |");
                                        System.out.println("|   em algum curso pré vestibular?   |");
                                        System.out.println("|====================================|");
                                        System.out.println("|====================================|");
                                        System.out.println("                                      ");
                                        System.out.println("                                      ");
                                        respostasErradas++;
                                        break;
                            
                                    case 's': case 'S':
                                        break;
                                    
                                }

                                if (respostaQuestao!='s' && respostaQuestao!='S') {
                            
                                    do {
                                
                                        System.out.println("|======================================================================|");
                                        System.out.println("| Quastão 05                                                           |");
                                        System.out.println("|======================================================================|");
                                        System.out.println("| Qual a capital mais fria do Brasil?                                  |");
                                        System.out.println("|======================================================================|");
                                        System.out.println("| a - Porto Alegre                                                     |");    
                                        System.out.println("| b - Curitiba                                                         |");
                                        System.out.println("| c - Florianópolis                                                    |");
                                        System.out.println("| d - São Paulo                                                        |");
                                        System.out.println("|======================================================================|");
                                        System.out.println("| S - sair                                                             |");
                                        System.out.println("|======================================================================|");
                                        System.out.print  ("|Qual a sua resposta? ");
                                        respostaQuestao = entrada.next().charAt(0);
                                
                                        System.out.println(" ");
                                        System.out.println(" ");
                                                                                    
                                        if (respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S') {
                                        
                                            System.out.println("|====================================|");
                                            System.out.println("|                                    |");
                                            System.out.println("|  Opção inválida. Tente novamente.  |");    
                                            System.out.println("|                                    |");
                                            System.out.println("|====================================|");
                    
                                            System.out.println(" ");
                                            System.out.println(" ");
                                        } 
                                
                                    } while (respostaQuestao!='a' && respostaQuestao!='A' && respostaQuestao!='b' && respostaQuestao!='B' && respostaQuestao!='c' && respostaQuestao!='C' &&  respostaQuestao!='d' && respostaQuestao!='D' && respostaQuestao!= 's' && respostaQuestao!= 'S');
                                
                                    switch (respostaQuestao) { 
                            
                                        case 'b': case 'B':
                                            System.out.println("|====================================|");
                                            System.out.println("|====================================|");
                                            System.out.println("|      Essa tem que cair na prova.   |");
                                            System.out.println("|          Certa a resposta!         |");
                                            System.out.println("|====================================|");
                                            System.out.println("|====================================|");
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            respostasCertas++;
                                            break;
                                                
                                        case 'c': case 'C': case 'd': case 'D': case 'a': case 'A':
                                            System.out.println("|====================================|");
                                            System.out.println("|====================================|");
                                            System.out.println("|   Resposta incorreta. Já pensou    |");
                                            System.out.println("|   em algum curso pré vestibular?   |");
                                            System.out.println("|====================================|");
                                            System.out.println("|====================================|");
                                            System.out.println("                                      ");
                                            System.out.println("                                      ");
                                            respostasErradas++;
                                            break;
                                        
                                        case 's': case 'S':
                                            break;
                                                
                                    }
                            
                                }    
                    
                            }    
                        
                        }

                    }

                    //Aqui são mostradas a quantidade de respostas certas e erradas.
                    System.out.println("|=============================================|");
                    System.out.println("|=============================================|");
                    System.out.println("              Respostas Certas: " + respostasCertas );
                    System.out.println("              Respostas Erradas: " + respostasErradas );
                    System.out.println("|=============================================|");
                    System.out.println("|=============================================|");
                    System.out.println(" ");
                    System.out.println(" ");
                    
                    respostasCertas = 0;     
                    respostasErradas = 0;
                    break;   // Fim do questionário Tema 02

                case 's': case 'S':
                    sair = 1;
                    break;
                
            }

            if (sair !=1) { // Teste necessário para o caso do jogagor escolher sair na tela de seleção de temas.

                do {

                    System.out.println("|=============================================|");
                    System.out.println("|=============================================|");
                    System.out.println("|               Jogar novamente?              |");
                    System.out.println("|              S - sim | N - não              |");   // Opção de jogar novamente
                    System.out.println("|=============================================|");
                    System.out.println("|=============================================|");
                    System.out.print(" Qual sua opção: ");
                    rejogar = entrada.next().charAt(0);

                    System.out.println(" ");
                    System.out.println(" ");

                    if (rejogar != 's' && rejogar != 'S' && rejogar != 'n' && rejogar != 'N') {
                        System.out.println("|====================================|");
                        System.out.println("|                                    |");
                        System.out.println("|  Opção inválida. Tente novamente.  |");               //Verififação de opção válida
                        System.out.println("|                                    |");
                        System.out.println("|====================================|");
                        System.out.println(" ");
                        System.out.println(" ");

                    }

                } while (rejogar != 's' && rejogar != 'S' && rejogar != 'n' && rejogar != 'N');
        
                if (rejogar == 's' || rejogar =='S') {           // Atribuição de valor para a variavel
                    sair = 0;                                    // 'sair'. Caso seja igua a 0, permanece            
                                                                // no jogo. Caso igual a 1, sai do jogo.   
                } else {                           
                    sair = 1;

                }
                
            }    

        } while (sair != 1);    
    
	    System.out.println("|=============================================|");
	    System.out.println("|=============================================|");
	    System.out.println("|           Obrigado por ter jogado!          |");
	    System.out.println("|=============================================|");
	    System.out.println("|=============================================|");

	}

}




















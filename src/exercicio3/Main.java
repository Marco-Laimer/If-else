package exercicio3;

import  java.util.Scanner ;
public class Main {

	 public static void main(String[] args){
	        
	        Scanner teclado = new Scanner(System.in);
	 
	       
	        String[] perguntas = new String[5];
	            perguntas[0] = "Ele/Ela elefonou para a v�tima? sim ou n�o?";
	            perguntas[1] = "Ele/Ela esteve no local do crime? sim ou n�o?";
	            perguntas[2] = "Ele/Ela mora perto da v�tima? sim ou n�o?";
	            perguntas[3] = "Ele/Ela devia para a v�tima? sim ou n�o?";
	            perguntas[4] = "Ele/Ela j� trabalhou com a v�tima? sim ou n�o?";
	       
	       
	        int respostasPositivas = 0;
	       
	        
	        for(int i = 0; i < perguntas.length; i++){
	            System.out.println(perguntas[i]);
	            String respostas = teclado.nextLine();
	           
	            
	            
	            if(respostas.toLowerCase().equals("sim")){ 
	                respostasPositivas++; 
	            }
	        }
	 
	        
	        switch(respostasPositivas){
	            case 2: 
	                System.out.println("Ele/Ela � Suspeito");
	                break;
	 
	            case 3:
	            case 4:
	                System.out.println("Ele/Ela � C�mplice");
	                break;
	 
	            case 5:
	                System.out.println("Ele/Ela � Assassino");
	                break;
	 
	            default:
	                System.out.println("Ele/Ela � Inocente");
	                break;
	        }
	    }
}

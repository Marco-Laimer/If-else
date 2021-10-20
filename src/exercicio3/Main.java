package exercicio3;

import  java.util.Scanner ;
public class Main {

	 public static void main(String[] args){
	        
	        Scanner teclado = new Scanner(System.in);
	 
	       
	        String[] perguntas = new String[5];
	            perguntas[0] = "Ele/Ela elefonou para a vítima? sim ou não?";
	            perguntas[1] = "Ele/Ela esteve no local do crime? sim ou não?";
	            perguntas[2] = "Ele/Ela mora perto da vítima? sim ou não?";
	            perguntas[3] = "Ele/Ela devia para a vítima? sim ou não?";
	            perguntas[4] = "Ele/Ela já trabalhou com a vítima? sim ou não?";
	       
	       
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
	                System.out.println("Ele/Ela é Suspeito");
	                break;
	 
	            case 3:
	            case 4:
	                System.out.println("Ele/Ela é Cúmplice");
	                break;
	 
	            case 5:
	                System.out.println("Ele/Ela é Assassino");
	                break;
	 
	            default:
	                System.out.println("Ele/Ela é Inocente");
	                break;
	        }
	    }
}

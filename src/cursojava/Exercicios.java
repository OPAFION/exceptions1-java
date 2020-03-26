package cursojava;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicios {

    public static void main(String[] args) {

        method1();

        System.out.println("End of program");
    }

        public static void method1() {
            System.out.println("***METHOD1 START***");
            method2();
            System.out.println("***METHOD1 END***");
        }

    
    public static void method2() {
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            //ANALISA OS CHAMADOS DAS EXCESSÕES
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        sc.close();
        System.out.println("***METHOD2 END***");
    }

//        Scanner sc = new Scanner(System.in);
//        
//        String name;
//        int idade;
//        int ano = 0;
//        int mes = 0;
//        int dia = 0;
//        int soma = 0;
//        
//        System.out.print("Digite seu nome: ");
//        name = sc.nextLine();
//        System.out.print("Digite sua idade somente em ano: ");
//        ano = sc.nextInt();
//        System.out.print("Entre com sua idade somente em meses: ");
//        mes = sc.nextInt();
//        System.out.print("Entre com sua idade somente em dias: ");
//        dia = sc.nextInt();
//        
//        soma += (ano * 365) + (mes * 30);
//        System.out.println(ano + " anos, " +  mes + " meses e " + dia + " dias =  " + soma + " dias");    
//        
//        
//        String[] vect = new String[] {"Maria", "Bob", "Alex"};
//        
//        for (int i = 0; i < vect.length; i++){
//            System.out.println(vect[i]);
//        }
//        
//        System.out.println("----------------------------");
//        for(String obj : vect){
//            System.out.println(obj);
//        }
//          List<String> list = new ArrayList<>();
//          
//          list.add("Maria");
//          list.add("Alex");
//          list.add("Bob");
//          list.add("Anna");
//          list.add(2, "Marco");
//          
//          System.out.println(list.size());
//          
//          for(String x : list){
//              System.out.println(x);
//          }
//          System.out.println("----------------------");
//          list.removeIf(x -> x.charAt(0) == 'M');
//          for(String x : list){
//              System.out.println(x);
//          }
//          System.out.println("----------------------");
//          System.out.println("Index of Bob " + list.indexOf("Bob"));
//          System.out.println("Index of Marco: " + list.indexOf("Marco"));
//          System.out.println("----------------------");
//          List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
//          for(String x : result){
//              System.out.println(x);
//          }
//          System.out.println("----------------------");
//          String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null); 
//          System.out.println(name);
}

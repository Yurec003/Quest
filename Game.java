import java.util.Scanner;
public class Game {
static Scanner scan=new Scanner (System.in);
static Character man=new Character();
static boolean inITSchool=false;
	public static void start() {

    System.out.println("Ваc пригласили на пробный тест IT School Samsung. Вы пойдете?(y/n)");	
    String resp=scan.next();
    if (resp.equals("y")) {
    	man.communication+=10;
    	  System.out.println(man.toString());
    	inITSchool=true;
    	System.out.print("Вы прошли тест и поступили в IT школу\nВы учитесь 3 месяц. ");
    	
    }else {
    	System.out.println("Вы остались дома и посмотрели кино");
    	  System.out.println(man.toString());
    }
    System.out.println("Вас позвали гулять, но вам нужно сделать ДЗ. Вы пойдете гулять?(y/n)");
	 resp=scan.next();
     if (resp.equals("n")) {
     	man.IQ+=25;
     }
    System.out.println(man.toString());
    if (inITSchool) {
    	System.out.println("Спустя 1 год вы закончили IT школу");
    	man.IQ+=75;
    	man.communication+=90;
    	 System.out.println(man.toString());
    }
	} 

}

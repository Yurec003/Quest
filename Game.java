import java.util.Scanner;
public class Game {
static Scanner scan=new Scanner (System.in);
static Character man=new Character();
static boolean inITSchool=false;
	public static void start() {

    System.out.println("��c ���������� �� ������� ���� IT School Samsung. �� �������?(y/n)");	
    String resp=scan.next();
    if (resp.equals("y")) {
    	man.communication+=10;
    	  System.out.println(man.toString());
    	inITSchool=true;
    	System.out.print("�� ������ ���� � ��������� � IT �����\n�� ������� 3 �����. ");
    	
    }else {
    	System.out.println("�� �������� ���� � ���������� ����");
    	  System.out.println(man.toString());
    }
    System.out.println("��� ������� ������, �� ��� ����� ������� ��. �� ������� ������?(y/n)");
	 resp=scan.next();
     if (resp.equals("n")) {
     	man.IQ+=25;
     }
    System.out.println(man.toString());
    if (inITSchool) {
    	System.out.println("������ 1 ��� �� ��������� IT �����");
    	man.IQ+=75;
    	man.communication+=90;
    	 System.out.println(man.toString());
    }
	} 

}

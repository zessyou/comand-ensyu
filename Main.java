import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    System.out.print("�E�g��(m)����͂��Ă��������F");
    double height = sc.nextDouble(); 
    System.out.print("�E�̏d(Kg)����͂��Ă��������F");
    double weight = sc.nextDouble(); 

   
    double bmi = weight / (height*height);
    System.out.println("BMI�l��"+bmi+"�ł��B");
    
  }
}

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    System.out.print("・身長(m)を入力してください：");
    double height = sc.nextDouble(); 
    System.out.print("・体重(Kg)を入力してください：");
    double weight = sc.nextDouble(); 

   
    double bmi = weight / (height*height);
    System.out.println("BMI値は"+bmi+"です。");
    
   System.out.print("・身長(m)を入力してください：");
    double hei = sc.nextDouble();
    System.out.print("・体重(Kg)を入力してください：");
    double wei = sc.nextDouble();


    double b = wei / (hei*hei);
    System.out.println("BMI値は"+b+"です。");
  }
}

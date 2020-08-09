
import java.util.Scanner;

public class Calculator {

    Scanner sc = new Scanner(System.in);
    private int operation;
    private int num1;
    private int num2;
    private int result;

    public void calculator(){
        System.out.println("Выберите операцию: \n 1. Сложение \n 2. Вычитание \n 3. Умножение \n 4. Деление \n");
        operation = sc.nextInt();
        getNum();
        System.out.println("Результат " + calc());
        


    }
    public void getNum(){
        System.out.println("Введите первое число");
        num1 = sc.nextInt();

        System.out.println("Введите второе число");
        num2 = sc.nextInt();
      
    }
    private int calc(){

        if (operation == 1){
            result = num1 + num2;
        }
        if (operation == 2){
            result = num1 - num2;
        }
        if (operation == 3){
            result = num1 * num2;
        }
        if (operation == 4){
            result = num1 / num2;
        }
        return result;
    }
}

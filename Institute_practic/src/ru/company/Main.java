package ru.company;

public class Main {
    public static void  main(String[] arg){
        Test test = new Test();
        test.task1(1000);
        task2(100);
        task2(4000000);
        task3(1000);
    }

    public  static  void  task2(int max_number){
        int sum_number = 0;
        int first_number = 1;
        int second_number = 1;
        while (first_number<= max_number){

            if((first_number%2)==0){
                sum_number+=first_number;
            }
            if((second_number%2==0) && (second_number<=max_number)){
                sum_number+=second_number;
            }
            System.out.print(first_number+"|"+second_number+"|");
            first_number+=second_number;
            second_number+=first_number;
        }
        System.out.println(" ");
        System.out.println("Сумма четных членов рядя Фиббоначи = "+sum_number);
        System.out.println("Где значение членов ряда не превышают = "+max_number);
        System.out.println("______________");
    }
    public static void task3(int limit_number_task3){
        int sum_number_task3 = 0;
        for (int natural_number = 0; natural_number < limit_number_task3;natural_number++) {
            if (natural_number % 3 == 0 || natural_number % 5 == 0) {
                sum_number_task3 += natural_number;
            }
        }
        System.out.println("Суммы чисел кратных 3 и 5 = "+sum_number_task3+"  Где чисто ряда не превышает "+ limit_number_task3);
        System.out.println("______________");
    }
}
class Test
{
    public void task1(int limit_number){
        int sum = 0;
        for (int natural_number = 0; natural_number < limit_number;natural_number++) {
            if (natural_number % 3 == 0 || natural_number % 5 == 0) {
                sum += natural_number;
            }
        }
        System.out.println("Суммы чисел кратных 3 и 5 = "+sum+"  Где чисто ряда не превышает "+ limit_number);
        System.out.println("______________");
    }

}


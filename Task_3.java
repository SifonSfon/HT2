import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float contribution =in.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        int months= in.nextInt();
        for (int i = 1; i<=months;i++){
            contribution=contribution+contribution/100*7;
        }
        System.out.println("Сумма вашего вклада за "+months+" месяцев будет составлять "+contribution);
    }
}

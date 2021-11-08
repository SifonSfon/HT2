import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean exit=false;

        for (;;) {
            System.out.print("Введите первое число: ");
            int one = in.nextInt();
            System.out.print("Введите второе число: ");
            int two = in.nextInt();
            System.out.println("Результат= " + one * two);
            System.out.println("Если хотите продолжить введите 1, иначе введите другое число");
            int cont = in.nextInt();
            if (cont==1){
                break;
            }

        }
    }
}

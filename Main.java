import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        int n; //количество этажей
        do{ //запрос пользователя натурального числа до 23 включительно
            System.out.println("Height: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            //n = GetInt();
        }while(n<0 || n>23);

        for(int i=0; i<n; i++){  //рисуем ступени
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i+2; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
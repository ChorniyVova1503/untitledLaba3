import java.util.Scanner;

public abstract class Main {


    public static void main(String[] args) {

      Scanner scn = new Scanner(System.in);

        System.out.println("Выберите вариант задачи");

        System.out.println("1 - ferma");
        System.out.println("2 - virajeniya");
        int vvod =scn.nextInt();
        switch(vvod){
            case 1:
                 ferma();
                 break;
            case 2:
                 virajeniya();
             break;

        }
        }

    private static void virajeniya() {
        int k=0;
        for(int i = 1;i<10000;i++) {
            if(i%2==0)
                k-=1/i;
            else
                k+= 1/i;

        }
        System.out.println("Вираз дорівнює = "+k);
    }

    private static void ferma() {
        double a2 = 0;
        double b2 = 0;
        double c2 = 0;
        double k = 0;


        for (int a = 1; a < 101; a++) {
            a2 = a * a;
            for (int b = 1; b < 101; b++) {
                b2 = b * b;
                for (int c = 1; c < 101; c++) {
                    c2 = c * c;
                    k = a2 + b2;
                    if (k == c2)
                        System.out.println("verno:" + a + ", " + b + ", " + c);
                }


            }
        }
    }




}



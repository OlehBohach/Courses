package courses.lab2example;

public class Lab2Example {
    public static void main(String[] args) {
        //пример if
        int v = 9;
        int k = 5;
        if(v>k){
            System.out.println("v больше k");
        }
        else {
            System.out.println("v не больше k");
        }

        //пример case
        int selector = 2;
        switch (selector){
            case  1 : System.out.println("First"); break;
            case  2 : System.out.println("Second"); break;
            case  3 : System.out.println("Third"); break;
            default: System.out.println("Nothing");
        }

        //пример while
        int v2= 4;
        while(v2 > 1){
            System.out.print(" v2 > 1");
            v2--;
        }
        System.out.print ("Выйти из цикла");

        //пример do while
        do{
            System.out.print ("Выполнение");
        }
        while( false);

        //Пример for
        int endPoint = 5;
        int show = 0;
        for (int counter =0; counter < endPoint; counter ++ ){
            show = show +1;
        }
        for (int counter =0, counter2 = 1; counter < endPoint; counter ++ ){
            counter2++;
            show = show +1;
        }

        //Пример for each
        int testArray[] = {5,6,7,8};
        for(int number: testArray){
            System.out.println(number);
        }

    }
}

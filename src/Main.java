import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Homework8 //task1.1");
        //task1.1
        int [] time = new int[3];
        time[0]=1;
        System.out.println(time[0]);
        time[1]=2;
        System.out.println(time[1]);
        time[2]=3;
        System.out.println(time[2]);

        System.out.println(" ");
        System.out.println("Homework8 //task1.2 ");
        //task1.2
        double [] apple = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(apple));
        System.out.println(apple.length);


        System.out.println(" ");
        System.out.println("Homework8 //task1.3");
        //task1.3
        int [] cats = new int[4];
        cats[0]= 1;
        System.out.println(cats[0]);
        cats[1]=2;
        System.out.println(cats[1]);
        cats[2]=3;
        System.out.println(cats[2]);
        cats[3]=4;
        System.out.println(cats[3]);

        System.out.println(" ");
        System.out.println("Homework8 //task2");
        //task2
        System.out.println(time[0]+","+time[1]+","+time[2]);
        System.out.println(apple[0]+","+apple[1]+","+apple[2]);
        System.out.println(cats[0]+","+cats[1]+","+cats[2]+","+cats[3]);

        System.out.println(" ");
        System.out.println("Homework8 //task3");
        //task3
        System.out.println( time[2]+","+time[1]+","+time[0]);
        System.out.println(apple[2]+","+apple[1]+","+apple[0]);
        System.out.println(cats[3]+","+cats[2]+","+cats[1]+","+cats[0]);


        System.out.println(" ");
        System.out.println("Homework8 //task4");
        //task4
        int [] time1 = new int[3];
        time1[0]=1;
        time1[1]=2;
        time1[2]=3;
        System.out.println(Arrays.toString(time1));
        for (int i =0;i<3;i++){
            if (i%2==0){
                System.out.println(i);
            }
            else {
                System.out.println(i+1);
            }
        }















        }


















    }

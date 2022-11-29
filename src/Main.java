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
        float [] apple = {1.57f, 7.654f, 9.986f};
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
        int [] time1 = new int[3];
        time1[0]=1;
        time1[1]=2;
        time1[2]=3;
        for (int i =0;i<time1.length;i++){
            if(i==time1.length-1){
                System.out.print(time1[i]);
            } else {
                System.out.print(time1[i]+",");
            }
        }
        System.out.println(" ");
        float [] apple1 = {1.57f, 7.654f, 9.986f};
        for (int i =0;i<apple1.length;i++){
            if(i==apple1.length-1){
                System.out.print(apple1[i]);
            }else {
                System.out.print(apple1[i]+",");
            }
        }
        System.out.println(" ");
        int [] cats1 = new int[4];
        cats1[0]= 1;
        cats1[1]=2;
        cats1[2]=3;
        cats1[3]=4;
        for (int i=0;i<cats1.length;i++){
            if (i==cats1.length-1){
                System.out.print(cats1[i]);
            }else {
                System.out.print(cats1[i]+",");
            }
        }
        System.out.println(" ");
        System.out.println("Homework8 //task3");
        //task3
        int [] time2 = new int[3];
        time2[0]=1;
        time2[1]=2;
        time2[2]=3;
        for (int i = time2.length-1;i>=0;i--){
            if (i!=0){
                System.out.print(time2[i]+",");
            }else {
                System.out.print(time2[i]);
            }
        }
        System.out.println(" ");
        float [] apple2 = {1.57f, 7.654f, 9.986f};
        for (int i = apple2.length-1;i>=0;i--){
            if(i!=0){
                System.out.print(apple2[i]+",");
            }else {
                System.out.print(apple2[i]);
            }
        }
        System.out.println(" ");
        int [] cats2 = new int[4];
        cats2[0]= 1;
        cats2[1]=2;
        cats2[2]=3;
        cats2[3]=4;
        for (int i = cats2.length-1;i>=0;i--){
            if (i!=0){
                System.out.print(cats2[i]+",");
            }else {
                System.out.print(cats2[i]);
            }
        }

        System.out.println(" ");
        System.out.println("Homework8 //task4");
        //task4
        int [] time3 = new int[3];
        time3[0]=1;
        time3[1]=2;
        time3[2]=3;
        for (int i =0;i<time3.length+1;i++){
            if (i%2==0){
                System.out.println(i);
            }
            else {
                System.out.println(i+1);
            }
        }















        }


















    }

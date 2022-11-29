
public class Main {
    public static void main(String[] args) {

        System.out.println("//Homework8 //task1.1 //task2 //task3 //task4");
        // task1.1
        int [] time = new int[3];
        time[0]=1;
        time[1]=2;
        time[2]=3;

        //task2
        for (int i =0;i<time.length;i++){
            if(i==time.length-1){
                System.out.print(time[i]);
            } else {
                System.out.print(time[i]+",");
            }
        }System.out.println(" ");


        //task3
        for (int i = time.length-1;i>=0;i--){
            if (i!=0){
                System.out.print(time[i]+",");
            }else {
                System.out.print(time[i]);
            }
        }System.out.println(" ");
        System.out.println(" ");


        //task4
        for (int i =0;i<time.length;i++){
            if(i%2!=0){
                System.out.println(time[i]);
            }else {
                System.out.println(time[i]+1);
            }
        }System.out.println(" ");



        System.out.println("Homework8 //task1.2 //task2 //task3 ");
        //task1.2
        float [] apple = {1.57f, 7.654f, 9.986f};

        //task2
        for (int i =0;i<apple.length;i++){
            if(i==apple.length-1){
                System.out.print(apple[i]);
            }else {
                System.out.print(apple[i]+",");
            }
        }System.out.println(" ");


        //task3
        for (int i = apple.length-1;i>=0;i--){
            if(i!=0){
                System.out.print(apple[i]+",");
            }else {
                System.out.print(apple[i]);
            }
        }System.out.println(" ");


        System.out.println("Homework8 //task1.3 //task2 //task3 ");
        //task1.3
        int [] cats = new int[4];
        cats[0]= 1;
        cats[1]=2;
        cats[2]=3;
        cats[3]=4;

        //task2
        for (int i=0;i<cats.length;i++){
            if (i==cats.length-1){
                System.out.print(cats[i]);
            }else {
                System.out.print(cats[i]+",");
            }
        }System.out.println(" ");


        //task3
        for (int i = cats.length-1;i>=0;i--){
            if (i!=0){
                System.out.print(cats[i]+",");
            }else {
                System.out.print(cats[i]);
            }
        }


        }

    }

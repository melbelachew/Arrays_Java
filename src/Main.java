import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        int[] arrayOfInts = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        //part one
        for(int i = 0; i< 10; i++) {

  System.out.println("index of " + arrayOfInts[i] + " is " + i);
            sum = sum + arrayOfInts[i];
        }
        //part two
        System.out.println(sum);

        //part three & four

        int [] userArray = new int[10];
        double sum1 = 0;
        for(int i = 0; i<10; i++ ){
            Scanner key = new Scanner(System.in);
            System.out.println("Enter a number");
            int userInput = key.nextInt();
            userArray[i]=userInput;
            sum1 = sum1+userArray[i];


        }
        System.out.println(sum1);
        System.out.println(sum1/userArray.length);

     // part five

        String [] names = new String[]{"mel", "alex", "leo"};
        names[0]=names[0].replace("mel", "Melo");
        System.out.println(names[0]);

        //part

        int [] array1 = new int[]{1,7,6,5,9};
        int [] array2 = new int[]{2,7,6,3,4};
        for (int i = 0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++){
                if(array1[i]==array2[j]){
                    System.out.println(array1[i] + " , " + array2[j]);
                }
            }
        }

    }
}

// import java.util.*;

// public class loop{
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value: ");
//         int n = sc.nextInt();
//         int counter = 1;
//         int sum=0;

//         while(counter <= n){
//             sum = sum + counter;
//             counter++;
//         }
//         System.out.println(sum);
//         System.out.println("\nLoop Ends");

//     }
// }

// import java.util.*;

// public class loop{
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int row=1; row<=n; row++){
//             for(int col=1; col<=n; col++){
//                 System.out.print("*" + "    ");
//             }
//             System.out.println("\n");
//         }
//     }
// }

// import java.util.*;

// public class loop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         // while(n>0){
//         //     int lastDigit = n%10;
//         //     System.out.print(lastDigit + " ");
//         //     n = n/10;
//         // }

//         for(int i=0; n>i;){
//             int lastDigit = n%10;
//             System.out.print(lastDigit + " ");
//             n = n/10;
//         }
//     }
// }

// import java.util.*;

// public class loop{

//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int counter = 1;
//         do{
//             System.out.println("Hello World");
//             counter++;

//         }while(counter<=n);  

//     }
// }

// import java.util.*;

// public class loop{
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);

//         // for (int i=0; i < n; i++) {

//         //     if (n%10==0) {
//             //         System.out.println("End Loop");
//             //         break;
//         //     }
//         //     System.out.println(n);
//         //     i = i + n;
//         // }

//         do{
//             System.out.print("Enter no.: ");
//             int n = sc.nextInt();

//             if (n%10==0) {
//                 System.out.println("End Loop");
//                 break;
//             }

//             System.out.println(n);

//         }while(true);
//     }
// }

// import java.util.*;

// public class loop{
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter no. : ");
//         int enter_number = sc.nextInt();
//         int sum_of_even = 0;
//         int sum_of_odd = 0;
//         int i=0;
//         // sc.close();

//     //     for(int i=0; i<enter_number; i++){
//     //         int all_numbers = sc.nextInt();

//     //         if(all_numbers%2==0){
//     //             sum_of_even = sum_of_even + all_numbers;
//     //         }else{
//     //             sum_of_odd = sum_of_odd + all_numbers;
//     //         }
//     //     }

//     //     System.out.print("Sum of Even: " + sum_of_even);
//     //     System.out.print("\n" + "Sum of Odd: " + sum_of_odd);
//     // }

//         do{
//             int all_numbers = sc.nextInt();

//             if(all_numbers%2==0){
//                 sum_of_even = sum_of_even + all_numbers;
//             }else{
//                 sum_of_odd = sum_of_odd + all_numbers;
//             }

//             i++;

//         }while(i<enter_number);

//         System.out.print("Sum of Even: " + sum_of_even);
//         System.out.print("\n" + "Sum of Odd: " + sum_of_odd);

//     }
// }

// import java.util.*;

// public class loop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         for(;;){
//             System.out.print("Enter the no.: ");
//             int num = sc.nextInt();
//             if((num-1)%2==0 && num != 3){
//                 if(num%3==0){
//                     System.out.println("No. is NOT Prime");
//                 }else{
//                     System.out.println("No. is Prime");
//                 }
//             }else{
//                 if (num == 2 || num == 3) {
//                     System.out.println("No. is Prime");
//                 }else{
//                     System.out.println("No. is NOT Prime");
//                 }
//             }
//         }
//     }
// }

import java.io.*;
import java.util.*;

public class loop {

  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);

        s = s.getClass().getSimpleName();        

        if((String)(s) == s.getClass().getSimpleName()){
        
            System.out.println("Good Job");
        }else{
            System.out.println("Wrong answer");
        }

       
    }
}

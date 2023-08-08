package DSA;

public class Main {

        public static void main(String[] args) {
            int[] arr = {1,9,3,8,5,6,7};
            System.out.println("Elements at even index are: ");
            even(arr);
            System.out.println("Odd elements are: ");
            odd(arr);
            System.out.println("First element: " + arr[0]);
            System.out.println("Last element: " + arr[arr.length-1]);

            for (int i = arr.length-1; i>=0; i--) {
                System.out.println(arr[i]);}
        }
        static int even(int arr[]){
            for (int i = 0; i < arr.length; i+=2) {
                System.out.println(arr[i]);
            }
            return 0;
        }
        static void odd(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                if(i%2!=0){
                    System.out.println(i);
                }

            }
        }

    }


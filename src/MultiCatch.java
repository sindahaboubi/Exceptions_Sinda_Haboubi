//Demonstrate multiple catch statements.

class MultiCatch {
 public static void main(String args[]) {
     try {
         int a = args.length;
         System.out.println("No Of Arguments = " + a);
         int b = 42 / a;  

         int c[] = {1};
         c[42] = 99;   
     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Array index is out of bounds exception.");
     } catch (ArithmeticException e) {
         System.out.println("Divide by 0 exception.");
     }
 }
}





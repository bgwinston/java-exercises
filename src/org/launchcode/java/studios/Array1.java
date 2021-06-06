package org.launchcode.java.studios;

public class Array1 {
    public static void myList(){
        int[] ray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int count = 0;
        for (int i = 0; i < ray1.length; i++) {
            if (i / 2 != 0) {
                count = count + 1;
            }
        }

        System.out.println(count);
    }
         public static void main(String[] args) {
             myList();
    }
}

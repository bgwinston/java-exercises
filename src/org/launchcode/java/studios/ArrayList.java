package org.launchcode.java.studios;


public class ArrayList {
    public static void myList() {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};   //array
        int counter = 0;                                  //counter to keep count
        for (int i = 0; i < num.length; i++) {       //for look to go through array
            if (i % 2 == 0) {               //if i/2 is 0 that means it is even
                counter = counter + i;   //variable counter is added to i
            }
        }
        System.out.println(counter);  //print counter amount
    }

        public static void main(String[] args) {    //Method
            myList();
        }
    }


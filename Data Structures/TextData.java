/*
 * Programming Queue Assignment
 * Program To Recieve Text Based Data
 *
 * @Team Name: Carrots
 * >>Constanza Cabrera ID 1045549
 * >>Hasib Ansari ID 1080351
 * >>Joshua Folarin ID 0874110
 *
 * @date (02.28.2017)
 */

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.*;

public class TextData {
    public static int c;
        public static void main(String[] args) {

        Queue myQueue = new LinkedList();

        System.out.println("This is a program created to recieve text based data and add it to a queue: ");
        System.out.println("----------------------------------------");

        Scanner scan = new Scanner(System.in);
        int n = 1;
        for (int b = 0; b <= n-1; b += 1 )
        {
            System.out.println("How many text based items will you add to the queue?");
            c = scan.nextInt();
            System.out.println("Please enter the text based items below: ");
            for (int d = 1; d <= c; d += 1)
            {
                String textItem = scan.next();
                myQueue.add(textItem);
            }
        }

        System.out.println("Your text based queue now contains the following: ");
        System.out.println(myQueue);
    }
}
//THIS PROGRAM PREPARED BY AUM VEKARIYA 21ce150

import java.io.File; // Import the File class
import java.io.IOException; // Import the IOException class to handle errors
import java.util.*; //used to import scanner

public class p13 {
    public static void sortArray(String[] student, int k) {
        // bubble sort algorithm is used to sort
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - i - 1; j++) {

                if (student[j].compareTo(student[j + 1]) > 0) {
                    String temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }
        // print the student array in ascending order
        for (int i = 0; i < k; i++) {
            System.out.println(student[i]);
        }
    }

    public static void main(String[] args) {
        String student[] = new String[500];
        int counter = 0;
        try {
            // loop to read all the file names given as command line arguments
            for (int i = 0; i < args.length; i++) {
                // file class object to read the open the file
                File file = new File(args[i]);
                // scanner object to read the file
                Scanner scnr = new Scanner(file);
                while (scnr.hasNextLine()) {
                    // reads one line
                    String line = scnr.nextLine();
                    int flag = 0;
                    for (int j = 0; j < counter; j++) {
                        if (line.compareTo(student[j]) == 0) {
                            flag = 1;
                            break;
                        }
                    }
                    // if flag==0.. the name has appeared first time in the list
                    if (flag == 0) {
                        student[counter] = line;
                        counter++;
                    }
                }
            }
            System.out.println("the list of students in ascending order:");
            // call the sortArray() to sort the student array and print it
            sortArray(student, counter);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class EricDiCarlo_02 {

   public static void main(String[] args) {
   
      private Student student1;
      private Student student2;
      
      private GradeItem gradeItem1;
      private GradeItem gradeItem2;
      
      private final String INPUT_FILENAME = "Project_02_Input01.txt";
   
      
      
      System.out.println("Running Test 1a:");
      System.out.println("Running Test 1b:");
      GradeItem1 = new GradeItem("900123456", 1, "23456", "HW", "20190112", 100, 95);
      System.out.println(GradeItem1.toString());
      
      System.out.println("*******************************************************************");
      
      System.out.println("Running Test 2a:");
      System.out.println("Running Test 2b:");
      
      System.out.println("*******************************************************************");
      
      System.out.println("Running Test 3a:");
      System.out.println("Running Test 3b:");
   
   
   
   }
   
   public static void proccessStudentData(String[] data) {
      // STUB STUB STUB
   }
   
   public static void proccessGradeItemData(String[] data) {
      if(!data[0].equals("GRADE ITEM") || !data[1].equals("ADD")) {
         throw new IllegalArgumentException("This function is only meant to add new Grade Items." +
                                            " Please try again with the correct file input.");
      }
      
      GradeItem1 = new GradeItem(data[0], data[1], data[2], data[3],
                                 data[4], data[5], data[6]);
   }
}
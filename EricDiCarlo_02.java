import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class EricDiCarlo_02 {

   private static Student student1;
   private static Student student2;
      
   private static GradeItem gradeItem1;
   private static GradeItem gradeItem2;
   

   public static void main(String[] args) {   
   
      final String INPUT_FILENAME = "Project_02_Input01.txt";
      
      System.out.println("Running Test 1a:");
      System.out.println("Running Test 1b:");
      gradeItem1 = new GradeItem("900123456", "1", "23456", "HW", "20190112", "100", "95");
      System.out.println(gradeItem1.toString());
      
      System.out.println("\n*******************************************************************\n");
      
      System.out.println("Running Test 2a:");
      System.out.println("Running Test 2b:");
      
      
      System.out.println("\n*******************************************************************\n");
      
      System.out.println("Running Test 3a:");
      System.out.println("Running Test 3b:");
      /*
      if (gradeItem1.equals(gradeItem2)) {
         System.out.println("GradeItem objects are equal: Student IDs are" + GradeItem1.id);
      }
      else {
         System.out.println("GradeItem objects are unequal: Student IDs are " + GradeItem1.id +
                            " and " + GradeItem2.id);
      }   
      */
   }
   
   public static void proccessStudentData(String[] data) {
      // STUB STUB STUB
   }
   
   public static void proccessGradeItemData(GradeItem grade, String[] data) {    
      grade = new GradeItem(data[3], data[2], data[4], data[5], data[6], data[7], data[8]);
   }
}
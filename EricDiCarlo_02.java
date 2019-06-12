import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class EricDiCarlo_02 {

   private static Student student1;
   private static Student student2;
      
   private static GradeItem gradeItem1;
   private static GradeItem gradeItem2;
   

   public static void main(String[] args) throws FileNotFoundException{   
   
      final String INPUT_FILENAME = "Project_02_Input01.txt";
      final String INPUT_FILENAME2 = "Project_02_Input02.txt";
      
      String[] tempArray;
      
      File inputFileOne = new File(INPUT_FILENAME);
      Scanner inputOne = new Scanner(inputFileOne);
      
      System.out.println("Running Test 1a:");
      student1 = new Student("900123456", "Joe", "Doe", "joedoe@msudenver.edu");
      System.out.println("Student{" + student1.toString() + "}\n");
      
      System.out.println("Running Test 1b:");
      gradeItem1 = new GradeItem("900123456", "1", "23456", "HW", "20190112", "100", "95");
      System.out.println("Grade Item{" + gradeItem1.toString() + "}");
      
      
      System.out.println("\n*******************************************************************\n");
      
      System.out.println("Running Test 2a:");
      String tempString = inputOne.nextLine();
      tempArray = tempString.split(",");
      processStudentData(tempArray);
      
      System.out.println("Student Object Data");
      System.out.println(student1.getID());
      System.out.println(student1.getFirstName());
      System.out.println(student1.getLastName());
      System.out.println(student1.getEmail() + "\n");
      
      
      System.out.println("Running Test 2b:");
      tempString = inputOne.nextLine();
      tempArray = tempString.split(",");
      processGradeItemData(tempArray);
      
      System.out.println("GradeItem Data");
      System.out.println(gradeItem1.getGradeItemID());
      System.out.println(gradeItem1.getID());
      System.out.println(gradeItem1.getCourseID());
      System.out.println(gradeItem1.getItemType());
      System.out.println(gradeItem1.getDate());
      System.out.println(gradeItem1.getMaxScore());
      System.out.println(gradeItem1.getActualScore());
      
      
      
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
   
   public static void processStudentData(String[] data) {
      if(!data[0].equals("STUDENT")) {
         throw new IllegalArgumentException("The data provided was incompatible with the Student type.");
      }
      if(!data[1].equals("ADD")) {
         throw new IllegalArgumentException("This function is only able to ADD data, not remove it.");
      }
      try {
         student1 = new Student(data[2], data[3], data[4], data[5]);
      }
      catch (IllegalArgumentException e) {
         System.err.println(e);
      }
   }
   
   public static void processGradeItemData(String[] data) {
      if(!data[0].equals("GRADE ITEM")) {
         throw new IllegalArgumentException("The data provided was incompatible with the Grade Item type.");
      }
      if(!data[1].equals("ADD")) {
         throw new IllegalArgumentException("This function is only able to ADD data, not remove it.");
      }
      try {
         gradeItem1 = new GradeItem(data[3], data[2], data[4], data[5], data[6], data[7], data[8]);
      }
      catch (IllegalArgumentException e) {
         System.err.println(e);
      }
   }
}
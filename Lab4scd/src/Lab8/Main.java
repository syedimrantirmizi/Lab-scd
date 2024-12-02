package lab8;

public class Main {
    public static void main(String[] args) {
        // Create a failed student (immutable object)
        FailedStudent failedStudent = new FailedStudent(101, "CS101", "Computer Science");
        System.out.println("Failed Student: " + failedStudent);
        
        // Attempting to modify the failed student's data would cause a compilation error
        // failedStudent.setRollNumber(102); // Error: cannot find symbol
        
        // Create a promoted student (mutable object)
        PromotedStudent promotedStudent = new PromotedStudent(102, "CS101", "Computer Science");
        System.out.println("Promoted Student: " + promotedStudent);

        // Modify the promoted student's data
        promotedStudent.setRollNumber(103);
        promotedStudent.setSubjectCode("CS102");
        promotedStudent.setSubjectName("Computer Science");
        System.out.println("Updated Promoted Student: " + promotedStudent);
    }
}


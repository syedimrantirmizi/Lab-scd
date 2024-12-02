package lab8;

//Immutable class for Failed Student
public final class FailedStudent {
 private final int rollNumber;
 private final String subjectCode;
 private final String subjectName;

 // Constructor to initialize the object
 public FailedStudent(int rollNumber, String subjectCode, String subjectName) {
     this.rollNumber = rollNumber;
     this.subjectCode = subjectCode;
     this.subjectName = subjectName;
 }

 // Getter methods to access the values
 public int getRollNumber() {
     return rollNumber;
 }

 public String getSubjectCode() {
     return subjectCode;
 }

 public String getSubjectName() {
     return subjectName;
 }

 // String representation of the student object
 @Override
 public String toString() {
     return "Roll Number: " + rollNumber + ", Subject Code: " + subjectCode + ", Subject Name: " + subjectName;
 }
}

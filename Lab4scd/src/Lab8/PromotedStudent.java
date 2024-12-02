package lab8;

//Mutable class for Promoted Student
public class PromotedStudent {
 private int rollNumber;
 private String subjectCode;
 private String subjectName;

 // Constructor to initialize the object
 public PromotedStudent(int rollNumber, String subjectCode, String subjectName) {
     this.rollNumber = rollNumber;
     this.subjectCode = subjectCode;
     this.subjectName = subjectName;
 }

 // Setter methods to modify the values after creation
 public void setRollNumber(int rollNumber) {
     this.rollNumber = rollNumber;
 }

 public void setSubjectCode(String subjectCode) {
     this.subjectCode = subjectCode;
 }

 public void setSubjectName(String subjectName) {
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
import javax.swing.JOptionPane;

public class Studentgradecalculator {
    public static void main(String[] args) {
        // Subjects
        String[] subjects = {"English", "Kannada", "Maths", "Science", "Social"};
        int numberOfSubjects = subjects.length;
        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;

        // Input marks for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            String input = JOptionPane.showInputDialog(null, "Enter marks for " + subjects[i] + " (out of 100):");
            marks[i] = Integer.parseInt(input);
            totalMarks += marks[i];
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        // Determine grade
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Create a message with the results
        StringBuilder message = new StringBuilder();
        message.append("Total Marks: ").append(totalMarks).append("\n")
               .append("Average Percentage: ").append(averagePercentage).append("%\n")
               .append("Grade: ").append(grade).append("\n\n")
               .append("Subject Details:\n");

        for (int i = 0; i < numberOfSubjects; i++) {
            message.append(subjects[i]).append(": ").append(marks[i]).append("\n");
        }

        // Display the message in a dialog box
        JOptionPane.showMessageDialog(null, message.toString());
    }
}
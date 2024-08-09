public class GradingSystem {
    public static void main(String[] args) {
        // Grading system
        // A - 90  B - 70 C - 50 D- 35 retake - 34 - 0
        int gradeScored = 100;

        if(gradeScored >= 0 && gradeScored <50){
            System.out.println("You failed");
        }else if(gradeScored >= 50 && gradeScored <= 70){
            System.out.println("Scored grade if C");
        } else if (gradeScored > 70 && gradeScored <90) {
            System.out.println("Scored: B");
        }else if(gradeScored > 90 && gradeScored <= 100){
            System.out.println("Scored: A");
        }else {
            System.out.println("Enter correct score...");
        }
    }
}

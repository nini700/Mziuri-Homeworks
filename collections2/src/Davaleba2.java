public class Davaleba2 {
    public static void main(String[] args) {
        Student student1 = new Student("001", "nini", "badridze");

        // ქართული
        student1.addGrade("qartuli", 9);
        student1.addGrade("qartuli", 8);
        student1.addGrade("qartuli", 10);
        student1.addGrade("qartuli", 9);

        // მათემატიკა
        student1.addGrade("matematika", 10);
        student1.addGrade("matematika", 9);
        student1.addGrade("matematika", 10);

        // ინგლისური
        student1.addGrade("inglisuri", 8);
        student1.addGrade("inglisuri", 7);
        student1.addGrade("inglisuri", 8);

        System.out.println(student1);
        System.out.println("sashualo qula: " + String.format("%.2f", student1.getAverageGrade()));

        System.out.println("\nyvela qula sagnebis mixedvit:");
        for (String subject : student1.getGrades().keySet()) {
            System.out.println(subject + " = " + student1.getGrades().get(subject));
        }
    }
}
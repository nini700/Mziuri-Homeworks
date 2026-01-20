package savarjisho1;

public class University {
    private String name;
    private boolean isPublic;
    private int numberOfFaculties;

    public University(String name, boolean isPublic, int numberOfFaculties) {
        this.name = name;
        this.isPublic = isPublic;
        this.numberOfFaculties = numberOfFaculties;
    }

    public void printInfo() {
        System.out.println(" უნივერსიტეტის ინფორმაცია");
        System.out.println("დასახელება: " + name);
        System.out.println("სტატუსი: " + (isPublic ? "სახელმწიფო" : "კერძო"));
        System.out.println("ფაკულტეტების რაოდენობა: " + numberOfFaculties);
    }

    public class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String personalNumber;
        private double averageGrade;
        private int course;

        public Student(String firstName, String lastName, int age,
                       String personalNumber, double averageGrade, int course) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.personalNumber = personalNumber;
            this.averageGrade = averageGrade;
            this.course = course;
        }

        public void printInfo() {
            System.out.println("\n სტუდენტის ინფორმაცია");
            System.out.println("სახელი: " + firstName);
            System.out.println("გვარი: " + lastName);
            System.out.println("ასაკი: " + age);
            System.out.println("პირადი ნომერი: " + personalNumber);
            System.out.println("საშუალო ქულა: " + averageGrade);
            System.out.println("კურსი: " + course);
            System.out.println("უნივერსიტეტი: " + University.this.name);
        }
    }
}
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Educationcenter educationcenter = new College("Peaksoft", "Гражданская 119", LocalDate.of(2020, 11, 16));
        Student student = new Student("Kanykei ", "Akjoltoi kyzy", "Female", LocalDate.of(2022, 8, 22), educationcenter);
        Student student1 = new Student("Madina ", "Halikova", "Female", LocalDate.of(2022, 8, 28), educationcenter);
        Student student2 = new Student("Khafiz ", "Turusbek uulu", "Male", LocalDate.of(2022, 10, 3), educationcenter);
        Student student3 = new Student("Tursunai ", "Arzykulova", "Female", LocalDate.of(2021, 4, 7), educationcenter);

        Educationcenter educationcenter1 = new University("Manas", "Aitmatova", LocalDate.of(1995, 3, 19));
        Student student4 = new Student("Oksana ", "Saidilkanova", "Famele", LocalDate.of(2016, 6, 8), educationcenter1);
        Student student5 = new Student("Samat ", "Chegirov", "Male", LocalDate.of(2015, 3, 1), educationcenter1);
        Student student6 = new Student("Symbat ", "Rakibova", "Famele", LocalDate.of(2011, 9, 6), educationcenter1);

        Educationcenter educationcenter2 = new School("Lenin", "Kulundu", LocalDate.of(1987, 7, 13));
        Student student7 = new Student("Sanjar ", "Abdymomunov ", "Male", LocalDate.of(2022, 9, 2), educationcenter2);
        Student student8 = new Student("Erbolot ", "Ashirali uulu", "Male", LocalDate.of(2013, 10, 3), educationcenter2);
        Student student9 = new Student("Кайрат ", "Нуридинов ", "Male", LocalDate.of(2011, 9, 3), educationcenter2);

        Student[] students = {student, student1, student2, student3, student4, student5, student6, student7, student8, student9};
        myMethod(students);
    }

    public static void myMethod(Student[] students) {
        for (Student s : students) {
            System.out.println(s.getName() +" "+ s.getSurName() +" "+ s.getEducationcenter() +" "+ Period.between(s.getDateOfStart(),LocalDate.now()).getYears());
        }
    }
}
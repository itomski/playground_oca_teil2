package de.lubowiecki;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Predicate;

public class PerdicateTest {

    public static void main(String[] args) {

        Student s = new Student("Bruce", "Parker", LocalDate.of(1999, 10, 5));

        // boolean test(T t);
        Predicate<Student> p1 = (student) -> student.getVorname().startsWith("P");
        Predicate<Student> p2 = (student) -> Period.between(student.getGeburtsdatum(), LocalDate.now()).getYears() > 15;
        Predicate<Student> p3 = p1.and(p2);

        if(checkStudent(s, p3)) {
            System.out.println("Du darfst rein!");
        }
        else {
            System.out.println("Du kommst hier nicht rein!");
        }
    }

    public static boolean checkStudent(Student s, Predicate<Student> checker) {
        return checker.test(s);
    }
}

class Student {

    private String vorname;
    private String nachname;

    private LocalDate geburtsdatum;

    public Student() {
    }

    public Student(String vorname, String nachname, LocalDate geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }
}

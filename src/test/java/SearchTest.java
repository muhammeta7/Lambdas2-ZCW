import static org.junit.Assert.*;

import javafx.scene.control.CheckBox;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SearchTest {

    SocialNetwork<Person> test;
    Person p1 = new Person("Moe", LocalDate.of(1990, Month.JANUARY, 27), Person.Sex.MALE, "moe@gmail.com");
    Person p2 = new Person("Kevin", LocalDate.of(1988, Month.AUGUST, 12), Person.Sex.MALE, "kevin@gmail.com");
    Person p3 = new Person("Han", LocalDate.of(2003, Month.JUNE, 12), Person.Sex.FEMALE, "hon@gmail.com");
    Person p4 = new Person("Sian", LocalDate.of(1951, Month.APRIL, 20), Person.Sex.MALE, "moe@gmail.com");

    @Before
    public void setup(){
        test = new SocialNetwork<>();
        test.addPerson(p1);
        test.addPerson(p2);
        test.addPerson(p3);
        test.addPerson(p4);
    }

    @Test
    public void printPersonOlderThan(){
        Search.printPersonsOlderThan(test, 60);
        String expected = "Person: Sian";

    }

    @Test
    public void printPersonsWithinAgeRangeTest(){
        Search.printPersonsWithinAgeRange(test, 25, 35);
        String expected = "Person: Moe";
    }

    @Test
    public void testTest(){
        Person person = new Person();
        Search.printPersons(test, person);
    }

    @Test
    public void anonymousClassTest(){
        Person person = new Person(){
            @Override
            public boolean test(Person p) {
                return p.getAge() <= 30;
            }
        };
        Search.printPersons(test, person);
    }

    @Test
    public void lamdaTest(){
        CheckPerson person = p -> p.getAge() < 18;
        Search.printPersons(test, person);
    }

}

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class SocialNetworkTest {

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
    public void testAddPerson(){
        int expected1 = 30;
        int expected2 = 31;
        int expected3 = 16;
        int expected4 = 68;
        assertEquals(expected1, p1.getAge());
        assertEquals(expected2, p2.getAge());
        assertEquals(expected3, p3.getAge());
        assertEquals(expected4, p4.getAge());
    }

}

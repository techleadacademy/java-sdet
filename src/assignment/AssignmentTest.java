package assignment;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssignmentTest {
	Assignment obj = new Assignment();

	@Test
	public void squirrelPlay() {
		assertEquals(obj.squirrelPlay(70, false), true);
		assertEquals(obj.squirrelPlay(95, false), false);
		assertEquals(obj.squirrelPlay(95, false), true);
		assertEquals(obj.squirrelPlay(100, true), true);
		assertEquals(obj.squirrelPlay(100, false), false);
		assertEquals(obj.squirrelPlay(105, true), false);
	}

	@Test
	public void caughtSpeeding() {
		assertEquals(obj.caughtSpeeding(65, true), 0);
		assertEquals(obj.caughtSpeeding(65, false), 1);
		assertEquals(obj.caughtSpeeding(60, false), 0);
		assertEquals(obj.caughtSpeeding(75, false), 1);
		assertEquals(obj.caughtSpeeding(75, true), 1);
		assertEquals(obj.caughtSpeeding(40, false), 0);
		assertEquals(obj.caughtSpeeding(40, true), 0);
		assertEquals(obj.caughtSpeeding(90, false), 2);
	}

	@Test
	public void sum() {
//		assertEquals(obj.sum(9.0, 9.0), 18.0);
//		assertEquals(obj.sum(1.5, 2.2), 3.7);
//		assertEquals(obj.sum(1.0, 1.0), 2.0);
	}

	@Test
	public void moreThen100() {
		assertEquals(obj.moreThen100(101), true);
		assertEquals(obj.moreThen100(1), false);
		assertEquals(obj.moreThen100(200), true);
		assertEquals(obj.moreThen100(-2), false);
	}

	@Test
	public void sortaSum() {
		assertEquals(obj.sortaSum(3, 4), 7);
		assertEquals(obj.sortaSum(5, 5), 20);
		assertEquals(obj.sortaSum(10, 9), 20);
		assertEquals(obj.sortaSum(9, 4), 20);
		assertEquals(obj.sortaSum(10, 11), 21);
		assertEquals(obj.sortaSum(20, 40), 60);
	}

	@Test
	public void range() {
		assertEquals(obj.range(24), true);
		assertEquals(obj.range(2), false);
		assertEquals(obj.range(20), true);
		assertEquals(obj.range(40), true);
		assertEquals(obj.range(4000000), false);
	}

	@Test
	public void rangeExcept() {
		assertEquals(obj.rangeExcept(24), true);
        assertEquals(obj.rangeExcept(2), false);
        assertEquals(obj.rangeExcept(20), true);
        assertEquals(obj.rangeExcept(40), true);
        assertEquals(obj.rangeExcept(4000000), false);
        assertEquals(obj.rangeExcept(7), true);
        assertEquals(obj.rangeExcept(13), true);
        assertEquals(obj.rangeExcept(44), true);
	}

	@Test
	public void makeUppercase() {
		assertEquals(obj.makeUppercase("Apple"), "APPLE");
		assertEquals(obj.makeUppercase("Hello"), "HELLO");
	}

	@Test
	public void makeLowerercase() {
		assertEquals(obj.makeLowerercase("Phone"), "phone");
		assertEquals(obj.makeLowerercase("Home"), "home");
	}

	@Test
	public void addTwoStrs() {
		assertEquals(obj.addTwoStrs("Phone", "Phone"), "PhonePhone");
		assertEquals(obj.addTwoStrs("Home", "1"), "Home1");
	}

	@Test
	public void getFirstLetter() {
		assertEquals(obj.getFirstLetter("Home"), "H");
		assertEquals(obj.getFirstLetter("Apple"), "A");
	}

	@Test
	public void isEven() {
		assertEquals(obj.isEven(2), true);
		assertEquals(obj.isEven(3), false);
		assertEquals(obj.isEven(8), true);
		assertEquals(obj.isEven(13), false);
		assertEquals(obj.isEven(27), false);
	}

	@Test
	public void isEvenLength() {
		assertEquals(obj.isEvenLength("27"), true);
		assertEquals(obj.isEvenLength("apple"), false);
		assertEquals(obj.isEvenLength("book"), true);
		assertEquals(obj.isEvenLength("hi"), true);
		assertEquals(obj.isEvenLength("h"), false);
	}

	@Test
	public void lastThree() {
		assertEquals(obj.lastThree("h"), "h");
		assertEquals(obj.lastThree("hello"), "llo");
		assertEquals(obj.lastThree("apple"), "ple");
		assertEquals(obj.lastThree("okidoki"), "oki");
	}

	@Test
	public void love6() {
		assertEquals(obj.love6(6, 4), true);
		assertEquals(obj.love6(4, 5), false);
		assertEquals(obj.love6(1, 5), true);
		assertEquals(obj.love6(1, 8), false);
		assertEquals(obj.love6(8, 2), true);
		assertEquals(obj.love6(0, 9), false);
	}

	@Test
	public void dayOfWeek() {
		assertEquals(obj.dayOfWeek(1), "Monday");
		assertEquals(obj.dayOfWeek(2), "Tuesday");
		assertEquals(obj.dayOfWeek(3), "Wednesday");
		assertEquals(obj.dayOfWeek(4), "Thursday");
		assertEquals(obj.dayOfWeek(5), "Friday");
		assertEquals(obj.dayOfWeek(6), "Saturday");
		assertEquals(obj.dayOfWeek(7), "Sunday");
	}

	@Test
	public void checkBob() {
		assertEquals(obj.checkBob("asdfdsf fsdfsaf"), "No Bob");
		assertEquals(obj.checkBob("asdfdsf fsdf dss saf"), "No Bob");
		assertEquals(obj.checkBob("asdfdsfBobfsdfsaf"), "You got it Boby!");
	}

	@Test
	public void isLeapYear() {
		assertEquals(obj.isLeapYear(2020), "leap year");
		assertEquals(obj.isLeapYear(1999), "not leap year");
		assertEquals(obj.isLeapYear(2019), "not leap year");
		assertEquals(obj.isLeapYear(2018), "not leap year");
		assertEquals(obj.isLeapYear(1944), "leap year");
		assertEquals(obj.isLeapYear(1980), "leap year");
	}

	@Test
	public void fahrenheitToCelsius() {
		assertEquals(obj.fahrenheitToCelsius(95.0), 35.0);
		assertEquals(obj.fahrenheitToCelsius(50.0), 10.0);
	}
}

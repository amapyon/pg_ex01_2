package pg_ex01_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNum2Test {

	@Test
	public void createRomNumErrorTest() {
		assertEquals("変換できません",RomanNum2.createRomNum(0));
		assertEquals("変換できません",RomanNum2.createRomNum(-1));
		assertEquals("変換できません",RomanNum2.createRomNum(21));
	}

	@Test
	public void createRomNumTest(){
		assertEquals("III",RomanNum2.createRomNum(3));
		assertEquals("XIII",RomanNum2.createRomNum(13));
	}
}

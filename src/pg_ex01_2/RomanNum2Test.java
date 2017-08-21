package pg_ex01_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNum2Test {

	@Test
	public void convertNumTest() {
		//12がただしく"XII"に変換される
		RomanNum2 romannum2 = new RomanNum2() ;
		String testoutput = romannum2.convertNum(12);
		assertEquals("XII",testoutput);
	}

	@Test
	public void checkNumTest(){
		RomanNum2 romannum2 = new RomanNum2();
		//10を入力したら、Trueが返る
		assertTrue(romannum2.checkNum(10));
		//21を入力したら、Falseが返る
		assertFalse(romannum2.checkNum(21));
		//-1を入力したら、Falseが返る
		assertFalse(romannum2.checkNum(-1));
	}

	@Test
	public void createRomNum(){
		RomanNum2 romannum2 = new RomanNum2();
		//-1を入力したら、エラーメッセージが表示される
		assertEquals("変換できません",romannum2.createRomNum(-1));
	}

}

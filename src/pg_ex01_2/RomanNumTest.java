package pg_ex01_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNum2Test {

	@Test
	//public void testGetResponse() {
	//	int[] inputs = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	//	String[] expecteds = {"","I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX"};
	//	assertEquals();
	//}

//	public void getInputNumTest (){
//		RomanNum romannum = new RomanNum();
//		assertNotNull("数字を入力できること",romannum.getInputNum());
//	}

	public void checkNumTest(){
		RomanNum romannum = new RomanNum();
		//10を入力したら、Trueが返ること
		assertTrue(romannum.checkNum(10));
		//21を入力したら、Falseが返るこddと
		assertFalse(romannum.checkNum(21));
		//-1を入力したら、Falseが返ること
		assertFalse(romannum.checkNum(-1));
	}

	public void decNumTest(){
		RomanNum romannum = new RomanNum();
		//
		assertEquals("100", ""+100);
	}
}

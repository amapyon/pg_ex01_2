package pg_ex01_2;

public class RomanNum2 {

	static String ERR_MSG = "変換できません";

	//引数として受け取った数値をローマ数字に変換して返すクラス
	public static String createRomNum (int recnum){
		//受け取った値をローマ数字に変換し、出力する
		if (recnum < 1 || 20 < recnum){
			return ERR_MSG;
		}

		int quot = recnum / 10;
		int rem = recnum % 10;

		String[][] roman_nums = {{"","X","XX"},{"","I","II","III","IV","V","VI","VII","VIII","IX"}};

		return roman_nums[0][quot] + roman_nums[1][rem];
	}
}


package pg_ex01_2;

public class RomanNum2 {

	static String inp_mes = "1から20までの整数を1つ入力してください";
	static String err_mes = "変換できません";

	//引数として受け取った数値をローマ数字に変換して返すクラス
	public static String createRomNum (int recnum){
		//受け取った値をローマ数字に変換し、出力する
		if (recnum < 1 || 20 < recnum){
			return err_mes;
		}
		
		int quot = recnum / 10;
		int rem = recnum % 10;
		
		String[][] roman_nums = {{"","X","XX"},{"","I","II","III","IV","V","VI","VII","VIII","IX"}};
		
		return roman_nums[0][quot] + roman_nums[1][rem];
	}
}


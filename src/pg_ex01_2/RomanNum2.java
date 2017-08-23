package pg_ex01_2;

public class RomanNum2 {

	static String inp_mes = "1から20までの整数を1つ入力してください";
	static String err_mes = "変換できません";

	//引数として受け取った数値をローマ数字に変換して返すクラス
	public static String createRomNum (int recnum){
		return logic(recnum);
	}

	//createRomNumクラスのロジック部分
	public static String logic(int num){
		//受け取った値をローマ数字に変換し、出力する
		if (num < 1 || 20 < num){
			return err_mes;
		}

		int quot = num / 10;
		int rem = num % 10;

		String[][] roman_nums = {{"","X","XX"},{"","I","II","III","IV","V","VI","VII","VIII","IX"}};

		return roman_nums[0][quot] + roman_nums[1][rem];
	}
}


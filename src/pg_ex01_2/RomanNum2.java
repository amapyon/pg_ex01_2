package pg_ex01_2;

import java.util.Scanner;

public class RomanNum2 {

	static String fst_mes = "1から20までの整数を1つ入力してください";
	static String err_mes = "変換できません";

	public static void main(String args[]){
		//標準入力から値を受け取る
		System.out.println(fst_mes);
		Scanner scanner = new Scanner(System.in);
		int inputnum = Integer.parseInt(scanner.nextLine());

		//入力値が適切であることを確認
		boolean check = checkNum(inputnum);
		if(check = false){
			return;
		}

		//入力値をローマ数字に変換して、出力
		System.out.println(createRomNum(inputnum));
	}

	public static String convertNum(int input){
		int quot = input/10;
		int rem = input%10;

		String roman_nums[][] = {{"","X","XX"},{"","I","II","III","IV","V","VI","VII","VIII","IX"}};
		String roman_num = roman_nums[0][quot] + roman_nums[1][rem];
		return roman_num;
	}

	public static boolean checkNum(int n) {
		if (n < 0) {
			return false;
		}else if(n > 20){
			return false;
		}else{
			return true;
		}
	}

	public static String createRomNum(int num){
		//受け取った値が適切であることを確認する
		boolean checked = checkNum(num);
		if (checked = false){
			System.exit(1);
		}

		//受け取った値をローマ数字に変換し、出力する
		String romannum = convertNum(num);
			return romannum;
	}


}


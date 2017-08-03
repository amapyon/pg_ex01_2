package pg_ex01_2;

import java.util.Scanner;

public class RomanNum {

	public static void main(String[] args) {
		//ローマ数字を位ごとに分割して、配列に格納する
		String roman[][] = {{"","X","XX"},{"","I","II","III","IV","V","VI","VII","VIII","IX"}};

		//変数inputに標準入力から受け取った整数を格納する
		System.out.println("1から20までの整数を1つ入力してください");
		Scanner scanner = new Scanner(System.in);
		int input = Integer.parseInt(scanner.nextLine());

		//0以下および21以上の数字が入力された場合は、エラーを出力する
		if(input < 0 || 20 < input){
			System.out.println("Error! 適切ではない値が代入されました");
			return;
		}

		//inputの十位と一位をそれぞれ変数に格納する
		//quot:商、	rem:余り
		int quot = input/10;
		int rem = input%10;

		//quotとremに対応したローマ数字を取り出し、出力する
		System.out.println(roman[0][quot]+roman[1][rem]);
	}

}

package pg_ex01_2;

import java.util.Scanner;

public class RomanNum {

	public static void main(String[] args) {
		//変数scannerに標準出力から受け取った数字を格納する
		System.out.println("Input integer(1-20)!!");
		Scanner scanner = new Scanner(System.in);
		int input = Integer.parseInt(scanner.nextLine());

		//0以下および21以上の数字が入力された場合は、エラーを出力する
		if(input < 0 || 20 < input){
			System.out.println("Conversion Error");
			return;
		}

		//標準入力された整数の商(=quot)と余(=rem)を定義する
		int quot = input/10;
		int rem = input%10;

		//ローマ数字を位ごとにわけて、配列に格納する
		String roman[][] = {{"","X","XX"},{"","I","II","III","IV","V","VI","VII","VIII","IX"}};
		System.out.println(roman[0][quot]+roman[1][rem]);
	}

}

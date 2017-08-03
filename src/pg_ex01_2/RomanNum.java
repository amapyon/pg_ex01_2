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

		//メソッド"first_func"と"second_func"により、商と余りの部分をローマ数字に変換して出力する
		String x = first_func(quot);
		String y = second_func(rem);
		System.out.println(x+y);
	}

	//商の部分をローマ文字に変換するメソッド"first_func"
	//戻り値headはローマ数字において10の位に該当する
	public  static String first_func(int x){
		String head = "";
		switch(x){
		case 0:{
			head = "";
			return head;
		}
		case 1:{
			head = "X";
			return head;
		}
		case 2:{
			head = "XX";
			return head;
		}
		}
		return head;
	}

	//余の部分をローマ文字に変換するメソッド"second_func"
	//戻り値tailはローマ数字において1の位に該当する
	public  static String second_func(int y){
		String tail = "";
		switch(y){
		case 0:{
			tail = "";
			return tail;
		}
		case 1:{
			tail = "I";
			return tail;
		}
		case 2:{
			tail = "II";
			return tail;
		}
		case 3:{
			tail = "III";
			return tail;
		}
		case 4:{
			tail = "IV";
			return tail;
		}
		case 5:{
			tail = "V";
			return tail;
		}
		case 6:{
			tail = "VI";
			return tail;
		}
		case 7:{
			tail = "VII";
			return tail;
		}
		case 8:{
			tail = "VIII";
			return tail;
		}
		case 9:{
			tail = "IX";
			return tail;
		}
		}
		return tail;
	}
}

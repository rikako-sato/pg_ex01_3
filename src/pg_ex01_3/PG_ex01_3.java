package pg_ex01_3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class PG_ex01_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ



		System.out.println("好きな英文を入力してください");

		String input = new java.util.Scanner(System.in).nextLine();
		wordcount(input);
	}

		public static void wordcount(String input){
			System.out.println("入力された英文の単語の内訳は下記のとおりです");

			String text = input.toLowerCase();
			//空白で文を分割する
			String [] word = text.split(" ");

			HashMap<String,Integer> wordcount = new LinkedHashMap<String,Integer>();
				//HashMapに値を入れるためのfor文
				for(String tango : word){
					//指定データが値にふくまれているのか判定
					if(wordcount.containsKey(tango)){
						int countnum =wordcount.get(tango)+1;
						//指定データがすでに含まれている場合、value+1をする
						wordcount.put(tango, countnum);
					}else{
						//指定データが含まれていない場合、value= 1とする
						wordcount.put(tango,1 );
					}
									}
				//出現した単語をリストに格納する、後に出現数順の出力に使用するため
				ArrayList<String> list = new ArrayList<String>();
				for(String number : wordcount.keySet()){
					list.add(number);
				}
				//降順に出力させる
				Collections.sort(list,Comparator.reverseOrder());
				//出現数ごとに出力
				for (String print : list){
					//含まれる単語の要素数を算出する変数
					int countnum =wordcount.get(print);

						//printfメソッドでフォーマットを String 整数　段落あり　と指定している
						System.out.printf("%s %d %n",print+ ":",countnum);
				}



		}




}

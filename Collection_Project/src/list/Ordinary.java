package list;

import java.util.ArrayList;
import java.util.List;

/*
 * このクラスはCollectionインターフェースが持つ主なメソッドを使用します。
 * This class uses the main methods of the Collection interface.
 */
public class Ordinary {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//コレクションへ追加
		list.add("あいうえお");
		list.add("かきくけこ");
		list.add("さしすせそ");
		
		//要素の取得
		System.out.println(list.get(0)); //あいうえお
		
		//要素を含むか調べる
		System.out.println(list.contains("あいうえお")); //true
		System.out.println(list.contains("かきくけこ")); //false 
		
		//
		
	}

}

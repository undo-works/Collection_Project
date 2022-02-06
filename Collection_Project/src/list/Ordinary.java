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
		
		//要素が含まれていないか確認
		System.out.println(list.isEmpty()); //true
		
		//コレクションへ追加
		list.add("あいうえお");
		list.add("かきくけこ");
		list.add("さしすせそ");
		
		//要素数の取得(int)
		System.out.println(list.size()); //3
		
		//要素の取得
		System.out.println(list.get(0)); //あいうえお
		
		//要素を含むか調べる 
		//複数は「boolean containsAll(Collection<?> c)」
		System.out.println(list.contains("あいうえお")); //true
		System.out.println(list.contains("たちつてと")); //false 
		
		//要素がすべて格納された配列を取得
		Object[] objectArray = list.toArray();
		System.out.println(objectArray[0]); //あいうえお
		System.out.println(objectArray[1]); //かきくけこ
		
		
		
	}
}

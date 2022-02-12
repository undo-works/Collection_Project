package list;

import java.util.ArrayList;
import java.util.List;

/*
 * このクラスはCollectionインターフェースが持つ主なメソッドを使用します。
 * This class uses the main methods of the Collection interface.
 */
public class OrdinaryList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//要素が含まれていないか確認
		System.out.println(list.isEmpty()); //true
		
		//コレクションへ追加
		list.add("あいうえお");
		list.add("かきくけこ");
		list.add("さしすせそ");
		
		//これだけはListインターフェースのメソッド
		list.add(0, "わをん");
		
		//リスト要素の全件取得
		System.out.println(list); //[わをん, あいうえお, かきくけこ, さしすせそ]
		
		//要素数の取得(int)
		System.out.println(list.size()); //4
		
		//要素の取得
		System.out.println(list.get(0)); //わをん
		
		//要素を含むか調べる 
		//複数は「boolean containsAll(Collection<?> c)」
		System.out.println(list.contains("あいうえお")); //true
		System.out.println(list.contains("たちつてと")); //false 
		
		//要素の削除
		//複数は「boolean removeAll(Collection<?> c)」
		System.out.println(list.remove("あいうえお")); //true
		
		//要素がすべて格納された配列を取得
		Object[] objectArray = list.toArray();
		System.out.println(objectArray[1]); //かきくけこ
		System.out.println(objectArray[2]); //さしすせそ
		
		//全ての要素の削除
		list.clear();
	}
}

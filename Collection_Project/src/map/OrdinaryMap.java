package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class OrdinaryMap {

	public static void main(String[] args) {
		//キーは整数、値は文字列にしました。
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		//マッピングを保持していないか確認
		System.out.println(map.isEmpty()); //true
		
		//map要素の追加
		map.put(1, "あいうえお");
		map.put(2, "かきくけこ");
		map.put(3, "さしすせそ");
		
		//指定したキーを含むか調べる
		System.out.println(map.containsKey(2)); //true
		
		//指定した値を含むか調べる
		System.out.println(map.containsValue("さしすせそ")); //true
		
		//指定したキーに対応する値を取得する
		System.out.println(map.get(3)); //さしすせそ
		
		//指定したキーと対応する値を削除
		System.out.println(map.remove(1)); //あいうえお
		System.out.println(map.remove(1)); //null
		
		//map要素の数を取得する
		System.out.println(map.size()); //2
		
		//map要素をコレクションで取得
		Collection<String> list = map.values();
		Object[] arrangement = list.toArray();
		System.out.println(arrangement[0]); //かきくけこ
		System.out.println(arrangement[1]); //さしすせそ
		
		//全ての要素の削除
		map.clear();
	}

}

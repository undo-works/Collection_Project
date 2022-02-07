package map;

import java.util.HashMap;
import java.util.Map;

public class OrdinaryMap {

	public static void main(String[] args) {
		//キーは整数、値は文字列にしました。
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "あいうえお");
		map.put(2, "かきくけこ");
	}

}

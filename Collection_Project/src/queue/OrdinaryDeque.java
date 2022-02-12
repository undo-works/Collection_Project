package queue;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class OrdinaryDeque {

	public static void main(String[] args) {
		Queue<String> queue = new ArrayDeque<String>();
		
		try {
			//要素の追加
			System.out.println(queue.add("あいうえお")); //true もし失敗したらIllegalStateExceptionが発生
			System.out.println(queue.offer("かきくけこ")); //true もし失敗したらfalse
			
			//キューから削除せず、全て取り出し　先入れ先出し
			System.out.println(queue); //[あいうえお, かきくけこ]
			
			//キューの先頭を削除せず取得
			System.out.println(queue.element()); //あいうえお
			System.out.println(queue.peek()); //あいうえお キューがからの時はnull
			
			//要素の取得及び削除
			System.out.println(queue.remove()); //あいうえお
			System.out.println(queue.poll()); //かきくけこ キューがからの時はnull
	
		}catch(IllegalStateException e1) {
			//add()において、容量制限で追加できないとき発生
			System.err.println("不正または不適切なときにメソッドが呼び出されました。");
			
		}catch(NoSuchElementException e2) {
			//remove()とelement()において、キューが空の時発生
			System.err.println("要求されている要素が存在しません。");		
		}
	}
}

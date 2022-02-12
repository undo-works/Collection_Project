package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackDeque {

	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<String>();
		
		//スタックとして追加
		stack.push("あいうえお");
		stack.push("かきくけこ");
		stack.push("さしすせそ");
		
		//スタックから削除はせず全て取り出す 後入れ先出し
		System.out.println(stack); //[さしすせそ, かきくけこ, あいうえお]
		
		//スタックから削除せず取り出す 後入れ先出し
		System.out.println(stack.peek()); //さしすせそ
		
		//スタックから取り出して削除　後入れ先出し
		System.out.println(stack.pop()); //さしすせそ
	}
}

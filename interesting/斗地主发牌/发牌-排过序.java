package com.itheima;

import java.util.ArrayList;
import java.util.Collections;

public class Test05 {
	public static void main(String[] args) {
		// 给一个id,便于排序
		String[] s1 = { "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5",
				"4", "3" };
		String[] s2 = { "红桃", "梅花", "黑桃", "方块" };
		ArrayList<Card> pai = new ArrayList<>();
		pai.add(new Card("大王", 54));
		pai.add(new Card("小王", 53));
		int id = 52;
		// 添加牌
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				String s = s2[j] + s1[i];// 组成牌
				pai.add(new Card(s, id));
				id--;
			}
		}
		Collections.shuffle(pai);// 洗牌
		// 牌手
		ArrayList<Card> 志玲 = new ArrayList<>();
		ArrayList<Card> 青霞 = new ArrayList<>();
		ArrayList<Card> 曼玉 = new ArrayList<>();
		for (int i = 0; pai.size() > 3; i++) {// pai.size()>3 ：留3张底牌
			if (i % 3 == 0) {
				志玲.add(pai.remove(0));
			}
			if (i % 3 == 1) {
				青霞.add(pai.remove(0));
			}
			if (i % 3 == 2) {
				曼玉.add(pai.remove(0));
			}
		}
		Collections.sort(志玲, new Compa());
		Collections.sort(青霞, new Compa());
		Collections.sort(曼玉, new Compa());
		System.out.println("志玲" + 志玲);
		System.out.println("青霞" + 青霞);
		System.out.println("曼玉" + 曼玉);
		System.out.println("底牌" + pai);
	}
}

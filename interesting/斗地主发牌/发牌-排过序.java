package com.itheima;

import java.util.ArrayList;
import java.util.Collections;

public class Test05 {
	public static void main(String[] args) {
		// ��һ��id,��������
		String[] s1 = { "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5",
				"4", "3" };
		String[] s2 = { "����", "÷��", "����", "����" };
		ArrayList<Card> pai = new ArrayList<>();
		pai.add(new Card("����", 54));
		pai.add(new Card("С��", 53));
		int id = 52;
		// �����
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				String s = s2[j] + s1[i];// �����
				pai.add(new Card(s, id));
				id--;
			}
		}
		Collections.shuffle(pai);// ϴ��
		// ����
		ArrayList<Card> ־�� = new ArrayList<>();
		ArrayList<Card> ��ϼ = new ArrayList<>();
		ArrayList<Card> ���� = new ArrayList<>();
		for (int i = 0; pai.size() > 3; i++) {// pai.size()>3 ����3�ŵ���
			if (i % 3 == 0) {
				־��.add(pai.remove(0));
			}
			if (i % 3 == 1) {
				��ϼ.add(pai.remove(0));
			}
			if (i % 3 == 2) {
				����.add(pai.remove(0));
			}
		}
		Collections.sort(־��, new Compa());
		Collections.sort(��ϼ, new Compa());
		Collections.sort(����, new Compa());
		System.out.println("־��" + ־��);
		System.out.println("��ϼ" + ��ϼ);
		System.out.println("����" + ����);
		System.out.println("����" + pai);
	}
}

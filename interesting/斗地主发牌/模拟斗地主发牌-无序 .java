package com.itheima05;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		String[] str1 = { "����", "÷��", "����", "����" };
		String[] str2 = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };
		// ����˿���
		ArrayList<String> pai = new ArrayList<String>();
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				pai.add(str1[i] + str2[j]);
			}
		}
		pai.add("����");
		pai.add("С��");
		// ϴ�ƣ��������
		Collections.shuffle(pai);

		ArrayList<String> people1 = new ArrayList<String>();
		ArrayList<String> people2 = new ArrayList<String>();
		ArrayList<String> people3 = new ArrayList<String>();
		// ���Ʋ�������
		for (int i = 0; pai.size() > 3; i++) {
			if (i % 3 == 0) {
				people1.add(pai.remove(0));
			} else if (i % 3 == 1) {
				people2.add(pai.remove(0));
			} else if (i % 3 == 2) {
				people3.add(pai.remove(0));
			}
		}
		// ������
		Collections.sort(people1);
		Collections.sort(people2);
		Collections.sort(people3);

		System.out.println("people1��" + people1);
		System.out.println("people2��" + people2);
		System.out.println("people3��" + people3);

		System.out.println("����Ϊ:" + pai);
	}
}

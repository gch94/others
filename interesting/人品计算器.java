package com.itheima03;

import java.util.Random;
import java.util.Scanner;

public class Test_05 {
	public static void main(String[] args) {
		//��������
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������");
		//�����û��Ӽ��������������String
		String name = scanner.next();
		
		//�������һ����ֵ��Ӧ�������
		Random random = new Random();
		int rp = random.nextInt(101);
		
		//��ֵ����
		String a = getRP(rp);
		System.out.println(getRP(rp));
		
//		System.out.println(getRP(10));
//		getRP(rp);
		
	}
	
	//����ֵ����:�ַ���
	//�����б�:int rp
	public static String getRP(int rp) {
		String rpText="";
		
		if (rp == 0) {
			rpText = "��һ�������˰ɣ���ôһ����Ʒ��û�У���";
		} else if (rp > 0 && rp <= 5) {
			rpText = "���ˣ�����ûʲô��Ʒ��̸��...";
		} else if (rp > 5 && rp <= 10) {
			rpText = "���Ҳ���...��Ӧ�ø���̸��Ʒ�����...";
		} else if (rp > 10 && rp <= 15) {
			rpText = "ɱ����û��?�Ź���û��?��Ӧ���޶�����?";
		} else if (rp > 15 && rp <= 20) {
			rpText = "��ò��Ӧ�������͵�����ڴ���ϴ��İ�...";
		} else if (rp > 20 && rp <= 25) {
			rpText = "�����Ʒ֮����ʵ�����˾��Ȱ�...";
		} else if (rp > 25 && rp <= 30) {
			rpText = "�����Ʒ̫���ˡ���Ӧ���иɻ��µ��Ⱥð�?";
		} else if (rp > 30 && rp <= 35) {
			rpText = "�����Ʒ���϶�������͵����������...";
		} else if (rp > 35 && rp <= 40) {
			rpText = "��ӵ����˲����Ʒ�뾭��������汣�����...";
		} else if (rp > 40 && rp <= 45) {
			rpText = "��ʵ����..��Щ��̳���澭�����ֵ�͵�����ǲ�����Ľ���?";
		} else if (rp > 45 && rp <= 50) {
			rpText = "����ش�С��֮�����û�ٸɰ�?";
		} else if (rp > 50 && rp <= 55) {
			rpText = "�����Ʒ̫����..�Բ�С�ľͻ�ȥ�ɻ����˰�?";
		} else if (rp > 55 && rp <= 60) {
			rpText = "�����Ʒ�ܲ���..Ҫʱ�̿���ס�����µĳ嶯Ŷ..";
		} else if (rp > 60 && rp <= 65) {
			rpText = "�����Ʒ�Ƚϲ���..Ҫ�úõ�Լ���Լ���..";
		} else if (rp > 65 && rp <= 70) {
			rpText = "�����Ʒ����ǿǿ..Ҫ�Լ�����Ϊ֮..";
		} else if (rp > 70 && rp <= 75) {
			rpText = "������������Ʒ���ǲ�����..";
		} else if (rp > 75 && rp <= 80) {
			rpText = "���нϺõ���Ʒ..��������..";
		} else if (rp > 80 && rp <= 85) {
			rpText = "�����Ʒ����..Ӧ��һ���˲Ű�?";
		} else if (rp > 85 && rp <= 90) {
			rpText = "�����Ʒ���..������Ӧ������İ��ð�..";
		} else if (rp > 90 && rp <= 95) {
			rpText = "�����Ʒ̫����..����ǵ������׷氡...";
		} else if (rp > 95 && rp <= 99) {
			rpText = "�������˵İ�����";
		} else if (rp == 100) {
			rpText = "�����������񣡣���";
		} else {
			rpText = "�����Ʒ��Ȼ�������...�Ҷ�������..";
		}
		return rpText;
	}
}

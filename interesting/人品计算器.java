package com.itheima03;

import java.util.Random;
import java.util.Scanner;

public class Test_05 {
	public static void main(String[] args) {
		//输入姓名
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入姓名");
		//接受用户从键盘输入的姓名，String
		String name = scanner.next();
		
		//随机产生一个数值对应你的名字
		Random random = new Random();
		int rp = random.nextInt(101);
		
		//赋值调用
		String a = getRP(rp);
		System.out.println(getRP(rp));
		
//		System.out.println(getRP(10));
//		getRP(rp);
		
	}
	
	//返回值类型:字符串
	//参数列表:int rp
	public static String getRP(int rp) {
		String rpText="";
		
		if (rp == 0) {
			rpText = "你一定不是人吧？怎么一点人品都没有？！";
		} else if (rp > 0 && rp <= 5) {
			rpText = "算了，跟你没什么人品好谈的...";
		} else if (rp > 5 && rp <= 10) {
			rpText = "是我不好...不应该跟你谈人品问题的...";
		} else if (rp > 10 && rp <= 15) {
			rpText = "杀过人没有?放过火没有?你应该无恶不做吧?";
		} else if (rp > 15 && rp <= 20) {
			rpText = "你貌似应该三岁就偷看隔壁大妈洗澡的吧...";
		} else if (rp > 20 && rp <= 25) {
			rpText = "你的人品之低下实在让人惊讶啊...";
		} else if (rp > 25 && rp <= 30) {
			rpText = "你的人品太差了。你应该有干坏事的嗜好吧?";
		} else if (rp > 30 && rp <= 35) {
			rpText = "你的人品真差！肯定经常做偷鸡摸狗的事...";
		} else if (rp > 35 && rp <= 40) {
			rpText = "你拥有如此差的人品请经常祈求佛祖保佑你吧...";
		} else if (rp > 40 && rp <= 45) {
			rpText = "老实交待..那些论坛上面经常出现的偷拍照是不是你的杰作?";
		} else if (rp > 45 && rp <= 50) {
			rpText = "你随地大小便之类的事没少干吧?";
		} else if (rp > 50 && rp <= 55) {
			rpText = "你的人品太差了..稍不小心就会去干坏事了吧?";
		} else if (rp > 55 && rp <= 60) {
			rpText = "你的人品很差了..要时刻克制住做坏事的冲动哦..";
		} else if (rp > 60 && rp <= 65) {
			rpText = "你的人品比较差了..要好好的约束自己啊..";
		} else if (rp > 65 && rp <= 70) {
			rpText = "你的人品勉勉强强..要自己好自为之..";
		} else if (rp > 70 && rp <= 75) {
			rpText = "有你这样的人品算是不错了..";
		} else if (rp > 75 && rp <= 80) {
			rpText = "你有较好的人品..继续保持..";
		} else if (rp > 80 && rp <= 85) {
			rpText = "你的人品不错..应该一表人才吧?";
		} else if (rp > 85 && rp <= 90) {
			rpText = "你的人品真好..做好事应该是你的爱好吧..";
		} else if (rp > 90 && rp <= 95) {
			rpText = "你的人品太好了..你就是当代活雷锋啊...";
		} else if (rp > 95 && rp <= 99) {
			rpText = "你是世人的榜样！";
		} else if (rp == 100) {
			rpText = "天啦！你是神！！！";
		} else {
			rpText = "你的人品竟然负溢出了...我对你无语..";
		}
		return rpText;
	}
}

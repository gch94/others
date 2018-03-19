package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) throws ParseException {
		long time = now() - start();
		long day = time / (1000 * 60 * 60 * 24);
		long sec = time / 1000;
		System.out.println("day:" + day);
		System.out.println("second:" + sec);

	}

	private static long start() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入出生日期，格式为：年-月-日");
		String date = sc.nextLine();
		// Date d = sdf.parse("1994-8-19");
		Date d = sdf.parse(date);
		long time = d.getTime();
		return time;
	}

	private static long now() throws ParseException {
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// Scanner sc = new Scanner(System.in);
		// System.out.println("请输入当前日期，格式为：年-月-日");
		// String date = sc.nextLine();
		// // Date d = sdf.parse("2017-9-14");
		// Date d = sdf.parse(date);// 将String转为Date
		// long time = d.getTime();// 将Date转为毫秒数

		Date d = new Date();// 获取当前系统时间
		long time = d.getTime();// 将Date转为毫秒数

		return time;
	}
}

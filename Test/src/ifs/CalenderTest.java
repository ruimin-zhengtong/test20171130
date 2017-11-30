/*
 * Copyright (C), 2015-2017, 上海睿民互联网科技有限公司
 * Package ifs 
 * FileName: CalenderTest.java
 * Author:   FY
 * Date:     2017年8月18日 下午1:55:00
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   FY           2017年8月18日下午1:55:00                     1.0                  
 *===============================================================================================
 */
package ifs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * 名称：〈一句话功能简述〉<br>
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2017年8月18日 <br>
 * 作者：FY <br>
 * 说明：<br>
 */
public class CalenderTest {

	public static List<String> getAllDatesString(String start, String end) {
		Calendar calendar1 = new GregorianCalendar();
		calendar1.setTime(parseDate(start, "yyyy-mm-dd"));
		Calendar calendar2 = new GregorianCalendar();
		calendar2.setTime(parseDate(end, "yyyy-mm-dd"));
		return dayAllStr(calendar1, calendar2, start);
	}

	private static List<String> dayAllStr(Calendar calendar1, Calendar calendar2, String start) {
		List<String> list = new ArrayList();
		list.add(new SimpleDateFormat("yyyyMMdd").format(parseDate(start, "yyyy-mm-dd")));
		while (calendar1.compareTo(calendar2) < 0) {
			calendar1.add(5, 1);
			list.add(new SimpleDateFormat("yyyyMMdd").format(calendar1.getTime()));
		}
		return list;
	}

	public static Date parseDate(String dateStr, String pattern) {
		if ((dateStr == null) || (dateStr.length() == 0) || (pattern == null) || (pattern.length() == 0))
			return null;
		DateFormat fmt = new SimpleDateFormat(pattern);
		Date result = null;
		try {
			result = fmt.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void main(String[] args) {
		List<String> list = getAllDatesString("2017-07-27", "2017-08-18");
		// while (list.iterator()!=null) {
		//
		// }
		System.out.println(list.toString());
	}
}

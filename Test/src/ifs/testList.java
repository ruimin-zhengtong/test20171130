/*
 * Copyright (C), 2015-2017, 上海睿民互联网科技有限公司
 * Package ifs 
 * FileName: testList.java
 * Author:   FY
 * Date:     2017年8月22日 上午10:11:28
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   FY           2017年8月22日上午10:11:28                     1.0                  
 *===============================================================================================
 */
package ifs;

import java.util.ArrayList;
import java.util.List;

/**
 * 名称：〈一句话功能简述〉<br> 
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2017年8月22日 <br>
 * 作者：FY <br>
 * 说明：<br>
 */
public class testList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		System.out.println(list.get(2));
	}
	
}

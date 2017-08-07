package com.putaoteng.task5.utils;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class DateTag extends SimpleTagSupport {
	//要处理的时间
	private Long time;
	//指定转换的格式
	private int flag;
	
	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		  this.time = time;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int format) {
		this.flag = format;
	}

	@Override
	public void doTag() throws JspException, IOException {
		if (this.time != null){
			JspWriter out = getJspContext().getOut();
			
			//用获取到的时间创建Date对象
			Date date = new Date(time);
			DateFormat format = null;
			//根据传入的flag,定义日期输出格式,默认使用全输出格式
			switch (flag){
			case 1:
				format = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
				break;
			case 2:
				format = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
				break;
			case 3:
				format = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
				break;
			case 4:
			default :
				format = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
				break;
			}
			out.println(format.format(date));
		}
	}
}

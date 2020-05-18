package com.container.myDateProperty;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *自定义属性编辑器
 */
public class MyDatePropertyEditor extends PropertyEditorSupport{
	public String format = "yyyy-MM-dd";
	public void setFormat(String format) {
		this.format = format;
	}
	
	public String getFormat() {
		return format;
	}

	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println("running...");
//		super.setAsText(text);
		System.out.println("arg: "+text);
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		Date d = null;
		try {
			d = sdf.parse(text);
			this.setValue(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}

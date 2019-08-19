package com.cg;

import java.beans.PropertyEditorSupport;
import java.sql.Date;
//this class contains the conversion logic 
//of string value to java.sql.Date type 


public class SQLDateEditor 
extends PropertyEditorSupport {

	public SQLDateEditor() { }
	
	public void setAsText(String text) {
		if(text.equalsIgnoreCase("getdate()")) {
			Date date = new Date(System.currentTimeMillis());
			setValue(date);
		}
		else {
			setValue(Date.valueOf(text));
		}	
	}
	
	public String getAsText() {
		return getValue().toString();
	}	
}

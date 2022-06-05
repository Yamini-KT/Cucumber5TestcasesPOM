package com.tekarch.salesforce.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Constants {

	public static final String CURRENT_EXECUTION_TIMESTAMP=new SimpleDateFormat("MMddyyyyHHmmss").format(new Date());
	public static final String USER_DIR = System.getProperty("user.dir");
	public static final String RESOURCES_PATH=USER_DIR+"/resources/";
	
}

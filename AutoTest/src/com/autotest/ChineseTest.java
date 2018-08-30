package com.autotest;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import jp.jun_nama.test.utf7ime.helper.Utf7ImeHelper;

public class ChineseTest extends UiAutomatorTestCase {
	
	public void testChinese() throws UiObjectNotFoundException{
		
		//UiObject apps=new UiObject(new UiSelector().description("ALL APPS"));
		//apps.clickAndWaitForNewWindow();
		UiObject wechat=new UiObject(new UiSelector().text("WeChat"));
		wechat.clickAndWaitForNewWindow();
		UiObject signup=new UiObject(new UiSelector().resourceId("com.tencent.mm:id/ca3"));
		signup.clickAndWaitForNewWindow();
		UiObject nickname=new UiObject(new UiSelector().resourceId("com.tencent.mm:id/g_"));
		nickname.setText(Utf7ImeHelper.e("ÄãºÃ"));
		
		
		
		
	}
	
	
	
	
	
	
	
	

}

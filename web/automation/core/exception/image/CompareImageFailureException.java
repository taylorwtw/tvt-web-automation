package web.automation.core.exception.image;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import web.automation.core.browser.WebBrowser;
import web.automation.core.element.BrowserElement;
import web.automation.core.exception.WebBrowserException;

public class CompareImageFailureException extends WebBrowserException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CompareImageFailureException (){
		super();
	}

	public CompareImageFailureException (java.lang.String message){
		super(message);
	}
	
	public CompareImageFailureException (java.lang.Throwable cause){
		super(cause);
	}
	
	public CompareImageFailureException (java.lang.String message,java.lang.Throwable cause){
		super(message,cause);
	}
	
	public CompareImageFailureException (WebBrowser browser,java.lang.String message){
		super(browser,message);
	}
	
	public CompareImageFailureException (WebBrowser browser,By locator,java.lang.String message){
		super(browser,locator,message);
	}
	
	public CompareImageFailureException (WebBrowser browser,WebElement element,java.lang.String message){
		super(browser,element,message);
	}
	
	public CompareImageFailureException (WebBrowser browser,BrowserElement element,java.lang.String message){
		super(browser,element,message);
	}
}

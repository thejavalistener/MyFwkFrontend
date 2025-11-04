package thejavalistener.fwkfrontend.etc;

import java.awt.Insets;

import thejavalistener.fwkutils.awt.link.MyLinkedPaneStyle;

public class MyAppContainerStyle 
{
	public MyLinkedPaneStyle appLinkedStyle = new MyLinkedPaneStyle(); 
	public MyLinkedPaneStyle screenLinkedStyle = new MyLinkedPaneStyle();
	
	public MyAppContainerStyle()
	{
		appLinkedStyle.setLinkPaneInsets(new Insets(10,3,0,3));
//		screenLinkedStyle.setLinkPaneInsets(new Insets(0,0,0,0));
//		screenLinkedStyle.linkStyle.setLinkInsets(new Insets(0,0,0,0));
//		screenLinkedStyle.linkStyle.setLinkBackgroundInsets(new Insets(0,0,0,0));
	}
}

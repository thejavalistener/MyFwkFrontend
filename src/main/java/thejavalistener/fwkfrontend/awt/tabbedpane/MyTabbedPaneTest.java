package thejavalistener.fwkfrontend.awt.tabbedpane;

import thejavalistener.fwkfrontend.awt.panel.MyRandomColorPanel;
import thejavalistener.fwkfrontend.awt.variuos.MyAwt;
import thejavalistener.fwkutils.awt.testui.MyTestUI;

public class MyTabbedPaneTest
{
	public static void main(String[] args)
	{
		MyAwt.setWindowsLookAndFeel();

		MyTabbedPane mtp = new MyTabbedPane();
		mtp.addTab(new MyRandomColorPanel(),true);
		mtp.addTab(new MyRandomColorPanel(),true);
		mtp.addTab(new MyRandomColorPanel(),true);
		mtp.addTab(new MyRandomColorPanel(),true);
		
		MyTestUI.test(mtp.c()).addButton("Add",l->mtp.addTab(new MyRandomColorPanel(),true)).run();
	}
}

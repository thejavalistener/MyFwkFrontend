package thejavalistener.fwkfrontend.awt.panel;

import javax.swing.JPanel;

import thejavalistener.fwkfrontend.awt.variuos.MyAwt;

public class MyRandomColorPanel extends MyPanel
{
	public MyRandomColorPanel()
	{
		super(0,0,0,0);
		setBackground(MyAwt.randomColor());
		setBorder(null);
	}
}

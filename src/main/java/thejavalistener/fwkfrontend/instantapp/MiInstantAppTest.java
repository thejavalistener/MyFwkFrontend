package thejavalistener.fwkfrontend.instantapp;

import javax.swing.JCheckBox;

import thejavalistener.fwkutils.various.MyColor;

public class MiInstantAppTest
{
	public static void main(String[] args)
	{
		MyInstantApp x = new MyInstantApp();
		x.addButton("Capo","capo");
		x.addButton("Total","total");
		x.addButton("Loccooo","loco");
		x.addScreenPanel("1",MiPanel1.class);
		x.addScreenPanel("2",MiPanel2.class);
		x.setSelected(MiPanel1.class);
		
		x.init();
		
		x.size(450,300).show();
	}
	
	static class MiPanel1 extends MyInstantAppScreen
	{
		private JCheckBox chb;
		
		@Override
		public void onButtonPressed(String action)
		{
			System.out.println("p1 ----------> "+action);
		}
		
		public MiPanel1()
		{
			setBackground(MyColor.random());
			
			chb = new JCheckBox("Evitar cambio...");
			add(chb);
		}

		@Override
		public void init(Object... args)
		{
		}

		

		@Override
		public void dataUpdated()
		{
		}

		@Override
		public void start()
		{
		}

		@Override
		public boolean stop()
		{
			return !chb.isSelected();
		}
	}
	
	static class MiPanel2 extends MyInstantAppScreen
	{
		public MiPanel2()
		{
			setBackground(MyColor.random());
		}
		
		@Override
		public void onButtonPressed(String action)
		{
			System.out.println("p2 ----------> "+action);
		}
		


		@Override
		public void init(Object... args)
		{
		}

		@Override
		public void dataUpdated()
		{
		}

		@Override
		public void start()
		{
		}

		@Override
		public boolean stop()
		{
			return true;
		}
	}

}

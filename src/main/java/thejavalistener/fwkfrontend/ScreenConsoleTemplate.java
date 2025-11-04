package thejavalistener.fwkfrontend;

import java.awt.BorderLayout;

import org.springframework.stereotype.Component;

import thejavalistener.fwkfrontend.console.MyConsole;
import thejavalistener.fwkfrontend.console.MyConsoleListener;

@Component
public abstract class ScreenConsoleTemplate extends MyAbstractScreen
{
	protected MyConsole console = null;
				
	public ScreenConsoleTemplate()
	{
		setLayout(new BorderLayout());

		// instancio la consola y la agrego al center
		console = new MyConsole();
		console.addListener(new EscuchaConsola());
		add(console.c(),BorderLayout.CENTER);
	}	
	
	protected MyConsole getConsole()
	{
		return console;
	}
			
	class EscuchaConsola implements MyConsoleListener
	{
		@Override
		public void waitingForUserInput(boolean waiting)
		{
			setDisabledTemporally(waiting,console.c());
			console.getTextPane().setEnabled(true);
		}
	}
}

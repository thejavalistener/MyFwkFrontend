package thejavalistener.fwkfrontend;

import java.awt.BorderLayout;

import org.springframework.stereotype.Component;

import thejavalistener.fwkfrontend.awt.form.MyForm;
import thejavalistener.fwkfrontend.console.MyConsole;
import thejavalistener.fwkfrontend.console.MyConsoleBase;
import thejavalistener.fwkfrontend.console.MyConsoleListener;

@Component
public abstract class ScreenFormConsoleTemplate extends ScreenConsoleTemplate
{
	protected MyForm form = null;
				
	public ScreenFormConsoleTemplate()
	{
		// instancio el form y lo agrego al west (en el center está la consola)
		form = new MyForm();				
		add(form.c(),BorderLayout.WEST);
	}
	
	protected MyForm getForm()
	{
		return form;		
	}	
}

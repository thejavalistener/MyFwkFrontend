package thejavalistener.fwkfrontend.templates;

import java.awt.BorderLayout;

import org.springframework.stereotype.Component;

import thejavalistener.fwkutils.awt.form.MyForm;
import thejavalistener.fwkutils.console.MyConsole;
import thejavalistener.fwkutils.console.MyConsoleBase;
import thejavalistener.fwkutils.console.MyConsoleListener;

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

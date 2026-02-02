package thejavalistener.fwkfrontend;

import java.awt.Window;
import java.util.ArrayList;
import java.util.Map;

import thejava.listener.fwkutils.log.MyLogs;
import thejavalistener.fwkutils.awt.dialog.MyInstantForm;
import thejavalistener.fwkutils.awt.searchbox.MySearchBox;
import thejavalistener.fwkutils.awt.searchbox.MySearchBoxController;
import thejavalistener.fwkutils.awt.variuos.MyAwt;

//@Component
public abstract class MyAbstractScreen extends MyAbstractScreenBase
{
	private static ArrayList<MyAbstractScreen> instancias = new ArrayList<>();

	private Object[] params;
	
	public void init(){};
	public void start(){};
	public void stop(){};
	public void destroy(){};
	
	public void    _init() {MyLogs.get().debug("Quitar public y dejar friendly este método");};
	public void   _start() {MyLogs.get().debug("Quitar public y dejar friendly este método");};
	public void    _stop() {MyLogs.get().debug("Quitar public y dejar friendly este método");};
	public void _destroy() {MyLogs.get().debug("Quitar public y dejar friendly este método");};
	
	protected void onDataUpdated() {}
	protected void createUI() {}

	protected void preInit()
	{
		if(!instancias.contains(this))
			instancias.add(this);
	}
	
	protected final void dataUpdated()
	{
		for(MyAbstractScreen screen:instancias) screen.onDataUpdated();
	}
	
	public abstract String getName();
	
	public MyAbstractScreen()
	{
	}
	
	public void pushScreen(Class<? extends MyAbstractScreen> screenClass,Object ...args)
	{
		getMyApp().pushScreen(screenClass,args);
	}
	
	public void allowAppSwitch(boolean b)
	{
		getMyApp().allowSwitch(b);
	}
	
//	public Object getReturnValue()
//	{
//		return returnValue;
//	}
//	public void setReturnValue(Object returnValue)
//	{
//		this.returnValue=returnValue;
//	}

	public MyAbstractScreen getOuter()
	{
		return this;
	}
	
	public void setParameters(Object ...params)
	{
		this.params = params;
	}
	
	public Object[] getParameters()
	{
		return params;
	}
	
//	public void exit()
//	{
//		exit(null);
//	}
//	
//	public void exit(Object returnValue)
//	{
//		setReturnValue(returnValue);
//		getMyApp().popScreen();
//	}
	
	public <T> MySearchBox<T> createSearchBox(Class<T> clazz,MySearchBoxController<T> controller)
	{
		// parent
		Window parent = getMyApp().getMyAppContainer().c();
		
		// instancio
		MySearchBox<T> msb = new MySearchBox<>(parent,controller);
		msb.setAlternateRowColor(true);
		MyAwt.setProportionalSize(.6,msb.getDialog(),parent);
		MyAwt.centerH(150,msb.getDialog(),parent);
		
		return msb;
	}	
	
	public MyInstantForm createInstantForm(String title)
	{
		return new MyInstantForm(title,getMyApp().getMyAppContainer().c());
	}
	
	public void setTitle(String title)
	{
		getMyApp().getMyAppContainer().c().setTitle(title);
	}
	
	private Map<?,?> currState = null;
	public void setDisabledTemporally(boolean disable,java.awt.Component ...excepted)
	{
		if( disable )
		{
			currState = MyAwt.disableTemporally(this,excepted);
		}
		else
		{
			MyAwt.restoreDisabled(currState);			
		}
	}

}

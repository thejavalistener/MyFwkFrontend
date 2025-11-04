package thejavalistener.fwkfrontend.awt.dialog;

import java.util.Map;

import thejavalistener.fwkfrontend.awt.text.MyTextField;
import thejavalistener.fwkfrontend.awt.variuos.MyAwt;
import thejavalistener.fwkutils.string.MyString;

public class MyInstantFormTest
{
	public static void main(String[] args)
	{
		MyAwt.setWindowsLookAndFeel();
		
		
		MyInstantForm frm = new MyInstantForm("Pepino",null);
		frm.addField("num","Numero").valid(s->MyString.isInteger(s),"Debe ser entero").mask(MyTextField.MASK_INTEGER);
		frm.addField("fec","Fecha").mask(MyTextField.MASK_INTEGER);
		frm.addField("loco","Numero").valid(s->s.equals("x"),"Debe ser x");
		
		Map<String,String> ret = frm.showForm();
		
		System.out.println(ret);
	}

}

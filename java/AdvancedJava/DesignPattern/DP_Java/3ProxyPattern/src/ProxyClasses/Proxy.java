package ProxyClasses;

import OriginalClasses.*;
import OriginalClasses.Subject;

public class Proxy extends Subject 
{
	ConcreteSubject cs;
	
	@Override
	public void doSomeWork()
	{
		System.out.println("Proxy call happening now");
		//Lazy initialization
		if (cs == null)
		{
			cs = new ConcreteSubject();
		}
		
		cs.doSomeWork();
	}
}

package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {

	public static String pfile(String FILEPATH, String key)
	{
		String pf="";
		try
		{
			Properties p =new Properties();
			p.load(new FileInputStream(FILEPATH));
				pf=p.getProperty(key);
		}
		catch(Exception e)
		{
			
		}
		return pf;
	}
}

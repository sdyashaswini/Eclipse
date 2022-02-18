package testscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import generics.Base_test;
import pomscript.InstaPom;

public class InstaLogin extends Base_test
{
	
	@Test
	public void validLaogin() throws FileNotFoundException, IOException, InterruptedException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./a.properties"));
		String un=p.getProperty("un");
		String pwd=p.getProperty("pwd");
		InstaPom in=new InstaPom(driver);
		in.enterUn(un);
		in.enterPwd(pwd);
		in.login();
		Thread.sleep(5000);
		
	}

}

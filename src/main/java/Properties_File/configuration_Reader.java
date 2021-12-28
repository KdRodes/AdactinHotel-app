package Properties_File;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configuration_Reader {
public static Properties p;

 public configuration_Reader() throws Throwable {
File f=new File("C:\\Users\\GGG\\eclipse-workspace\\Maven_Project_1\\configuration.properties");
FileInputStream fis=new FileInputStream(f);
p=new Properties();
p.load(fis);
 }
	public  String getUrl() {
 String url=p.getProperty("url");
return url;
	}
public  String getusername() {
String username = p.getProperty("username");	
return username;
}
public  String getpassword() {
String password=p.getProperty("password");
return password; 
	}
	public String getCardNo() {
		String CardNo=p.getProperty("CardNo");
	return CardNo;
	}
	
	
	
}

package Properties_File;

public class File_Reader_Manager {
	public File_Reader_Manager() {
	}

public static File_Reader_Manager getinstanceFRM () {
 File_Reader_Manager frm=new File_Reader_Manager();
	return frm;
}	
	public configuration_Reader  getcr() throws Throwable {
		configuration_Reader cr=new configuration_Reader();
		return cr;

	}
	
	
	
	
	
	
	
}

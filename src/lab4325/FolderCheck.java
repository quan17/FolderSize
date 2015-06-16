package lab4325;

import java.io.File;

public class FolderCheck {

	
	public static double getDirSize(File file) {     
         
        if (file.exists()) {     
            //recursive calculation
            if (file.isDirectory()) {     
                File[] children = file.listFiles();     
                double size = 0;     
               
                for (File f : children)
                    size += getDirSize(f);     
                
                return size;     
            } else {//size in "M" 
                double size = (double) file.length() / 1024 / 1024;        
                return size;     
            }     
        } else {     
            System.out.println("folder not exist, please check");     
            return 0.0;     
        }     
    }
	public static int getDirAmount(File file) {     
        
        if (file.exists()) {     
            //recursive calculation
            if (file.isDirectory()) {     
                File[] children = file.listFiles();     
    
                int Amount=0;
                for (File f : children)     
                    Amount += getDirAmount(f);     
                
                return Amount;     
            } else {//amount ++   
                return 1;     
            }     
        } else {     
            System.out.println("folder not exist, please check");     
            return 0;     
        }     
    }
	public static String getFilename(int no) {
		String Filename;
		Filename=""+no/100+no%100/10+no%10;
		
		return Filename;
		
	}
	public static void main(String[] args){
		int FileCount=182;
		String Fname;
		for(int i=0;i<FileCount; i++){
			Fname=getFilename(i);
			File Foldername= new File("C:\\Users\\chand_000\\Desktop\\NJIT\\Thesis2\\Geolife Trajectories 1.3\\Data\\"+Fname);
			System.out.println(Fname+","+getDirSize(Foldername)+","+getDirAmount(Foldername));
		}
	}
}

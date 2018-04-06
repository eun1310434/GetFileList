package com.eun1310434.tool.getfilelist;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main (String[] args)throws Exception{
		
		String targetFilePath = "D:\\PJC\\[PJC] DOC\\[PJC-DOC] Curriculum Vitae";
		String outputPath = "C:\\Users\\ddil\\Desktop\\FileList.txt";
		writeFileList(targetFilePath, outputPath);
	}	
	
	
	public static void writeFileList(String _targetFilePath, String  _outputPath){
		String getList = getList(_targetFilePath);
		writeMemo(getList , _outputPath);
	}
	
	public static String getList(String _targetFilePath){
		String out = "";
		File[] files = new File(_targetFilePath).listFiles(); 
		for(File file : files){
			out = out + file.getAbsolutePath() + "\r\n";
		}	
		return out;
    }
	
    public static boolean writeMemo(String _txt, String _outputPath){
    	
    	BufferedWriter bw = null;
    	try {
			bw = new BufferedWriter(new FileWriter(_outputPath));
			bw.write(_txt);
			bw.close();
			
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
    }
}

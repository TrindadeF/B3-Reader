package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.biff.File;

public class Program {

	public static void main(String[] args)throws ParseException ,IOException, BiffException {
		
		Scanner sc = new Scanner(System.in);
		int count = 0 ;
		
		System.out.println("Enter the file path: ");
		String sourcefileStr = sc.nextLine();
		
		File sourceFile = new File(sourcefileStr);
		
		try(BufferedReader br = new BufferedReader (new FileReader(sourcefileStr))){
			String itemCSV = br.readLine();
			
			while (itemCSV != null) {
				System.out.println(itemCSV);
				itemCSV = br.readLine();
			}
			System.out.println(count);
		}
		catch (IOException e ){
			System.out.println("Erro " + e.getMessage());
		}
		sc.close();
	}

}

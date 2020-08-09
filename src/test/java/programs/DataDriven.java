package programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class DataDriven 
{
	public static void main(String[] args) throws IOException
	{
		int i = 0 , Rows = 0 ;
		
		String Location = "C:\\Users\\Arpith\\Bitbucket_Workspace\\Java_Practice\\";
		String FileName = "Test" ;
		File F = new File( Location + FileName + ".xlsx");
		
		XSSFSheet sheet = null;
		
		String[][] Values = { {"Header1", "Header2", "Header3"}, {"Value11", "Value12", "Value13" }, {"Value21", "Value22", "Value23"}, {"Value31", "Value32", "Value33"} };
		
		for( ; i < Values.length ; i++ )
			sheet = DataDriven.writeExcel( Location, FileName, "Data", Values) ;
		
		Rows = sheet.getLastRowNum();
		
		for( ; i < Rows ; i++ )
		{
			for( int j= 0 ; !sheet.getRow( i ).getCell( j ).getStringCellValue().equals( null ) ; j++ )
				System.out.print( DataDriven.readExcel( Location, FileName, "Data", i, j ) + " | ");
			System.out.println();
		}
		
		if( F.exists() )
		{
			for( ; i < Rows ; i++ )
			{
				for( int j= 0 ; !sheet.getRow( i ).getCell( j ).getStringCellValue().equals( null ) ; j++ )
					System.out.print( DataDriven.readExcel( Location, FileName, "Data", i, j ) + " | ");
				System.out.println();
			}
		}
	}
	
	public static XSSFSheet writeExcel( String Dir, String FileName, String Sheet, String[][] RowValues ) throws IOException 
	{
		File Directory = new File( Dir );
		
		if( !Directory.exists() )
			Directory.mkdir();
		
		FileOutputStream fos = new FileOutputStream( FileName + ".xlsx" );
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		workbook.createSheet( Sheet );
		XSSFSheet sheet = workbook.getSheet( Sheet );
		
		for( int i = 0 ; i < RowValues.length ; i++ )
		{
			XSSFRow R = sheet.createRow( i );
			for ( int j = 0 ; j < RowValues[ i ].length ; j++ )
			{
				XSSFCell C = R.createCell( j );
				C.setCellValue( RowValues[ i ][ j ] );
			}
		}
		
		workbook.write(fos);
		workbook.close();
		fos.flush();
		fos.close();

		return sheet;
	}
	
	public static String readExcel( String Dir, String FileName, String Sheet, int row, int cell ) throws IOException 
	{
		String Value = null;
		
		File File = new File( Dir + FileName + ".xlsx" );
	
		if( !File.exists() )
		{
			FileInputStream fis = new FileInputStream( Dir + FileName + ".xlsx" );
			XSSFWorkbook workbook = new XSSFWorkbook( fis );
			
			XSSFCell C = workbook.getSheet( Sheet ).getRow( row ).getCell( cell );
			
			Value = C.getStringCellValue();
			
			workbook.close();
		}
		return Value;
	}
}

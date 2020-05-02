package Project;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name="InputData")
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test
		
		// Array size is 2
		// 0,1
		Object[][] data=new Object[1][2];
		//0th row
		data[0][0]="hi.92.world2@gmail.com";
		data[0][1]="QAZWSX123edc,.help";

		
		
		
		
		return data;
		
		
		
		
		
		
	}
				
	

}

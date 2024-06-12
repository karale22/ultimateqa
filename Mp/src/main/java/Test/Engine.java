package Test;

import java.lang.reflect.Method;



public class Engine {	
	Actionkeyword actionkeyword;
	Method[] methods;
	static String keyword;


public void getKeywordsFromAction() {

actionkeyword= new Actionkeyword();
methods= actionkeyword.getClass().getMethods();

}

//functions
public void executeKeywords() throws Exception{
for(int i=0;i<methods.length;i++) {
	if(methods[i].getName().equalsIgnoreCase(keyword)) {
		methods[i].invoke(actionkeyword);
	}
}
}

public static void main(String[] args) throws Exception
{
	
	ExcelUtilities utilities = new ExcelUtilities();
	utilities.readExcelFile("C:\\Users\\PratikPatil\\Desktop\\Kdd.xlsx");

for(int row=1; row<=5; row++) 
{
	
	Engine engine = new Engine();

	engine.getKeywordsFromAction();
	keyword=utilities.getValuesFromExcel(row, 0);
	engine.executeKeywords();
}

}
}
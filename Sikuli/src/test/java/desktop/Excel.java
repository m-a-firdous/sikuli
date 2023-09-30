package desktop;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Excel {

	public static void main(String[] args) throws Throwable
	{
		Screen screen = new Screen();
		
		//Pattern minibar = new Pattern("C:\\Users\\Tayyaba\\Desktop\\AF java\\selenium\\Sikuli\\miniBar.PNG");
		//screen.click(minibar);
		
		//Thread.sleep(2000);
		Pattern searcBar = new Pattern("C:\\Users\\Tayyaba\\Desktop\\AF java\\selenium\\Sikuli\\SearchBar.PNG");
		screen.click(searcBar);
		screen.type("Excel");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Pattern cell1 = new Pattern("C:\\Users\\Tayyaba\\Desktop\\AF java\\selenium\\Sikuli\\ExcelCell.PNG");
		screen.click(cell1);
		screen.type("abdul hameed sayeed");
		
		Pattern cell2 = new Pattern("C:\\Users\\Tayyaba\\Desktop\\AF java\\selenium\\Sikuli\\ExcelCell2.PNG");
		screen.click(cell2);
		screen.type("ziya sultana");
		
		Pattern cell3 = new Pattern("C:\\Users\\Tayyaba\\Desktop\\AF java\\selenium\\Sikuli\\ExcelCell2.PNG");
		screen.click(cell3);
		screen.type("Ayesha Tayyaba");
		
		Pattern cell4 = new Pattern("C:\\Users\\Tayyaba\\Desktop\\AF java\\selenium\\Sikuli\\ExcelCell2.PNG");
		screen.click(cell4);
		screen.type("Afeefa Firdous");
		
		Pattern cell5 = new Pattern("C:\\Users\\Tayyaba\\Desktop\\AF java\\selenium\\Sikuli\\ExcelCell2.PNG");
		screen.click(cell5);
		screen.type("Asra Fatima");

	}

}

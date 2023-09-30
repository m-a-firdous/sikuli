package desktop;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class NotePad 
{
	public static void main(String[] args) throws Throwable
	{
		Screen screen = new Screen();
		
		//Pattern minibar = new Pattern("C:\\Users\\Tayyaba\\Desktop\\AF java\\selenium\\Sikuli\\miniBar.PNG");
		//screen.click(minibar);
		
		//Thread.sleep(2000);
		Pattern searcBar = new Pattern("C:\\Users\\Tayyaba\\Desktop\\AF java\\selenium\\Sikuli\\SearchBar.PNG");
		screen.click(searcBar);
		screen.type("Note pad");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//Pattern maxBar = new Pattern("C:\\Users\\Tayyaba\\Desktop\\AF java\\selenium\\Sikuli\\NotePadMaximum.PNG");
		//screen.click(maxBar);
		
		Pattern notes = new Pattern("C:\\Users\\Tayyaba\\Desktop\\AF java\\selenium\\Sikuli\\NotePad.PNG");
		screen.click(notes);
		screen.type("String s1=\"java by KARTIK sir\"; //given string\r\n"
				+ "		System.out.println(\"s1=\"+s1); //displaying string\r\n"
				+ "		System.out.println(s1.length()); //displaying string length\r\n"
				+ "		System.out.println(s1.charAt(5)); //displaying character at 5 index\r\n"
				+ "		String out1=s1.toLowerCase(); //converting string tolowercase\r\n"
				+ "		System.out.println(\"s1=\"+s1);\r\n"
				+ "		System.out.println(\"out1=\"+out1); //displaying lowercase string\r\n"
				+ "		String out2=s1.toUpperCase(); //converting string to uppercase\r\n"
				+ "		System.out.println(\"s1=\"+s1);\r\n"
				+ "		System.out.println(\"out2=\"+out2); //displaying uppercase string\r\n"
				+ "		System.out.println(s1.indexOf('a')); //displaying indexof a\r\n"
				+ "		System.out.println(s1.indexOf('a',2 )); //displaying index of a after 2nd index\r\n"
				+ "		String r1=s1.substring(4); // substracting the string from 4th index\r\n"
				+ "		System.out.println(\"r1=\"+r1);\r\n"
				+ "		String r2=s1.substring(4, 14); //substracting the index from 4 till 14\r\n"
				+ "		System.out.println(\"r2=\"+r2);");
	}
	
}

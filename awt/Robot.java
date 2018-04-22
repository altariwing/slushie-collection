import java.awt.Robot;
import java.awt.event.*; //見class KeyEvent
import java.io.*;


public class OpenTSW {
    public static void main(String[] args) throws Exception{
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_F1); //按下F1
        robot.keyRelease(KeyEvent.VK_F1); //放開F1

        robot.delay(60000); //最高60000
        System.out.println("1分鐘過去了...");
    
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE); //按ESC

        robot.mouseMove(800,620); //move yes
       
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK); //滑鼠點擊
    }
}

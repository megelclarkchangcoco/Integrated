package Portfolio;

import static org.junit.Assert.*;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import org.junit.Test;
import Portfolio2.MyFrame;
import Portfolio3.Main;
public class IntegratedTest {

	@Test
	public void Test() {
    	
       try {
            IIntegrateButtons integrateButtons = new IIntegrateButtons();
            integrateButtons.setTitle("Our Portfolio"); // Set the title   
            integrateButtons.setVisible(true); // Set visibility to true
            System.out.println("Test Passed!");
            
            // Delay in milliseconds
            Thread.sleep(100000);
            
        } catch (Exception e) {
            e.printStackTrace();
            fail("Test Failed!");
        }
    }
	
    
}














//@Test
//public void test() throws InterruptedException{
//
//	MyPortfolioFrame portfolio1 = new MyPortfolioFrame();
//	portfolio1.setVisible(true);
//	Thread.sleep(100000);
//}
//
//@Test
//public void test2() throws InterruptedException{
//	MyFrame portfolio2 = new MyFrame();
//	portfolio2.setVisible(true);
//	
//	Thread.sleep(1000000);
//}
//
//@Test
//public void test3() throws InterruptedException {
//	Main portfolio3 = new Main();
//	portfolio3.setVisible(true);
//	
//	Thread.sleep(100000);
//}

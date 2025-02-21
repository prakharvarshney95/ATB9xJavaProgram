package Nov_2024.ex_07112024_Inheritance.singleInheritance.real;

public class TestCase1 extends Common_BaseTest {
    TestCase1() {
        System.out.println("DC - Child");
    }

    void testcase1 () {
        startBrowser();
        readExcelFile();
        closeBrowser();
    }
}

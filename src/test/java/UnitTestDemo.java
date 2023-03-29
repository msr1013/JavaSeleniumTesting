import org.example.DemoTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTestDemo {

    @Test
    public void testDoSomething(){
        DemoTest demoTest = new DemoTest();
        int result = demoTest.doSomething(1,2);
        Assertions.assertEquals(3,result);
    }

    @Test
    public void testDoSomethingNegative(){
        DemoTest demoTest = new DemoTest();
        int result = demoTest.doSomething(-1,3);
        Assertions.assertEquals(2,result);
    }

    @Test
    public void testBigNumber(){
        DemoTest demoTest = new DemoTest();
        int result = demoTest.doSomething(1111111,1111111);
        Assertions.assertEquals(2222222,result);
    }


}

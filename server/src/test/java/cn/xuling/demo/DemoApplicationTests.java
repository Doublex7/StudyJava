package cn.xuling.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Test
    public void testRemove() {
        Map<String ,String> testMap = new HashMap<>();
        testMap.put("1", "test");
        testMap.put("2", "test2");

        testMap.remove("3");
        System.out.println(testMap);
    }

}

package simple.automation;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static final User EXISTED_USER = new User("existed","");
    public static final User NOT_EXISTED_USER = new User("wrong","");

    public static void main(String[] args) {
        new AuthorizationTest().testLogin();
        OrderTests orderTests = new OrderTests();
        orderTests.testCreateOrder();
        orderTests.testListOrder();

        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        System.out.println(strings);

        List<String> strings1 = Arrays.asList("1","2","3");
        System.out.println(strings1);

        Map<String, Integer> digetMap = new HashMap<>();
        digetMap.put("1",1);
        digetMap.put("2",2);
        digetMap.put("3",3);
        System.out.println(digetMap);

        strings.forEach(x -> System.out.println(digetMap.get(x)));
        System.out.println(strings.stream().filter(x -> (Integer.parseInt(x)>2)).collect(Collectors.toList()));


    }


}
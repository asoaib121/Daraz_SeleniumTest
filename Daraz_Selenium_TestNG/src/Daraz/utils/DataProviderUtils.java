package Daraz.utils;

import Daraz.constants.FrameworkConstants;
import Daraz.tests.DarazTest;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Jan 22, 2025
 * @author Amuthan Sakthivel
 * @version 1.0
 * @since 1.0
 */

public final class DataProviderUtils {
    /**
     * Private constructor to avoid external instruction
     */

    private DataProviderUtils() {}
    private static List<Map<String,String>> list=new ArrayList<>();

    /**
     * Acts as a data provider for all the test cases.
     * parallel=true indicates that each of the iteration will be run in parallel.
     *
     * @author Amuthan Sakthivel
     * Jan 22, 2021
     * @param m {@link java.lang.reflect.Method} holds the information about the testcases at runtime
     * @return Object[] containing the List. Each index of the list contains HashMap and each of them
     * contains the test data needed to run the iterations.
     *
     * @see DarazTest
     * @see Daraz.listeners.AnnotationTransformers
     */

    @DataProvider(parallel = false)
    public static Object[] getData(Method m) {
    String testname= m.getName();
    if(list.isEmpty()) {
        list= ExcelUtils.getTestDetails(FrameworkConstants.getIterationdatasheet());
    }

    List<Map<String,String>>  smallist=new ArrayList<>();

    for(int i=0;i<list.size();i++){
        if(list.get(i).get("testname").equalsIgnoreCase(testname) &&
            list.get(i).get("execute").equalsIgnoreCase("yes")){
               smallist.add(list.get(i));
            }
        }


       // list.removeAll(smallist);
        return smallist.toArray();
    }
}  //4:00

//package Daraz.utils;
//
//import Daraz.constants.FrameworkConstants;
//import Daraz.tests.AmazonTest;
//import org.testng.annotations.DataProvider;
//
//import java.lang.reflect.Method;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//public final class DataProviderUtils {
//    private DataProviderUtils() {}
//
//    private static List<Map<String, String>> list = new ArrayList<>();
//
//    @DataProvider(parallel = false)
//    public static Object[] getData(Method m) {
//        String testname = m.getName();
//        if (list.isEmpty()) {
//            list = ExcelUtils.getTestDetails(FrameworkConstants.getIterationdatasheet());
//        }
//
//        List<Map<String, String>> smallist = new ArrayList<>();
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).get("testname").equalsIgnoreCase(testname) &&
//                    list.get(i).get("execute").equalsIgnoreCase("yes")) {
//                smallist.add(list.get(i));
//            }
//        }
//        return smallist.toArray();
//    }
//}


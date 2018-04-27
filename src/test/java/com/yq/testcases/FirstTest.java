package com.yq.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by king on 2018/4/14.
 */
public class FirstTest extends BeasTest{


    @Test
    @Parameters({"a","b" ,"c"})
    public void add_test(int a, int b ,int c){
        System.out.println(String.format("a: %d ; b: %d ; c: %d" ,a ,b ,c));
        Assert.assertEquals(calc.add(a,b), c);

    }

    @DataProvider(name = "jian")
    public Object[][] jian_data(){
        return new Object[][]{
                {5 ,3 ,2},
                {6 , 4, 2}
        };
    }
    @Test(dataProvider = "jian")
    public void jian_test(int a, int b, int c){
        System.out.println(String.format("a: %d ; b: %d ; c: %d" ,a ,b ,c));

        Assert.assertEquals(calc.jian( a,b), c);
    }

    @DataProvider
    public Object[][] eq_data(){
        return new Object[][]{
                {3,4,false}
        };
    }
    @Test(dataProvider = "eq_data")
    public void test_eq(int a, int b, boolean c) {
        Assert.assertEquals(calc.eq(a,b) ,c);
    }

    @Test
    public void aaad_test01(){
        System.out.println(calc.aaad());

        Assert.assertEquals(calc.aaad() , 2);
    }

    @Test
    public void aaad_test02(){
        System.out.println(calc.aaad());

        Assert.assertEquals(calc.aaad() ,2);
    }
}

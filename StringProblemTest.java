package teksystem.exercise;

import org.junit.Assert;
import org.junit.Test;

public class StringProblemTest {
    
    @Test
    public void testReplaceStringPlainWayPositive(){
        Assert.assertEquals("dttobereplcedsdsdsfddddd", StringProblem.replaceStringPlainWay("datatobereplacedsdsadsaaaaaaaaafddddd", 'a'));
                
    }
    
    @Test
    public void testReplaceStringPlainWayNegative(){
        Assert.assertEquals("datatobereplacedsdsadsaaaaaaaaafddddd", StringProblem.replaceStringPlainWay("datatobereplacedsdsadsaaaaaaaaafddddd", 'z'));
                
    }
    
    
    
    @Test
    public void testReplaceStringUtilityWayPositive(){
        Assert.assertEquals("dttobereplcedsdsdsfddddd", StringProblem.replaceStringUtilityWay("datatobereplacedsdsadsaaaaaaaaafddddd", 'a'));
                
    }
    
    @Test
    public void testReplaceStringUtilityWayNegative(){
        Assert.assertEquals("datatobereplacedsdsadsaaaaaaaaafddddd", StringProblem.replaceStringUtilityWay("datatobereplacedsdsadsaaaaaaaaafddddd", 'z'));
                
    }

}

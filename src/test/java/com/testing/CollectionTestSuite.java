package com.testing;

import com.testing.collection.OddNumbersExterminator;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CollectionTestSuite {
    static int counter = 0;
    @Before
    public void before() {
        counter++;
        System.out.println("Test Case nr: #" + counter + " begin");
    }
    @After
    public void after() {
        System.out.println("Test Casenr: #" + counter + "end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    ArrayList<Integer> emptyList = new ArrayList<Integer>();
    ArrayList<Integer> normalList = new ArrayList<Integer>();

    @Test
    public void T1_OddNumbersEmpty()
    {
        //Given
        OddNumbersExterminator oddNumbersExterminator= new OddNumbersExterminator();
        //When
        ArrayList<Integer> result= oddNumbersExterminator.exterminate(emptyList);
        //Then
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void T2_OddNumbersNormal()
    {
//Given
        normalList.addAll(Arrays.asList(2,3,4,5,6));
        OddNumbersExterminator oddNumbersExterminator= new OddNumbersExterminator();
        //When
        ArrayList<Integer> result= oddNumbersExterminator.exterminate(normalList);
        //Then
        Assert.assertEquals(3, result.size());
    }
}



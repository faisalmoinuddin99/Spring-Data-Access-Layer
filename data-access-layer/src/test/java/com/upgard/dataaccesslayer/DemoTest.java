package com.upgard.dataaccesslayer;

import org.junit.jupiter.api.*;

public class DemoTest {

    @BeforeAll
    public static void setupTestEnvironment(){
        System.out.println("Setting up test environment");
    }
    @BeforeEach
    public void setupInitialData(){
        System.out.println("setting up initial test data");
    }

    @Test
    public void test1(){
        System.out.println("Running Test 1");
    }

    @Test
    public void test2(){
        System.out.println("Running Test 2");
    }

    @AfterEach
    public void cleanTestData(){
        System.out.println("Cleaning test data");
    }

    @AfterAll
    public static void tearDownTestEnvironment(){
        System.out.println("Tearing down the test environment");
    }
/*
OUTPUT:
        Setting up test environment
        setting up initial test data
        Running Test 1
        Cleaning test data
        setting up initial test data
        Running Test 2
        Cleaning test data
        Tearing down the test environment
 */

}

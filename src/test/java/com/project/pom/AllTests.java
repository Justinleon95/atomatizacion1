package com.project.pom;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Register_Test.class, Signin_Test.class,Search_Test.class})
//@SuiteClasses({ Search_Test.class})
public class AllTests {

}

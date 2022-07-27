package com.Tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({TestLogin.class, TestRegister.class})
public class TestSuite
{
}
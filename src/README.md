# TestCustomerAdvanced.java
## Pass
```
  @Test
	// Test that constructor correctly updates the attributes and get method returns it:
	//     attribute Id
	public void testConstructorAttributeId() {
		String message = "Id value passed to Customer Constructor does not match one returned by get method";
		int id = 5;
		int time = 10;
		int enter = 6;
		int exit = 8;
		Customer cust = new Customer(id, time, enter, exit); // new instance of Customer
		assertEquals(message, id, cust.getId());  // expect same value as passed to constructor
	}
  @Test
	// Test that constructor correctly updates the attributes and get method returns it:
	//     attribute arrival
	public void testConstructorAttributeArrival() {
		String message = "arrival value passed to Customer Constructor does not match one returned by get method";
		int id = 5;
		int time = 10;
		int enter = 6;
		int exit = 8;
		Customer cust = new Customer(id, time, enter, exit); // new instance of Customer
		assertEquals(message, time, cust.getArrival());  // expect same value as passed to constructor
	}
	@Test
	// Test that constructor correctly updates the attributes and get method returns it:
	//     attribute enterStop
	public void testConstructorAttributeEnter() {
		String message = "enter value passed to Customer Constructor does not match one returned by get method";
		int id = 5;
		int time = 10;
		int enter = 6;
		int exit = 8;
		Customer cust = new Customer(id, time, enter, exit); // new instance of Customer
		assertEquals(message, enter, cust.getEnter());  // expect same value as passed to constructor
	}
	@Test
	// Test that constructor correctly updates the attributes and get method returns it:
	//     attribute status
	public void testConstructorAttributeStatus() {
		String message = "status value set in Customer Constructor does not match one returned by get method";
		int id = 5;
		int time = 10;
		int enter = 6;
		int exit = 8;
		Customer cust = new Customer(id, time, enter, exit); // new instance of Customer
		assertEquals(message, Customer.CUST_NOT_PROCESSED, cust.getStatus());  // expect status to be set to CUST_NOT_PROCESSED constant
	}
	@Test
	// Test that setStatus correctly updates the attributes and get method returns it:
	//     attribute status set to CUST_ENTERED
	public void testConstructorMethodSetStatusValue1() {
		String message = "status value set in setStatus(int) does not match one returned by get method";
		int id = 5;
		int time = 10;
		int enter = 6;
		int exit = 8;
		Customer cust = new Customer(id, time, enter, exit); // new instance of Customer
		cust.setStatus(Customer.CUST_ENTERED);  // set status to allowed value
		assertEquals(message, Customer.CUST_ENTERED, cust.getStatus());  // expect status to be set to value of CUST_ENTERED
	}
-------------------------------------------------------------
Reason for failiure ↑↑↑
java.lang.AssertionError: Constructor should throw exception for invalid value of id
	at org.junit.Assert.fail(Assert.java:89)
	at TestCustomerAdvanced.testIdZeroValue(TestCustomerAdvanced.java:132)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
	at org.junit.runners.BlockJUnit4ClassRunner$1.evaluate(BlockJUnit4ClassRunner.java:100)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:366)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:103)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:63)
	at org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)
	at org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)
	at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:413)
	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:93)
	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:530)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:758)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:453)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:211)

-------------------------------------------------------------
	@Test
	// Test that setStatus correctly updates the attributes and get method returns it:
	//     attribute status set to CUST_EXITED
	public void testConstructorMethodSetStatusValue2() {
		String message = "status value set in setStatus(int) does not match one returned by get method";
		int id = 5;
		int time = 10;
		int enter = 6;
		int exit = 8;
		Customer cust = new Customer(id, time, enter, exit); // new instance of Customer
		cust.setStatus(Customer.CUST_EXITED);  // set status to allowed value
		assertEquals(message, Customer.CUST_EXITED, cust.getStatus());  // expect status to be set to value of CUST_EXITED
	}
-------------------------------------------------------------
Reason of Failure ↑↑↑
java.lang.AssertionError: Constructor should throw exception for invalid value of id
	at org.junit.Assert.fail(Assert.java:89)
	at TestCustomerAdvanced.testIdZeroValue(TestCustomerAdvanced.java:132)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
	at org.junit.runners.BlockJUnit4ClassRunner$1.evaluate(BlockJUnit4ClassRunner.java:100)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:366)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:103)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:63)
	at org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)
	at org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)
	at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:413)
	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:93)
	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:530)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:758)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:453)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:211)


-------------------------------------------------------------
```
## Errors
```
```
## Fail
```
	@Test
	// test that if id attribute is negative throws IllegalArgumentException
	public void testIdNegativeValue()
	{
		try {
			int id = -3;  // invalid value of id
			int time = 10;
			int enter = 6;
			int exit = 8;
			new Customer(id, time, enter, exit); // new instance of Customer
			fail("Constructor should throw exception for invalid value of id");  // if get here no exception was thrown
		} catch (Exception e) {
            if (e instanceof IllegalArgumentException)
                assertTrue(true); // if here, caught exception
           else
                 fail("Caught exception but it was not IllegalArgumentException as documented");
		}
	}

	@Test
	// test that if id attribute is zero throws IllegalArgumentException
	public void testIdZeroValue()
	{
		try {
			int id = 0;  // invalid value of id
			int time = 10;
			int enter = 6;
			int exit = 8;
			new Customer(id, time, enter, exit); // new instance of Customer
			fail("Constructor should throw exception for invalid value of id");  // if get here no exception was thrown
		} catch (Exception e) {
            if (e instanceof IllegalArgumentException)
                assertTrue(true); // if here, caught exception
           else
                 fail("Caught exception but it was not IllegalArgumentException as documented");
		}
	}	
```

# TestCustomerBasics.java
## Pass
```
```
## Errors
```
```
## Fail
```
```

# TestSimulatorAdvanced.java
## Pass
```
```
## Errors
```
```
## Fail
```
```

# TestSimulatorBasics.java
## Pass
```
```
## Errors
```
```
## Fail
```
```

# TestTrainAdvanced.java
## Pass
```
```
## Errors
```
```
## Fail
```
```

# TestTrainBasics.java
## Pass
```
```
## Errors
```
```
## Fail
```
```



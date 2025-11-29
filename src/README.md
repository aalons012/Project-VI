PLEASE LOOK AT THE OUTLINE BEFORE CONTINUING
# After - Everything passed :))
# BEFORE FIXING CODE ↓↓↓
## TestCustomerAdvanced.java
### Pass
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
```
### Errors: None
### Fail
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
-------------------------------------------------------------
Reason of Failure ↑↑↑
java.lang.AssertionError: Constructor should throw exception for invalid value of arrival
	at org.junit.Assert.fail(Assert.java:89)
	at TestCustomerAdvanced.testArrivalNegativeValue(TestCustomerAdvanced.java:151)
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
	// test that if arrival attribute is negative throws IllegalArgumentException
	public void testArrivalNegativeValue()
	{
		try {
			int id = 5;  
			int time = -1; // invalid value of arrival attribute
			int enter = 6;
			int exit = 8;
			new Customer(id, time, enter, exit); // new instance of Customer
			fail("Constructor should throw exception for invalid value of arrival");  // if get here no exception was thrown
		} catch (Exception e) {
            if (e instanceof IllegalArgumentException)
                assertTrue(true); // if here, caught exception
           else
                 fail("Caught exception but it was not IllegalArgumentException as documented");
		}
	}
-------------------------------------------------------------
Reasons of Failure ↑↑↑
java.lang.AssertionError: Constructor should throw exception for invalid value of arrival
	at org.junit.Assert.fail(Assert.java:89)
	at TestCustomerAdvanced.testArrivalNegativeValue(TestCustomerAdvanced.java:151)
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
	// test that if arrival attribute is zero throws IllegalArgumentException
	public void testArrivalZeroValue()
	{
		try {
			int id = 5;  
			int time = 0;   // invalid value of arrival attribute
			int enter = 6;
			int exit = 8;
			new Customer(id, time, enter, exit); // new instance of Customer
			fail("Constructor should throw exception for invalid value of arrival");  // if get here no exception was thrown
		} catch (Exception e) {
            if (e instanceof IllegalArgumentException)
                assertTrue(true); // if here, caught exception
           else
                 fail("Caught exception but it was not IllegalArgumentException as documented");
		}
	}
-------------------------------------------------------------
Reason of Failure ↑↑↑
java.lang.AssertionError: Constructor should throw exception for invalid value of arrival
	at org.junit.Assert.fail(Assert.java:89)
	at TestCustomerAdvanced.testArrivalZeroValue(TestCustomerAdvanced.java:169)
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
	// test that if enter attribute is negative throws IllegalArgumentException
	public void testEnterNegativeValue()
	{
		try {
			int id = 5;  
			int time = 10;
			int enter = -1;  // invalid value of enter
			int exit = 8;
			new Customer(id, time, enter, exit); // new instance of Customer
			fail("Constructor should throw exception for invalid value of enter");  // if get here no exception was thrown
		} catch (Exception e) {
            if (e instanceof IllegalArgumentException)
                assertTrue(true); // if here, caught exception
           else
                 fail("Caught exception but it was not IllegalArgumentException as documented");
		}
	}
-------------------------------------------------------------
reason of Failure ↑↑↑
java.lang.AssertionError: Constructor should throw exception for invalid value of enter
	at org.junit.Assert.fail(Assert.java:89)
	at TestCustomerAdvanced.testEnterNegativeValue(TestCustomerAdvanced.java:188)
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
	// test that if enter attribute is zero throws IllegalArgumentException
	public void testEnterZeroValue()
	{
		try {
			int id = 5;  
			int time = 10;
			int enter = 0;  // invalid value of enter
			int exit = 8;
			new Customer(id, time, enter, exit); // new instance of Customer
			fail("Constructor should throw exception for invalid value of enter");  // if get here no exception was thrown
		} catch (Exception e) {
            if (e instanceof IllegalArgumentException)
                assertTrue(true); // if here, caught exception
           else
                 fail("Caught exception but it was not IllegalArgumentException as documented");
		}
	}
-------------------------------------------------------------
Reason of Failure ↑↑↑
java.lang.AssertionError: Constructor should throw exception for invalid value of enter
	at org.junit.Assert.fail(Assert.java:89)
	at TestCustomerAdvanced.testEnterZeroValue(TestCustomerAdvanced.java:206)
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
	// test that if exit attribute is negative throws IllegalArgumentException
	public void testExitNegativeValue()
	{
		try {
			int id = 5;  
			int time = 10;
			int enter = 6;  
			int exit = -1; // invalid value of exit
			new Customer(id, time, enter, exit); // new instance of Customer
			fail("Constructor should throw exception for invalid value of exit");  // if get here no exception was thrown
		} catch (Exception e) {
            if (e instanceof IllegalArgumentException)
                assertTrue(true); // if here, caught exception
           else
                 fail("Caught exception but it was not IllegalArgumentException as documented");
		}
	}
-------------------------------------------------------------
reason of Failure ↑↑↑
java.lang.AssertionError: Constructor should throw exception for invalid value of exit
	at org.junit.Assert.fail(Assert.java:89)
	at TestCustomerAdvanced.testExitNegativeValue(TestCustomerAdvanced.java:225)
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
	// test that if exit attribute is zero throws IllegalArgumentException
	public void testExitZeroValue()
	{
		try {
			int id = 5;  
			int time = 10;
			int enter = 6;  
			int exit = 0;  // invalid value of exit
			new Customer(id, time, enter, exit); // new instance of Customer
			fail("Constructor should throw exception for invalid value of enter");  // if get here no exception was thrown
		} catch (Exception e) {
            if (e instanceof IllegalArgumentException)
                assertTrue(true); // if here, caught exception
           else
                 fail("Caught exception but it was not IllegalArgumentException as documented");
		}
	}
-------------------------------------------------------------
reason of failure ↑↑
java.lang.AssertionError: Constructor should throw exception for invalid value of enter
	at org.junit.Assert.fail(Assert.java:89)
	at TestCustomerAdvanced.testExitZeroValue(TestCustomerAdvanced.java:243)
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
	// test that if status attribute is something other than one of the constants it throws IllegalArgumentException
	public void testStatusInvalidLess()
	{
		try {
			int id = 5;  
			int time = 10;
			int enter = 6;  
			int exit = 8;  // invalid value of exit
			Customer cust = new Customer(id, time, enter, exit); // new instance of Customer
			cust.setStatus(Customer.CUST_NOT_PROCESSED-1);  // less than lowest constant
			fail("Constructor should throw exception for invalid value of enter");  // if get here no exception was thrown
		} catch (Exception e) {
            if (e instanceof IllegalArgumentException)
                assertTrue(true); // if here, caught exception
           else
                 fail("Caught exception but it was not IllegalArgumentException as documented");
		}
	}
-------------------------------------------------------------
reason of failure ↑↑↑
java.lang.AssertionError: Constructor should throw exception for invalid value of enter
	at org.junit.Assert.fail(Assert.java:89)
	at TestCustomerAdvanced.testStatusInvalidLess(TestCustomerAdvanced.java:263)
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
	// test that if status attribute is something other than one of the constants it throws IllegalArgumentException
	public void testStatusInvalidHigher()
	{
		try {
			int id = 5;  
			int time = 10;
			int enter = 6;  
			int exit = 8;  // invalid value of exit
			Customer cust = new Customer(id, time, enter, exit); // new instance of Customer
			cust.setStatus(Customer.CUST_EXITED+1);  // less than highest constant
			fail("Constructor should throw exception for invalid value of enter");  // if get here no exception was thrown
		} catch (Exception e) {
            if (e instanceof IllegalArgumentException)
                assertTrue(true); // if here, caught exception
           else
                 fail("Caught exception but it was not IllegalArgumentException as documented");
		}
	}	
-------------------------------------------------------------
reason of failure ↑↑↑
java.lang.AssertionError: Constructor should throw exception for invalid value of enter
	at org.junit.Assert.fail(Assert.java:89)
	at TestCustomerAdvanced.testStatusInvalidHigher(TestCustomerAdvanced.java:283)
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
## TestCustomerBasics.java
* All Passed
* No Errors nor Failed

## TestSimulatorAdvanced.java
### Pass
```
	@Test
	// Test that there is correct prompt for file and enter expects that file
	// MUST HAVE customer file at C:/train/customer-data.txt 
	// If file does not exists, the test will fail with java.util.NoSuchElementException: No line found
	public  void testgetInputFilePrompt()
	{
		String message = "Enter absolute path for data file or for default (C:/train/customer-data.txt) press Enter:";

	    ByteArrayInputStream in = new ByteArrayInputStream("\n".getBytes());  // input enter
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		sim.getInputFile();  // call method to get file name
		String output = outContent.toString();
 
		assertTrue(output.contains(message));  // check that output has the correct prompt
	}
	@Test
	// Test that if user presses enter and file not exists, he gets error message
	// MUST have src/customer file
	public  void testgetInputFileNotExist()
	{
		String message = "File not found, try again.";

	    ByteArrayInputStream in = new ByteArrayInputStream("blahblah\nsrc/customer".getBytes());  // input enter
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		sim.getInputFile();  // call method to get file name
		String output = outContent.toString();
 
		assertTrue(output.contains(message));  // check that output has the error message
	}
	@Test
	// Test that if user presses enter and file not exists, there will be multiple prompts
	// MUST have src/customer file
	public  void testgetInputFilePromptLoop()
	{
		String message = "Enter absolute path for data file or for default \\(C:\\/train\\/customer-data.txt\\) press Enter:";

	    ByteArrayInputStream in = new ByteArrayInputStream("blahblah\nblah\nsrc/customer".getBytes());  // input enter
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		sim.getInputFile();  // call method to get file name
		String output = outContent.toString();
 
		int count = output.split(message, -1).length-1;  // count number of occurrences of prompt in output
	    assertEquals(3, count); // expect three prompt messages
	}
	@Test
	// Test that for id < 0, get error message 
	// MUST HAVE customer files at src/customer  and src/bad-id
	// If file does not exists, the test will fail 
	public  void testCheckFileIdInvalid()
	{
		String message = "Data in input file is not correct. Try again.";

	    ByteArrayInputStream in = new ByteArrayInputStream("src/bad-id\nsrc/customer".getBytes());  // input enter
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		File file = sim.getInputFile();  // call method to get file name
		ArrayList<Customer> list = sim.checkFile(7,file);
		String output = outContent.toString();
 
		assertTrue(output.contains(message));  // passes if message is in output
		assertTrue("Expected list==null",list==null);
	}
	@Test
	// Test that for id non-integer gets error message 
	// MUST HAVE customer files at src/customer  and src/bad-id2
	// If file does not exists, the test will fail 
	public  void testCheckFtileIdInvalid2()
	{
		String message = "Each line must have four integers. Try again.";

	    ByteArrayInputStream in = new ByteArrayInputStream("src/bad-id2\nsrc/customer".getBytes());  // input enter
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		File file = sim.getInputFile();  // call method to get file name
		ArrayList<Customer> list = sim.checkFile(7,file);
		String output = outContent.toString();
 
		assertTrue(output.contains(message));  // passes if message is in output
		assertTrue("Expected list==null",list==null);
	}
	@Test
	// Test that for enter < 1, get error message 
	// MUST HAVE customer files at src/customer  and src/bad-enter
	// If file does not exists, the test will fail 
	public  void testCheckFileEnterInvalid()
	{
		String message = "Data in input file is not correct. Try again.";

	    ByteArrayInputStream in = new ByteArrayInputStream("src/bad-enter\nsrc/customer".getBytes());  // input enter
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		File file = sim.getInputFile();  // call method to get file name
		ArrayList<Customer> list = sim.checkFile(7,file);
		String output = outContent.toString();
 
		assertTrue(output.contains(message));  // passes if message is in output
		assertTrue("Expected list==null",list==null);
	}
	@Test
	// Test that for enter non-integer gets error message 
	// MUST HAVE customer files at src/customer  and src/bad-enter2
	// If file does not exists, the test will fail 
	public  void testCheckFileEnterInvalid2()
	{
		String message = "Each line must have four integers. Try again.";

	    ByteArrayInputStream in = new ByteArrayInputStream("src/bad-enter2\nsrc/customer".getBytes());  // input enter
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		File file = sim.getInputFile();  // call method to get file name
		ArrayList<Customer> list = sim.checkFile(7,file);
		String output = outContent.toString();
 
		assertTrue(output.contains(message));  // passes if message is in output
		assertTrue("Expected list==null",list==null);
	}
	@Test
	// Test that for enter > stops, get error message 
	// MUST HAVE customer files at src/customer  and src/bad-enter3
	// If file does not exists, the test will fail 
	public  void testCheckFileEnterInvalid3()
	{
		String message = "Data in input file is not correct. Try again.";

	    ByteArrayInputStream in = new ByteArrayInputStream("src/bad-enter3\nsrc/customer".getBytes());  // input enter
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		File file = sim.getInputFile();  // call method to get file name
		ArrayList<Customer> list = sim.checkFile(7,file);
		String output = outContent.toString();
 
		assertTrue(output.contains(message));  // passes if message is in output
		assertTrue("Expected list==null",list==null);
	}
	@Test
	// Test that for exit < 1, get error message 
	// MUST HAVE customer files at src/customer  and src/bad-exit
	// If file does not exists, the test will fail 
	public  void testCheckFileExitInvalid()
	{
		String message = "Data in input file is not correct. Try again.";

	    ByteArrayInputStream in = new ByteArrayInputStream("src/bad-exit\nsrc/customer".getBytes());  // input enter
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		File file = sim.getInputFile();  // call method to get file name
		ArrayList<Customer> list = sim.checkFile(7,file);
		String output = outContent.toString();
 
		assertTrue(output.contains(message));  // passes if message is in output
		assertTrue("Expected list==null",list==null);
	}
	@Test
	// Test that for exit non-integer gets error message 
	// MUST HAVE customer files at src/customer  and src/bad-exit2
	// If file does not exists, the test will fail 
	public  void testCheckFileExitInvalid2()
	{
		String message = "Each line must have four integers. Try again.";

	    ByteArrayInputStream in = new ByteArrayInputStream("src/bad-exit2\nsrc/customer".getBytes());  // input enter
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		File file = sim.getInputFile();  // call method to get file name
		ArrayList<Customer> list = sim.checkFile(7,file);
		String output = outContent.toString();
 
		assertTrue(output.contains(message));  // passes if message is in output
		assertTrue("Expected list==null",list==null);
	}
	@Test
	// Test that for exit > stops, get error message 
	// MUST HAVE customer files at src/customer  and src/bad-exit3
	// If file does not exists, the test will fail 
	public  void testCheckFileExitInvalid3()
	{
		String message = "Data in input file is not correct. Try again.";

	    ByteArrayInputStream in = new ByteArrayInputStream("src/bad-exit3\nsrc/customer".getBytes());  // input enter
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		File file = sim.getInputFile();  // call method to get file name
		ArrayList<Customer> list = sim.checkFile(7,file);
		String output = outContent.toString();
 
		assertTrue(output.contains(message));  // passes if message is in output
		assertTrue("Expected list==null",list==null);
	}
	@Test
	// Test that for duplicate id, get error message 
	// MUST HAVE customer files at src/customer  and src/bad-dup-id
	// If file does not exists, the test will fail 
	public  void testCheckFileDupId()
	{
		String message = "Data in input file is not correct. Try again.";

	    ByteArrayInputStream in = new ByteArrayInputStream("src/bad-dup-id\nsrc/customer".getBytes());  // input enter
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		File file = sim.getInputFile();  // call method to get file name
		ArrayList<Customer> list = sim.checkFile(7,file);
		String output = outContent.toString();
 
		assertTrue(output.contains(message));  // passes if message is in output
		assertTrue("Expected list==null",list==null);
	}
	@Test
	// Test that for enter==exit, get error message 
	// MUST HAVE customer files at src/customer  and src/bad-enter-exit
	// If file does not exists, the test will fail 
	public  void testCheckFileEnterExit()
	{
		String message = "Data in input file is not correct. Try again.";

	    ByteArrayInputStream in = new ByteArrayInputStream("src/bad-enter-exit\nsrc/customer".getBytes());  // input enter
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		File file = sim.getInputFile();  // call method to get file name
		ArrayList<Customer> list = sim.checkFile(7,file);
		String output = outContent.toString();
 
		assertTrue(output.contains(message));  // passes if message is in output
		assertTrue("Expected list==null",list==null);
	}
	@Test
	// Test that for time < 1, get error message 
	// MUST HAVE customer files at src/customer  and src/bad-time
	// If file does not exists, the test will fail 
	public  void testCheckFileTimeInvalid()
	{
		String message = "Data in input file is not correct. Try again.";

	    ByteArrayInputStream in = new ByteArrayInputStream("src/bad-time\nsrc/customer".getBytes());  // input enter
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		File file = sim.getInputFile();  // call method to get file name
		ArrayList<Customer> list = sim.checkFile(7,file);
		String output = outContent.toString();
 
		assertTrue(output.contains(message));  // passes if message is in output
		assertTrue("Expected list==null",list==null);
	}
	@Test
	// Test that for time non-integer gets error message 
	// MUST HAVE customer files at src/customer  and src/bad-time2
	// If file does not exists, the test will fail 
	public  void testCheckFileTimeInvalid2()
	{
		String message = "Each line must have four integers. Try again.";

	    ByteArrayInputStream in = new ByteArrayInputStream("src/bad-time2\nsrc/customer".getBytes());  // input enter
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		File file = sim.getInputFile();  // call method to get file name
		ArrayList<Customer> list = sim.checkFile(7,file);
		String output = outContent.toString();
 
		assertTrue(output.contains(message));  // passes if message is in output
		assertTrue("Expected list==null",list==null);
	}
```
## Errors
```
	@Test
	// Check that get correct prompt from method getStopsFromUser   
	public  void testgetStopsFromUserPrompt()
	{
		String promptMessage = "Enter number of stops the train has on its route (must be greater than 1):";
	    ByteArrayInputStream in = new ByteArrayInputStream("7".getBytes());
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		sim.getStopsFromUser();  // call method to get number of stops
		String prompt = outContent.toString().trim();
		assertEquals(promptMessage, prompt);		
	}
-------------------------------------------------------------
what was the error? ↑↑↑
java.util.NoSuchElementException: No line found
	at java.base/java.util.Scanner.nextLine(Scanner.java:1677)
	at Simulator.getStopsFromUser(Simulator.java:52)
	at TestSimulatorAdvanced.testgetStopsFromUserPrompt(TestSimulatorAdvanced.java:49)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
	at org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)
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
	// Test that 0 is caught as invalid input and user gets re-prompted
	public  void testgetStopsFromUserPromptLoop()
	{
		String message = "Invalid input, try again";

	    ByteArrayInputStream in = new ByteArrayInputStream("0\n7".getBytes());  // input 0 on first prompt and 7 on next
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		sim.getStopsFromUser();  // call method to get number of stops
		String prompt = outContent.toString().trim();

		assertTrue(prompt.contains(message));  // check that output has the error message
	}
-------------------------------------------------------------
what was the error? ↑↑↑
java.util.NoSuchElementException: No line found
	at java.base/java.util.Scanner.nextLine(Scanner.java:1677)
	at Simulator.getStopsFromUser(Simulator.java:52)
	at TestSimulatorAdvanced.testgetStopsFromUserPromptLoop(TestSimulatorAdvanced.java:64)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
	at org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)
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
	// Test that non-integer is caught as invalid input and user gets re-prompted
	public  void testgetStopsFromUserPromptLoop2()
	{
		String message = "Invalid input, try again";

	    ByteArrayInputStream in = new ByteArrayInputStream("n\n7".getBytes());  // input n on first prompt and 7 on next
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		sim.getStopsFromUser();  // call method to get number of stops
		String prompt = outContent.toString().trim();

		assertTrue(prompt.contains(message));  // check that output has the error message
	}
-------------------------------------------------------------
what was the error? ↑↑↑
java.util.NoSuchElementException: No line found
	at java.base/java.util.Scanner.nextLine(Scanner.java:1677)
	at Simulator.getStopsFromUser(Simulator.java:52)
	at TestSimulatorAdvanced.testgetStopsFromUserPromptLoop2(TestSimulatorAdvanced.java:80)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
	at org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)
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
	// Test that get correct customer list 
	// MUST HAVE customer files at src/customer  
	// If file does not exists, the test will fail 
	public  void testCheckFileCustomerList()
	{
		boolean found = true;
	    ByteArrayInputStream in = new ByteArrayInputStream("src/customer".getBytes());  // input enter
	    System.setIn(in);

	    Customer c1 = new Customer(1, 1, 1, 2);
	    Customer c2 = new Customer(2, 2, 1, 3);
	    
		Simulator sim = new Simulator();  // new instance of Simulator
		File file = sim.getInputFile();  // call method to get file name
		ArrayList<Customer> list = sim.checkFile(7,file);
		
		if (list.get(0).getId() != c1.getId() || list.get(0).getArrival() != c1.getArrival()
				|| list.get(0).getEnter() != c1.getEnter() || list.get(0).getExit() != c1.getExit())   
			found = false;
		if (list.get(1).getId() != c2.getId() || list.get(1).getArrival() != c2.getArrival()
				|| list.get(1).getEnter() != c2.getEnter() || list.get(1).getExit() != c2.getExit())   
			found = false;
 
		assertTrue("Expected list with 2 customers", found);  // passes if message is in output
	}
-------------------------------------------------------------
What was the error??
java.lang.NullPointerException: Cannot invoke "java.util.ArrayList.get(int)" because "list" is null
	at TestSimulatorAdvanced.testCheckFileCustomerList(TestSimulatorAdvanced.java:432)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
	at org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)
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
### Fail
```
	@Test
	// Test that if user presses enter and file not exists, he gets error message
	// MUST NOT HAVE customer file at C:/train/customer-data.txt
	// MUST have src/customer file
	public  void testgetInputFileDefaultFail()
	{
		String message = "File not found, try again.";

	    ByteArrayInputStream in = new ByteArrayInputStream("\nsrc/customer".getBytes());  // input enter
	    System.setIn(in);

		Simulator sim = new Simulator();  // new instance of Simulator
		sim.getInputFile();  // call method to get file name
		String output = outContent.toString();
 
		assertTrue(output.contains(message));  // check that output has the error message
	}
-------------------------------------------------------------
Reason for failure ↑↑↑
java.lang.AssertionError
	at org.junit.Assert.fail(Assert.java:87)
	at org.junit.Assert.assertTrue(Assert.java:42)
	at org.junit.Assert.assertTrue(Assert.java:53)
	at TestSimulatorAdvanced.testgetInputFileDefaultFail(TestSimulatorAdvanced.java:119)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
	at org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)
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

## TestSimulatorBasics.java
* All Passed
* No Errors nor Failed

## TestTrainAdvanced.java
* All Passed
* No Errors nor Failed

## TestTrainBasics.java
### Pass
```
	@Test
	// Check that there is a class Train
	public void testCustomerClassExists() {
	    try {
	        Class.forName("Train");
	    } catch (ClassNotFoundException e) 
	    {
	        fail("Should have a class called Train");
	    }
	}
	@Test
	// Check that Constructor exists: public Customer(int,int,int,int)
	public void testTrainConstructorExists()
	{
		boolean found = false;  
		Constructor list[] = Train.class.getConstructors();  // get all constructors
		for(int i = 0; i < list.length; i++)  // loop through list of Constructors
		{
			String value = ""+list[i]; // convert to string
			if (value.contentEquals("public Train(int,java.util.ArrayList)"))
				found = true;
		}
		if (!found)
			fail("Train class should have a constructor with stops and custList values for attributes");
 	}
	@Test
	// Check that Train has the required attribute: 
	//     private ArrayList<Customer> Train.custList
	public void testAttributeCustList()
	{
		boolean found = false;  
		Field list[] = Train.class.getDeclaredFields();  // get all attributes
		for(int i = 0; i < list.length; i++) // loop through list of attributes
		{
			String value = ""+list[i]; // convert to string
			if (value.contentEquals("private java.util.ArrayList Train.custList"))
				found = true;
		}
		if (!found)
			fail("Train class should have a private custList attribute of type ArrayList<Customer>");
	}
	@Test
	// Check that Train has the required attribute: 
	//     private int Customer.stops
	public void testAttributeStops()
	{
		boolean found = false;  
		Field list[] = Train.class.getDeclaredFields();  // get all attributes
		for(int i = 0; i < list.length; i++) // loop through list of attributes
		{
			String value = ""+list[i]; // convert to string
			if (value.contentEquals("private int Train.stops"))
				found = true;
		}
		if (!found)
			fail("Train class should have a private stops attribute of type integer");
	}
	@Test
	// Check that Train has the required attribute: 
	//     private int Train.madeStops
	public void testAttributeMadeStops()
	{
		boolean found = false;  
		Field list[] = Train.class.getDeclaredFields();  // get all attributes
		for(int i = 0; i < list.length; i++) // loop through list of attributes
		{
			String value = ""+list[i]; // convert to string
			if (value.contentEquals("private int Train.madeStops"))
				found = true;
		}
		if (!found)
			fail("Train class should have a private madeStops attribute of type integer");
	}
	@Test
	// Check that Train has the required attribute: 
	//     private int Train.currTime
	public void testAttributeCurrTime()
	{
		boolean found = false;  
		Field list[] = Train.class.getDeclaredFields();  // get all attributes
		for(int i = 0; i < list.length; i++) // loop through list of attributes
		{
			String value = ""+list[i]; // convert to string
			if (value.contentEquals("private int Train.currTime"))
				found = true;
		}
		if (!found)
			fail("Train class should have a private currTime attribute of type integer");
	}
	@Test
	// Check that Train only has the 4 required attributes: 
	public void testAttributeOnlyFour()
	{
		Field list[] = Train.class.getDeclaredFields();  // get all attributes
		if (list.length > 4)
			fail("Train class should only have three attributes");
	}
	@Test
	// Check that Train has the required methods:
	//    public void Train.simulate()  
	public void testMethodSimulate()
	{
		boolean found = false;  
		Method list[] = Train.class.getDeclaredMethods();
		for(int i = 0; i < list.length; i++) // loop through list of attributes
		{
			String value = ""+list[i]; // convert to string
			if (value.contentEquals("public void Train.simulate()"))
				found = true;
		}
		if (!found)
			fail("Train class should have a public method called simulate");
	}
	@Test
	// Check that Train has the required methods:
	//    public void Train.displayStops()  
	public void testDisplayStops()
	{
		boolean found = false;  
		Method list[] = Train.class.getDeclaredMethods();
		for(int i = 0; i < list.length; i++) // loop through list of attributes
		{
			String value = ""+list[i]; // convert to string
			if (value.contentEquals("public void Train.displayStops()"))
				found = true;
		}
		if (!found)
			fail("Train class should have a public method called displayStops");
	}

```
### Errors
```

```
### Fail
```
	@Test
	// Check that Train only has the required 3 methods 
	public void testMethodsOnlySix()
	{
		Method list[] = Train.class.getDeclaredMethods();  // get all methods
		if (list.length > 3)
			fail("Train class should only have three methods defined");
	}
-------------------------------------------------------------
Reason for Failure??
java.lang.AssertionError: Train class should only have three methods defined
	at org.junit.Assert.fail(Assert.java:89)
	at TestTrainBasics.testMethodsOnlySix(TestTrainBasics.java:160)
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



















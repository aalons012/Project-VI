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
## Errors: None
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






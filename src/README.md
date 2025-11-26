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


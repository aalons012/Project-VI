public class Customer {

    public static final int CUST_NOT_PROCESSED = 0;
    public static final int CUST_ENTERED = 1;
    public static final int CUST_EXITED = 2;

    private int id;
    private int arrival;
    private int enter;
    private int exit;
    private int status;

    /**
     * Constructor initializes all fields and sets status
     * to CUST_NOT_PROCESSED.
     */
    public Customer(int id, int arrival, int enter, int exit) {
    	if (id <= 0 || arrival <= 0 || enter <= 0 || exit <= 0) {
            throw new IllegalArgumentException("Invalid Customer parameter value");
        }
        this.id = id;
        this.arrival = arrival;
        this.enter = enter;
        this.exit = exit;
        this.status = CUST_NOT_PROCESSED;
    }

    public int getId() {
        return id;
    }

    public int getArrival() {
        return arrival;
    }

    public int getEnter() {
        return enter;
    }

    public int getExit() {
        return exit;
    }

    public int getStatus() {
        return status;
    }
    /**
     * Sets status to one of the defined constants.
     * Throws IllegalArgumentException if status is out of range.
     */
    public void setStatus(int status) {
        if (status < CUST_NOT_PROCESSED || status > CUST_EXITED) {
            throw new IllegalArgumentException("Invalid status value");
        }
        this.status = status;
    }
}

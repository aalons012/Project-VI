import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Simulator {

    private Scanner console;

    public Simulator() {
        // Create scanner AFTER JUnit sets System.in
        console = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Simulator sim = new Simulator();
        int stops = sim.getStopsFromUser();
        File file = sim.getInputFile();
        ArrayList<Customer> list = sim.checkFile(stops, file);
        while (list == null) {
            file = sim.getInputFile();
            list = sim.checkFile(stops, file);
        }
        sim.run(stops, list);
    }

    /**
     * Creates the Train, runs the simulation, and prints the summary.
     */
    public void run(int stops, ArrayList<Customer> customers) {
        Train train = new Train(stops, customers);
        train.simulate();
        train.displayStops();
    }

    /**
     * Prompts the user for number of stops and loops until
     * a valid integer > 1 is entered.
     */
    public int getStopsFromUser() {
        while (true) {
            System.out.print("Enter number of stops the train has on its route (must be greater than 1):");
            String line;
            try {
                line = console.nextLine();
            } catch (NoSuchElementException e) {
                // Should not happen in tests, but just in case
                return 0;
            }

            Scanner lineScanner = new Scanner(line);
            if (!lineScanner.hasNextInt()) {
                System.out.println("Invalid input, try again");
                continue;
            }
            int stops = lineScanner.nextInt();
            // no extra tokens allowed and must be > 1
            if (stops <= 1 || lineScanner.hasNext()) {
                System.out.println("Invalid input, try again");
                continue;
            }
            return stops;
        }
    }

    /**
     * Prompts for input file path. If user just presses Enter,
     * uses the default: C:/train/customer-data.txt
     *
     * Loops until an existing file is found.
     */
    public File getInputFile() {
        while (true) {
            System.out.print(
                "Enter absolute path for data file or for default (C:/train/customer-data.txt) press Enter:"
            );
            String line = console.nextLine().trim();
            if (line.isEmpty()) {
                line = "C:/train/customer-data.txt";
            }

            File f = new File(line);
            if (f.exists() && f.isFile()) {
                return f;
            } else {
                System.out.println("File not found, try again.");
            }
        }
    }


    /**
     * Reads the file and validates the data:
     *  - Each non-empty line must have exactly 4 integers: id, arrival, enter, exit
     *  - id > 1
     *  - arrival > 0
     *  - 1 <= enter <= stops
     *  - 1 <= exit <= stops
     *  - enter != exit
     *  - all ids must be unique
     *
     * If anything is wrong:
     *  - prints an error message
     *  - returns null so main() can re-prompt for a new file.
     */
    public ArrayList<Customer> checkFile(int stops, File f) {
        ArrayList<Customer> list = new ArrayList<>();
        Scanner fileScanner;

        try {
            fileScanner = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.out.println("File not found, try again.");
            return null;
        }

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine().trim();
            if (line.isEmpty()) {
                continue; // or treat as invalid if the SDS says so
            }

            Scanner lineScanner = new Scanner(line);
            int id, time, enter, exit;

            // 4 integers required
            if (!lineScanner.hasNextInt()) {
                System.out.println("Each line must have four integers. Try again.");
                return null;
            }
            id = lineScanner.nextInt();

            if (!lineScanner.hasNextInt()) {
                System.out.println("Each line must have four integers. Try again.");
                return null;
            }
            time = lineScanner.nextInt();

            if (!lineScanner.hasNextInt()) {
                System.out.println("Each line must have four integers. Try again.");
                return null;
            }
            enter = lineScanner.nextInt();

            if (!lineScanner.hasNextInt()) {
                System.out.println("Each line must have four integers. Try again.");
                return null;
            }
            exit = lineScanner.nextInt();

            // No extra junk after 4 ints
            if (lineScanner.hasNext()) {
                System.out.println("Each line must have four integers. Try again.");
                return null;
            }

            // Now validate constraints
            // id > 0
            if (id <= 0) {
                System.out.println("Data in input file is not correct. Try again.");
                return null;
            }

            // time/arrival > 0
            if (time <= 0) {
                System.out.println("Data in input file is not correct. Try again.");
                return null;
            }

            // enter and exit must be between 1 and stops
            if (enter < 1 || enter > stops || exit < 1 || exit > stops) {
                System.out.println("Data in input file is not correct. Try again.");
                return null;
            }

            // enter and exit cannot be the same
            if (enter == exit) {
                System.out.println("Data in input file is not correct. Try again.");
                return null;
            }

            // id must be unique
            for (Customer c : list) {
                if (c.getId() == id) {
                    System.out.println("Data in input file is not correct. Try again.");
                    return null;
                }
            }

            try {
                Customer cust = new Customer(id, time, enter, exit);
                list.add(cust);
            } catch (IllegalArgumentException e) {
                // If constructor validation fails, treat as bad data
                System.out.println("Data in input file is not correct. Try again.");
                return null;
            }
        }

        return list;
    }

    }

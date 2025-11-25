import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulator {

    // One shared Scanner for console input.
    // IMPORTANT: Do NOT close this (matches your instructor warning).
    private static final Scanner CONSOLE = new Scanner(System.in);

    public static void main(String[] args) {
        Simulator sim = new Simulator();
        int stops = sim.getStopsFromUser();
        File inputFile = sim.getInputFile();
        ArrayList<Customer> customers = sim.checkFile(stops, inputFile);

        // If checkFile() returns null, file contents were invalid;
        // keep prompting for a new file until we get a valid list.
        while (customers == null) {
            inputFile = sim.getInputFile();
            customers = sim.checkFile(stops, inputFile);
        }

        sim.run(stops, customers);
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
        int stops = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(
                "Enter number of stops the train has on its route (must be greater than 1): "
            );

            if (CONSOLE.hasNextInt()) {
                stops = CONSOLE.nextInt();
                CONSOLE.nextLine(); // consume newline
                if (stops > 1) {
                    valid = true;
                } else {
                    System.out.println("Invalid input, try again");
                }
            } else {
                // Non-integer entered
                CONSOLE.nextLine(); // consume the invalid token
                System.out.println("Invalid input, try again");
            }
        }
        return stops;
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
                "Enter absolute path for data file or for default (C:/train/customer-data.txt) press Enter: "
            );
            String line = CONSOLE.nextLine().trim();

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
                // If your SDS says empty lines are invalid, change this
                // to print an error and return null instead.
                continue;
            }

            Scanner lineScanner = new Scanner(line);
            int id, arrival, enter, exit;

            // Make sure there are exactly 4 integers on the line
            if (!lineScanner.hasNextInt()) {
                System.out.println("Each line must have four integers. Try again.");
                return null;
            }
            id = lineScanner.nextInt();

            if (!lineScanner.hasNextInt()) {
                System.out.println("Each line must have four integers. Try again.");
                return null;
            }
            arrival = lineScanner.nextInt();

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

            // No extra junk allowed after the four ints
            if (lineScanner.hasNext()) {
                System.out.println("Each line must have four integers. Try again.");
                return null;
            }

            // Validate constraints:
            // ID > 1
            if (id <= 1) {
                System.out.println("Data in input file is not correct. Try again.");
                return null;
            }

            // arrival > 0
            if (arrival <= 0) {
                System.out.println("Data in input file is not correct. Try again.");
                return null;
            }

            // enter and exit between 1 and stops
            if (enter <= 0 || enter > stops || exit <= 0 || exit > stops) {
                System.out.println("Data in input file is not correct. Try again.");
                return null;
            }

            // enter and exit cannot be the same
            if (enter == exit) {
                System.out.println("Data in input file is not correct. Try again.");
                return null;
            }

            // ID must be unique
            for (Customer c : list) {
                if (c.getId() == id) {
                    System.out.println("Data in input file is not correct. Try again.");
                    return null;
                }
            }

            list.add(new Customer(id, arrival, enter, exit));
        }

        return list;
    }
}

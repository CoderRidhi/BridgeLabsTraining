import java.util.Scanner;

class Station {

    int stationId;
    String stationName;
    double distanceFromSource;

    Station next;

    Station(
            int stationId,
            String stationName,
            double distanceFromSource) {

        this.stationId = stationId;
        this.stationName = stationName;
        this.distanceFromSource = distanceFromSource;

        this.next = null;
    }
}

public class TrainRouteNavigationSystem {

    static Station head = null;

    public static void addAtBeginning(
            int id,
            String name,
            double distance) {

        Station newStation =
                new Station(id, name, distance);

        newStation.next = head;

        head = newStation;

        System.out.println("Station Added At Beginning.");
    }

    public static void addAtEnd(
            int id,
            String name,
            double distance) {

        Station newStation =
                new Station(id, name, distance);

        if (head == null) {

            head = newStation;

            System.out.println("Station Added.");
            return;
        }

        Station temp = head;

        while (temp.next != null) {

            temp = temp.next;
        }

        temp.next = newStation;

        System.out.println("Station Added At End.");
    }

    public static void insertAfterStation(
            int afterId,
            int newId,
            String newName,
            double newDistance) {

        Station temp = head;

        while (temp != null
                && temp.stationId != afterId) {

            temp = temp.next;
        }

        if (temp == null) {

            System.out.println("Station Not Found.");
            return;
        }

        Station newStation =
                new Station(
                        newId,
                        newName,
                        newDistance);

        newStation.next = temp.next;

        temp.next = newStation;

        System.out.println("Station Inserted Successfully.");
    }

    public static void removeStation(int id) {

        // Empty list
        if (head == null) {

            System.out.println("No Stations Available.");
            return;
        }

        // Remove first station
        if (head.stationId == id) {

            head = head.next;

            System.out.println("Station Removed.");
            return;
        }

        Station temp = head;

        while (temp.next != null
                && temp.next.stationId != id) {

            temp = temp.next;
        }

        // Station not found
        if (temp.next == null) {

            System.out.println("Station Not Found.");
            return;
        }

        temp.next = temp.next.next;

        System.out.println("Station Removed Successfully.");
    }

    public static void searchStation(String name) {

        Station temp = head;

        boolean found = false;

        while (temp != null) {

            if (temp.stationName.equalsIgnoreCase(name)) {

                System.out.println("\n===== STATION FOUND =====");

                System.out.println("Station ID     : "
                        + temp.stationId);

                System.out.println("Station Name   : "
                        + temp.stationName);

                System.out.println("Distance       : "
                        + temp.distanceFromSource
                        + " km");

                found = true;

                break;
            }

            temp = temp.next;
        }

        if (!found) {

            System.out.println("Station Not Found.");
        }
    }

    public static void displayRoute() {

        if (head == null) {

            System.out.println("No Stations In Route.");
            return;
        }

        Station temp = head;

        System.out.println("\n===== TRAIN ROUTE =====");

        while (temp != null) {

            System.out.print(
                    temp.stationName
                            + " ("
                            + temp.distanceFromSource
                            + " km)");

            if (temp.next != null) {

                System.out.print(" --> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== TRAIN ROUTE NAVIGATION SYSTEM =====");

            System.out.println("1. Add Station At Beginning");
            System.out.println("2. Add Station At End");
            System.out.println("3. Insert Station In Between");
            System.out.println("4. Remove Station");
            System.out.println("5. Search Station");
            System.out.println("6. Display Complete Route");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Station ID: ");
                    int id1 = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter Station Name: ");
                    String name1 = scanner.nextLine();

                    System.out.print("Enter Distance: ");
                    double distance1 = scanner.nextDouble();

                    addAtBeginning(
                            id1,
                            name1,
                            distance1);

                    break;

                case 2:

                    System.out.print("Enter Station ID: ");
                    int id2 = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter Station Name: ");
                    String name2 = scanner.nextLine();

                    System.out.print("Enter Distance: ");
                    double distance2 = scanner.nextDouble();

                    addAtEnd(
                            id2,
                            name2,
                            distance2);

                    break;

                case 3:

                    System.out.print("Insert After Station ID: ");
                    int afterId = scanner.nextInt();

                    System.out.print("Enter New Station ID: ");
                    int newId = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter New Station Name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter Distance: ");
                    double newDistance = scanner.nextDouble();

                    insertAfterStation(
                            afterId,
                            newId,
                            newName,
                            newDistance);

                    break;

                case 4:

                    System.out.print("Enter Station ID To Remove: ");
                    int removeId = scanner.nextInt();

                    removeStation(removeId);

                    break;

                case 5:

                    scanner.nextLine();

                    System.out.print("Enter Station Name To Search: ");
                    String searchName = scanner.nextLine();

                    searchStation(searchName);

                    break;

                case 6:

                    displayRoute();

                    break;

                case 7:

                    System.out.println("Exiting Program...");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 7);

        scanner.close();
    }
}
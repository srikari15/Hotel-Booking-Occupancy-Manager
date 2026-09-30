
    import java.util.Scanner;
class Hotel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] rooms = {101, 102, 103};
        boolean[] booked = {false, true, false};

        int choice = 0;

        // while loop
        while (choice != 4) {

            System.out.println("\n1.Book Room  2.Room Type  3.Occupancy  4.Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            // switch
            switch (choice) {

                case 1:
                    System.out.print("Enter room: ");
                    int r = sc.nextInt();

                    // for loop
                    for (int i = 0; i < rooms.length; i++) {
                        if (rooms[i] == r) {

                            // if-else
                            if (!booked[i]) {
                                booked[i] = true;
                                System.out.println("Room booked!");
                            } else {
                                System.out.println("Room occupied!");
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.println("101 - Single");
                    System.out.println("102 - Double");
                    System.out.println("103 - Deluxe");
                    break;

                case 3:
                    for (int i = 0; i < rooms.length; i++)
                        System.out.println(rooms[i] + " : " +
                            (booked[i] ? "Occupied" : "Vacant"));
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}


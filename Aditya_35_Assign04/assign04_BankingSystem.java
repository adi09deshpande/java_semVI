import java.io.*;
import java.util.*;

class assign04_BankingSystem {
    static Scanner sc = new Scanner(System.in);
    static String file = "data.txt";

    // Create Account
    static void create() {
        try {
            System.out.print("Enter CID (1-20): ");
            int cid = sc.nextInt();
            if (cid < 1 || cid > 20) throw new Exception("Invalid CID");

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Amount: ");
            double amt = sc.nextDouble();

            if (amt < 0) throw new Exception("Amount must be positive");
            if (amt < 1000) throw new Exception("Min balance 1000");

            FileWriter fw = new FileWriter(file, true);
            fw.write(cid + " " + name + " " + amt + "\n");
            fw.close();

            System.out.println("Account Created");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Withdraw
    static void withdraw() {
        try {
            System.out.print("Enter CID: ");
            int cid = sc.nextInt();

            System.out.print("Enter Withdraw Amount: ");
            double w = sc.nextDouble();

            if (w < 0) throw new Exception("Amount must be positive");

            File f = new File(file);
            File temp = new File("temp.txt");

            //buffered reader is used read text from a file efficintely, while BufferedWriter is used to write text to a file efficiently by storing data in memory first and then writing it in chunks.
            BufferedReader br = new BufferedReader(new FileReader(f));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                double amt = Double.parseDouble(data[2]);

                if (id == cid) {
                    found = true;
                    if (w > amt) throw new Exception("Insufficient Balance");
                    amt -= w;
                    line = id + " " + name + " " + amt;
                }
                bw.write(line + "\n");
            }

            br.close();
            bw.close();
            f.delete();
            temp.renameTo(f);

            if (found) System.out.println("Withdraw Success");
            else System.out.println("Customer not found");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Display
    static void display() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("No data");
        }
    }

    public static void main(String[] args) {
        int ch;
        do {
            System.out.println("\n1.Create 2.Withdraw 3.Display 4.Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1: create(); break;
                case 2: withdraw(); break;
                case 3: display(); break;
            }
        } while (ch != 4);
    }
}
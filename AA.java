import java.util.*;

class AA {
    public static final String RESET = "\u001B[0m";
    public static final String BRIGHT_RED = "\u001B[91m";

    public static void main(String[] args) throws InterruptedException {
        Main16.main(null);

        boolean kop = User11.mainReturn();
        if (!kop) {
            System.out.println(BRIGHT_RED + "THANK YOU" + RESET);
            return;
        } else {
            Main17.main(null);
            A.main(null);
        }
    }
}

 class Main16
{

    // ANSI escape codes
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BRIGHT_CYAN = "\u001B[96m";

    public static void main(String[] args) throws InterruptedException {
        String[] artLines = {
            " ________  __        ________   ______  ________  _______    ______         __       __   ______   _______  ________ ",
            "|        \\|  \\      |        \\ /      \\|        \\|       \\  /      \\       |  \\     /  \\ /      \\ |       \\|        \\",
            "| $$$$$$$$| $$      | $$$$$$$$|  $$$$$$\\\\$$$$$$$$| $$$$$$$\\|  $$$$$$\\      | $$\\   /  $$|  $$$$$$\\| $$$$$$$\\\\$$$$$$$$",
            "| $$__    | $$      | $$__    | $$   \\$$  | $$   | $$__| $$| $$  | $$      | $$$\\ /  $$$| $$__| $$| $$__| $$  | $$   ",
            "| $$  \\   | $$      | $$  \\   | $$        | $$   | $$    $$| $$  | $$      | $$$$\\  $$$$| $$    $$| $$    $$  | $$   ",
            "| $$$$$   | $$      | $$$$$   | $$   __   | $$   | $$$$$$$\\| $$  | $$      | $$\\$$ $$ $$| $$$$$$$$| $$$$$$$\\  | $$   ",
            "| $$_____ | $$_____ | $$_____ | $$__/  \\  | $$   | $$  | $$| $$__/ $$      | $$ \\$$$| $$| $$  | $$| $$  | $$  | $$   ",
            "| $$     \\| $$     \\| $$     \\ \\$$    $$  | $$   | $$  | $$ \\$$    $$      | $$  \\$ | $$| $$  | $$| $$  | $$  | $$   ",
            " \\$$$$$$$$ \\$$$$$$$$ \\$$$$$$$$  \\$$$$$$    \\$$    \\$$   \\$$  \\$$$$$$        \\$$      \\$$ \\$$   \\$$ \\$$   \\$$   \\$$   ",
            "                                                                                                                     ",
            "                                                                                                                     "
        };

        // Clear screen (optional, only works in ANSI-compatible terminals)
        System.out.print("\033[H\033[2J");
        System.out.flush();

        for (String line : artLines) {
            System.out.println(ANSI_BRIGHT_CYAN + line + ANSI_RESET);
            Thread.sleep(330); // Delay for smooth appearance
        }
    
}


}
class Main17 {
    // ANSI Color Codes
    public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String RED = "\u001B[31m";
    public static final String WHITE = "\u001B[37m";

   static void menu() throws InterruptedException {
        System.out.println(CYAN + "Menu" + RESET);

        // Mobiles
        System.out.println(GREEN + "1.Mobiles" + RESET);
        System.out.println(CYAN + " _____________________ ");
        System.out.println("|  _________________  |");
        System.out.println("| |                 | |");
        System.out.println("| |                 | |");
        System.out.println("| |                 | |");
        System.out.println("| |      Mobiles    | |");
        System.out.println("| |                 | |");
        System.out.println("| |                 | |");
        System.out.println("| |_________________| |");
        System.out.println("|  ___ ___ ___ ___    |");
        System.out.println("| |   |   |   |   |   |");
        System.out.println("| |___|___|___|___|   |");
        System.out.println("|_____________________|" + RESET);
        Thread.sleep(1500);

        // Smart Watches
        System.out.println(YELLOW + "2.Smart Watches" + RESET);
        System.out.println(YELLOW + "     ___________     ");
        System.out.println("   /             \\   ");
        System.out.println("  /   _________   \\  ");
        System.out.println(" |   |           | | ");
        System.out.println(" |   | Smart     | | ");
        System.out.println(" |   | watches   | | ");
        System.out.println(" |   |___________| | ");
        System.out.println("  \\               /  ");
        System.out.println("   \\_____________/   ");
        System.out.println("     ||       ||     ");
        System.out.println("     ||       ||     ");
        System.out.println("     ||       ||     " + RESET);
        Thread.sleep(1500);

        // TV
        System.out.println(BLUE + "3.Tv" + RESET);
        System.out.println(BLUE + " _________________________ ");
        System.out.println("|                         |");
        System.out.println("|         [ TV ]          |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|_________________________|");
        System.out.println("      ||           ||      ");
        System.out.println("      ||           ||      ");
        System.out.println("      ||___________||      " + RESET);
        Thread.sleep(1500);

        // Music Systems
        System.out.println(MAGENTA + "4.Music Systems" + RESET);

        // Piano
        System.out.println(MAGENTA + "4.1.Piano Keyboard" + RESET);
        System.out.println("  _________________________________  ");
        System.out.println(" /                                 \\ ");
        System.out.println("|     P I A N O   K E Y B O A R D   |");
        System.out.println("|___________________________________|");
        System.out.println("|  | |  | |  | |  | |  | |  | |  |  |");
        System.out.println("|  | |  | |  | |  | |  | |  | |  |  |");
        System.out.println("|  |_|  |_|  |_|  |_|  |_|  |_|  |_||");
        System.out.println("|   |    |    |    |    |    |    | |");
        System.out.println("|   |    |    |    |    |    |    | |");
        System.out.println("|   |____|____|____|____|____|____| |");
        System.out.println(" \\_________________________________/ " + RESET);
        Thread.sleep(1500);

        // Guitar
        System.out.println(MAGENTA + "4.2.Guitar" + RESET);
        System.out.println("      ||");
        System.out.println("      ||");
        System.out.println("      ||");
        System.out.println("      ||");
        System.out.println("      ||");
        System.out.println("     _||_");
        System.out.println("    / || \\");
        System.out.println("   /  ||  \\");
        System.out.println("  |   ||   |");
        System.out.println("  |   ||   |");
        System.out.println("   \\  ||  /");
        System.out.println("    \\ || /");
        System.out.println("     \\||/");
        System.out.println("      ||");
        System.out.println("     (  )");
        System.out.println("    (    )");
        System.out.println("   (      )");
        System.out.println("    (    )");
        System.out.println("     (  )");
        System.out.println("      ||");
        System.out.println("      ||");
        System.out.println("      ||");
        System.out.println("      ||" + RESET);
        Thread.sleep(1500);

        // Washing Machine
        System.out.println(RED + "5.Washing Machine" + RESET);
        System.out.println("  ________________________  ");
        System.out.println(" |                        | ");
        System.out.println(" |   WASHING MACHINE 3000 | ");
        System.out.println(" |________________________| ");
        System.out.println(" |   [POWER]   [START]    | ");
        System.out.println(" |   [MODE]    [STOP]     | ");
        System.out.println(" |                        | ");
        System.out.println(" |       __________       | ");
        System.out.println(" |      /          \\      | ");
        System.out.println(" |     /   ~~~~     \\     | ");
        System.out.println(" |    |   ~~~~~~     |    | ");
        System.out.println(" |    |  ~~~~~~~~    |    | ");
        System.out.println(" |    |   ~~~~~~     |    | ");
        System.out.println(" |     \\   ~~~~     /     | ");
        System.out.println(" |      \\__________/      | ");
        System.out.println(" |                        | ");
        System.out.println(" |________________________| " + RESET);
        Thread.sleep(1500);

        // Laptops
        System.out.println(CYAN + "6.Laptops" + RESET);
        System.out.println("        ___________________________        ");
        System.out.println("       |                           |       ");
        System.out.println("       |         Lenovo            |       ");
        System.out.println("       |                           |       ");
        System.out.println("       |                           |       ");
        System.out.println("       |___________________________|       ");
        System.out.println("        ___________________________        ");
        System.out.println("       | [Q][W][E][R][T][Y][U]     |       ");
        System.out.println("       | [A][S][D][F][G][H][J]     |       ");
        System.out.println("       | [Z][X][C][V][B][N][M]     |       ");
        System.out.println("       |         [  ⬛  ]           |       ");
        System.out.println("       |___________________________|       " + RESET);
        Thread.sleep(1500);

        // Smart Boards
        System.out.println(YELLOW + "7.Smart Boards" + RESET);
        System.out.println("    ____________________________________");
        System.out.println("   |              SMART BOARD           |");
        System.out.println("   |                                    |");
        System.out.println("   |                                    |");
        System.out.println("   |                                    |");
        System.out.println("   |____________________________________|");
        System.out.println("                |            |            ");
        System.out.println("                |            |");
        System.out.println("                |            |" + RESET);
        Thread.sleep(1500);

        // Headphones
        System.out.println(GREEN + "8.Head Phones" + RESET);
        System.out.println("       __       __       ");
        System.out.println("      /  \\     /  \\      ");
        System.out.println("     |    |   |    |     ");
        System.out.println("     |    |   |    |     ");
        System.out.println("      \\__/     \\__/      ");
        System.out.println("       ||       ||       ");
        System.out.println("    ___||_______||___    ");
        System.out.println("   /                 \\   ");
        System.out.println("  /                   \\  ");
        System.out.println(" |     CHARGING CASE   | ");
        System.out.println("   \\_________________/   " + RESET);
        Thread.sleep(1500);

        // Refrigerator
        System.out.println(BLUE + "9.Refrigerators" + RESET);
        System.out.println(" _____________________ ");
        System.out.println("| |   REFRIGERATOR  | |");
        System.out.println("| |   [ Milk  ]     | |");
        System.out.println("| |   [ Eggs  ]     | |");
        System.out.println("| |   [ Juice ]     | |");
        System.out.println("| |   [ Veggies ]   | |");
        System.out.println("| |   [ Fruits  ]   | |");
        System.out.println("|_____________________|");
        System.out.println("         ||   ||       " + RESET);
    }

    public static void main(String[] args) throws InterruptedException {
        menu();
    }
}




class Mobile {
    static Scanner sc = new Scanner(System.in);

    // ANSI Colors
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";
    public static final String BLUE = "\u001B[34m";

    static void Message(int otpp) {
        System.out.println(CYAN + "OTP: " + otpp + RESET);
    }
}

class Insta extends Mobile {
    static Insta x1 = new Insta();
    static Scanner sc = new Scanner(System.in);

    private static String Username = "hloo";
    private static String Password = "hloo";
    private static long Phonenum = 1234567891;
       
    void usn(String usname) { this.Username = usname; }
    void password(String psw) { this.Password = psw; }
    void phnum(long phnumb) { this.Phonenum = phnumb; }

    static String get1() { return Username; }
    static String get2() { return Password; }
    static long get3() { return Phonenum; }

    Insta(String uss, String paa, long phh) {
        this.Username = uss;
        this.Password = paa;
        this.Phonenum = phh;
    }
    Insta() {}

    static int OTPgenerator() {
        int otp = 1000 + (int) (Math.random() * 8999);
        Message(otp);
        return otp;
    }
}

class User11 extends Insta {
    static User11 x = new User11();

    static boolean login() {
        System.out.println(YELLOW + "Enter Credentials Your user_name and password" + RESET);
        String un = sc.next();
        String up = sc.next();
        
        if (un.equals(x1.get1()) && up.equals(x1.get2())) {
            System.out.println(GREEN + "Login successful" + RESET);
            return true;
        } 
        else if (!un.equals(x1.get1()) && up.equals(x1.get2())) {
            System.out.println(RED + "WRONG USER NAME" + RESET);
            System.out.println(YELLOW + "IF YOU WANT TO RESET THE USER NAME ENTER YES" + RESET);
            String res = sc.next();
            if (res.equals("YES")) {
                System.out.println(CYAN + "ENTER NEW USER NAME " + RESET);
                x1.usn(sc.next());
                System.out.println(GREEN + "Reset done" + RESET);
                System.out.println(YELLOW + "IF YOU WANT TO RELOGIN ENTER 1 ELSE ENTER ANY KEY TO EXIT" + RESET);
                char m = sc.next().charAt(0);
                if (m == '1') return x.login();
                else return false;
            } else return false;
        } 
        else if (un.equals(x1.get1()) && !up.equals(x1.get2())) {
            System.out.println(RED + "WRONG PASSWORD " + RESET);
            System.out.println(YELLOW + "IF YOU WANT TO RESET THE USER PASSWORD ENTER YES" + RESET);
            String ress = sc.next();
            if (ress.equals("YES")) {
                boolean otppp = false;
                while (!otppp) {
                    System.out.println(YELLOW + "ENTER YOUR MOBILE NUMBER" + RESET);
                    long klo = sc.nextLong();
                    if (klo == get3()) {
                        int ootp = OTPgenerator();
                        System.out.println(YELLOW + "ENTER THE OTP" + RESET);
                        int po = sc.nextInt();
                        if (po == ootp) {
                            otppp = true;
                            System.out.println(CYAN + "ENTER NEW PASSWORD " + RESET);
                            x1.password(sc.next());
                            System.out.println(GREEN + "Reset done" + RESET);
                            System.out.println(YELLOW + "IF YOU WANT TO RELOGIN ENTER 1 ELSE ENTER ANY KEY TO EXIT" + RESET);
                            char m = sc.next().charAt(0);
                            if (m == '1') return x.login();
                            else return false;
                        } else {
                            System.out.println(RED + "Invalid OTP" + RESET);
                            System.out.println(YELLOW + "IF YOU WANT GENERATE AGAIN THEN ENTER 1 ELSE PRESS ANY KEY TO EXIT" + RESET);
                            char ap = sc.next().charAt(0);
                            if (ap == '1') ress = "YES";
                            else return false;
                        }
                    } else {
                        System.out.println(RED + "Invalid mobile number" + RESET);
                        System.out.println(YELLOW + "If you want to re-enter enter 1 else any key" + RESET);
                        char tt = sc.next().charAt(0);
                        if (tt == '1') continue;
                        else return false;
                    }
                }
            } else{
                System.out.println(" PLEASE RE ENER THEM AGAIN ");
                login();
            }
        } 
        else if (!un.equals(x1.get1()) && !up.equals(x1.get2())) {
            System.out.println(RED + "WRONG CREDENTIALS" + RESET);
            System.out.println(YELLOW + "DO YOU WANT TO KNOW YOUR USER NAME\nIF YES THEN ENTER YES" + RESET);
            String wrongcr = sc.next();
            if (wrongcr.equals("YES")) {
                while (wrongcr.equals("YES")) {
                    System.out.println(YELLOW + "ENTER YOUR MOBILE NUMBER" + RESET);
                    long mb = sc.nextLong();
                    String a = Long.toString(mb);
                    if (a.length() == 10) {
                        if (mb == x1.get3()) {
                            System.out.println(CYAN + "YOUR USER NAME: " + x1.get1() + RESET);
                            System.out.println(CYAN + "YOUR PASSWORD: " + x1.get2() + RESET);
                            System.out.println(YELLOW + "IF YOU WANT TO RELOGIN ENTER 1 ELSE ENTER ANY KEY TO EXIT" + RESET);
                            char k = sc.next().charAt(0);
                            if (k == '1') return x.login();
                            else return false;
                        } else {
                            System.out.println(RED + "USER NOT FOUND" + RESET);
                            System.out.println(YELLOW + "TO REENTER MOBILE NUMBER ENTER YES ELSE ANY KEY" + RESET);
                            String re = sc.next();
                            if (re.equals("YES")) wrongcr = re;
                            else return false;
                        }
                    } else {
                        System.out.println(RED + "INVALID NUMBER, MUST BE 10 DIGITS" + RESET);
                        System.out.println(YELLOW + "IF YOU WANT TO REENTER THEN TYPE YES ELSE ANY KEY TO EXIT" + RESET);
                        wrongcr = sc.next();
                    }
                }
            } else return login();
        }
        return false;
    }

    static boolean Registerr() {
        System.out.println(YELLOW + "ENTER YOUR USER NAME" + RESET);
        String us = sc.next();
        System.out.println(YELLOW + "ENTER YOUR PASSWORD" + RESET);
        String pa = sc.next();
        System.out.println(YELLOW + "ENTER YOUR PHONE NUMBER" + RESET);
        long ph = sc.nextLong();
        int t11 = 0;
        while (t11 != 1) {
            String aa = String.valueOf(ph);
            if (aa.length() < 10) {
                System.out.println(RED + "MOBILE NUMBER MUST CONTAIN 10 DIGITS" + RESET);
                System.out.println(YELLOW + "IF YOU WANT TO REENTER ENTER 1 ELSE EXIT" + RESET);
                char ch = sc.next().charAt(0);
                if (ch == '1') ph = sc.nextLong();
                else return false;
            } else t11 = 1;
        }
        x1 = new Insta(us, pa, ph);
        System.out.println(GREEN + "ACCOUNT CREATED SUCCESSFULLY" + RESET);
        System.out.println(YELLOW + "ENTER 1 FOR LOGIN OR ANY KEY TO EXIT" + RESET);
        char t = sc.next().charAt(0);
        if (t == '1') return login();
        else return false;
    }

    public static boolean mainReturn() {
        System.out.println(CYAN + "IF YOU ARE NEW USER ENTER 1 TO REGISTER, IF YOU ALREADY HAVE AN ACCOUNT THEN ENTER 2 TO LOGIN" + RESET);
        char z = sc.next().charAt(0);
        boolean result = false;

        if (z == '2') result = x.login();
        else if (z == '1') result = Registerr();
        else System.out.println(RED + "INVALID ENTRY" + RESET);

        return result;
    }
}

class A {



			


	
    // ANSI Colors
    public static final String RESET = "\u001B[0m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_MAGENTA = "\u001B[95m";
    public static final String BRIGHT_RED = "\u001B[91m";
    public static final String BRIGHT_BLUE = "\u001B[94m";

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
	
        System.out.println(BRIGHT_YELLOW + "========================================" + RESET);
        System.out.println(BRIGHT_CYAN + "      HLOOO ENTER YOUR REQUIRED ITEMS     " + RESET);
        System.out.println(BRIGHT_YELLOW + "========================================" + RESET);

        System.out.println(BRIGHT_GREEN + " ENTER 1 FOR -----> " + BRIGHT_BLUE + "SMART-WATCHES" + RESET);
        System.out.println(BRIGHT_GREEN + " ENTER 2 FOR -----> " + BRIGHT_MAGENTA + "MOBILE-PHONES" + RESET);
        System.out.println(BRIGHT_GREEN + " ENTER 3 FOR -----> " + BRIGHT_RED + "EARBUDS" + RESET);
        System.out.println(BRIGHT_GREEN + " ENTER 4 FOR -----> " + BRIGHT_CYAN + "REFRIGERATORS" + RESET);
	System.out.println(BRIGHT_GREEN + " ENTER 5 FOR -----> " + BRIGHT_CYAN + " TV " + RESET);
	System.out.println(BRIGHT_GREEN + " ENTER 6 FOR -----> " + BRIGHT_CYAN + " MUSCICAL INSTRUMENTS " + RESET);
	System.out.println(BRIGHT_GREEN + " ENTER 7 FOR -----> " + BRIGHT_CYAN + " SMART BOARDS " + RESET);
	System.out.println(BRIGHT_GREEN + " ENTER 8 FOR -----> " + BRIGHT_CYAN + " LAPTOPS " + RESET);
	System.out.println(BRIGHT_GREEN + " ENTER 9 FOR -----> " + BRIGHT_CYAN + " WASHING-MACHINES " + RESET);



        System.out.print(BRIGHT_YELLOW + "  Enter your choice: " + RESET);
        int choice = sc.nextInt();

        switch (choice) {
           case 1:
                Main.main(null);
                break;
            case 2:
                Main1.main(null);
                break;
            case 3:
                Main2.main(null);
                break;
            case 4:
                Main3.main(null);
                break;
	     case 5:
                Main4.main(null);
                break;
	     case 6:
                Main5.main(null);
                break;
	     case 7:
                Main6.main(null);
                break;
	    case 8:
                Main7.main(null);
                break;
	    case 9:
                Main8.main(null);
                break;


            default:
                System.out.println(BRIGHT_RED + " Invalid choice " + RESET);
        }
    }
}


class Mobilee {
    static Scanner sc = new Scanner(System.in);

    void Message(int otpp) {
        System.out.println("\u001B[96mOTP: " + otpp + "\u001B[0m");
    }
}

class BANK extends Mobilee {
    static BANK x1 = new BANK();

    private String Username = "12890";
    private String Password = "1122";
    private long Phonenum = 1234567891;
     private static int balance=100000;
        	void bala(int a) {
                this.balance = a;
            }
        	int get4() {
                return balance;
            }
    void usn(String usname) {
        this.Username = usname;
    }

    void password(String psw) {
        this.Password = psw;
    }

    void phnum(long phnumb) {
        this.Phonenum = phnumb;
    }

    String get1() {
        return Username;
    }

    String get2() {
        return Password;
    }

    long get3() {
        return Phonenum;
    }

    int OTPgenerator() {
        int otp = 1000 + (int) (Math.random() * 8999);
        Message(otp);
        return otp;
    }
}

class User extends BANK {
    static User x = new User();

    boolean login() {
        System.out.println("\u001B[94m\nHELLO WELCOME! PLEASE ENTER YOUR ACCOUNT DETAILS\n\u001B[0m");

        System.out.print("\u001B[92mENTER YOUR ACCOUNT NUMBER ------------> \u001B[0m");
        String un = sc.next();

        System.out.print("\u001B[92mENTER YOUR PIN ----------> \u001B[0m");
        String up = sc.next();

        if (un.equals(x1.get1()) && up.equals(x1.get2())) {
            System.out.println("\u001B[92mLOGIN SUCCESSFUL!\u001B[0m");
            return true;  // STOP execution here after successful login

        } else if (!un.equals(x1.get1()) && up.equals(x1.get2())) {
            System.out.println("\u001B[91mACCOUNT NUMBER IS INCORRECT.\u001B[0m");
            System.out.print("\u001B[93mDO YOU WANT TO  ENTER AGAIN YES TO CONTINUE: \u001B[0m");
            String res = sc.next();

            if (res.equalsIgnoreCase("YES")) {
                sc.nextLine(); // clear newline
                while (true) {
                    System.out.print("\u001B[94mENTER YOUR ACCOUNT NUMBER ------------> \u001B[0m");
                    String acc = sc.nextLine();
                    if (acc.equals(get1())) {
                        System.out.println("\u001B[92mLOGIN SUCCESSFUL\u001B[0m");
                        return true;  // STOP here after successful login
                    } else {
                        System.out.println("\u001B[91mINVALID ACCOUNT NUMBER, TRY AGAIN.\u001B[0m");
                    }
                }
            } else {
                System.out.print("\u001B[93mTO RETURN TO LOGIN PAGE ENTER 1, OR ANY OTHER KEY TO EXIT: \u001B[0m");
                char q0 = sc.next().charAt(0);
                if (q0 == '1') login();
                else System.out.println("\u001B[91mLOGIN UNSUCCESSFUL\u001B[0m");
            }

        } else if (un.equals(x1.get1()) && !up.equals(x1.get2())) {
            System.out.println("\u001B[91mWRONG PASSWORD.\u001B[0m");
            System.out.print("\u001B[93mDO YOU WANT TO RESET YOUR PIN ? ENTER YES TO CONTINUE: \u001B[0m");
            String ress = sc.next();

            if (ress.equalsIgnoreCase("YES")) {
                System.out.print("\u001B[92mENTER YOUR REGISTERED MOBILE NUMBER: \u001B[0m");
                long jh1 = sc.nextLong();
                if (jh1 == get3()) {
                    boolean otppp = false;
                    while (!otppp) {
                        int ootp = OTPgenerator();
                        System.out.print("\u001B[96mENTER RECEIVED OTP: \u001B[0m");
                        int po = sc.nextInt();

                        if (po == ootp) {
                            otppp = true;
                            System.out.print("\u001B[93mENTER NEW PASSWORD: \u001B[0m");
                            x1.password(sc.next());
                            System.out.println("\u001B[92m PIN RESET SUCCESSFUL!\u001B[0m");

                            System.out.print("\u001B[94mENTER 1 TO LOGIN AGAIN OR ANY KEY TO EXIT: \u001B[0m");
                            char m = sc.next().charAt(0);
                            if (m == '1') {
                                login();
                                return true;  // after relogin, stop current method
                            } else {
                                System.out.println("\u001B[92mTHANK YOU!\u001B[0m");
                                return true;  // stop execution after password reset and exit
                            }
                        } else {
                            System.out.print("\u001B[91mINVALID OTP. ENTER 1 TO TRY AGAIN OR ANY KEY TO EXIT: \u001B[0m");
                            char ap = sc.next().charAt(0);
                            if (ap != '1') {
                                System.out.println("\u001B[91mLOGIN UNSUCCESSFUL\u001B[0m");
                                return false;  // stop on invalid OTP and exit
                            }
                        }
                    }
                } else {
                    System.out.println("\u001B[91mINVALID MOBILE NUMBER. RETURNING TO LOGIN.\u001B[0m");
                    login();
                    return true;  // stop current execution after relogin call
                }

            } else {
                System.out.print("\u001B[93mENTER 1 TO RE-ENTER PASSWORD OR ANY OTHER KEY TO LOGIN PAGE: \u001B[0m");
                char av = sc.next().charAt(0);

                if (av == '1') {
                    int attempts = 0;
                    while (attempts < 3) {
                        System.out.print("\u001B[92mENTER UPI PIN: \u001B[0m");
                        String retryPass = sc.next();
                        if (retryPass.equals(get2())) {
                            System.out.println("\u001B[92mLOGIN SUCCESSFUL!\u001B[0m");
                            return true;  // STOP here after successful login
                        } else {
                            attempts++;
                            System.out.println("\u001B[91mWRONG PIN. ATTEMPT " + attempts + " OF 5\u001B[0m");
                        }
                    }
                    System.out.println("\u001B[91mTOO MANY FAILED ATTEMPTS. RETURNING TO LOGIN.\u001B[0m");
                    login();
                    return true;  // stop after relogin
                } else {
                    login();
                    return true;  // stop after relogin
                }
            }

        } else {
            System.out.println("\u001B[91mWRONG CREDENTIALS.\u001B[0m");
            System.out.print("\u001B[93mDO YOU WANT TO RECOVER YOUR DETAILS? ENTER YES: \u001B[0m");
            String wrongcr = sc.next();
            if (wrongcr.equalsIgnoreCase("YES")) {
                while (true) {
                    System.out.print("\u001B[92mENTER YOUR MOBILE NUMBER: \u001B[0m");
                    long mb = sc.nextLong();
                    String a = Long.toString(mb);
                    if (a.length() == 10 && mb == x1.get3()) {
                        System.out.println("\u001B[92mACCOUNT NUMBER: " + x1.get1() + "\u001B[0m");
                        System.out.println("\u001B[92mPIN: " + x1.get2() + "\u001B[0m");

                        System.out.print("\u001B[93mENTER 1 TO LOGIN OR ANY KEY TO EXIT: \u001B[0m");
                        char k = sc.next().charAt(0);
                        if (k == '1') {
                            login();
                            return true;  // stop after relogin
                        } else {
                            System.out.println("\u001B[92mTHANK YOU!\u001B[0m");
                            return false;  // stop after exit
                        }
                    } else {
                        System.out.print("\u001B[91mINVALID MOBILE NUMBER. ENTER YES TO TRY AGAIN OR ANY OTHER KEY TO EXIT: \u001B[0m");
                        String retry = sc.next();
                        if (!retry.equalsIgnoreCase("YES")) return false;  // exit loop and method
                    }
                }
            } else {
                System.out.print("\u001B[93mENTER 1 TO RELOGIN OR ANY OTHER KEY TO EXIT: \u001B[0m");
                char z1 = sc.next().charAt(0);
                if (z1 == '1') {
                    login();
                    return true;  // stop after relogin
                } else {
                    System.out.println("\u001B[92mTHANK YOU!\u001B[0m");
                    return false;  // stop after exit
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println("\u001B[95mWELCOME TO THE BANK LOGIN SYSTEM\u001B[0m");
        System.out.print("\u001B[94mENTER 1 TO LOGIN OR ANY OTHER KEY TO EXIT: \u001B[0m");
        char z = sc.next().charAt(0);

        if (z == '1') {
            x.login();
        } else {
            System.out.println("\u001B[92mGOODBYE!\u001B[0m");
            
        }
    }
}

class Main extends BANK {
static Scanner sc= new Scanner (System.in);
    // ANSI color codes
    public static final String RESET = "\u001B[0m";
    public static final String[] COLORS = {
            "\u001B[31m", // Red
            "\u001B[32m", // Green
            "\u001B[33m", // Yellow
            "\u001B[34m", // Blue
            "\u001B[35m", // Magenta
            "\u001B[36m", // Cyan
            "\u001B[91m", // Bright Red
            "\u001B[92m", // Bright Green
            "\u001B[94m", // Bright Blue
            "\u001B[95m"  // Bright Magenta
    };
    public static final String RESETT        = "\u001B[0m";
public static final String RED          = "\u001B[31m";
public static final String GREEN        = "\u001B[32m";
public static final String YELLOW       = "\u001B[33m";
public static final String BLUE         = "\u001B[34m";
public static final String PURPLE       = "\u001B[35m";
public static final String CYAN         = "\u001B[36m";
public static final String WHITE        = "\u001B[37m";
public static final String GRAY         = "\u001B[90m";

public static final String LIGHT_RED    = "\u001B[91m";
public static final String LIGHT_GREEN  = "\u001B[92m";
public static final String LIGHT_YELLOW = "\u001B[93m";
public static final String LIGHT_BLUE   = "\u001B[94m";
public static final String LIGHT_PURPLE = "\u001B[95m";
public static final String LIGHT_CYAN   = "\u001B[96m";
public static final String LIGHT_WHITE  = "\u001B[97m";

public static final String ORANGE       = "\u001B[38;5;208m";
public static final String LIGHT_ORANGE = "\u001B[38;5;214m";
static String adb;
     static void bankb(int a)
{
    System.out.println(LIGHT_YELLOW + " PLEASE ENTER THE AMOUNT " + a + RESETT);
    
    
    System.out.print(new BANK().get4());
	System.out.println("    Available Balance ");

        int ty=sc.nextInt();
	if(ty> new BANK().get4())
	{
  		System.out.println("insufficient balance payment cannot be possible\n Enter 1 for main menu or 2 for exit ");
		char h=sc.next().charAt(0);
		if(h=='1')
		{
		    try{
		    A.main(null);
		    }
		    catch(InterruptedException e)
		    {
		        
		    }
		}
		if(h=='2')
		{
			return; 	
		}
		
			
	}
	else{
    boolean cat = false;
    while (!cat)
    {
        if (ty < a)
        {
            System.out.println(RED + "  ENTERED AMOUNT IS LESS THAN THE ACTUAL AMOUNT   PLEASE ENTER THE VALID AMOUNT    " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else if (ty > a)
        {
            System.out.println(RED + " ENTERED AMOUNT IS MORE THAN THE ACTUAL AMOUNT  " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else
        {
            cat = true;
            System.out.println(GREEN + " PAYMENT SUCCESSFUL   " + RESETT);
            int alo=new BANK().get4()-ty;
            System.out.println(alo+" REMAINING BALANCE ");
            new BANK().bala(alo);
            System.out.print(LIGHT_GREEN + " YOUR PRODUCT WILL BE DELIVERED TO " + RESETT);
            System.out.println(LIGHT_CYAN + adb + " IN 2 DAYS ...." + RESETT);
            System.out.println();
            System.out.println(LIGHT_BLUE + "  IF YOU WANT TO CONTINUE SHOPPING PLEASE SELECT 1 OR ENTER 2 TO EXIT " + RESETT);
            char kop = sc.next().charAt(0);
            if (kop == '1')
            {
                System.out.println(LIGHT_BLUE + "IF YOU WANT TO GO TO THE MAIN ITEM PAGE THEN ENTER 1  OR ENTER 2 FOR PREVIOUS ITEM PAGE ELSE ANY KEY TO EXIT " + RESETT);
                char pok = sc.next().charAt(0);
                if (pok == '1')
                {
                    try {
                        A.main(null);   
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if (pok == '2')
                {
                    display();
                }
                else
                {
                    System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                    return;
                }
            }
            else
            {
                System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                return;
            }
        }
    }
	}
}

    
    static void item1() {
    System.out.println(CYAN + "         Apple Watch " + RESET);
    System.out.println(YELLOW + "         Apple Watch Specifications" + RESET);
    System.out.println(WHITE + "         Display: 1.78-inch Retina LTPO OLED" + RESET);
    System.out.println(WHITE + "         Processor: Apple S8" + RESET);
    System.out.println(WHITE + "         Rear Camera: None" + RESET);
    System.out.println(WHITE + "         Front Camera: None" + RESET);
    System.out.println(WHITE + "         Battery: 18 hrs" + RESET);
    System.out.println(WHITE + "         Storage: 32GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹32,900" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans1 = sc.next();
    if(ans1.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if(nu.equals("SBI")) { 
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 32900; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); 
            bankb(it - 700); }
        } else if(nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }
            else{
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 32900;
            System.out.println(LIGHT_ORANGE + (it - 500) + RESET);
            bankb(it - 500);
            }
        } 
        else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice1 = sc.nextInt(); if(choice1 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item2() {
    System.out.println(CYAN + "         Samsung Galaxy Watch " + RESET);
    System.out.println(YELLOW + "         Samsung Galaxy Watch Specifications" + RESET);
    System.out.println(WHITE + "         Display: 1.36-inch Super AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Exynos W920" + RESET);
    System.out.println(WHITE + "         Rear Camera: None" + RESET);
    System.out.println(WHITE + "         Front Camera: None" + RESET);
    System.out.println(WHITE + "         Battery: 40 hrs" + RESET);
    System.out.println(WHITE + "         Storage: 16GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹28,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans2 = sc.next();
    if(ans2.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if(nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if(!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 28999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if(nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else{
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 28999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
            }
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice2 = sc.nextInt(); if(choice2 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}
static void item3() {
    System.out.println(CYAN + "         Fitbit Versa 3 " + RESET);
    System.out.println(YELLOW + "         Fitbit Versa 3 Specifications" + RESET);
    System.out.println(WHITE + "         Display: 1.58-inch AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Fitbit Proprietary" + RESET);
    System.out.println(WHITE + "         Rear Camera: None" + RESET);
    System.out.println(WHITE + "         Front Camera: None" + RESET);
    System.out.println(WHITE + "         Battery: 6 days" + RESET);
    System.out.println(WHITE + "         Storage: 4GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹15,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans3 = sc.next();
    if(ans3.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if(nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if(!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 15999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if(nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 15999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice3 = sc.nextInt(); if(choice3 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item4() {
    System.out.println(CYAN + "         Garmin Venu " + RESET);
    System.out.println(YELLOW + "         Garmin Venu Specifications" + RESET);
    System.out.println(WHITE + "         Display: 1.3-inch AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Garmin Proprietary" + RESET);
    System.out.println(WHITE + "         Rear Camera: None" + RESET);
    System.out.println(WHITE + "         Front Camera: None" + RESET);
    System.out.println(WHITE + "         Battery: 5 days" + RESET);
    System.out.println(WHITE + "         Storage: 4GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹37,490" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans4 = sc.next();
    if(ans4.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if(nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if(!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 37490; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if(nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 37490; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice4 = sc.nextInt(); if(choice4 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item5() {
    System.out.println(CYAN + "         Fossil Gen 6 " + RESET);
    System.out.println(YELLOW + "         Fossil Gen 6 Specifications" + RESET);
    System.out.println(WHITE + "         Display: 1.28-inch AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Snapdragon Wear 4100+" + RESET);
    System.out.println(WHITE + "         Rear Camera: None" + RESET);
    System.out.println(WHITE + "         Front Camera: None" + RESET);
    System.out.println(WHITE + "         Battery: 24 hrs" + RESET);
    System.out.println(WHITE + "         Storage: 8GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹21,995" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans5 = sc.next();
    if(ans5.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if(nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if(!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 21995; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if(nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 21995; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice5 = sc.nextInt(); if(choice5 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item6() {
    System.out.println(CYAN + "         Huawei Watch GT 3 " + RESET);
    System.out.println(YELLOW + "         Huawei Watch GT 3 Specifications" + RESET);
    System.out.println(WHITE + "         Display: 1.43-inch AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Huawei Kirin A1" + RESET);
    System.out.println(WHITE + "         Rear Camera: None" + RESET);
    System.out.println(WHITE + "         Front Camera: None" + RESET);
    System.out.println(WHITE + "         Battery: 14 days" + RESET);
    System.out.println(WHITE + "         Storage: 8GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹18,990" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans6 = sc.next();
    if(ans6.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if(nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if(!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 18990; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if(nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 18990; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice6 = sc.nextInt(); if(choice6 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item7() {
    System.out.println(CYAN + "         Amazfit GTR 3 " + RESET);
    System.out.println(YELLOW + "         Amazfit GTR 3 Specifications" + RESET);
    System.out.println(WHITE + "         Display: 1.39-inch AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Amazfit Proprietary" + RESET);
    System.out.println(WHITE + "         Rear Camera: None" + RESET);
    System.out.println(WHITE + "         Front Camera: None" + RESET);
    System.out.println(WHITE + "         Battery: 21 days" + RESET);
    System.out.println(WHITE + "         Storage: 4GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹13,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans7 = sc.next();
    if(ans7.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if(nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if(!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 13999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if(nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 13999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice7 = sc.nextInt(); if(choice7 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item8() {
    System.out.println(CYAN + "         TicWatch Pro 3 " + RESET);
    System.out.println(YELLOW + "         TicWatch Pro 3 Specifications" + RESET);
    System.out.println(WHITE + "         Display: 1.4-inch AMOLED + LCD" + RESET);
    System.out.println(WHITE + "         Processor: Snapdragon Wear 4100" + RESET);
    System.out.println(WHITE + "         Rear Camera: None" + RESET);
    System.out.println(WHITE + "         Front Camera: None" + RESET);
    System.out.println(WHITE + "         Battery: 72 hrs" + RESET);
    System.out.println(WHITE + "         Storage: 8GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹23,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans8 = sc.next();
    if(ans8.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if(nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if(!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 23999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if(nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 23999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice8 = sc.nextInt(); if(choice8 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item9() {
    System.out.println(CYAN + "         OnePlus Watch " + RESET);
    System.out.println(YELLOW + "         OnePlus Watch Specifications" + RESET);
    System.out.println(WHITE + "         Display: 1.39-inch AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Qualcomm Snapdragon Wear" + RESET);
    System.out.println(WHITE + "         Rear Camera: None" + RESET);
    System.out.println(WHITE + "         Front Camera: None" + RESET);
    System.out.println(WHITE + "         Battery: 14 days" + RESET);
    System.out.println(WHITE + "         Storage: 4GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹14,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans9 = sc.next();
    if(ans9.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if(nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if(!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 14999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if(nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 14999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice9 = sc.nextInt(); if(choice9 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item10() {
    System.out.println(CYAN + "         Oppo Watch " + RESET);
    System.out.println(YELLOW + "         Oppo Watch Specifications" + RESET);
    System.out.println(WHITE + "         Display: 1.91-inch AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Qualcomm Snapdragon Wear" + RESET);
    System.out.println(WHITE + "         Rear Camera: None" + RESET);
    System.out.println(WHITE + "         Front Camera: None" + RESET);
    System.out.println(WHITE + "         Battery: 36 hrs" + RESET);
    System.out.println(WHITE + "         Storage: 8GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹19,990" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans10 = sc.next();
    if(ans10.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if(nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if(!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 19990; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if(nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 19990; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice10 = sc.nextInt(); if(choice10 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

    
    
static void display() {
    // Colors
    final String RESETT = "\033[0m";
    final String CYAN = "\033[96m";
    final String YELLOW = "\033[93m";
    final String GREEN = "\033[92m";
    final String RED = "\033[91m";
    final String PURPLE = "\033[95m";
    final String BLUE = "\033[94m";

    System.out.println(CYAN + "         PLEASE SELECT YOUR ITEMS       " + RESETT);
    System.out.println();

    System.out.println(YELLOW + "       ITEM 1      --->  Apple Watch" + RESETT);
    System.out.println(YELLOW + "       ITEM 2      --->  Samsung Galaxy Watch" + RESETT);
    System.out.println(YELLOW + "       ITEM 3      --->  Fitbit Versa 3" + RESETT);
    System.out.println(YELLOW + "       ITEM 4      --->  Garmin Venu" + RESETT);
    System.out.println(YELLOW + "       ITEM 5      --->  Fossil Gen 6" + RESETT);
    System.out.println(YELLOW + "       ITEM 6      --->  Huawei Watch GT 3" + RESETT);
    System.out.println(YELLOW + "       ITEM 7      --->  Amazfit GTR 3" + RESETT);
    System.out.println(YELLOW + "       ITEM 8      --->  TicWatch Pro 3" + RESETT);
    System.out.println(YELLOW + "       ITEM 9      --->  OnePlus Watch" + RESETT);
    System.out.println(YELLOW + "       ITEM 10     --->  Oppo Watch" + RESETT);
    System.out.println();
    
    System.out.print(GREEN + "     IF YOU WANT TO PLACE THE ORDER   THEN ENTER 1 OR ENTER 2 MENU ITEMS AND ANY KEY FOR EXIT        ----->  " + RESETT);
    char a = sc.next().charAt(0);
    if(a == '1') {
        System.out.print(BLUE + "     ---> PLEASE ENTER THE ITEM NUMBER          ----------->" + RESETT);
        int it = sc.nextInt();
        if(it > 0 && it <= 10) {
            switch(it) {
                case 1: item1(); break;
                case 2: item2(); break;
                case 3: item3(); break;
                case 4: item4(); break;
                case 5: item5(); break;
                case 6: item6(); break;
                case 7: item7(); break;
                case 8: item8(); break;
                case 9: item9(); break;
                case 10: item10(); break;
            }
        } else {
            System.out.println(RED + "          INVALID ITEM NUMBER            " + RESETT);
            System.out.println(PURPLE + "IF YOU WANT TO RE ENTER THE ITEM NUMBER ENTER YES ELSE NO" + RESETT);
            String ao = sc.next();
            if(ao.equals("YES")) {
                it = sc.nextInt();
            } else {
                System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEM NAMES THEN ENTER 1 ELSE TO EXIT ENTER 2" + RESETT);
                int aq = sc.nextInt();
                if(aq == 1) {
                    display();
                } else {
                    System.out.println(GREEN + "    THANK YOU VISIT AGAIN       " + RESETT);
                }
            }
        }
    }
    else if (a == '2') {
    try {
        A.main(null);
    } catch (InterruptedException e) {
        e.printStackTrace(); // or custom message
    }
}

    
    else{
        System.out.println( GREEN + "    THANK YOU VISIT AGAIN       " + RESETT);
            return;
    }
}

    // Detail colors (Bright Cyan)
    public static final String DETAIL_COLOR = "\u001B[96m";
    public static final String HEADING_COLOR = "\u001B[93m";

    public static void printSmartWatch(String color, String time, String model, String display, String battery, String os, String cost) {
        int width = 20;
        String topStrap = color + "       ||||||||||       " + RESET;
        String bottomStrap = color + "       ||||||||||       " + RESET;

        // Watch body
        System.out.println(topStrap);
        System.out.println(color + "     .----------------.  " + RESET);
        System.out.println(color + "   /   " + centerText(time, width - 6) + "   \\ " + RESET);
        System.out.println(color + "  |    " + centerText(model, width - 6) + "    |" + RESET);
        System.out.println(color + "   \\                    /  " + RESET);
        System.out.println(color + "    \\                  /  " + RESET);
        System.out.println(color + "     '----------------'  " + RESET);
        System.out.println(bottomStrap);

        // Specifications
        System.out.println(HEADING_COLOR + "Specifications:" + RESET);
        System.out.println(DETAIL_COLOR + " Display: " + display + RESET);
        System.out.println(DETAIL_COLOR + " Battery: " + battery + RESET);
        System.out.println(DETAIL_COLOR + " OS: " + os + RESET);
        System.out.println(DETAIL_COLOR + " Cost: Rs " + cost + RESET);
        System.out.println();
    }

    public static String centerText(String text, int width) {
        if (text.length() >= width) return text;
        int pad = (width - text.length()) / 2;
        return repeatSpace(pad) + text + repeatSpace(width - text.length() - pad);
    }

    public static String repeatSpace(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws InterruptedException {
        String[][] watches = {
                {"10:15", "Apple Watch", "AMOLED", "18 hrs", "watchOS", "32,900"},
                {"08:45", "Samsung Galaxy ", "Super AMOLED", "40 hrs", "Wear OS", "28,999"},
                {"09:30", "Fitbit Versa 3", "AMOLED", "6 days", "Fitbit OS", "15,999"},
                {"07:50", "Garmin Venu", "AMOLED", "5 days", "Garmin OS", "37,490"},
                {"12:10", "Fossil Gen 6", "AMOLED", "24 hrs", "Wear OS", "21,995"},
                {"11:05", "Huawei Watch GT 3", "AMOLED", "14 days", "HarmonyOS", "18,990"},
                {"06:25", "Amazfit GTR 3", "AMOLED", "21 days", "Zepp OS", "13,999"},
                {"04:55", "TicWatch Pro 3", "AMOLED + LCD", "72 hrs", "Wear OS", "23,999"},
                {"02:15", "OnePlus Watch", "AMOLED", "14 days", "RTOS", "14,999"},
                {"03:40", "Oppo Watch", "AMOLED", "36 hrs", "  Wear OS", "19,990"}
        };

        for (int i = 0; i < watches.length; i++) {
            String[] w = watches[i];
            printSmartWatch(COLORS[i], w[0], w[1], w[2], w[3], w[4], w[5]);
            Thread.sleep(1500); // Pause for 1.5 seconds
        }
        display();
    }
}






class Main1 extends BANK {
    // ANSI color codes
    static Scanner sc= new Scanner(System.in);
    public static final String RESET = "\033[0m";
    public static final String[] COLORS = {
        "\033[91m", // Red
        "\033[92m", // Green
        "\033[93m", // Yellow
        "\033[94m", // Blue
        "\033[95m", // Magenta
        "\033[96m", // Cyan
        "\033[97m", // White
        "\033[90m", // Gray
        "\033[38;5;208m", // Orange
        "\033[38;5;13m" // Pink
    };
    // ANSI color codes
public static final String RESETT        = "\u001B[0m";
public static final String RED          = "\u001B[31m";
public static final String GREEN        = "\u001B[32m";
public static final String YELLOW       = "\u001B[33m";
public static final String BLUE         = "\u001B[34m";
public static final String PURPLE       = "\u001B[35m";
public static final String CYAN         = "\u001B[36m";
public static final String WHITE        = "\u001B[37m";
public static final String GRAY         = "\u001B[90m";

public static final String LIGHT_RED    = "\u001B[91m";
public static final String LIGHT_GREEN  = "\u001B[92m";
public static final String LIGHT_YELLOW = "\u001B[93m";
public static final String LIGHT_BLUE   = "\u001B[94m";
public static final String LIGHT_PURPLE = "\u001B[95m";
public static final String LIGHT_CYAN   = "\u001B[96m";
public static final String LIGHT_WHITE  = "\u001B[97m";

public static final String ORANGE       = "\u001B[38;5;208m";
public static final String LIGHT_ORANGE = "\u001B[38;5;214m";

     static String adb;
     static void bankb(int a)
{
    System.out.println(LIGHT_YELLOW + " PLEASE ENTER THE AMOUNT " + a + RESETT);
    System.out.print(new BANK().get4());
	System.out.println("    Available Balance ");

        int ty=sc.nextInt();
	if(ty> new BANK().get4())
	{
  		System.out.println("insufficient balance payment cannot be possible\n Enter 1 for main menu or 2 for exit ");
		char h=sc.next().charAt(0);
		if(h=='1')
		{
		    try{
		    A.main(null);
		    }
		    catch(InterruptedException e)
		    {
		        
		    }
		}
		if(h=='2')
		{
			return; 	
		}
		
			
	}
	else{
    boolean cat = false;
    while (!cat)
    {
        if (ty < a)
        {
            System.out.println(RED + "  ENTERED AMOUNT IS LESS THAN THE ACTUAL AMOUNT   PLEASE ENTER THE VALID AMOUNT    " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else if (ty > a)
        {
            System.out.println(RED + " ENTERED AMOUNT IS MORE THAN THE ACTUAL AMOUNT  " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else
        {
            cat = true;
            System.out.println(GREEN + " PAYMENT SUCCESSFUL   " + RESETT);
            int alo=new BANK().get4()-ty;
            System.out.println(alo+" REMAINING BALANCE ");
            new BANK().bala(alo);
            System.out.print(LIGHT_GREEN + " YOUR PRODUCT WILL BE DELIVERED TO " + RESETT);
            System.out.println(LIGHT_CYAN + adb + " IN 2 DAYS ...." + RESETT);
            System.out.println();
            System.out.println(LIGHT_BLUE + "  IF YOU WANT TO CONTINUE SHOPPING PLEASE SELECT 1 OR ENTER 2 TO EXIT " + RESETT);
            char kop = sc.next().charAt(0);
            if (kop == '1')
            {
                System.out.println(LIGHT_BLUE + "IF YOU WANT TO GO TO THE MAIN ITEM PAGE THEN ENTER 1  OR ENTER 2 FOR PREVIOUS ITEM PAGE ELSE ANY KEY TO EXIT " + RESETT);
                char pok = sc.next().charAt(0);
                if (pok == '1')
                {
                    try {
                        A.main(null);   
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if (pok == '2')
                {
                    display();
                }
                else
                {
                    System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                    return;
                }
            }
            else
            {
                System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                return;
            }
        }
    }
	}
}

    
    
   static void item1() {
    System.out.println(CYAN + "         iPhone 11 " + RESET);
    System.out.println(YELLOW + "         iPhone 11 Specifications" + RESET);
    System.out.println(WHITE + "         Display: 6.1-inch Liquid Retina HD" + RESET);
    System.out.println(WHITE + "         Processor: A13 Bionic chip" + RESET);
    System.out.println(WHITE + "         Rear Camera: Dual 12MP Ultra Wide + Wide" + RESET);
    System.out.println(WHITE + "         Front Camera: 12MP TrueDepth" + RESET);
    System.out.println(WHITE + "         Battery: Up to 17 hrs video playback" + RESET);
    System.out.println(WHITE + "         Storage: 64GB, 128GB, 256GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹41900" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans1 = sc.next();

    if (ans1.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET);
        sc.nextLine();
        adb = sc.nextLine();

        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);

        String nu = sc.next();

        if (nu.equals("SBI")) {
            User u = new User();
            boolean ok = u.login();
            if (!ok) {
                System.out.println(RED + "   " + RESET);
                System.exit(0);
            } else {
                System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
                int it = 41900;
                System.out.println(LIGHT_ORANGE + (it - 700) + RESET);
                int it10 = it - 700;
                bankb(it10);
            }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 41900;
            System.out.println(LIGHT_ORANGE + (it - 500) + RESET);
            int it10 = it - 500;
            bankb(it10);
        } else {
            System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET);
            display();
            return;
        }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice1 = sc.nextInt();
        if (choice1 == 1) {
            display();
        } else {
            System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET);
        }
    }
}

static void item2() {
    System.out.println(LIGHT_CYAN + "        Samsung Galaxy S23 Ultra " + RESETT);
    System.out.println(CYAN + "        Samsung Galaxy S23 Ultra Specifications" + RESETT);
    System.out.println(YELLOW + "        • Display: 6.8-inch QHD+ Dynamic AMOLED 2X" + RESETT);
    System.out.println(YELLOW + "        • Processor: Snapdragon 8 Gen 2" + RESETT);
    System.out.println(YELLOW + "        • Rear Camera: 200MP + 12MP + 10MP + 10MP" + RESETT);
    System.out.println(YELLOW + "        • Front Camera: 12MP" + RESETT);
    System.out.println(YELLOW + "        • Battery: 5000 mAh" + RESETT);
    System.out.println(YELLOW + "        • Storage: 256GB, 512GB, 1TB" + RESETT);
    System.out.println(LIGHT_RED + "        • Cost: ₹124999" + RESETT);
    System.out.println();
    System.out.print(LIGHT_GREEN + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    
    String ans2 = sc.next();
    if (ans2.equals("YES")) {
        System.out.println(LIGHT_PURPLE + "PLEASE ENTER YOUR ADDRESS " + RESETT);
        sc.nextLine();
        adb = sc.nextLine();

        System.out.println(LIGHT_BLUE + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_BLUE + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        if (nu.equals("SBI")) {
            User u = new User();
            boolean ok = u.login();
            if (!ok) {
                System.out.println(RED + "Login failed. Stopping execution." + RESETT);
                System.exit(0);
            } else {
                System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                System.out.println(GREEN + " WE ARE REDUCING THE PRICE BY 700  " + RESETT);
                int it = 124999;
                System.out.println(it - 700);
                int it10 = it - 700;
                bankb(it10);
            }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(GREEN + " WE ARE REDUCING THE PRICE BY 500  " + RESETT);
            int it = 124999;
            System.out.println(it - 500);
            int it10 = it - 500;
            bankb(it10);
        } else {
            System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT);
            display();
            return;
        }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice2 = sc.nextInt();
        if (choice2 == 1) {
            display();
        } else {
            System.out.println(LIGHT_GREEN + " THANK YOU VISIT AGAIN " + RESETT);
        }
    }
}

static void item3() {
    System.out.println(CYAN + "         Google Pixel 8 Pro " + RESET);
    System.out.println(YELLOW + "         Google Pixel 8 Pro Specifications" + RESET);
    System.out.println(WHITE + "         Display: 6.7-inch LTPO OLED" + RESET);
    System.out.println(WHITE + "         Processor: Google Tensor G3" + RESET);
    System.out.println(WHITE + "         Rear Camera: 50MP + 48MP + 48MP" + RESET);
    System.out.println(WHITE + "         Front Camera: 10.5MP" + RESET);
    System.out.println(WHITE + "         Battery: 5050 mAh" + RESET);
    System.out.println(WHITE + "         Storage: 128GB, 256GB, 512GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹84,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans3 = sc.next();

    if (ans3.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET);
        sc.nextLine();
        adb = sc.nextLine();

        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);

        String nu = sc.next();

        if (nu.equals("SBI")) {
            User u = new User();
            boolean ok = u.login();
            if (!ok) {
                System.out.println(RED + "   " + RESET);
                System.exit(0);
            } else {
                System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
                int it = 84999;
                System.out.println(LIGHT_ORANGE + (it - 700) + RESET);
                int it10 = it - 700;
                bankb(it10);
            }
           
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }
            else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 84999;
            System.out.println(LIGHT_ORANGE + (it - 500) + RESET);
            int it10 = it - 500;
            bankb(it10);
        } else {
            System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET);
            display();
            return;
        }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice3 = sc.nextInt();
        if (choice3 == 1) {
            display();
        } else {
            System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET);
        }
    }
}

static void item4() {
    System.out.println(CYAN + "         OnePlus 11 5G " + RESET);
    System.out.println(YELLOW + "         OnePlus 11 5G Specifications" + RESET);
    System.out.println(WHITE + "         Display: 6.7-inch QHD+ AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Snapdragon 8 Gen 2" + RESET);
    System.out.println(WHITE + "         Rear Camera: 50MP + 48MP + 32MP" + RESET);
    System.out.println(WHITE + "         Front Camera: 16MP" + RESET);
    System.out.println(WHITE + "         Battery: 5000 mAh" + RESET);
    System.out.println(WHITE + "         Storage: 128GB, 256GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹61,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans4 = sc.next();

    if (ans4.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET);
        sc.nextLine();
        adb = sc.nextLine();

        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);

        String nu = sc.next();

        if (nu.equals("SBI")) {
            User u = new User();
            boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
                int it = 61999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET);
                bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 61999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET);
            bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice4 = sc.nextInt(); if (choice4 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item5() {
    System.out.println(CYAN + "         Xiaomi 13 Pro " + RESET);
    System.out.println(YELLOW + "         Xiaomi 13 Pro Specifications" + RESET);
    System.out.println(WHITE + "         Display: 6.73-inch AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Snapdragon 8 Gen 2" + RESET);
    System.out.println(WHITE + "         Rear Camera: 50MP + 50MP + 50MP" + RESET);
    System.out.println(WHITE + "         Front Camera: 32MP" + RESET);
    System.out.println(WHITE + "         Battery: 4820 mAh" + RESET);
    System.out.println(WHITE + "         Storage: 128GB, 256GB, 512GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹66,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans5 = sc.next();

    if (ans5.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET);
        sc.nextLine(); adb = sc.nextLine();

        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);

        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login(); 
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); } 
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 66999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); } 
        } else if (nu.equals("KOTAK")) { 
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET); 
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET); 
            int it = 66999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500); 
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice5 = sc.nextInt(); if (choice5 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item6() {
    System.out.println(CYAN + "         Oppo Find X6 Pro " + RESET);
    System.out.println(YELLOW + "         Oppo Find X6 Pro Specifications" + RESET);
    System.out.println(WHITE + "         Display: 6.82-inch AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Snapdragon 8 Gen 2" + RESET);
    System.out.println(WHITE + "         Rear Camera: 50MP + 50MP + 50MP" + RESET);
    System.out.println(WHITE + "         Front Camera: 32MP" + RESET);
    System.out.println(WHITE + "         Battery: 5000 mAh" + RESET);
    System.out.println(WHITE + "         Storage: 256GB, 512GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹79,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans6 = sc.next();

    if (ans6.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login(); 
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); } 
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 79999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); } 
        } else if (nu.equals("KOTAK")) { 
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET); 
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET); 
            int it = 79999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500); 
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice6 = sc.nextInt(); if (choice6 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item7() {
    System.out.println(CYAN + "         Sony Xperia 1 V " + RESET);
    System.out.println(YELLOW + "         Sony Xperia 1 V Specifications" + RESET);
    System.out.println(WHITE + "         Display: 6.5-inch 4K OLED" + RESET);
    System.out.println(WHITE + "         Processor: Snapdragon 8 Gen 2" + RESET);
    System.out.println(WHITE + "         Rear Camera: 48MP + 12MP + 12MP" + RESET);
    System.out.println(WHITE + "         Front Camera: 12MP" + RESET);
    System.out.println(WHITE + "         Battery: 5000 mAh" + RESET);
    System.out.println(WHITE + "         Storage: 256GB, 512GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹84,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans7 = sc.next();

    if (ans7.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 84999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 84999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice7 = sc.nextInt(); if (choice7 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item8() {
    System.out.println(CYAN + "         Realme GT 3 " + RESET);
    System.out.println(YELLOW + "         Realme GT 3 Specifications" + RESET);
    System.out.println(WHITE + "         Display: 6.74-inch AMOLED 144Hz" + RESET);
    System.out.println(WHITE + "         Processor: Snapdragon 8+ Gen 1" + RESET);
    System.out.println(WHITE + "         Rear Camera: 50MP + 8MP + 2MP" + RESET);
    System.out.println(WHITE + "         Front Camera: 16MP" + RESET);
    System.out.println(WHITE + "         Battery: 4600 mAh (240W charging)" + RESET);
    System.out.println(WHITE + "         Storage: 128GB, 256GB, 512GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹44,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans8 = sc.next();

    if (ans8.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 44999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 44999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice8 = sc.nextInt(); if (choice8 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item9() {
    System.out.println(CYAN + "         Vivo X90 Pro+ " + RESET);
    System.out.println(YELLOW + "         Vivo X90 Pro+ Specifications" + RESET);
    System.out.println(WHITE + "         Display: 6.78-inch AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Snapdragon 8 Gen 2" + RESET);
    System.out.println(WHITE + "         Rear Camera: 50MP + 50MP + 48MP + 64MP" + RESET);
    System.out.println(WHITE + "         Front Camera: 32MP" + RESET);
    System.out.println(WHITE + "         Battery: 4700 mAh" + RESET);
    System.out.println(WHITE + "         Storage: 256GB, 512GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹79,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans9 = sc.next();

    if (ans9.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 79999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 79999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice9 = sc.nextInt(); if (choice9 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item10() {
    System.out.println(CYAN + "         Asus ROG Phone 7 Ultimate " + RESET);
    System.out.println(YELLOW + "         Asus ROG Phone 7 Ultimate Specifications" + RESET);
    System.out.println(WHITE + "         Display: 6.78-inch AMOLED 165Hz" + RESET);
    System.out.println(WHITE + "         Processor: Snapdragon 8 Gen 2" + RESET);
    System.out.println(WHITE + "         Rear Camera: 50MP + 13MP + 8MP" + RESET);
    System.out.println(WHITE + "         Front Camera: 32MP" + RESET);
    System.out.println(WHITE + "         Battery: 6000 mAh" + RESET);
    System.out.println(WHITE + "         Storage: 256GB, 512GB" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹94,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans10 = sc.next();

    if (ans10.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 94999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 94999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice10 = sc.nextInt(); if (choice10 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}


    
    
    

static void display()
{
    // Colors
    final String RESETT = "\033[0m";
    final String CYAN = "\033[96m";
    final String YELLOW = "\033[93m";
    final String GREEN = "\033[92m";
    final String RED = "\033[91m";
    final String PURPLE = "\033[95m";
    final String BLUE = "\033[94m";

    System.out.println(CYAN + "         PLEASE SELECT YOUR ITEMS       " + RESETT);
    System.out.println();

    System.out.println(YELLOW + "       ITEM 1      --->  iPhone 11" + RESETT);
    System.out.println(YELLOW + "       ITEM 2      --->  Samsung Galaxy S23 Ultra" + RESETT);
    System.out.println(YELLOW + "       ITEM 3      --->  Google Pixel 8 Pro" + RESETT);
    System.out.println(YELLOW + "       ITEM 4      --->  OnePlus 11 5G" + RESETT);
    System.out.println(YELLOW + "       ITEM 5      --->  Xiaomi 13 Pro" + RESETT);
    System.out.println(YELLOW + "       ITEM 6      --->  Oppo Find X6 Pro" + RESETT);
    System.out.println(YELLOW + "       ITEM 7      --->  Sony Xperia 1 V" + RESETT);
    System.out.println(YELLOW + "       ITEM 8      --->  Realme GT 3" + RESETT);
    System.out.println(YELLOW + "       ITEM 9      --->  Vivo X90 Pro+" + RESETT);
    System.out.println(YELLOW + "       ITEM 10     --->  Asus ROG Phone 7 Ultimate" + RESETT);
    System.out.println();
    
    System.out.print(GREEN + "     IF YOU WANT TO PLACE THE ORDER   THEN ENTER 1 OR ENTER 2 MENU ITEMS AND ANY KEY FOR EXIT          ----->  " + RESETT);
     
    char a= sc.next().charAt(0);
    if(a=='1')
    {
        System.out.print(BLUE + "     ---> PLEASE ENTER THE ITEM NUMBER          ----------->" + RESETT);
        int it=sc.nextInt();
        if(it>0 && it<=10)
        {
            switch(it)
            {
                case 1:
                    item1();
                    break;
                case 2:
                    item2();
                    break;
                case 3:
                    item3();
                    break;
                case 4:
                    item4();
                    break;
                case 5:
                    item5();
                    break;
                case 6:
                    item6();
                    break;
                case 7:
                    item7();
                    break;
                case 8:
                    item8();
                    break;
                case 9:
                    item9();
                    break;
                case 10:
                    item10();
                    break;
            }
        }
        else{
            System.out.println(RED + "          INVALID ITEM NUMBER            " + RESETT);
            System.out.println(PURPLE + "IF YOU WANT TO RE ENTER THE ITEM NUMBER ENTER YES ELSE NO" + RESETT);
            String ao=sc.next();
            if(ao.equals("YES"))
            {
                it=sc.nextInt();
            }
            else
            {
                System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEM NAMES THEN ENTER 1 ELSE TO EXIT ENTER 2" + RESETT);
                int aq=sc.nextInt();
                
                    if(aq==1)
                    {
                        display();
                    }
                    else
                    {
                        System.out.println(GREEN + "    THANK YOU VISIT AGAIN       " + RESETT);
                    }
            }
        }
    }
    else if (a == '2') {
                try {
                    A.main(null);
                } catch (InterruptedException e) {
                    e.printStackTrace(); // or custom message
                }
            }
    else{
        System.out.println(GREEN + "    THANK YOU VISIT AGAIN       " + RESETT);
        return;
    }


}


    public static final String GRA = "\033[90m";
    public static final String WHIT = "\033[97m";

    public static void printPhone(String time, String model, String color) {
        int screenWidth = 22; // internal screen width

        String[] wrappedTime = wrapText(time, screenWidth);
        String[] wrappedModel = wrapText(model, screenWidth);

        System.out.println(color + "   ______________________" + RESET);
        System.out.println(color + "  /                      \\" + RESET);

        for (String line : wrappedTime) {
            System.out.printf(color + " | " + WHIT  + "%s" + color + " |\n" + RESET,
                centerText(line, screenWidth));
        }
        for (String line : wrappedModel) {
            System.out.printf(color + " | " + WHIT  + "%s" + color + " |\n" + RESET,
                centerText(line, screenWidth));
        }

        int remainingLines = 15 - wrappedTime.length - wrappedModel.length;
       for (int i = 0; i < remainingLines; i++) {
    System.out.println(color + " | " + repeatChar(' ', screenWidth) + " |" + RESET);
}


        System.out.println(color + " |         " + GRA  + "_____" + color + "         |" + RESET);
        System.out.println(color + "  \\______________________/" + RESET);
    }

    public static String[] wrapText(String text, int width) {
        return text.replaceAll("(.{1," + width + "})( +|$)", "$1\n").split("\n");
    }

    public static String centerText(String text, int width) {
    if (text.length() >= width) return text;
    int totalPadding = width - text.length();
    int leftPadding = totalPadding / 2;
    int rightPadding = totalPadding - leftPadding;
    return repeatChar(' ', leftPadding) + text + repeatChar(' ', rightPadding);
}

public static String repeatChar(char ch, int count) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++) {
        sb.append(ch);
    }
    return sb.toString();
}

    public static void printSpecs(String[][] specs, String color) {
        for (String[] spec : specs) {
            System.out.println(color + "• " + spec[0] + ":" + RESET + " " + spec[1]);
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        String[][][] mobiles = {
            {{"iPhone 11"}, {"12:45 PM"},
             {"Display", "6.1-inch Liquid Retina HD"},
             {"Processor", "A13 Bionic chip"},
             {"Rear Camera", "Dual 12MP Ultra Wide + Wide"},
             {"Front Camera", "12MP TrueDepth"},
             {"Battery", "Up to 17 hrs video playback"},
             {"Storage", "64GB, 128GB, 256GB"},
             {"Colors", "Purple, Yellow, Green, Black, White, RED"},
             {"OS", "iOS 17 (upgradable)"},
             {"Water Resistance", "IP68"}
            },
            {{"Samsung Galaxy S23 Ultra"}, {"09:30 AM"},
             {"Display", "6.8-inch QHD+ Dynamic AMOLED 2X"},
             {"Processor", "Snapdragon 8 Gen 2"},
             {"Rear Camera", "200MP + 12MP + 10MP + 10MP"},
             {"Front Camera", "12MP"},
             {"Battery", "5000 mAh"},
             {"Storage", "256GB, 512GB, 1TB"},
             {"Colors", "Phantom Black, Cream, Green, Lavender"},
             {"OS", "Android 13"},
             {"Water Resistance", "IP68"}
            },
            {{"Google Pixel 8 Pro"}, {"08:10 AM"},
             {"Display", "6.7-inch LTPO OLED"},
             {"Processor", "Google Tensor G3"},
             {"Rear Camera", "50MP + 48MP + 48MP"},
             {"Front Camera", "10.5MP"},
             {"Battery", "5050 mAh"},
             {"Storage", "128GB, 256GB, 512GB"},
             {"Colors", "Obsidian, Porcelain, Bay"},
             {"OS", "Android 14"},
             {"Water Resistance", "IP68"}
            },
            {{"OnePlus 11 5G"}, {"03:15 PM"},
             {"Display", "6.7-inch QHD+ AMOLED"},
             {"Processor", "Snapdragon 8 Gen 2"},
             {"Rear Camera", "50MP + 48MP + 32MP"},
             {"Front Camera", "16MP"},
             {"Battery", "5000 mAh"},
             {"Storage", "128GB, 256GB"},
             {"Colors", "Titan Black, Eternal Green"},
             {"OS", "Android 13 (OxygenOS)"},
             {"Water Resistance", "IP64"}
            },
            {{"Xiaomi 13 Pro"}, {"07:45 AM"},
             {"Display", "6.73-inch AMOLED"},
             {"Processor", "Snapdragon 8 Gen 2"},
             {"Rear Camera", "50MP + 50MP + 50MP"},
             {"Front Camera", "32MP"},
             {"Battery", "4820 mAh"},
             {"Storage", "128GB, 256GB, 512GB"},
             {"Colors", "White, Black, Green, Ceramic"},
             {"OS", "Android 13"},
             {"Water Resistance", "IP68"}
            },
            {{"Oppo Find X6 Pro"}, {"04:20 PM"},
             {"Display", "6.82-inch AMOLED"},
             {"Processor", "Snapdragon 8 Gen 2"},
             {"Rear Camera", "50MP + 50MP + 50MP"},
             {"Front Camera", "32MP"},
             {"Battery", "5000 mAh"},
             {"Storage", "256GB, 512GB"},
             {"Colors", "Black, Green, Brown"},
             {"OS", "Android 13"},
             {"Water Resistance", "IP68"}
            },
            {{"Sony Xperia 1 V"}, {"11:55 AM"},
             {"Display", "6.5-inch 4K OLED"},
             {"Processor", "Snapdragon 8 Gen 2"},
             {"Rear Camera", "48MP + 12MP + 12MP"},
             {"Front Camera", "12MP"},
             {"Battery", "5000 mAh"},
             {"Storage", "256GB, 512GB"},
             {"Colors", "Black, Silver, Green"},
             {"OS", "Android 13"},
             {"Water Resistance", "IP68"}
            },
            {{"Realme GT 3"}, {"10:05 AM"},
             {"Display", "6.74-inch AMOLED 144Hz"},
             {"Processor", "Snapdragon 8+ Gen 1"},
             {"Rear Camera", "50MP + 8MP + 2MP"},
             {"Front Camera", "16MP"},
             {"Battery", "4600 mAh (240W charging)"},
             {"Storage", "128GB, 256GB, 512GB"},
             {"Colors", "Black, Purple, White"},
             {"OS", "Android 13"},
             {"Water Resistance", "IP54"}
            },
            {{"Vivo X90 Pro+"}, {"05:35 PM"},
             {"Display", "6.78-inch AMOLED"},
             {"Processor", "Snapdragon 8 Gen 2"},
             {"Rear Camera", "50MP + 50MP + 48MP + 64MP"},
             {"Front Camera", "32MP"},
             {"Battery", "4700 mAh"},
             {"Storage", "256GB, 512GB"},
             {"Colors", "Black, Red"},
             {"OS", "Android 13"},
             {"Water Resistance", "IP68"}
            },
            {{"Asus ROG Phone 7 Ultimate"}, {"06:25 PM"},
             {"Display", "6.78-inch AMOLED 165Hz"},
             {"Processor", "Snapdragon 8 Gen 2"},
             {"Rear Camera", "50MP + 13MP + 8MP"},
             {"Front Camera", "32MP"},
             {"Battery", "6000 mAh"},
             {"Storage", "256GB, 512GB"},
             {"Colors", "Storm White, Phantom Black"},
             {"OS", "Android 13"},
             {"Water Resistance", "IP54"}
            }
        };

        for (int i = 0; i < mobiles.length; i++) {
            String color = COLORS[i % COLORS.length];
            printPhone(mobiles[i][1][0], mobiles[i][0][0], color);
            System.out.println(color + mobiles[i][0][0] + " Specifications" + RESET);
            String[][] specs = new String[mobiles[i].length - 2][2];
            for (int j = 2; j < mobiles[i].length; j++) {
                specs[j - 2][0] = mobiles[i][j][0];
                specs[j - 2][1] = mobiles[i][j][1];
            }
            printSpecs(specs, color);

            // Add 1.5-second delay
            Thread.sleep(1500);
        }
        display();
    }
    
}
class Main2 extends BANK
{
    static Scanner sc= new Scanner(System.in);
    // ANSI color codes
    public static final String RESET = "\033[0m";
    public static final String GRA = "\033[37m";    // Ear tip
    public static final String CYA = "\033[96m";    // Brand name
    public static final String YELLO = "\033[93m";  // Specs heading
    public static final String MAGENTA = "\033[95m"; // Specs labels
    public static final String WHIT = "\033[97m";   // Specs values
    
    // Earbud colors array (soft, distinct palette)
    public static final String[] COLORS = {
        "\033[94m",       // Blue
        "\033[91m",       // Red
        "\033[92m",       // Green
        "\033[96m",       // Cyan
        "\033[95m",       // Magenta
        "\033[93m",       // Yellow
        "\033[38;5;208m", // Orange
        "\033[38;5;129m", // Purple
        "\033[38;5;27m",  // Deep Blue
        "\033[38;5;47m"   // Aqua Green
    };
    
    public static final String RESETT        = "\u001B[0m";
public static final String RED           = "\u001B[31m";
public static final String GREEN         = "\u001B[32m";
public static final String YELLOW        = "\u001B[33m";
public static final String BLUE          = "\u001B[34m";
public static final String PURPLE        = "\u001B[35m";
public static final String CYAN          = "\u001B[36m";
public static final String WHITE         = "\u001B[37m";
public static final String GRAY          = "\u001B[90m";

public static final String LIGHT_RED     = "\u001B[91m";
public static final String LIGHT_GREEN   = "\u001B[92m";
public static final String LIGHT_YELLOW  = "\u001B[93m";
public static final String LIGHT_BLUE    = "\u001B[94m";
public static final String LIGHT_PURPLE  = "\u001B[95m";
public static final String LIGHT_CYAN    = "\u001B[96m";
public static final String LIGHT_WHITE   = "\u001B[97m";

public static final String ORANGE        = "\u001B[38;5;208m";
public static final String LIGHT_ORANGE  = "\u001B[38;5;214m";

     static String adb;
static void bankb(int a)
{
    System.out.println(LIGHT_YELLOW + " PLEASE ENTER THE AMOUNT " + a + RESETT);
    
   System.out.print(new BANK().get4());
	System.out.println("    Available Balance ");

        int ty=sc.nextInt();
	if(ty> new BANK().get4())
	{
  		System.out.println("insufficient balance payment cannot be possible\n Enter 1 for main menu or 2 for exit ");
		char h=sc.next().charAt(0);
		if(h=='1')
		{
		    try{
		    A.main(null);
		    }
		    catch(InterruptedException e)
		    {
		        
		    }
		}
		if(h=='2')
		{
			return; 	
		}
		
			
	}
	else
	{
    boolean cat = false;
    while (!cat)
    {
        if (ty < a)
        {
            System.out.println(RED + "  ENTERED AMOUNT IS LESS THAN THE ACTUAL AMOUNT   PLEASE ENTER THE VALID AMOUNT    " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else if (ty > a)
        {
            System.out.println(RED + " ENTERED AMOUNT IS MORE THAN THE ACTUAL AMOUNT  " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else
        {
            cat = true;
            System.out.println(GREEN + " PAYMENT SUCCESSFUL   " + RESETT);
            int alo=new BANK().get4()-ty;
            System.out.println(alo+" REMAINING BALANCE ");
            new BANK().bala(alo);
            System.out.print(LIGHT_GREEN + " YOUR PRODUCT WILL BE DELIVERED TO " + RESETT);
            System.out.println(LIGHT_CYAN + adb + " IN 2 DAYS ...." + RESETT);
            System.out.println();
            System.out.println(LIGHT_BLUE + "  IF YOU WANT TO CONTINUE SHOPPING PLEASE SELECT 1 OR ENTER 2 TO EXIT " + RESETT);
            char kop = sc.next().charAt(0);
            if (kop == '1')
            {
                System.out.println(LIGHT_BLUE + "IF YOU WANT TO GO TO THE MAIN ITEM PAGE THEN ENTER 1  OR ENTER 2 FOR PREVIOUS ITEM PAGE ELSE ANY KEY TO EXIT " + RESETT);
                char pok = sc.next().charAt(0);
                if (pok == '1')
                {
                    try {
                        A.main(null);   
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if (pok == '2')
                {
                
                        display();
                }
                else
                {
                    System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                    return;
                }
            }
            else
            {
                System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                return;
            }
        }
    }
	}
}

    static void item1() {
    System.out.println(CYAN + "         Apple Watch " + RESET);
    System.out.println(YELLOW + "         Apple Watch Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Apple S7 Chip" + RESET);
    System.out.println(WHITE + "         Battery: 18 hrs" + RESET);
    System.out.println(WHITE + "         OS: watchOS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹32,900" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans1 = sc.next();
    if (ans1.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 32900; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 32900; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice1 = sc.nextInt(); if (choice1 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item2() {
    System.out.println(CYAN + "         Samsung Galaxy Watch " + RESET);
    System.out.println(YELLOW + "         Samsung Galaxy Watch Specifications" + RESET);
    System.out.println(WHITE + "         Display: Super AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Exynos/Wear Chip" + RESET);
    System.out.println(WHITE + "         Battery: 40 hrs" + RESET);
    System.out.println(WHITE + "         OS: Wear OS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹28,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans2 = sc.next();
    if (ans2.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 28999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 28999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice2 = sc.nextInt(); if (choice2 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item3() {
    System.out.println(CYAN + "         Fitbit Versa 3 " + RESET);
    System.out.println(YELLOW + "         Fitbit Versa 3 Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Fitbit Chip" + RESET);
    System.out.println(WHITE + "         Battery: 6 days" + RESET);
    System.out.println(WHITE + "         OS: Fitbit OS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹15,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans3 = sc.next();
    if (ans3.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 15999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 15999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice3 = sc.nextInt(); if (choice3 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item4() {
    System.out.println(CYAN + "         Garmin Venu " + RESET);
    System.out.println(YELLOW + "         Garmin Venu Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Garmin Chip" + RESET);
    System.out.println(WHITE + "         Battery: 5 days" + RESET);
    System.out.println(WHITE + "         OS: Garmin OS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹37,490" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans4 = sc.next();
    if (ans4.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 37490; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 37490; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice4 = sc.nextInt(); if (choice4 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}
static void item5() {
    System.out.println(CYAN + "         Fossil Gen 6 " + RESET);
    System.out.println(YELLOW + "         Fossil Gen 6 Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Snapdragon Wear 4100+" + RESET);
    System.out.println(WHITE + "         Battery: 24 hrs" + RESET);
    System.out.println(WHITE + "         OS: Wear OS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹21,995" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans5 = sc.next();
    if (ans5.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 21995; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 21995; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice5 = sc.nextInt(); if (choice5 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item6() {
    System.out.println(CYAN + "         Huawei Watch GT 3 " + RESET);
    System.out.println(YELLOW + "         Huawei Watch GT 3 Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Huawei Chip" + RESET);
    System.out.println(WHITE + "         Battery: 14 days" + RESET);
    System.out.println(WHITE + "         OS: HarmonyOS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹18,990" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans6 = sc.next();
    if (ans6.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 18990; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 18990; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice6 = sc.nextInt(); if (choice6 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item7() {
    System.out.println(CYAN + "         Amazfit GTR 3 " + RESET);
    System.out.println(YELLOW + "         Amazfit GTR 3 Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Zepp Chip" + RESET);
    System.out.println(WHITE + "         Battery: 21 days" + RESET);
    System.out.println(WHITE + "         OS: Zepp OS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹13,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans7 = sc.next();
    if (ans7.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 13999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 13999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice7 = sc.nextInt(); if (choice7 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item8() {
    System.out.println(CYAN + "         TicWatch Pro 3 " + RESET);
    System.out.println(YELLOW + "         TicWatch Pro 3 Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED + LCD" + RESET);
    System.out.println(WHITE + "         Processor: Snapdragon Wear 4100" + RESET);
    System.out.println(WHITE + "         Battery: 72 hrs" + RESET);
    System.out.println(WHITE + "         OS: Wear OS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹23,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans8 = sc.next();
    if (ans8.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 23999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 23999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice8 = sc.nextInt(); if (choice8 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item9() {
    System.out.println(CYAN + "         OnePlus Watch " + RESET);
    System.out.println(YELLOW + "         OnePlus Watch Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: RTOS Chip" + RESET);
    System.out.println(WHITE + "         Battery: 14 days" + RESET);
    System.out.println(WHITE + "         OS: RTOS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹14,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans9 = sc.next();
    if (ans9.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 14999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 14999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice9 = sc.nextInt(); if (choice9 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item10() {
    System.out.println(CYAN + "         Oppo Watch " + RESET);
    System.out.println(YELLOW + "         Oppo Watch Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Snapdragon Wear 4100" + RESET);
    System.out.println(WHITE + "         Battery: 36 hrs" + RESET);
    System.out.println(WHITE + "         OS: Wear OS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹19,990" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans10 = sc.next();

    if (ans10.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { 
            User u = new User(); 
            boolean ok = u.login();
            if (!ok) { 
                System.out.println(RED + "   " + RESET); 
                System.exit(0); 
            } else { 
                System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
                int it = 19990; 
                System.out.println(LIGHT_ORANGE + (it - 700) + RESET); 
                bankb(it - 700); 
            }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 19990; 
            System.out.println(LIGHT_ORANGE + (it - 500) + RESET); 
            bankb(it - 500);
        } else { 
            System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); 
            display(); 
            return; 
        }
    } else { 
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice10 = sc.nextInt(); 
        if (choice10 == 1) { 
            display(); 
        } else { 
            System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); 
        }
    }
}

    static void display() {
    // Colors
    final String RESETT = "\033[0m";
    final String CYAN = "\033[96m";
    final String YELLO = "\033[93m";
    final String GREEN = "\033[92m";
    final String RED = "\033[91m";
    final String PURPLE = "\033[95m";
    final String BLUE = "\033[94m";

    System.out.println(CYAN + "         PLEASE SELECT YOUR ITEMS       " + RESETT);
    System.out.println();

    System.out.println(YELLO + "       ITEM 1      --->  Boult" + RESETT);
    System.out.println(YELLO + "       ITEM 2      --->  Apple AirPods Max" + RESETT);
    System.out.println(YELLO + "       ITEM 3      --->  Realme" + RESETT);
    System.out.println(YELLO + "       ITEM 4      --->  OnePlus" + RESETT);
    System.out.println(YELLO + "       ITEM 5      --->  Samsung" + RESETT);
    System.out.println(YELLO + "       ITEM 6      --->  Nothing" + RESETT);
    System.out.println(YELLO + "       ITEM 7      --->  boAt" + RESETT);
    System.out.println(YELLO + "       ITEM 8      --->  Mi (Xiaomi)" + RESETT);
    System.out.println(YELLO + "       ITEM 9      --->  Sony" + RESETT);
    System.out.println(YELLO + "       ITEM 10     --->  Zebronics" + RESETT);
    System.out.println();

    System.out.print(GREEN + "     IF YOU WANT TO PLACE THE ORDER   THEN ENTER 1 OR ENTER 2 MENU ITEMS AND ANY KEY FOR EXIT       ----->  " + RESETT);
    char a = sc.next().charAt(0);
    if (a == '1') {
        System.out.print(BLUE + "     ---> PLEASE ENTER THE ITEM NUMBER          ----------->" + RESETT);
        int it = sc.nextInt();
        if (it > 0 && it <= 10) {
            switch (it) {
                case 1: item1(); break;
                case 2: item2(); break;
                case 3: item3(); break;
                case 4: item4(); break;
                case 5: item5(); break;
                case 6: item6(); break;
                case 7: item7(); break;
                case 8: item8(); break;
                case 9: item9(); break;
                case 10: item10(); break;
            }
        } else {
            System.out.println(RED + "          INVALID ITEM NUMBER            " + RESETT);
            System.out.println(PURPLE + "IF YOU WANT TO RE ENTER THE ITEM NUMBER ENTER YES ELSE NO" + RESETT);
            String ao = sc.next();
            if (ao.equals("YES")) {
                it = sc.nextInt();
            } else {
                System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEM NAMES THEN ENTER 1 ELSE TO EXIT ENTER 2" + RESETT);
                int aq = sc.nextInt();
                if (aq == 1) {
                    display();
                } else {
                    System.out.println(GREEN + "    THANK YOU VISIT AGAIN       " + RESETT);
                }
            }
        }
    }
    else if (a == '2') {
                try {
                    A.main(null);
                } catch (InterruptedException e) {
                    e.printStackTrace(); // or custom message
                }
            }
            else{
                System.out.println(GREEN + "    THANK YOU VISIT AGAIN       " + RESETT);
                    return;
            }
}


    public static String earbudArt(String brand, String color) {
    return color +
           "   ( " + GRA  + "###" + color + " )     ( " + GRA  + "###" + color + " )\n" +
           "    \\ " + color + "##" + " /       \\ " + color + "##" + " /\n" +
           "     \\____/         \\____/\n" +
           "       ||               ||\n" +
           "       ||               ||\n" +
           "       ||               ||\n" +
           "    " + CYA  + brand + RESET;
}


    public static void main(String[] args) throws InterruptedException {
        String[][] headphones = {
            {"Boult", "Over-Ear", "Good Bass, Lightweight", "20 hrs", "Black, Blue", "$2000"},
            {"Apple AirPods Max", "Over-Ear", "ANC, Spatial Audio", "20 hrs", "Silver, Space Gray", "Rs25000"},
            {"Realme", "Over-Ear", "ANC, Comfortable Fit", "18 hrs", "Black, White", "Rs1200"},
            {"OnePlus", "Over-Ear", "ANC, Dolby Atmos", "25 hrs", "Black, Green", "Rs3500"},
            {"Samsung", "Over-Ear", "ANC, High-Resolution Audio", "22 hrs", "Black, Silver", "Rs1700"},
            {"Nothing", "Over-Ear", "Transparent Design, ANC", "20 hrs", "White", "Rs1200"},
            {"boAt", "Over-Ear", "Deep Bass, Water Resistant", "15 hrs", "Black, Red", "Rs1000"},
            {"Mi (Xiaomi)", "Over-Ear", "ANC, Comfortable Fit", "18 hrs", "Black", "Rs1100 "},
            {"Sony", "Over-Ear", "ANC, LDAC Support", "30 hrs", "Black, Silver", "Rs3000 "},
            {"Zebronics", "Over-Ear", "RGB Lights, Gaming Mode", "12 hrs", "Black", "Rs4000 "}
        };

        for (int i = 0; i < headphones.length; i++) {
            System.out.println(earbudArt(headphones[i][0], COLORS[i]));
            System.out.println(YELLO + headphones[i][0] + " Specifications" + RESET);
            System.out.println(MAGENTA + "--> Type: " + WHIT  + headphones[i][1] + RESET);
            System.out.println(MAGENTA + "--> Features: " + WHIT  + headphones[i][2] + RESET);
            System.out.println(MAGENTA + "--> Battery Life: " + WHIT  + headphones[i][3] + RESET);
            System.out.println(MAGENTA + "--> Colors Available: " + WHIT  + headphones[i][4] + RESET);
            System.out.println(MAGENTA + "--> Cost: " + WHIT  + headphones[i][5] + RESET);
            System.out.println();

            Thread.sleep(1500);
        }
        
        display();
        
    }
}

class Main3 extends BANK {
    // ANSI color codes
    static Scanner sc= new Scanner(System.in);
    // Refrigerator body colors
    public static final String[] COLORS = {
        "\033[94m",       // Blue
        "\033[91m",       // Red
        "\033[92m",       // Green
        "\033[96m",       // Cyan
        "\033[95m",       // Magenta
        "\033[93m",       // Yellow
        "\033[38;5;208m", // Orange
        "\033[38;5;129m", // Purple
        "\033[38;5;27m",  // Deep Blue
        "\033[38;5;47m"   // Aqua Green
    };
   public static final String RESETT        = "\u001B[0m";
public static final String RED           = "\u001B[31m";
public static final String GREEN         = "\u001B[32m";
public static final String YELLOW        = "\u001B[33m";
public static final String BLUE          = "\u001B[34m";
public static final String PURPLE        = "\u001B[35m";
public static final String CYAN          = "\u001B[36m";
public static final String WHITE         = "\u001B[37m";
public static final String GRAY          = "\u001B[90m";

public static final String LIGHT_RED     = "\u001B[91m";
public static final String LIGHT_GREEN   = "\u001B[92m";
public static final String LIGHT_YELLOW  = "\u001B[93m";
public static final String LIGHT_BLUE    = "\u001B[94m";
public static final String LIGHT_PURPLE  = "\u001B[95m";
public static final String LIGHT_CYAN    = "\u001B[96m";
public static final String LIGHT_WHITE   = "\u001B[97m";

public static final String ORANGE        = "\u001B[38;5;208m";
public static final String LIGHT_ORANGE  = "\u001B[38;5;214m";

     static String adb;
     static void bankb(int a)
{
    System.out.println(LIGHT_YELLOW + " PLEASE ENTER THE AMOUNT " + a + RESETT);
    
   System.out.print(new BANK().get4());
	System.out.println("    Available Balance ");

        int ty=sc.nextInt();
	if(ty> new BANK().get4())
	{
  		System.out.println("insufficient balance payment cannot be possible\n Enter 1 for main menu or 2 for exit ");
		char h=sc.next().charAt(0);
		if(h=='1')
		{
		    try{
		    A.main(null);
		    }
		    catch(InterruptedException e)
		    {
		        
		    }
		}
		if(h=='2')
		{
			return; 	
		}
		
			
	}
	else
	{
    boolean cat = false;
    while (!cat)
    {
        if (ty < a)
        {
            System.out.println(RED + "  ENTERED AMOUNT IS LESS THAN THE ACTUAL AMOUNT   PLEASE ENTER THE VALID AMOUNT    " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else if (ty > a)
        {
            System.out.println(RED + " ENTERED AMOUNT IS MORE THAN THE ACTUAL AMOUNT  " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else
        {
            cat = true;
            System.out.println(GREEN + " PAYMENT SUCCESSFUL   " + RESETT);
            int alo=new BANK().get4()-ty;
            System.out.println(alo+" REMAINING BALANCE ");
            new BANK().bala(alo);
            System.out.print(LIGHT_GREEN + " YOUR PRODUCT WILL BE DELIVERED TO " + RESETT);
            System.out.println(LIGHT_CYAN + adb + " IN 2 DAYS ...." + RESETT);
            System.out.println();
            System.out.println(LIGHT_BLUE + "  IF YOU WANT TO CONTINUE SHOPPING PLEASE SELECT 1 OR ENTER 2 TO EXIT " + RESETT);
            char kop = sc.next().charAt(0);
            if (kop == '1')
            {
                System.out.println(LIGHT_BLUE + "IF YOU WANT TO GO TO THE MAIN ITEM PAGE THEN ENTER 1  OR ENTER 2 FOR PREVIOUS ITEM PAGE ELSE ANY KEY TO EXIT " + RESETT);
                char pok = sc.next().charAt(0);
                if (pok == '1')
                {
                    try {
                        A.main(null);   
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if (pok == '2')
                {
                    display();
                }
                else
                {
                    System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                    return;
                }
            }
            else
            {
                System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                return;
            }
        }
    }
	}
}
public static final String RESET        = "\u001B[0m";
static void item1() {
    System.out.println(CYAN + "         Apple Watch " + RESET);
    System.out.println(YELLOW + "         Apple Watch Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Apple S8" + RESET);
    System.out.println(WHITE + "         Battery: 18 hrs" + RESET);
    System.out.println(WHITE + "         OS: watchOS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹32,900" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans1 = sc.next();

    if (ans1.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 32900; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 32900; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice1 = sc.nextInt(); if (choice1 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item2() {
    System.out.println(CYAN + "         Samsung Galaxy " + RESET);
    System.out.println(YELLOW + "         Samsung Galaxy Specifications" + RESET);
    System.out.println(WHITE + "         Display: Super AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Exynos/Snapdragon" + RESET);
    System.out.println(WHITE + "         Battery: 40 hrs" + RESET);
    System.out.println(WHITE + "         OS: Wear OS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹28,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans2 = sc.next();

    if (ans2.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 28999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 28999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice2 = sc.nextInt(); if (choice2 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}
static void item3() {
    System.out.println(CYAN + "         Fitbit Versa 3 " + RESET);
    System.out.println(YELLOW + "         Fitbit Versa 3 Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Fitbit Chip" + RESET);
    System.out.println(WHITE + "         Battery: 6 days" + RESET);
    System.out.println(WHITE + "         OS: Fitbit OS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹15,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans3 = sc.next();

    if (ans3.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 15999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 15999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice3 = sc.nextInt(); if (choice3 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item4() {
    System.out.println(CYAN + "         Garmin Venu " + RESET);
    System.out.println(YELLOW + "         Garmin Venu Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Garmin Chip" + RESET);
    System.out.println(WHITE + "         Battery: 5 days" + RESET);
    System.out.println(WHITE + "         OS: Garmin OS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹37,490" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans4 = sc.next();

    if (ans4.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 37490; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 37490; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice4 = sc.nextInt(); if (choice4 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item5() {
    System.out.println(CYAN + "         Fossil Gen 6 " + RESET);
    System.out.println(YELLOW + "         Fossil Gen 6 Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Snapdragon Wear 4100+" + RESET);
    System.out.println(WHITE + "         Battery: 24 hrs" + RESET);
    System.out.println(WHITE + "         OS: Wear OS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹21,995" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans5 = sc.next();

    if (ans5.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 21995; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 21995; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice5 = sc.nextInt(); if (choice5 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item6() {
    System.out.println(CYAN + "         Huawei Watch GT 3 " + RESET);
    System.out.println(YELLOW + "         Huawei Watch GT 3 Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Huawei Chip" + RESET);
    System.out.println(WHITE + "         Battery: 14 days" + RESET);
    System.out.println(WHITE + "         OS: HarmonyOS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹18,990" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans6 = sc.next();

    if (ans6.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 18990; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 18990; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice6 = sc.nextInt(); if (choice6 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item7() {
    System.out.println(CYAN + "         Amazfit GTR 3 " + RESET);
    System.out.println(YELLOW + "         Amazfit GTR 3 Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Zepp Chip" + RESET);
    System.out.println(WHITE + "         Battery: 21 days" + RESET);
    System.out.println(WHITE + "         OS: Zepp OS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹13,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans7 = sc.next();

    if (ans7.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 13999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 13999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice7 = sc.nextInt(); if (choice7 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item8() {
    System.out.println(CYAN + "         TicWatch Pro 3 " + RESET);
    System.out.println(YELLOW + "         TicWatch Pro 3 Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED + LCD" + RESET);
    System.out.println(WHITE + "         Processor: Snapdragon Wear 4100" + RESET);
    System.out.println(WHITE + "         Battery: 72 hrs" + RESET);
    System.out.println(WHITE + "         OS: Wear OS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹23,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans8 = sc.next();

    if (ans8.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 23999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 23999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice8 = sc.nextInt(); if (choice8 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item9() {
    System.out.println(CYAN + "         OnePlus Watch " + RESET);
    System.out.println(YELLOW + "         OnePlus Watch Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: RTOS Chip" + RESET);
    System.out.println(WHITE + "         Battery: 14 days" + RESET);
    System.out.println(WHITE + "         OS: RTOS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹14,999" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans9 = sc.next();

    if (ans9.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 14999; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 14999; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice9 = sc.nextInt(); if (choice9 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}

static void item10() {
    System.out.println(CYAN + "         Oppo Watch " + RESET);
    System.out.println(YELLOW + "         Oppo Watch Specifications" + RESET);
    System.out.println(WHITE + "         Display: AMOLED" + RESET);
    System.out.println(WHITE + "         Processor: Wear OS Chip" + RESET);
    System.out.println(WHITE + "         Battery: 36 hrs" + RESET);
    System.out.println(WHITE + "         OS: Wear OS" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹19,990" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESET);
    String ans10 = sc.next();

    if (ans10.equals("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        if (nu.equals("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESET);
            int it = 19990; System.out.println(LIGHT_ORANGE + (it - 700) + RESET); bankb(it - 700); }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESET);
            int it = 19990; System.out.println(LIGHT_ORANGE + (it - 500) + RESET); bankb(it - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice10 = sc.nextInt(); if (choice10 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET); }
    }
}


static void display() {
    // Colors
    final String RESETT = "\033[0m";
    final String CYAN = "\033[96m";
    final String YELLOW = "\033[93m";
    final String GREEN = "\033[92m";
    final String RED = "\033[91m";
    final String PURPLE = "\033[95m";
    final String BLUE = "\033[94m";

    System.out.println(CYAN + "         PLEASE SELECT YOUR ITEMS       " + RESETT);
    System.out.println();

    System.out.println(YELLOW + "       ITEM 1      --->  LG Double Door" + RESETT);
    System.out.println(YELLOW + "       ITEM 2      --->  Samsung Side by Side" + RESETT);
    System.out.println(YELLOW + "       ITEM 3      --->  Whirlpool Single Door" + RESETT);
    System.out.println(YELLOW + "       ITEM 4      --->  Godrej French Door" + RESETT);
    System.out.println(YELLOW + "       ITEM 5      --->  Panasonic Side by Side" + RESETT);
    System.out.println(YELLOW + "       ITEM 6      --->  Haier Bottom Mount" + RESETT);
    System.out.println(YELLOW + "       ITEM 7      --->  Bosch French Door" + RESETT);
    System.out.println(YELLOW + "       ITEM 8      --->  Hitachi Side by Side" + RESETT);
    System.out.println(YELLOW + "       ITEM 9      --->  Kelvinator Mini Fridge" + RESETT);
    System.out.println(YELLOW + "       ITEM 10     --->  Voltas Beko Double Door" + RESETT);
    System.out.println();

    System.out.print(GREEN + "      IF YOU WANT TO PLACE THE ORDER   THEN ENTER 1 OR ENTER 2 MENU ITEMS AND ANY KEY FOR EXIT         ----->  " + RESETT);
    char a = sc.next().charAt(0);
    if (a == '1') {
        System.out.print(BLUE + "     ---> PLEASE ENTER THE ITEM NUMBER          ----------->" + RESETT);
        int it = sc.nextInt();
        if (it > 0 && it <= 10) {
            switch (it) {
                case 1: item1(); break;
                case 2: item2(); break;
                case 3: item3(); break;
                case 4: item4(); break;
                case 5: item5(); break;
                case 6: item6(); break;
                case 7: item7(); break;
                case 8: item8(); break;
                case 9: item9(); break;
                case 10: item10(); break;
            }
        } else {
            System.out.println(RED + "          INVALID ITEM NUMBER            " + RESETT);
            System.out.println(PURPLE + "IF YOU WANT TO RE ENTER THE ITEM NUMBER ENTER YES ELSE NO" + RESETT);
            String ao = sc.next();
            if (ao.equals("YES")) {
                it = sc.nextInt();
            } else {
                System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEM NAMES THEN ENTER 1 ELSE TO EXIT ENTER 2" + RESETT);
                int aq = sc.nextInt();
                if (aq == 1) {
                    display();
                } else {
                    System.out.println(GREEN + "    THANK YOU VISIT AGAIN       " + RESETT);
                }
            }
        }
    }
    else if (a == '2') {
                try {
                    A.main(null);
                } catch (InterruptedException e) {
                    e.printStackTrace(); // or custom message
                }
            }
            else{
                System.out.println(GREEN + "    THANK YOU VISIT AGAIN       " + RESETT);
                    return;
            }

}
public static final String MAGENTA = "\033[95m"; // Specs labels
    public static final String WHIT = "\033[97m";   // Specs values


    // ASCII Refrigerator art
    public static String refrigeratorArt(String brand, String color) {
        String[] fridge = {
	    color + "                        "+brand+"              ",
            color + "        .=====================================.",
            color + "        ||                                   ||",
            color + "        ||           +-----------+           ||",
            color + "        ||           |  FREEZER  |           ||",
            color + "        ||           |  _______  |           ||",
            color + "        ||           | |       | |           ||",
            color + "        ||           | |_______| |           ||",
            color + "        ||           |           |           ||",
            color + "        ||           +-----------+           ||",
            color + "        ||-----------------------------------||",
            color + "        ||           +-----------+           ||",
            color + "        ||           |   " + CYAN  + color + "        |           ||",
            color + "        ||           |  _______  |           ||",
            color + "        ||           | |       | |           ||",
            color + "        ||           | |_______| |           ||",
            color + "        ||           |  .-----.  |           ||",
            color + "        ||           |  |     |  |           ||",
            color + "        ||           |  '-----'  |           ||",
            color + "        ||           +-----------+           ||",
            color + "        ||                                   ||",
            color + "        '====================================='" + RESET
        };

        StringBuilder sb = new StringBuilder();
        for (String line : fridge) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws InterruptedException {
        String[][] refrigerators = {
            {"LG", "Double Door", "Frost Free, Inverter Compressor", "260 L", "Silver, Black", "Rs 25000"},
            {"Samsung", "Side by Side", "Twin Cooling, Wi-Fi", "700 L", "Black, Steel", "Rs 90000"},
            {"Whirlpool", "Single Door", "Direct Cool, Fast Ice", "190 L", "Red, Blue", "Rs 15000"},
            {"Godrej", "French Door", "Convertible Freezer", "300 L", "Silver", "Rs 28000"},
            {"Panasonic", "Side by Side", "Inverter, Glass Finish", "601 L", "Black Glass", "Rs 85000"},
            {"Haier", "Bottom Mount", "Twin Inverter", "320 L", "Blue, White", "Rs 30000"},
            {"Bosch", "French Door", "MultiAirflow, VitaFresh", "500 L", "Steel", "Rs 95000"},
            {"Hitachi", "Side by Side", "Dual Fan Cooling", "640 L", "Black Glass", "Rs 88000"},
            {"Kelvinator", "Mini Fridge", "Compact, Energy Efficient", "170 L", "Silver, White", "Rs 12000"},
            {"Voltas Beko", "Double Door", "Neo Frost Cooling", "340 L", "Silver", "Rs 32000"}
        };

        for (int i = 0; i < refrigerators.length; i++) {
            System.out.println(refrigeratorArt(refrigerators[i][0], COLORS[i]));
            System.out.println(YELLOW + refrigerators[i][0] + " Specifications" + RESET);
            System.out.println(MAGENTA + "--> Type: " + WHIT + refrigerators[i][1] + RESET);
            System.out.println(MAGENTA + "-->  Features: " + WHIT + refrigerators[i][2] + RESET);
            System.out.println(MAGENTA + "-->  Capacity: " + WHIT + refrigerators[i][3] + RESET);
            System.out.println(MAGENTA + "-->  Colors Available: " + WHITE + refrigerators[i][4] + RESET);
            System.out.println(MAGENTA + "-->  Cost: " + WHIT + refrigerators[i][5] + RESET);
            System.out.println();
            Thread.sleep(1500);
        }
        display();
    }
}
 class Main4 {
    // ANSI color codes
    public static final String RESET = "\033[0m";
    //public static final String GRAY = "\033[37m";    // Stand
   // public static final String CYAN = "\033[96m";    // Brand name
   // public static final String YELLOW = "\033[93m";  // Specs heading
    public static final String MAGENTA = "\033[95m"; // Specs labels
    //public static final String WHITE = "\033[97m";   // Specs values
        static Scanner sc= new Scanner(System.in);
    // TV body colors
    public static final String[] COLORS = {
        "\033[94m",       // Blue
        "\033[91m",       // Red
        "\033[92m",       // Green
        "\033[96m",       // Cyan
        "\033[95m",       // Magenta
        "\033[93m",       // Yellow
        "\033[38;5;208m", // Orange
        "\033[38;5;129m", // Purple
        "\033[38;5;27m",  // Deep Blue
        "\033[38;5;47m"   // Aqua Green
    };
    public static final String RESETT        = "\u001B[0m";
public static final String RED           = "\u001B[31m";
public static final String GREEN         = "\u001B[32m";
public static final String YELLOW        = "\u001B[33m";
public static final String BLUE          = "\u001B[34m";
public static final String PURPLE        = "\u001B[35m";
public static final String CYAN          = "\u001B[36m";
public static final String WHITE         = "\u001B[37m";
public static final String GRAY          = "\u001B[90m";

public static final String LIGHT_RED     = "\u001B[91m";
public static final String LIGHT_GREEN   = "\u001B[92m";
public static final String LIGHT_YELLOW  = "\u001B[93m";
public static final String LIGHT_BLUE    = "\u001B[94m";
public static final String LIGHT_PURPLE  = "\u001B[95m";
public static final String LIGHT_CYAN    = "\u001B[96m";
public static final String LIGHT_WHITE   = "\u001B[97m";

public static final String ORANGE        = "\u001B[38;5;208m";
public static final String LIGHT_ORANGE  = "\u001B[38;5;214m";

     static String adb;
static void bankb(int a)
{
    System.out.println(LIGHT_YELLOW + " PLEASE ENTER THE AMOUNT " + a + RESETT);
    
 System.out.print(new BANK().get4());
	System.out.println("    Available Balance ");

        int ty=sc.nextInt();
	if(ty> new BANK().get4())
	{
  		System.out.println("insufficient balance payment cannot be possible\n Enter 1 for main menu or 2 for exit ");
		char h=sc.next().charAt(0);
		if(h=='1')
		{
		    try{
		    A.main(null);
		    }
		    catch(InterruptedException e)
		    {
		        
		    }
		}
		if(h=='2')
		{
			return; 	
		}
		
			
	}
	else
	{
    boolean cat = false;
    while (!cat)
    {
        if (ty < a)
        {
            System.out.println(RED + "  ENTERED AMOUNT IS LESS THAN THE ACTUAL AMOUNT   PLEASE ENTER THE VALID AMOUNT    " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else if (ty > a)
        {
            System.out.println(RED + " ENTERED AMOUNT IS MORE THAN THE ACTUAL AMOUNT  " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else
        {
            cat = true;
            System.out.println(GREEN + " PAYMENT SUCCESSFUL   " + RESETT);
            System.out.print(LIGHT_GREEN + " YOUR PRODUCT WILL BE DELIVERED TO " + RESETT);
            System.out.println(LIGHT_CYAN + adb + " IN 2 DAYS ...." + RESETT);
            System.out.println();
            System.out.println(LIGHT_BLUE + "  IF YOU WANT TO CONTINUE SHOPPING PLEASE SELECT 1 OR ENTER 2 TO EXIT " + RESETT);
            char kop = sc.next().charAt(0);
            if (kop == '1')
            {
                System.out.println(LIGHT_BLUE + "IF YOU WANT TO GO TO THE MAIN ITEM PAGE THEN ENTER 1  OR ENTER 2 FOR PREVIOUS ITEM PAGE ELSE ANY KEY TO EXIT " + RESETT);
                char pok = sc.next().charAt(0);
                if (pok == '1')
                {
                    try {
                        A.main(null);   
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if (pok == '2')
                {
                    display();
                }
                else
                {
                    System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                    return;
                }
            }
            else
            {
                System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                return;
            }
        }
    }
	}
}
    
    
    static void item1() {
    System.out.println(CYAN + "         Sony Bravia" + RESETT);
    System.out.println(YELLOW + "         Sony Bravia Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 55 inch Smart LED 4K HDR" + RESETT);
    System.out.println(WHITE + "         Features: Smart TV with HDR" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹65,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans1 = sc.next();
    if (ans1.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 65000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESETT); bankb(price - 700); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESETT); bankb(price - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice1 = sc.nextInt(); if (choice1 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
    }
}

static void item2() {
    System.out.println(CYAN + "         Samsung Neo QLED" + RESETT);
    System.out.println(YELLOW + "         Samsung Neo QLED Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 65 inch Quantum Matrix 8K" + RESETT);
    System.out.println(WHITE + "         Features: Smart QLED TV" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹2,50,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans2 = sc.next();
    if (ans2.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 250000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESETT); bankb(price - 700); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESETT); bankb(price - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice2 = sc.nextInt(); if (choice2 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
    }
}
    static void item3() {
    System.out.println(CYAN + "         LG OLED" + RESETT);
    System.out.println(YELLOW + "         LG OLED Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 48 inch Self-lit OLED 4K" + RESETT);
    System.out.println(WHITE + "         Features: OLED Panel, Smart TV" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹1,20,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans3 = sc.next();
    if (ans3.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 120000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESETT); bankb(price - 700); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESETT); bankb(price - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice3 = sc.nextInt(); if (choice3 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
    }
}

static void item4() {
    System.out.println(CYAN + "         Panasonic Viera" + RESETT);
    System.out.println(YELLOW + "         Panasonic Viera Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 40 inch Full HD LED" + RESETT);
    System.out.println(WHITE + "         Features: Smart TV, Full HD" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹35,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans4 = sc.next();
    if (ans4.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 35000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESETT); bankb(price - 700); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESETT); bankb(price - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice4 = sc.nextInt(); if (choice4 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
    }
}

static void item5() {
    System.out.println(CYAN + "         OnePlus TV Q1" + RESETT);
    System.out.println(YELLOW + "         OnePlus TV Q1 Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 55 inch QLED 4K Dolby Vision" + RESETT);
    System.out.println(WHITE + "         Features: Smart QLED TV" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹62,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans5 = sc.next();
    if (ans5.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 62000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESETT); bankb(price - 700); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESETT); bankb(price - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice5 = sc.nextInt(); if (choice5 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
    }
}

static void item6() {
    System.out.println(CYAN + "         TCL Mini LED" + RESETT);
    System.out.println(YELLOW + "         TCL Mini LED Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 75 inch 144Hz Gaming TV" + RESETT);
    System.out.println(WHITE + "         Features: Gaming TV, Smart LED" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹1,10,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans6 = sc.next();
    if (ans6.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 110000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESETT); bankb(price - 700); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESETT); bankb(price - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice6 = sc.nextInt(); if (choice6 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
    }
}

static void item7() {
    System.out.println(CYAN + "         Vu Masterpiece" + RESETT);
    System.out.println(YELLOW + "         Vu Masterpiece Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 85 inch 4K QLED Ultra Bright" + RESETT);
    System.out.println(WHITE + "         Features: Smart QLED TV" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹1,50,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans7 = sc.next();
    if (ans7.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 150000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESETT); bankb(price - 700); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESETT); bankb(price - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice7 = sc.nextInt(); if (choice7 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
    }
}

static void item8() {
    System.out.println(CYAN + "         MI TV 5X" + RESETT);
    System.out.println(YELLOW + "         MI TV 5X Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 43 inch Smart 4K HDR10+" + RESETT);
    System.out.println(WHITE + "         Features: Smart TV" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹35,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans8 = sc.next();
    if (ans8.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 35000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESETT); bankb(price - 700); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESETT); bankb(price - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice8 = sc.nextInt(); if (choice8 == 1) { display(); } else { System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
    }
}

static void item9() {
    System.out.println(CYAN + "         Philips Ambilight" + RESETT);
    System.out.println(YELLOW + "         Philips Ambilight Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 65 inch 3-Sided Ambilight OLED" + RESETT);
    System.out.println(WHITE + "         Features: Ambilight, Smart OLED TV" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹1,80,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans9 = sc.next();
    if (ans9.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 180000;
        if (nu.equalsIgnoreCase("SBI")) { 
            User u = new User(); 
            boolean ok = u.login();
            if (!ok) { 
                System.out.println(RED + "   " + RESETT); 
                System.exit(0); 
            } else { 
                System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESETT); 
                bankb(price - 700); 
            }
        } else if (nu.equalsIgnoreCase("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESETT); 
            bankb(price - 500);
        } else { 
            System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); 
            display(); 
            return; 
        }
    } else { 
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice9 = sc.nextInt(); 
        if (choice9 == 1) { 
            display(); 
        } else { 
            System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); 
        }
    }
}
static void item10() {
    System.out.println(CYAN + "         Haier Bezel-less" + RESETT);
    System.out.println(YELLOW + "         Haier Bezel-less Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 32 inch HD Ready Smart TV" + RESETT);
    System.out.println(WHITE + "         Features: Smart TV, Slim Design" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹18,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans10 = sc.next();
    if (ans10.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 18000;
        if (nu.equalsIgnoreCase("SBI")) { 
            User u = new User(); 
            boolean ok = u.login();
            if (!ok) { 
                System.out.println(RED + "   " + RESETT); 
                System.exit(0); 
            } else { 
                System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESETT); 
                bankb(price - 700); 
            }
        } else if (nu.equalsIgnoreCase("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESETT); 
            bankb(price - 500);
        } else { 
            System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); 
            display(); 
            return; 
        }
    } else { 
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice10 = sc.nextInt(); 
        if (choice10 == 1) { 
            display(); 
        } else { 
            System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); 
        }
    }
}

   static void display() {
    // Colors
    final String RESETT = "\033[0m";
    final String CYAN = "\033[96m";
    final String YELLOW = "\033[93m";
    final String GREEN = "\033[92m";
    final String RED = "\033[91m";
    final String PURPLE = "\033[95m";
    final String BLUE = "\033[94m";

    while (true) { // keep showing menu until exit
        System.out.println(CYAN + "         PLEASE SELECT YOUR ITEMS       " + RESETT);
        System.out.println();

        System.out.println(YELLOW + "       ITEM 1      --->  Sony Bravia" + RESETT);
        System.out.println(YELLOW + "       ITEM 2      --->  Samsung Neo QLED" + RESETT);
        System.out.println(YELLOW + "       ITEM 3      --->  LG OLED" + RESETT);
        System.out.println(YELLOW + "       ITEM 4      --->  Panasonic Viera" + RESETT);
        System.out.println(YELLOW + "       ITEM 5      --->  OnePlus TV Q1" + RESETT);
        System.out.println(YELLOW + "       ITEM 6      --->  TCL Mini LED" + RESETT);
        System.out.println(YELLOW + "       ITEM 7      --->  Vu Masterpiece" + RESETT);
        System.out.println(YELLOW + "       ITEM 8      --->  MI TV 5X" + RESETT);
        System.out.println(YELLOW + "       ITEM 9      --->  Philips Ambilight" + RESETT);
        System.out.println(YELLOW + "       ITEM 10     --->  Haier Bezel-less" + RESETT);
        System.out.println();

        System.out.print(GREEN + "     IF YOU WANT TO PLACE THE ORDER THEN ENTER 1 (else 0 to exit) ----->  " + RESETT);
        int a = sc.nextInt();

        if (a == 0) {
            System.out.println(GREEN + "    THANK YOU VISIT AGAIN       " + RESETT);
            return; // exit completely
        }

        if (a == 1) {
            System.out.print(BLUE + "     ---> PLEASE ENTER THE ITEM NUMBER -----------> " + RESETT);
            int it = sc.nextInt();

            if (it > 0 && it <= 10) {
                switch (it) {
                    case 1: item1(); break;
                    case 2: item2(); break;
                    case 3: item3(); break;
                    case 4: item4(); break;
                    case 5: item5(); break;
                    case 6: item6(); break;
                    case 7: item7(); break;
                    case 8: item8(); break;
                    case 9: item9(); break;
                    case 10: item10(); break;
                }
            } else {
                System.out.println(RED + "          INVALID ITEM NUMBER            " + RESETT);
                System.out.println(PURPLE + "IF YOU WANT TO RE-ENTER THE ITEM NUMBER ENTER YES ELSE NO" + RESETT);
                String ao = sc.next();
                if (ao.equalsIgnoreCase("YES")) {
                    continue; // loop again to ask for item
                } else {
                    System.out.println(GREEN + "    THANK YOU VISIT AGAIN       " + RESETT);
                    return;
                }
            }
        } else {
            System.out.println(RED + "   INVALID ENTRY PLEASE ENTER AGAIN" + RESETT);
        }
    }
}



    // Different TV ASCII designs
public static String tvArt(String brand, String color, int design) {
    String[][] designs = {
        { // Design 1 - Wide screen flat TV
            color + "       _________________________________",
            color + "      |                                 |",
            color + "      |                                 |",
            color + "      |                                 |",
            color + "      |                                 |",
            color + "      |                                 |",
            color + "      |_________________________________|",
            GRAY + "                |               |",
            GRAY + "                |_______________|"
        },
        { // Design 2 - Old box TV
            color + "       ______________________________",
            color + "      |                              |",
            color + "      |                              |",
            color + "      |                              |",
            color + "      |______________________________|",
            GRAY + "          ||               ||",
            GRAY + "          ||_______________||"
        },
        { // Design 3 - Curved screen TV
            color + "    .=====================================.",
            color + "   /                                       \\",
            color + "  |                                         |",
            color + "  |                                         |",
            color + "   \\_______________________________________/",
            GRAY + "          /                 \\",
            GRAY + "         /___________________\\"
        },
        { // Design 4 - Cinema style big TV
            color + "     ____________________________________________",
            color + "    |                                            |",
            color + "    |                                            |",
            color + "    |                                            |",
            color + "    |____________________________________________|",
            GRAY + "                ||             ||",
            GRAY + "                ||             ||"
        },
        { // Design 5 - Bezel-less modern TV (ASCII-safe)
            color + "    /---------------------------------------\\",
            color + "    |                                       |",
            color + "    |                                       |",
            color + "    |                                       |",
            color + "    \\---------------------------------------/",
            GRAY + "           /                       \\",
            GRAY + "          /_________________________\\"
        },
        { // Design 6 - Retro antenna TV
            color + "        /\\                    /\\",
            color + "       /  \\__________________/  \\",
            color + "       |                        |",
            color + "       |                        |",
            color + "       |________________________|",
            GRAY + "         ||                  ||",
            GRAY + "         ||__________________||"
        },
        { // Design 7 - Ultra-wide gaming monitor
            color + "  _______________________________________________",
            color + " |                                               |",
            color + " |                                               |",
            color + " |                                               |",
            color + " |_______________________________________________|",
            GRAY + "            /                           \\",
            GRAY + "           /_____________________________\\"
        },
        { // Design 8 - Small compact TV
            color + "   ___________________________",
            color + "  |                           |",
            color + "  |                           |",
            color + "  |___________________________|",
            GRAY + "      ||                 ||",
            GRAY + "      ||_________________||"
        },
        { // Design 9 - Hanging wall TV
            color + "   ===============================",
            color + "   |                            |",
            color + "   |                            |",
            color + "   |____________________________|",
            GRAY + "         |                 |",
            GRAY + "         |_________________|"
        },
        { // Design 10 - Oval futuristic display
            color + "       .-----------------------------.",
            color + "      /                               \\",
            color + "     |                                 |",
            color + "      \\_______________________________/",
            GRAY + "           ||                 ||",
            GRAY + "           ||_________________||"
        }
    };

    StringBuilder sb = new StringBuilder();
    sb.append(CYAN).append("       ").append(brand).append(RESET).append("\n"); // brand above TV
    for (String line : designs[design]) {
        sb.append(line).append("\n");
    }
    return sb.toString() + RESET;
}

    public static void main(String[] args) throws InterruptedException {
        String[][] tvs = {
            {"Sony Bravia", "55 inch", "Smart LED 4K HDR", "₹65,000"},
            {"Samsung Neo QLED", "65 inch", "Quantum Matrix 8K", "₹2,50,000"},
            {"LG OLED", "48 inch", "Self-lit OLED 4K", "₹1,20,000"},
            {"Panasonic Viera", "40 inch", "Full HD LED", "₹35,000"},
            {"OnePlus TV Q1", "55 inch", "QLED 4K Dolby Vision", "₹62,000"},
            {"TCL Mini LED", "75 inch", "144Hz Gaming TV", "₹1,10,000"},
            {"Vu Masterpiece", "85 inch", "4K QLED Ultra Bright", "₹1,50,000"},
            {"MI TV 5X", "43 inch", "Smart 4K HDR10+", "₹35,000"},
            {"Philips Ambilight", "65 inch", "3-Sided Ambilight OLED", "₹1,80,000"},
            {"Haier Bezel-less", "32 inch", "HD Ready Smart TV", "₹18,000"}
        };

        for (int i = 0; i < tvs.length; i++) {
            System.out.println(tvArt(tvs[i][0], COLORS[i], i));
            System.out.println(YELLOW + tvs[i][0] + " Specifications" + RESET);
            System.out.println(MAGENTA + "• Screen Size: " + WHITE + tvs[i][1] + RESET);
            System.out.println(MAGENTA + "• Features: " + WHITE + tvs[i][2] + RESET);
            System.out.println(MAGENTA + "• Cost: " + WHITE + tvs[i][3] + RESET);
            System.out.println();

            Thread.sleep(1500);
        }
        display();
    }
}
class Main5 extends BANK {
	static Scanner sc= new Scanner(System.in);
    public static final String RESET = "\033[0m";
    public static final String YELLOW = "\033[93m";
    public static final String CYAN = "\033[96m";
    public static final String MAGENTA = "\033[95m";
    public static final String WHITE = "\033[97m";
    public static final String[] COLORS = {
        "\033[91m", "\033[92m"
    };
    
    
        // ANSI color codes
    
    // Refrigerator body colors
    
   public static final String RESETT        = "\u001B[0m";
public static final String RED           = "\u001B[31m";
public static final String GREEN         = "\u001B[32m";

public static final String BLUE          = "\u001B[34m";
public static final String PURPLE        = "\u001B[35m";


public static final String GRAY          = "\u001B[90m";

public static final String LIGHT_RED     = "\u001B[91m";
public static final String LIGHT_GREEN   = "\u001B[92m";
public static final String LIGHT_YELLOW  = "\u001B[93m";
public static final String LIGHT_BLUE    = "\u001B[94m";
public static final String LIGHT_PURPLE  = "\u001B[95m";
public static final String LIGHT_CYAN    = "\u001B[96m";
public static final String LIGHT_WHITE   = "\u001B[97m";

public static final String ORANGE        = "\u001B[38;5;208m";
public static final String LIGHT_ORANGE  = "\u001B[38;5;214m";

     static String adb;
     static void bankb(int a)
{
    System.out.println(LIGHT_YELLOW + " PLEASE ENTER THE AMOUNT " + a + RESETT);
    
   System.out.print(new BANK().get4());
	System.out.println("    Available Balance ");

        int ty=sc.nextInt();
	if(ty> new BANK().get4())
	{
  		System.out.println("insufficient balance payment cannot be possible\n Enter 1 for main menu or 2 for exit ");
		char h=sc.next().charAt(0);
		if(h=='1')
		{
		    try{
		    A.main(null);
		    }
		    catch(InterruptedException e)
		    {
		        
		    }
		}
		if(h=='2')
		{
			return; 	
		}
		
			
	}
	else
	{
    boolean cat = false;
    while (!cat)
    {
        if (ty < a)
        {
            System.out.println(RED + "  ENTERED AMOUNT IS LESS THAN THE ACTUAL AMOUNT   PLEASE ENTER THE VALID AMOUNT    " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else if (ty > a)
        {
            System.out.println(RED + " ENTERED AMOUNT IS MORE THAN THE ACTUAL AMOUNT  " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else
        {
            cat = true;
            System.out.println(GREEN + " PAYMENT SUCCESSFUL   " + RESETT);
            int alo=new BANK().get4()-ty;
            System.out.println(alo+" REMAINING BALANCE ");
            new BANK().bala(alo);
            System.out.print(LIGHT_GREEN + " YOUR PRODUCT WILL BE DELIVERED TO " + RESETT);
            System.out.println(LIGHT_CYAN + adb + " IN 2 DAYS ...." + RESETT);
            System.out.println();
            System.out.println(LIGHT_BLUE + "  IF YOU WANT TO CONTINUE SHOPPING PLEASE SELECT 1 OR ENTER 2 TO EXIT " + RESETT);
            char kop = sc.next().charAt(0);
            if (kop == '1')
            {
                System.out.println(LIGHT_BLUE + "IF YOU WANT TO GO TO THE MAIN ITEM PAGE THEN ENTER 1  OR ENTER 2 FOR PREVIOUS ITEM PAGE ELSE ANY KEY TO EXIT " + RESETT);
                char pok = sc.next().charAt(0);
                if (pok == '1')
                {
                    try {
                        A.main(null);   
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if (pok == '2')
                {
                    display();
                }
                else
                {
                    System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                    return;
                }
            }
            else
            {
                System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                return;
            }
        }
    }
	}
}

	static void item1() {
    System.out.println(CYAN + "         Row Guitar" + RESETT);
    System.out.println(YELLOW + "         Row Guitar Specifications" + RESETT);
    System.out.println(WHITE + "         Type: Acoustic Guitar" + RESETT);
    System.out.println(WHITE + "         Brand: Fender" + RESETT);
    System.out.println(WHITE + "         Model: Full-size" + RESETT);
    System.out.println(WHITE + "         ASCII Art:\n" + RESETT +
            "     _\n" +
            "    / 7\n" +
            "   /_(\n" +
            "   |_|\n" +
            "   |_|\n" +
            "   |_|\n" +
            "   |_|\n" +
            "   |_| /\\\n" +
            " /\\|=|/ /\n" +
            " \\ |_| /\n" +
            "  ) _  \\\n" +
            " / |_|  \\\n" +
            "/  -=-o /\n" +
            "\\  /~\\_/  -Row\n" +
            " \\/\n" +
            "->Guitar<-");
    System.out.println(LIGHT_ORANGE + "         Cost: ₹75,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans1 = sc.next();
    if (ans1.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT);
        sc.nextLine();
        adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 75000;
        if (nu.equalsIgnoreCase("SBI")) {
            User u = new User();
            boolean ok = u.login();
            if (!ok) {
                System.out.println(RED + "   " + RESETT);
                System.exit(0);
            } else {
                System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 2,000 " + RESETT);
                bankb(price - 2000);
            }
        } else if (nu.equals("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 1,500 " + RESETT);
            bankb(price - 1500);
        } else {
            System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT);
            display();
            return;
        }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice1 = sc.nextInt();
        if (choice1 == 1) {
            display();
        } else {
            System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT);
        }
    }
}

static void item2() {
    System.out.println(CYAN + "         Guitar Amplifier 1" + RESETT);
    System.out.println(YELLOW + "         Guitar Amplifier 1 Specifications" + RESETT);
    System.out.println(WHITE + "         Type: Electric Guitar Amplifier" + RESETT);
    System.out.println(WHITE + "         Brand: Marshall" + RESETT);
    System.out.println(WHITE + "         Model: MG Series" + RESETT);
    System.out.println(WHITE + "         ASCII Art:\n" + RESETT +
            "                       _____\n" +
            "                      q o o p\n" +
            "                      q o!o p\n" +
            "                      d o!o b\n" +
            "                       \\!!!/\n" +
            "                       |===|\n" +
            "                       |!!!|\n" +
            "                       |!!!|\n" +
            "                       |!!!|\n" +
            "                       |!!!|\n" +
            "                       |!!!|\n" +
            "                      |!!!|_\n" +
            "                    .+=|!!!|--.`.\n" +
            "                  .'   |!!!|   `\\\n" +
            "                 /     !===!     \\\\\n" +
            "                 |    /|!!!|\\    ||\n" +
            "                  \\   \\!!!!!/   //\n" +
            "                   )   `==='   ((\n" +
            "                 .'    !!!!!    `..\n" +
            "                /      !!!!!      \\\\\n" +
            "               |       !!!!!       ||\n" +
            "               |       !!!!!       ||\n" +
            "               |       !!!!!       ||\n" +
            "                \\     =======     //\n" +
            "            hjw  `.    ooooo    .;'\n" +
            "                   `-._.-'");
    System.out.println(LIGHT_ORANGE + "         Cost: ₹50,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans2 = sc.next();
    if (ans2.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT);
        sc.nextLine();
        adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 50000;
        if (nu.equalsIgnoreCase("SBI")) {
            User u = new User();
            boolean ok = u.login();
            if (!ok) {
                System.out.println(RED + "   " + RESETT);
                System.exit(0);
            } else {
                System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 1,500 " + RESETT);
                bankb(price - 1500);
            }
        } else if (nu.equalsIgnoreCase("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 1,000 " + RESETT);
            bankb(price - 1000);
        } else {
            System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT);
            display();
            return;
        }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice2 = sc.nextInt();
        if (choice2 == 1) {
            display();
        } else {
            System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT);
        }
    }
}

static void display() {
    // Colors
    final String RESETT = "\033[0m";
    final String CYAN = "\033[96m";
    final String YELLOW = "\033[93m";
    final String GREEN = "\033[92m";
    final String RED = "\033[91m";
    final String PURPLE = "\033[95m";
    final String BLUE = "\033[94m";

    System.out.println(CYAN + "         PLEASE SELECT YOUR ITEMS       " + RESETT);
    System.out.println();

    System.out.println(YELLOW + "       ITEM 1      --->  Row Guitar" + RESETT);
    System.out.println(YELLOW + "       ITEM 2      --->  Guitar Amplifier 1" + RESETT);
    System.out.println();

    System.out.print(GREEN + "     IF YOU WANT TO PLACE THE ORDER   THEN ENTER 1 OR ENTER 2 MENU ITEMS AND ANY KEY FOR EXIT  ----->  " + RESETT);
    char a = sc.next().charAt(0);
   
        if (a == '1') {
            System.out.print(BLUE + "     ---> PLEASE ENTER THE ITEM NUMBER          ----------->" + RESETT);
            int it = sc.nextInt();
            if (it > 0 && it <= 2) {
                switch (it) {
                    case 1:
                        item1(); // Row Guitar
                        
                        break;
                    case 2:
                        item2(); // Guitar Amplifier 1
                        
                        break;
                    default:
                        System.out.println(RED + " INVALID CHOICE...... PLEASE SELECT THE ITEM AGAIN" + RESETT);
                        display();
                        break;
                }
            } else {
                System.out.println(RED + "          INVALID ITEM NUMBER            " + RESETT);
                System.out.println(PURPLE + "IF YOU WANT TO RE-ENTER THE ITEM NUMBER ENTER YES ELSE NO" + RESETT);
                String ao = sc.next();
                if (ao.equalsIgnoreCase("YES")) {
                    it = sc.nextInt();
                } else {
                    System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEM NAMES THEN ENTER 1 ELSE TO EXIT ENTER 2" + RESETT);
                    int aq = sc.nextInt();
                    if (aq == 1) {
                        display();
                    } else {
                        System.out.println(GREEN + "    THANK YOU VISIT AGAIN       " + RESETT);
                    }
                }
            }
        
        }
        else if (a == '2') {
                try {
                    A.main(null);
                } catch (InterruptedException e) {
                    e.printStackTrace(); // or custom message
                }
            }
            else{
                System.out.println(GREEN + "    THANK YOU VISIT AGAIN       " + RESETT);
                    return;
            }
}
       
    


    public static String instrumentArt(String name, String color) {
        switch (name.toLowerCase()) {
            case "row guitar": return color +
                    "     _\n" +
                    "    / 7\n" +
                    "   /_(\n" +
                    "   |_|\n" +
                    "   |_|\n" +
                    "   |_|\n" +
                    "   |_|\n" +
                    "   |_| /\\\n" +
                    " /\\|=|/ /\n" +
                    " \\ |_| /\n" +
                    "  ) _  \\\n" +
                    " / |_|  \\\n" +
                    "/  -=-o /\n" +
                    "\\  /~\\_/  -Row\n" +
                    " \\/\n" +
                    "->Guitar<-" + RESET;
            case "guitar amplifier 1": return color +
                    "                       _____\n" +
                    "                      q o o p\n" +
                    "                      q o!o p\n" +
                    "                      d o!o b\n" +
                    "                       \\!!!/\n" +
                    "                       |===|\n" +
                    "                       |!!!|\n" +
                    "                       |!!!|\n" +
                    "                       |!!!|\n" +
                    "                       |!!!|\n" +
                    "                       |!!!|\n" +
                    "                      |!!!|_\n" +
                    "                    .+=|!!!|--.`.\n" +
                    "                  .'   |!!!|   `\\\n" +
                    "                 /     !===!     \\\\\n" +
                    "                 |    /|!!!|\\    ||\n" +
                    "                  \\   \\!!!!!/   //\n" +
                    "                   )   `==='   ((\n" +
                    "                 .'    !!!!!    `..\n" +
                    "                /      !!!!!      \\\\\n" +
                    "               |       !!!!!       ||\n" +
                    "               |       !!!!!       ||\n" +
                    "               |       !!!!!       ||\n" +
                    "                \\     =======     //\n" +
                    "            hjw  `.    ooooo    .;'\n" +
                    "                   `-._.-'" + RESET;
        }
        return "";
    }

    public static void main(String[] args) throws InterruptedException {

        String[][] instruments = {
                {"Row Guitar", "Fender", "Full-size", "₹75,000"},
                {"Guitar Amplifier 1", "Marshall", "MG Series", "₹50,000"}
        };

        for (int i = 0; i < instruments.length; i++) {
            System.out.println(instrumentArt(instruments[i][0], COLORS[i]));
            System.out.println(YELLOW + instruments[i][0] + " Specifications" + RESET);
            System.out.println(MAGENTA + "• Brand: " + WHITE + instruments[i][1] + RESET);
            System.out.println(MAGENTA + "• Model: " + WHITE + instruments[i][2] + RESET);
            System.out.println(MAGENTA + "• Cost: " + WHITE + instruments[i][3] + RESET);
            System.out.println("\n----------------------------------------\n");

            // Sleep for 15 seconds (15000 milliseconds)
            Thread.sleep(1500);
        }
        display();
    }
}
class Main6 extends BANK 
{
    static Scanner sc= new Scanner(System.in);
    // ANSI color codes
   
    
    // Earbud colors array (soft, distinct palette
    
    public static final String RESETT        = "\u001B[0m";
public static final String RED           = "\u001B[31m";
public static final String GREEN         = "\u001B[32m";
public static final String YELLOW        = "\u001B[33m";
public static final String BLUE          = "\u001B[34m";
public static final String PURPLE        = "\u001B[35m";
public static final String CYAN          = "\u001B[36m";
public static final String WHITE         = "\u001B[37m";
public static final String GRAY          = "\u001B[90m";

public static final String LIGHT_RED     = "\u001B[91m";
public static final String LIGHT_GREEN   = "\u001B[92m";
public static final String LIGHT_YELLOW  = "\u001B[93m";
public static final String LIGHT_BLUE    = "\u001B[94m";
public static final String LIGHT_PURPLE  = "\u001B[95m";
public static final String LIGHT_CYAN    = "\u001B[96m";
public static final String LIGHT_WHITE   = "\u001B[97m";

public static final String ORANGE        = "\u001B[38;5;208m";
public static final String LIGHT_ORANGE  = "\u001B[38;5;214m";

     static String adb;
static void bankb(int a)
{
    System.out.println(LIGHT_YELLOW + " PLEASE ENTER THE AMOUNT " + a + RESETT);
    
   System.out.print(new BANK().get4());
	System.out.println("    Available Balance ");

        int ty=sc.nextInt();
	if(ty> new BANK().get4())
	{
  		System.out.println("insufficient balance payment cannot be possible\n Enter 1 for main menu or 2 for exit ");
		char h=sc.next().charAt(0);
		if(h=='1')
		{
		    try{
		    A.main(null);
		    }
		    catch(InterruptedException e)
		    {
		        
		    }
		}
		if(h=='2')
		{
			return; 	
		}
		
			
	}
	else
	{
    boolean cat = false;
    while (!cat)
    {
        if (ty < a)
        {
            System.out.println(RED + "  ENTERED AMOUNT IS LESS THAN THE ACTUAL AMOUNT   PLEASE ENTER THE VALID AMOUNT    " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else if (ty > a)
        {
            System.out.println(RED + " ENTERED AMOUNT IS MORE THAN THE ACTUAL AMOUNT  " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else
        {
            cat = true;
            System.out.println(GREEN + " PAYMENT SUCCESSFUL   " + RESETT);
            int alo=new BANK().get4()-ty;
            System.out.println(alo+" REMAINING BALANCE ");
            new BANK().bala(alo);
            System.out.print(LIGHT_GREEN + " YOUR PRODUCT WILL BE DELIVERED TO " + RESETT);
            System.out.println(LIGHT_CYAN + adb + " IN 2 DAYS ...." + RESETT);
            System.out.println();
            System.out.println(LIGHT_BLUE + "  IF YOU WANT TO CONTINUE SHOPPING PLEASE SELECT 1 OR ENTER 2 TO EXIT " + RESETT);
            char kop = sc.next().charAt(0);
            if (kop == '1')
            {
                System.out.println(LIGHT_BLUE + "IF YOU WANT TO GO TO THE MAIN ITEM PAGE THEN ENTER 1  OR ENTER 2 FOR PREVIOUS ITEM PAGE ELSE ANY KEY TO EXIT " + RESETT);
                char pok = sc.next().charAt(0);
                if (pok == '1')
                {
                    try {
                        A.main(null);   
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if (pok == '2')
                {
                   display();
                }
                else
                {
                    System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                    return;
                }
            }
            else
            {
                System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                return;
            }
        }
    }
	}
}

    public static final String RESET = "\033[0m";
    
    public static final String MAGENTA = "\033[95m";
    
    public static final String[] COLORS = {
        "\033[91m", "\033[92m", "\033[94m", "\033[95m", "\033[96m",
        "\033[93m", "\033[38;5;208m", "\033[38;5;129m", "\033[38;5;27m", "\033[38;5;47m"
    };
    
    
    static void item1() {
    System.out.println(CYAN + "         Rectangular Samsung SmartView R1" + RESETT);
    System.out.println(YELLOW + "         Rectangular Samsung SmartView R1 Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 75 inch LED Smartboard" + RESETT);
    System.out.println(WHITE + "         Features: Touch-enabled, Wi-Fi, Multi-user support" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹1,20,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans1 = sc.next();
    if (ans1.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 120000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 7000 " + RESETT); bankb(price - 7000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 5000 " + RESETT); bankb(price - 5000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice1 = sc.nextInt(); if (choice1 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
}

static void item2() {
    System.out.println(CYAN + "         Wide LG UltraWide Pro" + RESETT);
    System.out.println(YELLOW + "         Wide LG UltraWide Pro Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 86 inch Ultra-wide LED Smartboard" + RESETT);
    System.out.println(WHITE + "         Features: Multi-touch, Cloud Integration, Interactive Lessons" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹1,80,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans2 = sc.next();
    if (ans2.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 180000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 10000 " + RESETT); bankb(price - 10000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 8000 " + RESETT); bankb(price - 8000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice2 = sc.nextInt(); if (choice2 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
}

static void item3() {
    System.out.println(CYAN + "         Square BenQ SquareTouch S5" + RESETT);
    System.out.println(YELLOW + "         Square BenQ SquareTouch S5 Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 65 inch LED Smartboard" + RESETT);
    System.out.println(WHITE + "         Features: Touch-enabled, Wireless Presentation, Multi-user support" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹95,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans3 = sc.next();
    if (ans3.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 95000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 5000 " + RESETT); bankb(price - 5000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) { User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 3000 " + RESETT); bankb(price - 3000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice3 = sc.nextInt(); if (choice3 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
}

// ... item4() to item9() follow same pattern, changing name/specs/price ...
static void item4() {
    System.out.println(CYAN + "         Panasonic Viera" + RESETT);
    System.out.println(YELLOW + "         Panasonic Viera Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 75 inch 4K Smartboard" + RESETT);
    System.out.println(WHITE + "         Features: HDR, Smart TV, Voice Control" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹2,50,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans4 = sc.next();
    if (ans4.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 250000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 10000 " + RESETT); bankb(price - 10000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 8000 " + RESETT); bankb(price - 8000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice4 = sc.nextInt(); if (choice4 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
}

static void item5() {
    System.out.println(CYAN + "         OnePlus TV Q1" + RESETT);
    System.out.println(YELLOW + "         OnePlus TV Q1 Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 65 inch QLED Smartboard" + RESETT);
    System.out.println(WHITE + "         Features: Dolby Vision, Android TV, Slim Design" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹1,50,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans5 = sc.next();
    if (ans5.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 150000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 8000 " + RESETT); bankb(price - 8000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 6000 " + RESETT); bankb(price - 6000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice5 = sc.nextInt(); if (choice5 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
}

static void item6() {
    System.out.println(CYAN + "         TCL Mini LED" + RESETT);
    System.out.println(YELLOW + "         TCL Mini LED Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 75 inch Mini LED Smartboard" + RESETT);
    System.out.println(WHITE + "         Features: High Brightness, Dolby Atmos, Smart Features" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹1,40,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans6 = sc.next();
    if (ans6.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 140000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 7000 " + RESETT); bankb(price - 7000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 5000 " + RESETT); bankb(price - 5000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice6 = sc.nextInt(); if (choice6 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
}

static void item7() {
    System.out.println(CYAN + "         Vu Masterpiece" + RESETT);
    System.out.println(YELLOW + "         Vu Masterpiece Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 65 inch OLED Smartboard" + RESETT);
    System.out.println(WHITE + "         Features: HDR10, Voice Control, Slim Bezel" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹1,30,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans7 = sc.next();
    if (ans7.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 130000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 6000 " + RESETT); bankb(price - 6000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 4000 " + RESETT); bankb(price - 4000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice7 = sc.nextInt(); if (choice7 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
}

static void item8() {
    System.out.println(CYAN + "         MI TV 5X" + RESETT);
    System.out.println(YELLOW + "         MI TV 5X Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 75 inch LED Smartboard" + RESETT);
    System.out.println(WHITE + "         Features: Android TV, PatchWall, Voice Assistant" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹1,10,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans8 = sc.next();
    if (ans8.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 110000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 5000 " + RESETT); bankb(price - 5000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 3000 " + RESETT); bankb(price - 3000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice8 = sc.nextInt(); if (choice8 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
}

static void item9() {
    System.out.println(CYAN + "         Philips Ambilight" + RESETT);
    System.out.println(YELLOW + "         Philips Ambilight Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 70 inch LED Smartboard" + RESETT);
    System.out.println(WHITE + "         Features: Ambilight, Smart TV, Voice Control" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹1,60,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans9 = sc.next();
    if (ans9.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 160000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 9000 " + RESETT); bankb(price - 9000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 7000 " + RESETT); bankb(price - 7000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice9 = sc.nextInt(); if (choice9 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
}


static void item10() {
    System.out.println(CYAN + "         Haier Bezel-less" + RESETT);
    System.out.println(YELLOW + "         Haier Bezel-less Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 32 inch HD Ready Smart TV" + RESETT);
    System.out.println(WHITE + "         Features: Smart TV, Slim Design" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹18,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans10 = sc.next();
    if (ans10.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 18000;
        if (nu.equalsIgnoreCase("SBI")) { User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 700 " + RESETT); bankb(price - 700); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 500 " + RESETT); bankb(price - 500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else { System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice10 = sc.nextInt(); if (choice10 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT); }
}

   static void display() {
    // Colors
    final String RESETT = "\033[0m";
    final String CYAN = "\033[96m";
    final String YELLOW = "\033[93m";
    final String GREEN = "\033[92m";
    final String RED = "\033[91m";
    final String PURPLE = "\033[95m";
    final String BLUE = "\033[94m";

    System.out.println(CYAN + "         PLEASE SELECT YOUR SMARTBOARD ITEMS       " + RESETT);
    System.out.println();

    System.out.println(YELLOW + "       ITEM 1      --->  Rectangular Samsung SmartView R1" + RESETT);
    System.out.println(YELLOW + "       ITEM 2      --->  Wide LG UltraWide Pro" + RESETT);
    System.out.println(YELLOW + "       ITEM 3      --->  Square BenQ SquareTouch S5" + RESETT);
    System.out.println(YELLOW + "       ITEM 4      --->  Dual-Screen ViewSonic DualBoard X2" + RESETT);
    System.out.println(YELLOW + "       ITEM 5      --->  Touch-Panel Microsoft Surface Hub 2S" + RESETT);
    System.out.println(YELLOW + "       ITEM 6      --->  Curved Dell CurvaBoard C7" + RESETT);
    System.out.println(YELLOW + "       ITEM 7      --->  Frameless Sony FrameLess Vision" + RESETT);
    System.out.println(YELLOW + "       ITEM 8      --->  Portable Lenovo ThinkBoard P1" + RESETT);
    System.out.println(YELLOW + "       ITEM 9      --->  4K-Display Panasonic 4KBoard Elite" + RESETT);
    System.out.println(YELLOW + "       ITEM 10     --->  Interactive-Wall Sharp WallTouch Max" + RESETT);
    System.out.println();

    System.out.print(GREEN + "     IF YOU WANT TO PLACE THE ORDER THEN ENTER 1 OR TO GO BACK ENTER 2 ----->  " + RESETT);
    char a = sc.next().charAt(0);

    if (a == '1') {
        System.out.print(BLUE + "     ---> PLEASE ENTER THE ITEM NUMBER -----------> " + RESETT);
        int it = sc.nextInt();
        if (it > 0 && it <= 10) {
            switch (it) {
                case 1: item1(); break;
                case 2: item2(); break;
                case 3: item3(); break;
                case 4: item4(); break;
                case 5: item5(); break;
                case 6: item6(); break;
                case 7: item7(); break;
                case 8: item8(); break;
                case 9: item9(); break;
                case 10: item10(); break;
                default:
                    System.out.println(RED + " INVALID CHOICE...... PLEASE SELECT THE ITEM AGAIN" + RESETT);
                    display();
                    break;
            }
        } else {
            System.out.println(RED + "          INVALID ITEM NUMBER            " + RESETT);
            System.out.println(PURPLE + "IF YOU WANT TO RE-ENTER THE ITEM NUMBER ENTER YES ELSE NO" + RESETT);
            String ao = sc.next();
            if (ao.equalsIgnoreCase("YES")) {
                display();  // ask again
            } else {
                System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEM NAMES THEN ENTER 1 ELSE TO EXIT ENTER 2" + RESETT);
                int aq = sc.nextInt();
                if (aq == 1) {
                    display();
                } else {
                    System.out.println(GREEN + "    THANK YOU VISIT AGAIN       " + RESETT);
                }
            }
        }

    } else if (a == '2') {
        try {
            A.main(null);   // go back
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } else {
        System.out.println(GREEN + "    THANK YOU VISIT AGAIN       " + RESETT);
    }
}


    public static String smartboardArt(String type, String color) {
        switch (type.toLowerCase()) {
            case "rectangular": return color +
                "  _______________________\n" +
                " |                       |\n" +
                " |     SMART  BOARD      |\n" +
                " |_______________________|\n" +
                "      ||           ||" + RESET;
            case "wide": return color +
                "  ______________________________________\n" +
                " |                                      |\n" +
                " |        ULTRA WIDE SMARTBOARD         |\n" +
                " |______________________________________|\n" +
                "       ||                       ||" + RESET;
            case "square": return color +
                "  _______________\n" +
                " |               |\n" +
                " |   SMARTBOARD  |\n" +
                " |_______________|\n" +
                "     ||     ||" + RESET;
            case "dual-screen": return color +
                "  ________   ________\n" +
                " |        | |        |\n" +
                " |  SCR1  | |  SCR2  |\n" +
                " |________| |________|\n" +
                "     ||         ||" + RESET;
            case "touch-panel": return color +
                "  _______________________\n" +
                " |   TOUCH SMART BOARD   |\n" +
                " | [  o   o   o   o  ]   |\n" +
                " |_______________________|\n" +
                "      ||         ||" + RESET;
            case "curved": return color +
                "   ________________\n" +
                "  /                \\\n" +
                " |   CURVED BOARD   |\n" +
                "  \\________________/\n" +
                "       ||    ||" + RESET;
            case "frameless": return color +
                "  -----------------------\n" +
                " |       FRAMELESS       |\n" +
                " |      SMART BOARD      |\n" +
                "  -----------------------\n" +
                "       ||       ||" + RESET;
            case "portable": return color +
                "  _____________\n" +
                " |             |\n" +
                " |  PORTABLE   |\n" +
                " |  SMARTBOARD |\n" +
                " |_____________|\n" +
                "     ||  ||" + RESET;
            case "4k-display": return color +
                "  _______________________\n" +
                " |     4K SMART BOARD    |\n" +
                " |  Ultra HD Display     |\n" +
                " |_______________________|\n" +
                "      ||        ||" + RESET;
            case "interactive-wall": return color +
                "  __________________________________\n" +
                " |                                  |\n" +
                " |  INTERACTIVE WALL SMART DISPLAY  |\n" +
                " |__________________________________|\n" +
                "        ||                ||" + RESET;
        }
        return "";
    }

    public static void main(String[] args) throws InterruptedException {
        String[][] boards = {
            {"Rectangular", "Samsung", "SmartView R1", "₹1,20,000"},
            {"Wide", "LG", "UltraWide Pro", "₹1,80,000"},
            {"Square", "BenQ", "SquareTouch S5", "₹95,000"},
            {"Dual-Screen", "ViewSonic", "DualBoard X2", "₹2,40,000"},
            {"Touch-Panel", "Microsoft", "Surface Hub 2S", "₹5,50,000"},
            {"Curved", "Dell", "CurvaBoard C7", "₹2,00,000"},
            {"Frameless", "Sony", "FrameLess Vision", "₹3,10,000"},
            {"Portable", "Lenovo", "ThinkBoard P1", "₹85,000"},
            {"4K-Display", "Panasonic", "4KBoard Elite", "₹4,20,000"},
            {"Interactive-Wall", "Sharp", "WallTouch Max", "₹6,00,000"}
        };

        for (int i = 0; i < boards.length; i++) {
            System.out.println(smartboardArt(boards[i][0], COLORS[i]));
            System.out.println(YELLOW + boards[i][0] + " Smartboard Specifications" + RESET);
            System.out.println(MAGENTA + "• Brand: " + WHITE + boards[i][1] + RESET);
            System.out.println(MAGENTA + "• Model: " + WHITE + boards[i][2] + RESET);
            System.out.println(MAGENTA + "• Cost: " + WHITE + boards[i][3] + RESET);
            System.out.println();
            Thread.sleep(800);
        }
        display();
    }
}
 class Main7 extends BANK {
    static Scanner sc= new Scanner(System.in);
    
    
    
     public static final String RESET = "\u001B[0m";
    public static final String BLUE = "\u001B[34m";
    public static final String WHITE = "\u001B[37m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String YELLOW = "\u001B[33m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String BRIGHT_BLUE = "\u001B[94m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";

     public static final String RESETT        = "\u001B[0m";
    

public static final String GRAY          = "\u001B[90m";

public static final String LIGHT_RED     = "\u001B[91m";
public static final String LIGHT_GREEN   = "\u001B[92m";
public static final String LIGHT_YELLOW  = "\u001B[93m";
public static final String LIGHT_BLUE    = "\u001B[94m";
public static final String LIGHT_PURPLE  = "\u001B[95m";
public static final String LIGHT_CYAN    = "\u001B[96m";
public static final String LIGHT_WHITE   = "\u001B[97m";

public static final String ORANGE        = "\u001B[38;5;208m";
public static final String LIGHT_ORANGE  = "\u001B[38;5;214m";
 static String adb;
static void bankb(int a)
{
    System.out.println(LIGHT_YELLOW + " PLEASE ENTER THE AMOUNT " + a + RESETT);
    
   System.out.print(new BANK().get4());
	System.out.println("    Available Balance ");

        int ty=sc.nextInt();
	if(ty> new BANK().get4())
	{
  		System.out.println("insufficient balance payment cannot be possible\n Enter 1 for main menu or 2 for exit ");
		char h=sc.next().charAt(0);
		if(h=='1')
		{
		    try{
		    A.main(null);
		    }
		    catch(InterruptedException e)
		    {
		        
		    }
		}
		if(h=='2')
		{
			return; 	
		}
		
			
	}
	else
	{
    boolean cat = false;
    while (!cat)
    {
        if (ty < a)
        {
            System.out.println(RED + "  ENTERED AMOUNT IS LESS THAN THE ACTUAL AMOUNT   PLEASE ENTER THE VALID AMOUNT    " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else if (ty > a)
        {
            System.out.println(RED + " ENTERED AMOUNT IS MORE THAN THE ACTUAL AMOUNT  " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else
        {
            cat = true;
            System.out.println(GREEN + " PAYMENT SUCCESSFUL   " + RESETT);
            int alo=new BANK().get4()-ty;
            System.out.println(alo+" REMAINING BALANCE ");
            new BANK().bala(alo);
            System.out.print(LIGHT_GREEN + " YOUR PRODUCT WILL BE DELIVERED TO " + RESETT);
            System.out.println(LIGHT_CYAN + adb + " IN 2 DAYS ...." + RESETT);
            System.out.println();
            System.out.println(LIGHT_BLUE + "  IF YOU WANT TO CONTINUE SHOPPING PLEASE SELECT 1 OR ENTER 2 TO EXIT " + RESETT);
            char kop = sc.next().charAt(0);
            if (kop == '1')
            {
                System.out.println(LIGHT_BLUE + "IF YOU WANT TO GO TO THE MAIN ITEM PAGE THEN ENTER 1  OR ENTER 2 FOR PREVIOUS ITEM PAGE ELSE ANY KEY TO EXIT " + RESETT);
                char pok = sc.next().charAt(0);
                if (pok == '1')
                {
                    try {
                        A.main(null);   
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if (pok == '2')
                {
                    display();
                }
                else
                {
                    System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                    return;
                }
            }
            else
            {
                System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                return;
            }
        }
    }
	}
}
    // Draw laptop ASCII art with specs
    
    
    
    static void item1() {
    System.out.println(CYAN + "         Rectangular Samsung SmartView R1" + RESETT);
    System.out.println(YELLOW + "         Rectangular Samsung SmartView R1 Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 75 inch LED Smartboard" + RESETT);
    System.out.println(WHITE + "         Features: Touch-enabled, Wi-Fi, Multi-user support" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹1,20,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans1 = sc.next();
    if (ans1.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 120000;
        if (nu.equalsIgnoreCase("SBI")) {
            User u = new User();
            boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 7000 " + RESETT);
                   bankb(price - 7000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 5000 " + RESETT);
            bankb(price - 5000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice1 = sc.nextInt();
        if (choice1 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT);
    }
}

static void item2() {
    System.out.println(CYAN + "         Wide LG UltraWide Pro" + RESETT);
    System.out.println(YELLOW + "         Wide LG UltraWide Pro Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 86 inch Ultra-wide LED Smartboard" + RESETT);
    System.out.println(WHITE + "         Features: Multi-touch, Cloud Integration, Interactive Lessons" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹1,80,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans2 = sc.next();
    if (ans2.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 180000;
        if (nu.equalsIgnoreCase("SBI")) {
            User u = new User();
            boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 10000 " + RESETT);
                   bankb(price - 10000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 8000 " + RESETT);
            bankb(price - 8000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice2 = sc.nextInt();
        if (choice2 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT);
    }
}

static void item3() {
    System.out.println(CYAN + "         Square BenQ SquareTouch S5" + RESETT);
    System.out.println(YELLOW + "         Square BenQ SquareTouch S5 Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 65 inch Square LED Smartboard" + RESETT);
    System.out.println(WHITE + "         Features: Multi-touch, Easy Collaboration" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹95,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans3 = sc.next();
    if (ans3.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 95000;
        if (nu.equalsIgnoreCase("SBI")) {
            User u = new User();
            boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 5000 " + RESETT);
                   bankb(price - 5000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) { 
            User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 3000 " + RESETT);
            bankb(price - 3000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice3 = sc.nextInt();
        if (choice3 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT);
    }
}
static void item4() {
    System.out.println(CYAN + "         Dual-Screen ViewSonic DualBoard X2" + RESETT);
    System.out.println(YELLOW + "         Dual-Screen ViewSonic DualBoard X2 Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 2 x 75 inch LED Smartboards" + RESETT);
    System.out.println(WHITE + "         Features: Dual Screen, Multi-user Support" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹2,40,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans4 = sc.next();
    if (ans4.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 240000;
        if (nu.equalsIgnoreCase("SBI")) {
            User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 12000 " + RESETT);
                   bankb(price - 12000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 10000 " + RESETT);
            bankb(price - 10000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice4 = sc.nextInt(); if (choice4 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT);
    }
}

static void item5() {
    System.out.println(CYAN + "         Touch-Panel Microsoft Surface Hub 2S" + RESETT);
    System.out.println(YELLOW + "         Touch-Panel Microsoft Surface Hub 2S Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 85 inch Interactive Touch Panel" + RESETT);
    System.out.println(WHITE + "         Features: Multi-touch, Remote Collaboration" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹5,50,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans5 = sc.next();
    if (ans5.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 550000;
        if (nu.equalsIgnoreCase("SBI")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }
            else{
            User ue = new User(); boolean oky = ue.login();
            if (!oky) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 20000 " + RESETT);
                   bankb(price - 20000); }
            }
        } else if (nu.equalsIgnoreCase("KOTAK")) {
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 15000 " + RESETT);
            bankb(price - 15000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice5 = sc.nextInt(); if (choice5 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT);
    }
}

static void item6() {
    System.out.println(CYAN + "         Curved Dell CurvaBoard C7" + RESETT);
    System.out.println(YELLOW + "         Curved Dell CurvaBoard C7 Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 80 inch Curved LED Smartboard" + RESETT);
    System.out.println(WHITE + "         Features: Curved Design, Multi-touch" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹2,00,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans6 = sc.next();
    if (ans6.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 200000;
        if (nu.equalsIgnoreCase("SBI")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }
            else{
            User uu = new User(); boolean oko = uu.login();
            if (!oko) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 8000 " + RESETT);
                   bankb(price - 8000); }
            }
        } else if (nu.equalsIgnoreCase("KOTAK")) {
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 5000 " + RESETT);
            bankb(price - 5000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice6 = sc.nextInt(); if (choice6 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT);
    }
}

static void item7() {
    System.out.println(CYAN + "         Frameless Sony FrameLess Vision" + RESETT);
    System.out.println(YELLOW + "         Frameless Sony FrameLess Vision Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 85 inch Frameless LED Smartboard" + RESETT);
    System.out.println(WHITE + "         Features: Sleek Design, Multi-touch" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹3,10,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans7 = sc.next();
    if (ans7.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 310000;
        if (nu.equalsIgnoreCase("SBI")) {
            User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 12000 " + RESETT);
                   bankb(price - 12000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 10000 " + RESETT);
            bankb(price - 10000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice7 = sc.nextInt(); if (choice7 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT);
    }
}

static void item8() {
    System.out.println(CYAN + "         Portable Lenovo ThinkBoard P1" + RESETT);
    System.out.println(YELLOW + "         Portable Lenovo ThinkBoard P1 Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 65 inch LED Portable Smartboard" + RESETT);
    System.out.println(WHITE + "         Features: Lightweight, Easy Setup" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹85,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans8 = sc.next();
    if (ans8.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 85000;
        if (nu.equalsIgnoreCase("SBI")) {
            User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 4000 " + RESETT);
                   bankb(price - 4000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 3000 " + RESETT);
            bankb(price - 3000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice8 = sc.nextInt(); if (choice8 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT);
    }
}

static void item9() {
    System.out.println(CYAN + "         4K-Display Panasonic 4KBoard Elite" + RESETT);
    System.out.println(YELLOW + "         4K-Display Panasonic 4KBoard Elite Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 85 inch 4K LED Smartboard" + RESETT);
    System.out.println(WHITE + "         Features: Ultra HD, Multi-touch" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹4,20,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans9 = sc.next();
    if (ans9.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 420000;
        if (nu.equalsIgnoreCase("SBI")) {
            User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 15000 " + RESETT);
                   bankb(price - 15000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 10000 " + RESETT);
            bankb(price - 10000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice9 = sc.nextInt(); if (choice9 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT);
    }
}

static void item10() {
    System.out.println(CYAN + "         Interactive-Wall Sharp WallTouch Max" + RESETT);
    System.out.println(YELLOW + "         Interactive-Wall Sharp WallTouch Max Specifications" + RESETT);
    System.out.println(WHITE + "         Display: 100 inch Interactive Wall" + RESETT);
    System.out.println(WHITE + "         Features: Multi-touch, Collaboration, Wall-mounted" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹6,50,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO     ---->" + RESETT);
    String ans10 = sc.next();
    if (ans10.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 650000;
        if (nu.equalsIgnoreCase("SBI")) {
            User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 20000 " + RESETT);
                   bankb(price - 20000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 15000 " + RESETT);
            bankb(price - 15000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice10 = sc.nextInt(); if (choice10 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT);
    }
}
static void display() {
    // Colors
    final String RESETT = "\033[0m";
    final String CYAN = "\033[96m";
    final String YELLOW = "\033[93m";
    final String GREEN = "\033[92m";
    final String RED = "\033[91m";
    final String PURPLE = "\033[95m";
    final String BLUE = "\033[94m";

    System.out.println(CYAN + "         PLEASE SELECT YOUR SMARTBOARD ITEMS       " + RESETT);
    System.out.println();

    System.out.println(YELLOW + "       ITEM 1      --->  Rectangular Samsung SmartView R1" + RESETT);
    System.out.println(YELLOW + "       ITEM 2      --->  Wide LG UltraWide Pro" + RESETT);
    System.out.println(YELLOW + "       ITEM 3      --->  Square BenQ SquareTouch S5" + RESETT);
    System.out.println(YELLOW + "       ITEM 4      --->  Dual-Screen ViewSonic DualBoard X2" + RESETT);
    System.out.println(YELLOW + "       ITEM 5      --->  Touch-Panel Microsoft Surface Hub 2S" + RESETT);
    System.out.println(YELLOW + "       ITEM 6      --->  Curved Dell CurvaBoard C7" + RESETT);
    System.out.println(YELLOW + "       ITEM 7      --->  Frameless Sony FrameLess Vision" + RESETT);
    System.out.println(YELLOW + "       ITEM 8      --->  Portable Lenovo ThinkBoard P1" + RESETT);
    System.out.println(YELLOW + "       ITEM 9      --->  4K-Display Panasonic 4KBoard Elite" + RESETT);
    System.out.println(YELLOW + "       ITEM 10     --->  Interactive-Wall Sharp WallTouch Max" + RESETT);
    System.out.println();

    System.out.print(GREEN + "     IF YOU WANT TO PLACE THE ORDER THEN ENTER 1 OR TO GO BACK ENTER 2 ----->  " + RESETT);
    int a = sc.nextInt();

    boolean continueLoop = true;

    while (continueLoop) {
        if (a == 1) {
            System.out.print(BLUE + "     ---> PLEASE ENTER THE ITEM NUMBER -----------> " + RESETT);
            int it = sc.nextInt();
            if (it > 0 && it <= 10) {
                switch (it) {
                    case 1: item1(); break;
                    case 2: item2(); break;
                    case 3: item3(); break;
                    case 4: item4(); break;
                    case 5: item5(); break;
                    case 6: item6(); break;
                    case 7: item7(); break;
                    case 8: item8(); break;
                    case 9: item9(); break;
                    case 10: item10(); break;
                }
                continueLoop = false;  // ✅ exit after valid item selection
            } else {
                System.out.println(RED + "          INVALID ITEM NUMBER            " + RESETT);
                System.out.println(PURPLE + "IF YOU WANT TO RE-ENTER THE ITEM NUMBER ENTER YES ELSE NO" + RESETT);
                String ao = sc.next();
                if (ao.equalsIgnoreCase("YES")) {
                    // just continue loop → will ask again
                } else {
                    System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEM NAMES THEN ENTER 1 ELSE TO EXIT ENTER 2" + RESETT);
                    int aq = sc.nextInt();
                    if (aq == 1) {
                        display(); // restart
                    } else {
                        System.out.println(GREEN + "    THANK YOU VISIT AGAIN       " + RESETT);
                        continueLoop = false;
                    }
                }
            }
        } else if (a == 2) {
            try {
                A.main(null); // ✅ go back option
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            continueLoop = false;
        } else {
            System.out.println("   INVALID ENTRY PLEASE ENTER AGAIN");
            a = sc.nextInt();
        }
    }
}

// I can continue writing item4–item10 in this exact same style.

    
    
    
    
    
    public static void drawLaptop(String brand, String model, String screen, String processor,
                                   String ram, String storage, String graphics,
                                   String color, String battery, String cost,
                                   String screenColor, String keyboardColor, String keyColor) {

        int screenWidth = 24; // Width inside the laptop screen
        String brandCentered = centerText(brand, screenWidth);

        // Screen
        System.out.println(screenColor + "  ________________________");
        System.out.println(" |                        |");
        System.out.println(" |" + WHITE + brandCentered + screenColor + "|");
        System.out.println(" |                        |");
        System.out.println(" |________________________|");

        // Keyboard with custom key color
        System.out.println(keyboardColor + "  ________________________");
        System.out.println(" | " + keyColor + "[Q][W][E][R][T][Y][U]" + keyboardColor + "  |");
        System.out.println(" | " + keyColor + "[A][S][D][F][G][H][J]" + keyboardColor + "  |");
        System.out.println(" | " + keyColor + "[Z][X][C][V][B][N][M]" + keyboardColor + "  |");
        System.out.println(" |    " + keyColor + "[  Spacebar   ]" + keyboardColor + "     |");
        System.out.println(" |________________________|" + RESET);

        // Specifications
        System.out.println(YELLOW + "Specifications:" + RESET);
        printSpec("Model", model);
        printSpec("Screen Size", screen);
        printSpec("Processor", processor);
        printSpec("RAM", ram);
        printSpec("Storage", storage);
        printSpec("Graphics", graphics);
        printSpec("Color", color);
        printSpec("Battery", battery);
        printSpec("Cost", cost);
        System.out.println();
    }

    public static void printSpec(String name, String value) {
        System.out.printf("  %s%-13s%s : %s%s%s%n",
                YELLOW, name, RESET, GREEN, value, RESET);
    }

    public static String spaces(int count) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++) {
        sb.append(" ");
    }
    return sb.toString();
}

public static String centerText(String text, int width) {
    int padding = width - text.length();
    if (padding < 0) padding = 0;
    int padStart = padding / 2;
    int padEnd = padding - padStart;
    return spaces(padStart) + text + spaces(padEnd);
}
    public static void main(String[] args) throws InterruptedException {
        drawLaptop("Dell", "Dell Inspiron 14", "14\" FHD Display", "Intel Core i5 12th Gen", "8 GB DDR4", "256 GB SSD", "Intel Iris Xe", "Black", "8 Hours", "₹65,000",
                BLUE, PURPLE, BRIGHT_CYAN);
        Thread.sleep(1500);

        drawLaptop("HP", "HP Pavilion 15", "15.6\" FHD", "Intel Core i7 11th Gen", "16 GB DDR4", "512 GB SSD", "NVIDIA MX450", "Silver", "7 Hours", "₹85,000",
                RED, BRIGHT_CYAN, BRIGHT_YELLOW);
        Thread.sleep(1500);

        drawLaptop("Lenovo", "Lenovo ThinkPad X1", "14\" 2K Display", "Intel Core i7 12th Gen", "16 GB LPDDR5", "1 TB SSD", "Intel Iris Xe", "Black", "9 Hours", "₹1,20,000",
                BRIGHT_BLUE, GREEN, WHITE);
        Thread.sleep(1500);

        drawLaptop("Apple", "MacBook Air M2", "13.6\" Retina", "Apple M2", "8 GB Unified", "256 GB SSD", "10-core GPU", "Space Gray", "15 Hours", "₹1,40,000",
                MAGENTA, BRIGHT_YELLOW, BRIGHT_GREEN);
        Thread.sleep(1500);

        drawLaptop("Asus", "Asus ZenBook 14", "14\" OLED", "AMD Ryzen 7 5800U", "16 GB DDR4", "512 GB SSD", "AMD Radeon", "Blue", "13 Hours", "₹95,000",
                BRIGHT_GREEN, RED, BRIGHT_CYAN);
        Thread.sleep(1500);

        drawLaptop("Acer", "Acer Aspire 5", "15.6\" FHD", "Intel Core i5 10th Gen", "8 GB DDR4", "1 TB HDD", "Intel UHD", "Silver", "6 Hours", "₹60,000",
                CYAN, BRIGHT_GREEN, PURPLE);
        Thread.sleep(1500);

        drawLaptop("MSI", "MSI GF63 Thin", "15.6\" FHD 144Hz", "Intel Core i5 11th Gen", "8 GB DDR4", "512 GB SSD", "NVIDIA GTX 1650", "Black", "5 Hours", "₹90,000",
                BRIGHT_CYAN, BLUE, YELLOW);
        Thread.sleep(1500);

        drawLaptop("Samsung", "Samsung Galaxy Book2", "15.6\" FHD AMOLED", "Intel Core i7 12th Gen", "16 GB LPDDR4x", "512 GB SSD", "Intel Iris Xe", "Silver", "14 Hours", "₹1,10,000",
                BRIGHT_YELLOW, CYAN, BRIGHT_GREEN);
        Thread.sleep(1500);

        drawLaptop("Razer", "Razer Blade 15", "15.6\" QHD 240Hz", "Intel Core i7 12th Gen", "16 GB DDR5", "1 TB SSD", "NVIDIA RTX 3070 Ti", "Black", "6 Hours", "₹2,20,000",
                RED, MAGENTA, BRIGHT_BLUE);
        Thread.sleep(1500);

        drawLaptop("Microsoft", "Surface Laptop 5", "13.5\" PixelSense", "Intel Core i5 12th Gen", "8 GB LPDDR5x", "256 GB SSD", "Intel Iris Xe", "Platinum", "17 Hours", "₹1,30,000",
                BRIGHT_CYAN, BRIGHT_GREEN, BRIGHT_YELLOW);
                display();
}
    }

 class Main8 extends BANK {
     static Scanner sc= new Scanner(System.in);
   

 public static final String RESET = "\u001B[0m";
    public static final String BLUE = "\u001B[34m";
    public static final String WHITE = "\u001B[37m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String YELLOW = "\u001B[33m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String BRIGHT_BLUE = "\u001B[94m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";

     public static final String RESETT        = "\u001B[0m";
    

public static final String GRAY          = "\u001B[90m";

public static final String LIGHT_RED     = "\u001B[91m";
public static final String LIGHT_GREEN   = "\u001B[92m";
public static final String LIGHT_YELLOW  = "\u001B[93m";
public static final String LIGHT_BLUE    = "\u001B[94m";
public static final String LIGHT_PURPLE  = "\u001B[95m";
public static final String LIGHT_CYAN    = "\u001B[96m";
public static final String LIGHT_WHITE   = "\u001B[97m";

public static final String ORANGE        = "\u001B[38;5;208m";
public static final String LIGHT_ORANGE  = "\u001B[38;5;214m";
 static String adb;
static void bankb(int a)
{
    System.out.println(LIGHT_YELLOW + " PLEASE ENTER THE AMOUNT " + a + RESETT);
    
   System.out.println(" AVAILABLE BALANCE " +new BANK().get4());

        int ty=sc.nextInt();
	if(ty> new BANK().get4())
	{
  		System.out.println("insufficient balance payment cannot be possible\n Enter 1 for main menu or 2 for exit ");
		char h=sc.next().charAt(0);
		if(h=='1')
		{
		    try{
		    A.main(null);
		    }
		    catch(InterruptedException e)
		    {
		        
		    }
		}
		if(h=='2')
		{
			return; 	
		}
		
			
	}
	else{
    boolean cat = false;
    while (!cat)
    {
        if (ty < a)
        {
            System.out.println(RED + "  ENTERED AMOUNT IS LESS THAN THE ACTUAL AMOUNT   PLEASE ENTER THE VALID AMOUNT    " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else if (ty > a)
        {
            System.out.println(RED + " ENTERED AMOUNT IS MORE THAN THE ACTUAL AMOUNT  " + RESETT);
            System.out.println(YELLOW + " PLEASE RE-ENTER THE AMOUNT" + RESETT);
            ty = sc.nextInt();
        }
        else
        {
            cat = true;
            
            System.out.println(GREEN + " PAYMENT SUCCESSFUL   " + RESETT);
            int alo=new BANK().get4()-ty;
            System.out.println(alo+" REMAINING BALANCE ");
            new BANK().bala(alo);
            System.out.print(LIGHT_GREEN + " YOUR PRODUCT WILL BE DELIVERED TO " + RESETT);
            System.out.println(LIGHT_CYAN + adb + " IN 2 DAYS ...." + RESETT);
            System.out.println();
            System.out.println(LIGHT_BLUE + "  IF YOU WANT TO CONTINUE SHOPPING PLEASE SELECT 1 OR ENTER 2 TO EXIT " + RESETT);
            char kop = sc.next().charAt(0);
            if (kop == '1')
            {
                System.out.println(LIGHT_BLUE + "IF YOU WANT TO GO TO THE MAIN ITEM PAGE THEN ENTER 1  OR ENTER 2 FOR PREVIOUS ITEM PAGE ELSE ANY KEY TO EXIT " + RESETT);
                char pok = sc.next().charAt(0);
                if (pok == '1')
                {
                    try {
                        A.main(null);   
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if (pok == '2') {
   			 display();
		}

                else
                {
                    System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                    return;
                }
            }
            else
            {
                System.out.println(LIGHT_GREEN + "  THANK YOU SEE YOU IN NEXT VISIT " + RESETT);
                return;
            }
        }
    }
}
}



static void item1() {
    System.out.println(CYAN + "         Samsung EcoBubble 7kg" + RESETT);
    System.out.println(YELLOW + "         Samsung EcoBubble 7kg Specifications" + RESETT);
    System.out.println(WHITE + "         Type: Front Load" + RESETT);
    System.out.println(WHITE + "         Capacity: 7 kg" + RESETT);
    System.out.println(WHITE + "         Spin Speed: 1200 RPM" + RESETT);
    System.out.println(WHITE + "         Energy Rating: 5 Star" + RESETT);
    System.out.println(WHITE + "         Features: EcoBubble, Digital Inverter" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹35,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO ---->" + RESETT);
    String ans1 = sc.next();
    if (ans1.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 35000;
        if (nu.equalsIgnoreCase("SBI")) { 
            User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 2000 " + RESETT);
                   bankb(price - 2000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 1500 " + RESETT);
            bankb(price - 1500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice1 = sc.nextInt(); if (choice1 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT);
    }
}

static void item2() {
    System.out.println(CYAN + "         LG TurboWash 8kg" + RESETT);
    System.out.println(YELLOW + "         LG TurboWash 8kg Specifications" + RESETT);
    System.out.println(WHITE + "         Type: Front Load" + RESETT);
    System.out.println(WHITE + "         Capacity: 8 kg" + RESETT);
    System.out.println(WHITE + "         Spin Speed: 1400 RPM" + RESETT);
    System.out.println(WHITE + "         Energy Rating: 5 Star" + RESETT);
    System.out.println(WHITE + "         Features: TurboWash, Steam" + RESETT);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹42,000" + RESETT);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO ---->" + RESETT);
    String ans2 = sc.next();
    if (ans2.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESETT); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESETT);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESETT);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESETT);
        String nu = sc.next();
        int price = 42000;
        if (nu.equalsIgnoreCase("SBI")) { 
            User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESETT); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESETT);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 2500 " + RESETT);
                   bankb(price - 2500); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESETT);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 2000 " + RESETT);
            bankb(price - 2000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESETT); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESETT);
        int choice2 = sc.nextInt(); if (choice2 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESETT);
    }
}

static void item3() {
    System.out.println(CYAN + "         Whirlpool FreshCare 7.5kg" + RESET);
    System.out.println(YELLOW + "         Whirlpool FreshCare 7.5kg Specifications" + RESET);
    System.out.println(WHITE + "         Type: Front Load" + RESET);
    System.out.println(WHITE + "         Capacity: 7.5 kg" + RESET);
    System.out.println(WHITE + "         Spin Speed: 1200 RPM" + RESET);
    System.out.println(WHITE + "         Energy Rating: 4 Star" + RESET);
    System.out.println(WHITE + "         Features: FreshCare+, Inverter Motor" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹31,500" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO ---->" + RESET);
    String ans3 = sc.next();
    if (ans3.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        int price = 31500;
        if (nu.equalsIgnoreCase("SBI")) { 
            User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 1800 " + RESET);
                   bankb(price - 1800); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 1200 " + RESET);
            bankb(price - 1200);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice3 = sc.nextInt(); if (choice3 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET);
    }
}

static void item4() {
    System.out.println(CYAN + "         Bosch Serie 6 8kg" + RESET);
    System.out.println(YELLOW + "         Bosch Serie 6 8kg Specifications" + RESET);
    System.out.println(WHITE + "         Type: Front Load" + RESET);
    System.out.println(WHITE + "         Capacity: 8 kg" + RESET);
    System.out.println(WHITE + "         Spin Speed: 1400 RPM" + RESET);
    System.out.println(WHITE + "         Energy Rating: 5 Star" + RESET);
    System.out.println(WHITE + "         Features: EcoSilence Drive" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹48,000" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO ---->" + RESET);
    String ans4 = sc.next();
    if (ans4.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        int price = 48000;
        if (nu.equalsIgnoreCase("SBI")) { 
            User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 3000 " + RESET);
                   bankb(price - 3000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 2500 " + RESET);
            bankb(price - 2500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice4 = sc.nextInt(); if (choice4 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET);
    }
}

static void item5() {
    System.out.println(CYAN + "         IFB Senator WSS 8kg" + RESET);
    System.out.println(YELLOW + "         IFB Senator WSS 8kg Specifications" + RESET);
    System.out.println(WHITE + "         Type: Front Load" + RESET);
    System.out.println(WHITE + "         Capacity: 8 kg" + RESET);
    System.out.println(WHITE + "         Spin Speed: 1400 RPM" + RESET);
    System.out.println(WHITE + "         Energy Rating: 5 Star" + RESET);
    System.out.println(WHITE + "         Features: Aqua Energie, Cradle Wash" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹39,000" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO ---->" + RESET);
    String ans5 = sc.next();
    if (ans5.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        int price = 39000;
        if (nu.equalsIgnoreCase("SBI")) { 
            User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 2200 " + RESET);
                   bankb(price - 2200); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 1800 " + RESET);
            bankb(price - 1800);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice5 = sc.nextInt(); if (choice5 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET);
    }
}

static void item6() {
    System.out.println(CYAN + "         Panasonic NA-127XB1 7kg" + RESET);
    System.out.println(YELLOW + "         Panasonic NA-127XB1 7kg Specifications" + RESET);
    System.out.println(WHITE + "         Type: Front Load" + RESET);
    System.out.println(WHITE + "         Capacity: 7 kg" + RESET);
    System.out.println(WHITE + "         Spin Speed: 1200 RPM" + RESET);
    System.out.println(WHITE + "         Energy Rating: 4 Star" + RESET);
    System.out.println(WHITE + "         Features: ActiveFoam, StainMaster" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹29,500" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO ---->" + RESET);
    String ans6 = sc.next();
    if (ans6.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        int price = 29500;
        if (nu.equalsIgnoreCase("SBI")) { 
            User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 1800 " + RESET);
                   bankb(price - 1800); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 1300 " + RESET);
            bankb(price - 1300);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice6 = sc.nextInt(); if (choice6 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET);
    }
}

static void item7() {
    System.out.println(CYAN + "         Haier HW80-BD12756NZP" + RESET);
    System.out.println(YELLOW + "         Haier HW80-BD12756NZP Specifications" + RESET);
    System.out.println(WHITE + "         Type: Front Load" + RESET);
    System.out.println(WHITE + "         Capacity: 8 kg" + RESET);
    System.out.println(WHITE + "         Spin Speed: 1200 RPM" + RESET);
    System.out.println(WHITE + "         Energy Rating: 5 Star" + RESET);
    System.out.println(WHITE + "         Features: Direct Motion Motor" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹34,800" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO ---->" + RESET);
    String ans7 = sc.next();
    if (ans7.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        int price = 34800;
        if (nu.equalsIgnoreCase("SBI")) { 
            User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 2000 " + RESET);
                   bankb(price - 2000); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 1500 " + RESET);
            bankb(price - 1500);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice7 = sc.nextInt(); if (choice7 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET);
    }
}

static void item8() {
    System.out.println(CYAN + "         Godrej Eon 7kg" + RESET);
    System.out.println(YELLOW + "         Godrej Eon 7kg Specifications" + RESET);
    System.out.println(WHITE + "         Type: Front Load" + RESET);
    System.out.println(WHITE + "         Capacity: 7 kg" + RESET);
    System.out.println(WHITE + "         Spin Speed: 1200 RPM" + RESET);
    System.out.println(WHITE + "         Energy Rating: 4 Star" + RESET);
    System.out.println(WHITE + "         Features: Anti-Crease, Eco Mode" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹27,000" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO ---->" + RESET);
    String ans8 = sc.next();
    if (ans8.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        int price = 27000;
        if (nu.equalsIgnoreCase("SBI")) { 
            User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 1600 " + RESET);
                   bankb(price - 1600); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 1200 " + RESET);
            bankb(price - 1200);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice8 = sc.nextInt(); if (choice8 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET);
    }
}

static void item9() {
    System.out.println(CYAN + "         Siemens iQ500 8kg" + RESET);
    System.out.println(YELLOW + "         Siemens iQ500 8kg Specifications" + RESET);
    System.out.println(WHITE + "         Type: Front Load" + RESET);
    System.out.println(WHITE + "         Capacity: 8 kg" + RESET);
    System.out.println(WHITE + "         Spin Speed: 1400 RPM" + RESET);
    System.out.println(WHITE + "         Energy Rating: 5 Star" + RESET);
    System.out.println(WHITE + "         Features: SpeedPerfect, EcoSilence" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹46,000" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO ---->" + RESET);
    String ans9 = sc.next();
    if (ans9.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        int price = 46000;
        if (nu.equalsIgnoreCase("SBI")) { 
            User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 2800 " + RESET);
                   bankb(price - 2800); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 2200 " + RESET);
            bankb(price - 2200);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice9 = sc.nextInt(); if (choice9 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET);
    }
}

static void item10() {
    System.out.println(CYAN + "         Onida WO80TSPLN1 8kg" + RESET);
    System.out.println(YELLOW + "         Onida WO80TSPLN1 8kg Specifications" + RESET);
    System.out.println(WHITE + "         Type: Front Load" + RESET);
    System.out.println(WHITE + "         Capacity: 8 kg" + RESET);
    System.out.println(WHITE + "         Spin Speed: 1200 RPM" + RESET);
    System.out.println(WHITE + "         Energy Rating: 3 Star" + RESET);
    System.out.println(WHITE + "         Features: Hexa Crystal Drum" + RESET);
    System.out.println(LIGHT_ORANGE + "         Cost: ₹25,000" + RESET);
    System.out.println();
    System.out.print(ORANGE + "IF YOU WANT TO ORDER THIS ITEM THEN ENTER YES ELSE NO ---->" + RESET);
    String ans10 = sc.next();
    if (ans10.equalsIgnoreCase("YES")) {
        System.out.println(YELLOW + "PLEASE ENTER YOUR ADDRESS " + RESET); sc.nextLine(); adb = sc.nextLine();
        System.out.println(CYAN + " PLEASE SELECT YOUR BANK SBI OR KOTAK" + RESET);
        System.out.println(LIGHT_GREEN + " IF SBI PLEASE ENTER SBI" + RESET);
        System.out.println(LIGHT_BLUE + " IF KOTAK PLEASE ENTER KOTAK" + RESET);
        String nu = sc.next();
        int price = 25000;
        if (nu.equalsIgnoreCase("SBI")) { 
            User u = new User(); boolean ok = u.login();
            if (!ok) { System.out.println(RED + "   " + RESET); System.exit(0); }
            else { System.out.println(GREEN + " THANK YOU FOR CHOOSING SBI " + RESET);
                   System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 1500 " + RESET);
                   bankb(price - 1500); }
        } else if (nu.equalsIgnoreCase("KOTAK")) {User u = new User();
            boolean ok = u.login();
            if(!ok) {
                System.out.println(RED + "   " + RESET); 
            System.exit(0);
            }else
            System.out.println(GREEN + " THANK YOU FOR CHOOSING KOTAK " + RESET);
            System.out.println(ORANGE + " WE ARE REDUCING THE PRICE BY 1000 " + RESET);
            bankb(price - 1000);
        } else { System.out.println(RED + "INVALID BANK PLEASE GO TO THE MAIN PAGE " + RESET); display(); return; }
    } else {
        System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEMS THEN ENTER 1 ELSE ENTER 2 TO EXIT" + RESET);
        int choice10 = sc.nextInt(); if (choice10 == 1) display(); else System.out.println(GREEN + " THANK YOU VISIT AGAIN " + RESET);
    }
}


static void display() {
    // Colors
    final String RESETT = "\033[0m";
    final String CYAN = "\033[96m";
    final String YELLOW = "\033[93m";
    final String GREEN = "\033[92m";
    final String RED = "\033[91m";
    final String PURPLE = "\033[95m";
    final String BLUE = "\033[94m";

    System.out.println(CYAN + "         PLEASE SELECT YOUR WASHING MACHINE ITEMS       " + RESETT);
    System.out.println();

    System.out.println(YELLOW + "       ITEM 1      --->  Samsung EcoBubble 7kg" + RESETT);
    System.out.println(YELLOW + "       ITEM 2      --->  LG TurboWash 8kg" + RESETT);
    System.out.println(YELLOW + "       ITEM 3      --->  Whirlpool FreshCare 7.5kg" + RESETT);
    System.out.println(YELLOW + "       ITEM 4      --->  Bosch Serie 6 8kg" + RESETT);
    System.out.println(YELLOW + "       ITEM 5      --->  IFB Senator WSS 8kg" + RESETT);
    System.out.println(YELLOW + "       ITEM 6      --->  Panasonic NA-127XB1 7kg" + RESETT);
    System.out.println(YELLOW + "       ITEM 7      --->  Haier HW80-BD12756NZP 8kg" + RESETT);
    System.out.println(YELLOW + "       ITEM 8      --->  Godrej Eon 7kg" + RESETT);
    System.out.println(YELLOW + "       ITEM 9      --->  Siemens iQ500 8kg" + RESETT);
    System.out.println(YELLOW + "       ITEM 10     --->  Onida WO80TSPLN1 8kg" + RESETT);
    System.out.println();

    System.out.print(GREEN + "     IF YOU WANT TO PLACE THE ORDER THEN ENTER 1        ----->  " + RESETT);
    int a = sc.nextInt();

    boolean running = true;

    while (running) {
        if (a == 1) {
            System.out.print(BLUE + "     ---> PLEASE ENTER THE ITEM NUMBER          ----------->" + RESETT);
            int it = sc.nextInt();

            if (it > 0 && it <= 10) {
                switch (it) {
                    case 1: item1(); break;
                    case 2: item2(); break;
                    case 3: item3(); break;
                    case 4: item4(); break;
                    case 5: item5(); break;
                    case 6: item6(); break;
                    case 7: item7(); break;
                    case 8: item8(); break;
                    case 9: item9(); break;
                    case 10: item10(); break;
                }
                running = false; // ✅ Exit after placing order
            } else {
                System.out.println(RED + "          INVALID ITEM NUMBER            " + RESETT);
                System.out.println(PURPLE + "IF YOU WANT TO RE-ENTER THE ITEM NUMBER ENTER YES ELSE NO" + RESETT);
                String ao = sc.next();
                if (ao.equalsIgnoreCase("YES")) {
                    // loop continues, so re-enter
                } else {
                    System.out.println(CYAN + "IF YOU WANT TO SEE THE ITEM NAMES THEN ENTER 1 ELSE TO EXIT ENTER 2" + RESETT);
                    int aq = sc.nextInt();
                    if (aq == 1) {
                        // Just redisplay items without recursion
                        display();
                    } else {
                        System.out.println(GREEN + "    THANK YOU VISIT AGAIN       " + RESETT);
                        running = false;
                    }
                }
            }
        } else {
            System.out.println("   INVALID ENTRY PLEASE ENTER AGAIN");
            a = sc.nextInt();
        }
    }
}




public static void drawWashingMachine(String brand, String model, String type, String capacity,
                                      String spinSpeed, String energyRating, String color,
                                      String features, String cost, String bodyColor, String panelColor) {

    int innerWidth = 26;
    String leftPad = "  "; // keep this same for every line so borders align perfectly

    // Panel Top Border
    System.out.println(panelColor + leftPad + repeat("_", innerWidth + 2));
    System.out.println(panelColor + leftPad + "|" + repeat(" ", innerWidth) + "|");
    System.out.println(panelColor + leftPad + "|" + WHITE + centerText(brand, innerWidth) + panelColor + "|");
    System.out.println(panelColor + leftPad + "|" + repeat(" ", innerWidth) + "|");
    System.out.println(panelColor + leftPad + "|" + padRight("[Start]   [Pause]", innerWidth) + "|");
    System.out.println(panelColor + leftPad + "|" + padRight("[Powder]  [Mode: Quick]", innerWidth) + "|");
    System.out.println(panelColor + leftPad + "|" + repeat("_", innerWidth) + "|");

    // Body with Door
    System.out.println(bodyColor + leftPad + "|" + repeat(" ", innerWidth) + "|");
    System.out.println(bodyColor + leftPad + "|" + centerText(" ________ ", innerWidth) + "|");
    System.out.println(bodyColor + leftPad + "|" + centerText("/        \\", innerWidth) + "|");
    System.out.println(bodyColor + leftPad + "|" + centerText("|  O  O  |", innerWidth) + "|");
    System.out.println(bodyColor + leftPad + "|" + centerText("\\________/", innerWidth) + "|");
    System.out.println(bodyColor + leftPad + "|" + repeat(" ", innerWidth) + "|");
    System.out.println(bodyColor + leftPad + "|" + repeat("_", innerWidth) + "|" + RESET);

    // Specifications
    System.out.println(YELLOW + "Specifications:" + RESET);
    printSpec("Model", model);
    printSpec("Type", type);
    printSpec("Capacity", capacity);
    printSpec("Spin Speed", spinSpeed);
    printSpec("Energy Rating", energyRating);
    printSpec("Color", color);
    printSpec("Features", features);
    printSpec("Cost", cost);
    System.out.println();
}

public static void printSpec(String name, String value) {
    System.out.printf("  %s%-13s%s : %s%s%s%n",
            YELLOW, name, RESET, GREEN, value, RESET);
}

public static String centerText(String text, int width) {
    if (text.length() >= width) return text.substring(0, width);
    int padding = width - text.length();
    int padStart = padding / 2;
    int padEnd = padding - padStart;
    return repeat(" ", padStart) + text + repeat(" ", padEnd);
}

public static String padRight(String s, int width) {
    if (s.length() >= width) return s.substring(0, width);
    return s + repeat(" ", width - s.length());
}

// Helper method for repeating strings
public static String repeat(String s, int times) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < times; i++) {
        sb.append(s);
    }
    return sb.toString();
}


    public static void main(String[] args) throws InterruptedException {
    drawWashingMachineWithDelay("Samsung", "EcoBubble 7kg", "Front Load", "7 kg",
            "1200 RPM", "5 Star", "White", "EcoBubble, Digital Inverter", "₹35,000",
            BRIGHT_BLUE, MAGENTA);

    drawWashingMachineWithDelay("LG", "TurboWash 8kg", "Front Load", "8 kg",
            "1400 RPM", "5 Star", "Silver", "TurboWash, Steam", "₹42,000",
            CYAN, YELLOW);

    drawWashingMachineWithDelay("Whirlpool", "FreshCare 7.5kg", "Front Load", "7.5 kg",
            "1200 RPM", "4 Star", "Grey", "FreshCare+, Inverter Motor", "₹31,500",
            RED, WHITE);

    drawWashingMachineWithDelay("Bosch", "Serie 6 8kg", "Front Load", "8 kg",
            "1400 RPM", "5 Star", "White", "EcoSilence Drive", "₹48,000",
            MAGENTA, CYAN);

    drawWashingMachineWithDelay("IFB", "Senator WSS 8kg", "Front Load", "8 kg",
            "1400 RPM", "5 Star", "White", "Aqua Energie, Cradle Wash", "₹39,000",
            BRIGHT_BLUE, RED);

    drawWashingMachineWithDelay("Panasonic", "NA-127XB1 7kg", "Front Load", "7 kg",
            "1200 RPM", "4 Star", "Silver", "ActiveFoam, StainMaster", "₹29,500",
            CYAN, GREEN);

    drawWashingMachineWithDelay("Haier", "HW80-BD12756NZP", "Front Load", "8 kg",
            "1200 RPM", "5 Star", "Dark Grey", "Direct Motion Motor", "₹34,800",
            WHITE, MAGENTA);

    drawWashingMachineWithDelay("Godrej", "Eon 7kg", "Front Load", "7 kg",
            "1200 RPM", "4 Star", "White", "Anti-Crease, Eco Mode", "₹27,000",
            YELLOW, RED);

    drawWashingMachineWithDelay("Siemens", "iQ500 8kg", "Front Load", "8 kg",
            "1400 RPM", "5 Star", "Silver", "SpeedPerfect, EcoSilence", "₹46,000",
            GREEN, WHITE);

    drawWashingMachineWithDelay("Onida", "WO80TSPLN1 8kg", "Front Load", "8 kg",
            "1200 RPM", "3 Star", "White", "Hexa Crystal Drum", "₹25,000",
            MAGENTA, CYAN);

    display();
}

// Wrapper method to include sleep
public static void drawWashingMachineWithDelay(String brand, String model, String type, String capacity,
                                               String spinSpeed, String energyRating, String color,
                                               String features, String cost, String bodyColor, String panelColor) throws InterruptedException {
    drawWashingMachine(brand, model, type, capacity, spinSpeed, energyRating, color, features, cost, bodyColor, panelColor);
    Thread.sleep(1500); // wait 1.5 seconds
}
}





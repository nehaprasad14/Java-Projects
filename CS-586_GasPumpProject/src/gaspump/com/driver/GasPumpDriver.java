package gaspump.com.driver;

import gaspump.com.abstractFactory.GP1_ClientFactory;
import gaspump.com.abstractFactory.GP2_ClientFactory;
import gaspump.com.abstractFactory.GasPumpFactory;
import gaspump.com.action.OutputProcessor;
import gaspump.com.controller.MDA_EFSM;
import gaspump.com.gaspumpModels.GasPump1;
import gaspump.com.gaspumpModels.GasPump2;
import java.util.Scanner;

// Main Driver Class

public class GasPumpDriver {

	public static void GP1_Operations() {

		GasPumpFactory gf = new GP1_ClientFactory(); // Abstract factory for
														// GasPump1
		OutputProcessor op = new OutputProcessor(gf); // OutputProcessor
		MDA_EFSM m = new MDA_EFSM(gf, op); // m : MDA-EFSM object
		GasPump1 gp1 = new GasPump1(gf, m); // GasPump1 InputProcessor
		Scanner read = new Scanner(System.in);

		char ch;
		float a, b;
		System.out.println("                          GasPump-1");
		System.out.println("                  MENU of Operations");
		System.out.println("          0. Activate(float, float)");
		System.out.println("          1. Start()");
		System.out.println("          2. PayCredit()");
		System.out.println("          3. Reject()");
		System.out.println("          4. Cancel()");
		System.out.println("          5. Approved()");
		System.out.println("          6. Super()");
		System.out.println("          7. Regular()");
		System.out.println("          8. StartPump()");
		System.out.println("          9. PumpGallon()");
		System.out.println("          a. StopPump()");
		System.out.println("          q. Quit the program");
		System.out.println("           GasPump-1 Execution");
		ch = '1';

		while (ch != 'q') {
			System.out
					.println("------------------------------------------------------------------------\n  Select Operation: ");
			System.out
					.println("0-Activate,1-Start,2-PayCredit,3-Reject,4-Cancel,5-Approved,6-Super,");
			System.out
					.println("7-Regular, 8-StartPump, 9-PumpGallon, a-StopPump, q-quit \n------------------------------------------------------------------------\n");
			ch = read.next().charAt(0);
			switch (ch) {
			case '0': { // Activate()
				System.out.println("  Operation:  Activate(float a, float b)");
				System.out
						.println("  Enter value of the parameter a (Price of Regular gas/gallon):");
				a = read.nextFloat();
				System.out
						.println("  Enter value of the parameter b (Price of Super gas/gallon):");
				b = read.nextFloat();
				gp1.Activate(a, b);
				break;
			}
			case '1': { // Start
				System.out.println("  Operation:  Start()");
				gp1.Start();
				break;
			}
			case '2': { // PayCredit
				System.out.println("  Operation:  PayCredit()");
				gp1.PayCredit();
				break;
			}
			case '3': { // Reject
				System.out.println("  Operation:  Reject()");
				gp1.Reject();
				break;
			}
			case '4': { // Cancel
				System.out.println("  Operation:  Cancel()");
				gp1.Cancel();
				break;
			}
			case '5': { // Approved
				System.out.println("  Operation:  Approved()");
				gp1.Approved();
				break;
			}
			case '6': { // Super
				System.out.println("  Operation:  Super()");
				gp1.Super();
				break;
			}
			case '7': { // Regular
				System.out.println("  Operation:  Regular()");
				gp1.Regular();
				break;
			}
			case '8': { // StartPump
				System.out.println("  Operation:  StartPump()");
				gp1.StartPump();
				break;
			}
			case '9': { // PumpGallon
				System.out.println("  Operation:  PumpGallon()");
				gp1.PumpGallon();
				break;
			}
			case 'a': { // StopPump
				System.out.println("  Operation:  StopPump()");
				gp1.StopPump();
				break;
			}
			}// end switch
		}// end while
		read.close();
	}

	public static void GP2_Operations() {

		GasPumpFactory gf = new GP2_ClientFactory(); // Abstract factory for
														// GasPump1
		OutputProcessor op = new OutputProcessor(gf); // OutputProcessor
		MDA_EFSM m = new MDA_EFSM(gf, op); // m : MDA-EFSM object
		GasPump2 gp2 = new GasPump2(gf, m); // GasPump1 InputProcessor

		int a, b, c, cash;
		Scanner read = new Scanner(System.in);
		char ch;
		System.out.println("                          GasPump-2");
		System.out.println("                  MENU of Operations");
		System.out.println("          0. Activate(int,int,int)");
		System.out.println("          1. Start()");
		System.out.println("          2. PayCash()");
		System.out.println("          3. Cancel()");
		System.out.println("          4. Premium()");
		System.out.println("          5. Super()");
		System.out.println("          6. Regular()");
		System.out.println("          7. StartPump()");
		System.out.println("          8. PumpLiter()");
		System.out.println("          a. Stop()");
		System.out.println("          r. Receipt()");
		System.out.println("          n. NoReceipt()");
		System.out.println("          q. Quit the program");
		System.out.println("           GasPump-2 Execution");
		ch = '1';

		while (ch != 'q') {
			System.out
					.println("------------------------------------------------------------------------\n  Select Operation: ");
			System.out
					.println("0-Activate, 1-Start, 2-PayCash, 3-Cancel, 4-Premium, 5-Super, 6-Regular,");
			System.out
					.println("7-StartPump, 8-PumpLiter, a-StopPump, r-Receipt, n-NoReceipt, q-quit\n------------------------------------------------------------------------  \n");
			ch = read.next().charAt(0);
			switch (ch) {
			case '0': { // Activate()
				System.out
						.println("  Operation:  Activate(int a, int b, int c)");
				System.out
						.println("  Enter value of the parameter a (Price of Regular gas/liter):");
				a = read.nextInt();
				System.out
						.println("  Enter value of the parameter b (Price of Premium gas/liter):");
				b = read.nextInt();
				System.out
						.println("  Enter value of the parameter c (Price of Super gas/liter):");
				c = read.nextInt();
				gp2.Activate(a, b, c);
				break;
			}
			case '1': { // Start
				System.out.println("  Operation:  Start()");
				gp2.Start();
				break;
			}
			case '2': { // PayCash
				System.out.println("  Operation:  PayCash()");
				System.out.println("  Enter amount of cash : $");
				cash = read.nextInt();
				gp2.PayCash(cash);
				break;
			}
			case '3': { // Cancel
				System.out.println("  Operation:  Cancel()");
				gp2.Cancel();
				break;
			}
			case '4': { // Premium
				System.out.println("  Operation:  Premium()");
				gp2.Premium();
				break;
			}
			case '5': { // Super
				System.out.println("  Operation:  Super()");
				gp2.Super();
				break;
			}
			case '6': { // Regular
				System.out.println("  Operation:  Regular()");
				gp2.Regular();
				break;
			}
			case '7': { // StartPump
				System.out.println("  Operation:  StartPump()");
				gp2.StartPump();
				break;
			}
			case '8': { // PumpLiter
				System.out.println("  Operation:  PumpLiter()");
				gp2.PumpLiter();
				break;
			}
			case 'a': { // StopPump
				System.out.println("  Operation:  StopPump()");
				gp2.Stop();
				break;
			}
			case 'r': { // Receipt
				System.out.println("  Operation:  Receipt()");
				gp2.Receipt();
				break;
			}
			case 'n': { // NoReceipt
				System.out.println("  Operation:  NoReceipt()");
				gp2.NoReceipt();
				break;
			}
			}// end switch
		}// end while
		read.close();
	}

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		char gasSelected;

		System.out.println("~~~~~~~~~~Please select a GasPump~~~~~~~~~~");
		System.out.println("1. GasPump-1");
		System.out.println("2. GasPump-2 ");

		gasSelected = read.next().charAt(0);

		if (gasSelected == '1') {
			GP1_Operations();
			System.exit(0);
		} else if (gasSelected == '2') {
			GP2_Operations();
			System.exit(0);
		} else {
			System.out.println("Please select valid GasPump.");
		}

		read.close();

	}

}

import java.util.*;
import java.io.*;

public class Matcher {

	static ArrayList<String> weak;
	static ArrayList<String> moderate;
	static ArrayList<String> strong;


	public static void readInLists() {

		// for weak:
		File file = new File("./weak.txt");

		try {
			Scanner sc = new Scanner(file);

			int count = 0;

			while (sc.hasNext()) {
				String s = sc.next();
				// only keep the hashes, not the numerals
				count ++;
				if (count % 2 == 1)
					// System.out.println(s);
					weak.add(s);
			}

			sc.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Failed to find file");
			System.exit(1);
		}

		// for moderate:
		file = new File("./moderate.txt");

		try {
			Scanner sc = new Scanner(file);

			int count = 0;

			while (sc.hasNext()) {
				String s = sc.next();
				// only keep the hashes, not the numerals
				count ++;
				if (count % 2 == 1)
					// System.out.println(s);
					moderate.add(s);
			}

			sc.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Failed to find file");
			System.exit(1);
		}

				// for strong:
		file = new File("./strong.txt");

		try {
			Scanner sc = new Scanner(file);

			int count = 0;

			while (sc.hasNext()) {
				String s = sc.next();
				// only keep the hashes, not the numerals
				count ++;
				if (count % 2 == 1)
					// System.out.println(s);
					strong.add(s);
			}

			sc.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Failed to find file");
			System.exit(1);
		}

	}

	public static void check(String h, int n) {
		// first weak
		for (int i = 0; i < weak.size(); i++) {
			if (h.equals(weak.get(i))) {
				System.out.println("FOUND: " + n + ". " + h + " matches WEAK " + i + "\n");
			}
		}

		for (int i = 0; i < moderate.size(); i++) {
			if (h.equals(moderate.get(i))) {
				System.out.println("FOUND: " + n + ". " + h + " matches MOD " + i);
			}
		}

		for (int i = 0; i < strong.size(); i++) {
			if (h.equals(strong.get(i))) {
				System.out.println("FOUND: " + n + ". " + h + " matches STR " + i);
			}
		}
	}

	public static void main(String[] args) {

		weak = new ArrayList<String>();
		moderate = new ArrayList<String>();
		strong = new ArrayList<String>();

		readInLists();

		Scanner in = new Scanner(System.in);

		int count = 1;

		while (in.hasNext()) {
			// System.out.println(count);
			String h = in.next();
			check(h, count);
			count ++;

		}
	}
}
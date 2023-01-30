import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		for (int k = 0; k < n; k++) {
			String s = sc.nextLine();
			String s1 = sc.nextLine();
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < s1.length(); j++) {
					if (s.charAt(i) == s1.charAt(j)) {
						count++;
						break;
					}
				}
				if (count == s.length()) {
					System.out.println("YES");
					break;
				}
			}
			if (count < s.length()) {
				System.out.println("NO");
			}

		}

	}
}

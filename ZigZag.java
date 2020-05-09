import java.util.ArrayList;
import java.util.List;

public class ZigZag {

	public static String convert(String s, int numRows) {
		List<char[]> ls = new ArrayList();
		int p = 0;
		boolean boo = true;
		String str = "";

		while (true) {
			if (p == s.length())
				break;

			char[] arr = new char[numRows];
			if (boo) {
				for (int i = 0; i < arr.length; i++) {
					arr[i] = s.charAt(p++);
					if (p == s.length())
						break;
				}
				boo = false;
			} else {
				for (int i = arr.length - 2; i > 0; i--) {
					arr[i] = s.charAt(p++);
					if (p == s.length())
						break;
				}
				boo = true;
			}

			ls.add(arr);			

		}

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < ls.size(); j++)
				if (ls.get(j)[i] != 0)
					str += ls.get(j)[i];

		}
		return str;
	}

	public static void main(String[] args) {
		String s = "";
		int numRows = 1;
		

		System.out.println(convert(s, numRows));

//				char[] arr = new char[6];
//				arr[0] = 's';
//				arr[2] = 'r';
//				arr[3] = 'i';
//				arr[4] = 'n';
//				arr[5] = 'g';

	}

}

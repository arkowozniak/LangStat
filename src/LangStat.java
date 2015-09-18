import java.util.ArrayList;
import java.util.List;

public class LangStat {

	public static void main(String[] args) {

		String toScan = "MIN(3,4,2,MAX(3,4,MAX(5,2),5,MIN(3,4),6),3,4)";

		// toScan = "MIN(3,4,5)";
		 toScan="MIN(3,MIN(3,MIN(4,5,MIN(4,5))))";
		// toScan = "MIN(1)";
		List<Token> listofTokens = new ArrayList<Token>();

		if (toScan.contains(",")) {
			listofTokens = toTokens(toScan);

		} else {
			throw new IllegalArgumentException("String " + toScan + " does not contain ,");
		}
		
		
		for (Token obj : listofTokens) {
			System.out.println("|" + obj.token + "|" + obj.level);
		}

		System.out.println(getMax(listofTokens));
		
	}

	static int getMax(List<Token> listofTokens) {
		int max = 0;
		for (int i = 0; i < listofTokens.size(); i++) {
			if (listofTokens.get(i).level > max) {
				max = listofTokens.get(i).level;
			}
		}
		return max;
	}

	static List<Token> toTokens(String toScan) {

		List<Token> listofTokens = new ArrayList<Token>();
		String[] parts = toScan.split(",");
		int level = 0;
		for (int i = 0; i < parts.length; i++) {

			if (parts[i].contains("(")) {
				level++;
				String[] mParts = parts[i].split("\\(");
				if (mParts[0].equals("MIN"))
					listofTokens.add(new Token("min", tokenType.min, level));
				if (mParts[0].equals("MAX"))
					listofTokens.add(new Token("max", tokenType.max, level));
				if (mParts[0].equals("AVG"))
					listofTokens.add(new Token("avg", tokenType.avg, level));
				listofTokens.add(new Token("(", tokenType.l_bracket, level));
				listofTokens.add(new Token(mParts[1], tokenType.number, level));
			}

			if (parts[i].contains(")")) {
				int count = parts[i].length() - parts[i].replace(")", "").length();
				for (int j = 0; j < count; j++) {
					listofTokens.add(new Token(")", tokenType.r_bracket, level));
					level--;
				}

			}

			if (!parts[i].contains("(") && !parts[i].contains(")")) {
				listofTokens.add(new Token(parts[i], tokenType.number, level));
			}

			if (level == 0) {
				listofTokens.add(new Token("end", tokenType.end, level));
			}

		}

		return listofTokens;
	}

	static String avg(double[] liczby_) { // srednia arytmetyczna
		double suma = 0;
		if (liczby_.length == 1)
			suma = liczby_[0];
		else
			for (int i = 0; i < liczby_.length; i++) {
				suma = suma + liczby_[i];
			}
		double avg = suma / liczby_.length;

		avg = Math.round(avg * 1000);

		return String.valueOf(avg / 1000);
	}

	static String min(double[] liczby_) { // minimalna liczba
		double min = 0;
		if (liczby_.length == 1)
			min = liczby_[0];
		else
			for (int i = 0; i < liczby_.length; i++) {
				if (i == 0)
					min = liczby_[i];
				if (liczby_[i] < min)
					min = liczby_[i];
			}
		min = Math.round(min * 1000);

		return String.valueOf(min / 1000);
	}

	static String max(double[] liczby_) { // maksymalna liczba
		double max = 0;
		if (liczby_.length == 1)
			max = liczby_[0];
		else
			for (int i = 0; i < liczby_.length; i++) {
				if (i == 0)
					max = liczby_[i];
				if (liczby_[i] > max)
					max = liczby_[i];
			}
		max = Math.round(max * 1000);

		return String.valueOf(max / 1000);
	}

}

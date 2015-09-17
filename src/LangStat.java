import java.util.ArrayList;
import java.util.List;

public class LangStat {

	public static void main(String[] args) {

		String toScan = "MIN(3,4,2,MAX(3,4,MAX(5,4),5,6),3,4)";

		// toScan = "MIN(3,4,5)";

		List<Token> listofTokens = new ArrayList<Token>();

		if (toScan.contains(",")) {
			listofTokens = toTokens(toScan);

		} else {
			throw new IllegalArgumentException("String " + toScan + " does not contain ,");
		}

		for (Token obj : listofTokens) {
			System.out.println(obj.token);
		}

	}

	static List<Token> toTokens(String toScan) {

		List<Token> listofTokens = new ArrayList<Token>();
		String[] parts = toScan.split(",");
		boolean leveli = false;
		boolean levelii = false;
		boolean leveliii = false;

		for (int i = 0; i < parts.length; i++) {
			if (parts[i].contains("(")) {
				if (leveli == false && levelii == false && leveliii == false)
					leveli = true;
				else if (leveli == true && levelii == false && leveliii == false)
					levelii = true;
				else if (leveli == true && levelii == true && leveliii == false)
					leveliii = true;
			}

			if (parts[i].contains("(")) {

				String[] mParts = parts[i].split("\\(");
				if (mParts[0].equals("MIN"))
					listofTokens.add(new Token("min", tokenType.min, leveli, levelii, leveliii));
				if (mParts[0].equals("MAX"))
					listofTokens.add(new Token("max", tokenType.max, leveli, levelii, leveliii));
				if (mParts[0].equals("AVG"))
					listofTokens.add(new Token("avg", tokenType.avg, leveli, levelii, leveliii));
				listofTokens.add(new Token("(", tokenType.l_bracket, leveli, levelii, leveliii));
				listofTokens.add(new Token(mParts[1], tokenType.number, leveli, levelii, leveliii));
			}

			if (parts[i].contains(")")) {
				int count = parts[i].length() - parts[i].replace(")", "").length();
				listofTokens
						.add(new Token(parts[i].replaceAll("\\)", ""), tokenType.number, leveli, levelii, leveliii));
				if (count == 3) {
					listofTokens.add(new Token(")", tokenType.r_bracket, leveli, levelii, leveliii));
					leveliii = false;
					listofTokens.add(new Token(")", tokenType.r_bracket, leveli, levelii, leveliii));
					levelii = false;
					listofTokens.add(new Token(")", tokenType.r_bracket, leveli, levelii, leveliii));
					leveli = false;
				}
				if (count == 2) {
					if (leveliii == true) {
						listofTokens.add(new Token(")", tokenType.r_bracket, leveli, levelii, leveliii));
						leveliii = false;
						listofTokens.add(new Token(")", tokenType.r_bracket, leveli, levelii, leveliii));
						levelii = false;

					} else if (leveliii == false) {
						listofTokens.add(new Token(")", tokenType.r_bracket, leveli, levelii, leveliii));
						levelii = false;
						listofTokens.add(new Token(")", tokenType.r_bracket, leveli, levelii, leveliii));
						leveli = false;
					}

				}
				if (count == 1) {
					if (leveli == true && levelii == true && leveliii == true) {
						listofTokens.add(new Token(")", tokenType.r_bracket, leveli, levelii, leveliii));
						leveliii = false;
					} else if (leveli == true && levelii == true && leveliii == false) {
						listofTokens.add(new Token(")", tokenType.r_bracket, leveli, levelii, leveliii));
						levelii = false;
					} else if (leveli == true && levelii == false && leveliii == false) {
						listofTokens.add(new Token(")", tokenType.r_bracket, leveli, levelii, leveliii));
						leveli = false;
					}

				}

			}

			if (!parts[i].contains("(") && !parts[i].contains(")")) {
				listofTokens.add(new Token(parts[i], tokenType.number, leveli, levelii, leveliii));
			}

			if (leveli == false && levelii == false && leveliii == false) {
				listofTokens.add(new Token("end", tokenType.end, leveli, levelii, leveliii));
			}

		}
		System.out.println(leveli);
		System.out.println(levelii);
		System.out.println(leveliii);

		return listofTokens;
	}

}

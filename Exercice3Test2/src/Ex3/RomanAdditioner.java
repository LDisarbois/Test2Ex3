package Ex3;

public class RomanAdditioner {
	public String compute(String x) {
		RomanToNumeral R =new RomanToNumeral();
		NumeralToRoman N = new NumeralToRoman();
		String j = new String();
		int w = 0;
		for(int i =0 ; i< x.length();i++) {
			if (x.charAt(i) != '+' && x.charAt(i) != '-') {
				j = j + x.charAt(i);
				System.out.println(j);
			}else {
				if (x.charAt(i) == '+') {
					w = w + R.getNumeral(j);
				}
				if (x.charAt(i) == '-') {
					w = w - R.getNumeral(j);
				}
				
			}
		}
		System.out.println(w);
		String r = N.getRoman(w);
		return r;
	}
}

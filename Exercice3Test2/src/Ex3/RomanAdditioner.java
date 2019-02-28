package Ex3;

public class RomanAdditioner {
	public void compute(String x) {
		RomanToNumeral R =new RomanToNumeral();
		NumeralToRoman N = new NumeralToRoman();
		String j = null;
		int w = 0;
		for(int i =0 ; i< x.length();i++) {
			if (x.charAt(i) != '+' && x.charAt(i) != '-') {
				j = j + x.charAt(i);
			}else {
				if (x.charAt(i) == '+') {
					w = w + R.getNumeral(j);
				}
				if (x.charAt(i) == '-') {
					w = w - R.getNumeral(j);
				}
				
			}
		}
		String r = N.getRoman(w);
		
	}
}

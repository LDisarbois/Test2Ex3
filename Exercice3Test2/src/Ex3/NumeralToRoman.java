package Ex3;

import java.util.ArrayList;

public class NumeralToRoman {

	public String getRoman(int a) {
		ArrayList<String> b = new ArrayList<String>();
		
		while(a>0) {
		if(a > 1000) {
			a = a -1000;
			b.add("M");
		}else {
			if(a>500) {
				a =a-500;
				b.add("D");
			}else {
				if(a>100) {
					a = a-100; 
					b.add("C");
				}else {
					if(a>50) {
						a = a-50;
						b.add("L");
					}else {
						if(a>10) {
							a =a -10;
							b.add("X");
						}else {
							if(a>5) {
								a =a -5;
								b.add("V");
							}else {
								if(a>1) {
									a = a -1;
									b.add("I");
								}else {
							}
						}
					}
				}
			}
		}
	}
	
	}
		System.out.println(b.isEmpty());
		return b.toString();
	}
}

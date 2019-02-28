package Ex3;

public class RomanToNumeral {
	
	

	
	public int getNumeral(String a) {
		int b=0;
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i) == 'I') {
				b = b + 1;
			}else {
				if(a.charAt(i) == 'V') {
					b=b+5;
				}else {
					if(a.charAt(i) == 'X') {
						b=b+10;
					}else {
						if(a.charAt(i) == 'L') {
							b=b+50;
						}else {
							if(a.charAt(i) == 'C') {
								b=b+100;
							}else {
								if(a.charAt(i) == 'D') {
									b=b+500;
								}else {
									if(a.charAt(i) == 'M') {
										b=b+1000;
									}
							}
						}
					}
				}
			}
		}
		}
return b;
	}
}
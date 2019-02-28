package Ex3;

import java.util.ArrayList;

public class RomanToNumeral {
	
	
ArrayList<String> a = new ArrayList<String>();

	
	public int getNumeral(ArrayList<String> a) {
		int b=0;
		
		for(int i=0;i<a.size();i++) {
			if(a.get(i).toString() == "I") {
				b = b + 1;
			}else {
				if(a.get(i).toString() == "V") {
					b=b+5;
				}else {
					if(a.get(i).toString() == "X") {
						b=b+10;
					}else {
						if(a.get(i).toString() == "L") {
							b=b+50;
						}else {
							if(a.get(i).toString() == "C") {
								b=b+100;
							}else {
								if(a.get(i).toString() == "D") {
									b=b+500;
								}else {
									if(a.get(i).toString() == "M") {
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

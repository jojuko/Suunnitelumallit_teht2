package Tehtava9;

import java.util.*;

public class GetStrategy implements ListConverter{
	
	@Override
	public String listToString(List<String> list) {
		String tulos = "";
		int counter = 0;
		for(int i = 0; i < list.size(); i ++) {
			tulos += list.get(i);
			counter ++;
			if(counter == 2) {
				tulos += "\n";
				counter = 0;
			}
		}
		return tulos;
	}

}

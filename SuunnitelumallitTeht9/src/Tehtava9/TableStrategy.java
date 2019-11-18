package Tehtava9;

import java.util.*;


public class TableStrategy implements ListConverter{
	
	@Override
	public String listToString(List<String> list) {
		String[] array = list.toArray(new String[list.size()]);
		String tulos = "";
		int counter = 0;
		for(String string : array) {
			tulos += string;
			counter ++;
			if (counter == 3) {
				tulos += "\n";
				counter = 0;
			}
		}
		return tulos;
	}

}

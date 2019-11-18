package Tehtava9;

import java.util.*;

public class IteratorStrategy implements ListConverter{
	
	@Override
	public String listToString(List<String> list) {
		String tulos = "";
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			tulos += iterator.next() + "\n";
		}
		return tulos;
		}

}

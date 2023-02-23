package service;

import java.util.Collections;
import java.util.List;

public class CalculationService {
	
	public static <T extends Comparable<T>> T max(List<T> list) {
		
		if (list.isEmpty()) {
			throw new IllegalStateException("Empty List");
		}
		
		return Collections.max(list);
	}
	
}

package FlyweightDesign;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
private Map<String , Pen> flyweights=new HashMap<>();

public Pen getPen(String color) {
	
	Pen pen=flyweights.get(color);
	if(pen==null) {
		pen=new Refill(color);
		flyweights.put(color, pen);
	}
	return pen;
	
}
}

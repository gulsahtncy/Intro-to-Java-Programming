package chapter04.homeworks;

public class Homework03 {
	public static void main(String[] args) {
		
		// Geography: estimate areas
		
		// 33.7489954, –84.3879824 Atlanta, Georgia
		// 28.5383355, –81.3792365 Orlando, Florida
		// 32.0835407, –81.0998342 Savannah, Gerogia
		// 35.2270869, –80.8431267 Charlotte, North Carolina
		
		double x1 = 33.7489954;
		double y1 = -84.3879824;
		double x2 = 28.5383355;
		double y2 = -81.3792365;
		double x3 = 32.0835407;
		double y3 = -81.0998342;
		double x4 = 35.2270869;
		double y4 = -80.8431267;
		
		// d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
		
		double d1 = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) 
		* Math.cos(x2) * Math.cos(y1 - y2));
		double d2 = 6371.01 * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) 
		* Math.cos(x3) * Math.cos(y2 - y3));
		double d3 = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x3) + Math.cos(x1) 
		* Math.cos(x3) * Math.cos(y1 - y3));
	
		// s = (side1 + side2 + side3)/2;
		
		double s1 = (d1 + d2 + d3) / 2;
		double area1 = Math.sqrt(s1 * ( s1 - d1) * (s1 - d2) * (s1 - d3));
		
		double d4 = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x4) + Math.cos(x1) 
		* Math.cos(x4) * Math.cos(y1 - y4));
		double d5 = 6371.01 * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) 
		* Math.cos(x4) * Math.cos(y3 - y4));
		
		double s2 = (d4 + d5 + d3) / 2;
		double area2 = Math.sqrt(s2 * (s2 - d4) * (s2 - d5) * (s2 - d3));
		
		double area3 = area1 + area2;
		
		System.out.println("The estimated area enclosed by four cities is " + area3);
	}
}

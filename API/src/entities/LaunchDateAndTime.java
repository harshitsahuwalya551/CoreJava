package entities;



public class LaunchDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Date utilDate = new java.util.Date();
		System.out.println(utilDate);//Sat Feb 24 09:58:34 IST 2024

		long hour = utilDate.getHours();
		System.out.println(hour);
		
		long time = utilDate.getTime();
		System.out.println(time);
		
		java.sql.Date sqlDate = new java.sql.Date(hour) ;//1970-01-01
		System.out.println(sqlDate);
		System.out.println();
		java.sql.Date sql2Date = new java.sql.Date(time) ;//1970-01-01
		System.out.println(sql2Date);
		
	}


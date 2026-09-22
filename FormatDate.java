import java.util.*;
class FormatDate {
	public static String day;
	public static int date;
	public static String month;
	public static int year;
	
    public static void main(String[] args) {
		day = "Monday";
		month = "Steptember";
		year = 2026;
		date = 14;
        printAmerican(day, date, month, year);
        printEuropean(day, date, month, year);
    }
    
    public static void printAmerican(String day, int date, String month, int year) {
		System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
	}
	public static void printEuropean(String day, int date, String month, int year) {
		System.out.println("European format: " + day +  " " + date + " " + month + " " + year);
	}
}

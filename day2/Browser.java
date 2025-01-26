package week1.day2;

public class Browser {
	public String launchBrowser(String browserName)	{
		 System.out.println(browserName + "Browser Launched Successfully");
		 return browserName; 
	}
	public void loadUrl() {
		System.out.println("Application URL loaded successfully");
}
	public static void main(String[] args) {
			Browser bro = new Browser();
			bro.launchBrowser("Firfox");
			bro.loadUrl();
	}
}
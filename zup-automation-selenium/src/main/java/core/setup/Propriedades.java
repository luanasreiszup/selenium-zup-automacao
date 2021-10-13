package core.setup;

public class Propriedades {
	
	public static boolean FECHAR_BROWSER = true;
	
	public static Browsers browsers = Browsers.CHROME;
	
	public enum Browsers{
		CHROME,
		FIREFOX,
		HEADLESS
	}
}

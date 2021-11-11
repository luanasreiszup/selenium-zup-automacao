package steps.site;

import io.cucumber.java.pt.Dado;
import pages.site.SiteNavegacao;

public class SiteSteps {
	
	SiteNavegacao site = new SiteNavegacao();
	
	@Dado("que estou no site Zup Innovation")
	public void site_zup_innovation() {
		site.acessarSite("siteData", "zupInovation");
	}

}

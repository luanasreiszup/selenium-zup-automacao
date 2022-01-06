package jornada.site.step;

import io.cucumber.java.pt.Dado;
import jornada.site.page.SiteNavegacao;


public class SiteSteps {
	
	SiteNavegacao site = new SiteNavegacao();
	
	@Dado("que estou no site Zup Innovation")
	public void site_zup_innovation() {
		site.acessarSite("siteData", "zupInovation");
	}


}

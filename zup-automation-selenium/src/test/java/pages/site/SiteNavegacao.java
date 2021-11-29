package pages.site;

import static core.setup.DriverFactory.getDriver;

import core.util.massaDados.SiteData;

public class SiteNavegacao{

	public void acessarSite(String json_file, String id_massa) {
		SiteData site = new SiteData(json_file, id_massa);
		getDriver().get(site.getSite());
	}
	
	

}

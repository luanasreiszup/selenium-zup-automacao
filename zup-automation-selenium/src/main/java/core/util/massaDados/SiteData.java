package core.util.massaDados;

import core.util.leitorJson.LeitorJson;

public class SiteData {
	
	private String site;
	
	public String getSite() {
		return site;
	}

	public SiteData(String json_file, String id_massa) {
		this.site = LeitorJson.PesquisaJson(json_file, id_massa, "url_site");
	}
}

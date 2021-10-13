package core.util.leitorJson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LeitorJson {

	public static String PesquisaJson(String json_file, String id_massa, String identificador) {
		
		JSONParser Jparser = new JSONParser();
		JSONObject JObj = new JSONObject();
		
		try {
			String diretorio = System.getProperty("user.dir");
			JObj = (JSONObject) Jparser.parse(new FileReader(diretorio+"<endereco>"+json_file+".json"));
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JSONObject jObject = (JSONObject) JObj.get(id_massa);
		String retornoDados = (String) jObject.get(identificador);
		return retornoDados;
	}
}

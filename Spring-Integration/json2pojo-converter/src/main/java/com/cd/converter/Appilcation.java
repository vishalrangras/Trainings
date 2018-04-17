package com.cd.converter;

import java.io.File;
import java.io.IOException;

import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;

import com.sun.codemodel.JCodeModel;

public class Appilcation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		JCodeModel codeModel = new JCodeModel();
		
		//URL source = new URL("file:///D:/si-outbound/address");
		
		String source = "{\"page\":2,\"per_page\":3,\"total\":12,\"total_pages\":4,\"data\":[{\"id\":4,\"first_name\":\"Eve\",\"last_name\":\"Holt\",\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/marcoramires/128.jpg\"},{\"id\":5,\"first_name\":\"Charles\",\"last_name\":\"Morris\",\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/stephenmoon/128.jpg\"},{\"id\":6,\"first_name\":\"Tracey\",\"last_name\":\"Ramos\",\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/bigmancho/128.jpg\"}]}";
		
		GenerationConfig config = new DefaultGenerationConfig() {
			@Override
			public boolean isGenerateBuilders() { // set config option by overriding method
				return true;
			}
			
			@Override
			public SourceType getSourceType() {
				// TODO Auto-generated method stub
				//String sourceType = super.getSourceType();
				
				return SourceType.JSON;
			}
		};
		
		SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
		mapper.generate(codeModel, "Avtar", "com.cd.pojo", source);

		codeModel.build(new File("D:\\si-outbound"));
		//codeModel.build(Files.createTempDirectory("kink").toFile());
		System.out.println("generated");

	}

}

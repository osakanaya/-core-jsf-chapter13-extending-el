package com.corejsf;

import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;

public class ELFunctions {
	public static String getFile(String filename) {
		FacesContext context = FacesContext.getCurrentInstance();
		
		Logger.getLogger("com.corejsf").info("context=" + context);
		
		InputStream stream = context.getExternalContext().getResourceAsStream(filename);
		Scanner in = new Scanner(stream);
		
		Logger.getLogger("com.corejsf").info("context=" + context);
		
		StringBuilder builder = new StringBuilder();
		while(in.hasNextLine()) {
			builder.append(in.nextLine());
			builder.append("\n");
		}
		
		return builder.toString();
	}
}

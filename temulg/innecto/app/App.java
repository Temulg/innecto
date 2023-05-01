/*
 * Copyright (c) 2023 Alex Dubov <oakad@yahoo.com>
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package temulg.innecto.app;

import java.io.FileReader;
import java.io.IOException;

import groovy.lang.Script;
import groovy.lang.Binding;
import groovy.lang.GroovyCodeSource;
import groovy.lang.GroovyClassLoader;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.codehaus.groovy.runtime.InvokerHelper;

public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("File in " + args[0]);

		var loader = new GroovyClassLoader(
			App.class.getClassLoader(),
			CompilerConfiguration.DEFAULT
		);

		Class scriptClass;

		try (var src = new FileReader(args[0])) {
			var cs = new GroovyCodeSource(
				src, "testing_Package", "/testing"
			);
			scriptClass = loader.parseClass(cs);
		}

		System.out.println("Class out: " + scriptClass.getName());

		InvokerHelper.newScript(scriptClass, new Binding()).run();
	}
}

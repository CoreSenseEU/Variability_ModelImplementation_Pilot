/*
 * generated by Xtext 2.38.0
 */
package eu.coresense.variability.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import eu.coresense.variability.VariabilityRuntimeModule;
import eu.coresense.variability.VariabilityStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class VariabilityIdeSetup extends VariabilityStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new VariabilityRuntimeModule(), new VariabilityIdeModule()));
	}
	
}

/*
 * generated by Xtext 2.38.0
 */
package eu.coresense.variability;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class VariabilityStandaloneSetup extends VariabilityStandaloneSetupGenerated {

	public static void doSetup() {
		new VariabilityStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

## Variability_ModelImplementation_Pilot 

This repository implements an example of a DSL (Domain Specific Language) implemented with Xtext and based on [RosTooling](https://github.com/ipa320/RosTooling) for the representation of variability in the form of parameters of a system in ROS 2.

### Installation

Please follow the instructions under [Option 1: Release](https://ipa320.github.io/RosTooling.github.io/docu/Installation.html#option-1-using-the-release-version-recommended) to install the RosTooling realese.

Clone the RosTooling source code and the pilot implementation from GitHub:

```
cd **EclipseWS**
git clone git@github.com:ipa320/RosTooling.git
git clone git@github.com:CoreSenseEU/Variability_ModelImplementation_Pilot.git
```

Then import the plugins into your workspace in eclipse. By selecting File->Import->Existing Projects into Workspace (General category). Under "Select root directory", press "Browse" and import all the project under plugins for both repositories.

![alt text](docu/ImportPlugins.gif)

Once all the projects are imported, go to the menu "Project"->"Clean" and enable "All projects" options. This command will build all the packages.

To start the application you can easily right click the project "eu.coresense.variability.xtext.ui" and select "Run as"->"Eclipse Application".

![alt text](docu/StartEclipseApp.gif)


Then please follow the RosTooling instructions to import the base objects: [RosTooling setup](https://ipa320.github.io/RosTooling.github.io/docu/Environment_setup.html#1-switch-to-the-ros-developer-perspective).

You can import then, the exmaple from this repository.

## Acknowledgement

<img src="https://github.com/user-attachments/assets/b11da974-9201-4f79-902e-c9c20e8aa7a4" alt="Funded by the European Union" width="240"/>

This work has received funding from the European Union's Horizon Europe research and innovation programme under grant agreement No 101070254 ([CORESENSE](https://coresense.eu)). Views and opinions expressed are however those of the author(s) only and do not necessarily reflect those of the European Union or the European Commission. Neither the European Union nor the granting authority can be held responsible for them.

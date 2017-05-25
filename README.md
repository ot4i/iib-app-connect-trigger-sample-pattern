# iib-app-connect-trigger-sample-pattern

This repository includes source projects which can be imported into the IBM Integration Bus Toolkit which provide:
* An IIB node for pushing events out from IIB into AppConnect via WebHooks
* An IIB to App Connect Integration Pattern which quickly generates:
	* A YAML configuration document (required by App Connect)
	* A sample message flow including an App Connect message flow node.

This [You Tube recording shows everything working](https://www.youtube.com/watch?v=StwPbOiFKzk) If you would like to demonstrate the same features shown in this recording, then prepare your environment by running through the following steps:

**1. Install the AppConnect node.**
Download the [AppConnect node](https://github.com/ot4i/iib-app-connect-trigger-sample-pattern/releases/download/V1.0/AppConnect_1.0.0.201612210011.jar) and copy it into your Toolkit dropins directory. For example, by default on Windows, this will be C:\Program Files\IBM\IIB\10.0.0.7\tools\dropins.

**2. Install the IIBAppConnect Pattern Archive.**
From the IIB Toolkit Patterns Explorer view, click the button to "Download and Install a pattern" (as shown by the red box below).

![alt text](https://github.com/ot4i/iib-app-connect-trigger-sample-pattern/blob/master/InstallPatternZip1.png "Download and Install a pattern in the IIB Toolkit")

On the Download and Install Pattern dialog, enter the following HTTP URL and then click Download:
https://github.com/ot4i/iib-app-connect-trigger-sample-pattern/releases/download/V1.0/IIBAppConnect.patternzip

![alt text](https://github.com/ot4i/iib-app-connect-trigger-sample-pattern/blob/master/InstallPatternZip2.png "Download and Install pattern dialog in the IIB Toolkit")

**3. Restart your IIB Toolkit**

You should now see the AppConnect node in your flow palette, and you should also see the pattern in the Patterns Explorer.
If you would like to make *changes* to the functionalities provided by either the node or the pattern, then clone this Github repository to access the source code for the IIB projects.

**Please note that the AppConnect node is implemented as a Subflow User-Defined node, which means that when deployed in a BAR file it must be packaged by ticking the option to Compile and in-line resources. This means that flows containing this node cannot be used in conjunction with shared libraries.**

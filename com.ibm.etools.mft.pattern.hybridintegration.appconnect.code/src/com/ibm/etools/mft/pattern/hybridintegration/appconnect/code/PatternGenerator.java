package com.ibm.etools.mft.pattern.hybridintegration.appconnect.code;

import com.ibm.broker.config.appdev.GenericNode;
import com.ibm.broker.config.appdev.MessageFlow;
import com.ibm.broker.config.appdev.Node;
import com.ibm.broker.config.appdev.SubFlowNode;
import com.ibm.broker.config.appdev.patterns.GeneratePatternInstanceTransform;
import com.ibm.broker.config.appdev.patterns.PatternInstanceManager;





public class PatternGenerator implements GeneratePatternInstanceTransform {
	
	// Properties IDs
	private static final String PROPERTY_INCLUDE_SAMPLE_ID = "ppIncludeSample";
		
	private boolean includeSample;

	@Override
	public void onGeneratePatternInstance(PatternInstanceManager patternInstanceManager) {
		
		// The location for the generated projects 
		String location = patternInstanceManager.getWorkspaceLocation();
		
		// The pattern instance name for this generation
		String patternInstanceName = patternInstanceManager.getPatternInstanceName();

		// Change the properties of the AppConnect node in the sample message flow to match those provided to the pattern instance
		MessageFlow mf1 = patternInstanceManager.getMessageFlow("SampleAppConnect", "IIBtoAppConnect.msgflow");
		Node AppConnectNode = mf1.getNodeByName("AppConnect");
		AppConnectNode.setProperty("EventType",patternInstanceManager.getParameterValue("ppTrigger1Name"));
		String URLFragment = patternInstanceManager.getParameterValue("ppWebhookURLFragment");
		AppConnectNode.setProperty("URLSpecifierBase",URLFragment);
		AppConnectNode.setProperty("URLSpecifierStar",URLFragment+"/*");
		
	}
}

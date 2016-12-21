/**
 * Pattern program for use with IBM WebSphere Message Broker.
 *
 * COPYRIGHT NOTICE AND LICENSE
 * © Copyright International Business Machines Corporation 2009, 2011
 * Licensed Materials - Property of IBM
 *
 * On condition that the user is also then a licensed user of the specific 
 * version of the IBM product named above, this pattern program may be   
 * used, executed, copied and modified without obligation to make any  
 * royalty payment to IBM, as follows:
 *
 * (a) for the user's own instruction and study; and
 *
 * (b) in order to develop one or more applications designed to run with an IBM
 *     WebSphere Message Broker software product, either (i) for the licensed user's
 *     own internal use or (ii) for redistribution by the licensed user, as part of  
 *     such an application and in the licensed user's own product or products.
 *
 * No other rights under copyright are granted without prior written permission
 * of International Business Machines Corporation.
 *
 * In all other respects, the licensing terms and conditions associated with
 * the above-named IBM product continue to apply without modification.
 *
 * NO WARRANTY 
 * These materials and this sample program illustrate programming techniques. 
 * They have not been thoroughly tested under all conditions. 
 *
 * IBM therefore cannot and does not in any way guarantee, warrant represent 
 * or imply the reliability, serviceability, or function of this sample program. 
 * 
 * To the fullest extent permitted by applicable law, this program is provided by  
 * IBM "As Is", without warranty of any kind (express or implied), including without  
 * limitation any implied warranty of merchantability (satisfactory quality) or fitness 
 * for any particular purpose.
 */

package com.ibm.etools.mft.pattern.hybridintegration.appconnect.pattern;

import java.util.Map;
import org.eclipse.osgi.util.NLS;
import com.ibm.etools.mft.pattern.hybridintegration.appconnect.plugin.PatternBundle;
import com.ibm.etools.mft.pattern.hybridintegration.appconnect.plugin.PatternPlugin;
import com.ibm.etools.patterns.model.base.IPatternBundle;

public class PatternMessages extends PatternBundle implements IPatternBundle {
	private static final String BUNDLE_NAME = "com.ibm.etools.mft.pattern.hybridintegration.appconnect.pattern.messages"; //$NON-NLS-1$
	private static final Map<String, String> map;	
	private static final String[] enumerations = {
	 	"5061747465726E732173616D706C655F6E6F", //$NON-NLS-1$
	 	"5061747465726E732173616D706C655F796573", //$NON-NLS-1$
	 	"5061747465726E732131", //$NON-NLS-1$
	 	"5061747465726E732132", //$NON-NLS-1$
	 	"5061747465726E732133", //$NON-NLS-1$
	 	"5061747465726E732134", //$NON-NLS-1$
	 	"5061747465726E732135", //$NON-NLS-1$
	 	"5061747465726E732168747470", //$NON-NLS-1$
	 	"5061747465726E73216874747073", //$NON-NLS-1$
	};
	
	public static String getStringStatic(String key) {
		return map.get(key);
	}
	
	public String getString(String key) {
		return map.get(key);
	}

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_group_Id155356c35f967434fc3b47a4a77;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_group_Id155356c35f967434fc3b47a4a77_description;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_group_Id159142bf400263257c55f7f1693;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_group_Id159142bf400263257c55f7f1693_description;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_group_Id159143686d371d3275c8202a4bc;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_group_Id159143686d371d3275c8202a4bc_description;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_group_Id15914399b172ad88e04ded88bc;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_group_Id15914399b172ad88e04ded88bc_description;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_group_Id159143d2ba7b39e20516c5b93d7;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_group_Id159143d2ba7b39e20516c5b93d7_description;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_group_Id159143fb12bcbdabb2b9dffbdea;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_group_Id159143fb12bcbdabb2b9dffbdea_description;		



	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppInterfaceTitle;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppInterfaceTitle_watermark;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppInterfaceTitle_default;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppInterfaceDescription;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppInterfaceDescription_watermark;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppInterfaceDescription_default;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppHTTPorHTTPS;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppHTTPorHTTPS_watermark;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppHostname;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppHostname_watermark;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppHostname_default;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppWebhookURLFragment;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppWebhookURLFragment_watermark;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppWebhookURLFragment_default;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppNumberOfEvents;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppNumberOfEvents_watermark;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppIncludeSample;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppIncludeSample_watermark;		


	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger1Name;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger1Name_watermark;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger1Name_default;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger1Description;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger1Description_watermark;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger1Description_default;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger1Fields;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger1Fields_watermark;		


	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger2Name;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger2Name_watermark;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger2Description;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger2Description_watermark;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger2Fields;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger2Fields_watermark;		


	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger3Name;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger3Name_watermark;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger3Description;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger3Description_watermark;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger3Fields;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger3Fields_watermark;		


	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger4Name;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger4Name_watermark;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger4Description;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger4Description_watermark;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger4Fields;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger4Fields_watermark;		


	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger5Name;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger5Name_watermark;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger5Description;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger5Description_watermark;		

	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger5Fields;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger5Fields_watermark;		













	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger1Fields_fieldName;




	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger2Fields_fieldName;




	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger3Fields_fieldName;








	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_root_ppTrigger5Fields_fieldName;


	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_Id155356d7d80e8e34c40c7bc7dd3_5061747465726E732173616D706C655F6E6F;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_Id155356d7d80e8e34c40c7bc7dd3_5061747465726E732173616D706C655F796573;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_Id1591895caf683f666126dbc7c3f_5061747465726E732131;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_Id1591895caf683f666126dbc7c3f_5061747465726E732132;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_Id1591895caf683f666126dbc7c3f_5061747465726E732133;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_Id1591895caf683f666126dbc7c3f_5061747465726E732134;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_Id1591895caf683f666126dbc7c3f_5061747465726E732135;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_Id1591e10d1d8e41494a9366f9db3_5061747465726E732168747470;		
	public static String com_ibm_etools_mft_pattern_hybridintegration_appconnect_pattern_pov_Id1591e10d1d8e41494a9366f9db3_5061747465726E73216874747073;		

	
	static {
		NLS.initializeMessages(BUNDLE_NAME, PatternMessages.class);
		PatternPlugin.addBundle(PatternMessages.class);
		map = PatternBundle.createMessageMap(PatternMessages.class, enumerations);
	}
}

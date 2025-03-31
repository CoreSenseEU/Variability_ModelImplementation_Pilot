package eu.coresense.variability.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.coresense.variability.services.VariabilityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalVariabilityParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RelativeNamespace", "PrivateNamespace", "VariableValues", "GlobalNamespace", "ParameterAny", "Connections", "Interfaces", "Parameters", "SubSystems", "Namespace", "Processes", "GraphName", "Float32_1", "Float64_1", "FromFile", "Default", "Duration", "Feedback", "String_2", "Threads", "Uint16_1", "Uint32_1", "Uint64_1", "Boolean", "Integer", "Float32", "Float64", "Int16_1", "Int32_1", "Int64_1", "Message", "Service", "Uint8_1", "Base64", "Double", "Header", "String", "Struct", "Action", "Bool_1", "Byte_1", "Char_1", "Int8_1", "Nodes", "Result", "String_1", "Uint16", "Uint32", "Uint64", "Value_1", "Array", "From", "Int16", "Int32", "Int64", "Pub", "Sub", "Type_1", "Uint8", "Value", "Date", "List", "Ac", "As", "Bool", "Byte", "Char", "Goal", "Int8", "Name", "Node", "Sc", "Ss", "Time", "Type", "Any", "Ns", "LeftSquareBracketRightSquareBracket", "Comma", "HyphenMinus", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_MESSAGE_ASIGMENT", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ROS_CONVENTION_A", "RULE_ROS_CONVENTION_PARAM", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Connections=9;
    public static final int Float32_1=16;
    public static final int Node=74;
    public static final int RULE_DATE_TIME=97;
    public static final int Uint64_1=26;
    public static final int String=40;
    public static final int Processes=14;
    public static final int Int16=56;
    public static final int SubSystems=12;
    public static final int Float32=29;
    public static final int Goal=71;
    public static final int Bool=68;
    public static final int Uint16=50;
    public static final int Boolean=27;
    public static final int Sub=60;
    public static final int Uint8=62;
    public static final int Parameters=11;
    public static final int RULE_ID=98;
    public static final int RULE_DIGIT=87;
    public static final int GlobalNamespace=7;
    public static final int Namespace=13;
    public static final int Int16_1=31;
    public static final int Header=39;
    public static final int RULE_INT=100;
    public static final int Byte=69;
    public static final int RULE_ML_COMMENT=107;
    public static final int LeftSquareBracket=85;
    public static final int Ac=66;
    public static final int Base64=37;
    public static final int Comma=82;
    public static final int As=67;
    public static final int HyphenMinus=83;
    public static final int RULE_MESSAGE_ASIGMENT=101;
    public static final int LeftSquareBracketRightSquareBracket=81;
    public static final int Int32=57;
    public static final int Char=70;
    public static final int RULE_DECINT=90;
    public static final int Uint32=51;
    public static final int RULE_HOUR=95;
    public static final int Int8=72;
    public static final int Default=19;
    public static final int Int8_1=46;
    public static final int Uint16_1=24;
    public static final int Sc=75;
    public static final int Type=78;
    public static final int Float64=30;
    public static final int Int32_1=32;
    public static final int RULE_BINARY=88;
    public static final int String_1=49;
    public static final int String_2=22;
    public static final int Ss=76;
    public static final int RULE_DAY=92;
    public static final int RULE_BEGIN=102;
    public static final int RULE_BOOLEAN=89;
    public static final int RelativeNamespace=4;
    public static final int RULE_YEAR=94;
    public static final int Result=48;
    public static final int Name=73;
    public static final int RULE_MIN_SEC=96;
    public static final int Char_1=45;
    public static final int ParameterAny=8;
    public static final int List=65;
    public static final int RightSquareBracket=86;
    public static final int PrivateNamespace=5;
    public static final int GraphName=15;
    public static final int Byte_1=44;
    public static final int Float64_1=17;
    public static final int Duration=20;
    public static final int Uint32_1=25;
    public static final int Double=38;
    public static final int Type_1=61;
    public static final int Value=63;
    public static final int Uint64=52;
    public static final int FromFile=18;
    public static final int Action=42;
    public static final int RULE_END=103;
    public static final int Message=34;
    public static final int Value_1=53;
    public static final int Time=77;
    public static final int RULE_STRING=99;
    public static final int Bool_1=43;
    public static final int Any=79;
    public static final int Struct=41;
    public static final int RULE_SL_COMMENT=104;
    public static final int Uint8_1=36;
    public static final int RULE_DOUBLE=91;
    public static final int Feedback=21;
    public static final int RULE_ROS_CONVENTION_A=105;
    public static final int RULE_ROS_CONVENTION_PARAM=106;
    public static final int Colon=84;
    public static final int Pub=59;
    public static final int EOF=-1;
    public static final int Ns=80;
    public static final int RULE_WS=108;
    public static final int Int64_1=33;
    public static final int Service=35;
    public static final int VariableValues=6;
    public static final int From=55;
    public static final int RULE_ANY_OTHER=109;
    public static final int Nodes=47;
    public static final int Date=64;
    public static final int Interfaces=10;
    public static final int Threads=23;
    public static final int Integer=28;
    public static final int Array=54;
    public static final int Int64=58;
    public static final int RULE_MONTH=93;

    // delegates
    // delegators


        public InternalVariabilityParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVariabilityParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVariabilityParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVariabilityParser.g"; }



     	private VariabilityGrammarAccess grammarAccess;

        public InternalVariabilityParser(TokenStream input, VariabilityGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "System";
       	}

       	@Override
       	protected VariabilityGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystem"
    // InternalVariabilityParser.g:57:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalVariabilityParser.g:57:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalVariabilityParser.g:58:2: iv_ruleSystem= ruleSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalVariabilityParser.g:64:1: ruleSystem returns [EObject current=null] : this_RosSystem_0= ruleRosSystem ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        EObject this_RosSystem_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:70:2: (this_RosSystem_0= ruleRosSystem )
            // InternalVariabilityParser.g:71:2: this_RosSystem_0= ruleRosSystem
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getSystemAccess().getRosSystemParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_RosSystem_0=ruleRosSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_RosSystem_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleRosSystem"
    // InternalVariabilityParser.g:82:1: entryRuleRosSystem returns [EObject current=null] : iv_ruleRosSystem= ruleRosSystem EOF ;
    public final EObject entryRuleRosSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSystem = null;


        try {
            // InternalVariabilityParser.g:82:50: (iv_ruleRosSystem= ruleRosSystem EOF )
            // InternalVariabilityParser.g:83:2: iv_ruleRosSystem= ruleRosSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosSystem=ruleRosSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosSystem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosSystem"


    // $ANTLR start "ruleRosSystem"
    // InternalVariabilityParser.g:89:1: ruleRosSystem returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN (otherlv_3= FromFile ( (lv_fromFile_4_0= ruleEString ) ) )? ( (otherlv_5= SubSystems this_BEGIN_6= RULE_BEGIN ( (lv_components_7_0= ruleSubSystem ) )* this_END_8= RULE_END ) | (otherlv_9= Processes this_BEGIN_10= RULE_BEGIN ( (lv_processes_11_0= ruleProcess ) )* this_END_12= RULE_END ) | (otherlv_13= Nodes this_BEGIN_14= RULE_BEGIN ( (lv_components_15_0= ruleRosNode ) )* this_END_16= RULE_END ) | (otherlv_17= Parameters this_BEGIN_18= RULE_BEGIN ( (lv_parameter_19_0= ruleParameter ) )* this_END_20= RULE_END ) | (otherlv_21= Connections this_BEGIN_22= RULE_BEGIN ( (lv_connections_23_0= ruleConnection ) )* this_END_24= RULE_END ) )* this_END_25= RULE_END ) ;
    public final EObject ruleRosSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        Token otherlv_9=null;
        Token this_BEGIN_10=null;
        Token this_END_12=null;
        Token otherlv_13=null;
        Token this_BEGIN_14=null;
        Token this_END_16=null;
        Token otherlv_17=null;
        Token this_BEGIN_18=null;
        Token this_END_20=null;
        Token otherlv_21=null;
        Token this_BEGIN_22=null;
        Token this_END_24=null;
        Token this_END_25=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_fromFile_4_0 = null;

        EObject lv_components_7_0 = null;

        EObject lv_processes_11_0 = null;

        EObject lv_components_15_0 = null;

        EObject lv_parameter_19_0 = null;

        EObject lv_connections_23_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:95:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN (otherlv_3= FromFile ( (lv_fromFile_4_0= ruleEString ) ) )? ( (otherlv_5= SubSystems this_BEGIN_6= RULE_BEGIN ( (lv_components_7_0= ruleSubSystem ) )* this_END_8= RULE_END ) | (otherlv_9= Processes this_BEGIN_10= RULE_BEGIN ( (lv_processes_11_0= ruleProcess ) )* this_END_12= RULE_END ) | (otherlv_13= Nodes this_BEGIN_14= RULE_BEGIN ( (lv_components_15_0= ruleRosNode ) )* this_END_16= RULE_END ) | (otherlv_17= Parameters this_BEGIN_18= RULE_BEGIN ( (lv_parameter_19_0= ruleParameter ) )* this_END_20= RULE_END ) | (otherlv_21= Connections this_BEGIN_22= RULE_BEGIN ( (lv_connections_23_0= ruleConnection ) )* this_END_24= RULE_END ) )* this_END_25= RULE_END ) )
            // InternalVariabilityParser.g:96:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN (otherlv_3= FromFile ( (lv_fromFile_4_0= ruleEString ) ) )? ( (otherlv_5= SubSystems this_BEGIN_6= RULE_BEGIN ( (lv_components_7_0= ruleSubSystem ) )* this_END_8= RULE_END ) | (otherlv_9= Processes this_BEGIN_10= RULE_BEGIN ( (lv_processes_11_0= ruleProcess ) )* this_END_12= RULE_END ) | (otherlv_13= Nodes this_BEGIN_14= RULE_BEGIN ( (lv_components_15_0= ruleRosNode ) )* this_END_16= RULE_END ) | (otherlv_17= Parameters this_BEGIN_18= RULE_BEGIN ( (lv_parameter_19_0= ruleParameter ) )* this_END_20= RULE_END ) | (otherlv_21= Connections this_BEGIN_22= RULE_BEGIN ( (lv_connections_23_0= ruleConnection ) )* this_END_24= RULE_END ) )* this_END_25= RULE_END )
            {
            // InternalVariabilityParser.g:96:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN (otherlv_3= FromFile ( (lv_fromFile_4_0= ruleEString ) ) )? ( (otherlv_5= SubSystems this_BEGIN_6= RULE_BEGIN ( (lv_components_7_0= ruleSubSystem ) )* this_END_8= RULE_END ) | (otherlv_9= Processes this_BEGIN_10= RULE_BEGIN ( (lv_processes_11_0= ruleProcess ) )* this_END_12= RULE_END ) | (otherlv_13= Nodes this_BEGIN_14= RULE_BEGIN ( (lv_components_15_0= ruleRosNode ) )* this_END_16= RULE_END ) | (otherlv_17= Parameters this_BEGIN_18= RULE_BEGIN ( (lv_parameter_19_0= ruleParameter ) )* this_END_20= RULE_END ) | (otherlv_21= Connections this_BEGIN_22= RULE_BEGIN ( (lv_connections_23_0= ruleConnection ) )* this_END_24= RULE_END ) )* this_END_25= RULE_END )
            // InternalVariabilityParser.g:97:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN (otherlv_3= FromFile ( (lv_fromFile_4_0= ruleEString ) ) )? ( (otherlv_5= SubSystems this_BEGIN_6= RULE_BEGIN ( (lv_components_7_0= ruleSubSystem ) )* this_END_8= RULE_END ) | (otherlv_9= Processes this_BEGIN_10= RULE_BEGIN ( (lv_processes_11_0= ruleProcess ) )* this_END_12= RULE_END ) | (otherlv_13= Nodes this_BEGIN_14= RULE_BEGIN ( (lv_components_15_0= ruleRosNode ) )* this_END_16= RULE_END ) | (otherlv_17= Parameters this_BEGIN_18= RULE_BEGIN ( (lv_parameter_19_0= ruleParameter ) )* this_END_20= RULE_END ) | (otherlv_21= Connections this_BEGIN_22= RULE_BEGIN ( (lv_connections_23_0= ruleConnection ) )* this_END_24= RULE_END ) )* this_END_25= RULE_END
            {
            // InternalVariabilityParser.g:97:3: ( (lv_name_0_0= ruleEString ) )
            // InternalVariabilityParser.g:98:4: (lv_name_0_0= ruleEString )
            {
            // InternalVariabilityParser.g:98:4: (lv_name_0_0= ruleEString )
            // InternalVariabilityParser.g:99:5: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRosSystemRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"de.fraunhofer.ipa.ros.Basics.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRosSystemAccess().getColonKeyword_1());
              		
            }
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_2, grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_2());
              		
            }
            // InternalVariabilityParser.g:124:3: (otherlv_3= FromFile ( (lv_fromFile_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==FromFile) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalVariabilityParser.g:125:4: otherlv_3= FromFile ( (lv_fromFile_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,FromFile,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getRosSystemAccess().getFromFileKeyword_3_0());
                      			
                    }
                    // InternalVariabilityParser.g:129:4: ( (lv_fromFile_4_0= ruleEString ) )
                    // InternalVariabilityParser.g:130:5: (lv_fromFile_4_0= ruleEString )
                    {
                    // InternalVariabilityParser.g:130:5: (lv_fromFile_4_0= ruleEString )
                    // InternalVariabilityParser.g:131:6: lv_fromFile_4_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRosSystemAccess().getFromFileEStringParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_7);
                    lv_fromFile_4_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRosSystemRule());
                      						}
                      						set(
                      							current,
                      							"fromFile",
                      							lv_fromFile_4_0,
                      							"de.fraunhofer.ipa.ros.Basics.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalVariabilityParser.g:149:3: ( (otherlv_5= SubSystems this_BEGIN_6= RULE_BEGIN ( (lv_components_7_0= ruleSubSystem ) )* this_END_8= RULE_END ) | (otherlv_9= Processes this_BEGIN_10= RULE_BEGIN ( (lv_processes_11_0= ruleProcess ) )* this_END_12= RULE_END ) | (otherlv_13= Nodes this_BEGIN_14= RULE_BEGIN ( (lv_components_15_0= ruleRosNode ) )* this_END_16= RULE_END ) | (otherlv_17= Parameters this_BEGIN_18= RULE_BEGIN ( (lv_parameter_19_0= ruleParameter ) )* this_END_20= RULE_END ) | (otherlv_21= Connections this_BEGIN_22= RULE_BEGIN ( (lv_connections_23_0= ruleConnection ) )* this_END_24= RULE_END ) )*
            loop7:
            do {
                int alt7=6;
                switch ( input.LA(1) ) {
                case SubSystems:
                    {
                    alt7=1;
                    }
                    break;
                case Processes:
                    {
                    alt7=2;
                    }
                    break;
                case Nodes:
                    {
                    alt7=3;
                    }
                    break;
                case Parameters:
                    {
                    alt7=4;
                    }
                    break;
                case Connections:
                    {
                    alt7=5;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // InternalVariabilityParser.g:150:4: (otherlv_5= SubSystems this_BEGIN_6= RULE_BEGIN ( (lv_components_7_0= ruleSubSystem ) )* this_END_8= RULE_END )
            	    {
            	    // InternalVariabilityParser.g:150:4: (otherlv_5= SubSystems this_BEGIN_6= RULE_BEGIN ( (lv_components_7_0= ruleSubSystem ) )* this_END_8= RULE_END )
            	    // InternalVariabilityParser.g:151:5: otherlv_5= SubSystems this_BEGIN_6= RULE_BEGIN ( (lv_components_7_0= ruleSubSystem ) )* this_END_8= RULE_END
            	    {
            	    otherlv_5=(Token)match(input,SubSystems,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getRosSystemAccess().getSubSystemsKeyword_4_0_0());
            	      				
            	    }
            	    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_BEGIN_6, grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_4_0_1());
            	      				
            	    }
            	    // InternalVariabilityParser.g:159:5: ( (lv_components_7_0= ruleSubSystem ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalVariabilityParser.g:160:6: (lv_components_7_0= ruleSubSystem )
            	    	    {
            	    	    // InternalVariabilityParser.g:160:6: (lv_components_7_0= ruleSubSystem )
            	    	    // InternalVariabilityParser.g:161:7: lv_components_7_0= ruleSubSystem
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getRosSystemAccess().getComponentsSubSystemParserRuleCall_4_0_2_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_components_7_0=ruleSubSystem();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"components",
            	    	      								lv_components_7_0,
            	    	      								"de.fraunhofer.ipa.rossystem.RosSystem.SubSystem");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    this_END_8=(Token)match(input,RULE_END,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_END_8, grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_4_0_3());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVariabilityParser.g:184:4: (otherlv_9= Processes this_BEGIN_10= RULE_BEGIN ( (lv_processes_11_0= ruleProcess ) )* this_END_12= RULE_END )
            	    {
            	    // InternalVariabilityParser.g:184:4: (otherlv_9= Processes this_BEGIN_10= RULE_BEGIN ( (lv_processes_11_0= ruleProcess ) )* this_END_12= RULE_END )
            	    // InternalVariabilityParser.g:185:5: otherlv_9= Processes this_BEGIN_10= RULE_BEGIN ( (lv_processes_11_0= ruleProcess ) )* this_END_12= RULE_END
            	    {
            	    otherlv_9=(Token)match(input,Processes,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_9, grammarAccess.getRosSystemAccess().getProcessesKeyword_4_1_0());
            	      				
            	    }
            	    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_BEGIN_10, grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_4_1_1());
            	      				
            	    }
            	    // InternalVariabilityParser.g:193:5: ( (lv_processes_11_0= ruleProcess ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalVariabilityParser.g:194:6: (lv_processes_11_0= ruleProcess )
            	    	    {
            	    	    // InternalVariabilityParser.g:194:6: (lv_processes_11_0= ruleProcess )
            	    	    // InternalVariabilityParser.g:195:7: lv_processes_11_0= ruleProcess
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getRosSystemAccess().getProcessesProcessParserRuleCall_4_1_2_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_processes_11_0=ruleProcess();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"processes",
            	    	      								lv_processes_11_0,
            	    	      								"de.fraunhofer.ipa.rossystem.RosSystem.Process");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    this_END_12=(Token)match(input,RULE_END,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_END_12, grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_4_1_3());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVariabilityParser.g:218:4: (otherlv_13= Nodes this_BEGIN_14= RULE_BEGIN ( (lv_components_15_0= ruleRosNode ) )* this_END_16= RULE_END )
            	    {
            	    // InternalVariabilityParser.g:218:4: (otherlv_13= Nodes this_BEGIN_14= RULE_BEGIN ( (lv_components_15_0= ruleRosNode ) )* this_END_16= RULE_END )
            	    // InternalVariabilityParser.g:219:5: otherlv_13= Nodes this_BEGIN_14= RULE_BEGIN ( (lv_components_15_0= ruleRosNode ) )* this_END_16= RULE_END
            	    {
            	    otherlv_13=(Token)match(input,Nodes,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_13, grammarAccess.getRosSystemAccess().getNodesKeyword_4_2_0());
            	      				
            	    }
            	    this_BEGIN_14=(Token)match(input,RULE_BEGIN,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_BEGIN_14, grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_4_2_1());
            	      				
            	    }
            	    // InternalVariabilityParser.g:227:5: ( (lv_components_15_0= ruleRosNode ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalVariabilityParser.g:228:6: (lv_components_15_0= ruleRosNode )
            	    	    {
            	    	    // InternalVariabilityParser.g:228:6: (lv_components_15_0= ruleRosNode )
            	    	    // InternalVariabilityParser.g:229:7: lv_components_15_0= ruleRosNode
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getRosSystemAccess().getComponentsRosNodeParserRuleCall_4_2_2_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_components_15_0=ruleRosNode();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"components",
            	    	      								lv_components_15_0,
            	    	      								"de.fraunhofer.ipa.rossystem.RosSystem.RosNode");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    this_END_16=(Token)match(input,RULE_END,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_END_16, grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_4_2_3());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVariabilityParser.g:252:4: (otherlv_17= Parameters this_BEGIN_18= RULE_BEGIN ( (lv_parameter_19_0= ruleParameter ) )* this_END_20= RULE_END )
            	    {
            	    // InternalVariabilityParser.g:252:4: (otherlv_17= Parameters this_BEGIN_18= RULE_BEGIN ( (lv_parameter_19_0= ruleParameter ) )* this_END_20= RULE_END )
            	    // InternalVariabilityParser.g:253:5: otherlv_17= Parameters this_BEGIN_18= RULE_BEGIN ( (lv_parameter_19_0= ruleParameter ) )* this_END_20= RULE_END
            	    {
            	    otherlv_17=(Token)match(input,Parameters,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_17, grammarAccess.getRosSystemAccess().getParametersKeyword_4_3_0());
            	      				
            	    }
            	    this_BEGIN_18=(Token)match(input,RULE_BEGIN,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_BEGIN_18, grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_4_3_1());
            	      				
            	    }
            	    // InternalVariabilityParser.g:261:5: ( (lv_parameter_19_0= ruleParameter ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalVariabilityParser.g:262:6: (lv_parameter_19_0= ruleParameter )
            	    	    {
            	    	    // InternalVariabilityParser.g:262:6: (lv_parameter_19_0= ruleParameter )
            	    	    // InternalVariabilityParser.g:263:7: lv_parameter_19_0= ruleParameter
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getRosSystemAccess().getParameterParameterParserRuleCall_4_3_2_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_parameter_19_0=ruleParameter();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"parameter",
            	    	      								lv_parameter_19_0,
            	    	      								"de.fraunhofer.ipa.ros.Basics.Parameter");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    this_END_20=(Token)match(input,RULE_END,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_END_20, grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_4_3_3());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalVariabilityParser.g:286:4: (otherlv_21= Connections this_BEGIN_22= RULE_BEGIN ( (lv_connections_23_0= ruleConnection ) )* this_END_24= RULE_END )
            	    {
            	    // InternalVariabilityParser.g:286:4: (otherlv_21= Connections this_BEGIN_22= RULE_BEGIN ( (lv_connections_23_0= ruleConnection ) )* this_END_24= RULE_END )
            	    // InternalVariabilityParser.g:287:5: otherlv_21= Connections this_BEGIN_22= RULE_BEGIN ( (lv_connections_23_0= ruleConnection ) )* this_END_24= RULE_END
            	    {
            	    otherlv_21=(Token)match(input,Connections,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_21, grammarAccess.getRosSystemAccess().getConnectionsKeyword_4_4_0());
            	      				
            	    }
            	    this_BEGIN_22=(Token)match(input,RULE_BEGIN,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_BEGIN_22, grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_4_4_1());
            	      				
            	    }
            	    // InternalVariabilityParser.g:295:5: ( (lv_connections_23_0= ruleConnection ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==HyphenMinus) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalVariabilityParser.g:296:6: (lv_connections_23_0= ruleConnection )
            	    	    {
            	    	    // InternalVariabilityParser.g:296:6: (lv_connections_23_0= ruleConnection )
            	    	    // InternalVariabilityParser.g:297:7: lv_connections_23_0= ruleConnection
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getRosSystemAccess().getConnectionsConnectionParserRuleCall_4_4_2_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_connections_23_0=ruleConnection();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"connections",
            	    	      								lv_connections_23_0,
            	    	      								"de.fraunhofer.ipa.rossystem.RosSystem.Connection");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    this_END_24=(Token)match(input,RULE_END,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_END_24, grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_4_4_3());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_END_25=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_25, grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosSystem"


    // $ANTLR start "entryRuleRosParameter"
    // InternalVariabilityParser.g:328:1: entryRuleRosParameter returns [EObject current=null] : iv_ruleRosParameter= ruleRosParameter EOF ;
    public final EObject entryRuleRosParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosParameter = null;


        try {
            // InternalVariabilityParser.g:328:53: (iv_ruleRosParameter= ruleRosParameter EOF )
            // InternalVariabilityParser.g:329:2: iv_ruleRosParameter= ruleRosParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosParameter=ruleRosParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosParameter"


    // $ANTLR start "ruleRosParameter"
    // InternalVariabilityParser.g:335:1: ruleRosParameter returns [EObject current=null] : (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( ( ruleEString ) ) this_BEGIN_4= RULE_BEGIN otherlv_5= VariableValues (otherlv_6= LeftSquareBracket ( (lv_value_7_0= ruleParameterValue ) ) (otherlv_8= Comma ( (lv_value_9_0= ruleParameterValue ) ) )* otherlv_10= RightSquareBracket )? this_END_11= RULE_END ) ;
    public final EObject ruleRosParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_END_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_7_0 = null;

        EObject lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:341:2: ( (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( ( ruleEString ) ) this_BEGIN_4= RULE_BEGIN otherlv_5= VariableValues (otherlv_6= LeftSquareBracket ( (lv_value_7_0= ruleParameterValue ) ) (otherlv_8= Comma ( (lv_value_9_0= ruleParameterValue ) ) )* otherlv_10= RightSquareBracket )? this_END_11= RULE_END ) )
            // InternalVariabilityParser.g:342:2: (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( ( ruleEString ) ) this_BEGIN_4= RULE_BEGIN otherlv_5= VariableValues (otherlv_6= LeftSquareBracket ( (lv_value_7_0= ruleParameterValue ) ) (otherlv_8= Comma ( (lv_value_9_0= ruleParameterValue ) ) )* otherlv_10= RightSquareBracket )? this_END_11= RULE_END )
            {
            // InternalVariabilityParser.g:342:2: (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( ( ruleEString ) ) this_BEGIN_4= RULE_BEGIN otherlv_5= VariableValues (otherlv_6= LeftSquareBracket ( (lv_value_7_0= ruleParameterValue ) ) (otherlv_8= Comma ( (lv_value_9_0= ruleParameterValue ) ) )* otherlv_10= RightSquareBracket )? this_END_11= RULE_END )
            // InternalVariabilityParser.g:343:3: otherlv_0= HyphenMinus ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( ( ruleEString ) ) this_BEGIN_4= RULE_BEGIN otherlv_5= VariableValues (otherlv_6= LeftSquareBracket ( (lv_value_7_0= ruleParameterValue ) ) (otherlv_8= Comma ( (lv_value_9_0= ruleParameterValue ) ) )* otherlv_10= RightSquareBracket )? this_END_11= RULE_END
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosParameterAccess().getHyphenMinusKeyword_0());
              		
            }
            // InternalVariabilityParser.g:347:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVariabilityParser.g:348:4: (lv_name_1_0= ruleEString )
            {
            // InternalVariabilityParser.g:348:4: (lv_name_1_0= ruleEString )
            // InternalVariabilityParser.g:349:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosParameterAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRosParameterRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.fraunhofer.ipa.ros.Basics.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRosParameterAccess().getColonKeyword_2());
              		
            }
            // InternalVariabilityParser.g:370:3: ( ( ruleEString ) )
            // InternalVariabilityParser.g:371:4: ( ruleEString )
            {
            // InternalVariabilityParser.g:371:4: ( ruleEString )
            // InternalVariabilityParser.g:372:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosParameterRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosParameterAccess().getFromParameterCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_4, grammarAccess.getRosParameterAccess().getBEGINTerminalRuleCall_4());
              		
            }
            otherlv_5=(Token)match(input,VariableValues,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRosParameterAccess().getVariableValuesKeyword_5());
              		
            }
            // InternalVariabilityParser.g:394:3: (otherlv_6= LeftSquareBracket ( (lv_value_7_0= ruleParameterValue ) ) (otherlv_8= Comma ( (lv_value_9_0= ruleParameterValue ) ) )* otherlv_10= RightSquareBracket )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LeftSquareBracket) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVariabilityParser.g:395:4: otherlv_6= LeftSquareBracket ( (lv_value_7_0= ruleParameterValue ) ) (otherlv_8= Comma ( (lv_value_9_0= ruleParameterValue ) ) )* otherlv_10= RightSquareBracket
                    {
                    otherlv_6=(Token)match(input,LeftSquareBracket,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getRosParameterAccess().getLeftSquareBracketKeyword_6_0());
                      			
                    }
                    // InternalVariabilityParser.g:399:4: ( (lv_value_7_0= ruleParameterValue ) )
                    // InternalVariabilityParser.g:400:5: (lv_value_7_0= ruleParameterValue )
                    {
                    // InternalVariabilityParser.g:400:5: (lv_value_7_0= ruleParameterValue )
                    // InternalVariabilityParser.g:401:6: lv_value_7_0= ruleParameterValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_value_7_0=ruleParameterValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRosParameterRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_7_0,
                      							"de.fraunhofer.ipa.ros.Basics.ParameterValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalVariabilityParser.g:418:4: (otherlv_8= Comma ( (lv_value_9_0= ruleParameterValue ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==Comma) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalVariabilityParser.g:419:5: otherlv_8= Comma ( (lv_value_9_0= ruleParameterValue ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Comma,FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getRosParameterAccess().getCommaKeyword_6_2_0());
                    	      				
                    	    }
                    	    // InternalVariabilityParser.g:423:5: ( (lv_value_9_0= ruleParameterValue ) )
                    	    // InternalVariabilityParser.g:424:6: (lv_value_9_0= ruleParameterValue )
                    	    {
                    	    // InternalVariabilityParser.g:424:6: (lv_value_9_0= ruleParameterValue )
                    	    // InternalVariabilityParser.g:425:7: lv_value_9_0= ruleParameterValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_6_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_value_9_0=ruleParameterValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRosParameterRule());
                    	      							}
                    	      							set(
                    	      								current,
                    	      								"value",
                    	      								lv_value_9_0,
                    	      								"de.fraunhofer.ipa.ros.Basics.ParameterValue");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,RightSquareBracket,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getRosParameterAccess().getRightSquareBracketKeyword_6_3());
                      			
                    }

                    }
                    break;

            }

            this_END_11=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_11, grammarAccess.getRosParameterAccess().getENDTerminalRuleCall_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosParameter"


    // $ANTLR start "entryRuleSubSystem"
    // InternalVariabilityParser.g:456:1: entryRuleSubSystem returns [EObject current=null] : iv_ruleSubSystem= ruleSubSystem EOF ;
    public final EObject entryRuleSubSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSystem = null;


        try {
            // InternalVariabilityParser.g:456:50: (iv_ruleSubSystem= ruleSubSystem EOF )
            // InternalVariabilityParser.g:457:2: iv_ruleSubSystem= ruleSubSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubSystem=ruleSubSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubSystem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubSystem"


    // $ANTLR start "ruleSubSystem"
    // InternalVariabilityParser.g:463:1: ruleSubSystem returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleSubSystem() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:469:2: ( ( ( ruleEString ) ) )
            // InternalVariabilityParser.g:470:2: ( ( ruleEString ) )
            {
            // InternalVariabilityParser.g:470:2: ( ( ruleEString ) )
            // InternalVariabilityParser.g:471:3: ( ruleEString )
            {
            // InternalVariabilityParser.g:471:3: ( ruleEString )
            // InternalVariabilityParser.g:472:4: ruleEString
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSubSystemRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSubSystemAccess().getSystemSystemCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubSystem"


    // $ANTLR start "entryRuleProcess"
    // InternalVariabilityParser.g:489:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalVariabilityParser.g:489:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalVariabilityParser.g:490:2: iv_ruleProcess= ruleProcess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcessRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcess; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalVariabilityParser.g:496:1: ruleProcess returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket )? (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) )? this_END_12= RULE_END ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token this_END_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_threads_11_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:502:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket )? (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) )? this_END_12= RULE_END ) )
            // InternalVariabilityParser.g:503:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket )? (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) )? this_END_12= RULE_END )
            {
            // InternalVariabilityParser.g:503:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket )? (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) )? this_END_12= RULE_END )
            // InternalVariabilityParser.g:504:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket )? (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) )? this_END_12= RULE_END
            {
            // InternalVariabilityParser.g:504:3: ()
            // InternalVariabilityParser.g:505:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProcessAccess().getProcessAction_0(),
              					current);
              			
            }

            }

            // InternalVariabilityParser.g:511:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVariabilityParser.g:512:4: (lv_name_1_0= ruleEString )
            {
            // InternalVariabilityParser.g:512:4: (lv_name_1_0= ruleEString )
            // InternalVariabilityParser.g:513:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProcessRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.fraunhofer.ipa.ros.Basics.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getColonKeyword_2());
              		
            }
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_3, grammarAccess.getProcessAccess().getBEGINTerminalRuleCall_3());
              		
            }
            // InternalVariabilityParser.g:538:3: (otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Nodes) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVariabilityParser.g:539:4: otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket
                    {
                    otherlv_4=(Token)match(input,Nodes,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getNodesKeyword_4_0());
                      			
                    }
                    otherlv_5=(Token)match(input,LeftSquareBracket,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_4_1());
                      			
                    }
                    // InternalVariabilityParser.g:547:4: ( ( ruleEString ) )
                    // InternalVariabilityParser.g:548:5: ( ruleEString )
                    {
                    // InternalVariabilityParser.g:548:5: ( ruleEString )
                    // InternalVariabilityParser.g:549:6: ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getProcessRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcessAccess().getComponentsRosNodeCrossReference_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalVariabilityParser.g:563:4: (otherlv_7= Comma ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==Comma) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalVariabilityParser.g:564:5: otherlv_7= Comma ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,Comma,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getProcessAccess().getCommaKeyword_4_3_0());
                    	      				
                    	    }
                    	    // InternalVariabilityParser.g:568:5: ( ( ruleEString ) )
                    	    // InternalVariabilityParser.g:569:6: ( ruleEString )
                    	    {
                    	    // InternalVariabilityParser.g:569:6: ( ruleEString )
                    	    // InternalVariabilityParser.g:570:7: ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getProcessRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getProcessAccess().getComponentsRosNodeCrossReference_4_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,RightSquareBracket,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getProcessAccess().getRightSquareBracketKeyword_4_4());
                      			
                    }

                    }
                    break;

            }

            // InternalVariabilityParser.g:590:3: (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Threads) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVariabilityParser.g:591:4: otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) )
                    {
                    otherlv_10=(Token)match(input,Threads,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getProcessAccess().getThreadsKeyword_5_0());
                      			
                    }
                    // InternalVariabilityParser.g:595:4: ( (lv_threads_11_0= ruleInteger0 ) )
                    // InternalVariabilityParser.g:596:5: (lv_threads_11_0= ruleInteger0 )
                    {
                    // InternalVariabilityParser.g:596:5: (lv_threads_11_0= ruleInteger0 )
                    // InternalVariabilityParser.g:597:6: lv_threads_11_0= ruleInteger0
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcessAccess().getThreadsInteger0ParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_threads_11_0=ruleInteger0();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProcessRule());
                      						}
                      						set(
                      							current,
                      							"threads",
                      							lv_threads_11_0,
                      							"de.fraunhofer.ipa.ros.Basics.Integer0");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            this_END_12=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_12, grammarAccess.getProcessAccess().getENDTerminalRuleCall_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleRosNode"
    // InternalVariabilityParser.g:623:1: entryRuleRosNode returns [EObject current=null] : iv_ruleRosNode= ruleRosNode EOF ;
    public final EObject entryRuleRosNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosNode = null;


        try {
            // InternalVariabilityParser.g:623:48: (iv_ruleRosNode= ruleRosNode EOF )
            // InternalVariabilityParser.g:624:2: iv_ruleRosNode= ruleRosNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosNode=ruleRosNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosNode; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosNode"


    // $ANTLR start "ruleRosNode"
    // InternalVariabilityParser.g:630:1: ruleRosNode returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= From ( ( ruleEString ) ) (otherlv_6= Namespace ( (lv_namespace_7_0= ruleEString ) ) )? (otherlv_8= Interfaces this_BEGIN_9= RULE_BEGIN ( (lv_rosinterfaces_10_0= ruleRosInterface ) )* this_END_11= RULE_END )? (otherlv_12= Parameters this_BEGIN_13= RULE_BEGIN ( (lv_rosparameters_14_0= ruleRosParameter ) )* this_END_15= RULE_END )? this_END_16= RULE_END ) ;
    public final EObject ruleRosNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_BEGIN_9=null;
        Token this_END_11=null;
        Token otherlv_12=null;
        Token this_BEGIN_13=null;
        Token this_END_15=null;
        Token this_END_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_namespace_7_0 = null;

        EObject lv_rosinterfaces_10_0 = null;

        EObject lv_rosparameters_14_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:636:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= From ( ( ruleEString ) ) (otherlv_6= Namespace ( (lv_namespace_7_0= ruleEString ) ) )? (otherlv_8= Interfaces this_BEGIN_9= RULE_BEGIN ( (lv_rosinterfaces_10_0= ruleRosInterface ) )* this_END_11= RULE_END )? (otherlv_12= Parameters this_BEGIN_13= RULE_BEGIN ( (lv_rosparameters_14_0= ruleRosParameter ) )* this_END_15= RULE_END )? this_END_16= RULE_END ) )
            // InternalVariabilityParser.g:637:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= From ( ( ruleEString ) ) (otherlv_6= Namespace ( (lv_namespace_7_0= ruleEString ) ) )? (otherlv_8= Interfaces this_BEGIN_9= RULE_BEGIN ( (lv_rosinterfaces_10_0= ruleRosInterface ) )* this_END_11= RULE_END )? (otherlv_12= Parameters this_BEGIN_13= RULE_BEGIN ( (lv_rosparameters_14_0= ruleRosParameter ) )* this_END_15= RULE_END )? this_END_16= RULE_END )
            {
            // InternalVariabilityParser.g:637:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= From ( ( ruleEString ) ) (otherlv_6= Namespace ( (lv_namespace_7_0= ruleEString ) ) )? (otherlv_8= Interfaces this_BEGIN_9= RULE_BEGIN ( (lv_rosinterfaces_10_0= ruleRosInterface ) )* this_END_11= RULE_END )? (otherlv_12= Parameters this_BEGIN_13= RULE_BEGIN ( (lv_rosparameters_14_0= ruleRosParameter ) )* this_END_15= RULE_END )? this_END_16= RULE_END )
            // InternalVariabilityParser.g:638:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= From ( ( ruleEString ) ) (otherlv_6= Namespace ( (lv_namespace_7_0= ruleEString ) ) )? (otherlv_8= Interfaces this_BEGIN_9= RULE_BEGIN ( (lv_rosinterfaces_10_0= ruleRosInterface ) )* this_END_11= RULE_END )? (otherlv_12= Parameters this_BEGIN_13= RULE_BEGIN ( (lv_rosparameters_14_0= ruleRosParameter ) )* this_END_15= RULE_END )? this_END_16= RULE_END
            {
            // InternalVariabilityParser.g:638:3: ()
            // InternalVariabilityParser.g:639:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRosNodeAccess().getRosNodeAction_0(),
              					current);
              			
            }

            }

            // InternalVariabilityParser.g:645:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVariabilityParser.g:646:4: (lv_name_1_0= ruleEString )
            {
            // InternalVariabilityParser.g:646:4: (lv_name_1_0= ruleEString )
            // InternalVariabilityParser.g:647:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosNodeAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRosNodeRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.fraunhofer.ipa.ros.Basics.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRosNodeAccess().getColonKeyword_2());
              		
            }
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_3, grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_3());
              		
            }
            otherlv_4=(Token)match(input,From,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRosNodeAccess().getFromKeyword_4());
              		
            }
            // InternalVariabilityParser.g:676:3: ( ( ruleEString ) )
            // InternalVariabilityParser.g:677:4: ( ruleEString )
            {
            // InternalVariabilityParser.g:677:4: ( ruleEString )
            // InternalVariabilityParser.g:678:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosNodeRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosNodeAccess().getFromNodeCrossReference_5_0());
              				
            }
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalVariabilityParser.g:692:3: (otherlv_6= Namespace ( (lv_namespace_7_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Namespace) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVariabilityParser.g:693:4: otherlv_6= Namespace ( (lv_namespace_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,Namespace,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getRosNodeAccess().getNamespaceKeyword_6_0());
                      			
                    }
                    // InternalVariabilityParser.g:697:4: ( (lv_namespace_7_0= ruleEString ) )
                    // InternalVariabilityParser.g:698:5: (lv_namespace_7_0= ruleEString )
                    {
                    // InternalVariabilityParser.g:698:5: (lv_namespace_7_0= ruleEString )
                    // InternalVariabilityParser.g:699:6: lv_namespace_7_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRosNodeAccess().getNamespaceEStringParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_namespace_7_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRosNodeRule());
                      						}
                      						set(
                      							current,
                      							"namespace",
                      							lv_namespace_7_0,
                      							"de.fraunhofer.ipa.ros.Basics.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalVariabilityParser.g:717:3: (otherlv_8= Interfaces this_BEGIN_9= RULE_BEGIN ( (lv_rosinterfaces_10_0= ruleRosInterface ) )* this_END_11= RULE_END )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Interfaces) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVariabilityParser.g:718:4: otherlv_8= Interfaces this_BEGIN_9= RULE_BEGIN ( (lv_rosinterfaces_10_0= ruleRosInterface ) )* this_END_11= RULE_END
                    {
                    otherlv_8=(Token)match(input,Interfaces,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getRosNodeAccess().getInterfacesKeyword_7_0());
                      			
                    }
                    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_9, grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_7_1());
                      			
                    }
                    // InternalVariabilityParser.g:726:4: ( (lv_rosinterfaces_10_0= ruleRosInterface ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==HyphenMinus) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalVariabilityParser.g:727:5: (lv_rosinterfaces_10_0= ruleRosInterface )
                    	    {
                    	    // InternalVariabilityParser.g:727:5: (lv_rosinterfaces_10_0= ruleRosInterface )
                    	    // InternalVariabilityParser.g:728:6: lv_rosinterfaces_10_0= ruleRosInterface
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getRosNodeAccess().getRosinterfacesRosInterfaceParserRuleCall_7_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_rosinterfaces_10_0=ruleRosInterface();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getRosNodeRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"rosinterfaces",
                    	      							lv_rosinterfaces_10_0,
                    	      							"de.fraunhofer.ipa.rossystem.RosSystem.RosInterface");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    this_END_11=(Token)match(input,RULE_END,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_11, grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_7_3());
                      			
                    }

                    }
                    break;

            }

            // InternalVariabilityParser.g:750:3: (otherlv_12= Parameters this_BEGIN_13= RULE_BEGIN ( (lv_rosparameters_14_0= ruleRosParameter ) )* this_END_15= RULE_END )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Parameters) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVariabilityParser.g:751:4: otherlv_12= Parameters this_BEGIN_13= RULE_BEGIN ( (lv_rosparameters_14_0= ruleRosParameter ) )* this_END_15= RULE_END
                    {
                    otherlv_12=(Token)match(input,Parameters,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getRosNodeAccess().getParametersKeyword_8_0());
                      			
                    }
                    this_BEGIN_13=(Token)match(input,RULE_BEGIN,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_13, grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_8_1());
                      			
                    }
                    // InternalVariabilityParser.g:759:4: ( (lv_rosparameters_14_0= ruleRosParameter ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==HyphenMinus) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalVariabilityParser.g:760:5: (lv_rosparameters_14_0= ruleRosParameter )
                    	    {
                    	    // InternalVariabilityParser.g:760:5: (lv_rosparameters_14_0= ruleRosParameter )
                    	    // InternalVariabilityParser.g:761:6: lv_rosparameters_14_0= ruleRosParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getRosNodeAccess().getRosparametersRosParameterParserRuleCall_8_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_rosparameters_14_0=ruleRosParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getRosNodeRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"rosparameters",
                    	      							lv_rosparameters_14_0,
                    	      							"eu.coresense.variability.Variability.RosParameter");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    this_END_15=(Token)match(input,RULE_END,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_15, grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_8_3());
                      			
                    }

                    }
                    break;

            }

            this_END_16=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_16, grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosNode"


    // $ANTLR start "entryRuleRosInterface"
    // InternalVariabilityParser.g:791:1: entryRuleRosInterface returns [EObject current=null] : iv_ruleRosInterface= ruleRosInterface EOF ;
    public final EObject entryRuleRosInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosInterface = null;


        try {
            // InternalVariabilityParser.g:791:53: (iv_ruleRosInterface= ruleRosInterface EOF )
            // InternalVariabilityParser.g:792:2: iv_ruleRosInterface= ruleRosInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosInterfaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosInterface=ruleRosInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosInterface; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosInterface"


    // $ANTLR start "ruleRosInterface"
    // InternalVariabilityParser.g:798:1: ruleRosInterface returns [EObject current=null] : (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_reference_3_0= ruleInterfaceReference ) ) ) ;
    public final EObject ruleRosInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_reference_3_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:804:2: ( (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_reference_3_0= ruleInterfaceReference ) ) ) )
            // InternalVariabilityParser.g:805:2: (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_reference_3_0= ruleInterfaceReference ) ) )
            {
            // InternalVariabilityParser.g:805:2: (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_reference_3_0= ruleInterfaceReference ) ) )
            // InternalVariabilityParser.g:806:3: otherlv_0= HyphenMinus ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_reference_3_0= ruleInterfaceReference ) )
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosInterfaceAccess().getHyphenMinusKeyword_0());
              		
            }
            // InternalVariabilityParser.g:810:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVariabilityParser.g:811:4: (lv_name_1_0= ruleEString )
            {
            // InternalVariabilityParser.g:811:4: (lv_name_1_0= ruleEString )
            // InternalVariabilityParser.g:812:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosInterfaceAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRosInterfaceRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.fraunhofer.ipa.ros.Basics.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRosInterfaceAccess().getColonKeyword_2());
              		
            }
            // InternalVariabilityParser.g:833:3: ( (lv_reference_3_0= ruleInterfaceReference ) )
            // InternalVariabilityParser.g:834:4: (lv_reference_3_0= ruleInterfaceReference )
            {
            // InternalVariabilityParser.g:834:4: (lv_reference_3_0= ruleInterfaceReference )
            // InternalVariabilityParser.g:835:5: lv_reference_3_0= ruleInterfaceReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosInterfaceAccess().getReferenceInterfaceReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_reference_3_0=ruleInterfaceReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRosInterfaceRule());
              					}
              					set(
              						current,
              						"reference",
              						lv_reference_3_0,
              						"de.fraunhofer.ipa.rossystem.RosSystem.InterfaceReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosInterface"


    // $ANTLR start "entryRuleInterfaceReference"
    // InternalVariabilityParser.g:856:1: entryRuleInterfaceReference returns [EObject current=null] : iv_ruleInterfaceReference= ruleInterfaceReference EOF ;
    public final EObject entryRuleInterfaceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceReference = null;


        try {
            // InternalVariabilityParser.g:856:59: (iv_ruleInterfaceReference= ruleInterfaceReference EOF )
            // InternalVariabilityParser.g:857:2: iv_ruleInterfaceReference= ruleInterfaceReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceReference=ruleInterfaceReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceReference"


    // $ANTLR start "ruleInterfaceReference"
    // InternalVariabilityParser.g:863:1: ruleInterfaceReference returns [EObject current=null] : (this_RosPublisherReference_0= ruleRosPublisherReference | this_RosSubscriberReference_1= ruleRosSubscriberReference | this_RosServiceServerReference_2= ruleRosServiceServerReference | this_RosServerClientReference_3= ruleRosServerClientReference | this_RosActionServerReference_4= ruleRosActionServerReference | this_RosActionClientReference_5= ruleRosActionClientReference ) ;
    public final EObject ruleInterfaceReference() throws RecognitionException {
        EObject current = null;

        EObject this_RosPublisherReference_0 = null;

        EObject this_RosSubscriberReference_1 = null;

        EObject this_RosServiceServerReference_2 = null;

        EObject this_RosServerClientReference_3 = null;

        EObject this_RosActionServerReference_4 = null;

        EObject this_RosActionClientReference_5 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:869:2: ( (this_RosPublisherReference_0= ruleRosPublisherReference | this_RosSubscriberReference_1= ruleRosSubscriberReference | this_RosServiceServerReference_2= ruleRosServiceServerReference | this_RosServerClientReference_3= ruleRosServerClientReference | this_RosActionServerReference_4= ruleRosActionServerReference | this_RosActionClientReference_5= ruleRosActionClientReference ) )
            // InternalVariabilityParser.g:870:2: (this_RosPublisherReference_0= ruleRosPublisherReference | this_RosSubscriberReference_1= ruleRosSubscriberReference | this_RosServiceServerReference_2= ruleRosServiceServerReference | this_RosServerClientReference_3= ruleRosServerClientReference | this_RosActionServerReference_4= ruleRosActionServerReference | this_RosActionClientReference_5= ruleRosActionClientReference )
            {
            // InternalVariabilityParser.g:870:2: (this_RosPublisherReference_0= ruleRosPublisherReference | this_RosSubscriberReference_1= ruleRosSubscriberReference | this_RosServiceServerReference_2= ruleRosServiceServerReference | this_RosServerClientReference_3= ruleRosServerClientReference | this_RosActionServerReference_4= ruleRosActionServerReference | this_RosActionClientReference_5= ruleRosActionClientReference )
            int alt18=6;
            switch ( input.LA(1) ) {
            case Pub:
                {
                alt18=1;
                }
                break;
            case Sub:
                {
                alt18=2;
                }
                break;
            case Ss:
                {
                alt18=3;
                }
                break;
            case Sc:
                {
                alt18=4;
                }
                break;
            case As:
                {
                alt18=5;
                }
                break;
            case Ac:
                {
                alt18=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalVariabilityParser.g:871:3: this_RosPublisherReference_0= ruleRosPublisherReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosPublisherReferenceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RosPublisherReference_0=ruleRosPublisherReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RosPublisherReference_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVariabilityParser.g:880:3: this_RosSubscriberReference_1= ruleRosSubscriberReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosSubscriberReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RosSubscriberReference_1=ruleRosSubscriberReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RosSubscriberReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVariabilityParser.g:889:3: this_RosServiceServerReference_2= ruleRosServiceServerReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosServiceServerReferenceParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RosServiceServerReference_2=ruleRosServiceServerReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RosServiceServerReference_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVariabilityParser.g:898:3: this_RosServerClientReference_3= ruleRosServerClientReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosServerClientReferenceParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RosServerClientReference_3=ruleRosServerClientReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RosServerClientReference_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalVariabilityParser.g:907:3: this_RosActionServerReference_4= ruleRosActionServerReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosActionServerReferenceParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RosActionServerReference_4=ruleRosActionServerReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RosActionServerReference_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalVariabilityParser.g:916:3: this_RosActionClientReference_5= ruleRosActionClientReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosActionClientReferenceParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RosActionClientReference_5=ruleRosActionClientReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RosActionClientReference_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceReference"


    // $ANTLR start "entryRuleRosPublisherReference"
    // InternalVariabilityParser.g:928:1: entryRuleRosPublisherReference returns [EObject current=null] : iv_ruleRosPublisherReference= ruleRosPublisherReference EOF ;
    public final EObject entryRuleRosPublisherReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosPublisherReference = null;


        try {
            // InternalVariabilityParser.g:928:62: (iv_ruleRosPublisherReference= ruleRosPublisherReference EOF )
            // InternalVariabilityParser.g:929:2: iv_ruleRosPublisherReference= ruleRosPublisherReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosPublisherReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosPublisherReference=ruleRosPublisherReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosPublisherReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosPublisherReference"


    // $ANTLR start "ruleRosPublisherReference"
    // InternalVariabilityParser.g:935:1: ruleRosPublisherReference returns [EObject current=null] : (otherlv_0= Pub () ( ( ruleEString ) ) ) ;
    public final EObject ruleRosPublisherReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:941:2: ( (otherlv_0= Pub () ( ( ruleEString ) ) ) )
            // InternalVariabilityParser.g:942:2: (otherlv_0= Pub () ( ( ruleEString ) ) )
            {
            // InternalVariabilityParser.g:942:2: (otherlv_0= Pub () ( ( ruleEString ) ) )
            // InternalVariabilityParser.g:943:3: otherlv_0= Pub () ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,Pub,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosPublisherReferenceAccess().getPubKeyword_0());
              		
            }
            // InternalVariabilityParser.g:947:3: ()
            // InternalVariabilityParser.g:948:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRosPublisherReferenceAccess().getRosPublisherReferenceAction_1(),
              					current);
              			
            }

            }

            // InternalVariabilityParser.g:954:3: ( ( ruleEString ) )
            // InternalVariabilityParser.g:955:4: ( ruleEString )
            {
            // InternalVariabilityParser.g:955:4: ( ruleEString )
            // InternalVariabilityParser.g:956:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosPublisherReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosPublisherReferenceAccess().getFromPublisherCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosPublisherReference"


    // $ANTLR start "entryRuleRosSubscriberReference"
    // InternalVariabilityParser.g:974:1: entryRuleRosSubscriberReference returns [EObject current=null] : iv_ruleRosSubscriberReference= ruleRosSubscriberReference EOF ;
    public final EObject entryRuleRosSubscriberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSubscriberReference = null;


        try {
            // InternalVariabilityParser.g:974:63: (iv_ruleRosSubscriberReference= ruleRosSubscriberReference EOF )
            // InternalVariabilityParser.g:975:2: iv_ruleRosSubscriberReference= ruleRosSubscriberReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosSubscriberReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosSubscriberReference=ruleRosSubscriberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosSubscriberReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosSubscriberReference"


    // $ANTLR start "ruleRosSubscriberReference"
    // InternalVariabilityParser.g:981:1: ruleRosSubscriberReference returns [EObject current=null] : (otherlv_0= Sub () ( ( ruleEString ) ) ) ;
    public final EObject ruleRosSubscriberReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:987:2: ( (otherlv_0= Sub () ( ( ruleEString ) ) ) )
            // InternalVariabilityParser.g:988:2: (otherlv_0= Sub () ( ( ruleEString ) ) )
            {
            // InternalVariabilityParser.g:988:2: (otherlv_0= Sub () ( ( ruleEString ) ) )
            // InternalVariabilityParser.g:989:3: otherlv_0= Sub () ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,Sub,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosSubscriberReferenceAccess().getSubKeyword_0());
              		
            }
            // InternalVariabilityParser.g:993:3: ()
            // InternalVariabilityParser.g:994:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRosSubscriberReferenceAccess().getRosSubscriberReferenceAction_1(),
              					current);
              			
            }

            }

            // InternalVariabilityParser.g:1000:3: ( ( ruleEString ) )
            // InternalVariabilityParser.g:1001:4: ( ruleEString )
            {
            // InternalVariabilityParser.g:1001:4: ( ruleEString )
            // InternalVariabilityParser.g:1002:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosSubscriberReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosSubscriberReferenceAccess().getFromSubscriberCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosSubscriberReference"


    // $ANTLR start "entryRuleRosServiceServerReference"
    // InternalVariabilityParser.g:1020:1: entryRuleRosServiceServerReference returns [EObject current=null] : iv_ruleRosServiceServerReference= ruleRosServiceServerReference EOF ;
    public final EObject entryRuleRosServiceServerReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceServerReference = null;


        try {
            // InternalVariabilityParser.g:1020:66: (iv_ruleRosServiceServerReference= ruleRosServiceServerReference EOF )
            // InternalVariabilityParser.g:1021:2: iv_ruleRosServiceServerReference= ruleRosServiceServerReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosServiceServerReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosServiceServerReference=ruleRosServiceServerReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosServiceServerReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosServiceServerReference"


    // $ANTLR start "ruleRosServiceServerReference"
    // InternalVariabilityParser.g:1027:1: ruleRosServiceServerReference returns [EObject current=null] : (otherlv_0= Ss () ( ( ruleEString ) ) ) ;
    public final EObject ruleRosServiceServerReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:1033:2: ( (otherlv_0= Ss () ( ( ruleEString ) ) ) )
            // InternalVariabilityParser.g:1034:2: (otherlv_0= Ss () ( ( ruleEString ) ) )
            {
            // InternalVariabilityParser.g:1034:2: (otherlv_0= Ss () ( ( ruleEString ) ) )
            // InternalVariabilityParser.g:1035:3: otherlv_0= Ss () ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,Ss,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosServiceServerReferenceAccess().getSsKeyword_0());
              		
            }
            // InternalVariabilityParser.g:1039:3: ()
            // InternalVariabilityParser.g:1040:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRosServiceServerReferenceAccess().getRosServiceServerReferenceAction_1(),
              					current);
              			
            }

            }

            // InternalVariabilityParser.g:1046:3: ( ( ruleEString ) )
            // InternalVariabilityParser.g:1047:4: ( ruleEString )
            {
            // InternalVariabilityParser.g:1047:4: ( ruleEString )
            // InternalVariabilityParser.g:1048:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosServiceServerReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosServiceServerReferenceAccess().getFromServiceServerCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosServiceServerReference"


    // $ANTLR start "entryRuleRosServerClientReference"
    // InternalVariabilityParser.g:1066:1: entryRuleRosServerClientReference returns [EObject current=null] : iv_ruleRosServerClientReference= ruleRosServerClientReference EOF ;
    public final EObject entryRuleRosServerClientReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServerClientReference = null;


        try {
            // InternalVariabilityParser.g:1066:65: (iv_ruleRosServerClientReference= ruleRosServerClientReference EOF )
            // InternalVariabilityParser.g:1067:2: iv_ruleRosServerClientReference= ruleRosServerClientReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosServerClientReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosServerClientReference=ruleRosServerClientReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosServerClientReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosServerClientReference"


    // $ANTLR start "ruleRosServerClientReference"
    // InternalVariabilityParser.g:1073:1: ruleRosServerClientReference returns [EObject current=null] : (otherlv_0= Sc () ( ( ruleEString ) ) ) ;
    public final EObject ruleRosServerClientReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:1079:2: ( (otherlv_0= Sc () ( ( ruleEString ) ) ) )
            // InternalVariabilityParser.g:1080:2: (otherlv_0= Sc () ( ( ruleEString ) ) )
            {
            // InternalVariabilityParser.g:1080:2: (otherlv_0= Sc () ( ( ruleEString ) ) )
            // InternalVariabilityParser.g:1081:3: otherlv_0= Sc () ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,Sc,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosServerClientReferenceAccess().getScKeyword_0());
              		
            }
            // InternalVariabilityParser.g:1085:3: ()
            // InternalVariabilityParser.g:1086:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRosServerClientReferenceAccess().getRosServiceClientReferenceAction_1(),
              					current);
              			
            }

            }

            // InternalVariabilityParser.g:1092:3: ( ( ruleEString ) )
            // InternalVariabilityParser.g:1093:4: ( ruleEString )
            {
            // InternalVariabilityParser.g:1093:4: ( ruleEString )
            // InternalVariabilityParser.g:1094:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosServerClientReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosServerClientReferenceAccess().getFromServiceClientCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosServerClientReference"


    // $ANTLR start "entryRuleRosActionServerReference"
    // InternalVariabilityParser.g:1112:1: entryRuleRosActionServerReference returns [EObject current=null] : iv_ruleRosActionServerReference= ruleRosActionServerReference EOF ;
    public final EObject entryRuleRosActionServerReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionServerReference = null;


        try {
            // InternalVariabilityParser.g:1112:65: (iv_ruleRosActionServerReference= ruleRosActionServerReference EOF )
            // InternalVariabilityParser.g:1113:2: iv_ruleRosActionServerReference= ruleRosActionServerReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosActionServerReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosActionServerReference=ruleRosActionServerReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosActionServerReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosActionServerReference"


    // $ANTLR start "ruleRosActionServerReference"
    // InternalVariabilityParser.g:1119:1: ruleRosActionServerReference returns [EObject current=null] : (otherlv_0= As () ( ( ruleEString ) ) ) ;
    public final EObject ruleRosActionServerReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:1125:2: ( (otherlv_0= As () ( ( ruleEString ) ) ) )
            // InternalVariabilityParser.g:1126:2: (otherlv_0= As () ( ( ruleEString ) ) )
            {
            // InternalVariabilityParser.g:1126:2: (otherlv_0= As () ( ( ruleEString ) ) )
            // InternalVariabilityParser.g:1127:3: otherlv_0= As () ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,As,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosActionServerReferenceAccess().getAsKeyword_0());
              		
            }
            // InternalVariabilityParser.g:1131:3: ()
            // InternalVariabilityParser.g:1132:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRosActionServerReferenceAccess().getRosActionServerReferenceAction_1(),
              					current);
              			
            }

            }

            // InternalVariabilityParser.g:1138:3: ( ( ruleEString ) )
            // InternalVariabilityParser.g:1139:4: ( ruleEString )
            {
            // InternalVariabilityParser.g:1139:4: ( ruleEString )
            // InternalVariabilityParser.g:1140:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosActionServerReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosActionServerReferenceAccess().getFromActionServerCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosActionServerReference"


    // $ANTLR start "entryRuleRosActionClientReference"
    // InternalVariabilityParser.g:1158:1: entryRuleRosActionClientReference returns [EObject current=null] : iv_ruleRosActionClientReference= ruleRosActionClientReference EOF ;
    public final EObject entryRuleRosActionClientReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionClientReference = null;


        try {
            // InternalVariabilityParser.g:1158:65: (iv_ruleRosActionClientReference= ruleRosActionClientReference EOF )
            // InternalVariabilityParser.g:1159:2: iv_ruleRosActionClientReference= ruleRosActionClientReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosActionClientReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosActionClientReference=ruleRosActionClientReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosActionClientReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosActionClientReference"


    // $ANTLR start "ruleRosActionClientReference"
    // InternalVariabilityParser.g:1165:1: ruleRosActionClientReference returns [EObject current=null] : (otherlv_0= Ac () ( ( ruleEString ) ) ) ;
    public final EObject ruleRosActionClientReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:1171:2: ( (otherlv_0= Ac () ( ( ruleEString ) ) ) )
            // InternalVariabilityParser.g:1172:2: (otherlv_0= Ac () ( ( ruleEString ) ) )
            {
            // InternalVariabilityParser.g:1172:2: (otherlv_0= Ac () ( ( ruleEString ) ) )
            // InternalVariabilityParser.g:1173:3: otherlv_0= Ac () ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,Ac,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosActionClientReferenceAccess().getAcKeyword_0());
              		
            }
            // InternalVariabilityParser.g:1177:3: ()
            // InternalVariabilityParser.g:1178:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRosActionClientReferenceAccess().getRosActionClientReferenceAction_1(),
              					current);
              			
            }

            }

            // InternalVariabilityParser.g:1184:3: ( ( ruleEString ) )
            // InternalVariabilityParser.g:1185:4: ( ruleEString )
            {
            // InternalVariabilityParser.g:1185:4: ( ruleEString )
            // InternalVariabilityParser.g:1186:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosActionClientReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosActionClientReferenceAccess().getFromActionClientCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosActionClientReference"


    // $ANTLR start "entryRuleConnection"
    // InternalVariabilityParser.g:1204:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalVariabilityParser.g:1204:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalVariabilityParser.g:1205:2: iv_ruleConnection= ruleConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConnection=ruleConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalVariabilityParser.g:1211:1: ruleConnection returns [EObject current=null] : ( ( ( ruleRosSystemConnection )=>this_RosSystemConnection_0= ruleRosSystemConnection ) | this_RosConnection_1= ruleRosConnection ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        EObject this_RosSystemConnection_0 = null;

        EObject this_RosConnection_1 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:1217:2: ( ( ( ( ruleRosSystemConnection )=>this_RosSystemConnection_0= ruleRosSystemConnection ) | this_RosConnection_1= ruleRosConnection ) )
            // InternalVariabilityParser.g:1218:2: ( ( ( ruleRosSystemConnection )=>this_RosSystemConnection_0= ruleRosSystemConnection ) | this_RosConnection_1= ruleRosConnection )
            {
            // InternalVariabilityParser.g:1218:2: ( ( ( ruleRosSystemConnection )=>this_RosSystemConnection_0= ruleRosSystemConnection ) | this_RosConnection_1= ruleRosConnection )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalVariabilityParser.g:1219:3: ( ( ruleRosSystemConnection )=>this_RosSystemConnection_0= ruleRosSystemConnection )
                    {
                    // InternalVariabilityParser.g:1219:3: ( ( ruleRosSystemConnection )=>this_RosSystemConnection_0= ruleRosSystemConnection )
                    // InternalVariabilityParser.g:1220:4: ( ruleRosSystemConnection )=>this_RosSystemConnection_0= ruleRosSystemConnection
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConnectionAccess().getRosSystemConnectionParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_RosSystemConnection_0=ruleRosSystemConnection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_RosSystemConnection_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVariabilityParser.g:1231:3: this_RosConnection_1= ruleRosConnection
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConnectionAccess().getRosConnectionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RosConnection_1=ruleRosConnection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RosConnection_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleRosSystemConnection"
    // InternalVariabilityParser.g:1243:1: entryRuleRosSystemConnection returns [EObject current=null] : iv_ruleRosSystemConnection= ruleRosSystemConnection EOF ;
    public final EObject entryRuleRosSystemConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSystemConnection = null;


        try {
            // InternalVariabilityParser.g:1243:60: (iv_ruleRosSystemConnection= ruleRosSystemConnection EOF )
            // InternalVariabilityParser.g:1244:2: iv_ruleRosSystemConnection= ruleRosSystemConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosSystemConnectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosSystemConnection=ruleRosSystemConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosSystemConnection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosSystemConnection"


    // $ANTLR start "ruleRosSystemConnection"
    // InternalVariabilityParser.g:1250:1: ruleRosSystemConnection returns [EObject current=null] : (otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket ) ;
    public final EObject ruleRosSystemConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:1256:2: ( (otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket ) )
            // InternalVariabilityParser.g:1257:2: (otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket )
            {
            // InternalVariabilityParser.g:1257:2: (otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket )
            // InternalVariabilityParser.g:1258:3: otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosSystemConnectionAccess().getHyphenMinusKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRosSystemConnectionAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalVariabilityParser.g:1266:3: ( ( ruleEString ) )
            // InternalVariabilityParser.g:1267:4: ( ruleEString )
            {
            // InternalVariabilityParser.g:1267:4: ( ruleEString )
            // InternalVariabilityParser.g:1268:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosSystemConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosSystemConnectionAccess().getFromRosInterfaceCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,Comma,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRosSystemConnectionAccess().getCommaKeyword_3());
              		
            }
            // InternalVariabilityParser.g:1286:3: ( ( ruleEString ) )
            // InternalVariabilityParser.g:1287:4: ( ruleEString )
            {
            // InternalVariabilityParser.g:1287:4: ( ruleEString )
            // InternalVariabilityParser.g:1288:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosSystemConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosSystemConnectionAccess().getToRosInterfaceCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRosSystemConnectionAccess().getRightSquareBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosSystemConnection"


    // $ANTLR start "entryRuleRosConnection"
    // InternalVariabilityParser.g:1310:1: entryRuleRosConnection returns [EObject current=null] : iv_ruleRosConnection= ruleRosConnection EOF ;
    public final EObject entryRuleRosConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosConnection = null;


        try {
            // InternalVariabilityParser.g:1310:54: (iv_ruleRosConnection= ruleRosConnection EOF )
            // InternalVariabilityParser.g:1311:2: iv_ruleRosConnection= ruleRosConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosConnectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosConnection=ruleRosConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosConnection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosConnection"


    // $ANTLR start "ruleRosConnection"
    // InternalVariabilityParser.g:1317:1: ruleRosConnection returns [EObject current=null] : ( ( ( ruleRosTopicConnection )=>this_RosTopicConnection_0= ruleRosTopicConnection ) | ( ( ruleRosServiceConnection )=>this_RosServiceConnection_1= ruleRosServiceConnection ) | this_RosActionConnection_2= ruleRosActionConnection ) ;
    public final EObject ruleRosConnection() throws RecognitionException {
        EObject current = null;

        EObject this_RosTopicConnection_0 = null;

        EObject this_RosServiceConnection_1 = null;

        EObject this_RosActionConnection_2 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:1323:2: ( ( ( ( ruleRosTopicConnection )=>this_RosTopicConnection_0= ruleRosTopicConnection ) | ( ( ruleRosServiceConnection )=>this_RosServiceConnection_1= ruleRosServiceConnection ) | this_RosActionConnection_2= ruleRosActionConnection ) )
            // InternalVariabilityParser.g:1324:2: ( ( ( ruleRosTopicConnection )=>this_RosTopicConnection_0= ruleRosTopicConnection ) | ( ( ruleRosServiceConnection )=>this_RosServiceConnection_1= ruleRosServiceConnection ) | this_RosActionConnection_2= ruleRosActionConnection )
            {
            // InternalVariabilityParser.g:1324:2: ( ( ( ruleRosTopicConnection )=>this_RosTopicConnection_0= ruleRosTopicConnection ) | ( ( ruleRosServiceConnection )=>this_RosServiceConnection_1= ruleRosServiceConnection ) | this_RosActionConnection_2= ruleRosActionConnection )
            int alt20=3;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalVariabilityParser.g:1325:3: ( ( ruleRosTopicConnection )=>this_RosTopicConnection_0= ruleRosTopicConnection )
                    {
                    // InternalVariabilityParser.g:1325:3: ( ( ruleRosTopicConnection )=>this_RosTopicConnection_0= ruleRosTopicConnection )
                    // InternalVariabilityParser.g:1326:4: ( ruleRosTopicConnection )=>this_RosTopicConnection_0= ruleRosTopicConnection
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRosConnectionAccess().getRosTopicConnectionParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_RosTopicConnection_0=ruleRosTopicConnection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_RosTopicConnection_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVariabilityParser.g:1337:3: ( ( ruleRosServiceConnection )=>this_RosServiceConnection_1= ruleRosServiceConnection )
                    {
                    // InternalVariabilityParser.g:1337:3: ( ( ruleRosServiceConnection )=>this_RosServiceConnection_1= ruleRosServiceConnection )
                    // InternalVariabilityParser.g:1338:4: ( ruleRosServiceConnection )=>this_RosServiceConnection_1= ruleRosServiceConnection
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRosConnectionAccess().getRosServiceConnectionParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_RosServiceConnection_1=ruleRosServiceConnection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_RosServiceConnection_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalVariabilityParser.g:1349:3: this_RosActionConnection_2= ruleRosActionConnection
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRosConnectionAccess().getRosActionConnectionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RosActionConnection_2=ruleRosActionConnection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RosActionConnection_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosConnection"


    // $ANTLR start "entryRuleRosTopicConnection"
    // InternalVariabilityParser.g:1361:1: entryRuleRosTopicConnection returns [EObject current=null] : iv_ruleRosTopicConnection= ruleRosTopicConnection EOF ;
    public final EObject entryRuleRosTopicConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosTopicConnection = null;


        try {
            // InternalVariabilityParser.g:1361:59: (iv_ruleRosTopicConnection= ruleRosTopicConnection EOF )
            // InternalVariabilityParser.g:1362:2: iv_ruleRosTopicConnection= ruleRosTopicConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosTopicConnectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosTopicConnection=ruleRosTopicConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosTopicConnection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosTopicConnection"


    // $ANTLR start "ruleRosTopicConnection"
    // InternalVariabilityParser.g:1368:1: ruleRosTopicConnection returns [EObject current=null] : (otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket ) ;
    public final EObject ruleRosTopicConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:1374:2: ( (otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket ) )
            // InternalVariabilityParser.g:1375:2: (otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket )
            {
            // InternalVariabilityParser.g:1375:2: (otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket )
            // InternalVariabilityParser.g:1376:3: otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosTopicConnectionAccess().getHyphenMinusKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRosTopicConnectionAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalVariabilityParser.g:1384:3: ( ( ruleEString ) )
            // InternalVariabilityParser.g:1385:4: ( ruleEString )
            {
            // InternalVariabilityParser.g:1385:4: ( ruleEString )
            // InternalVariabilityParser.g:1386:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosTopicConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosTopicConnectionAccess().getFromPublisherCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,Comma,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRosTopicConnectionAccess().getCommaKeyword_3());
              		
            }
            // InternalVariabilityParser.g:1404:3: ( ( ruleEString ) )
            // InternalVariabilityParser.g:1405:4: ( ruleEString )
            {
            // InternalVariabilityParser.g:1405:4: ( ruleEString )
            // InternalVariabilityParser.g:1406:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosTopicConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosTopicConnectionAccess().getToSubscriberCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRosTopicConnectionAccess().getRightSquareBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosTopicConnection"


    // $ANTLR start "entryRuleRosServiceConnection"
    // InternalVariabilityParser.g:1428:1: entryRuleRosServiceConnection returns [EObject current=null] : iv_ruleRosServiceConnection= ruleRosServiceConnection EOF ;
    public final EObject entryRuleRosServiceConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceConnection = null;


        try {
            // InternalVariabilityParser.g:1428:61: (iv_ruleRosServiceConnection= ruleRosServiceConnection EOF )
            // InternalVariabilityParser.g:1429:2: iv_ruleRosServiceConnection= ruleRosServiceConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosServiceConnectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosServiceConnection=ruleRosServiceConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosServiceConnection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosServiceConnection"


    // $ANTLR start "ruleRosServiceConnection"
    // InternalVariabilityParser.g:1435:1: ruleRosServiceConnection returns [EObject current=null] : (otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket ) ;
    public final EObject ruleRosServiceConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:1441:2: ( (otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket ) )
            // InternalVariabilityParser.g:1442:2: (otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket )
            {
            // InternalVariabilityParser.g:1442:2: (otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket )
            // InternalVariabilityParser.g:1443:3: otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosServiceConnectionAccess().getHyphenMinusKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRosServiceConnectionAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalVariabilityParser.g:1451:3: ( ( ruleEString ) )
            // InternalVariabilityParser.g:1452:4: ( ruleEString )
            {
            // InternalVariabilityParser.g:1452:4: ( ruleEString )
            // InternalVariabilityParser.g:1453:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosServiceConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosServiceConnectionAccess().getFromServiceServerCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,Comma,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRosServiceConnectionAccess().getCommaKeyword_3());
              		
            }
            // InternalVariabilityParser.g:1471:3: ( ( ruleEString ) )
            // InternalVariabilityParser.g:1472:4: ( ruleEString )
            {
            // InternalVariabilityParser.g:1472:4: ( ruleEString )
            // InternalVariabilityParser.g:1473:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosServiceConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosServiceConnectionAccess().getToServiceClientCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRosServiceConnectionAccess().getRightSquareBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosServiceConnection"


    // $ANTLR start "entryRuleRosActionConnection"
    // InternalVariabilityParser.g:1495:1: entryRuleRosActionConnection returns [EObject current=null] : iv_ruleRosActionConnection= ruleRosActionConnection EOF ;
    public final EObject entryRuleRosActionConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionConnection = null;


        try {
            // InternalVariabilityParser.g:1495:60: (iv_ruleRosActionConnection= ruleRosActionConnection EOF )
            // InternalVariabilityParser.g:1496:2: iv_ruleRosActionConnection= ruleRosActionConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosActionConnectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosActionConnection=ruleRosActionConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosActionConnection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosActionConnection"


    // $ANTLR start "ruleRosActionConnection"
    // InternalVariabilityParser.g:1502:1: ruleRosActionConnection returns [EObject current=null] : (otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket ) ;
    public final EObject ruleRosActionConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:1508:2: ( (otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket ) )
            // InternalVariabilityParser.g:1509:2: (otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket )
            {
            // InternalVariabilityParser.g:1509:2: (otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket )
            // InternalVariabilityParser.g:1510:3: otherlv_0= HyphenMinus otherlv_1= LeftSquareBracket ( ( ruleEString ) ) otherlv_3= Comma ( ( ruleEString ) ) otherlv_5= RightSquareBracket
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosActionConnectionAccess().getHyphenMinusKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRosActionConnectionAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalVariabilityParser.g:1518:3: ( ( ruleEString ) )
            // InternalVariabilityParser.g:1519:4: ( ruleEString )
            {
            // InternalVariabilityParser.g:1519:4: ( ruleEString )
            // InternalVariabilityParser.g:1520:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosActionConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosActionConnectionAccess().getFromActionServerCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,Comma,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRosActionConnectionAccess().getCommaKeyword_3());
              		
            }
            // InternalVariabilityParser.g:1538:3: ( ( ruleEString ) )
            // InternalVariabilityParser.g:1539:4: ( ruleEString )
            {
            // InternalVariabilityParser.g:1539:4: ( ruleEString )
            // InternalVariabilityParser.g:1540:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosActionConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosActionConnectionAccess().getToActionClientCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRosActionConnectionAccess().getRightSquareBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosActionConnection"


    // $ANTLR start "entryRuleNamespace"
    // InternalVariabilityParser.g:1562:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalVariabilityParser.g:1562:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalVariabilityParser.g:1563:2: iv_ruleNamespace= ruleNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamespaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamespace; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalVariabilityParser.g:1569:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:1575:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalVariabilityParser.g:1576:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalVariabilityParser.g:1576:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt21=3;
            switch ( input.LA(1) ) {
            case GlobalNamespace:
                {
                alt21=1;
                }
                break;
            case RelativeNamespace:
                {
                alt21=2;
                }
                break;
            case PrivateNamespace:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalVariabilityParser.g:1577:3: this_GlobalNamespace_0= ruleGlobalNamespace
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNamespaceAccess().getGlobalNamespaceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GlobalNamespace_0=ruleGlobalNamespace();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GlobalNamespace_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVariabilityParser.g:1586:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNamespaceAccess().getRelativeNamespace_ImplParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RelativeNamespace_Impl_1=ruleRelativeNamespace_Impl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RelativeNamespace_Impl_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVariabilityParser.g:1595:3: this_PrivateNamespace_2= rulePrivateNamespace
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNamespaceAccess().getPrivateNamespaceParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrivateNamespace_2=rulePrivateNamespace();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrivateNamespace_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleGraphName"
    // InternalVariabilityParser.g:1607:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalVariabilityParser.g:1607:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalVariabilityParser.g:1608:2: iv_ruleGraphName= ruleGraphName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGraphNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGraphName=ruleGraphName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGraphName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphName"


    // $ANTLR start "ruleGraphName"
    // InternalVariabilityParser.g:1614:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= GraphName ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:1620:2: (kw= GraphName )
            // InternalVariabilityParser.g:1621:2: kw= GraphName
            {
            kw=(Token)match(input,GraphName,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getGraphNameAccess().getGraphNameKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphName"


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalVariabilityParser.g:1629:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalVariabilityParser.g:1629:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalVariabilityParser.g:1630:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalNamespaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGlobalNamespace=ruleGlobalNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobalNamespace; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalNamespace"


    // $ANTLR start "ruleGlobalNamespace"
    // InternalVariabilityParser.g:1636:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
    public final EObject ruleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_parts_3_0 = null;

        AntlrDatatypeRuleToken lv_parts_5_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:1642:2: ( ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalVariabilityParser.g:1643:2: ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalVariabilityParser.g:1643:2: ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalVariabilityParser.g:1644:3: () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalVariabilityParser.g:1644:3: ()
            // InternalVariabilityParser.g:1645:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,GlobalNamespace,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
              		
            }
            // InternalVariabilityParser.g:1655:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LeftSquareBracket) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalVariabilityParser.g:1656:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftSquareBracketKeyword_2_0());
                      			
                    }
                    // InternalVariabilityParser.g:1660:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalVariabilityParser.g:1661:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalVariabilityParser.g:1661:5: (lv_parts_3_0= ruleGraphName )
                    // InternalVariabilityParser.g:1662:6: lv_parts_3_0= ruleGraphName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_parts_3_0=ruleGraphName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                      						}
                      						add(
                      							current,
                      							"parts",
                      							lv_parts_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.GraphName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalVariabilityParser.g:1679:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==Comma) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalVariabilityParser.g:1680:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_27); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalVariabilityParser.g:1684:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalVariabilityParser.g:1685:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalVariabilityParser.g:1685:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalVariabilityParser.g:1686:7: lv_parts_5_0= ruleGraphName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_parts_5_0=ruleGraphName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parts",
                    	      								lv_parts_5_0,
                    	      								"de.fraunhofer.ipa.ros.Basics.GraphName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getGlobalNamespaceAccess().getRightSquareBracketKeyword_2_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalNamespace"


    // $ANTLR start "entryRuleRelativeNamespace_Impl"
    // InternalVariabilityParser.g:1713:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalVariabilityParser.g:1713:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalVariabilityParser.g:1714:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelativeNamespace_ImplRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelativeNamespace_Impl=ruleRelativeNamespace_Impl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelativeNamespace_Impl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelativeNamespace_Impl"


    // $ANTLR start "ruleRelativeNamespace_Impl"
    // InternalVariabilityParser.g:1720:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
    public final EObject ruleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_parts_3_0 = null;

        AntlrDatatypeRuleToken lv_parts_5_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:1726:2: ( ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalVariabilityParser.g:1727:2: ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalVariabilityParser.g:1727:2: ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalVariabilityParser.g:1728:3: () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalVariabilityParser.g:1728:3: ()
            // InternalVariabilityParser.g:1729:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,RelativeNamespace,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
              		
            }
            // InternalVariabilityParser.g:1739:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LeftSquareBracket) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVariabilityParser.g:1740:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftSquareBracketKeyword_2_0());
                      			
                    }
                    // InternalVariabilityParser.g:1744:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalVariabilityParser.g:1745:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalVariabilityParser.g:1745:5: (lv_parts_3_0= ruleGraphName )
                    // InternalVariabilityParser.g:1746:6: lv_parts_3_0= ruleGraphName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_parts_3_0=ruleGraphName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                      						}
                      						add(
                      							current,
                      							"parts",
                      							lv_parts_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.GraphName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalVariabilityParser.g:1763:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==Comma) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalVariabilityParser.g:1764:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_27); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalVariabilityParser.g:1768:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalVariabilityParser.g:1769:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalVariabilityParser.g:1769:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalVariabilityParser.g:1770:7: lv_parts_5_0= ruleGraphName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_parts_5_0=ruleGraphName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parts",
                    	      								lv_parts_5_0,
                    	      								"de.fraunhofer.ipa.ros.Basics.GraphName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getRelativeNamespace_ImplAccess().getRightSquareBracketKeyword_2_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelativeNamespace_Impl"


    // $ANTLR start "entryRulePrivateNamespace"
    // InternalVariabilityParser.g:1797:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalVariabilityParser.g:1797:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalVariabilityParser.g:1798:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrivateNamespaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrivateNamespace=rulePrivateNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrivateNamespace; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrivateNamespace"


    // $ANTLR start "rulePrivateNamespace"
    // InternalVariabilityParser.g:1804:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
    public final EObject rulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_parts_3_0 = null;

        AntlrDatatypeRuleToken lv_parts_5_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:1810:2: ( ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalVariabilityParser.g:1811:2: ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalVariabilityParser.g:1811:2: ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalVariabilityParser.g:1812:3: () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalVariabilityParser.g:1812:3: ()
            // InternalVariabilityParser.g:1813:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,PrivateNamespace,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
              		
            }
            // InternalVariabilityParser.g:1823:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==LeftSquareBracket) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVariabilityParser.g:1824:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftSquareBracketKeyword_2_0());
                      			
                    }
                    // InternalVariabilityParser.g:1828:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalVariabilityParser.g:1829:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalVariabilityParser.g:1829:5: (lv_parts_3_0= ruleGraphName )
                    // InternalVariabilityParser.g:1830:6: lv_parts_3_0= ruleGraphName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_parts_3_0=ruleGraphName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                      						}
                      						add(
                      							current,
                      							"parts",
                      							lv_parts_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.GraphName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalVariabilityParser.g:1847:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==Comma) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalVariabilityParser.g:1848:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_27); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalVariabilityParser.g:1852:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalVariabilityParser.g:1853:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalVariabilityParser.g:1853:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalVariabilityParser.g:1854:7: lv_parts_5_0= ruleGraphName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_parts_5_0=ruleGraphName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parts",
                    	      								lv_parts_5_0,
                    	      								"de.fraunhofer.ipa.ros.Basics.GraphName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getPrivateNamespaceAccess().getRightSquareBracketKeyword_2_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrivateNamespace"


    // $ANTLR start "entryRuleParameter"
    // InternalVariabilityParser.g:1881:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalVariabilityParser.g:1881:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalVariabilityParser.g:1882:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalVariabilityParser.g:1888:1: ruleParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Ns ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= Type_1 ( (lv_type_7_0= ruleParameterType ) ) (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )? this_END_10= RULE_END ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_5_0 = null;

        EObject lv_type_7_0 = null;

        EObject lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:1894:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Ns ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= Type_1 ( (lv_type_7_0= ruleParameterType ) ) (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )? this_END_10= RULE_END ) )
            // InternalVariabilityParser.g:1895:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Ns ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= Type_1 ( (lv_type_7_0= ruleParameterType ) ) (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )? this_END_10= RULE_END )
            {
            // InternalVariabilityParser.g:1895:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Ns ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= Type_1 ( (lv_type_7_0= ruleParameterType ) ) (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )? this_END_10= RULE_END )
            // InternalVariabilityParser.g:1896:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Ns ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= Type_1 ( (lv_type_7_0= ruleParameterType ) ) (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )? this_END_10= RULE_END
            {
            // InternalVariabilityParser.g:1896:3: ()
            // InternalVariabilityParser.g:1897:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterAccess().getParameterAction_0(),
              					current);
              			
            }

            }

            // InternalVariabilityParser.g:1903:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVariabilityParser.g:1904:4: (lv_name_1_0= ruleEString )
            {
            // InternalVariabilityParser.g:1904:4: (lv_name_1_0= ruleEString )
            // InternalVariabilityParser.g:1905:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.fraunhofer.ipa.ros.Basics.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2());
              		
            }
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_3, grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_3());
              		
            }
            // InternalVariabilityParser.g:1930:3: (otherlv_4= Ns ( (lv_namespace_5_0= ruleNamespace ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Ns) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVariabilityParser.g:1931:4: otherlv_4= Ns ( (lv_namespace_5_0= ruleNamespace ) )
                    {
                    otherlv_4=(Token)match(input,Ns,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getNsKeyword_4_0());
                      			
                    }
                    // InternalVariabilityParser.g:1935:4: ( (lv_namespace_5_0= ruleNamespace ) )
                    // InternalVariabilityParser.g:1936:5: (lv_namespace_5_0= ruleNamespace )
                    {
                    // InternalVariabilityParser.g:1936:5: (lv_namespace_5_0= ruleNamespace )
                    // InternalVariabilityParser.g:1937:6: lv_namespace_5_0= ruleNamespace
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterAccess().getNamespaceNamespaceParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_namespace_5_0=ruleNamespace();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterRule());
                      						}
                      						set(
                      							current,
                      							"namespace",
                      							lv_namespace_5_0,
                      							"de.fraunhofer.ipa.ros.Basics.Namespace");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,Type_1,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getTypeKeyword_5());
              		
            }
            // InternalVariabilityParser.g:1959:3: ( (lv_type_7_0= ruleParameterType ) )
            // InternalVariabilityParser.g:1960:4: (lv_type_7_0= ruleParameterType )
            {
            // InternalVariabilityParser.g:1960:4: (lv_type_7_0= ruleParameterType )
            // InternalVariabilityParser.g:1961:5: lv_type_7_0= ruleParameterType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_type_7_0=ruleParameterType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_7_0,
              						"de.fraunhofer.ipa.ros.Basics.ParameterType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalVariabilityParser.g:1978:3: (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Value_1) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVariabilityParser.g:1979:4: otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) )
                    {
                    otherlv_8=(Token)match(input,Value_1,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getValueKeyword_7_0());
                      			
                    }
                    // InternalVariabilityParser.g:1983:4: ( (lv_value_9_0= ruleParameterValue ) )
                    // InternalVariabilityParser.g:1984:5: (lv_value_9_0= ruleParameterValue )
                    {
                    // InternalVariabilityParser.g:1984:5: (lv_value_9_0= ruleParameterValue )
                    // InternalVariabilityParser.g:1985:6: lv_value_9_0= ruleParameterValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_value_9_0=ruleParameterValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_9_0,
                      							"de.fraunhofer.ipa.ros.Basics.ParameterValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_10, grammarAccess.getParameterAccess().getENDTerminalRuleCall_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameterType"
    // InternalVariabilityParser.g:2011:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalVariabilityParser.g:2011:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalVariabilityParser.g:2012:2: iv_ruleParameterType= ruleParameterType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalVariabilityParser.g:2018:1: ruleParameterType returns [EObject current=null] : (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterListType_0 = null;

        EObject this_ParameterStructType_1 = null;

        EObject this_ParameterIntegerType_2 = null;

        EObject this_ParameterStringType_3 = null;

        EObject this_ParameterDoubleType_4 = null;

        EObject this_ParameterBooleanType_5 = null;

        EObject this_ParameterBase64Type_6 = null;

        EObject this_ParameterArrayType_7 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:2024:2: ( (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) )
            // InternalVariabilityParser.g:2025:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            {
            // InternalVariabilityParser.g:2025:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            int alt30=8;
            switch ( input.LA(1) ) {
            case List:
                {
                alt30=1;
                }
                break;
            case Struct:
                {
                alt30=2;
                }
                break;
            case Integer:
                {
                alt30=3;
                }
                break;
            case String:
                {
                alt30=4;
                }
                break;
            case Double:
                {
                alt30=5;
                }
                break;
            case Boolean:
                {
                alt30=6;
                }
                break;
            case Base64:
                {
                alt30=7;
                }
                break;
            case Array:
                {
                alt30=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalVariabilityParser.g:2026:3: this_ParameterListType_0= ruleParameterListType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterListTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterListType_0=ruleParameterListType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterListType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVariabilityParser.g:2035:3: this_ParameterStructType_1= ruleParameterStructType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStructTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterStructType_1=ruleParameterStructType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterStructType_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVariabilityParser.g:2044:3: this_ParameterIntegerType_2= ruleParameterIntegerType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterIntegerTypeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterIntegerType_2=ruleParameterIntegerType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterIntegerType_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVariabilityParser.g:2053:3: this_ParameterStringType_3= ruleParameterStringType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterStringType_3=ruleParameterStringType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterStringType_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalVariabilityParser.g:2062:3: this_ParameterDoubleType_4= ruleParameterDoubleType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterDoubleTypeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterDoubleType_4=ruleParameterDoubleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterDoubleType_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalVariabilityParser.g:2071:3: this_ParameterBooleanType_5= ruleParameterBooleanType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBooleanTypeParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterBooleanType_5=ruleParameterBooleanType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterBooleanType_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalVariabilityParser.g:2080:3: this_ParameterBase64Type_6= ruleParameterBase64Type
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBase64TypeParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64Type_6=ruleParameterBase64Type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterBase64Type_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalVariabilityParser.g:2089:3: this_ParameterArrayType_7= ruleParameterArrayType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterArrayTypeParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterArrayType_7=ruleParameterArrayType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterArrayType_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleParameterValue"
    // InternalVariabilityParser.g:2101:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalVariabilityParser.g:2101:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalVariabilityParser.g:2102:2: iv_ruleParameterValue= ruleParameterValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterValue=ruleParameterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalVariabilityParser.g:2108:1: ruleParameterValue returns [EObject current=null] : (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterString_0 = null;

        EObject this_ParameterBase64_1 = null;

        EObject this_ParameterInteger_2 = null;

        EObject this_ParameterDouble_3 = null;

        EObject this_ParameterBoolean_4 = null;

        EObject this_ParameterList_5 = null;

        EObject this_ParameterStruct_6 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:2114:2: ( (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) )
            // InternalVariabilityParser.g:2115:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            {
            // InternalVariabilityParser.g:2115:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            int alt31=7;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalVariabilityParser.g:2116:3: this_ParameterString_0= ruleParameterString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStringParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterString_0=ruleParameterString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterString_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVariabilityParser.g:2125:3: this_ParameterBase64_1= ruleParameterBase64
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBase64ParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64_1=ruleParameterBase64();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterBase64_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVariabilityParser.g:2134:3: this_ParameterInteger_2= ruleParameterInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterInteger_2=ruleParameterInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVariabilityParser.g:2143:3: this_ParameterDouble_3= ruleParameterDouble
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterDoubleParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterDouble_3=ruleParameterDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterDouble_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalVariabilityParser.g:2152:3: this_ParameterBoolean_4= ruleParameterBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBooleanParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterBoolean_4=ruleParameterBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterBoolean_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalVariabilityParser.g:2161:3: this_ParameterList_5= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterListParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterList_5=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterList_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalVariabilityParser.g:2170:3: this_ParameterStruct_6= ruleParameterStruct
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStructParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterStruct_6=ruleParameterStruct();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterStruct_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleParameterListType"
    // InternalVariabilityParser.g:2182:1: entryRuleParameterListType returns [EObject current=null] : iv_ruleParameterListType= ruleParameterListType EOF ;
    public final EObject entryRuleParameterListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterListType = null;


        try {
            // InternalVariabilityParser.g:2182:58: (iv_ruleParameterListType= ruleParameterListType EOF )
            // InternalVariabilityParser.g:2183:2: iv_ruleParameterListType= ruleParameterListType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterListTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterListType=ruleParameterListType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterListType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterListType"


    // $ANTLR start "ruleParameterListType"
    // InternalVariabilityParser.g:2189:1: ruleParameterListType returns [EObject current=null] : ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket ) ;
    public final EObject ruleParameterListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_sequence_3_0 = null;

        EObject lv_sequence_5_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:2195:2: ( ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalVariabilityParser.g:2196:2: ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalVariabilityParser.g:2196:2: ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket )
            // InternalVariabilityParser.g:2197:3: () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket
            {
            // InternalVariabilityParser.g:2197:3: ()
            // InternalVariabilityParser.g:2198:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,List,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterListTypeAccess().getListKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getParameterListTypeAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalVariabilityParser.g:2212:3: ( (lv_sequence_3_0= ruleParameterType ) )
            // InternalVariabilityParser.g:2213:4: (lv_sequence_3_0= ruleParameterType )
            {
            // InternalVariabilityParser.g:2213:4: (lv_sequence_3_0= ruleParameterType )
            // InternalVariabilityParser.g:2214:5: lv_sequence_3_0= ruleParameterType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_sequence_3_0=ruleParameterType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
              					}
              					add(
              						current,
              						"sequence",
              						lv_sequence_3_0,
              						"de.fraunhofer.ipa.ros.Basics.ParameterType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalVariabilityParser.g:2231:3: (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Comma) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalVariabilityParser.g:2232:4: otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalVariabilityParser.g:2236:4: ( (lv_sequence_5_0= ruleParameterType ) )
            	    // InternalVariabilityParser.g:2237:5: (lv_sequence_5_0= ruleParameterType )
            	    {
            	    // InternalVariabilityParser.g:2237:5: (lv_sequence_5_0= ruleParameterType )
            	    // InternalVariabilityParser.g:2238:6: lv_sequence_5_0= ruleParameterType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_sequence_5_0=ruleParameterType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"sequence",
            	      							lv_sequence_5_0,
            	      							"de.fraunhofer.ipa.ros.Basics.ParameterType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getParameterListTypeAccess().getRightSquareBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterListType"


    // $ANTLR start "entryRuleParameterStructType"
    // InternalVariabilityParser.g:2264:1: entryRuleParameterStructType returns [EObject current=null] : iv_ruleParameterStructType= ruleParameterStructType EOF ;
    public final EObject entryRuleParameterStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructType = null;


        try {
            // InternalVariabilityParser.g:2264:60: (iv_ruleParameterStructType= ruleParameterStructType EOF )
            // InternalVariabilityParser.g:2265:2: iv_ruleParameterStructType= ruleParameterStructType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterStructTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructType=ruleParameterStructType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterStructType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterStructType"


    // $ANTLR start "ruleParameterStructType"
    // InternalVariabilityParser.g:2271:1: ruleParameterStructType returns [EObject current=null] : ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket ) ;
    public final EObject ruleParameterStructType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameterstructypetmember_3_0 = null;

        EObject lv_parameterstructypetmember_5_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:2277:2: ( ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalVariabilityParser.g:2278:2: ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalVariabilityParser.g:2278:2: ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket )
            // InternalVariabilityParser.g:2279:3: () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket
            {
            // InternalVariabilityParser.g:2279:3: ()
            // InternalVariabilityParser.g:2280:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Struct,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterStructTypeAccess().getStructKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalVariabilityParser.g:2294:3: ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) )
            // InternalVariabilityParser.g:2295:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            {
            // InternalVariabilityParser.g:2295:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            // InternalVariabilityParser.g:2296:5: lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_parameterstructypetmember_3_0=ruleParameterStructTypeMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterStructTypeRule());
              					}
              					add(
              						current,
              						"parameterstructypetmember",
              						lv_parameterstructypetmember_3_0,
              						"de.fraunhofer.ipa.ros.Basics.ParameterStructTypeMember");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalVariabilityParser.g:2313:3: (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==Comma) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalVariabilityParser.g:2314:4: otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalVariabilityParser.g:2318:4: ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    // InternalVariabilityParser.g:2319:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    {
            	    // InternalVariabilityParser.g:2319:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    // InternalVariabilityParser.g:2320:6: lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_parameterstructypetmember_5_0=ruleParameterStructTypeMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getParameterStructTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"parameterstructypetmember",
            	      							lv_parameterstructypetmember_5_0,
            	      							"de.fraunhofer.ipa.ros.Basics.ParameterStructTypeMember");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getParameterStructTypeAccess().getRightSquareBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStructType"


    // $ANTLR start "entryRuleParameterIntegerType"
    // InternalVariabilityParser.g:2346:1: entryRuleParameterIntegerType returns [EObject current=null] : iv_ruleParameterIntegerType= ruleParameterIntegerType EOF ;
    public final EObject entryRuleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIntegerType = null;


        try {
            // InternalVariabilityParser.g:2346:61: (iv_ruleParameterIntegerType= ruleParameterIntegerType EOF )
            // InternalVariabilityParser.g:2347:2: iv_ruleParameterIntegerType= ruleParameterIntegerType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterIntegerTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterIntegerType=ruleParameterIntegerType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterIntegerType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterIntegerType"


    // $ANTLR start "ruleParameterIntegerType"
    // InternalVariabilityParser.g:2353:1: ruleParameterIntegerType returns [EObject current=null] : ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? ) ;
    public final EObject ruleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:2359:2: ( ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? ) )
            // InternalVariabilityParser.g:2360:2: ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            {
            // InternalVariabilityParser.g:2360:2: ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            // InternalVariabilityParser.g:2361:3: () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )?
            {
            // InternalVariabilityParser.g:2361:3: ()
            // InternalVariabilityParser.g:2362:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Integer,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1());
              		
            }
            // InternalVariabilityParser.g:2372:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Default) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVariabilityParser.g:2373:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_0());
                      			
                    }
                    // InternalVariabilityParser.g:2377:4: ( (lv_default_3_0= ruleParameterInteger ) )
                    // InternalVariabilityParser.g:2378:5: (lv_default_3_0= ruleParameterInteger )
                    {
                    // InternalVariabilityParser.g:2378:5: (lv_default_3_0= ruleParameterInteger )
                    // InternalVariabilityParser.g:2379:6: lv_default_3_0= ruleParameterInteger
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterIntegerTypeAccess().getDefaultParameterIntegerParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterIntegerTypeRule());
                      						}
                      						set(
                      							current,
                      							"default",
                      							lv_default_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.ParameterInteger");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterIntegerType"


    // $ANTLR start "entryRuleParameterStringType"
    // InternalVariabilityParser.g:2401:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalVariabilityParser.g:2401:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalVariabilityParser.g:2402:2: iv_ruleParameterStringType= ruleParameterStringType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterStringTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterStringType=ruleParameterStringType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterStringType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterStringType"


    // $ANTLR start "ruleParameterStringType"
    // InternalVariabilityParser.g:2408:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:2414:2: ( ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? ) )
            // InternalVariabilityParser.g:2415:2: ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? )
            {
            // InternalVariabilityParser.g:2415:2: ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? )
            // InternalVariabilityParser.g:2416:3: () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )?
            {
            // InternalVariabilityParser.g:2416:3: ()
            // InternalVariabilityParser.g:2417:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,String,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getStringKeyword_1());
              		
            }
            // InternalVariabilityParser.g:2427:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Default) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalVariabilityParser.g:2428:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_0());
                      			
                    }
                    // InternalVariabilityParser.g:2432:4: ( (lv_default_3_0= ruleParameterString ) )
                    // InternalVariabilityParser.g:2433:5: (lv_default_3_0= ruleParameterString )
                    {
                    // InternalVariabilityParser.g:2433:5: (lv_default_3_0= ruleParameterString )
                    // InternalVariabilityParser.g:2434:6: lv_default_3_0= ruleParameterString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterStringTypeAccess().getDefaultParameterStringParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterStringTypeRule());
                      						}
                      						set(
                      							current,
                      							"default",
                      							lv_default_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.ParameterString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStringType"


    // $ANTLR start "entryRuleParameterDoubleType"
    // InternalVariabilityParser.g:2456:1: entryRuleParameterDoubleType returns [EObject current=null] : iv_ruleParameterDoubleType= ruleParameterDoubleType EOF ;
    public final EObject entryRuleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDoubleType = null;


        try {
            // InternalVariabilityParser.g:2456:60: (iv_ruleParameterDoubleType= ruleParameterDoubleType EOF )
            // InternalVariabilityParser.g:2457:2: iv_ruleParameterDoubleType= ruleParameterDoubleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDoubleTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterDoubleType=ruleParameterDoubleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDoubleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDoubleType"


    // $ANTLR start "ruleParameterDoubleType"
    // InternalVariabilityParser.g:2463:1: ruleParameterDoubleType returns [EObject current=null] : ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? ) ;
    public final EObject ruleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:2469:2: ( ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? ) )
            // InternalVariabilityParser.g:2470:2: ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            {
            // InternalVariabilityParser.g:2470:2: ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            // InternalVariabilityParser.g:2471:3: () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )?
            {
            // InternalVariabilityParser.g:2471:3: ()
            // InternalVariabilityParser.g:2472:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Double,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1());
              		
            }
            // InternalVariabilityParser.g:2482:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Default) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalVariabilityParser.g:2483:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_0());
                      			
                    }
                    // InternalVariabilityParser.g:2487:4: ( (lv_default_3_0= ruleParameterDouble ) )
                    // InternalVariabilityParser.g:2488:5: (lv_default_3_0= ruleParameterDouble )
                    {
                    // InternalVariabilityParser.g:2488:5: (lv_default_3_0= ruleParameterDouble )
                    // InternalVariabilityParser.g:2489:6: lv_default_3_0= ruleParameterDouble
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterDoubleTypeAccess().getDefaultParameterDoubleParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterDoubleTypeRule());
                      						}
                      						set(
                      							current,
                      							"default",
                      							lv_default_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.ParameterDouble");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDoubleType"


    // $ANTLR start "entryRuleParameterBooleanType"
    // InternalVariabilityParser.g:2511:1: entryRuleParameterBooleanType returns [EObject current=null] : iv_ruleParameterBooleanType= ruleParameterBooleanType EOF ;
    public final EObject entryRuleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBooleanType = null;


        try {
            // InternalVariabilityParser.g:2511:61: (iv_ruleParameterBooleanType= ruleParameterBooleanType EOF )
            // InternalVariabilityParser.g:2512:2: iv_ruleParameterBooleanType= ruleParameterBooleanType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterBooleanTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterBooleanType=ruleParameterBooleanType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterBooleanType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterBooleanType"


    // $ANTLR start "ruleParameterBooleanType"
    // InternalVariabilityParser.g:2518:1: ruleParameterBooleanType returns [EObject current=null] : ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) ;
    public final EObject ruleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:2524:2: ( ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) )
            // InternalVariabilityParser.g:2525:2: ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            {
            // InternalVariabilityParser.g:2525:2: ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            // InternalVariabilityParser.g:2526:3: () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            {
            // InternalVariabilityParser.g:2526:3: ()
            // InternalVariabilityParser.g:2527:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Boolean,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1());
              		
            }
            // InternalVariabilityParser.g:2537:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Default) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalVariabilityParser.g:2538:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_0());
                      			
                    }
                    // InternalVariabilityParser.g:2542:4: ( (lv_default_3_0= ruleParameterBoolean ) )
                    // InternalVariabilityParser.g:2543:5: (lv_default_3_0= ruleParameterBoolean )
                    {
                    // InternalVariabilityParser.g:2543:5: (lv_default_3_0= ruleParameterBoolean )
                    // InternalVariabilityParser.g:2544:6: lv_default_3_0= ruleParameterBoolean
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterBooleanTypeAccess().getDefaultParameterBooleanParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterBooleanTypeRule());
                      						}
                      						set(
                      							current,
                      							"default",
                      							lv_default_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.ParameterBoolean");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterBooleanType"


    // $ANTLR start "entryRuleParameterBase64Type"
    // InternalVariabilityParser.g:2566:1: entryRuleParameterBase64Type returns [EObject current=null] : iv_ruleParameterBase64Type= ruleParameterBase64Type EOF ;
    public final EObject entryRuleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64Type = null;


        try {
            // InternalVariabilityParser.g:2566:60: (iv_ruleParameterBase64Type= ruleParameterBase64Type EOF )
            // InternalVariabilityParser.g:2567:2: iv_ruleParameterBase64Type= ruleParameterBase64Type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterBase64TypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterBase64Type=ruleParameterBase64Type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterBase64Type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterBase64Type"


    // $ANTLR start "ruleParameterBase64Type"
    // InternalVariabilityParser.g:2573:1: ruleParameterBase64Type returns [EObject current=null] : ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) ;
    public final EObject ruleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:2579:2: ( ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) )
            // InternalVariabilityParser.g:2580:2: ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            {
            // InternalVariabilityParser.g:2580:2: ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            // InternalVariabilityParser.g:2581:3: () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            {
            // InternalVariabilityParser.g:2581:3: ()
            // InternalVariabilityParser.g:2582:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Base64,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1());
              		
            }
            // InternalVariabilityParser.g:2592:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Default) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalVariabilityParser.g:2593:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_0());
                      			
                    }
                    // InternalVariabilityParser.g:2597:4: ( (lv_default_3_0= ruleParameterBase64 ) )
                    // InternalVariabilityParser.g:2598:5: (lv_default_3_0= ruleParameterBase64 )
                    {
                    // InternalVariabilityParser.g:2598:5: (lv_default_3_0= ruleParameterBase64 )
                    // InternalVariabilityParser.g:2599:6: lv_default_3_0= ruleParameterBase64
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterBase64TypeAccess().getDefaultParameterBase64ParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterBase64();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterBase64TypeRule());
                      						}
                      						set(
                      							current,
                      							"default",
                      							lv_default_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.ParameterBase64");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterBase64Type"


    // $ANTLR start "entryRuleParameterArrayType"
    // InternalVariabilityParser.g:2621:1: entryRuleParameterArrayType returns [EObject current=null] : iv_ruleParameterArrayType= ruleParameterArrayType EOF ;
    public final EObject entryRuleParameterArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterArrayType = null;


        try {
            // InternalVariabilityParser.g:2621:59: (iv_ruleParameterArrayType= ruleParameterArrayType EOF )
            // InternalVariabilityParser.g:2622:2: iv_ruleParameterArrayType= ruleParameterArrayType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterArrayTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterArrayType=ruleParameterArrayType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterArrayType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterArrayType"


    // $ANTLR start "ruleParameterArrayType"
    // InternalVariabilityParser.g:2628:1: ruleParameterArrayType returns [EObject current=null] : (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= RightSquareBracket (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )? ) ;
    public final EObject ruleParameterArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_type_2_0 = null;

        EObject lv_default_5_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:2634:2: ( (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= RightSquareBracket (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )? ) )
            // InternalVariabilityParser.g:2635:2: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= RightSquareBracket (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )? )
            {
            // InternalVariabilityParser.g:2635:2: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= RightSquareBracket (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )? )
            // InternalVariabilityParser.g:2636:3: otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= RightSquareBracket (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )?
            {
            otherlv_0=(Token)match(input,Array,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterArrayTypeAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalVariabilityParser.g:2644:3: ( (lv_type_2_0= ruleParameterType ) )
            // InternalVariabilityParser.g:2645:4: (lv_type_2_0= ruleParameterType )
            {
            // InternalVariabilityParser.g:2645:4: (lv_type_2_0= ruleParameterType )
            // InternalVariabilityParser.g:2646:5: lv_type_2_0= ruleParameterType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_type_2_0=ruleParameterType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"de.fraunhofer.ipa.ros.Basics.ParameterType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,RightSquareBracket,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getParameterArrayTypeAccess().getRightSquareBracketKeyword_3());
              		
            }
            // InternalVariabilityParser.g:2667:3: (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Default) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalVariabilityParser.g:2668:4: otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) )
                    {
                    otherlv_4=(Token)match(input,Default,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0());
                      			
                    }
                    // InternalVariabilityParser.g:2672:4: ( (lv_default_5_0= ruleParameterList ) )
                    // InternalVariabilityParser.g:2673:5: (lv_default_5_0= ruleParameterList )
                    {
                    // InternalVariabilityParser.g:2673:5: (lv_default_5_0= ruleParameterList )
                    // InternalVariabilityParser.g:2674:6: lv_default_5_0= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_default_5_0=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
                      						}
                      						set(
                      							current,
                      							"default",
                      							lv_default_5_0,
                      							"de.fraunhofer.ipa.ros.Basics.ParameterList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterArrayType"


    // $ANTLR start "entryRuleParameterList"
    // InternalVariabilityParser.g:2696:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalVariabilityParser.g:2696:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalVariabilityParser.g:2697:2: iv_ruleParameterList= ruleParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalVariabilityParser.g:2703:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:2709:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket ) )
            // InternalVariabilityParser.g:2710:2: ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket )
            {
            // InternalVariabilityParser.g:2710:2: ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket )
            // InternalVariabilityParser.g:2711:3: () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket
            {
            // InternalVariabilityParser.g:2711:3: ()
            // InternalVariabilityParser.g:2712:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterListAccess().getParameterSequenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalVariabilityParser.g:2722:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalVariabilityParser.g:2723:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalVariabilityParser.g:2723:4: (lv_value_2_0= ruleParameterValue )
            // InternalVariabilityParser.g:2724:5: lv_value_2_0= ruleParameterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_value_2_0=ruleParameterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterListRule());
              					}
              					add(
              						current,
              						"value",
              						lv_value_2_0,
              						"de.fraunhofer.ipa.ros.Basics.ParameterValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalVariabilityParser.g:2741:3: (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==Comma) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalVariabilityParser.g:2742:4: otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalVariabilityParser.g:2746:4: ( (lv_value_4_0= ruleParameterValue ) )
            	    // InternalVariabilityParser.g:2747:5: (lv_value_4_0= ruleParameterValue )
            	    {
            	    // InternalVariabilityParser.g:2747:5: (lv_value_4_0= ruleParameterValue )
            	    // InternalVariabilityParser.g:2748:6: lv_value_4_0= ruleParameterValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_value_4_0=ruleParameterValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getParameterListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"value",
            	      							lv_value_4_0,
            	      							"de.fraunhofer.ipa.ros.Basics.ParameterValue");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getParameterListAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameterAny"
    // InternalVariabilityParser.g:2774:1: entryRuleParameterAny returns [EObject current=null] : iv_ruleParameterAny= ruleParameterAny EOF ;
    public final EObject entryRuleParameterAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAny = null;


        try {
            // InternalVariabilityParser.g:2774:53: (iv_ruleParameterAny= ruleParameterAny EOF )
            // InternalVariabilityParser.g:2775:2: iv_ruleParameterAny= ruleParameterAny EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterAnyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterAny=ruleParameterAny();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterAny; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterAny"


    // $ANTLR start "ruleParameterAny"
    // InternalVariabilityParser.g:2781:1: ruleParameterAny returns [EObject current=null] : ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleParameterAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:2787:2: ( ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? ) )
            // InternalVariabilityParser.g:2788:2: ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? )
            {
            // InternalVariabilityParser.g:2788:2: ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? )
            // InternalVariabilityParser.g:2789:3: () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )?
            {
            // InternalVariabilityParser.g:2789:3: ()
            // InternalVariabilityParser.g:2790:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterAnyAccess().getParameterAnyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,ParameterAny,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());
              		
            }
            // InternalVariabilityParser.g:2800:3: (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Value) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalVariabilityParser.g:2801:4: otherlv_2= Value ( (lv_value_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Value,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getParameterAnyAccess().getValueKeyword_2_0());
                      			
                    }
                    // InternalVariabilityParser.g:2805:4: ( (lv_value_3_0= ruleEString ) )
                    // InternalVariabilityParser.g:2806:5: (lv_value_3_0= ruleEString )
                    {
                    // InternalVariabilityParser.g:2806:5: (lv_value_3_0= ruleEString )
                    // InternalVariabilityParser.g:2807:6: lv_value_3_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterAnyRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterAny"


    // $ANTLR start "entryRuleParameterString"
    // InternalVariabilityParser.g:2829:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalVariabilityParser.g:2829:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalVariabilityParser.g:2830:2: iv_ruleParameterString= ruleParameterString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterString=ruleParameterString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterString"


    // $ANTLR start "ruleParameterString"
    // InternalVariabilityParser.g:2836:1: ruleParameterString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:2842:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalVariabilityParser.g:2843:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalVariabilityParser.g:2843:2: ( (lv_value_0_0= ruleEString ) )
            // InternalVariabilityParser.g:2844:3: (lv_value_0_0= ruleEString )
            {
            // InternalVariabilityParser.g:2844:3: (lv_value_0_0= ruleEString )
            // InternalVariabilityParser.g:2845:4: lv_value_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getParameterStringRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.fraunhofer.ipa.ros.Basics.EString");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterString"


    // $ANTLR start "entryRuleParameterBase64"
    // InternalVariabilityParser.g:2865:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalVariabilityParser.g:2865:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalVariabilityParser.g:2866:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterBase64Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterBase64=ruleParameterBase64();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterBase64; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterBase64"


    // $ANTLR start "ruleParameterBase64"
    // InternalVariabilityParser.g:2872:1: ruleParameterBase64 returns [EObject current=null] : ( (lv_value_0_0= ruleBase64Binary ) ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:2878:2: ( ( (lv_value_0_0= ruleBase64Binary ) ) )
            // InternalVariabilityParser.g:2879:2: ( (lv_value_0_0= ruleBase64Binary ) )
            {
            // InternalVariabilityParser.g:2879:2: ( (lv_value_0_0= ruleBase64Binary ) )
            // InternalVariabilityParser.g:2880:3: (lv_value_0_0= ruleBase64Binary )
            {
            // InternalVariabilityParser.g:2880:3: (lv_value_0_0= ruleBase64Binary )
            // InternalVariabilityParser.g:2881:4: lv_value_0_0= ruleBase64Binary
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBase64Binary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getParameterBase64Rule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.fraunhofer.ipa.ros.Basics.Base64Binary");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterBase64"


    // $ANTLR start "entryRuleParameterInteger"
    // InternalVariabilityParser.g:2901:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalVariabilityParser.g:2901:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalVariabilityParser.g:2902:2: iv_ruleParameterInteger= ruleParameterInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterInteger=ruleParameterInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterInteger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterInteger"


    // $ANTLR start "ruleParameterInteger"
    // InternalVariabilityParser.g:2908:1: ruleParameterInteger returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:2914:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalVariabilityParser.g:2915:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalVariabilityParser.g:2915:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalVariabilityParser.g:2916:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalVariabilityParser.g:2916:3: (lv_value_0_0= ruleInteger0 )
            // InternalVariabilityParser.g:2917:4: lv_value_0_0= ruleInteger0
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getParameterIntegerAccess().getValueInteger0ParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleInteger0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getParameterIntegerRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.fraunhofer.ipa.ros.Basics.Integer0");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterInteger"


    // $ANTLR start "entryRuleParameterDouble"
    // InternalVariabilityParser.g:2937:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalVariabilityParser.g:2937:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalVariabilityParser.g:2938:2: iv_ruleParameterDouble= ruleParameterDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterDouble=ruleParameterDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDouble; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDouble"


    // $ANTLR start "ruleParameterDouble"
    // InternalVariabilityParser.g:2944:1: ruleParameterDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:2950:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalVariabilityParser.g:2951:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalVariabilityParser.g:2951:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalVariabilityParser.g:2952:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalVariabilityParser.g:2952:3: (lv_value_0_0= ruleDouble0 )
            // InternalVariabilityParser.g:2953:4: lv_value_0_0= ruleDouble0
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getParameterDoubleAccess().getValueDouble0ParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDouble0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getParameterDoubleRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.fraunhofer.ipa.ros.Basics.Double0");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDouble"


    // $ANTLR start "entryRuleParameterBoolean"
    // InternalVariabilityParser.g:2973:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalVariabilityParser.g:2973:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalVariabilityParser.g:2974:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterBoolean=ruleParameterBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterBoolean"


    // $ANTLR start "ruleParameterBoolean"
    // InternalVariabilityParser.g:2980:1: ruleParameterBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleboolean0 ) ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:2986:2: ( ( (lv_value_0_0= ruleboolean0 ) ) )
            // InternalVariabilityParser.g:2987:2: ( (lv_value_0_0= ruleboolean0 ) )
            {
            // InternalVariabilityParser.g:2987:2: ( (lv_value_0_0= ruleboolean0 ) )
            // InternalVariabilityParser.g:2988:3: (lv_value_0_0= ruleboolean0 )
            {
            // InternalVariabilityParser.g:2988:3: (lv_value_0_0= ruleboolean0 )
            // InternalVariabilityParser.g:2989:4: lv_value_0_0= ruleboolean0
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getParameterBooleanAccess().getValueBoolean0ParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleboolean0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getParameterBooleanRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.fraunhofer.ipa.ros.Basics.boolean0");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterBoolean"


    // $ANTLR start "entryRuleParameterStruct"
    // InternalVariabilityParser.g:3009:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalVariabilityParser.g:3009:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalVariabilityParser.g:3010:2: iv_ruleParameterStruct= ruleParameterStruct EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterStructRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterStruct=ruleParameterStruct();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterStruct; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterStruct"


    // $ANTLR start "ruleParameterStruct"
    // InternalVariabilityParser.g:3016:1: ruleParameterStruct returns [EObject current=null] : ( () (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )? ) ;
    public final EObject ruleParameterStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_4=null;
        Token this_END_5=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:3022:2: ( ( () (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )? ) )
            // InternalVariabilityParser.g:3023:2: ( () (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )? )
            {
            // InternalVariabilityParser.g:3023:2: ( () (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )? )
            // InternalVariabilityParser.g:3024:3: () (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )?
            {
            // InternalVariabilityParser.g:3024:3: ()
            // InternalVariabilityParser.g:3025:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
              					current);
              			
            }

            }

            // InternalVariabilityParser.g:3031:3: (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==LeftSquareBracket) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalVariabilityParser.g:3032:4: otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END
                    {
                    otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_2, grammarAccess.getParameterStructAccess().getBEGINTerminalRuleCall_1_1());
                      			
                    }
                    // InternalVariabilityParser.g:3040:4: ( (lv_value_3_0= ruleParameterStructMember ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_STRING)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalVariabilityParser.g:3041:5: (lv_value_3_0= ruleParameterStructMember )
                    	    {
                    	    // InternalVariabilityParser.g:3041:5: (lv_value_3_0= ruleParameterStructMember )
                    	    // InternalVariabilityParser.g:3042:6: lv_value_3_0= ruleParameterStructMember
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_38);
                    	    lv_value_3_0=ruleParameterStructMember();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getParameterStructRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"value",
                    	      							lv_value_3_0,
                    	      							"de.fraunhofer.ipa.ros.Basics.ParameterStructMember");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_3());
                      			
                    }
                    this_END_5=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_5, grammarAccess.getParameterStructAccess().getENDTerminalRuleCall_1_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStruct"


    // $ANTLR start "entryRuleParameterDate"
    // InternalVariabilityParser.g:3072:1: entryRuleParameterDate returns [EObject current=null] : iv_ruleParameterDate= ruleParameterDate EOF ;
    public final EObject entryRuleParameterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDate = null;


        try {
            // InternalVariabilityParser.g:3072:54: (iv_ruleParameterDate= ruleParameterDate EOF )
            // InternalVariabilityParser.g:3073:2: iv_ruleParameterDate= ruleParameterDate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterDate=ruleParameterDate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDate"


    // $ANTLR start "ruleParameterDate"
    // InternalVariabilityParser.g:3079:1: ruleParameterDate returns [EObject current=null] : ( (lv_value_0_0= ruleDateTime0 ) ) ;
    public final EObject ruleParameterDate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:3085:2: ( ( (lv_value_0_0= ruleDateTime0 ) ) )
            // InternalVariabilityParser.g:3086:2: ( (lv_value_0_0= ruleDateTime0 ) )
            {
            // InternalVariabilityParser.g:3086:2: ( (lv_value_0_0= ruleDateTime0 ) )
            // InternalVariabilityParser.g:3087:3: (lv_value_0_0= ruleDateTime0 )
            {
            // InternalVariabilityParser.g:3087:3: (lv_value_0_0= ruleDateTime0 )
            // InternalVariabilityParser.g:3088:4: lv_value_0_0= ruleDateTime0
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getParameterDateAccess().getValueDateTime0ParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDateTime0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getParameterDateRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.fraunhofer.ipa.ros.Basics.DateTime0");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDate"


    // $ANTLR start "entryRuleParameterStructMember"
    // InternalVariabilityParser.g:3108:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalVariabilityParser.g:3108:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalVariabilityParser.g:3109:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterStructMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructMember=ruleParameterStructMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterStructMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterStructMember"


    // $ANTLR start "ruleParameterStructMember"
    // InternalVariabilityParser.g:3115:1: ruleParameterStructMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleParameterValue ) ) ) ;
    public final EObject ruleParameterStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:3121:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleParameterValue ) ) ) )
            // InternalVariabilityParser.g:3122:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleParameterValue ) ) )
            {
            // InternalVariabilityParser.g:3122:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleParameterValue ) ) )
            // InternalVariabilityParser.g:3123:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleParameterValue ) )
            {
            // InternalVariabilityParser.g:3123:3: ( (lv_name_0_0= ruleEString ) )
            // InternalVariabilityParser.g:3124:4: (lv_name_0_0= ruleEString )
            {
            // InternalVariabilityParser.g:3124:4: (lv_name_0_0= ruleEString )
            // InternalVariabilityParser.g:3125:5: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterStructMemberRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"de.fraunhofer.ipa.ros.Basics.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterStructMemberAccess().getColonKeyword_1());
              		
            }
            // InternalVariabilityParser.g:3146:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalVariabilityParser.g:3147:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalVariabilityParser.g:3147:4: (lv_value_2_0= ruleParameterValue )
            // InternalVariabilityParser.g:3148:5: lv_value_2_0= ruleParameterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleParameterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterStructMemberRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"de.fraunhofer.ipa.ros.Basics.ParameterValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStructMember"


    // $ANTLR start "entryRuleParameterStructTypeMember"
    // InternalVariabilityParser.g:3169:1: entryRuleParameterStructTypeMember returns [EObject current=null] : iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF ;
    public final EObject entryRuleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructTypeMember = null;


        try {
            // InternalVariabilityParser.g:3169:66: (iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF )
            // InternalVariabilityParser.g:3170:2: iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterStructTypeMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructTypeMember=ruleParameterStructTypeMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterStructTypeMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterStructTypeMember"


    // $ANTLR start "ruleParameterStructTypeMember"
    // InternalVariabilityParser.g:3176:1: ruleParameterStructTypeMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) ;
    public final EObject ruleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:3182:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) )
            // InternalVariabilityParser.g:3183:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            {
            // InternalVariabilityParser.g:3183:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            // InternalVariabilityParser.g:3184:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) )
            {
            // InternalVariabilityParser.g:3184:3: ( (lv_name_0_0= ruleEString ) )
            // InternalVariabilityParser.g:3185:4: (lv_name_0_0= ruleEString )
            {
            // InternalVariabilityParser.g:3185:4: (lv_name_0_0= ruleEString )
            // InternalVariabilityParser.g:3186:5: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_name_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"de.fraunhofer.ipa.ros.Basics.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalVariabilityParser.g:3203:3: ( (lv_type_1_0= ruleParameterType ) )
            // InternalVariabilityParser.g:3204:4: (lv_type_1_0= ruleParameterType )
            {
            // InternalVariabilityParser.g:3204:4: (lv_type_1_0= ruleParameterType )
            // InternalVariabilityParser.g:3205:5: lv_type_1_0= ruleParameterType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleParameterType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"de.fraunhofer.ipa.ros.Basics.ParameterType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStructTypeMember"


    // $ANTLR start "entryRuleBase64Binary"
    // InternalVariabilityParser.g:3226:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalVariabilityParser.g:3226:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalVariabilityParser.g:3227:2: iv_ruleBase64Binary= ruleBase64Binary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBase64BinaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBase64Binary=ruleBase64Binary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBase64Binary.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBase64Binary"


    // $ANTLR start "ruleBase64Binary"
    // InternalVariabilityParser.g:3233:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BINARY_0= RULE_BINARY ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_0=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:3239:2: (this_BINARY_0= RULE_BINARY )
            // InternalVariabilityParser.g:3240:2: this_BINARY_0= RULE_BINARY
            {
            this_BINARY_0=(Token)match(input,RULE_BINARY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_BINARY_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_BINARY_0, grammarAccess.getBase64BinaryAccess().getBINARYTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBase64Binary"


    // $ANTLR start "entryRuleboolean0"
    // InternalVariabilityParser.g:3250:1: entryRuleboolean0 returns [String current=null] : iv_ruleboolean0= ruleboolean0 EOF ;
    public final String entryRuleboolean0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleboolean0 = null;


        try {
            // InternalVariabilityParser.g:3250:48: (iv_ruleboolean0= ruleboolean0 EOF )
            // InternalVariabilityParser.g:3251:2: iv_ruleboolean0= ruleboolean0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolean0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleboolean0=ruleboolean0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleboolean0.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleboolean0"


    // $ANTLR start "ruleboolean0"
    // InternalVariabilityParser.g:3257:1: ruleboolean0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_0= RULE_BOOLEAN ;
    public final AntlrDatatypeRuleToken ruleboolean0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:3263:2: (this_BOOLEAN_0= RULE_BOOLEAN )
            // InternalVariabilityParser.g:3264:2: this_BOOLEAN_0= RULE_BOOLEAN
            {
            this_BOOLEAN_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_BOOLEAN_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_BOOLEAN_0, grammarAccess.getBoolean0Access().getBOOLEANTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleboolean0"


    // $ANTLR start "entryRuleDouble0"
    // InternalVariabilityParser.g:3274:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalVariabilityParser.g:3274:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalVariabilityParser.g:3275:2: iv_ruleDouble0= ruleDouble0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDouble0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDouble0=ruleDouble0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDouble0.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDouble0"


    // $ANTLR start "ruleDouble0"
    // InternalVariabilityParser.g:3281:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:3287:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalVariabilityParser.g:3288:2: this_DOUBLE_0= RULE_DOUBLE
            {
            this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DOUBLE_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_DOUBLE_0, grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble0"


    // $ANTLR start "entryRuleInteger0"
    // InternalVariabilityParser.g:3298:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalVariabilityParser.g:3298:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalVariabilityParser.g:3299:2: iv_ruleInteger0= ruleInteger0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteger0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInteger0=ruleInteger0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger0.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger0"


    // $ANTLR start "ruleInteger0"
    // InternalVariabilityParser.g:3305:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:3311:2: (this_DECINT_0= RULE_DECINT )
            // InternalVariabilityParser.g:3312:2: this_DECINT_0= RULE_DECINT
            {
            this_DECINT_0=(Token)match(input,RULE_DECINT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DECINT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_DECINT_0, grammarAccess.getInteger0Access().getDECINTTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger0"


    // $ANTLR start "entryRuleDateTime0"
    // InternalVariabilityParser.g:3322:1: entryRuleDateTime0 returns [String current=null] : iv_ruleDateTime0= ruleDateTime0 EOF ;
    public final String entryRuleDateTime0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime0 = null;


        try {
            // InternalVariabilityParser.g:3322:49: (iv_ruleDateTime0= ruleDateTime0 EOF )
            // InternalVariabilityParser.g:3323:2: iv_ruleDateTime0= ruleDateTime0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateTime0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDateTime0=ruleDateTime0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDateTime0.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateTime0"


    // $ANTLR start "ruleDateTime0"
    // InternalVariabilityParser.g:3329:1: ruleDateTime0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_TIME_0= RULE_DATE_TIME ;
    public final AntlrDatatypeRuleToken ruleDateTime0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_TIME_0=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:3335:2: (this_DATE_TIME_0= RULE_DATE_TIME )
            // InternalVariabilityParser.g:3336:2: this_DATE_TIME_0= RULE_DATE_TIME
            {
            this_DATE_TIME_0=(Token)match(input,RULE_DATE_TIME,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DATE_TIME_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_DATE_TIME_0, grammarAccess.getDateTime0Access().getDATE_TIMETerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateTime0"


    // $ANTLR start "entryRuleAbstractType"
    // InternalVariabilityParser.g:3346:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // InternalVariabilityParser.g:3346:53: (iv_ruleAbstractType= ruleAbstractType EOF )
            // InternalVariabilityParser.g:3347:2: iv_ruleAbstractType= ruleAbstractType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractType=ruleAbstractType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // InternalVariabilityParser.g:3353:1: ruleAbstractType returns [EObject current=null] : (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray ) ;
    public final EObject ruleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject this_bool_0 = null;

        EObject this_int8_1 = null;

        EObject this_uint8_2 = null;

        EObject this_int16_3 = null;

        EObject this_uint16_4 = null;

        EObject this_int32_5 = null;

        EObject this_uint32_6 = null;

        EObject this_int64_7 = null;

        EObject this_uint64_8 = null;

        EObject this_float32_9 = null;

        EObject this_float64_10 = null;

        EObject this_string0_11 = null;

        EObject this_byte_12 = null;

        EObject this_time_13 = null;

        EObject this_duration_14 = null;

        EObject this_Header_15 = null;

        EObject this_boolArray_16 = null;

        EObject this_int8Array_17 = null;

        EObject this_uint8Array_18 = null;

        EObject this_int16Array_19 = null;

        EObject this_uint16Array_20 = null;

        EObject this_int32Array_21 = null;

        EObject this_uint32Array_22 = null;

        EObject this_int64Array_23 = null;

        EObject this_uint64Array_24 = null;

        EObject this_float32Array_25 = null;

        EObject this_float64Array_26 = null;

        EObject this_string0Array_27 = null;

        EObject this_byteArray_28 = null;

        EObject this_SpecBaseRef_29 = null;

        EObject this_ArraySpecRef_30 = null;

        EObject this_char_31 = null;

        EObject this_charArray_32 = null;



        	enterRule();

        try {
            // InternalVariabilityParser.g:3359:2: ( (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray ) )
            // InternalVariabilityParser.g:3360:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray )
            {
            // InternalVariabilityParser.g:3360:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray )
            int alt44=33;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // InternalVariabilityParser.g:3361:3: this_bool_0= rulebool
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getBoolParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_bool_0=rulebool();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_bool_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVariabilityParser.g:3370:3: this_int8_1= ruleint8
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt8ParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_int8_1=ruleint8();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_int8_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVariabilityParser.g:3379:3: this_uint8_2= ruleuint8
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint8ParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_uint8_2=ruleuint8();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_uint8_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVariabilityParser.g:3388:3: this_int16_3= ruleint16
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt16ParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_int16_3=ruleint16();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_int16_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalVariabilityParser.g:3397:3: this_uint16_4= ruleuint16
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint16ParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_uint16_4=ruleuint16();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_uint16_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalVariabilityParser.g:3406:3: this_int32_5= ruleint32
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt32ParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_int32_5=ruleint32();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_int32_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalVariabilityParser.g:3415:3: this_uint32_6= ruleuint32
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint32ParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_uint32_6=ruleuint32();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_uint32_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalVariabilityParser.g:3424:3: this_int64_7= ruleint64
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt64ParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_int64_7=ruleint64();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_int64_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalVariabilityParser.g:3433:3: this_uint64_8= ruleuint64
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint64ParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_uint64_8=ruleuint64();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_uint64_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalVariabilityParser.g:3442:3: this_float32_9= rulefloat32
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat32ParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_float32_9=rulefloat32();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_float32_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalVariabilityParser.g:3451:3: this_float64_10= rulefloat64
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat64ParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_float64_10=rulefloat64();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_float64_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalVariabilityParser.g:3460:3: this_string0_11= rulestring0
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getString0ParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_string0_11=rulestring0();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_string0_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalVariabilityParser.g:3469:3: this_byte_12= rulebyte
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getByteParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_byte_12=rulebyte();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_byte_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalVariabilityParser.g:3478:3: this_time_13= ruletime
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getTimeParserRuleCall_13());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_time_13=ruletime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_time_13;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalVariabilityParser.g:3487:3: this_duration_14= ruleduration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getDurationParserRuleCall_14());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_duration_14=ruleduration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_duration_14;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalVariabilityParser.g:3496:3: this_Header_15= ruleHeader
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getHeaderParserRuleCall_15());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Header_15=ruleHeader();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Header_15;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalVariabilityParser.g:3505:3: this_boolArray_16= ruleboolArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getBoolArrayParserRuleCall_16());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_boolArray_16=ruleboolArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_boolArray_16;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalVariabilityParser.g:3514:3: this_int8Array_17= ruleint8Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt8ArrayParserRuleCall_17());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_int8Array_17=ruleint8Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_int8Array_17;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalVariabilityParser.g:3523:3: this_uint8Array_18= ruleuint8Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint8ArrayParserRuleCall_18());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_uint8Array_18=ruleuint8Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_uint8Array_18;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 20 :
                    // InternalVariabilityParser.g:3532:3: this_int16Array_19= ruleint16Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt16ArrayParserRuleCall_19());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_int16Array_19=ruleint16Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_int16Array_19;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 21 :
                    // InternalVariabilityParser.g:3541:3: this_uint16Array_20= ruleuint16Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint16ArrayParserRuleCall_20());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_uint16Array_20=ruleuint16Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_uint16Array_20;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 22 :
                    // InternalVariabilityParser.g:3550:3: this_int32Array_21= ruleint32Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt32ArrayParserRuleCall_21());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_int32Array_21=ruleint32Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_int32Array_21;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 23 :
                    // InternalVariabilityParser.g:3559:3: this_uint32Array_22= ruleuint32Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint32ArrayParserRuleCall_22());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_uint32Array_22=ruleuint32Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_uint32Array_22;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 24 :
                    // InternalVariabilityParser.g:3568:3: this_int64Array_23= ruleint64Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt64ArrayParserRuleCall_23());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_int64Array_23=ruleint64Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_int64Array_23;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 25 :
                    // InternalVariabilityParser.g:3577:3: this_uint64Array_24= ruleuint64Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint64ArrayParserRuleCall_24());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_uint64Array_24=ruleuint64Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_uint64Array_24;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 26 :
                    // InternalVariabilityParser.g:3586:3: this_float32Array_25= rulefloat32Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat32ArrayParserRuleCall_25());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_float32Array_25=rulefloat32Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_float32Array_25;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 27 :
                    // InternalVariabilityParser.g:3595:3: this_float64Array_26= rulefloat64Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat64ArrayParserRuleCall_26());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_float64Array_26=rulefloat64Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_float64Array_26;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 28 :
                    // InternalVariabilityParser.g:3604:3: this_string0Array_27= rulestring0Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getString0ArrayParserRuleCall_27());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_string0Array_27=rulestring0Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_string0Array_27;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 29 :
                    // InternalVariabilityParser.g:3613:3: this_byteArray_28= rulebyteArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getByteArrayParserRuleCall_28());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_byteArray_28=rulebyteArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_byteArray_28;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 30 :
                    // InternalVariabilityParser.g:3622:3: this_SpecBaseRef_29= ruleSpecBaseRef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getSpecBaseRefParserRuleCall_29());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SpecBaseRef_29=ruleSpecBaseRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SpecBaseRef_29;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 31 :
                    // InternalVariabilityParser.g:3631:3: this_ArraySpecRef_30= ruleArraySpecRef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getArraySpecRefParserRuleCall_30());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArraySpecRef_30=ruleArraySpecRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArraySpecRef_30;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 32 :
                    // InternalVariabilityParser.g:3640:3: this_char_31= rulechar
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getCharParserRuleCall_31());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_char_31=rulechar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_char_31;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 33 :
                    // InternalVariabilityParser.g:3649:3: this_charArray_32= rulecharArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getCharArrayParserRuleCall_32());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_charArray_32=rulecharArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_charArray_32;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractType"


    // $ANTLR start "entryRulebool"
    // InternalVariabilityParser.g:3661:1: entryRulebool returns [EObject current=null] : iv_rulebool= rulebool EOF ;
    public final EObject entryRulebool() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebool = null;


        try {
            // InternalVariabilityParser.g:3661:45: (iv_rulebool= rulebool EOF )
            // InternalVariabilityParser.g:3662:2: iv_rulebool= rulebool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulebool=rulebool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebool; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebool"


    // $ANTLR start "rulebool"
    // InternalVariabilityParser.g:3668:1: rulebool returns [EObject current=null] : ( () otherlv_1= Bool ) ;
    public final EObject rulebool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:3674:2: ( ( () otherlv_1= Bool ) )
            // InternalVariabilityParser.g:3675:2: ( () otherlv_1= Bool )
            {
            // InternalVariabilityParser.g:3675:2: ( () otherlv_1= Bool )
            // InternalVariabilityParser.g:3676:3: () otherlv_1= Bool
            {
            // InternalVariabilityParser.g:3676:3: ()
            // InternalVariabilityParser.g:3677:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBoolAccess().getBoolAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Bool,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBoolAccess().getBoolKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebool"


    // $ANTLR start "entryRuleint8"
    // InternalVariabilityParser.g:3691:1: entryRuleint8 returns [EObject current=null] : iv_ruleint8= ruleint8 EOF ;
    public final EObject entryRuleint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8 = null;


        try {
            // InternalVariabilityParser.g:3691:45: (iv_ruleint8= ruleint8 EOF )
            // InternalVariabilityParser.g:3692:2: iv_ruleint8= ruleint8 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt8Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleint8=ruleint8();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleint8; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleint8"


    // $ANTLR start "ruleint8"
    // InternalVariabilityParser.g:3698:1: ruleint8 returns [EObject current=null] : ( () otherlv_1= Int8 ) ;
    public final EObject ruleint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:3704:2: ( ( () otherlv_1= Int8 ) )
            // InternalVariabilityParser.g:3705:2: ( () otherlv_1= Int8 )
            {
            // InternalVariabilityParser.g:3705:2: ( () otherlv_1= Int8 )
            // InternalVariabilityParser.g:3706:3: () otherlv_1= Int8
            {
            // InternalVariabilityParser.g:3706:3: ()
            // InternalVariabilityParser.g:3707:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInt8Access().getInt8Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Int8,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInt8Access().getInt8Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint8"


    // $ANTLR start "entryRuleuint8"
    // InternalVariabilityParser.g:3721:1: entryRuleuint8 returns [EObject current=null] : iv_ruleuint8= ruleuint8 EOF ;
    public final EObject entryRuleuint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8 = null;


        try {
            // InternalVariabilityParser.g:3721:46: (iv_ruleuint8= ruleuint8 EOF )
            // InternalVariabilityParser.g:3722:2: iv_ruleuint8= ruleuint8 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUint8Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleuint8=ruleuint8();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleuint8; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuint8"


    // $ANTLR start "ruleuint8"
    // InternalVariabilityParser.g:3728:1: ruleuint8 returns [EObject current=null] : ( () otherlv_1= Uint8 ) ;
    public final EObject ruleuint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:3734:2: ( ( () otherlv_1= Uint8 ) )
            // InternalVariabilityParser.g:3735:2: ( () otherlv_1= Uint8 )
            {
            // InternalVariabilityParser.g:3735:2: ( () otherlv_1= Uint8 )
            // InternalVariabilityParser.g:3736:3: () otherlv_1= Uint8
            {
            // InternalVariabilityParser.g:3736:3: ()
            // InternalVariabilityParser.g:3737:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUint8Access().getUint8Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Uint8,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUint8Access().getUint8Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint8"


    // $ANTLR start "entryRuleint16"
    // InternalVariabilityParser.g:3751:1: entryRuleint16 returns [EObject current=null] : iv_ruleint16= ruleint16 EOF ;
    public final EObject entryRuleint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16 = null;


        try {
            // InternalVariabilityParser.g:3751:46: (iv_ruleint16= ruleint16 EOF )
            // InternalVariabilityParser.g:3752:2: iv_ruleint16= ruleint16 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt16Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleint16=ruleint16();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleint16; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleint16"


    // $ANTLR start "ruleint16"
    // InternalVariabilityParser.g:3758:1: ruleint16 returns [EObject current=null] : ( () otherlv_1= Int16 ) ;
    public final EObject ruleint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:3764:2: ( ( () otherlv_1= Int16 ) )
            // InternalVariabilityParser.g:3765:2: ( () otherlv_1= Int16 )
            {
            // InternalVariabilityParser.g:3765:2: ( () otherlv_1= Int16 )
            // InternalVariabilityParser.g:3766:3: () otherlv_1= Int16
            {
            // InternalVariabilityParser.g:3766:3: ()
            // InternalVariabilityParser.g:3767:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInt16Access().getInt16Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Int16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInt16Access().getInt16Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint16"


    // $ANTLR start "entryRuleuint16"
    // InternalVariabilityParser.g:3781:1: entryRuleuint16 returns [EObject current=null] : iv_ruleuint16= ruleuint16 EOF ;
    public final EObject entryRuleuint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16 = null;


        try {
            // InternalVariabilityParser.g:3781:47: (iv_ruleuint16= ruleuint16 EOF )
            // InternalVariabilityParser.g:3782:2: iv_ruleuint16= ruleuint16 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUint16Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleuint16=ruleuint16();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleuint16; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuint16"


    // $ANTLR start "ruleuint16"
    // InternalVariabilityParser.g:3788:1: ruleuint16 returns [EObject current=null] : ( () otherlv_1= Uint16 ) ;
    public final EObject ruleuint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:3794:2: ( ( () otherlv_1= Uint16 ) )
            // InternalVariabilityParser.g:3795:2: ( () otherlv_1= Uint16 )
            {
            // InternalVariabilityParser.g:3795:2: ( () otherlv_1= Uint16 )
            // InternalVariabilityParser.g:3796:3: () otherlv_1= Uint16
            {
            // InternalVariabilityParser.g:3796:3: ()
            // InternalVariabilityParser.g:3797:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUint16Access().getUint16Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Uint16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUint16Access().getUint16Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint16"


    // $ANTLR start "entryRuleint32"
    // InternalVariabilityParser.g:3811:1: entryRuleint32 returns [EObject current=null] : iv_ruleint32= ruleint32 EOF ;
    public final EObject entryRuleint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32 = null;


        try {
            // InternalVariabilityParser.g:3811:46: (iv_ruleint32= ruleint32 EOF )
            // InternalVariabilityParser.g:3812:2: iv_ruleint32= ruleint32 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt32Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleint32=ruleint32();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleint32; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleint32"


    // $ANTLR start "ruleint32"
    // InternalVariabilityParser.g:3818:1: ruleint32 returns [EObject current=null] : ( () otherlv_1= Int32 ) ;
    public final EObject ruleint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:3824:2: ( ( () otherlv_1= Int32 ) )
            // InternalVariabilityParser.g:3825:2: ( () otherlv_1= Int32 )
            {
            // InternalVariabilityParser.g:3825:2: ( () otherlv_1= Int32 )
            // InternalVariabilityParser.g:3826:3: () otherlv_1= Int32
            {
            // InternalVariabilityParser.g:3826:3: ()
            // InternalVariabilityParser.g:3827:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInt32Access().getInt32Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Int32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInt32Access().getInt32Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint32"


    // $ANTLR start "entryRuleuint32"
    // InternalVariabilityParser.g:3841:1: entryRuleuint32 returns [EObject current=null] : iv_ruleuint32= ruleuint32 EOF ;
    public final EObject entryRuleuint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32 = null;


        try {
            // InternalVariabilityParser.g:3841:47: (iv_ruleuint32= ruleuint32 EOF )
            // InternalVariabilityParser.g:3842:2: iv_ruleuint32= ruleuint32 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUint32Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleuint32=ruleuint32();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleuint32; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuint32"


    // $ANTLR start "ruleuint32"
    // InternalVariabilityParser.g:3848:1: ruleuint32 returns [EObject current=null] : ( () otherlv_1= Uint32 ) ;
    public final EObject ruleuint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:3854:2: ( ( () otherlv_1= Uint32 ) )
            // InternalVariabilityParser.g:3855:2: ( () otherlv_1= Uint32 )
            {
            // InternalVariabilityParser.g:3855:2: ( () otherlv_1= Uint32 )
            // InternalVariabilityParser.g:3856:3: () otherlv_1= Uint32
            {
            // InternalVariabilityParser.g:3856:3: ()
            // InternalVariabilityParser.g:3857:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUint32Access().getUint32Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Uint32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUint32Access().getUint32Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint32"


    // $ANTLR start "entryRuleint64"
    // InternalVariabilityParser.g:3871:1: entryRuleint64 returns [EObject current=null] : iv_ruleint64= ruleint64 EOF ;
    public final EObject entryRuleint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64 = null;


        try {
            // InternalVariabilityParser.g:3871:46: (iv_ruleint64= ruleint64 EOF )
            // InternalVariabilityParser.g:3872:2: iv_ruleint64= ruleint64 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt64Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleint64=ruleint64();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleint64; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleint64"


    // $ANTLR start "ruleint64"
    // InternalVariabilityParser.g:3878:1: ruleint64 returns [EObject current=null] : ( () otherlv_1= Int64 ) ;
    public final EObject ruleint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:3884:2: ( ( () otherlv_1= Int64 ) )
            // InternalVariabilityParser.g:3885:2: ( () otherlv_1= Int64 )
            {
            // InternalVariabilityParser.g:3885:2: ( () otherlv_1= Int64 )
            // InternalVariabilityParser.g:3886:3: () otherlv_1= Int64
            {
            // InternalVariabilityParser.g:3886:3: ()
            // InternalVariabilityParser.g:3887:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInt64Access().getInt64Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Int64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInt64Access().getInt64Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint64"


    // $ANTLR start "entryRuleuint64"
    // InternalVariabilityParser.g:3901:1: entryRuleuint64 returns [EObject current=null] : iv_ruleuint64= ruleuint64 EOF ;
    public final EObject entryRuleuint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64 = null;


        try {
            // InternalVariabilityParser.g:3901:47: (iv_ruleuint64= ruleuint64 EOF )
            // InternalVariabilityParser.g:3902:2: iv_ruleuint64= ruleuint64 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUint64Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleuint64=ruleuint64();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleuint64; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuint64"


    // $ANTLR start "ruleuint64"
    // InternalVariabilityParser.g:3908:1: ruleuint64 returns [EObject current=null] : ( () otherlv_1= Uint64 ) ;
    public final EObject ruleuint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:3914:2: ( ( () otherlv_1= Uint64 ) )
            // InternalVariabilityParser.g:3915:2: ( () otherlv_1= Uint64 )
            {
            // InternalVariabilityParser.g:3915:2: ( () otherlv_1= Uint64 )
            // InternalVariabilityParser.g:3916:3: () otherlv_1= Uint64
            {
            // InternalVariabilityParser.g:3916:3: ()
            // InternalVariabilityParser.g:3917:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUint64Access().getUint64Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Uint64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUint64Access().getUint64Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint64"


    // $ANTLR start "entryRulefloat32"
    // InternalVariabilityParser.g:3931:1: entryRulefloat32 returns [EObject current=null] : iv_rulefloat32= rulefloat32 EOF ;
    public final EObject entryRulefloat32() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32 = null;


        try {
            // InternalVariabilityParser.g:3931:48: (iv_rulefloat32= rulefloat32 EOF )
            // InternalVariabilityParser.g:3932:2: iv_rulefloat32= rulefloat32 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloat32Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefloat32=rulefloat32();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefloat32; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefloat32"


    // $ANTLR start "rulefloat32"
    // InternalVariabilityParser.g:3938:1: rulefloat32 returns [EObject current=null] : ( () otherlv_1= Float32 ) ;
    public final EObject rulefloat32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:3944:2: ( ( () otherlv_1= Float32 ) )
            // InternalVariabilityParser.g:3945:2: ( () otherlv_1= Float32 )
            {
            // InternalVariabilityParser.g:3945:2: ( () otherlv_1= Float32 )
            // InternalVariabilityParser.g:3946:3: () otherlv_1= Float32
            {
            // InternalVariabilityParser.g:3946:3: ()
            // InternalVariabilityParser.g:3947:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFloat32Access().getFloat32Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Float32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFloat32Access().getFloat32Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefloat32"


    // $ANTLR start "entryRulefloat64"
    // InternalVariabilityParser.g:3961:1: entryRulefloat64 returns [EObject current=null] : iv_rulefloat64= rulefloat64 EOF ;
    public final EObject entryRulefloat64() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64 = null;


        try {
            // InternalVariabilityParser.g:3961:48: (iv_rulefloat64= rulefloat64 EOF )
            // InternalVariabilityParser.g:3962:2: iv_rulefloat64= rulefloat64 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloat64Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefloat64=rulefloat64();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefloat64; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefloat64"


    // $ANTLR start "rulefloat64"
    // InternalVariabilityParser.g:3968:1: rulefloat64 returns [EObject current=null] : ( () otherlv_1= Float64 ) ;
    public final EObject rulefloat64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:3974:2: ( ( () otherlv_1= Float64 ) )
            // InternalVariabilityParser.g:3975:2: ( () otherlv_1= Float64 )
            {
            // InternalVariabilityParser.g:3975:2: ( () otherlv_1= Float64 )
            // InternalVariabilityParser.g:3976:3: () otherlv_1= Float64
            {
            // InternalVariabilityParser.g:3976:3: ()
            // InternalVariabilityParser.g:3977:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFloat64Access().getFloat64Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Float64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFloat64Access().getFloat64Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefloat64"


    // $ANTLR start "entryRulestring0"
    // InternalVariabilityParser.g:3991:1: entryRulestring0 returns [EObject current=null] : iv_rulestring0= rulestring0 EOF ;
    public final EObject entryRulestring0() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0 = null;


        try {
            // InternalVariabilityParser.g:3991:48: (iv_rulestring0= rulestring0 EOF )
            // InternalVariabilityParser.g:3992:2: iv_rulestring0= rulestring0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getString0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestring0=rulestring0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestring0; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestring0"


    // $ANTLR start "rulestring0"
    // InternalVariabilityParser.g:3998:1: rulestring0 returns [EObject current=null] : ( () otherlv_1= String_1 ) ;
    public final EObject rulestring0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4004:2: ( ( () otherlv_1= String_1 ) )
            // InternalVariabilityParser.g:4005:2: ( () otherlv_1= String_1 )
            {
            // InternalVariabilityParser.g:4005:2: ( () otherlv_1= String_1 )
            // InternalVariabilityParser.g:4006:3: () otherlv_1= String_1
            {
            // InternalVariabilityParser.g:4006:3: ()
            // InternalVariabilityParser.g:4007:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getString0Access().getStringAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,String_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getString0Access().getStringKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestring0"


    // $ANTLR start "entryRulechar"
    // InternalVariabilityParser.g:4021:1: entryRulechar returns [EObject current=null] : iv_rulechar= rulechar EOF ;
    public final EObject entryRulechar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulechar = null;


        try {
            // InternalVariabilityParser.g:4021:45: (iv_rulechar= rulechar EOF )
            // InternalVariabilityParser.g:4022:2: iv_rulechar= rulechar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulechar=rulechar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulechar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulechar"


    // $ANTLR start "rulechar"
    // InternalVariabilityParser.g:4028:1: rulechar returns [EObject current=null] : ( () otherlv_1= Char ) ;
    public final EObject rulechar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4034:2: ( ( () otherlv_1= Char ) )
            // InternalVariabilityParser.g:4035:2: ( () otherlv_1= Char )
            {
            // InternalVariabilityParser.g:4035:2: ( () otherlv_1= Char )
            // InternalVariabilityParser.g:4036:3: () otherlv_1= Char
            {
            // InternalVariabilityParser.g:4036:3: ()
            // InternalVariabilityParser.g:4037:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCharAccess().getChar0Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Char,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCharAccess().getCharKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulechar"


    // $ANTLR start "entryRulebyte"
    // InternalVariabilityParser.g:4051:1: entryRulebyte returns [EObject current=null] : iv_rulebyte= rulebyte EOF ;
    public final EObject entryRulebyte() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyte = null;


        try {
            // InternalVariabilityParser.g:4051:45: (iv_rulebyte= rulebyte EOF )
            // InternalVariabilityParser.g:4052:2: iv_rulebyte= rulebyte EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getByteRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulebyte=rulebyte();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebyte; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebyte"


    // $ANTLR start "rulebyte"
    // InternalVariabilityParser.g:4058:1: rulebyte returns [EObject current=null] : ( () otherlv_1= Byte ) ;
    public final EObject rulebyte() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4064:2: ( ( () otherlv_1= Byte ) )
            // InternalVariabilityParser.g:4065:2: ( () otherlv_1= Byte )
            {
            // InternalVariabilityParser.g:4065:2: ( () otherlv_1= Byte )
            // InternalVariabilityParser.g:4066:3: () otherlv_1= Byte
            {
            // InternalVariabilityParser.g:4066:3: ()
            // InternalVariabilityParser.g:4067:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getByteAccess().getByteAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Byte,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getByteAccess().getByteKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebyte"


    // $ANTLR start "entryRuletime"
    // InternalVariabilityParser.g:4081:1: entryRuletime returns [EObject current=null] : iv_ruletime= ruletime EOF ;
    public final EObject entryRuletime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletime = null;


        try {
            // InternalVariabilityParser.g:4081:45: (iv_ruletime= ruletime EOF )
            // InternalVariabilityParser.g:4082:2: iv_ruletime= ruletime EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletime=ruletime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletime; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletime"


    // $ANTLR start "ruletime"
    // InternalVariabilityParser.g:4088:1: ruletime returns [EObject current=null] : ( () otherlv_1= Time ) ;
    public final EObject ruletime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4094:2: ( ( () otherlv_1= Time ) )
            // InternalVariabilityParser.g:4095:2: ( () otherlv_1= Time )
            {
            // InternalVariabilityParser.g:4095:2: ( () otherlv_1= Time )
            // InternalVariabilityParser.g:4096:3: () otherlv_1= Time
            {
            // InternalVariabilityParser.g:4096:3: ()
            // InternalVariabilityParser.g:4097:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTimeAccess().getTimeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Time,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getTimeKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletime"


    // $ANTLR start "entryRuleduration"
    // InternalVariabilityParser.g:4111:1: entryRuleduration returns [EObject current=null] : iv_ruleduration= ruleduration EOF ;
    public final EObject entryRuleduration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleduration = null;


        try {
            // InternalVariabilityParser.g:4111:49: (iv_ruleduration= ruleduration EOF )
            // InternalVariabilityParser.g:4112:2: iv_ruleduration= ruleduration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleduration=ruleduration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleduration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleduration"


    // $ANTLR start "ruleduration"
    // InternalVariabilityParser.g:4118:1: ruleduration returns [EObject current=null] : ( () otherlv_1= Duration ) ;
    public final EObject ruleduration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4124:2: ( ( () otherlv_1= Duration ) )
            // InternalVariabilityParser.g:4125:2: ( () otherlv_1= Duration )
            {
            // InternalVariabilityParser.g:4125:2: ( () otherlv_1= Duration )
            // InternalVariabilityParser.g:4126:3: () otherlv_1= Duration
            {
            // InternalVariabilityParser.g:4126:3: ()
            // InternalVariabilityParser.g:4127:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDurationAccess().getDurationAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Duration,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDurationAccess().getDurationKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleduration"


    // $ANTLR start "entryRuleboolArray"
    // InternalVariabilityParser.g:4141:1: entryRuleboolArray returns [EObject current=null] : iv_ruleboolArray= ruleboolArray EOF ;
    public final EObject entryRuleboolArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboolArray = null;


        try {
            // InternalVariabilityParser.g:4141:50: (iv_ruleboolArray= ruleboolArray EOF )
            // InternalVariabilityParser.g:4142:2: iv_ruleboolArray= ruleboolArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleboolArray=ruleboolArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleboolArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleboolArray"


    // $ANTLR start "ruleboolArray"
    // InternalVariabilityParser.g:4148:1: ruleboolArray returns [EObject current=null] : ( () otherlv_1= Bool_1 ) ;
    public final EObject ruleboolArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4154:2: ( ( () otherlv_1= Bool_1 ) )
            // InternalVariabilityParser.g:4155:2: ( () otherlv_1= Bool_1 )
            {
            // InternalVariabilityParser.g:4155:2: ( () otherlv_1= Bool_1 )
            // InternalVariabilityParser.g:4156:3: () otherlv_1= Bool_1
            {
            // InternalVariabilityParser.g:4156:3: ()
            // InternalVariabilityParser.g:4157:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBoolArrayAccess().getBoolArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Bool_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBoolArrayAccess().getBoolKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleboolArray"


    // $ANTLR start "entryRuleint8Array"
    // InternalVariabilityParser.g:4171:1: entryRuleint8Array returns [EObject current=null] : iv_ruleint8Array= ruleint8Array EOF ;
    public final EObject entryRuleint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8Array = null;


        try {
            // InternalVariabilityParser.g:4171:50: (iv_ruleint8Array= ruleint8Array EOF )
            // InternalVariabilityParser.g:4172:2: iv_ruleint8Array= ruleint8Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt8ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleint8Array=ruleint8Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleint8Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleint8Array"


    // $ANTLR start "ruleint8Array"
    // InternalVariabilityParser.g:4178:1: ruleint8Array returns [EObject current=null] : ( () otherlv_1= Int8_1 ) ;
    public final EObject ruleint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4184:2: ( ( () otherlv_1= Int8_1 ) )
            // InternalVariabilityParser.g:4185:2: ( () otherlv_1= Int8_1 )
            {
            // InternalVariabilityParser.g:4185:2: ( () otherlv_1= Int8_1 )
            // InternalVariabilityParser.g:4186:3: () otherlv_1= Int8_1
            {
            // InternalVariabilityParser.g:4186:3: ()
            // InternalVariabilityParser.g:4187:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInt8ArrayAccess().getInt8ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Int8_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInt8ArrayAccess().getInt8Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint8Array"


    // $ANTLR start "entryRuleuint8Array"
    // InternalVariabilityParser.g:4201:1: entryRuleuint8Array returns [EObject current=null] : iv_ruleuint8Array= ruleuint8Array EOF ;
    public final EObject entryRuleuint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8Array = null;


        try {
            // InternalVariabilityParser.g:4201:51: (iv_ruleuint8Array= ruleuint8Array EOF )
            // InternalVariabilityParser.g:4202:2: iv_ruleuint8Array= ruleuint8Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUint8ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleuint8Array=ruleuint8Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleuint8Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuint8Array"


    // $ANTLR start "ruleuint8Array"
    // InternalVariabilityParser.g:4208:1: ruleuint8Array returns [EObject current=null] : ( () otherlv_1= Uint8_1 ) ;
    public final EObject ruleuint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4214:2: ( ( () otherlv_1= Uint8_1 ) )
            // InternalVariabilityParser.g:4215:2: ( () otherlv_1= Uint8_1 )
            {
            // InternalVariabilityParser.g:4215:2: ( () otherlv_1= Uint8_1 )
            // InternalVariabilityParser.g:4216:3: () otherlv_1= Uint8_1
            {
            // InternalVariabilityParser.g:4216:3: ()
            // InternalVariabilityParser.g:4217:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUint8ArrayAccess().getUint8ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Uint8_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUint8ArrayAccess().getUint8Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint8Array"


    // $ANTLR start "entryRuleint16Array"
    // InternalVariabilityParser.g:4231:1: entryRuleint16Array returns [EObject current=null] : iv_ruleint16Array= ruleint16Array EOF ;
    public final EObject entryRuleint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16Array = null;


        try {
            // InternalVariabilityParser.g:4231:51: (iv_ruleint16Array= ruleint16Array EOF )
            // InternalVariabilityParser.g:4232:2: iv_ruleint16Array= ruleint16Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt16ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleint16Array=ruleint16Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleint16Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleint16Array"


    // $ANTLR start "ruleint16Array"
    // InternalVariabilityParser.g:4238:1: ruleint16Array returns [EObject current=null] : ( () otherlv_1= Int16_1 ) ;
    public final EObject ruleint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4244:2: ( ( () otherlv_1= Int16_1 ) )
            // InternalVariabilityParser.g:4245:2: ( () otherlv_1= Int16_1 )
            {
            // InternalVariabilityParser.g:4245:2: ( () otherlv_1= Int16_1 )
            // InternalVariabilityParser.g:4246:3: () otherlv_1= Int16_1
            {
            // InternalVariabilityParser.g:4246:3: ()
            // InternalVariabilityParser.g:4247:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInt16ArrayAccess().getInt16ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Int16_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInt16ArrayAccess().getInt16Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint16Array"


    // $ANTLR start "entryRuleuint16Array"
    // InternalVariabilityParser.g:4261:1: entryRuleuint16Array returns [EObject current=null] : iv_ruleuint16Array= ruleuint16Array EOF ;
    public final EObject entryRuleuint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16Array = null;


        try {
            // InternalVariabilityParser.g:4261:52: (iv_ruleuint16Array= ruleuint16Array EOF )
            // InternalVariabilityParser.g:4262:2: iv_ruleuint16Array= ruleuint16Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUint16ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleuint16Array=ruleuint16Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleuint16Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuint16Array"


    // $ANTLR start "ruleuint16Array"
    // InternalVariabilityParser.g:4268:1: ruleuint16Array returns [EObject current=null] : ( () otherlv_1= Uint16_1 ) ;
    public final EObject ruleuint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4274:2: ( ( () otherlv_1= Uint16_1 ) )
            // InternalVariabilityParser.g:4275:2: ( () otherlv_1= Uint16_1 )
            {
            // InternalVariabilityParser.g:4275:2: ( () otherlv_1= Uint16_1 )
            // InternalVariabilityParser.g:4276:3: () otherlv_1= Uint16_1
            {
            // InternalVariabilityParser.g:4276:3: ()
            // InternalVariabilityParser.g:4277:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUint16ArrayAccess().getUint16ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Uint16_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUint16ArrayAccess().getUint16Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint16Array"


    // $ANTLR start "entryRuleint32Array"
    // InternalVariabilityParser.g:4291:1: entryRuleint32Array returns [EObject current=null] : iv_ruleint32Array= ruleint32Array EOF ;
    public final EObject entryRuleint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32Array = null;


        try {
            // InternalVariabilityParser.g:4291:51: (iv_ruleint32Array= ruleint32Array EOF )
            // InternalVariabilityParser.g:4292:2: iv_ruleint32Array= ruleint32Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt32ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleint32Array=ruleint32Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleint32Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleint32Array"


    // $ANTLR start "ruleint32Array"
    // InternalVariabilityParser.g:4298:1: ruleint32Array returns [EObject current=null] : ( () otherlv_1= Int32_1 ) ;
    public final EObject ruleint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4304:2: ( ( () otherlv_1= Int32_1 ) )
            // InternalVariabilityParser.g:4305:2: ( () otherlv_1= Int32_1 )
            {
            // InternalVariabilityParser.g:4305:2: ( () otherlv_1= Int32_1 )
            // InternalVariabilityParser.g:4306:3: () otherlv_1= Int32_1
            {
            // InternalVariabilityParser.g:4306:3: ()
            // InternalVariabilityParser.g:4307:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInt32ArrayAccess().getInt32ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Int32_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInt32ArrayAccess().getInt32Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint32Array"


    // $ANTLR start "entryRuleuint32Array"
    // InternalVariabilityParser.g:4321:1: entryRuleuint32Array returns [EObject current=null] : iv_ruleuint32Array= ruleuint32Array EOF ;
    public final EObject entryRuleuint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32Array = null;


        try {
            // InternalVariabilityParser.g:4321:52: (iv_ruleuint32Array= ruleuint32Array EOF )
            // InternalVariabilityParser.g:4322:2: iv_ruleuint32Array= ruleuint32Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUint32ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleuint32Array=ruleuint32Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleuint32Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuint32Array"


    // $ANTLR start "ruleuint32Array"
    // InternalVariabilityParser.g:4328:1: ruleuint32Array returns [EObject current=null] : ( () otherlv_1= Uint32_1 ) ;
    public final EObject ruleuint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4334:2: ( ( () otherlv_1= Uint32_1 ) )
            // InternalVariabilityParser.g:4335:2: ( () otherlv_1= Uint32_1 )
            {
            // InternalVariabilityParser.g:4335:2: ( () otherlv_1= Uint32_1 )
            // InternalVariabilityParser.g:4336:3: () otherlv_1= Uint32_1
            {
            // InternalVariabilityParser.g:4336:3: ()
            // InternalVariabilityParser.g:4337:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUint32ArrayAccess().getUint32ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Uint32_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUint32ArrayAccess().getUint32Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint32Array"


    // $ANTLR start "entryRuleint64Array"
    // InternalVariabilityParser.g:4351:1: entryRuleint64Array returns [EObject current=null] : iv_ruleint64Array= ruleint64Array EOF ;
    public final EObject entryRuleint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64Array = null;


        try {
            // InternalVariabilityParser.g:4351:51: (iv_ruleint64Array= ruleint64Array EOF )
            // InternalVariabilityParser.g:4352:2: iv_ruleint64Array= ruleint64Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt64ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleint64Array=ruleint64Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleint64Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleint64Array"


    // $ANTLR start "ruleint64Array"
    // InternalVariabilityParser.g:4358:1: ruleint64Array returns [EObject current=null] : ( () otherlv_1= Int64_1 ) ;
    public final EObject ruleint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4364:2: ( ( () otherlv_1= Int64_1 ) )
            // InternalVariabilityParser.g:4365:2: ( () otherlv_1= Int64_1 )
            {
            // InternalVariabilityParser.g:4365:2: ( () otherlv_1= Int64_1 )
            // InternalVariabilityParser.g:4366:3: () otherlv_1= Int64_1
            {
            // InternalVariabilityParser.g:4366:3: ()
            // InternalVariabilityParser.g:4367:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInt64ArrayAccess().getInt64ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Int64_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInt64ArrayAccess().getInt64Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint64Array"


    // $ANTLR start "entryRuleuint64Array"
    // InternalVariabilityParser.g:4381:1: entryRuleuint64Array returns [EObject current=null] : iv_ruleuint64Array= ruleuint64Array EOF ;
    public final EObject entryRuleuint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64Array = null;


        try {
            // InternalVariabilityParser.g:4381:52: (iv_ruleuint64Array= ruleuint64Array EOF )
            // InternalVariabilityParser.g:4382:2: iv_ruleuint64Array= ruleuint64Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUint64ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleuint64Array=ruleuint64Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleuint64Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuint64Array"


    // $ANTLR start "ruleuint64Array"
    // InternalVariabilityParser.g:4388:1: ruleuint64Array returns [EObject current=null] : ( () otherlv_1= Uint64_1 ) ;
    public final EObject ruleuint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4394:2: ( ( () otherlv_1= Uint64_1 ) )
            // InternalVariabilityParser.g:4395:2: ( () otherlv_1= Uint64_1 )
            {
            // InternalVariabilityParser.g:4395:2: ( () otherlv_1= Uint64_1 )
            // InternalVariabilityParser.g:4396:3: () otherlv_1= Uint64_1
            {
            // InternalVariabilityParser.g:4396:3: ()
            // InternalVariabilityParser.g:4397:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUint64ArrayAccess().getUint64ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Uint64_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUint64ArrayAccess().getUint64Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint64Array"


    // $ANTLR start "entryRulefloat32Array"
    // InternalVariabilityParser.g:4411:1: entryRulefloat32Array returns [EObject current=null] : iv_rulefloat32Array= rulefloat32Array EOF ;
    public final EObject entryRulefloat32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32Array = null;


        try {
            // InternalVariabilityParser.g:4411:53: (iv_rulefloat32Array= rulefloat32Array EOF )
            // InternalVariabilityParser.g:4412:2: iv_rulefloat32Array= rulefloat32Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloat32ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefloat32Array=rulefloat32Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefloat32Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefloat32Array"


    // $ANTLR start "rulefloat32Array"
    // InternalVariabilityParser.g:4418:1: rulefloat32Array returns [EObject current=null] : ( () otherlv_1= Float32_1 ) ;
    public final EObject rulefloat32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4424:2: ( ( () otherlv_1= Float32_1 ) )
            // InternalVariabilityParser.g:4425:2: ( () otherlv_1= Float32_1 )
            {
            // InternalVariabilityParser.g:4425:2: ( () otherlv_1= Float32_1 )
            // InternalVariabilityParser.g:4426:3: () otherlv_1= Float32_1
            {
            // InternalVariabilityParser.g:4426:3: ()
            // InternalVariabilityParser.g:4427:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFloat32ArrayAccess().getFloat32ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Float32_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFloat32ArrayAccess().getFloat32Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefloat32Array"


    // $ANTLR start "entryRulefloat64Array"
    // InternalVariabilityParser.g:4441:1: entryRulefloat64Array returns [EObject current=null] : iv_rulefloat64Array= rulefloat64Array EOF ;
    public final EObject entryRulefloat64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64Array = null;


        try {
            // InternalVariabilityParser.g:4441:53: (iv_rulefloat64Array= rulefloat64Array EOF )
            // InternalVariabilityParser.g:4442:2: iv_rulefloat64Array= rulefloat64Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloat64ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefloat64Array=rulefloat64Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefloat64Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefloat64Array"


    // $ANTLR start "rulefloat64Array"
    // InternalVariabilityParser.g:4448:1: rulefloat64Array returns [EObject current=null] : ( () otherlv_1= Float64_1 ) ;
    public final EObject rulefloat64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4454:2: ( ( () otherlv_1= Float64_1 ) )
            // InternalVariabilityParser.g:4455:2: ( () otherlv_1= Float64_1 )
            {
            // InternalVariabilityParser.g:4455:2: ( () otherlv_1= Float64_1 )
            // InternalVariabilityParser.g:4456:3: () otherlv_1= Float64_1
            {
            // InternalVariabilityParser.g:4456:3: ()
            // InternalVariabilityParser.g:4457:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFloat64ArrayAccess().getFloat64ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Float64_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFloat64ArrayAccess().getFloat64Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefloat64Array"


    // $ANTLR start "entryRulestring0Array"
    // InternalVariabilityParser.g:4471:1: entryRulestring0Array returns [EObject current=null] : iv_rulestring0Array= rulestring0Array EOF ;
    public final EObject entryRulestring0Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0Array = null;


        try {
            // InternalVariabilityParser.g:4471:53: (iv_rulestring0Array= rulestring0Array EOF )
            // InternalVariabilityParser.g:4472:2: iv_rulestring0Array= rulestring0Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getString0ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestring0Array=rulestring0Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestring0Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestring0Array"


    // $ANTLR start "rulestring0Array"
    // InternalVariabilityParser.g:4478:1: rulestring0Array returns [EObject current=null] : ( () otherlv_1= String_2 ) ;
    public final EObject rulestring0Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4484:2: ( ( () otherlv_1= String_2 ) )
            // InternalVariabilityParser.g:4485:2: ( () otherlv_1= String_2 )
            {
            // InternalVariabilityParser.g:4485:2: ( () otherlv_1= String_2 )
            // InternalVariabilityParser.g:4486:3: () otherlv_1= String_2
            {
            // InternalVariabilityParser.g:4486:3: ()
            // InternalVariabilityParser.g:4487:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getString0ArrayAccess().getStringArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,String_2,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getString0ArrayAccess().getStringKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestring0Array"


    // $ANTLR start "entryRulebyteArray"
    // InternalVariabilityParser.g:4501:1: entryRulebyteArray returns [EObject current=null] : iv_rulebyteArray= rulebyteArray EOF ;
    public final EObject entryRulebyteArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyteArray = null;


        try {
            // InternalVariabilityParser.g:4501:50: (iv_rulebyteArray= rulebyteArray EOF )
            // InternalVariabilityParser.g:4502:2: iv_rulebyteArray= rulebyteArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getByteArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulebyteArray=rulebyteArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebyteArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebyteArray"


    // $ANTLR start "rulebyteArray"
    // InternalVariabilityParser.g:4508:1: rulebyteArray returns [EObject current=null] : ( () otherlv_1= Byte_1 ) ;
    public final EObject rulebyteArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4514:2: ( ( () otherlv_1= Byte_1 ) )
            // InternalVariabilityParser.g:4515:2: ( () otherlv_1= Byte_1 )
            {
            // InternalVariabilityParser.g:4515:2: ( () otherlv_1= Byte_1 )
            // InternalVariabilityParser.g:4516:3: () otherlv_1= Byte_1
            {
            // InternalVariabilityParser.g:4516:3: ()
            // InternalVariabilityParser.g:4517:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getByteArrayAccess().getByteArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Byte_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getByteArrayAccess().getByteKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebyteArray"


    // $ANTLR start "entryRulecharArray"
    // InternalVariabilityParser.g:4531:1: entryRulecharArray returns [EObject current=null] : iv_rulecharArray= rulecharArray EOF ;
    public final EObject entryRulecharArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecharArray = null;


        try {
            // InternalVariabilityParser.g:4531:50: (iv_rulecharArray= rulecharArray EOF )
            // InternalVariabilityParser.g:4532:2: iv_rulecharArray= rulecharArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecharArray=rulecharArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecharArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecharArray"


    // $ANTLR start "rulecharArray"
    // InternalVariabilityParser.g:4538:1: rulecharArray returns [EObject current=null] : ( () otherlv_1= Char_1 ) ;
    public final EObject rulecharArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4544:2: ( ( () otherlv_1= Char_1 ) )
            // InternalVariabilityParser.g:4545:2: ( () otherlv_1= Char_1 )
            {
            // InternalVariabilityParser.g:4545:2: ( () otherlv_1= Char_1 )
            // InternalVariabilityParser.g:4546:3: () otherlv_1= Char_1
            {
            // InternalVariabilityParser.g:4546:3: ()
            // InternalVariabilityParser.g:4547:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCharArrayAccess().getCharArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Char_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCharArrayAccess().getCharKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecharArray"


    // $ANTLR start "entryRuleHeader"
    // InternalVariabilityParser.g:4561:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalVariabilityParser.g:4561:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalVariabilityParser.g:4562:2: iv_ruleHeader= ruleHeader EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeaderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeader; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalVariabilityParser.g:4568:1: ruleHeader returns [EObject current=null] : ( () otherlv_1= Header ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4574:2: ( ( () otherlv_1= Header ) )
            // InternalVariabilityParser.g:4575:2: ( () otherlv_1= Header )
            {
            // InternalVariabilityParser.g:4575:2: ( () otherlv_1= Header )
            // InternalVariabilityParser.g:4576:3: () otherlv_1= Header
            {
            // InternalVariabilityParser.g:4576:3: ()
            // InternalVariabilityParser.g:4577:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeaderAccess().getHeaderAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Header,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getHeaderKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleSpecBaseRef"
    // InternalVariabilityParser.g:4591:1: entryRuleSpecBaseRef returns [EObject current=null] : iv_ruleSpecBaseRef= ruleSpecBaseRef EOF ;
    public final EObject entryRuleSpecBaseRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecBaseRef = null;


        try {
            // InternalVariabilityParser.g:4591:52: (iv_ruleSpecBaseRef= ruleSpecBaseRef EOF )
            // InternalVariabilityParser.g:4592:2: iv_ruleSpecBaseRef= ruleSpecBaseRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecBaseRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSpecBaseRef=ruleSpecBaseRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecBaseRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecBaseRef"


    // $ANTLR start "ruleSpecBaseRef"
    // InternalVariabilityParser.g:4598:1: ruleSpecBaseRef returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleSpecBaseRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4604:2: ( ( ( ruleEString ) ) )
            // InternalVariabilityParser.g:4605:2: ( ( ruleEString ) )
            {
            // InternalVariabilityParser.g:4605:2: ( ( ruleEString ) )
            // InternalVariabilityParser.g:4606:3: ( ruleEString )
            {
            // InternalVariabilityParser.g:4606:3: ( ruleEString )
            // InternalVariabilityParser.g:4607:4: ruleEString
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSpecBaseRefRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSpecBaseRefAccess().getReferenceTopicSpecCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecBaseRef"


    // $ANTLR start "entryRuleArraySpecRef"
    // InternalVariabilityParser.g:4624:1: entryRuleArraySpecRef returns [EObject current=null] : iv_ruleArraySpecRef= ruleArraySpecRef EOF ;
    public final EObject entryRuleArraySpecRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecRef = null;


        try {
            // InternalVariabilityParser.g:4624:53: (iv_ruleArraySpecRef= ruleArraySpecRef EOF )
            // InternalVariabilityParser.g:4625:2: iv_ruleArraySpecRef= ruleArraySpecRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySpecRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArraySpecRef=ruleArraySpecRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySpecRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArraySpecRef"


    // $ANTLR start "ruleArraySpecRef"
    // InternalVariabilityParser.g:4631:1: ruleArraySpecRef returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket ) ;
    public final EObject ruleArraySpecRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4637:2: ( ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket ) )
            // InternalVariabilityParser.g:4638:2: ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket )
            {
            // InternalVariabilityParser.g:4638:2: ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket )
            // InternalVariabilityParser.g:4639:3: ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket
            {
            // InternalVariabilityParser.g:4639:3: ( ( ruleEString ) )
            // InternalVariabilityParser.g:4640:4: ( ruleEString )
            {
            // InternalVariabilityParser.g:4640:4: ( ruleEString )
            // InternalVariabilityParser.g:4641:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getArraySpecRefRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArraySpecRefAccess().getReferenceTopicSpecCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_39);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,LeftSquareBracketRightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArraySpecRefAccess().getLeftSquareBracketRightSquareBracketKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArraySpecRef"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalVariabilityParser.g:4663:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalVariabilityParser.g:4663:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalVariabilityParser.g:4664:2: iv_ruleKEYWORD= ruleKEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKEYWORDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKEYWORD=ruleKEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKEYWORD.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalVariabilityParser.g:4670:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4676:2: ( (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time ) )
            // InternalVariabilityParser.g:4677:2: (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time )
            {
            // InternalVariabilityParser.g:4677:2: (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time )
            int alt45=11;
            switch ( input.LA(1) ) {
            case Goal:
                {
                alt45=1;
                }
                break;
            case Message:
                {
                alt45=2;
                }
                break;
            case Result:
                {
                alt45=3;
                }
                break;
            case Feedback:
                {
                alt45=4;
                }
                break;
            case Name:
                {
                alt45=5;
                }
                break;
            case Value:
                {
                alt45=6;
                }
                break;
            case Service:
                {
                alt45=7;
                }
                break;
            case Type:
                {
                alt45=8;
                }
                break;
            case Action:
                {
                alt45=9;
                }
                break;
            case Duration:
                {
                alt45=10;
                }
                break;
            case Time:
                {
                alt45=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalVariabilityParser.g:4678:3: kw= Goal
                    {
                    kw=(Token)match(input,Goal,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getGoalKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVariabilityParser.g:4684:3: kw= Message
                    {
                    kw=(Token)match(input,Message,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMessageKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVariabilityParser.g:4690:3: kw= Result
                    {
                    kw=(Token)match(input,Result,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getResultKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVariabilityParser.g:4696:3: kw= Feedback
                    {
                    kw=(Token)match(input,Feedback,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalVariabilityParser.g:4702:3: kw= Name
                    {
                    kw=(Token)match(input,Name,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalVariabilityParser.g:4708:3: kw= Value
                    {
                    kw=(Token)match(input,Value,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getValueKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalVariabilityParser.g:4714:3: kw= Service
                    {
                    kw=(Token)match(input,Service,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getServiceKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalVariabilityParser.g:4720:3: kw= Type
                    {
                    kw=(Token)match(input,Type,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalVariabilityParser.g:4726:3: kw= Action
                    {
                    kw=(Token)match(input,Action,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalVariabilityParser.g:4732:3: kw= Duration
                    {
                    kw=(Token)match(input,Duration,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDurationKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalVariabilityParser.g:4738:3: kw= Time
                    {
                    kw=(Token)match(input,Time,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTimeKeyword_10());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "entryRuleEString"
    // InternalVariabilityParser.g:4747:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalVariabilityParser.g:4747:47: (iv_ruleEString= ruleEString EOF )
            // InternalVariabilityParser.g:4748:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalVariabilityParser.g:4754:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalVariabilityParser.g:4760:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalVariabilityParser.g:4761:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalVariabilityParser.g:4761:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_STRING) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_ID) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalVariabilityParser.g:4762:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVariabilityParser.g:4770:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // $ANTLR start synpred1_InternalVariabilityParser
    public final void synpred1_InternalVariabilityParser_fragment() throws RecognitionException {   
        // InternalVariabilityParser.g:1220:4: ( ruleRosSystemConnection )
        // InternalVariabilityParser.g:1220:5: ruleRosSystemConnection
        {
        pushFollow(FOLLOW_2);
        ruleRosSystemConnection();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalVariabilityParser

    // $ANTLR start synpred2_InternalVariabilityParser
    public final void synpred2_InternalVariabilityParser_fragment() throws RecognitionException {   
        // InternalVariabilityParser.g:1326:4: ( ruleRosTopicConnection )
        // InternalVariabilityParser.g:1326:5: ruleRosTopicConnection
        {
        pushFollow(FOLLOW_2);
        ruleRosTopicConnection();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalVariabilityParser

    // $ANTLR start synpred3_InternalVariabilityParser
    public final void synpred3_InternalVariabilityParser_fragment() throws RecognitionException {   
        // InternalVariabilityParser.g:1338:4: ( ruleRosServiceConnection )
        // InternalVariabilityParser.g:1338:5: ruleRosServiceConnection
        {
        pushFollow(FOLLOW_2);
        ruleRosServiceConnection();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalVariabilityParser

    // Delegated rules

    public final boolean synpred1_InternalVariabilityParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalVariabilityParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalVariabilityParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalVariabilityParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalVariabilityParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalVariabilityParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA44 dfa44 = new DFA44(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\123\1\125\1\142\2\122\1\142\2\126\1\0\2\uffff";
    static final String dfa_3s = "\1\123\1\125\1\143\2\122\1\143\2\126\1\0\2\uffff";
    static final String dfa_4s = "\11\uffff\1\1\1\2";
    static final String dfa_5s = "\10\uffff\1\0\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\1\3",
            "\1\5",
            "\1\5",
            "\1\7\1\6",
            "\1\10",
            "\1\10",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1218:2: ( ( ( ruleRosSystemConnection )=>this_RosSystemConnection_0= ruleRosSystemConnection ) | this_RosConnection_1= ruleRosConnection )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_8 = input.LA(1);

                         
                        int index19_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalVariabilityParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index19_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\123\1\125\1\142\2\122\1\142\2\126\1\0\3\uffff";
    static final String dfa_9s = "\1\123\1\125\1\143\2\122\1\143\2\126\1\0\3\uffff";
    static final String dfa_10s = "\11\uffff\1\1\1\2\1\3";
    static final String dfa_11s = "\10\uffff\1\0\3\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2",
            "\1\4\1\3",
            "\1\5",
            "\1\5",
            "\1\7\1\6",
            "\1\10",
            "\1\10",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1324:2: ( ( ( ruleRosTopicConnection )=>this_RosTopicConnection_0= ruleRosTopicConnection ) | ( ( ruleRosServiceConnection )=>this_RosServiceConnection_1= ruleRosServiceConnection ) | this_RosActionConnection_2= ruleRosActionConnection )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_8 = input.LA(1);

                         
                        int index20_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalVariabilityParser()) ) {s = 9;}

                        else if ( (synpred3_InternalVariabilityParser()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index20_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\1\10\2\11\10\uffff";
    static final String dfa_14s = "\3\122\4\uffff\1\122\3\uffff";
    static final String dfa_15s = "\3\147\4\uffff\1\146\3\uffff";
    static final String dfa_16s = "\3\uffff\1\2\1\3\1\4\1\5\1\uffff\1\7\1\1\1\6";
    static final String dfa_17s = "\13\uffff}>";
    static final String[] dfa_18s = {
            "\1\10\2\uffff\1\7\1\10\1\uffff\1\3\1\6\1\4\1\5\6\uffff\1\2\1\1\3\uffff\1\10",
            "\1\11\1\uffff\1\10\1\uffff\1\11\13\uffff\2\11\3\uffff\1\11",
            "\1\11\1\uffff\1\10\1\uffff\1\11\13\uffff\2\11\3\uffff\1\11",
            "",
            "",
            "",
            "",
            "\1\12\2\uffff\2\12\1\uffff\4\12\6\uffff\2\12\2\uffff\1\10",
            "",
            "",
            ""
    };
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_1;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "2115:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )";
        }
    }
    static final String dfa_19s = "\44\uffff";
    static final String dfa_20s = "\36\uffff\2\43\4\uffff";
    static final String dfa_21s = "\1\20\35\uffff\2\121\4\uffff";
    static final String dfa_22s = "\1\143\35\uffff\2\121\4\uffff";
    static final String dfa_23s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\40\1\41\1\37\1\36";
    static final String dfa_24s = "\44\uffff}>";
    static final String[] dfa_25s = {
            "\1\32\1\33\2\uffff\1\17\1\uffff\1\34\1\uffff\1\25\1\27\1\31\2\uffff\1\12\1\13\1\24\1\26\1\30\2\uffff\1\23\2\uffff\1\20\3\uffff\1\21\1\35\1\41\1\22\2\uffff\1\14\1\5\1\7\1\11\3\uffff\1\4\1\6\1\10\3\uffff\1\3\5\uffff\1\1\1\15\1\40\1\uffff\1\2\4\uffff\1\16\24\uffff\1\37\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42",
            "\1\42",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "3360:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000800000045A00L,0x0000008000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000800000005A00L,0x0000008000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000008C00000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000008000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000008000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000C0F200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000440000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000800000800000L,0x0000008000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L,0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002C00L,0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000C00L,0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L,0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x1800000000000000L,0x000000000000180CL});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0040036018000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000C00400000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});

}
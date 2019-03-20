package org.xtext.browser.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.browser.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Test'", "'{'", "'}'", "'Open'", "'GoTo'", "'Verify'", "'Contains'", "'Text'", "'Link'", "'Image'", "'('", "')'", "'Equal'", "'Click'", "'Button'", "'Insert'", "'in'", "'with'", "'SearchField'", "'Uncheck'", "'all'", "'['", "']'", "'Check'", "'Choose'", "'Box'", "'='", "'Read'", "'of Element '", "'Title'", "'Count of Element '", "'Paste'", "'For'", "'EndFor'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Test";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTest"
    // InternalMyDsl.g:64:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalMyDsl.g:64:45: (iv_ruleTest= ruleTest EOF )
            // InternalMyDsl.g:65:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalMyDsl.g:71:1: ruleTest returns [EObject current=null] : (otherlv_0= 'Test' ( (lv_number_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_body_3_0= ruleINSTRUCTION ) )* otherlv_4= '}' ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'Test' ( (lv_number_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_body_3_0= ruleINSTRUCTION ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'Test' ( (lv_number_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_body_3_0= ruleINSTRUCTION ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'Test' ( (lv_number_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_body_3_0= ruleINSTRUCTION ) )* otherlv_4= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'Test' ( (lv_number_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_body_3_0= ruleINSTRUCTION ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTestKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_number_1_0= RULE_STRING ) )
            // InternalMyDsl.g:84:4: (lv_number_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:84:4: (lv_number_1_0= RULE_STRING )
            // InternalMyDsl.g:85:5: lv_number_1_0= RULE_STRING
            {
            lv_number_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_number_1_0, grammarAccess.getTestAccess().getNumberSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:105:3: ( (lv_body_3_0= ruleINSTRUCTION ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=14 && LA1_0<=16)||LA1_0==24||LA1_0==26||LA1_0==30||(LA1_0>=34 && LA1_0<=35)||LA1_0==38||(LA1_0>=41 && LA1_0<=44)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:106:4: (lv_body_3_0= ruleINSTRUCTION )
            	    {
            	    // InternalMyDsl.g:106:4: (lv_body_3_0= ruleINSTRUCTION )
            	    // InternalMyDsl.g:107:5: lv_body_3_0= ruleINSTRUCTION
            	    {

            	    					newCompositeNode(grammarAccess.getTestAccess().getBodyINSTRUCTIONParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_body_3_0=ruleINSTRUCTION();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTestRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_3_0,
            	    						"org.xtext.browser.mydsl.MyDsl.INSTRUCTION");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTestAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleINSTRUCTION"
    // InternalMyDsl.g:132:1: entryRuleINSTRUCTION returns [EObject current=null] : iv_ruleINSTRUCTION= ruleINSTRUCTION EOF ;
    public final EObject entryRuleINSTRUCTION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINSTRUCTION = null;


        try {
            // InternalMyDsl.g:132:52: (iv_ruleINSTRUCTION= ruleINSTRUCTION EOF )
            // InternalMyDsl.g:133:2: iv_ruleINSTRUCTION= ruleINSTRUCTION EOF
            {
             newCompositeNode(grammarAccess.getINSTRUCTIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINSTRUCTION=ruleINSTRUCTION();

            state._fsp--;

             current =iv_ruleINSTRUCTION; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleINSTRUCTION"


    // $ANTLR start "ruleINSTRUCTION"
    // InternalMyDsl.g:139:1: ruleINSTRUCTION returns [EObject current=null] : (this_Open_0= ruleOpen | this_GoTo_1= ruleGoTo | this_Verify_2= ruleVerify | this_Click_3= ruleClick | this_Insert_4= ruleInsert | this_Uncheck_5= ruleUncheck | this_Check_6= ruleCheck | this_Choose_7= ruleChoose | this_Variable_8= ruleVariable | this_Read_9= ruleRead | this_Count_10= ruleCount | this_Paste_11= rulePaste | this_For_12= ruleFor | this_EndFor_13= ruleEndFor ) ;
    public final EObject ruleINSTRUCTION() throws RecognitionException {
        EObject current = null;

        EObject this_Open_0 = null;

        EObject this_GoTo_1 = null;

        EObject this_Verify_2 = null;

        EObject this_Click_3 = null;

        EObject this_Insert_4 = null;

        EObject this_Uncheck_5 = null;

        EObject this_Check_6 = null;

        EObject this_Choose_7 = null;

        EObject this_Variable_8 = null;

        EObject this_Read_9 = null;

        EObject this_Count_10 = null;

        EObject this_Paste_11 = null;

        EObject this_For_12 = null;

        EObject this_EndFor_13 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:145:2: ( (this_Open_0= ruleOpen | this_GoTo_1= ruleGoTo | this_Verify_2= ruleVerify | this_Click_3= ruleClick | this_Insert_4= ruleInsert | this_Uncheck_5= ruleUncheck | this_Check_6= ruleCheck | this_Choose_7= ruleChoose | this_Variable_8= ruleVariable | this_Read_9= ruleRead | this_Count_10= ruleCount | this_Paste_11= rulePaste | this_For_12= ruleFor | this_EndFor_13= ruleEndFor ) )
            // InternalMyDsl.g:146:2: (this_Open_0= ruleOpen | this_GoTo_1= ruleGoTo | this_Verify_2= ruleVerify | this_Click_3= ruleClick | this_Insert_4= ruleInsert | this_Uncheck_5= ruleUncheck | this_Check_6= ruleCheck | this_Choose_7= ruleChoose | this_Variable_8= ruleVariable | this_Read_9= ruleRead | this_Count_10= ruleCount | this_Paste_11= rulePaste | this_For_12= ruleFor | this_EndFor_13= ruleEndFor )
            {
            // InternalMyDsl.g:146:2: (this_Open_0= ruleOpen | this_GoTo_1= ruleGoTo | this_Verify_2= ruleVerify | this_Click_3= ruleClick | this_Insert_4= ruleInsert | this_Uncheck_5= ruleUncheck | this_Check_6= ruleCheck | this_Choose_7= ruleChoose | this_Variable_8= ruleVariable | this_Read_9= ruleRead | this_Count_10= ruleCount | this_Paste_11= rulePaste | this_For_12= ruleFor | this_EndFor_13= ruleEndFor )
            int alt2=14;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 24:
                {
                alt2=4;
                }
                break;
            case 26:
                {
                alt2=5;
                }
                break;
            case 30:
                {
                alt2=6;
                }
                break;
            case 34:
                {
                alt2=7;
                }
                break;
            case 35:
                {
                alt2=8;
                }
                break;
            case RULE_ID:
                {
                alt2=9;
                }
                break;
            case 38:
                {
                alt2=10;
                }
                break;
            case 41:
                {
                alt2=11;
                }
                break;
            case 42:
                {
                alt2=12;
                }
                break;
            case 43:
                {
                alt2=13;
                }
                break;
            case 44:
                {
                alt2=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:147:3: this_Open_0= ruleOpen
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getOpenParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Open_0=ruleOpen();

                    state._fsp--;


                    			current = this_Open_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:156:3: this_GoTo_1= ruleGoTo
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getGoToParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoTo_1=ruleGoTo();

                    state._fsp--;


                    			current = this_GoTo_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:165:3: this_Verify_2= ruleVerify
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getVerifyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Verify_2=ruleVerify();

                    state._fsp--;


                    			current = this_Verify_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:174:3: this_Click_3= ruleClick
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getClickParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Click_3=ruleClick();

                    state._fsp--;


                    			current = this_Click_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:183:3: this_Insert_4= ruleInsert
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getInsertParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Insert_4=ruleInsert();

                    state._fsp--;


                    			current = this_Insert_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:192:3: this_Uncheck_5= ruleUncheck
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getUncheckParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Uncheck_5=ruleUncheck();

                    state._fsp--;


                    			current = this_Uncheck_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:201:3: this_Check_6= ruleCheck
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getCheckParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Check_6=ruleCheck();

                    state._fsp--;


                    			current = this_Check_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:210:3: this_Choose_7= ruleChoose
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getChooseParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Choose_7=ruleChoose();

                    state._fsp--;


                    			current = this_Choose_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:219:3: this_Variable_8= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getVariableParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_8=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:228:3: this_Read_9= ruleRead
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getReadParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Read_9=ruleRead();

                    state._fsp--;


                    			current = this_Read_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:237:3: this_Count_10= ruleCount
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getCountParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Count_10=ruleCount();

                    state._fsp--;


                    			current = this_Count_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:246:3: this_Paste_11= rulePaste
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getPasteParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Paste_11=rulePaste();

                    state._fsp--;


                    			current = this_Paste_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:255:3: this_For_12= ruleFor
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getForParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_For_12=ruleFor();

                    state._fsp--;


                    			current = this_For_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:264:3: this_EndFor_13= ruleEndFor
                    {

                    			newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getEndForParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_EndFor_13=ruleEndFor();

                    state._fsp--;


                    			current = this_EndFor_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINSTRUCTION"


    // $ANTLR start "entryRuleOpen"
    // InternalMyDsl.g:276:1: entryRuleOpen returns [EObject current=null] : iv_ruleOpen= ruleOpen EOF ;
    public final EObject entryRuleOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpen = null;


        try {
            // InternalMyDsl.g:276:45: (iv_ruleOpen= ruleOpen EOF )
            // InternalMyDsl.g:277:2: iv_ruleOpen= ruleOpen EOF
            {
             newCompositeNode(grammarAccess.getOpenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpen=ruleOpen();

            state._fsp--;

             current =iv_ruleOpen; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOpen"


    // $ANTLR start "ruleOpen"
    // InternalMyDsl.g:283:1: ruleOpen returns [EObject current=null] : (otherlv_0= 'Open' ( (lv_browser_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleOpen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_browser_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:289:2: ( (otherlv_0= 'Open' ( (lv_browser_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:290:2: (otherlv_0= 'Open' ( (lv_browser_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:290:2: (otherlv_0= 'Open' ( (lv_browser_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:291:3: otherlv_0= 'Open' ( (lv_browser_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOpenAccess().getOpenKeyword_0());
            		
            // InternalMyDsl.g:295:3: ( (lv_browser_1_0= RULE_STRING ) )
            // InternalMyDsl.g:296:4: (lv_browser_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:296:4: (lv_browser_1_0= RULE_STRING )
            // InternalMyDsl.g:297:5: lv_browser_1_0= RULE_STRING
            {
            lv_browser_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_browser_1_0, grammarAccess.getOpenAccess().getBrowserSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOpenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"browser",
            						lv_browser_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpen"


    // $ANTLR start "entryRuleGoTo"
    // InternalMyDsl.g:317:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // InternalMyDsl.g:317:45: (iv_ruleGoTo= ruleGoTo EOF )
            // InternalMyDsl.g:318:2: iv_ruleGoTo= ruleGoTo EOF
            {
             newCompositeNode(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoTo=ruleGoTo();

            state._fsp--;

             current =iv_ruleGoTo; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // InternalMyDsl.g:324:1: ruleGoTo returns [EObject current=null] : (otherlv_0= 'GoTo' ( (lv_url_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:330:2: ( (otherlv_0= 'GoTo' ( (lv_url_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:331:2: (otherlv_0= 'GoTo' ( (lv_url_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:331:2: (otherlv_0= 'GoTo' ( (lv_url_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:332:3: otherlv_0= 'GoTo' ( (lv_url_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGoToKeyword_0());
            		
            // InternalMyDsl.g:336:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalMyDsl.g:337:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:337:4: (lv_url_1_0= RULE_STRING )
            // InternalMyDsl.g:338:5: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_url_1_0, grammarAccess.getGoToAccess().getUrlSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoToRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleVerify"
    // InternalMyDsl.g:358:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // InternalMyDsl.g:358:47: (iv_ruleVerify= ruleVerify EOF )
            // InternalMyDsl.g:359:2: iv_ruleVerify= ruleVerify EOF
            {
             newCompositeNode(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerify=ruleVerify();

            state._fsp--;

             current =iv_ruleVerify; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // InternalMyDsl.g:365:1: ruleVerify returns [EObject current=null] : (otherlv_0= 'Verify' this_TYPE_VERIFY_1= ruleTYPE_VERIFY ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TYPE_VERIFY_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:371:2: ( (otherlv_0= 'Verify' this_TYPE_VERIFY_1= ruleTYPE_VERIFY ) )
            // InternalMyDsl.g:372:2: (otherlv_0= 'Verify' this_TYPE_VERIFY_1= ruleTYPE_VERIFY )
            {
            // InternalMyDsl.g:372:2: (otherlv_0= 'Verify' this_TYPE_VERIFY_1= ruleTYPE_VERIFY )
            // InternalMyDsl.g:373:3: otherlv_0= 'Verify' this_TYPE_VERIFY_1= ruleTYPE_VERIFY
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifyAccess().getVerifyKeyword_0());
            		

            			newCompositeNode(grammarAccess.getVerifyAccess().getTYPE_VERIFYParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_TYPE_VERIFY_1=ruleTYPE_VERIFY();

            state._fsp--;


            			current = this_TYPE_VERIFY_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleTYPE_VERIFY"
    // InternalMyDsl.g:389:1: entryRuleTYPE_VERIFY returns [EObject current=null] : iv_ruleTYPE_VERIFY= ruleTYPE_VERIFY EOF ;
    public final EObject entryRuleTYPE_VERIFY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTYPE_VERIFY = null;


        try {
            // InternalMyDsl.g:389:52: (iv_ruleTYPE_VERIFY= ruleTYPE_VERIFY EOF )
            // InternalMyDsl.g:390:2: iv_ruleTYPE_VERIFY= ruleTYPE_VERIFY EOF
            {
             newCompositeNode(grammarAccess.getTYPE_VERIFYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTYPE_VERIFY=ruleTYPE_VERIFY();

            state._fsp--;

             current =iv_ruleTYPE_VERIFY; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTYPE_VERIFY"


    // $ANTLR start "ruleTYPE_VERIFY"
    // InternalMyDsl.g:396:1: ruleTYPE_VERIFY returns [EObject current=null] : (this_Contains_0= ruleContains | this_Equal_1= ruleEqual ) ;
    public final EObject ruleTYPE_VERIFY() throws RecognitionException {
        EObject current = null;

        EObject this_Contains_0 = null;

        EObject this_Equal_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:402:2: ( (this_Contains_0= ruleContains | this_Equal_1= ruleEqual ) )
            // InternalMyDsl.g:403:2: (this_Contains_0= ruleContains | this_Equal_1= ruleEqual )
            {
            // InternalMyDsl.g:403:2: (this_Contains_0= ruleContains | this_Equal_1= ruleEqual )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:404:3: this_Contains_0= ruleContains
                    {

                    			newCompositeNode(grammarAccess.getTYPE_VERIFYAccess().getContainsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Contains_0=ruleContains();

                    state._fsp--;


                    			current = this_Contains_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:413:3: this_Equal_1= ruleEqual
                    {

                    			newCompositeNode(grammarAccess.getTYPE_VERIFYAccess().getEqualParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Equal_1=ruleEqual();

                    state._fsp--;


                    			current = this_Equal_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPE_VERIFY"


    // $ANTLR start "entryRuleContains"
    // InternalMyDsl.g:425:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalMyDsl.g:425:49: (iv_ruleContains= ruleContains EOF )
            // InternalMyDsl.g:426:2: iv_ruleContains= ruleContains EOF
            {
             newCompositeNode(grammarAccess.getContainsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContains=ruleContains();

            state._fsp--;

             current =iv_ruleContains; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContains"


    // $ANTLR start "ruleContains"
    // InternalMyDsl.g:432:1: ruleContains returns [EObject current=null] : (otherlv_0= 'Contains' ( (lv_type_1_0= ruleTYPE_CONTAINS ) ) ( (lv_parametre_2_0= ruleTYPE_PARAMETRE ) ) ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_parametre_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:438:2: ( (otherlv_0= 'Contains' ( (lv_type_1_0= ruleTYPE_CONTAINS ) ) ( (lv_parametre_2_0= ruleTYPE_PARAMETRE ) ) ) )
            // InternalMyDsl.g:439:2: (otherlv_0= 'Contains' ( (lv_type_1_0= ruleTYPE_CONTAINS ) ) ( (lv_parametre_2_0= ruleTYPE_PARAMETRE ) ) )
            {
            // InternalMyDsl.g:439:2: (otherlv_0= 'Contains' ( (lv_type_1_0= ruleTYPE_CONTAINS ) ) ( (lv_parametre_2_0= ruleTYPE_PARAMETRE ) ) )
            // InternalMyDsl.g:440:3: otherlv_0= 'Contains' ( (lv_type_1_0= ruleTYPE_CONTAINS ) ) ( (lv_parametre_2_0= ruleTYPE_PARAMETRE ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getContainsKeyword_0());
            		
            // InternalMyDsl.g:444:3: ( (lv_type_1_0= ruleTYPE_CONTAINS ) )
            // InternalMyDsl.g:445:4: (lv_type_1_0= ruleTYPE_CONTAINS )
            {
            // InternalMyDsl.g:445:4: (lv_type_1_0= ruleTYPE_CONTAINS )
            // InternalMyDsl.g:446:5: lv_type_1_0= ruleTYPE_CONTAINS
            {

            					newCompositeNode(grammarAccess.getContainsAccess().getTypeTYPE_CONTAINSParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_type_1_0=ruleTYPE_CONTAINS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainsRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.browser.mydsl.MyDsl.TYPE_CONTAINS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:463:3: ( (lv_parametre_2_0= ruleTYPE_PARAMETRE ) )
            // InternalMyDsl.g:464:4: (lv_parametre_2_0= ruleTYPE_PARAMETRE )
            {
            // InternalMyDsl.g:464:4: (lv_parametre_2_0= ruleTYPE_PARAMETRE )
            // InternalMyDsl.g:465:5: lv_parametre_2_0= ruleTYPE_PARAMETRE
            {

            					newCompositeNode(grammarAccess.getContainsAccess().getParametreTYPE_PARAMETREParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_parametre_2_0=ruleTYPE_PARAMETRE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainsRule());
            					}
            					set(
            						current,
            						"parametre",
            						lv_parametre_2_0,
            						"org.xtext.browser.mydsl.MyDsl.TYPE_PARAMETRE");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContains"


    // $ANTLR start "entryRuleTYPE_CONTAINS"
    // InternalMyDsl.g:486:1: entryRuleTYPE_CONTAINS returns [String current=null] : iv_ruleTYPE_CONTAINS= ruleTYPE_CONTAINS EOF ;
    public final String entryRuleTYPE_CONTAINS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE_CONTAINS = null;


        try {
            // InternalMyDsl.g:486:53: (iv_ruleTYPE_CONTAINS= ruleTYPE_CONTAINS EOF )
            // InternalMyDsl.g:487:2: iv_ruleTYPE_CONTAINS= ruleTYPE_CONTAINS EOF
            {
             newCompositeNode(grammarAccess.getTYPE_CONTAINSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTYPE_CONTAINS=ruleTYPE_CONTAINS();

            state._fsp--;

             current =iv_ruleTYPE_CONTAINS.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTYPE_CONTAINS"


    // $ANTLR start "ruleTYPE_CONTAINS"
    // InternalMyDsl.g:493:1: ruleTYPE_CONTAINS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Text' | kw= 'Link' | kw= 'Image' ) ;
    public final AntlrDatatypeRuleToken ruleTYPE_CONTAINS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:499:2: ( (kw= 'Text' | kw= 'Link' | kw= 'Image' ) )
            // InternalMyDsl.g:500:2: (kw= 'Text' | kw= 'Link' | kw= 'Image' )
            {
            // InternalMyDsl.g:500:2: (kw= 'Text' | kw= 'Link' | kw= 'Image' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:501:3: kw= 'Text'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTYPE_CONTAINSAccess().getTextKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:507:3: kw= 'Link'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTYPE_CONTAINSAccess().getLinkKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:513:3: kw= 'Image'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTYPE_CONTAINSAccess().getImageKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPE_CONTAINS"


    // $ANTLR start "entryRuleTYPE_PARAMETRE"
    // InternalMyDsl.g:522:1: entryRuleTYPE_PARAMETRE returns [EObject current=null] : iv_ruleTYPE_PARAMETRE= ruleTYPE_PARAMETRE EOF ;
    public final EObject entryRuleTYPE_PARAMETRE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTYPE_PARAMETRE = null;


        try {
            // InternalMyDsl.g:522:55: (iv_ruleTYPE_PARAMETRE= ruleTYPE_PARAMETRE EOF )
            // InternalMyDsl.g:523:2: iv_ruleTYPE_PARAMETRE= ruleTYPE_PARAMETRE EOF
            {
             newCompositeNode(grammarAccess.getTYPE_PARAMETRERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTYPE_PARAMETRE=ruleTYPE_PARAMETRE();

            state._fsp--;

             current =iv_ruleTYPE_PARAMETRE; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTYPE_PARAMETRE"


    // $ANTLR start "ruleTYPE_PARAMETRE"
    // InternalMyDsl.g:529:1: ruleTYPE_PARAMETRE returns [EObject current=null] : (this_Value_0= ruleValue | this_Var_1= ruleVar ) ;
    public final EObject ruleTYPE_PARAMETRE() throws RecognitionException {
        EObject current = null;

        EObject this_Value_0 = null;

        EObject this_Var_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:535:2: ( (this_Value_0= ruleValue | this_Var_1= ruleVar ) )
            // InternalMyDsl.g:536:2: (this_Value_0= ruleValue | this_Var_1= ruleVar )
            {
            // InternalMyDsl.g:536:2: (this_Value_0= ruleValue | this_Var_1= ruleVar )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:537:3: this_Value_0= ruleValue
                    {

                    			newCompositeNode(grammarAccess.getTYPE_PARAMETREAccess().getValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Value_0=ruleValue();

                    state._fsp--;


                    			current = this_Value_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:546:3: this_Var_1= ruleVar
                    {

                    			newCompositeNode(grammarAccess.getTYPE_PARAMETREAccess().getVarParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Var_1=ruleVar();

                    state._fsp--;


                    			current = this_Var_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPE_PARAMETRE"


    // $ANTLR start "entryRuleValue"
    // InternalMyDsl.g:558:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalMyDsl.g:558:46: (iv_ruleValue= ruleValue EOF )
            // InternalMyDsl.g:559:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyDsl.g:565:1: ruleValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:571:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:572:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:572:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:573:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:573:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:574:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getValueAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleVar"
    // InternalMyDsl.g:593:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalMyDsl.g:593:44: (iv_ruleVar= ruleVar EOF )
            // InternalMyDsl.g:594:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalMyDsl.g:600:1: ruleVar returns [EObject current=null] : (otherlv_0= '(' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:606:2: ( (otherlv_0= '(' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:607:2: (otherlv_0= '(' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:607:2: (otherlv_0= '(' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ')' )
            // InternalMyDsl.g:608:3: otherlv_0= '(' ( (lv_value_1_0= RULE_ID ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getVarAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:612:3: ( (lv_value_1_0= RULE_ID ) )
            // InternalMyDsl.g:613:4: (lv_value_1_0= RULE_ID )
            {
            // InternalMyDsl.g:613:4: (lv_value_1_0= RULE_ID )
            // InternalMyDsl.g:614:5: lv_value_1_0= RULE_ID
            {
            lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_value_1_0, grammarAccess.getVarAccess().getValueIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getVarAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleEqual"
    // InternalMyDsl.g:638:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalMyDsl.g:638:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalMyDsl.g:639:2: iv_ruleEqual= ruleEqual EOF
            {
             newCompositeNode(grammarAccess.getEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqual=ruleEqual();

            state._fsp--;

             current =iv_ruleEqual; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalMyDsl.g:645:1: ruleEqual returns [EObject current=null] : (otherlv_0= 'Equal' otherlv_1= '(' ( (lv_var1_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '(' ( (lv_var2_5_0= RULE_ID ) ) otherlv_6= ')' ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_var1_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_var2_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:651:2: ( (otherlv_0= 'Equal' otherlv_1= '(' ( (lv_var1_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '(' ( (lv_var2_5_0= RULE_ID ) ) otherlv_6= ')' ) )
            // InternalMyDsl.g:652:2: (otherlv_0= 'Equal' otherlv_1= '(' ( (lv_var1_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '(' ( (lv_var2_5_0= RULE_ID ) ) otherlv_6= ')' )
            {
            // InternalMyDsl.g:652:2: (otherlv_0= 'Equal' otherlv_1= '(' ( (lv_var1_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '(' ( (lv_var2_5_0= RULE_ID ) ) otherlv_6= ')' )
            // InternalMyDsl.g:653:3: otherlv_0= 'Equal' otherlv_1= '(' ( (lv_var1_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '(' ( (lv_var2_5_0= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEqualAccess().getEqualKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEqualAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:661:3: ( (lv_var1_2_0= RULE_ID ) )
            // InternalMyDsl.g:662:4: (lv_var1_2_0= RULE_ID )
            {
            // InternalMyDsl.g:662:4: (lv_var1_2_0= RULE_ID )
            // InternalMyDsl.g:663:5: lv_var1_2_0= RULE_ID
            {
            lv_var1_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_var1_2_0, grammarAccess.getEqualAccess().getVar1IDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEqualRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var1",
            						lv_var1_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getEqualAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getEqualAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMyDsl.g:687:3: ( (lv_var2_5_0= RULE_ID ) )
            // InternalMyDsl.g:688:4: (lv_var2_5_0= RULE_ID )
            {
            // InternalMyDsl.g:688:4: (lv_var2_5_0= RULE_ID )
            // InternalMyDsl.g:689:5: lv_var2_5_0= RULE_ID
            {
            lv_var2_5_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_var2_5_0, grammarAccess.getEqualAccess().getVar2IDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEqualRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var2",
            						lv_var2_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEqualAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleClick"
    // InternalMyDsl.g:713:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalMyDsl.g:713:46: (iv_ruleClick= ruleClick EOF )
            // InternalMyDsl.g:714:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalMyDsl.g:720:1: ruleClick returns [EObject current=null] : (otherlv_0= 'Click' ( (lv_type_1_0= ruleTYPE_CLICK ) ) ( (lv_parametre_2_0= ruleTYPE_PARAMETRE ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_parametre_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:726:2: ( (otherlv_0= 'Click' ( (lv_type_1_0= ruleTYPE_CLICK ) ) ( (lv_parametre_2_0= ruleTYPE_PARAMETRE ) ) ) )
            // InternalMyDsl.g:727:2: (otherlv_0= 'Click' ( (lv_type_1_0= ruleTYPE_CLICK ) ) ( (lv_parametre_2_0= ruleTYPE_PARAMETRE ) ) )
            {
            // InternalMyDsl.g:727:2: (otherlv_0= 'Click' ( (lv_type_1_0= ruleTYPE_CLICK ) ) ( (lv_parametre_2_0= ruleTYPE_PARAMETRE ) ) )
            // InternalMyDsl.g:728:3: otherlv_0= 'Click' ( (lv_type_1_0= ruleTYPE_CLICK ) ) ( (lv_parametre_2_0= ruleTYPE_PARAMETRE ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
            		
            // InternalMyDsl.g:732:3: ( (lv_type_1_0= ruleTYPE_CLICK ) )
            // InternalMyDsl.g:733:4: (lv_type_1_0= ruleTYPE_CLICK )
            {
            // InternalMyDsl.g:733:4: (lv_type_1_0= ruleTYPE_CLICK )
            // InternalMyDsl.g:734:5: lv_type_1_0= ruleTYPE_CLICK
            {

            					newCompositeNode(grammarAccess.getClickAccess().getTypeTYPE_CLICKParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_type_1_0=ruleTYPE_CLICK();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.browser.mydsl.MyDsl.TYPE_CLICK");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:751:3: ( (lv_parametre_2_0= ruleTYPE_PARAMETRE ) )
            // InternalMyDsl.g:752:4: (lv_parametre_2_0= ruleTYPE_PARAMETRE )
            {
            // InternalMyDsl.g:752:4: (lv_parametre_2_0= ruleTYPE_PARAMETRE )
            // InternalMyDsl.g:753:5: lv_parametre_2_0= ruleTYPE_PARAMETRE
            {

            					newCompositeNode(grammarAccess.getClickAccess().getParametreTYPE_PARAMETREParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_parametre_2_0=ruleTYPE_PARAMETRE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickRule());
            					}
            					set(
            						current,
            						"parametre",
            						lv_parametre_2_0,
            						"org.xtext.browser.mydsl.MyDsl.TYPE_PARAMETRE");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleTYPE_CLICK"
    // InternalMyDsl.g:774:1: entryRuleTYPE_CLICK returns [String current=null] : iv_ruleTYPE_CLICK= ruleTYPE_CLICK EOF ;
    public final String entryRuleTYPE_CLICK() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE_CLICK = null;


        try {
            // InternalMyDsl.g:774:50: (iv_ruleTYPE_CLICK= ruleTYPE_CLICK EOF )
            // InternalMyDsl.g:775:2: iv_ruleTYPE_CLICK= ruleTYPE_CLICK EOF
            {
             newCompositeNode(grammarAccess.getTYPE_CLICKRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTYPE_CLICK=ruleTYPE_CLICK();

            state._fsp--;

             current =iv_ruleTYPE_CLICK.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTYPE_CLICK"


    // $ANTLR start "ruleTYPE_CLICK"
    // InternalMyDsl.g:781:1: ruleTYPE_CLICK returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Link' | kw= 'Button' | kw= 'Image' ) ;
    public final AntlrDatatypeRuleToken ruleTYPE_CLICK() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:787:2: ( (kw= 'Link' | kw= 'Button' | kw= 'Image' ) )
            // InternalMyDsl.g:788:2: (kw= 'Link' | kw= 'Button' | kw= 'Image' )
            {
            // InternalMyDsl.g:788:2: (kw= 'Link' | kw= 'Button' | kw= 'Image' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:789:3: kw= 'Link'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTYPE_CLICKAccess().getLinkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:795:3: kw= 'Button'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTYPE_CLICKAccess().getButtonKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:801:3: kw= 'Image'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTYPE_CLICKAccess().getImageKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPE_CLICK"


    // $ANTLR start "entryRuleInsert"
    // InternalMyDsl.g:810:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalMyDsl.g:810:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalMyDsl.g:811:2: iv_ruleInsert= ruleInsert EOF
            {
             newCompositeNode(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsert=ruleInsert();

            state._fsp--;

             current =iv_ruleInsert; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalMyDsl.g:817:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'Insert' otherlv_1= 'in' ( (lv_type_2_0= ruleTYPE_INSERT ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_parametre_5_0= ruleTYPE_PARAMETRE ) ) ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;

        EObject lv_parametre_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:823:2: ( (otherlv_0= 'Insert' otherlv_1= 'in' ( (lv_type_2_0= ruleTYPE_INSERT ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_parametre_5_0= ruleTYPE_PARAMETRE ) ) ) )
            // InternalMyDsl.g:824:2: (otherlv_0= 'Insert' otherlv_1= 'in' ( (lv_type_2_0= ruleTYPE_INSERT ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_parametre_5_0= ruleTYPE_PARAMETRE ) ) )
            {
            // InternalMyDsl.g:824:2: (otherlv_0= 'Insert' otherlv_1= 'in' ( (lv_type_2_0= ruleTYPE_INSERT ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_parametre_5_0= ruleTYPE_PARAMETRE ) ) )
            // InternalMyDsl.g:825:3: otherlv_0= 'Insert' otherlv_1= 'in' ( (lv_type_2_0= ruleTYPE_INSERT ) ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'with' ( (lv_parametre_5_0= ruleTYPE_PARAMETRE ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertAccess().getInKeyword_1());
            		
            // InternalMyDsl.g:833:3: ( (lv_type_2_0= ruleTYPE_INSERT ) )
            // InternalMyDsl.g:834:4: (lv_type_2_0= ruleTYPE_INSERT )
            {
            // InternalMyDsl.g:834:4: (lv_type_2_0= ruleTYPE_INSERT )
            // InternalMyDsl.g:835:5: lv_type_2_0= ruleTYPE_INSERT
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getTypeTYPE_INSERTParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_2_0=ruleTYPE_INSERT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.browser.mydsl.MyDsl.TYPE_INSERT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:852:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalMyDsl.g:853:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:853:4: (lv_name_3_0= RULE_STRING )
            // InternalMyDsl.g:854:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_name_3_0, grammarAccess.getInsertAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getInsertAccess().getWithKeyword_4());
            		
            // InternalMyDsl.g:874:3: ( (lv_parametre_5_0= ruleTYPE_PARAMETRE ) )
            // InternalMyDsl.g:875:4: (lv_parametre_5_0= ruleTYPE_PARAMETRE )
            {
            // InternalMyDsl.g:875:4: (lv_parametre_5_0= ruleTYPE_PARAMETRE )
            // InternalMyDsl.g:876:5: lv_parametre_5_0= ruleTYPE_PARAMETRE
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getParametreTYPE_PARAMETREParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_parametre_5_0=ruleTYPE_PARAMETRE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"parametre",
            						lv_parametre_5_0,
            						"org.xtext.browser.mydsl.MyDsl.TYPE_PARAMETRE");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleTYPE_INSERT"
    // InternalMyDsl.g:897:1: entryRuleTYPE_INSERT returns [String current=null] : iv_ruleTYPE_INSERT= ruleTYPE_INSERT EOF ;
    public final String entryRuleTYPE_INSERT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE_INSERT = null;


        try {
            // InternalMyDsl.g:897:51: (iv_ruleTYPE_INSERT= ruleTYPE_INSERT EOF )
            // InternalMyDsl.g:898:2: iv_ruleTYPE_INSERT= ruleTYPE_INSERT EOF
            {
             newCompositeNode(grammarAccess.getTYPE_INSERTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTYPE_INSERT=ruleTYPE_INSERT();

            state._fsp--;

             current =iv_ruleTYPE_INSERT.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTYPE_INSERT"


    // $ANTLR start "ruleTYPE_INSERT"
    // InternalMyDsl.g:904:1: ruleTYPE_INSERT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'SearchField' ;
    public final AntlrDatatypeRuleToken ruleTYPE_INSERT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:910:2: (kw= 'SearchField' )
            // InternalMyDsl.g:911:2: kw= 'SearchField'
            {
            kw=(Token)match(input,29,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTYPE_INSERTAccess().getSearchFieldKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPE_INSERT"


    // $ANTLR start "entryRuleUncheck"
    // InternalMyDsl.g:919:1: entryRuleUncheck returns [EObject current=null] : iv_ruleUncheck= ruleUncheck EOF ;
    public final EObject entryRuleUncheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUncheck = null;


        try {
            // InternalMyDsl.g:919:48: (iv_ruleUncheck= ruleUncheck EOF )
            // InternalMyDsl.g:920:2: iv_ruleUncheck= ruleUncheck EOF
            {
             newCompositeNode(grammarAccess.getUncheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUncheck=ruleUncheck();

            state._fsp--;

             current =iv_ruleUncheck; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUncheck"


    // $ANTLR start "ruleUncheck"
    // InternalMyDsl.g:926:1: ruleUncheck returns [EObject current=null] : (otherlv_0= 'Uncheck' ( (lv_type_1_0= ruleTYPE_CHECK_UNCHECK ) ) ) ;
    public final EObject ruleUncheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:932:2: ( (otherlv_0= 'Uncheck' ( (lv_type_1_0= ruleTYPE_CHECK_UNCHECK ) ) ) )
            // InternalMyDsl.g:933:2: (otherlv_0= 'Uncheck' ( (lv_type_1_0= ruleTYPE_CHECK_UNCHECK ) ) )
            {
            // InternalMyDsl.g:933:2: (otherlv_0= 'Uncheck' ( (lv_type_1_0= ruleTYPE_CHECK_UNCHECK ) ) )
            // InternalMyDsl.g:934:3: otherlv_0= 'Uncheck' ( (lv_type_1_0= ruleTYPE_CHECK_UNCHECK ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getUncheckAccess().getUncheckKeyword_0());
            		
            // InternalMyDsl.g:938:3: ( (lv_type_1_0= ruleTYPE_CHECK_UNCHECK ) )
            // InternalMyDsl.g:939:4: (lv_type_1_0= ruleTYPE_CHECK_UNCHECK )
            {
            // InternalMyDsl.g:939:4: (lv_type_1_0= ruleTYPE_CHECK_UNCHECK )
            // InternalMyDsl.g:940:5: lv_type_1_0= ruleTYPE_CHECK_UNCHECK
            {

            					newCompositeNode(grammarAccess.getUncheckAccess().getTypeTYPE_CHECK_UNCHECKParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleTYPE_CHECK_UNCHECK();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUncheckRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.browser.mydsl.MyDsl.TYPE_CHECK_UNCHECK");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUncheck"


    // $ANTLR start "entryRuleTYPE_CHECK_UNCHECK"
    // InternalMyDsl.g:961:1: entryRuleTYPE_CHECK_UNCHECK returns [EObject current=null] : iv_ruleTYPE_CHECK_UNCHECK= ruleTYPE_CHECK_UNCHECK EOF ;
    public final EObject entryRuleTYPE_CHECK_UNCHECK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTYPE_CHECK_UNCHECK = null;


        try {
            // InternalMyDsl.g:961:59: (iv_ruleTYPE_CHECK_UNCHECK= ruleTYPE_CHECK_UNCHECK EOF )
            // InternalMyDsl.g:962:2: iv_ruleTYPE_CHECK_UNCHECK= ruleTYPE_CHECK_UNCHECK EOF
            {
             newCompositeNode(grammarAccess.getTYPE_CHECK_UNCHECKRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTYPE_CHECK_UNCHECK=ruleTYPE_CHECK_UNCHECK();

            state._fsp--;

             current =iv_ruleTYPE_CHECK_UNCHECK; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTYPE_CHECK_UNCHECK"


    // $ANTLR start "ruleTYPE_CHECK_UNCHECK"
    // InternalMyDsl.g:968:1: ruleTYPE_CHECK_UNCHECK returns [EObject current=null] : (otherlv_0= 'all' | (otherlv_1= '[' ( (lv_tableau_2_0= RULE_STRING ) )* otherlv_3= ']' ) ) ;
    public final EObject ruleTYPE_CHECK_UNCHECK() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tableau_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:974:2: ( (otherlv_0= 'all' | (otherlv_1= '[' ( (lv_tableau_2_0= RULE_STRING ) )* otherlv_3= ']' ) ) )
            // InternalMyDsl.g:975:2: (otherlv_0= 'all' | (otherlv_1= '[' ( (lv_tableau_2_0= RULE_STRING ) )* otherlv_3= ']' ) )
            {
            // InternalMyDsl.g:975:2: (otherlv_0= 'all' | (otherlv_1= '[' ( (lv_tableau_2_0= RULE_STRING ) )* otherlv_3= ']' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            else if ( (LA8_0==32) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:976:3: otherlv_0= 'all'
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getTYPE_CHECK_UNCHECKAccess().getAllKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:981:3: (otherlv_1= '[' ( (lv_tableau_2_0= RULE_STRING ) )* otherlv_3= ']' )
                    {
                    // InternalMyDsl.g:981:3: (otherlv_1= '[' ( (lv_tableau_2_0= RULE_STRING ) )* otherlv_3= ']' )
                    // InternalMyDsl.g:982:4: otherlv_1= '[' ( (lv_tableau_2_0= RULE_STRING ) )* otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getTYPE_CHECK_UNCHECKAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMyDsl.g:986:4: ( (lv_tableau_2_0= RULE_STRING ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_STRING) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:987:5: (lv_tableau_2_0= RULE_STRING )
                    	    {
                    	    // InternalMyDsl.g:987:5: (lv_tableau_2_0= RULE_STRING )
                    	    // InternalMyDsl.g:988:6: lv_tableau_2_0= RULE_STRING
                    	    {
                    	    lv_tableau_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    	    						newLeafNode(lv_tableau_2_0, grammarAccess.getTYPE_CHECK_UNCHECKAccess().getTableauSTRINGTerminalRuleCall_1_1_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getTYPE_CHECK_UNCHECKRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"tableau",
                    	    							lv_tableau_2_0,
                    	    							"org.eclipse.xtext.common.Terminals.STRING");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTYPE_CHECK_UNCHECKAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPE_CHECK_UNCHECK"


    // $ANTLR start "entryRuleCheck"
    // InternalMyDsl.g:1013:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // InternalMyDsl.g:1013:46: (iv_ruleCheck= ruleCheck EOF )
            // InternalMyDsl.g:1014:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalMyDsl.g:1020:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'Check' ( (lv_type_1_0= ruleTYPE_CHECK_UNCHECK ) ) ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1026:2: ( (otherlv_0= 'Check' ( (lv_type_1_0= ruleTYPE_CHECK_UNCHECK ) ) ) )
            // InternalMyDsl.g:1027:2: (otherlv_0= 'Check' ( (lv_type_1_0= ruleTYPE_CHECK_UNCHECK ) ) )
            {
            // InternalMyDsl.g:1027:2: (otherlv_0= 'Check' ( (lv_type_1_0= ruleTYPE_CHECK_UNCHECK ) ) )
            // InternalMyDsl.g:1028:3: otherlv_0= 'Check' ( (lv_type_1_0= ruleTYPE_CHECK_UNCHECK ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
            		
            // InternalMyDsl.g:1032:3: ( (lv_type_1_0= ruleTYPE_CHECK_UNCHECK ) )
            // InternalMyDsl.g:1033:4: (lv_type_1_0= ruleTYPE_CHECK_UNCHECK )
            {
            // InternalMyDsl.g:1033:4: (lv_type_1_0= ruleTYPE_CHECK_UNCHECK )
            // InternalMyDsl.g:1034:5: lv_type_1_0= ruleTYPE_CHECK_UNCHECK
            {

            					newCompositeNode(grammarAccess.getCheckAccess().getTypeTYPE_CHECK_UNCHECKParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleTYPE_CHECK_UNCHECK();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.browser.mydsl.MyDsl.TYPE_CHECK_UNCHECK");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleChoose"
    // InternalMyDsl.g:1055:1: entryRuleChoose returns [EObject current=null] : iv_ruleChoose= ruleChoose EOF ;
    public final EObject entryRuleChoose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoose = null;


        try {
            // InternalMyDsl.g:1055:47: (iv_ruleChoose= ruleChoose EOF )
            // InternalMyDsl.g:1056:2: iv_ruleChoose= ruleChoose EOF
            {
             newCompositeNode(grammarAccess.getChooseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoose=ruleChoose();

            state._fsp--;

             current =iv_ruleChoose; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChoose"


    // $ANTLR start "ruleChoose"
    // InternalMyDsl.g:1062:1: ruleChoose returns [EObject current=null] : (otherlv_0= 'Choose' ( (lv_type_1_0= ruleTYPE_CHOOSE ) ) ( (lv_parametre_2_0= RULE_STRING ) ) otherlv_3= 'in' ( (lv_name_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleChoose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_parametre_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1068:2: ( (otherlv_0= 'Choose' ( (lv_type_1_0= ruleTYPE_CHOOSE ) ) ( (lv_parametre_2_0= RULE_STRING ) ) otherlv_3= 'in' ( (lv_name_4_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1069:2: (otherlv_0= 'Choose' ( (lv_type_1_0= ruleTYPE_CHOOSE ) ) ( (lv_parametre_2_0= RULE_STRING ) ) otherlv_3= 'in' ( (lv_name_4_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1069:2: (otherlv_0= 'Choose' ( (lv_type_1_0= ruleTYPE_CHOOSE ) ) ( (lv_parametre_2_0= RULE_STRING ) ) otherlv_3= 'in' ( (lv_name_4_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1070:3: otherlv_0= 'Choose' ( (lv_type_1_0= ruleTYPE_CHOOSE ) ) ( (lv_parametre_2_0= RULE_STRING ) ) otherlv_3= 'in' ( (lv_name_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getChooseAccess().getChooseKeyword_0());
            		
            // InternalMyDsl.g:1074:3: ( (lv_type_1_0= ruleTYPE_CHOOSE ) )
            // InternalMyDsl.g:1075:4: (lv_type_1_0= ruleTYPE_CHOOSE )
            {
            // InternalMyDsl.g:1075:4: (lv_type_1_0= ruleTYPE_CHOOSE )
            // InternalMyDsl.g:1076:5: lv_type_1_0= ruleTYPE_CHOOSE
            {

            					newCompositeNode(grammarAccess.getChooseAccess().getTypeTYPE_CHOOSEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_1_0=ruleTYPE_CHOOSE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChooseRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.browser.mydsl.MyDsl.TYPE_CHOOSE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1093:3: ( (lv_parametre_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1094:4: (lv_parametre_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1094:4: (lv_parametre_2_0= RULE_STRING )
            // InternalMyDsl.g:1095:5: lv_parametre_2_0= RULE_STRING
            {
            lv_parametre_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_parametre_2_0, grammarAccess.getChooseAccess().getParametreSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChooseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parametre",
            						lv_parametre_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getChooseAccess().getInKeyword_3());
            		
            // InternalMyDsl.g:1115:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalMyDsl.g:1116:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalMyDsl.g:1116:4: (lv_name_4_0= RULE_STRING )
            // InternalMyDsl.g:1117:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getChooseAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChooseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoose"


    // $ANTLR start "entryRuleTYPE_CHOOSE"
    // InternalMyDsl.g:1137:1: entryRuleTYPE_CHOOSE returns [String current=null] : iv_ruleTYPE_CHOOSE= ruleTYPE_CHOOSE EOF ;
    public final String entryRuleTYPE_CHOOSE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE_CHOOSE = null;


        try {
            // InternalMyDsl.g:1137:51: (iv_ruleTYPE_CHOOSE= ruleTYPE_CHOOSE EOF )
            // InternalMyDsl.g:1138:2: iv_ruleTYPE_CHOOSE= ruleTYPE_CHOOSE EOF
            {
             newCompositeNode(grammarAccess.getTYPE_CHOOSERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTYPE_CHOOSE=ruleTYPE_CHOOSE();

            state._fsp--;

             current =iv_ruleTYPE_CHOOSE.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTYPE_CHOOSE"


    // $ANTLR start "ruleTYPE_CHOOSE"
    // InternalMyDsl.g:1144:1: ruleTYPE_CHOOSE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Box' ;
    public final AntlrDatatypeRuleToken ruleTYPE_CHOOSE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1150:2: (kw= 'Box' )
            // InternalMyDsl.g:1151:2: kw= 'Box'
            {
            kw=(Token)match(input,36,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTYPE_CHOOSEAccess().getBoxKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPE_CHOOSE"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:1159:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMyDsl.g:1159:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMyDsl.g:1160:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyDsl.g:1166:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_instruction_2_0= ruleTYPE_INSTRUCTION ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_instruction_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1172:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_instruction_2_0= ruleTYPE_INSTRUCTION ) ) ) )
            // InternalMyDsl.g:1173:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_instruction_2_0= ruleTYPE_INSTRUCTION ) ) )
            {
            // InternalMyDsl.g:1173:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_instruction_2_0= ruleTYPE_INSTRUCTION ) ) )
            // InternalMyDsl.g:1174:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_instruction_2_0= ruleTYPE_INSTRUCTION ) )
            {
            // InternalMyDsl.g:1174:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:1175:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1175:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:1176:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:1196:3: ( (lv_instruction_2_0= ruleTYPE_INSTRUCTION ) )
            // InternalMyDsl.g:1197:4: (lv_instruction_2_0= ruleTYPE_INSTRUCTION )
            {
            // InternalMyDsl.g:1197:4: (lv_instruction_2_0= ruleTYPE_INSTRUCTION )
            // InternalMyDsl.g:1198:5: lv_instruction_2_0= ruleTYPE_INSTRUCTION
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getInstructionTYPE_INSTRUCTIONParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_instruction_2_0=ruleTYPE_INSTRUCTION();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"instruction",
            						lv_instruction_2_0,
            						"org.xtext.browser.mydsl.MyDsl.TYPE_INSTRUCTION");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleTYPE_INSTRUCTION"
    // InternalMyDsl.g:1219:1: entryRuleTYPE_INSTRUCTION returns [EObject current=null] : iv_ruleTYPE_INSTRUCTION= ruleTYPE_INSTRUCTION EOF ;
    public final EObject entryRuleTYPE_INSTRUCTION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTYPE_INSTRUCTION = null;


        try {
            // InternalMyDsl.g:1219:57: (iv_ruleTYPE_INSTRUCTION= ruleTYPE_INSTRUCTION EOF )
            // InternalMyDsl.g:1220:2: iv_ruleTYPE_INSTRUCTION= ruleTYPE_INSTRUCTION EOF
            {
             newCompositeNode(grammarAccess.getTYPE_INSTRUCTIONRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTYPE_INSTRUCTION=ruleTYPE_INSTRUCTION();

            state._fsp--;

             current =iv_ruleTYPE_INSTRUCTION; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTYPE_INSTRUCTION"


    // $ANTLR start "ruleTYPE_INSTRUCTION"
    // InternalMyDsl.g:1226:1: ruleTYPE_INSTRUCTION returns [EObject current=null] : (this_Read_0= ruleRead | this_Count_1= ruleCount ) ;
    public final EObject ruleTYPE_INSTRUCTION() throws RecognitionException {
        EObject current = null;

        EObject this_Read_0 = null;

        EObject this_Count_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1232:2: ( (this_Read_0= ruleRead | this_Count_1= ruleCount ) )
            // InternalMyDsl.g:1233:2: (this_Read_0= ruleRead | this_Count_1= ruleCount )
            {
            // InternalMyDsl.g:1233:2: (this_Read_0= ruleRead | this_Count_1= ruleCount )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==38) ) {
                alt9=1;
            }
            else if ( (LA9_0==41) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1234:3: this_Read_0= ruleRead
                    {

                    			newCompositeNode(grammarAccess.getTYPE_INSTRUCTIONAccess().getReadParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Read_0=ruleRead();

                    state._fsp--;


                    			current = this_Read_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1243:3: this_Count_1= ruleCount
                    {

                    			newCompositeNode(grammarAccess.getTYPE_INSTRUCTIONAccess().getCountParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Count_1=ruleCount();

                    state._fsp--;


                    			current = this_Count_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPE_INSTRUCTION"


    // $ANTLR start "entryRuleRead"
    // InternalMyDsl.g:1255:1: entryRuleRead returns [EObject current=null] : iv_ruleRead= ruleRead EOF ;
    public final EObject entryRuleRead() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRead = null;


        try {
            // InternalMyDsl.g:1255:45: (iv_ruleRead= ruleRead EOF )
            // InternalMyDsl.g:1256:2: iv_ruleRead= ruleRead EOF
            {
             newCompositeNode(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRead=ruleRead();

            state._fsp--;

             current =iv_ruleRead; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalMyDsl.g:1262:1: ruleRead returns [EObject current=null] : (otherlv_0= 'Read' ( (lv_type_1_0= ruleTYPE_READ ) ) otherlv_2= 'of Element ' ( (lv_parametre_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleRead() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_parametre_3_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1268:2: ( (otherlv_0= 'Read' ( (lv_type_1_0= ruleTYPE_READ ) ) otherlv_2= 'of Element ' ( (lv_parametre_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1269:2: (otherlv_0= 'Read' ( (lv_type_1_0= ruleTYPE_READ ) ) otherlv_2= 'of Element ' ( (lv_parametre_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1269:2: (otherlv_0= 'Read' ( (lv_type_1_0= ruleTYPE_READ ) ) otherlv_2= 'of Element ' ( (lv_parametre_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1270:3: otherlv_0= 'Read' ( (lv_type_1_0= ruleTYPE_READ ) ) otherlv_2= 'of Element ' ( (lv_parametre_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getReadAccess().getReadKeyword_0());
            		
            // InternalMyDsl.g:1274:3: ( (lv_type_1_0= ruleTYPE_READ ) )
            // InternalMyDsl.g:1275:4: (lv_type_1_0= ruleTYPE_READ )
            {
            // InternalMyDsl.g:1275:4: (lv_type_1_0= ruleTYPE_READ )
            // InternalMyDsl.g:1276:5: lv_type_1_0= ruleTYPE_READ
            {

            					newCompositeNode(grammarAccess.getReadAccess().getTypeTYPE_READParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_type_1_0=ruleTYPE_READ();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReadRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.browser.mydsl.MyDsl.TYPE_READ");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getReadAccess().getOfElementKeyword_2());
            		
            // InternalMyDsl.g:1297:3: ( (lv_parametre_3_0= RULE_STRING ) )
            // InternalMyDsl.g:1298:4: (lv_parametre_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:1298:4: (lv_parametre_3_0= RULE_STRING )
            // InternalMyDsl.g:1299:5: lv_parametre_3_0= RULE_STRING
            {
            lv_parametre_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_parametre_3_0, grammarAccess.getReadAccess().getParametreSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parametre",
            						lv_parametre_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleTYPE_READ"
    // InternalMyDsl.g:1319:1: entryRuleTYPE_READ returns [String current=null] : iv_ruleTYPE_READ= ruleTYPE_READ EOF ;
    public final String entryRuleTYPE_READ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE_READ = null;


        try {
            // InternalMyDsl.g:1319:49: (iv_ruleTYPE_READ= ruleTYPE_READ EOF )
            // InternalMyDsl.g:1320:2: iv_ruleTYPE_READ= ruleTYPE_READ EOF
            {
             newCompositeNode(grammarAccess.getTYPE_READRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTYPE_READ=ruleTYPE_READ();

            state._fsp--;

             current =iv_ruleTYPE_READ.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTYPE_READ"


    // $ANTLR start "ruleTYPE_READ"
    // InternalMyDsl.g:1326:1: ruleTYPE_READ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Link' | kw= 'Title' ) ;
    public final AntlrDatatypeRuleToken ruleTYPE_READ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1332:2: ( (kw= 'Link' | kw= 'Title' ) )
            // InternalMyDsl.g:1333:2: (kw= 'Link' | kw= 'Title' )
            {
            // InternalMyDsl.g:1333:2: (kw= 'Link' | kw= 'Title' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==40) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1334:3: kw= 'Link'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTYPE_READAccess().getLinkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1340:3: kw= 'Title'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTYPE_READAccess().getTitleKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPE_READ"


    // $ANTLR start "entryRuleCount"
    // InternalMyDsl.g:1349:1: entryRuleCount returns [EObject current=null] : iv_ruleCount= ruleCount EOF ;
    public final EObject entryRuleCount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCount = null;


        try {
            // InternalMyDsl.g:1349:46: (iv_ruleCount= ruleCount EOF )
            // InternalMyDsl.g:1350:2: iv_ruleCount= ruleCount EOF
            {
             newCompositeNode(grammarAccess.getCountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCount=ruleCount();

            state._fsp--;

             current =iv_ruleCount; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCount"


    // $ANTLR start "ruleCount"
    // InternalMyDsl.g:1356:1: ruleCount returns [EObject current=null] : (otherlv_0= 'Count of Element ' ( (lv_parametre_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCount() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_parametre_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1362:2: ( (otherlv_0= 'Count of Element ' ( (lv_parametre_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:1363:2: (otherlv_0= 'Count of Element ' ( (lv_parametre_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:1363:2: (otherlv_0= 'Count of Element ' ( (lv_parametre_1_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1364:3: otherlv_0= 'Count of Element ' ( (lv_parametre_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCountAccess().getCountOfElementKeyword_0());
            		
            // InternalMyDsl.g:1368:3: ( (lv_parametre_1_0= RULE_STRING ) )
            // InternalMyDsl.g:1369:4: (lv_parametre_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:1369:4: (lv_parametre_1_0= RULE_STRING )
            // InternalMyDsl.g:1370:5: lv_parametre_1_0= RULE_STRING
            {
            lv_parametre_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_parametre_1_0, grammarAccess.getCountAccess().getParametreSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parametre",
            						lv_parametre_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCount"


    // $ANTLR start "entryRulePaste"
    // InternalMyDsl.g:1390:1: entryRulePaste returns [EObject current=null] : iv_rulePaste= rulePaste EOF ;
    public final EObject entryRulePaste() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaste = null;


        try {
            // InternalMyDsl.g:1390:46: (iv_rulePaste= rulePaste EOF )
            // InternalMyDsl.g:1391:2: iv_rulePaste= rulePaste EOF
            {
             newCompositeNode(grammarAccess.getPasteRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePaste=rulePaste();

            state._fsp--;

             current =iv_rulePaste; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePaste"


    // $ANTLR start "rulePaste"
    // InternalMyDsl.g:1397:1: rulePaste returns [EObject current=null] : (otherlv_0= 'Paste' ( (lv_type_1_0= ruleTYPE_PASTE ) ) otherlv_2= '(' ( (lv_parametre_3_0= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject rulePaste() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_parametre_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1403:2: ( (otherlv_0= 'Paste' ( (lv_type_1_0= ruleTYPE_PASTE ) ) otherlv_2= '(' ( (lv_parametre_3_0= RULE_ID ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:1404:2: (otherlv_0= 'Paste' ( (lv_type_1_0= ruleTYPE_PASTE ) ) otherlv_2= '(' ( (lv_parametre_3_0= RULE_ID ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:1404:2: (otherlv_0= 'Paste' ( (lv_type_1_0= ruleTYPE_PASTE ) ) otherlv_2= '(' ( (lv_parametre_3_0= RULE_ID ) ) otherlv_4= ')' )
            // InternalMyDsl.g:1405:3: otherlv_0= 'Paste' ( (lv_type_1_0= ruleTYPE_PASTE ) ) otherlv_2= '(' ( (lv_parametre_3_0= RULE_ID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getPasteAccess().getPasteKeyword_0());
            		
            // InternalMyDsl.g:1409:3: ( (lv_type_1_0= ruleTYPE_PASTE ) )
            // InternalMyDsl.g:1410:4: (lv_type_1_0= ruleTYPE_PASTE )
            {
            // InternalMyDsl.g:1410:4: (lv_type_1_0= ruleTYPE_PASTE )
            // InternalMyDsl.g:1411:5: lv_type_1_0= ruleTYPE_PASTE
            {

            					newCompositeNode(grammarAccess.getPasteAccess().getTypeTYPE_PASTEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_1_0=ruleTYPE_PASTE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPasteRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.browser.mydsl.MyDsl.TYPE_PASTE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPasteAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:1432:3: ( (lv_parametre_3_0= RULE_ID ) )
            // InternalMyDsl.g:1433:4: (lv_parametre_3_0= RULE_ID )
            {
            // InternalMyDsl.g:1433:4: (lv_parametre_3_0= RULE_ID )
            // InternalMyDsl.g:1434:5: lv_parametre_3_0= RULE_ID
            {
            lv_parametre_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_parametre_3_0, grammarAccess.getPasteAccess().getParametreIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPasteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parametre",
            						lv_parametre_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPasteAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePaste"


    // $ANTLR start "entryRuleTYPE_PASTE"
    // InternalMyDsl.g:1458:1: entryRuleTYPE_PASTE returns [String current=null] : iv_ruleTYPE_PASTE= ruleTYPE_PASTE EOF ;
    public final String entryRuleTYPE_PASTE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE_PASTE = null;


        try {
            // InternalMyDsl.g:1458:50: (iv_ruleTYPE_PASTE= ruleTYPE_PASTE EOF )
            // InternalMyDsl.g:1459:2: iv_ruleTYPE_PASTE= ruleTYPE_PASTE EOF
            {
             newCompositeNode(grammarAccess.getTYPE_PASTERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTYPE_PASTE=ruleTYPE_PASTE();

            state._fsp--;

             current =iv_ruleTYPE_PASTE.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTYPE_PASTE"


    // $ANTLR start "ruleTYPE_PASTE"
    // InternalMyDsl.g:1465:1: ruleTYPE_PASTE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'SearchField' ;
    public final AntlrDatatypeRuleToken ruleTYPE_PASTE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1471:2: (kw= 'SearchField' )
            // InternalMyDsl.g:1472:2: kw= 'SearchField'
            {
            kw=(Token)match(input,29,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTYPE_PASTEAccess().getSearchFieldKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPE_PASTE"


    // $ANTLR start "entryRuleFor"
    // InternalMyDsl.g:1480:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalMyDsl.g:1480:44: (iv_ruleFor= ruleFor EOF )
            // InternalMyDsl.g:1481:2: iv_ruleFor= ruleFor EOF
            {
             newCompositeNode(grammarAccess.getForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;

             current =iv_ruleFor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalMyDsl.g:1487:1: ruleFor returns [EObject current=null] : (otherlv_0= 'For' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '[' ( (lv_tableau_4_0= RULE_STRING ) )* otherlv_5= ']' ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_tableau_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1493:2: ( (otherlv_0= 'For' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '[' ( (lv_tableau_4_0= RULE_STRING ) )* otherlv_5= ']' ) )
            // InternalMyDsl.g:1494:2: (otherlv_0= 'For' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '[' ( (lv_tableau_4_0= RULE_STRING ) )* otherlv_5= ']' )
            {
            // InternalMyDsl.g:1494:2: (otherlv_0= 'For' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '[' ( (lv_tableau_4_0= RULE_STRING ) )* otherlv_5= ']' )
            // InternalMyDsl.g:1495:3: otherlv_0= 'For' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '[' ( (lv_tableau_4_0= RULE_STRING ) )* otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
            		
            // InternalMyDsl.g:1499:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1500:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1500:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1501:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getForAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getForAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getForAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalMyDsl.g:1525:3: ( (lv_tableau_4_0= RULE_STRING ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1526:4: (lv_tableau_4_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:1526:4: (lv_tableau_4_0= RULE_STRING )
            	    // InternalMyDsl.g:1527:5: lv_tableau_4_0= RULE_STRING
            	    {
            	    lv_tableau_4_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    					newLeafNode(lv_tableau_4_0, grammarAccess.getForAccess().getTableauSTRINGTerminalRuleCall_4_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getForRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"tableau",
            	    						lv_tableau_4_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getForAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleEndFor"
    // InternalMyDsl.g:1551:1: entryRuleEndFor returns [EObject current=null] : iv_ruleEndFor= ruleEndFor EOF ;
    public final EObject entryRuleEndFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndFor = null;


        try {
            // InternalMyDsl.g:1551:47: (iv_ruleEndFor= ruleEndFor EOF )
            // InternalMyDsl.g:1552:2: iv_ruleEndFor= ruleEndFor EOF
            {
             newCompositeNode(grammarAccess.getEndForRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndFor=ruleEndFor();

            state._fsp--;

             current =iv_ruleEndFor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEndFor"


    // $ANTLR start "ruleEndFor"
    // InternalMyDsl.g:1558:1: ruleEndFor returns [EObject current=null] : (otherlv_0= 'EndFor' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEndFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1564:2: ( (otherlv_0= 'EndFor' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:1565:2: (otherlv_0= 'EndFor' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1565:2: (otherlv_0= 'EndFor' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:1566:3: otherlv_0= 'EndFor' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEndForAccess().getEndForKeyword_0());
            		
            // InternalMyDsl.g:1570:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1571:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1571:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1572:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEndForAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndForRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEndFor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00001E4C4501E020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});

}
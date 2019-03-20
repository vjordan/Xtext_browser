package org.xtext.browser.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.browser.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SearchField'", "'Box'", "'Text'", "'Link'", "'Image'", "'Button'", "'all'", "'Title'", "'Test'", "'{'", "'}'", "'Open'", "'GoTo'", "'Verify'", "'Contains'", "'('", "')'", "'Equal'", "'Click'", "'Insert'", "'in'", "'with'", "'Uncheck'", "'['", "']'", "'Check'", "'Choose'", "'='", "'Read'", "'of Element '", "'Count of Element '", "'Paste'", "'For'", "'EndFor'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTest"
    // InternalMyDsl.g:53:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleTest EOF )
            // InternalMyDsl.g:55:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalMyDsl.g:62:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Test__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Test__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Test__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Test__Group__0 )
            // InternalMyDsl.g:69:4: rule__Test__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleINSTRUCTION"
    // InternalMyDsl.g:78:1: entryRuleINSTRUCTION : ruleINSTRUCTION EOF ;
    public final void entryRuleINSTRUCTION() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleINSTRUCTION EOF )
            // InternalMyDsl.g:80:1: ruleINSTRUCTION EOF
            {
             before(grammarAccess.getINSTRUCTIONRule()); 
            pushFollow(FOLLOW_1);
            ruleINSTRUCTION();

            state._fsp--;

             after(grammarAccess.getINSTRUCTIONRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleINSTRUCTION"


    // $ANTLR start "ruleINSTRUCTION"
    // InternalMyDsl.g:87:1: ruleINSTRUCTION : ( ( rule__INSTRUCTION__Alternatives ) ) ;
    public final void ruleINSTRUCTION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__INSTRUCTION__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__INSTRUCTION__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__INSTRUCTION__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__INSTRUCTION__Alternatives )
            {
             before(grammarAccess.getINSTRUCTIONAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__INSTRUCTION__Alternatives )
            // InternalMyDsl.g:94:4: rule__INSTRUCTION__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__INSTRUCTION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getINSTRUCTIONAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINSTRUCTION"


    // $ANTLR start "entryRuleOpen"
    // InternalMyDsl.g:103:1: entryRuleOpen : ruleOpen EOF ;
    public final void entryRuleOpen() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleOpen EOF )
            // InternalMyDsl.g:105:1: ruleOpen EOF
            {
             before(grammarAccess.getOpenRule()); 
            pushFollow(FOLLOW_1);
            ruleOpen();

            state._fsp--;

             after(grammarAccess.getOpenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpen"


    // $ANTLR start "ruleOpen"
    // InternalMyDsl.g:112:1: ruleOpen : ( ( rule__Open__Group__0 ) ) ;
    public final void ruleOpen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Open__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Open__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Open__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Open__Group__0 )
            {
             before(grammarAccess.getOpenAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Open__Group__0 )
            // InternalMyDsl.g:119:4: rule__Open__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Open__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpen"


    // $ANTLR start "entryRuleGoTo"
    // InternalMyDsl.g:128:1: entryRuleGoTo : ruleGoTo EOF ;
    public final void entryRuleGoTo() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleGoTo EOF )
            // InternalMyDsl.g:130:1: ruleGoTo EOF
            {
             before(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_1);
            ruleGoTo();

            state._fsp--;

             after(grammarAccess.getGoToRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // InternalMyDsl.g:137:1: ruleGoTo : ( ( rule__GoTo__Group__0 ) ) ;
    public final void ruleGoTo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__GoTo__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__GoTo__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__GoTo__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__GoTo__Group__0 )
            {
             before(grammarAccess.getGoToAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__GoTo__Group__0 )
            // InternalMyDsl.g:144:4: rule__GoTo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleVerify"
    // InternalMyDsl.g:153:1: entryRuleVerify : ruleVerify EOF ;
    public final void entryRuleVerify() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleVerify EOF )
            // InternalMyDsl.g:155:1: ruleVerify EOF
            {
             before(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_1);
            ruleVerify();

            state._fsp--;

             after(grammarAccess.getVerifyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // InternalMyDsl.g:162:1: ruleVerify : ( ( rule__Verify__Group__0 ) ) ;
    public final void ruleVerify() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Verify__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Verify__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Verify__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Verify__Group__0 )
            {
             before(grammarAccess.getVerifyAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Verify__Group__0 )
            // InternalMyDsl.g:169:4: rule__Verify__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleTYPE_VERIFY"
    // InternalMyDsl.g:178:1: entryRuleTYPE_VERIFY : ruleTYPE_VERIFY EOF ;
    public final void entryRuleTYPE_VERIFY() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleTYPE_VERIFY EOF )
            // InternalMyDsl.g:180:1: ruleTYPE_VERIFY EOF
            {
             before(grammarAccess.getTYPE_VERIFYRule()); 
            pushFollow(FOLLOW_1);
            ruleTYPE_VERIFY();

            state._fsp--;

             after(grammarAccess.getTYPE_VERIFYRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTYPE_VERIFY"


    // $ANTLR start "ruleTYPE_VERIFY"
    // InternalMyDsl.g:187:1: ruleTYPE_VERIFY : ( ( rule__TYPE_VERIFY__Alternatives ) ) ;
    public final void ruleTYPE_VERIFY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__TYPE_VERIFY__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__TYPE_VERIFY__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__TYPE_VERIFY__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__TYPE_VERIFY__Alternatives )
            {
             before(grammarAccess.getTYPE_VERIFYAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__TYPE_VERIFY__Alternatives )
            // InternalMyDsl.g:194:4: rule__TYPE_VERIFY__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TYPE_VERIFY__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTYPE_VERIFYAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTYPE_VERIFY"


    // $ANTLR start "entryRuleContains"
    // InternalMyDsl.g:203:1: entryRuleContains : ruleContains EOF ;
    public final void entryRuleContains() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleContains EOF )
            // InternalMyDsl.g:205:1: ruleContains EOF
            {
             before(grammarAccess.getContainsRule()); 
            pushFollow(FOLLOW_1);
            ruleContains();

            state._fsp--;

             after(grammarAccess.getContainsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContains"


    // $ANTLR start "ruleContains"
    // InternalMyDsl.g:212:1: ruleContains : ( ( rule__Contains__Group__0 ) ) ;
    public final void ruleContains() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Contains__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Contains__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Contains__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Contains__Group__0 )
            {
             before(grammarAccess.getContainsAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Contains__Group__0 )
            // InternalMyDsl.g:219:4: rule__Contains__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Contains__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContains"


    // $ANTLR start "entryRuleTYPE_CONTAINS"
    // InternalMyDsl.g:228:1: entryRuleTYPE_CONTAINS : ruleTYPE_CONTAINS EOF ;
    public final void entryRuleTYPE_CONTAINS() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleTYPE_CONTAINS EOF )
            // InternalMyDsl.g:230:1: ruleTYPE_CONTAINS EOF
            {
             before(grammarAccess.getTYPE_CONTAINSRule()); 
            pushFollow(FOLLOW_1);
            ruleTYPE_CONTAINS();

            state._fsp--;

             after(grammarAccess.getTYPE_CONTAINSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTYPE_CONTAINS"


    // $ANTLR start "ruleTYPE_CONTAINS"
    // InternalMyDsl.g:237:1: ruleTYPE_CONTAINS : ( ( rule__TYPE_CONTAINS__Alternatives ) ) ;
    public final void ruleTYPE_CONTAINS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__TYPE_CONTAINS__Alternatives ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__TYPE_CONTAINS__Alternatives ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__TYPE_CONTAINS__Alternatives ) )
            // InternalMyDsl.g:243:3: ( rule__TYPE_CONTAINS__Alternatives )
            {
             before(grammarAccess.getTYPE_CONTAINSAccess().getAlternatives()); 
            // InternalMyDsl.g:244:3: ( rule__TYPE_CONTAINS__Alternatives )
            // InternalMyDsl.g:244:4: rule__TYPE_CONTAINS__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TYPE_CONTAINS__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTYPE_CONTAINSAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTYPE_CONTAINS"


    // $ANTLR start "entryRuleTYPE_PARAMETRE"
    // InternalMyDsl.g:253:1: entryRuleTYPE_PARAMETRE : ruleTYPE_PARAMETRE EOF ;
    public final void entryRuleTYPE_PARAMETRE() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleTYPE_PARAMETRE EOF )
            // InternalMyDsl.g:255:1: ruleTYPE_PARAMETRE EOF
            {
             before(grammarAccess.getTYPE_PARAMETRERule()); 
            pushFollow(FOLLOW_1);
            ruleTYPE_PARAMETRE();

            state._fsp--;

             after(grammarAccess.getTYPE_PARAMETRERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTYPE_PARAMETRE"


    // $ANTLR start "ruleTYPE_PARAMETRE"
    // InternalMyDsl.g:262:1: ruleTYPE_PARAMETRE : ( ( rule__TYPE_PARAMETRE__Alternatives ) ) ;
    public final void ruleTYPE_PARAMETRE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__TYPE_PARAMETRE__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__TYPE_PARAMETRE__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__TYPE_PARAMETRE__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__TYPE_PARAMETRE__Alternatives )
            {
             before(grammarAccess.getTYPE_PARAMETREAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__TYPE_PARAMETRE__Alternatives )
            // InternalMyDsl.g:269:4: rule__TYPE_PARAMETRE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TYPE_PARAMETRE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTYPE_PARAMETREAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTYPE_PARAMETRE"


    // $ANTLR start "entryRuleValue"
    // InternalMyDsl.g:278:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleValue EOF )
            // InternalMyDsl.g:280:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyDsl.g:287:1: ruleValue : ( ( rule__Value__ValueAssignment ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Value__ValueAssignment ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Value__ValueAssignment ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Value__ValueAssignment ) )
            // InternalMyDsl.g:293:3: ( rule__Value__ValueAssignment )
            {
             before(grammarAccess.getValueAccess().getValueAssignment()); 
            // InternalMyDsl.g:294:3: ( rule__Value__ValueAssignment )
            // InternalMyDsl.g:294:4: rule__Value__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Value__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleVar"
    // InternalMyDsl.g:303:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleVar EOF )
            // InternalMyDsl.g:305:1: ruleVar EOF
            {
             before(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalMyDsl.g:312:1: ruleVar : ( ( rule__Var__Group__0 ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Var__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Var__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Var__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Var__Group__0 )
            {
             before(grammarAccess.getVarAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Var__Group__0 )
            // InternalMyDsl.g:319:4: rule__Var__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Var__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleEqual"
    // InternalMyDsl.g:328:1: entryRuleEqual : ruleEqual EOF ;
    public final void entryRuleEqual() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleEqual EOF )
            // InternalMyDsl.g:330:1: ruleEqual EOF
            {
             before(grammarAccess.getEqualRule()); 
            pushFollow(FOLLOW_1);
            ruleEqual();

            state._fsp--;

             after(grammarAccess.getEqualRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalMyDsl.g:337:1: ruleEqual : ( ( rule__Equal__Group__0 ) ) ;
    public final void ruleEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Equal__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Equal__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Equal__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Equal__Group__0 )
            {
             before(grammarAccess.getEqualAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Equal__Group__0 )
            // InternalMyDsl.g:344:4: rule__Equal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleClick"
    // InternalMyDsl.g:353:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleClick EOF )
            // InternalMyDsl.g:355:1: ruleClick EOF
            {
             before(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getClickRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalMyDsl.g:362:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Click__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Click__Group__0 )
            // InternalMyDsl.g:369:4: rule__Click__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleTYPE_CLICK"
    // InternalMyDsl.g:378:1: entryRuleTYPE_CLICK : ruleTYPE_CLICK EOF ;
    public final void entryRuleTYPE_CLICK() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleTYPE_CLICK EOF )
            // InternalMyDsl.g:380:1: ruleTYPE_CLICK EOF
            {
             before(grammarAccess.getTYPE_CLICKRule()); 
            pushFollow(FOLLOW_1);
            ruleTYPE_CLICK();

            state._fsp--;

             after(grammarAccess.getTYPE_CLICKRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTYPE_CLICK"


    // $ANTLR start "ruleTYPE_CLICK"
    // InternalMyDsl.g:387:1: ruleTYPE_CLICK : ( ( rule__TYPE_CLICK__Alternatives ) ) ;
    public final void ruleTYPE_CLICK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__TYPE_CLICK__Alternatives ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__TYPE_CLICK__Alternatives ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__TYPE_CLICK__Alternatives ) )
            // InternalMyDsl.g:393:3: ( rule__TYPE_CLICK__Alternatives )
            {
             before(grammarAccess.getTYPE_CLICKAccess().getAlternatives()); 
            // InternalMyDsl.g:394:3: ( rule__TYPE_CLICK__Alternatives )
            // InternalMyDsl.g:394:4: rule__TYPE_CLICK__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TYPE_CLICK__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTYPE_CLICKAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTYPE_CLICK"


    // $ANTLR start "entryRuleInsert"
    // InternalMyDsl.g:403:1: entryRuleInsert : ruleInsert EOF ;
    public final void entryRuleInsert() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleInsert EOF )
            // InternalMyDsl.g:405:1: ruleInsert EOF
            {
             before(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            ruleInsert();

            state._fsp--;

             after(grammarAccess.getInsertRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalMyDsl.g:412:1: ruleInsert : ( ( rule__Insert__Group__0 ) ) ;
    public final void ruleInsert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Insert__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Insert__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Insert__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Insert__Group__0 )
            {
             before(grammarAccess.getInsertAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Insert__Group__0 )
            // InternalMyDsl.g:419:4: rule__Insert__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleTYPE_INSERT"
    // InternalMyDsl.g:428:1: entryRuleTYPE_INSERT : ruleTYPE_INSERT EOF ;
    public final void entryRuleTYPE_INSERT() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleTYPE_INSERT EOF )
            // InternalMyDsl.g:430:1: ruleTYPE_INSERT EOF
            {
             before(grammarAccess.getTYPE_INSERTRule()); 
            pushFollow(FOLLOW_1);
            ruleTYPE_INSERT();

            state._fsp--;

             after(grammarAccess.getTYPE_INSERTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTYPE_INSERT"


    // $ANTLR start "ruleTYPE_INSERT"
    // InternalMyDsl.g:437:1: ruleTYPE_INSERT : ( 'SearchField' ) ;
    public final void ruleTYPE_INSERT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( 'SearchField' ) )
            // InternalMyDsl.g:442:2: ( 'SearchField' )
            {
            // InternalMyDsl.g:442:2: ( 'SearchField' )
            // InternalMyDsl.g:443:3: 'SearchField'
            {
             before(grammarAccess.getTYPE_INSERTAccess().getSearchFieldKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTYPE_INSERTAccess().getSearchFieldKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTYPE_INSERT"


    // $ANTLR start "entryRuleUncheck"
    // InternalMyDsl.g:453:1: entryRuleUncheck : ruleUncheck EOF ;
    public final void entryRuleUncheck() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleUncheck EOF )
            // InternalMyDsl.g:455:1: ruleUncheck EOF
            {
             before(grammarAccess.getUncheckRule()); 
            pushFollow(FOLLOW_1);
            ruleUncheck();

            state._fsp--;

             after(grammarAccess.getUncheckRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUncheck"


    // $ANTLR start "ruleUncheck"
    // InternalMyDsl.g:462:1: ruleUncheck : ( ( rule__Uncheck__Group__0 ) ) ;
    public final void ruleUncheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Uncheck__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Uncheck__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Uncheck__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Uncheck__Group__0 )
            {
             before(grammarAccess.getUncheckAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Uncheck__Group__0 )
            // InternalMyDsl.g:469:4: rule__Uncheck__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uncheck__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUncheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUncheck"


    // $ANTLR start "entryRuleTYPE_CHECK_UNCHECK"
    // InternalMyDsl.g:478:1: entryRuleTYPE_CHECK_UNCHECK : ruleTYPE_CHECK_UNCHECK EOF ;
    public final void entryRuleTYPE_CHECK_UNCHECK() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleTYPE_CHECK_UNCHECK EOF )
            // InternalMyDsl.g:480:1: ruleTYPE_CHECK_UNCHECK EOF
            {
             before(grammarAccess.getTYPE_CHECK_UNCHECKRule()); 
            pushFollow(FOLLOW_1);
            ruleTYPE_CHECK_UNCHECK();

            state._fsp--;

             after(grammarAccess.getTYPE_CHECK_UNCHECKRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTYPE_CHECK_UNCHECK"


    // $ANTLR start "ruleTYPE_CHECK_UNCHECK"
    // InternalMyDsl.g:487:1: ruleTYPE_CHECK_UNCHECK : ( ( rule__TYPE_CHECK_UNCHECK__Alternatives ) ) ;
    public final void ruleTYPE_CHECK_UNCHECK() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__TYPE_CHECK_UNCHECK__Alternatives ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__TYPE_CHECK_UNCHECK__Alternatives ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__TYPE_CHECK_UNCHECK__Alternatives ) )
            // InternalMyDsl.g:493:3: ( rule__TYPE_CHECK_UNCHECK__Alternatives )
            {
             before(grammarAccess.getTYPE_CHECK_UNCHECKAccess().getAlternatives()); 
            // InternalMyDsl.g:494:3: ( rule__TYPE_CHECK_UNCHECK__Alternatives )
            // InternalMyDsl.g:494:4: rule__TYPE_CHECK_UNCHECK__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TYPE_CHECK_UNCHECK__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTYPE_CHECK_UNCHECKAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTYPE_CHECK_UNCHECK"


    // $ANTLR start "entryRuleCheck"
    // InternalMyDsl.g:503:1: entryRuleCheck : ruleCheck EOF ;
    public final void entryRuleCheck() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleCheck EOF )
            // InternalMyDsl.g:505:1: ruleCheck EOF
            {
             before(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            ruleCheck();

            state._fsp--;

             after(grammarAccess.getCheckRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalMyDsl.g:512:1: ruleCheck : ( ( rule__Check__Group__0 ) ) ;
    public final void ruleCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Check__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Check__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Check__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Check__Group__0 )
            {
             before(grammarAccess.getCheckAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Check__Group__0 )
            // InternalMyDsl.g:519:4: rule__Check__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleChoose"
    // InternalMyDsl.g:528:1: entryRuleChoose : ruleChoose EOF ;
    public final void entryRuleChoose() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleChoose EOF )
            // InternalMyDsl.g:530:1: ruleChoose EOF
            {
             before(grammarAccess.getChooseRule()); 
            pushFollow(FOLLOW_1);
            ruleChoose();

            state._fsp--;

             after(grammarAccess.getChooseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChoose"


    // $ANTLR start "ruleChoose"
    // InternalMyDsl.g:537:1: ruleChoose : ( ( rule__Choose__Group__0 ) ) ;
    public final void ruleChoose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Choose__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Choose__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Choose__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Choose__Group__0 )
            {
             before(grammarAccess.getChooseAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Choose__Group__0 )
            // InternalMyDsl.g:544:4: rule__Choose__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Choose__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChooseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoose"


    // $ANTLR start "entryRuleTYPE_CHOOSE"
    // InternalMyDsl.g:553:1: entryRuleTYPE_CHOOSE : ruleTYPE_CHOOSE EOF ;
    public final void entryRuleTYPE_CHOOSE() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleTYPE_CHOOSE EOF )
            // InternalMyDsl.g:555:1: ruleTYPE_CHOOSE EOF
            {
             before(grammarAccess.getTYPE_CHOOSERule()); 
            pushFollow(FOLLOW_1);
            ruleTYPE_CHOOSE();

            state._fsp--;

             after(grammarAccess.getTYPE_CHOOSERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTYPE_CHOOSE"


    // $ANTLR start "ruleTYPE_CHOOSE"
    // InternalMyDsl.g:562:1: ruleTYPE_CHOOSE : ( 'Box' ) ;
    public final void ruleTYPE_CHOOSE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( 'Box' ) )
            // InternalMyDsl.g:567:2: ( 'Box' )
            {
            // InternalMyDsl.g:567:2: ( 'Box' )
            // InternalMyDsl.g:568:3: 'Box'
            {
             before(grammarAccess.getTYPE_CHOOSEAccess().getBoxKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTYPE_CHOOSEAccess().getBoxKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTYPE_CHOOSE"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:578:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleVariable EOF )
            // InternalMyDsl.g:580:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyDsl.g:587:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Variable__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__Variable__Group__0 )
            // InternalMyDsl.g:594:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleTYPE_INSTRUCTION"
    // InternalMyDsl.g:603:1: entryRuleTYPE_INSTRUCTION : ruleTYPE_INSTRUCTION EOF ;
    public final void entryRuleTYPE_INSTRUCTION() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleTYPE_INSTRUCTION EOF )
            // InternalMyDsl.g:605:1: ruleTYPE_INSTRUCTION EOF
            {
             before(grammarAccess.getTYPE_INSTRUCTIONRule()); 
            pushFollow(FOLLOW_1);
            ruleTYPE_INSTRUCTION();

            state._fsp--;

             after(grammarAccess.getTYPE_INSTRUCTIONRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTYPE_INSTRUCTION"


    // $ANTLR start "ruleTYPE_INSTRUCTION"
    // InternalMyDsl.g:612:1: ruleTYPE_INSTRUCTION : ( ( rule__TYPE_INSTRUCTION__Alternatives ) ) ;
    public final void ruleTYPE_INSTRUCTION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__TYPE_INSTRUCTION__Alternatives ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__TYPE_INSTRUCTION__Alternatives ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__TYPE_INSTRUCTION__Alternatives ) )
            // InternalMyDsl.g:618:3: ( rule__TYPE_INSTRUCTION__Alternatives )
            {
             before(grammarAccess.getTYPE_INSTRUCTIONAccess().getAlternatives()); 
            // InternalMyDsl.g:619:3: ( rule__TYPE_INSTRUCTION__Alternatives )
            // InternalMyDsl.g:619:4: rule__TYPE_INSTRUCTION__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TYPE_INSTRUCTION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTYPE_INSTRUCTIONAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTYPE_INSTRUCTION"


    // $ANTLR start "entryRuleRead"
    // InternalMyDsl.g:628:1: entryRuleRead : ruleRead EOF ;
    public final void entryRuleRead() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleRead EOF )
            // InternalMyDsl.g:630:1: ruleRead EOF
            {
             before(grammarAccess.getReadRule()); 
            pushFollow(FOLLOW_1);
            ruleRead();

            state._fsp--;

             after(grammarAccess.getReadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRead"


    // $ANTLR start "ruleRead"
    // InternalMyDsl.g:637:1: ruleRead : ( ( rule__Read__Group__0 ) ) ;
    public final void ruleRead() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__Read__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__Read__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__Read__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__Read__Group__0 )
            {
             before(grammarAccess.getReadAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__Read__Group__0 )
            // InternalMyDsl.g:644:4: rule__Read__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRead"


    // $ANTLR start "entryRuleTYPE_READ"
    // InternalMyDsl.g:653:1: entryRuleTYPE_READ : ruleTYPE_READ EOF ;
    public final void entryRuleTYPE_READ() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleTYPE_READ EOF )
            // InternalMyDsl.g:655:1: ruleTYPE_READ EOF
            {
             before(grammarAccess.getTYPE_READRule()); 
            pushFollow(FOLLOW_1);
            ruleTYPE_READ();

            state._fsp--;

             after(grammarAccess.getTYPE_READRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTYPE_READ"


    // $ANTLR start "ruleTYPE_READ"
    // InternalMyDsl.g:662:1: ruleTYPE_READ : ( ( rule__TYPE_READ__Alternatives ) ) ;
    public final void ruleTYPE_READ() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__TYPE_READ__Alternatives ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__TYPE_READ__Alternatives ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__TYPE_READ__Alternatives ) )
            // InternalMyDsl.g:668:3: ( rule__TYPE_READ__Alternatives )
            {
             before(grammarAccess.getTYPE_READAccess().getAlternatives()); 
            // InternalMyDsl.g:669:3: ( rule__TYPE_READ__Alternatives )
            // InternalMyDsl.g:669:4: rule__TYPE_READ__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TYPE_READ__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTYPE_READAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTYPE_READ"


    // $ANTLR start "entryRuleCount"
    // InternalMyDsl.g:678:1: entryRuleCount : ruleCount EOF ;
    public final void entryRuleCount() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleCount EOF )
            // InternalMyDsl.g:680:1: ruleCount EOF
            {
             before(grammarAccess.getCountRule()); 
            pushFollow(FOLLOW_1);
            ruleCount();

            state._fsp--;

             after(grammarAccess.getCountRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCount"


    // $ANTLR start "ruleCount"
    // InternalMyDsl.g:687:1: ruleCount : ( ( rule__Count__Group__0 ) ) ;
    public final void ruleCount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__Count__Group__0 ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__Count__Group__0 ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__Count__Group__0 ) )
            // InternalMyDsl.g:693:3: ( rule__Count__Group__0 )
            {
             before(grammarAccess.getCountAccess().getGroup()); 
            // InternalMyDsl.g:694:3: ( rule__Count__Group__0 )
            // InternalMyDsl.g:694:4: rule__Count__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Count__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCount"


    // $ANTLR start "entryRulePaste"
    // InternalMyDsl.g:703:1: entryRulePaste : rulePaste EOF ;
    public final void entryRulePaste() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( rulePaste EOF )
            // InternalMyDsl.g:705:1: rulePaste EOF
            {
             before(grammarAccess.getPasteRule()); 
            pushFollow(FOLLOW_1);
            rulePaste();

            state._fsp--;

             after(grammarAccess.getPasteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePaste"


    // $ANTLR start "rulePaste"
    // InternalMyDsl.g:712:1: rulePaste : ( ( rule__Paste__Group__0 ) ) ;
    public final void rulePaste() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__Paste__Group__0 ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__Paste__Group__0 ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__Paste__Group__0 ) )
            // InternalMyDsl.g:718:3: ( rule__Paste__Group__0 )
            {
             before(grammarAccess.getPasteAccess().getGroup()); 
            // InternalMyDsl.g:719:3: ( rule__Paste__Group__0 )
            // InternalMyDsl.g:719:4: rule__Paste__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Paste__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPasteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePaste"


    // $ANTLR start "entryRuleTYPE_PASTE"
    // InternalMyDsl.g:728:1: entryRuleTYPE_PASTE : ruleTYPE_PASTE EOF ;
    public final void entryRuleTYPE_PASTE() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleTYPE_PASTE EOF )
            // InternalMyDsl.g:730:1: ruleTYPE_PASTE EOF
            {
             before(grammarAccess.getTYPE_PASTERule()); 
            pushFollow(FOLLOW_1);
            ruleTYPE_PASTE();

            state._fsp--;

             after(grammarAccess.getTYPE_PASTERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTYPE_PASTE"


    // $ANTLR start "ruleTYPE_PASTE"
    // InternalMyDsl.g:737:1: ruleTYPE_PASTE : ( 'SearchField' ) ;
    public final void ruleTYPE_PASTE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( 'SearchField' ) )
            // InternalMyDsl.g:742:2: ( 'SearchField' )
            {
            // InternalMyDsl.g:742:2: ( 'SearchField' )
            // InternalMyDsl.g:743:3: 'SearchField'
            {
             before(grammarAccess.getTYPE_PASTEAccess().getSearchFieldKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTYPE_PASTEAccess().getSearchFieldKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTYPE_PASTE"


    // $ANTLR start "entryRuleFor"
    // InternalMyDsl.g:753:1: entryRuleFor : ruleFor EOF ;
    public final void entryRuleFor() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleFor EOF )
            // InternalMyDsl.g:755:1: ruleFor EOF
            {
             before(grammarAccess.getForRule()); 
            pushFollow(FOLLOW_1);
            ruleFor();

            state._fsp--;

             after(grammarAccess.getForRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalMyDsl.g:762:1: ruleFor : ( ( rule__For__Group__0 ) ) ;
    public final void ruleFor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__For__Group__0 ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__For__Group__0 ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__For__Group__0 ) )
            // InternalMyDsl.g:768:3: ( rule__For__Group__0 )
            {
             before(grammarAccess.getForAccess().getGroup()); 
            // InternalMyDsl.g:769:3: ( rule__For__Group__0 )
            // InternalMyDsl.g:769:4: rule__For__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__For__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleEndFor"
    // InternalMyDsl.g:778:1: entryRuleEndFor : ruleEndFor EOF ;
    public final void entryRuleEndFor() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleEndFor EOF )
            // InternalMyDsl.g:780:1: ruleEndFor EOF
            {
             before(grammarAccess.getEndForRule()); 
            pushFollow(FOLLOW_1);
            ruleEndFor();

            state._fsp--;

             after(grammarAccess.getEndForRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEndFor"


    // $ANTLR start "ruleEndFor"
    // InternalMyDsl.g:787:1: ruleEndFor : ( ( rule__EndFor__Group__0 ) ) ;
    public final void ruleEndFor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( ( rule__EndFor__Group__0 ) ) )
            // InternalMyDsl.g:792:2: ( ( rule__EndFor__Group__0 ) )
            {
            // InternalMyDsl.g:792:2: ( ( rule__EndFor__Group__0 ) )
            // InternalMyDsl.g:793:3: ( rule__EndFor__Group__0 )
            {
             before(grammarAccess.getEndForAccess().getGroup()); 
            // InternalMyDsl.g:794:3: ( rule__EndFor__Group__0 )
            // InternalMyDsl.g:794:4: rule__EndFor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EndFor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndForAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEndFor"


    // $ANTLR start "rule__INSTRUCTION__Alternatives"
    // InternalMyDsl.g:802:1: rule__INSTRUCTION__Alternatives : ( ( ruleOpen ) | ( ruleGoTo ) | ( ruleVerify ) | ( ruleClick ) | ( ruleInsert ) | ( ruleUncheck ) | ( ruleCheck ) | ( ruleChoose ) | ( ruleVariable ) | ( ruleRead ) | ( ruleCount ) | ( rulePaste ) | ( ruleFor ) | ( ruleEndFor ) );
    public final void rule__INSTRUCTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:806:1: ( ( ruleOpen ) | ( ruleGoTo ) | ( ruleVerify ) | ( ruleClick ) | ( ruleInsert ) | ( ruleUncheck ) | ( ruleCheck ) | ( ruleChoose ) | ( ruleVariable ) | ( ruleRead ) | ( ruleCount ) | ( rulePaste ) | ( ruleFor ) | ( ruleEndFor ) )
            int alt1=14;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            case 29:
                {
                alt1=4;
                }
                break;
            case 30:
                {
                alt1=5;
                }
                break;
            case 33:
                {
                alt1=6;
                }
                break;
            case 36:
                {
                alt1=7;
                }
                break;
            case 37:
                {
                alt1=8;
                }
                break;
            case RULE_ID:
                {
                alt1=9;
                }
                break;
            case 39:
                {
                alt1=10;
                }
                break;
            case 41:
                {
                alt1=11;
                }
                break;
            case 42:
                {
                alt1=12;
                }
                break;
            case 43:
                {
                alt1=13;
                }
                break;
            case 44:
                {
                alt1=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:807:2: ( ruleOpen )
                    {
                    // InternalMyDsl.g:807:2: ( ruleOpen )
                    // InternalMyDsl.g:808:3: ruleOpen
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getOpenParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOpen();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getOpenParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:813:2: ( ruleGoTo )
                    {
                    // InternalMyDsl.g:813:2: ( ruleGoTo )
                    // InternalMyDsl.g:814:3: ruleGoTo
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getGoToParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGoTo();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getGoToParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:819:2: ( ruleVerify )
                    {
                    // InternalMyDsl.g:819:2: ( ruleVerify )
                    // InternalMyDsl.g:820:3: ruleVerify
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getVerifyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVerify();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getVerifyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:825:2: ( ruleClick )
                    {
                    // InternalMyDsl.g:825:2: ( ruleClick )
                    // InternalMyDsl.g:826:3: ruleClick
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getClickParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getClickParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:831:2: ( ruleInsert )
                    {
                    // InternalMyDsl.g:831:2: ( ruleInsert )
                    // InternalMyDsl.g:832:3: ruleInsert
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getInsertParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleInsert();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getInsertParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:837:2: ( ruleUncheck )
                    {
                    // InternalMyDsl.g:837:2: ( ruleUncheck )
                    // InternalMyDsl.g:838:3: ruleUncheck
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getUncheckParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleUncheck();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getUncheckParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:843:2: ( ruleCheck )
                    {
                    // InternalMyDsl.g:843:2: ( ruleCheck )
                    // InternalMyDsl.g:844:3: ruleCheck
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getCheckParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleCheck();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getCheckParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:849:2: ( ruleChoose )
                    {
                    // InternalMyDsl.g:849:2: ( ruleChoose )
                    // InternalMyDsl.g:850:3: ruleChoose
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getChooseParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleChoose();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getChooseParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:855:2: ( ruleVariable )
                    {
                    // InternalMyDsl.g:855:2: ( ruleVariable )
                    // InternalMyDsl.g:856:3: ruleVariable
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getVariableParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getVariableParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:861:2: ( ruleRead )
                    {
                    // InternalMyDsl.g:861:2: ( ruleRead )
                    // InternalMyDsl.g:862:3: ruleRead
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getReadParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleRead();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getReadParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:867:2: ( ruleCount )
                    {
                    // InternalMyDsl.g:867:2: ( ruleCount )
                    // InternalMyDsl.g:868:3: ruleCount
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getCountParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleCount();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getCountParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:873:2: ( rulePaste )
                    {
                    // InternalMyDsl.g:873:2: ( rulePaste )
                    // InternalMyDsl.g:874:3: rulePaste
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getPasteParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    rulePaste();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getPasteParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:879:2: ( ruleFor )
                    {
                    // InternalMyDsl.g:879:2: ( ruleFor )
                    // InternalMyDsl.g:880:3: ruleFor
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getForParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleFor();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getForParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:885:2: ( ruleEndFor )
                    {
                    // InternalMyDsl.g:885:2: ( ruleEndFor )
                    // InternalMyDsl.g:886:3: ruleEndFor
                    {
                     before(grammarAccess.getINSTRUCTIONAccess().getEndForParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleEndFor();

                    state._fsp--;

                     after(grammarAccess.getINSTRUCTIONAccess().getEndForParserRuleCall_13()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INSTRUCTION__Alternatives"


    // $ANTLR start "rule__TYPE_VERIFY__Alternatives"
    // InternalMyDsl.g:895:1: rule__TYPE_VERIFY__Alternatives : ( ( ruleContains ) | ( ruleEqual ) );
    public final void rule__TYPE_VERIFY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:899:1: ( ( ruleContains ) | ( ruleEqual ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:900:2: ( ruleContains )
                    {
                    // InternalMyDsl.g:900:2: ( ruleContains )
                    // InternalMyDsl.g:901:3: ruleContains
                    {
                     before(grammarAccess.getTYPE_VERIFYAccess().getContainsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleContains();

                    state._fsp--;

                     after(grammarAccess.getTYPE_VERIFYAccess().getContainsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:906:2: ( ruleEqual )
                    {
                    // InternalMyDsl.g:906:2: ( ruleEqual )
                    // InternalMyDsl.g:907:3: ruleEqual
                    {
                     before(grammarAccess.getTYPE_VERIFYAccess().getEqualParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEqual();

                    state._fsp--;

                     after(grammarAccess.getTYPE_VERIFYAccess().getEqualParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE_VERIFY__Alternatives"


    // $ANTLR start "rule__TYPE_CONTAINS__Alternatives"
    // InternalMyDsl.g:916:1: rule__TYPE_CONTAINS__Alternatives : ( ( 'Text' ) | ( 'Link' ) | ( 'Image' ) );
    public final void rule__TYPE_CONTAINS__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( ( 'Text' ) | ( 'Link' ) | ( 'Image' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:921:2: ( 'Text' )
                    {
                    // InternalMyDsl.g:921:2: ( 'Text' )
                    // InternalMyDsl.g:922:3: 'Text'
                    {
                     before(grammarAccess.getTYPE_CONTAINSAccess().getTextKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTYPE_CONTAINSAccess().getTextKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:927:2: ( 'Link' )
                    {
                    // InternalMyDsl.g:927:2: ( 'Link' )
                    // InternalMyDsl.g:928:3: 'Link'
                    {
                     before(grammarAccess.getTYPE_CONTAINSAccess().getLinkKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTYPE_CONTAINSAccess().getLinkKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:933:2: ( 'Image' )
                    {
                    // InternalMyDsl.g:933:2: ( 'Image' )
                    // InternalMyDsl.g:934:3: 'Image'
                    {
                     before(grammarAccess.getTYPE_CONTAINSAccess().getImageKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTYPE_CONTAINSAccess().getImageKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE_CONTAINS__Alternatives"


    // $ANTLR start "rule__TYPE_PARAMETRE__Alternatives"
    // InternalMyDsl.g:943:1: rule__TYPE_PARAMETRE__Alternatives : ( ( ruleValue ) | ( ruleVar ) );
    public final void rule__TYPE_PARAMETRE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( ( ruleValue ) | ( ruleVar ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:948:2: ( ruleValue )
                    {
                    // InternalMyDsl.g:948:2: ( ruleValue )
                    // InternalMyDsl.g:949:3: ruleValue
                    {
                     before(grammarAccess.getTYPE_PARAMETREAccess().getValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleValue();

                    state._fsp--;

                     after(grammarAccess.getTYPE_PARAMETREAccess().getValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:954:2: ( ruleVar )
                    {
                    // InternalMyDsl.g:954:2: ( ruleVar )
                    // InternalMyDsl.g:955:3: ruleVar
                    {
                     before(grammarAccess.getTYPE_PARAMETREAccess().getVarParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVar();

                    state._fsp--;

                     after(grammarAccess.getTYPE_PARAMETREAccess().getVarParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE_PARAMETRE__Alternatives"


    // $ANTLR start "rule__TYPE_CLICK__Alternatives"
    // InternalMyDsl.g:964:1: rule__TYPE_CLICK__Alternatives : ( ( 'Link' ) | ( 'Button' ) | ( 'Image' ) );
    public final void rule__TYPE_CLICK__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:968:1: ( ( 'Link' ) | ( 'Button' ) | ( 'Image' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:969:2: ( 'Link' )
                    {
                    // InternalMyDsl.g:969:2: ( 'Link' )
                    // InternalMyDsl.g:970:3: 'Link'
                    {
                     before(grammarAccess.getTYPE_CLICKAccess().getLinkKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTYPE_CLICKAccess().getLinkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:975:2: ( 'Button' )
                    {
                    // InternalMyDsl.g:975:2: ( 'Button' )
                    // InternalMyDsl.g:976:3: 'Button'
                    {
                     before(grammarAccess.getTYPE_CLICKAccess().getButtonKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTYPE_CLICKAccess().getButtonKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:981:2: ( 'Image' )
                    {
                    // InternalMyDsl.g:981:2: ( 'Image' )
                    // InternalMyDsl.g:982:3: 'Image'
                    {
                     before(grammarAccess.getTYPE_CLICKAccess().getImageKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTYPE_CLICKAccess().getImageKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE_CLICK__Alternatives"


    // $ANTLR start "rule__TYPE_CHECK_UNCHECK__Alternatives"
    // InternalMyDsl.g:991:1: rule__TYPE_CHECK_UNCHECK__Alternatives : ( ( 'all' ) | ( ( rule__TYPE_CHECK_UNCHECK__Group_1__0 ) ) );
    public final void rule__TYPE_CHECK_UNCHECK__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:995:1: ( ( 'all' ) | ( ( rule__TYPE_CHECK_UNCHECK__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==34) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:996:2: ( 'all' )
                    {
                    // InternalMyDsl.g:996:2: ( 'all' )
                    // InternalMyDsl.g:997:3: 'all'
                    {
                     before(grammarAccess.getTYPE_CHECK_UNCHECKAccess().getAllKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTYPE_CHECK_UNCHECKAccess().getAllKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1002:2: ( ( rule__TYPE_CHECK_UNCHECK__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:1002:2: ( ( rule__TYPE_CHECK_UNCHECK__Group_1__0 ) )
                    // InternalMyDsl.g:1003:3: ( rule__TYPE_CHECK_UNCHECK__Group_1__0 )
                    {
                     before(grammarAccess.getTYPE_CHECK_UNCHECKAccess().getGroup_1()); 
                    // InternalMyDsl.g:1004:3: ( rule__TYPE_CHECK_UNCHECK__Group_1__0 )
                    // InternalMyDsl.g:1004:4: rule__TYPE_CHECK_UNCHECK__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TYPE_CHECK_UNCHECK__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTYPE_CHECK_UNCHECKAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE_CHECK_UNCHECK__Alternatives"


    // $ANTLR start "rule__TYPE_INSTRUCTION__Alternatives"
    // InternalMyDsl.g:1012:1: rule__TYPE_INSTRUCTION__Alternatives : ( ( ruleRead ) | ( ruleCount ) );
    public final void rule__TYPE_INSTRUCTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:1: ( ( ruleRead ) | ( ruleCount ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==39) ) {
                alt7=1;
            }
            else if ( (LA7_0==41) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1017:2: ( ruleRead )
                    {
                    // InternalMyDsl.g:1017:2: ( ruleRead )
                    // InternalMyDsl.g:1018:3: ruleRead
                    {
                     before(grammarAccess.getTYPE_INSTRUCTIONAccess().getReadParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRead();

                    state._fsp--;

                     after(grammarAccess.getTYPE_INSTRUCTIONAccess().getReadParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1023:2: ( ruleCount )
                    {
                    // InternalMyDsl.g:1023:2: ( ruleCount )
                    // InternalMyDsl.g:1024:3: ruleCount
                    {
                     before(grammarAccess.getTYPE_INSTRUCTIONAccess().getCountParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCount();

                    state._fsp--;

                     after(grammarAccess.getTYPE_INSTRUCTIONAccess().getCountParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE_INSTRUCTION__Alternatives"


    // $ANTLR start "rule__TYPE_READ__Alternatives"
    // InternalMyDsl.g:1033:1: rule__TYPE_READ__Alternatives : ( ( 'Link' ) | ( 'Title' ) );
    public final void rule__TYPE_READ__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( ( 'Link' ) | ( 'Title' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1038:2: ( 'Link' )
                    {
                    // InternalMyDsl.g:1038:2: ( 'Link' )
                    // InternalMyDsl.g:1039:3: 'Link'
                    {
                     before(grammarAccess.getTYPE_READAccess().getLinkKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTYPE_READAccess().getLinkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1044:2: ( 'Title' )
                    {
                    // InternalMyDsl.g:1044:2: ( 'Title' )
                    // InternalMyDsl.g:1045:3: 'Title'
                    {
                     before(grammarAccess.getTYPE_READAccess().getTitleKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTYPE_READAccess().getTitleKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE_READ__Alternatives"


    // $ANTLR start "rule__Test__Group__0"
    // InternalMyDsl.g:1054:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1058:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalMyDsl.g:1059:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0"


    // $ANTLR start "rule__Test__Group__0__Impl"
    // InternalMyDsl.g:1066:1: rule__Test__Group__0__Impl : ( 'Test' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( ( 'Test' ) )
            // InternalMyDsl.g:1071:1: ( 'Test' )
            {
            // InternalMyDsl.g:1071:1: ( 'Test' )
            // InternalMyDsl.g:1072:2: 'Test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getTestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0__Impl"


    // $ANTLR start "rule__Test__Group__1"
    // InternalMyDsl.g:1081:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1085:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalMyDsl.g:1086:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1"


    // $ANTLR start "rule__Test__Group__1__Impl"
    // InternalMyDsl.g:1093:1: rule__Test__Group__1__Impl : ( ( rule__Test__NumberAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1097:1: ( ( ( rule__Test__NumberAssignment_1 ) ) )
            // InternalMyDsl.g:1098:1: ( ( rule__Test__NumberAssignment_1 ) )
            {
            // InternalMyDsl.g:1098:1: ( ( rule__Test__NumberAssignment_1 ) )
            // InternalMyDsl.g:1099:2: ( rule__Test__NumberAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getNumberAssignment_1()); 
            // InternalMyDsl.g:1100:2: ( rule__Test__NumberAssignment_1 )
            // InternalMyDsl.g:1100:3: rule__Test__NumberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Test__NumberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getNumberAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__2"
    // InternalMyDsl.g:1108:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1112:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalMyDsl.g:1113:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2"


    // $ANTLR start "rule__Test__Group__2__Impl"
    // InternalMyDsl.g:1120:1: rule__Test__Group__2__Impl : ( '{' ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( ( '{' ) )
            // InternalMyDsl.g:1125:1: ( '{' )
            {
            // InternalMyDsl.g:1125:1: ( '{' )
            // InternalMyDsl.g:1126:2: '{'
            {
             before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2__Impl"


    // $ANTLR start "rule__Test__Group__3"
    // InternalMyDsl.g:1135:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1139:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalMyDsl.g:1140:2: rule__Test__Group__3__Impl rule__Test__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3"


    // $ANTLR start "rule__Test__Group__3__Impl"
    // InternalMyDsl.g:1147:1: rule__Test__Group__3__Impl : ( ( rule__Test__BodyAssignment_3 )* ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( ( ( rule__Test__BodyAssignment_3 )* ) )
            // InternalMyDsl.g:1152:1: ( ( rule__Test__BodyAssignment_3 )* )
            {
            // InternalMyDsl.g:1152:1: ( ( rule__Test__BodyAssignment_3 )* )
            // InternalMyDsl.g:1153:2: ( rule__Test__BodyAssignment_3 )*
            {
             before(grammarAccess.getTestAccess().getBodyAssignment_3()); 
            // InternalMyDsl.g:1154:2: ( rule__Test__BodyAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=22 && LA9_0<=24)||(LA9_0>=29 && LA9_0<=30)||LA9_0==33||(LA9_0>=36 && LA9_0<=37)||LA9_0==39||(LA9_0>=41 && LA9_0<=44)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1154:3: rule__Test__BodyAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Test__BodyAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getBodyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3__Impl"


    // $ANTLR start "rule__Test__Group__4"
    // InternalMyDsl.g:1162:1: rule__Test__Group__4 : rule__Test__Group__4__Impl ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:1: ( rule__Test__Group__4__Impl )
            // InternalMyDsl.g:1167:2: rule__Test__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4"


    // $ANTLR start "rule__Test__Group__4__Impl"
    // InternalMyDsl.g:1173:1: rule__Test__Group__4__Impl : ( '}' ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1177:1: ( ( '}' ) )
            // InternalMyDsl.g:1178:1: ( '}' )
            {
            // InternalMyDsl.g:1178:1: ( '}' )
            // InternalMyDsl.g:1179:2: '}'
            {
             before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4__Impl"


    // $ANTLR start "rule__Open__Group__0"
    // InternalMyDsl.g:1189:1: rule__Open__Group__0 : rule__Open__Group__0__Impl rule__Open__Group__1 ;
    public final void rule__Open__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1193:1: ( rule__Open__Group__0__Impl rule__Open__Group__1 )
            // InternalMyDsl.g:1194:2: rule__Open__Group__0__Impl rule__Open__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Open__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Open__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group__0"


    // $ANTLR start "rule__Open__Group__0__Impl"
    // InternalMyDsl.g:1201:1: rule__Open__Group__0__Impl : ( 'Open' ) ;
    public final void rule__Open__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( ( 'Open' ) )
            // InternalMyDsl.g:1206:1: ( 'Open' )
            {
            // InternalMyDsl.g:1206:1: ( 'Open' )
            // InternalMyDsl.g:1207:2: 'Open'
            {
             before(grammarAccess.getOpenAccess().getOpenKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getOpenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group__0__Impl"


    // $ANTLR start "rule__Open__Group__1"
    // InternalMyDsl.g:1216:1: rule__Open__Group__1 : rule__Open__Group__1__Impl ;
    public final void rule__Open__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1220:1: ( rule__Open__Group__1__Impl )
            // InternalMyDsl.g:1221:2: rule__Open__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Open__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group__1"


    // $ANTLR start "rule__Open__Group__1__Impl"
    // InternalMyDsl.g:1227:1: rule__Open__Group__1__Impl : ( ( rule__Open__BrowserAssignment_1 ) ) ;
    public final void rule__Open__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1231:1: ( ( ( rule__Open__BrowserAssignment_1 ) ) )
            // InternalMyDsl.g:1232:1: ( ( rule__Open__BrowserAssignment_1 ) )
            {
            // InternalMyDsl.g:1232:1: ( ( rule__Open__BrowserAssignment_1 ) )
            // InternalMyDsl.g:1233:2: ( rule__Open__BrowserAssignment_1 )
            {
             before(grammarAccess.getOpenAccess().getBrowserAssignment_1()); 
            // InternalMyDsl.g:1234:2: ( rule__Open__BrowserAssignment_1 )
            // InternalMyDsl.g:1234:3: rule__Open__BrowserAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Open__BrowserAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOpenAccess().getBrowserAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__Group__1__Impl"


    // $ANTLR start "rule__GoTo__Group__0"
    // InternalMyDsl.g:1243:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1247:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // InternalMyDsl.g:1248:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GoTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__0"


    // $ANTLR start "rule__GoTo__Group__0__Impl"
    // InternalMyDsl.g:1255:1: rule__GoTo__Group__0__Impl : ( 'GoTo' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( ( 'GoTo' ) )
            // InternalMyDsl.g:1260:1: ( 'GoTo' )
            {
            // InternalMyDsl.g:1260:1: ( 'GoTo' )
            // InternalMyDsl.g:1261:2: 'GoTo'
            {
             before(grammarAccess.getGoToAccess().getGoToKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getGoToKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__0__Impl"


    // $ANTLR start "rule__GoTo__Group__1"
    // InternalMyDsl.g:1270:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1274:1: ( rule__GoTo__Group__1__Impl )
            // InternalMyDsl.g:1275:2: rule__GoTo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__1"


    // $ANTLR start "rule__GoTo__Group__1__Impl"
    // InternalMyDsl.g:1281:1: rule__GoTo__Group__1__Impl : ( ( rule__GoTo__UrlAssignment_1 ) ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1285:1: ( ( ( rule__GoTo__UrlAssignment_1 ) ) )
            // InternalMyDsl.g:1286:1: ( ( rule__GoTo__UrlAssignment_1 ) )
            {
            // InternalMyDsl.g:1286:1: ( ( rule__GoTo__UrlAssignment_1 ) )
            // InternalMyDsl.g:1287:2: ( rule__GoTo__UrlAssignment_1 )
            {
             before(grammarAccess.getGoToAccess().getUrlAssignment_1()); 
            // InternalMyDsl.g:1288:2: ( rule__GoTo__UrlAssignment_1 )
            // InternalMyDsl.g:1288:3: rule__GoTo__UrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getUrlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__1__Impl"


    // $ANTLR start "rule__Verify__Group__0"
    // InternalMyDsl.g:1297:1: rule__Verify__Group__0 : rule__Verify__Group__0__Impl rule__Verify__Group__1 ;
    public final void rule__Verify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1301:1: ( rule__Verify__Group__0__Impl rule__Verify__Group__1 )
            // InternalMyDsl.g:1302:2: rule__Verify__Group__0__Impl rule__Verify__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Verify__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__0"


    // $ANTLR start "rule__Verify__Group__0__Impl"
    // InternalMyDsl.g:1309:1: rule__Verify__Group__0__Impl : ( 'Verify' ) ;
    public final void rule__Verify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( ( 'Verify' ) )
            // InternalMyDsl.g:1314:1: ( 'Verify' )
            {
            // InternalMyDsl.g:1314:1: ( 'Verify' )
            // InternalMyDsl.g:1315:2: 'Verify'
            {
             before(grammarAccess.getVerifyAccess().getVerifyKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getVerifyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__0__Impl"


    // $ANTLR start "rule__Verify__Group__1"
    // InternalMyDsl.g:1324:1: rule__Verify__Group__1 : rule__Verify__Group__1__Impl ;
    public final void rule__Verify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1328:1: ( rule__Verify__Group__1__Impl )
            // InternalMyDsl.g:1329:2: rule__Verify__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__1"


    // $ANTLR start "rule__Verify__Group__1__Impl"
    // InternalMyDsl.g:1335:1: rule__Verify__Group__1__Impl : ( ruleTYPE_VERIFY ) ;
    public final void rule__Verify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1339:1: ( ( ruleTYPE_VERIFY ) )
            // InternalMyDsl.g:1340:1: ( ruleTYPE_VERIFY )
            {
            // InternalMyDsl.g:1340:1: ( ruleTYPE_VERIFY )
            // InternalMyDsl.g:1341:2: ruleTYPE_VERIFY
            {
             before(grammarAccess.getVerifyAccess().getTYPE_VERIFYParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_VERIFY();

            state._fsp--;

             after(grammarAccess.getVerifyAccess().getTYPE_VERIFYParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__1__Impl"


    // $ANTLR start "rule__Contains__Group__0"
    // InternalMyDsl.g:1351:1: rule__Contains__Group__0 : rule__Contains__Group__0__Impl rule__Contains__Group__1 ;
    public final void rule__Contains__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1355:1: ( rule__Contains__Group__0__Impl rule__Contains__Group__1 )
            // InternalMyDsl.g:1356:2: rule__Contains__Group__0__Impl rule__Contains__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Contains__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contains__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__Group__0"


    // $ANTLR start "rule__Contains__Group__0__Impl"
    // InternalMyDsl.g:1363:1: rule__Contains__Group__0__Impl : ( 'Contains' ) ;
    public final void rule__Contains__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( ( 'Contains' ) )
            // InternalMyDsl.g:1368:1: ( 'Contains' )
            {
            // InternalMyDsl.g:1368:1: ( 'Contains' )
            // InternalMyDsl.g:1369:2: 'Contains'
            {
             before(grammarAccess.getContainsAccess().getContainsKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getContainsAccess().getContainsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__Group__0__Impl"


    // $ANTLR start "rule__Contains__Group__1"
    // InternalMyDsl.g:1378:1: rule__Contains__Group__1 : rule__Contains__Group__1__Impl rule__Contains__Group__2 ;
    public final void rule__Contains__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1382:1: ( rule__Contains__Group__1__Impl rule__Contains__Group__2 )
            // InternalMyDsl.g:1383:2: rule__Contains__Group__1__Impl rule__Contains__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Contains__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contains__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__Group__1"


    // $ANTLR start "rule__Contains__Group__1__Impl"
    // InternalMyDsl.g:1390:1: rule__Contains__Group__1__Impl : ( ( rule__Contains__TypeAssignment_1 ) ) ;
    public final void rule__Contains__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( ( ( rule__Contains__TypeAssignment_1 ) ) )
            // InternalMyDsl.g:1395:1: ( ( rule__Contains__TypeAssignment_1 ) )
            {
            // InternalMyDsl.g:1395:1: ( ( rule__Contains__TypeAssignment_1 ) )
            // InternalMyDsl.g:1396:2: ( rule__Contains__TypeAssignment_1 )
            {
             before(grammarAccess.getContainsAccess().getTypeAssignment_1()); 
            // InternalMyDsl.g:1397:2: ( rule__Contains__TypeAssignment_1 )
            // InternalMyDsl.g:1397:3: rule__Contains__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Contains__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContainsAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__Group__1__Impl"


    // $ANTLR start "rule__Contains__Group__2"
    // InternalMyDsl.g:1405:1: rule__Contains__Group__2 : rule__Contains__Group__2__Impl ;
    public final void rule__Contains__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( rule__Contains__Group__2__Impl )
            // InternalMyDsl.g:1410:2: rule__Contains__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Contains__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__Group__2"


    // $ANTLR start "rule__Contains__Group__2__Impl"
    // InternalMyDsl.g:1416:1: rule__Contains__Group__2__Impl : ( ( rule__Contains__ParametreAssignment_2 ) ) ;
    public final void rule__Contains__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1420:1: ( ( ( rule__Contains__ParametreAssignment_2 ) ) )
            // InternalMyDsl.g:1421:1: ( ( rule__Contains__ParametreAssignment_2 ) )
            {
            // InternalMyDsl.g:1421:1: ( ( rule__Contains__ParametreAssignment_2 ) )
            // InternalMyDsl.g:1422:2: ( rule__Contains__ParametreAssignment_2 )
            {
             before(grammarAccess.getContainsAccess().getParametreAssignment_2()); 
            // InternalMyDsl.g:1423:2: ( rule__Contains__ParametreAssignment_2 )
            // InternalMyDsl.g:1423:3: rule__Contains__ParametreAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Contains__ParametreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContainsAccess().getParametreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__Group__2__Impl"


    // $ANTLR start "rule__Var__Group__0"
    // InternalMyDsl.g:1432:1: rule__Var__Group__0 : rule__Var__Group__0__Impl rule__Var__Group__1 ;
    public final void rule__Var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1436:1: ( rule__Var__Group__0__Impl rule__Var__Group__1 )
            // InternalMyDsl.g:1437:2: rule__Var__Group__0__Impl rule__Var__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Var__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__0"


    // $ANTLR start "rule__Var__Group__0__Impl"
    // InternalMyDsl.g:1444:1: rule__Var__Group__0__Impl : ( '(' ) ;
    public final void rule__Var__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1448:1: ( ( '(' ) )
            // InternalMyDsl.g:1449:1: ( '(' )
            {
            // InternalMyDsl.g:1449:1: ( '(' )
            // InternalMyDsl.g:1450:2: '('
            {
             before(grammarAccess.getVarAccess().getLeftParenthesisKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__0__Impl"


    // $ANTLR start "rule__Var__Group__1"
    // InternalMyDsl.g:1459:1: rule__Var__Group__1 : rule__Var__Group__1__Impl rule__Var__Group__2 ;
    public final void rule__Var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( rule__Var__Group__1__Impl rule__Var__Group__2 )
            // InternalMyDsl.g:1464:2: rule__Var__Group__1__Impl rule__Var__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Var__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__1"


    // $ANTLR start "rule__Var__Group__1__Impl"
    // InternalMyDsl.g:1471:1: rule__Var__Group__1__Impl : ( ( rule__Var__ValueAssignment_1 ) ) ;
    public final void rule__Var__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1475:1: ( ( ( rule__Var__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:1476:1: ( ( rule__Var__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:1476:1: ( ( rule__Var__ValueAssignment_1 ) )
            // InternalMyDsl.g:1477:2: ( rule__Var__ValueAssignment_1 )
            {
             before(grammarAccess.getVarAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:1478:2: ( rule__Var__ValueAssignment_1 )
            // InternalMyDsl.g:1478:3: rule__Var__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Var__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__1__Impl"


    // $ANTLR start "rule__Var__Group__2"
    // InternalMyDsl.g:1486:1: rule__Var__Group__2 : rule__Var__Group__2__Impl ;
    public final void rule__Var__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1490:1: ( rule__Var__Group__2__Impl )
            // InternalMyDsl.g:1491:2: rule__Var__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__2"


    // $ANTLR start "rule__Var__Group__2__Impl"
    // InternalMyDsl.g:1497:1: rule__Var__Group__2__Impl : ( ')' ) ;
    public final void rule__Var__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1501:1: ( ( ')' ) )
            // InternalMyDsl.g:1502:1: ( ')' )
            {
            // InternalMyDsl.g:1502:1: ( ')' )
            // InternalMyDsl.g:1503:2: ')'
            {
             before(grammarAccess.getVarAccess().getRightParenthesisKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__2__Impl"


    // $ANTLR start "rule__Equal__Group__0"
    // InternalMyDsl.g:1513:1: rule__Equal__Group__0 : rule__Equal__Group__0__Impl rule__Equal__Group__1 ;
    public final void rule__Equal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1517:1: ( rule__Equal__Group__0__Impl rule__Equal__Group__1 )
            // InternalMyDsl.g:1518:2: rule__Equal__Group__0__Impl rule__Equal__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Equal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__0"


    // $ANTLR start "rule__Equal__Group__0__Impl"
    // InternalMyDsl.g:1525:1: rule__Equal__Group__0__Impl : ( 'Equal' ) ;
    public final void rule__Equal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( ( 'Equal' ) )
            // InternalMyDsl.g:1530:1: ( 'Equal' )
            {
            // InternalMyDsl.g:1530:1: ( 'Equal' )
            // InternalMyDsl.g:1531:2: 'Equal'
            {
             before(grammarAccess.getEqualAccess().getEqualKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEqualAccess().getEqualKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__0__Impl"


    // $ANTLR start "rule__Equal__Group__1"
    // InternalMyDsl.g:1540:1: rule__Equal__Group__1 : rule__Equal__Group__1__Impl rule__Equal__Group__2 ;
    public final void rule__Equal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1544:1: ( rule__Equal__Group__1__Impl rule__Equal__Group__2 )
            // InternalMyDsl.g:1545:2: rule__Equal__Group__1__Impl rule__Equal__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Equal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__1"


    // $ANTLR start "rule__Equal__Group__1__Impl"
    // InternalMyDsl.g:1552:1: rule__Equal__Group__1__Impl : ( '(' ) ;
    public final void rule__Equal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1556:1: ( ( '(' ) )
            // InternalMyDsl.g:1557:1: ( '(' )
            {
            // InternalMyDsl.g:1557:1: ( '(' )
            // InternalMyDsl.g:1558:2: '('
            {
             before(grammarAccess.getEqualAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEqualAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__1__Impl"


    // $ANTLR start "rule__Equal__Group__2"
    // InternalMyDsl.g:1567:1: rule__Equal__Group__2 : rule__Equal__Group__2__Impl rule__Equal__Group__3 ;
    public final void rule__Equal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1571:1: ( rule__Equal__Group__2__Impl rule__Equal__Group__3 )
            // InternalMyDsl.g:1572:2: rule__Equal__Group__2__Impl rule__Equal__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Equal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__2"


    // $ANTLR start "rule__Equal__Group__2__Impl"
    // InternalMyDsl.g:1579:1: rule__Equal__Group__2__Impl : ( ( rule__Equal__Var1Assignment_2 ) ) ;
    public final void rule__Equal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1583:1: ( ( ( rule__Equal__Var1Assignment_2 ) ) )
            // InternalMyDsl.g:1584:1: ( ( rule__Equal__Var1Assignment_2 ) )
            {
            // InternalMyDsl.g:1584:1: ( ( rule__Equal__Var1Assignment_2 ) )
            // InternalMyDsl.g:1585:2: ( rule__Equal__Var1Assignment_2 )
            {
             before(grammarAccess.getEqualAccess().getVar1Assignment_2()); 
            // InternalMyDsl.g:1586:2: ( rule__Equal__Var1Assignment_2 )
            // InternalMyDsl.g:1586:3: rule__Equal__Var1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Equal__Var1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualAccess().getVar1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__2__Impl"


    // $ANTLR start "rule__Equal__Group__3"
    // InternalMyDsl.g:1594:1: rule__Equal__Group__3 : rule__Equal__Group__3__Impl rule__Equal__Group__4 ;
    public final void rule__Equal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1598:1: ( rule__Equal__Group__3__Impl rule__Equal__Group__4 )
            // InternalMyDsl.g:1599:2: rule__Equal__Group__3__Impl rule__Equal__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Equal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equal__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__3"


    // $ANTLR start "rule__Equal__Group__3__Impl"
    // InternalMyDsl.g:1606:1: rule__Equal__Group__3__Impl : ( ')' ) ;
    public final void rule__Equal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1610:1: ( ( ')' ) )
            // InternalMyDsl.g:1611:1: ( ')' )
            {
            // InternalMyDsl.g:1611:1: ( ')' )
            // InternalMyDsl.g:1612:2: ')'
            {
             before(grammarAccess.getEqualAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEqualAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__3__Impl"


    // $ANTLR start "rule__Equal__Group__4"
    // InternalMyDsl.g:1621:1: rule__Equal__Group__4 : rule__Equal__Group__4__Impl rule__Equal__Group__5 ;
    public final void rule__Equal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1625:1: ( rule__Equal__Group__4__Impl rule__Equal__Group__5 )
            // InternalMyDsl.g:1626:2: rule__Equal__Group__4__Impl rule__Equal__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Equal__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equal__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__4"


    // $ANTLR start "rule__Equal__Group__4__Impl"
    // InternalMyDsl.g:1633:1: rule__Equal__Group__4__Impl : ( '(' ) ;
    public final void rule__Equal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1637:1: ( ( '(' ) )
            // InternalMyDsl.g:1638:1: ( '(' )
            {
            // InternalMyDsl.g:1638:1: ( '(' )
            // InternalMyDsl.g:1639:2: '('
            {
             before(grammarAccess.getEqualAccess().getLeftParenthesisKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEqualAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__4__Impl"


    // $ANTLR start "rule__Equal__Group__5"
    // InternalMyDsl.g:1648:1: rule__Equal__Group__5 : rule__Equal__Group__5__Impl rule__Equal__Group__6 ;
    public final void rule__Equal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1652:1: ( rule__Equal__Group__5__Impl rule__Equal__Group__6 )
            // InternalMyDsl.g:1653:2: rule__Equal__Group__5__Impl rule__Equal__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Equal__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equal__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__5"


    // $ANTLR start "rule__Equal__Group__5__Impl"
    // InternalMyDsl.g:1660:1: rule__Equal__Group__5__Impl : ( ( rule__Equal__Var2Assignment_5 ) ) ;
    public final void rule__Equal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1664:1: ( ( ( rule__Equal__Var2Assignment_5 ) ) )
            // InternalMyDsl.g:1665:1: ( ( rule__Equal__Var2Assignment_5 ) )
            {
            // InternalMyDsl.g:1665:1: ( ( rule__Equal__Var2Assignment_5 ) )
            // InternalMyDsl.g:1666:2: ( rule__Equal__Var2Assignment_5 )
            {
             before(grammarAccess.getEqualAccess().getVar2Assignment_5()); 
            // InternalMyDsl.g:1667:2: ( rule__Equal__Var2Assignment_5 )
            // InternalMyDsl.g:1667:3: rule__Equal__Var2Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Equal__Var2Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEqualAccess().getVar2Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__5__Impl"


    // $ANTLR start "rule__Equal__Group__6"
    // InternalMyDsl.g:1675:1: rule__Equal__Group__6 : rule__Equal__Group__6__Impl ;
    public final void rule__Equal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1679:1: ( rule__Equal__Group__6__Impl )
            // InternalMyDsl.g:1680:2: rule__Equal__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equal__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__6"


    // $ANTLR start "rule__Equal__Group__6__Impl"
    // InternalMyDsl.g:1686:1: rule__Equal__Group__6__Impl : ( ')' ) ;
    public final void rule__Equal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1690:1: ( ( ')' ) )
            // InternalMyDsl.g:1691:1: ( ')' )
            {
            // InternalMyDsl.g:1691:1: ( ')' )
            // InternalMyDsl.g:1692:2: ')'
            {
             before(grammarAccess.getEqualAccess().getRightParenthesisKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEqualAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group__6__Impl"


    // $ANTLR start "rule__Click__Group__0"
    // InternalMyDsl.g:1702:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1706:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalMyDsl.g:1707:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Click__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0"


    // $ANTLR start "rule__Click__Group__0__Impl"
    // InternalMyDsl.g:1714:1: rule__Click__Group__0__Impl : ( 'Click' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( ( 'Click' ) )
            // InternalMyDsl.g:1719:1: ( 'Click' )
            {
            // InternalMyDsl.g:1719:1: ( 'Click' )
            // InternalMyDsl.g:1720:2: 'Click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getClickKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0__Impl"


    // $ANTLR start "rule__Click__Group__1"
    // InternalMyDsl.g:1729:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1733:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // InternalMyDsl.g:1734:2: rule__Click__Group__1__Impl rule__Click__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Click__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1"


    // $ANTLR start "rule__Click__Group__1__Impl"
    // InternalMyDsl.g:1741:1: rule__Click__Group__1__Impl : ( ( rule__Click__TypeAssignment_1 ) ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( ( ( rule__Click__TypeAssignment_1 ) ) )
            // InternalMyDsl.g:1746:1: ( ( rule__Click__TypeAssignment_1 ) )
            {
            // InternalMyDsl.g:1746:1: ( ( rule__Click__TypeAssignment_1 ) )
            // InternalMyDsl.g:1747:2: ( rule__Click__TypeAssignment_1 )
            {
             before(grammarAccess.getClickAccess().getTypeAssignment_1()); 
            // InternalMyDsl.g:1748:2: ( rule__Click__TypeAssignment_1 )
            // InternalMyDsl.g:1748:3: rule__Click__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Click__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1__Impl"


    // $ANTLR start "rule__Click__Group__2"
    // InternalMyDsl.g:1756:1: rule__Click__Group__2 : rule__Click__Group__2__Impl ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1760:1: ( rule__Click__Group__2__Impl )
            // InternalMyDsl.g:1761:2: rule__Click__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__2"


    // $ANTLR start "rule__Click__Group__2__Impl"
    // InternalMyDsl.g:1767:1: rule__Click__Group__2__Impl : ( ( rule__Click__ParametreAssignment_2 ) ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1771:1: ( ( ( rule__Click__ParametreAssignment_2 ) ) )
            // InternalMyDsl.g:1772:1: ( ( rule__Click__ParametreAssignment_2 ) )
            {
            // InternalMyDsl.g:1772:1: ( ( rule__Click__ParametreAssignment_2 ) )
            // InternalMyDsl.g:1773:2: ( rule__Click__ParametreAssignment_2 )
            {
             before(grammarAccess.getClickAccess().getParametreAssignment_2()); 
            // InternalMyDsl.g:1774:2: ( rule__Click__ParametreAssignment_2 )
            // InternalMyDsl.g:1774:3: rule__Click__ParametreAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Click__ParametreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getParametreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__2__Impl"


    // $ANTLR start "rule__Insert__Group__0"
    // InternalMyDsl.g:1783:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1787:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalMyDsl.g:1788:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Insert__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__0"


    // $ANTLR start "rule__Insert__Group__0__Impl"
    // InternalMyDsl.g:1795:1: rule__Insert__Group__0__Impl : ( 'Insert' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1799:1: ( ( 'Insert' ) )
            // InternalMyDsl.g:1800:1: ( 'Insert' )
            {
            // InternalMyDsl.g:1800:1: ( 'Insert' )
            // InternalMyDsl.g:1801:2: 'Insert'
            {
             before(grammarAccess.getInsertAccess().getInsertKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getInsertKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__0__Impl"


    // $ANTLR start "rule__Insert__Group__1"
    // InternalMyDsl.g:1810:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1814:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalMyDsl.g:1815:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Insert__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__1"


    // $ANTLR start "rule__Insert__Group__1__Impl"
    // InternalMyDsl.g:1822:1: rule__Insert__Group__1__Impl : ( 'in' ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( ( 'in' ) )
            // InternalMyDsl.g:1827:1: ( 'in' )
            {
            // InternalMyDsl.g:1827:1: ( 'in' )
            // InternalMyDsl.g:1828:2: 'in'
            {
             before(grammarAccess.getInsertAccess().getInKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getInKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__1__Impl"


    // $ANTLR start "rule__Insert__Group__2"
    // InternalMyDsl.g:1837:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl rule__Insert__Group__3 ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1841:1: ( rule__Insert__Group__2__Impl rule__Insert__Group__3 )
            // InternalMyDsl.g:1842:2: rule__Insert__Group__2__Impl rule__Insert__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Insert__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__2"


    // $ANTLR start "rule__Insert__Group__2__Impl"
    // InternalMyDsl.g:1849:1: rule__Insert__Group__2__Impl : ( ( rule__Insert__TypeAssignment_2 ) ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1853:1: ( ( ( rule__Insert__TypeAssignment_2 ) ) )
            // InternalMyDsl.g:1854:1: ( ( rule__Insert__TypeAssignment_2 ) )
            {
            // InternalMyDsl.g:1854:1: ( ( rule__Insert__TypeAssignment_2 ) )
            // InternalMyDsl.g:1855:2: ( rule__Insert__TypeAssignment_2 )
            {
             before(grammarAccess.getInsertAccess().getTypeAssignment_2()); 
            // InternalMyDsl.g:1856:2: ( rule__Insert__TypeAssignment_2 )
            // InternalMyDsl.g:1856:3: rule__Insert__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Insert__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__2__Impl"


    // $ANTLR start "rule__Insert__Group__3"
    // InternalMyDsl.g:1864:1: rule__Insert__Group__3 : rule__Insert__Group__3__Impl rule__Insert__Group__4 ;
    public final void rule__Insert__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1868:1: ( rule__Insert__Group__3__Impl rule__Insert__Group__4 )
            // InternalMyDsl.g:1869:2: rule__Insert__Group__3__Impl rule__Insert__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Insert__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__3"


    // $ANTLR start "rule__Insert__Group__3__Impl"
    // InternalMyDsl.g:1876:1: rule__Insert__Group__3__Impl : ( ( rule__Insert__NameAssignment_3 ) ) ;
    public final void rule__Insert__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1880:1: ( ( ( rule__Insert__NameAssignment_3 ) ) )
            // InternalMyDsl.g:1881:1: ( ( rule__Insert__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:1881:1: ( ( rule__Insert__NameAssignment_3 ) )
            // InternalMyDsl.g:1882:2: ( rule__Insert__NameAssignment_3 )
            {
             before(grammarAccess.getInsertAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:1883:2: ( rule__Insert__NameAssignment_3 )
            // InternalMyDsl.g:1883:3: rule__Insert__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Insert__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__3__Impl"


    // $ANTLR start "rule__Insert__Group__4"
    // InternalMyDsl.g:1891:1: rule__Insert__Group__4 : rule__Insert__Group__4__Impl rule__Insert__Group__5 ;
    public final void rule__Insert__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1895:1: ( rule__Insert__Group__4__Impl rule__Insert__Group__5 )
            // InternalMyDsl.g:1896:2: rule__Insert__Group__4__Impl rule__Insert__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Insert__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__4"


    // $ANTLR start "rule__Insert__Group__4__Impl"
    // InternalMyDsl.g:1903:1: rule__Insert__Group__4__Impl : ( 'with' ) ;
    public final void rule__Insert__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1907:1: ( ( 'with' ) )
            // InternalMyDsl.g:1908:1: ( 'with' )
            {
            // InternalMyDsl.g:1908:1: ( 'with' )
            // InternalMyDsl.g:1909:2: 'with'
            {
             before(grammarAccess.getInsertAccess().getWithKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getWithKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__4__Impl"


    // $ANTLR start "rule__Insert__Group__5"
    // InternalMyDsl.g:1918:1: rule__Insert__Group__5 : rule__Insert__Group__5__Impl ;
    public final void rule__Insert__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1922:1: ( rule__Insert__Group__5__Impl )
            // InternalMyDsl.g:1923:2: rule__Insert__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__5"


    // $ANTLR start "rule__Insert__Group__5__Impl"
    // InternalMyDsl.g:1929:1: rule__Insert__Group__5__Impl : ( ( rule__Insert__ParametreAssignment_5 ) ) ;
    public final void rule__Insert__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1933:1: ( ( ( rule__Insert__ParametreAssignment_5 ) ) )
            // InternalMyDsl.g:1934:1: ( ( rule__Insert__ParametreAssignment_5 ) )
            {
            // InternalMyDsl.g:1934:1: ( ( rule__Insert__ParametreAssignment_5 ) )
            // InternalMyDsl.g:1935:2: ( rule__Insert__ParametreAssignment_5 )
            {
             before(grammarAccess.getInsertAccess().getParametreAssignment_5()); 
            // InternalMyDsl.g:1936:2: ( rule__Insert__ParametreAssignment_5 )
            // InternalMyDsl.g:1936:3: rule__Insert__ParametreAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Insert__ParametreAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getParametreAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__5__Impl"


    // $ANTLR start "rule__Uncheck__Group__0"
    // InternalMyDsl.g:1945:1: rule__Uncheck__Group__0 : rule__Uncheck__Group__0__Impl rule__Uncheck__Group__1 ;
    public final void rule__Uncheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1949:1: ( rule__Uncheck__Group__0__Impl rule__Uncheck__Group__1 )
            // InternalMyDsl.g:1950:2: rule__Uncheck__Group__0__Impl rule__Uncheck__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Uncheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uncheck__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uncheck__Group__0"


    // $ANTLR start "rule__Uncheck__Group__0__Impl"
    // InternalMyDsl.g:1957:1: rule__Uncheck__Group__0__Impl : ( 'Uncheck' ) ;
    public final void rule__Uncheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1961:1: ( ( 'Uncheck' ) )
            // InternalMyDsl.g:1962:1: ( 'Uncheck' )
            {
            // InternalMyDsl.g:1962:1: ( 'Uncheck' )
            // InternalMyDsl.g:1963:2: 'Uncheck'
            {
             before(grammarAccess.getUncheckAccess().getUncheckKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUncheckAccess().getUncheckKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uncheck__Group__0__Impl"


    // $ANTLR start "rule__Uncheck__Group__1"
    // InternalMyDsl.g:1972:1: rule__Uncheck__Group__1 : rule__Uncheck__Group__1__Impl ;
    public final void rule__Uncheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1976:1: ( rule__Uncheck__Group__1__Impl )
            // InternalMyDsl.g:1977:2: rule__Uncheck__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uncheck__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uncheck__Group__1"


    // $ANTLR start "rule__Uncheck__Group__1__Impl"
    // InternalMyDsl.g:1983:1: rule__Uncheck__Group__1__Impl : ( ( rule__Uncheck__TypeAssignment_1 ) ) ;
    public final void rule__Uncheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1987:1: ( ( ( rule__Uncheck__TypeAssignment_1 ) ) )
            // InternalMyDsl.g:1988:1: ( ( rule__Uncheck__TypeAssignment_1 ) )
            {
            // InternalMyDsl.g:1988:1: ( ( rule__Uncheck__TypeAssignment_1 ) )
            // InternalMyDsl.g:1989:2: ( rule__Uncheck__TypeAssignment_1 )
            {
             before(grammarAccess.getUncheckAccess().getTypeAssignment_1()); 
            // InternalMyDsl.g:1990:2: ( rule__Uncheck__TypeAssignment_1 )
            // InternalMyDsl.g:1990:3: rule__Uncheck__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Uncheck__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUncheckAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uncheck__Group__1__Impl"


    // $ANTLR start "rule__TYPE_CHECK_UNCHECK__Group_1__0"
    // InternalMyDsl.g:1999:1: rule__TYPE_CHECK_UNCHECK__Group_1__0 : rule__TYPE_CHECK_UNCHECK__Group_1__0__Impl rule__TYPE_CHECK_UNCHECK__Group_1__1 ;
    public final void rule__TYPE_CHECK_UNCHECK__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2003:1: ( rule__TYPE_CHECK_UNCHECK__Group_1__0__Impl rule__TYPE_CHECK_UNCHECK__Group_1__1 )
            // InternalMyDsl.g:2004:2: rule__TYPE_CHECK_UNCHECK__Group_1__0__Impl rule__TYPE_CHECK_UNCHECK__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__TYPE_CHECK_UNCHECK__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TYPE_CHECK_UNCHECK__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE_CHECK_UNCHECK__Group_1__0"


    // $ANTLR start "rule__TYPE_CHECK_UNCHECK__Group_1__0__Impl"
    // InternalMyDsl.g:2011:1: rule__TYPE_CHECK_UNCHECK__Group_1__0__Impl : ( '[' ) ;
    public final void rule__TYPE_CHECK_UNCHECK__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2015:1: ( ( '[' ) )
            // InternalMyDsl.g:2016:1: ( '[' )
            {
            // InternalMyDsl.g:2016:1: ( '[' )
            // InternalMyDsl.g:2017:2: '['
            {
             before(grammarAccess.getTYPE_CHECK_UNCHECKAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTYPE_CHECK_UNCHECKAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE_CHECK_UNCHECK__Group_1__0__Impl"


    // $ANTLR start "rule__TYPE_CHECK_UNCHECK__Group_1__1"
    // InternalMyDsl.g:2026:1: rule__TYPE_CHECK_UNCHECK__Group_1__1 : rule__TYPE_CHECK_UNCHECK__Group_1__1__Impl rule__TYPE_CHECK_UNCHECK__Group_1__2 ;
    public final void rule__TYPE_CHECK_UNCHECK__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2030:1: ( rule__TYPE_CHECK_UNCHECK__Group_1__1__Impl rule__TYPE_CHECK_UNCHECK__Group_1__2 )
            // InternalMyDsl.g:2031:2: rule__TYPE_CHECK_UNCHECK__Group_1__1__Impl rule__TYPE_CHECK_UNCHECK__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__TYPE_CHECK_UNCHECK__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TYPE_CHECK_UNCHECK__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE_CHECK_UNCHECK__Group_1__1"


    // $ANTLR start "rule__TYPE_CHECK_UNCHECK__Group_1__1__Impl"
    // InternalMyDsl.g:2038:1: rule__TYPE_CHECK_UNCHECK__Group_1__1__Impl : ( ( rule__TYPE_CHECK_UNCHECK__TableauAssignment_1_1 )* ) ;
    public final void rule__TYPE_CHECK_UNCHECK__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2042:1: ( ( ( rule__TYPE_CHECK_UNCHECK__TableauAssignment_1_1 )* ) )
            // InternalMyDsl.g:2043:1: ( ( rule__TYPE_CHECK_UNCHECK__TableauAssignment_1_1 )* )
            {
            // InternalMyDsl.g:2043:1: ( ( rule__TYPE_CHECK_UNCHECK__TableauAssignment_1_1 )* )
            // InternalMyDsl.g:2044:2: ( rule__TYPE_CHECK_UNCHECK__TableauAssignment_1_1 )*
            {
             before(grammarAccess.getTYPE_CHECK_UNCHECKAccess().getTableauAssignment_1_1()); 
            // InternalMyDsl.g:2045:2: ( rule__TYPE_CHECK_UNCHECK__TableauAssignment_1_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:2045:3: rule__TYPE_CHECK_UNCHECK__TableauAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__TYPE_CHECK_UNCHECK__TableauAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTYPE_CHECK_UNCHECKAccess().getTableauAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE_CHECK_UNCHECK__Group_1__1__Impl"


    // $ANTLR start "rule__TYPE_CHECK_UNCHECK__Group_1__2"
    // InternalMyDsl.g:2053:1: rule__TYPE_CHECK_UNCHECK__Group_1__2 : rule__TYPE_CHECK_UNCHECK__Group_1__2__Impl ;
    public final void rule__TYPE_CHECK_UNCHECK__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2057:1: ( rule__TYPE_CHECK_UNCHECK__Group_1__2__Impl )
            // InternalMyDsl.g:2058:2: rule__TYPE_CHECK_UNCHECK__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TYPE_CHECK_UNCHECK__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE_CHECK_UNCHECK__Group_1__2"


    // $ANTLR start "rule__TYPE_CHECK_UNCHECK__Group_1__2__Impl"
    // InternalMyDsl.g:2064:1: rule__TYPE_CHECK_UNCHECK__Group_1__2__Impl : ( ']' ) ;
    public final void rule__TYPE_CHECK_UNCHECK__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2068:1: ( ( ']' ) )
            // InternalMyDsl.g:2069:1: ( ']' )
            {
            // InternalMyDsl.g:2069:1: ( ']' )
            // InternalMyDsl.g:2070:2: ']'
            {
             before(grammarAccess.getTYPE_CHECK_UNCHECKAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTYPE_CHECK_UNCHECKAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE_CHECK_UNCHECK__Group_1__2__Impl"


    // $ANTLR start "rule__Check__Group__0"
    // InternalMyDsl.g:2080:1: rule__Check__Group__0 : rule__Check__Group__0__Impl rule__Check__Group__1 ;
    public final void rule__Check__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2084:1: ( rule__Check__Group__0__Impl rule__Check__Group__1 )
            // InternalMyDsl.g:2085:2: rule__Check__Group__0__Impl rule__Check__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Check__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__0"


    // $ANTLR start "rule__Check__Group__0__Impl"
    // InternalMyDsl.g:2092:1: rule__Check__Group__0__Impl : ( 'Check' ) ;
    public final void rule__Check__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2096:1: ( ( 'Check' ) )
            // InternalMyDsl.g:2097:1: ( 'Check' )
            {
            // InternalMyDsl.g:2097:1: ( 'Check' )
            // InternalMyDsl.g:2098:2: 'Check'
            {
             before(grammarAccess.getCheckAccess().getCheckKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getCheckKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__0__Impl"


    // $ANTLR start "rule__Check__Group__1"
    // InternalMyDsl.g:2107:1: rule__Check__Group__1 : rule__Check__Group__1__Impl ;
    public final void rule__Check__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2111:1: ( rule__Check__Group__1__Impl )
            // InternalMyDsl.g:2112:2: rule__Check__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__1"


    // $ANTLR start "rule__Check__Group__1__Impl"
    // InternalMyDsl.g:2118:1: rule__Check__Group__1__Impl : ( ( rule__Check__TypeAssignment_1 ) ) ;
    public final void rule__Check__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2122:1: ( ( ( rule__Check__TypeAssignment_1 ) ) )
            // InternalMyDsl.g:2123:1: ( ( rule__Check__TypeAssignment_1 ) )
            {
            // InternalMyDsl.g:2123:1: ( ( rule__Check__TypeAssignment_1 ) )
            // InternalMyDsl.g:2124:2: ( rule__Check__TypeAssignment_1 )
            {
             before(grammarAccess.getCheckAccess().getTypeAssignment_1()); 
            // InternalMyDsl.g:2125:2: ( rule__Check__TypeAssignment_1 )
            // InternalMyDsl.g:2125:3: rule__Check__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Check__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__Group__1__Impl"


    // $ANTLR start "rule__Choose__Group__0"
    // InternalMyDsl.g:2134:1: rule__Choose__Group__0 : rule__Choose__Group__0__Impl rule__Choose__Group__1 ;
    public final void rule__Choose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2138:1: ( rule__Choose__Group__0__Impl rule__Choose__Group__1 )
            // InternalMyDsl.g:2139:2: rule__Choose__Group__0__Impl rule__Choose__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Choose__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choose__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__Group__0"


    // $ANTLR start "rule__Choose__Group__0__Impl"
    // InternalMyDsl.g:2146:1: rule__Choose__Group__0__Impl : ( 'Choose' ) ;
    public final void rule__Choose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2150:1: ( ( 'Choose' ) )
            // InternalMyDsl.g:2151:1: ( 'Choose' )
            {
            // InternalMyDsl.g:2151:1: ( 'Choose' )
            // InternalMyDsl.g:2152:2: 'Choose'
            {
             before(grammarAccess.getChooseAccess().getChooseKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getChooseAccess().getChooseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__Group__0__Impl"


    // $ANTLR start "rule__Choose__Group__1"
    // InternalMyDsl.g:2161:1: rule__Choose__Group__1 : rule__Choose__Group__1__Impl rule__Choose__Group__2 ;
    public final void rule__Choose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2165:1: ( rule__Choose__Group__1__Impl rule__Choose__Group__2 )
            // InternalMyDsl.g:2166:2: rule__Choose__Group__1__Impl rule__Choose__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Choose__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choose__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__Group__1"


    // $ANTLR start "rule__Choose__Group__1__Impl"
    // InternalMyDsl.g:2173:1: rule__Choose__Group__1__Impl : ( ( rule__Choose__TypeAssignment_1 ) ) ;
    public final void rule__Choose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2177:1: ( ( ( rule__Choose__TypeAssignment_1 ) ) )
            // InternalMyDsl.g:2178:1: ( ( rule__Choose__TypeAssignment_1 ) )
            {
            // InternalMyDsl.g:2178:1: ( ( rule__Choose__TypeAssignment_1 ) )
            // InternalMyDsl.g:2179:2: ( rule__Choose__TypeAssignment_1 )
            {
             before(grammarAccess.getChooseAccess().getTypeAssignment_1()); 
            // InternalMyDsl.g:2180:2: ( rule__Choose__TypeAssignment_1 )
            // InternalMyDsl.g:2180:3: rule__Choose__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Choose__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChooseAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__Group__1__Impl"


    // $ANTLR start "rule__Choose__Group__2"
    // InternalMyDsl.g:2188:1: rule__Choose__Group__2 : rule__Choose__Group__2__Impl rule__Choose__Group__3 ;
    public final void rule__Choose__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2192:1: ( rule__Choose__Group__2__Impl rule__Choose__Group__3 )
            // InternalMyDsl.g:2193:2: rule__Choose__Group__2__Impl rule__Choose__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Choose__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choose__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__Group__2"


    // $ANTLR start "rule__Choose__Group__2__Impl"
    // InternalMyDsl.g:2200:1: rule__Choose__Group__2__Impl : ( ( rule__Choose__ParametreAssignment_2 ) ) ;
    public final void rule__Choose__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2204:1: ( ( ( rule__Choose__ParametreAssignment_2 ) ) )
            // InternalMyDsl.g:2205:1: ( ( rule__Choose__ParametreAssignment_2 ) )
            {
            // InternalMyDsl.g:2205:1: ( ( rule__Choose__ParametreAssignment_2 ) )
            // InternalMyDsl.g:2206:2: ( rule__Choose__ParametreAssignment_2 )
            {
             before(grammarAccess.getChooseAccess().getParametreAssignment_2()); 
            // InternalMyDsl.g:2207:2: ( rule__Choose__ParametreAssignment_2 )
            // InternalMyDsl.g:2207:3: rule__Choose__ParametreAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Choose__ParametreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChooseAccess().getParametreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__Group__2__Impl"


    // $ANTLR start "rule__Choose__Group__3"
    // InternalMyDsl.g:2215:1: rule__Choose__Group__3 : rule__Choose__Group__3__Impl rule__Choose__Group__4 ;
    public final void rule__Choose__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2219:1: ( rule__Choose__Group__3__Impl rule__Choose__Group__4 )
            // InternalMyDsl.g:2220:2: rule__Choose__Group__3__Impl rule__Choose__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Choose__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choose__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__Group__3"


    // $ANTLR start "rule__Choose__Group__3__Impl"
    // InternalMyDsl.g:2227:1: rule__Choose__Group__3__Impl : ( 'in' ) ;
    public final void rule__Choose__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2231:1: ( ( 'in' ) )
            // InternalMyDsl.g:2232:1: ( 'in' )
            {
            // InternalMyDsl.g:2232:1: ( 'in' )
            // InternalMyDsl.g:2233:2: 'in'
            {
             before(grammarAccess.getChooseAccess().getInKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getChooseAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__Group__3__Impl"


    // $ANTLR start "rule__Choose__Group__4"
    // InternalMyDsl.g:2242:1: rule__Choose__Group__4 : rule__Choose__Group__4__Impl ;
    public final void rule__Choose__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2246:1: ( rule__Choose__Group__4__Impl )
            // InternalMyDsl.g:2247:2: rule__Choose__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choose__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__Group__4"


    // $ANTLR start "rule__Choose__Group__4__Impl"
    // InternalMyDsl.g:2253:1: rule__Choose__Group__4__Impl : ( ( rule__Choose__NameAssignment_4 ) ) ;
    public final void rule__Choose__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( ( ( rule__Choose__NameAssignment_4 ) ) )
            // InternalMyDsl.g:2258:1: ( ( rule__Choose__NameAssignment_4 ) )
            {
            // InternalMyDsl.g:2258:1: ( ( rule__Choose__NameAssignment_4 ) )
            // InternalMyDsl.g:2259:2: ( rule__Choose__NameAssignment_4 )
            {
             before(grammarAccess.getChooseAccess().getNameAssignment_4()); 
            // InternalMyDsl.g:2260:2: ( rule__Choose__NameAssignment_4 )
            // InternalMyDsl.g:2260:3: rule__Choose__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Choose__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChooseAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalMyDsl.g:2269:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2273:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMyDsl.g:2274:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalMyDsl.g:2281:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2286:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2286:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalMyDsl.g:2287:2: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2288:2: ( rule__Variable__NameAssignment_0 )
            // InternalMyDsl.g:2288:3: rule__Variable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalMyDsl.g:2296:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2300:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalMyDsl.g:2301:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalMyDsl.g:2308:1: rule__Variable__Group__1__Impl : ( '=' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2312:1: ( ( '=' ) )
            // InternalMyDsl.g:2313:1: ( '=' )
            {
            // InternalMyDsl.g:2313:1: ( '=' )
            // InternalMyDsl.g:2314:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalMyDsl.g:2323:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2327:1: ( rule__Variable__Group__2__Impl )
            // InternalMyDsl.g:2328:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalMyDsl.g:2334:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__InstructionAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2338:1: ( ( ( rule__Variable__InstructionAssignment_2 ) ) )
            // InternalMyDsl.g:2339:1: ( ( rule__Variable__InstructionAssignment_2 ) )
            {
            // InternalMyDsl.g:2339:1: ( ( rule__Variable__InstructionAssignment_2 ) )
            // InternalMyDsl.g:2340:2: ( rule__Variable__InstructionAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getInstructionAssignment_2()); 
            // InternalMyDsl.g:2341:2: ( rule__Variable__InstructionAssignment_2 )
            // InternalMyDsl.g:2341:3: rule__Variable__InstructionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable__InstructionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getInstructionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Read__Group__0"
    // InternalMyDsl.g:2350:1: rule__Read__Group__0 : rule__Read__Group__0__Impl rule__Read__Group__1 ;
    public final void rule__Read__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2354:1: ( rule__Read__Group__0__Impl rule__Read__Group__1 )
            // InternalMyDsl.g:2355:2: rule__Read__Group__0__Impl rule__Read__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Read__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__0"


    // $ANTLR start "rule__Read__Group__0__Impl"
    // InternalMyDsl.g:2362:1: rule__Read__Group__0__Impl : ( 'Read' ) ;
    public final void rule__Read__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2366:1: ( ( 'Read' ) )
            // InternalMyDsl.g:2367:1: ( 'Read' )
            {
            // InternalMyDsl.g:2367:1: ( 'Read' )
            // InternalMyDsl.g:2368:2: 'Read'
            {
             before(grammarAccess.getReadAccess().getReadKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getReadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__0__Impl"


    // $ANTLR start "rule__Read__Group__1"
    // InternalMyDsl.g:2377:1: rule__Read__Group__1 : rule__Read__Group__1__Impl rule__Read__Group__2 ;
    public final void rule__Read__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2381:1: ( rule__Read__Group__1__Impl rule__Read__Group__2 )
            // InternalMyDsl.g:2382:2: rule__Read__Group__1__Impl rule__Read__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Read__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__1"


    // $ANTLR start "rule__Read__Group__1__Impl"
    // InternalMyDsl.g:2389:1: rule__Read__Group__1__Impl : ( ( rule__Read__TypeAssignment_1 ) ) ;
    public final void rule__Read__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2393:1: ( ( ( rule__Read__TypeAssignment_1 ) ) )
            // InternalMyDsl.g:2394:1: ( ( rule__Read__TypeAssignment_1 ) )
            {
            // InternalMyDsl.g:2394:1: ( ( rule__Read__TypeAssignment_1 ) )
            // InternalMyDsl.g:2395:2: ( rule__Read__TypeAssignment_1 )
            {
             before(grammarAccess.getReadAccess().getTypeAssignment_1()); 
            // InternalMyDsl.g:2396:2: ( rule__Read__TypeAssignment_1 )
            // InternalMyDsl.g:2396:3: rule__Read__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Read__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__1__Impl"


    // $ANTLR start "rule__Read__Group__2"
    // InternalMyDsl.g:2404:1: rule__Read__Group__2 : rule__Read__Group__2__Impl rule__Read__Group__3 ;
    public final void rule__Read__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2408:1: ( rule__Read__Group__2__Impl rule__Read__Group__3 )
            // InternalMyDsl.g:2409:2: rule__Read__Group__2__Impl rule__Read__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Read__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Read__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__2"


    // $ANTLR start "rule__Read__Group__2__Impl"
    // InternalMyDsl.g:2416:1: rule__Read__Group__2__Impl : ( 'of Element ' ) ;
    public final void rule__Read__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2420:1: ( ( 'of Element ' ) )
            // InternalMyDsl.g:2421:1: ( 'of Element ' )
            {
            // InternalMyDsl.g:2421:1: ( 'of Element ' )
            // InternalMyDsl.g:2422:2: 'of Element '
            {
             before(grammarAccess.getReadAccess().getOfElementKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getOfElementKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__2__Impl"


    // $ANTLR start "rule__Read__Group__3"
    // InternalMyDsl.g:2431:1: rule__Read__Group__3 : rule__Read__Group__3__Impl ;
    public final void rule__Read__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2435:1: ( rule__Read__Group__3__Impl )
            // InternalMyDsl.g:2436:2: rule__Read__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Read__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__3"


    // $ANTLR start "rule__Read__Group__3__Impl"
    // InternalMyDsl.g:2442:1: rule__Read__Group__3__Impl : ( ( rule__Read__ParametreAssignment_3 ) ) ;
    public final void rule__Read__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2446:1: ( ( ( rule__Read__ParametreAssignment_3 ) ) )
            // InternalMyDsl.g:2447:1: ( ( rule__Read__ParametreAssignment_3 ) )
            {
            // InternalMyDsl.g:2447:1: ( ( rule__Read__ParametreAssignment_3 ) )
            // InternalMyDsl.g:2448:2: ( rule__Read__ParametreAssignment_3 )
            {
             before(grammarAccess.getReadAccess().getParametreAssignment_3()); 
            // InternalMyDsl.g:2449:2: ( rule__Read__ParametreAssignment_3 )
            // InternalMyDsl.g:2449:3: rule__Read__ParametreAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Read__ParametreAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReadAccess().getParametreAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__Group__3__Impl"


    // $ANTLR start "rule__Count__Group__0"
    // InternalMyDsl.g:2458:1: rule__Count__Group__0 : rule__Count__Group__0__Impl rule__Count__Group__1 ;
    public final void rule__Count__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2462:1: ( rule__Count__Group__0__Impl rule__Count__Group__1 )
            // InternalMyDsl.g:2463:2: rule__Count__Group__0__Impl rule__Count__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Count__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Count__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Count__Group__0"


    // $ANTLR start "rule__Count__Group__0__Impl"
    // InternalMyDsl.g:2470:1: rule__Count__Group__0__Impl : ( 'Count of Element ' ) ;
    public final void rule__Count__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2474:1: ( ( 'Count of Element ' ) )
            // InternalMyDsl.g:2475:1: ( 'Count of Element ' )
            {
            // InternalMyDsl.g:2475:1: ( 'Count of Element ' )
            // InternalMyDsl.g:2476:2: 'Count of Element '
            {
             before(grammarAccess.getCountAccess().getCountOfElementKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCountAccess().getCountOfElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Count__Group__0__Impl"


    // $ANTLR start "rule__Count__Group__1"
    // InternalMyDsl.g:2485:1: rule__Count__Group__1 : rule__Count__Group__1__Impl ;
    public final void rule__Count__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2489:1: ( rule__Count__Group__1__Impl )
            // InternalMyDsl.g:2490:2: rule__Count__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Count__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Count__Group__1"


    // $ANTLR start "rule__Count__Group__1__Impl"
    // InternalMyDsl.g:2496:1: rule__Count__Group__1__Impl : ( ( rule__Count__ParametreAssignment_1 ) ) ;
    public final void rule__Count__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2500:1: ( ( ( rule__Count__ParametreAssignment_1 ) ) )
            // InternalMyDsl.g:2501:1: ( ( rule__Count__ParametreAssignment_1 ) )
            {
            // InternalMyDsl.g:2501:1: ( ( rule__Count__ParametreAssignment_1 ) )
            // InternalMyDsl.g:2502:2: ( rule__Count__ParametreAssignment_1 )
            {
             before(grammarAccess.getCountAccess().getParametreAssignment_1()); 
            // InternalMyDsl.g:2503:2: ( rule__Count__ParametreAssignment_1 )
            // InternalMyDsl.g:2503:3: rule__Count__ParametreAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Count__ParametreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCountAccess().getParametreAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Count__Group__1__Impl"


    // $ANTLR start "rule__Paste__Group__0"
    // InternalMyDsl.g:2512:1: rule__Paste__Group__0 : rule__Paste__Group__0__Impl rule__Paste__Group__1 ;
    public final void rule__Paste__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2516:1: ( rule__Paste__Group__0__Impl rule__Paste__Group__1 )
            // InternalMyDsl.g:2517:2: rule__Paste__Group__0__Impl rule__Paste__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Paste__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paste__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__0"


    // $ANTLR start "rule__Paste__Group__0__Impl"
    // InternalMyDsl.g:2524:1: rule__Paste__Group__0__Impl : ( 'Paste' ) ;
    public final void rule__Paste__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2528:1: ( ( 'Paste' ) )
            // InternalMyDsl.g:2529:1: ( 'Paste' )
            {
            // InternalMyDsl.g:2529:1: ( 'Paste' )
            // InternalMyDsl.g:2530:2: 'Paste'
            {
             before(grammarAccess.getPasteAccess().getPasteKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPasteAccess().getPasteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__0__Impl"


    // $ANTLR start "rule__Paste__Group__1"
    // InternalMyDsl.g:2539:1: rule__Paste__Group__1 : rule__Paste__Group__1__Impl rule__Paste__Group__2 ;
    public final void rule__Paste__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2543:1: ( rule__Paste__Group__1__Impl rule__Paste__Group__2 )
            // InternalMyDsl.g:2544:2: rule__Paste__Group__1__Impl rule__Paste__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Paste__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paste__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__1"


    // $ANTLR start "rule__Paste__Group__1__Impl"
    // InternalMyDsl.g:2551:1: rule__Paste__Group__1__Impl : ( ( rule__Paste__TypeAssignment_1 ) ) ;
    public final void rule__Paste__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2555:1: ( ( ( rule__Paste__TypeAssignment_1 ) ) )
            // InternalMyDsl.g:2556:1: ( ( rule__Paste__TypeAssignment_1 ) )
            {
            // InternalMyDsl.g:2556:1: ( ( rule__Paste__TypeAssignment_1 ) )
            // InternalMyDsl.g:2557:2: ( rule__Paste__TypeAssignment_1 )
            {
             before(grammarAccess.getPasteAccess().getTypeAssignment_1()); 
            // InternalMyDsl.g:2558:2: ( rule__Paste__TypeAssignment_1 )
            // InternalMyDsl.g:2558:3: rule__Paste__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Paste__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPasteAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__1__Impl"


    // $ANTLR start "rule__Paste__Group__2"
    // InternalMyDsl.g:2566:1: rule__Paste__Group__2 : rule__Paste__Group__2__Impl rule__Paste__Group__3 ;
    public final void rule__Paste__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2570:1: ( rule__Paste__Group__2__Impl rule__Paste__Group__3 )
            // InternalMyDsl.g:2571:2: rule__Paste__Group__2__Impl rule__Paste__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Paste__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paste__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__2"


    // $ANTLR start "rule__Paste__Group__2__Impl"
    // InternalMyDsl.g:2578:1: rule__Paste__Group__2__Impl : ( '(' ) ;
    public final void rule__Paste__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2582:1: ( ( '(' ) )
            // InternalMyDsl.g:2583:1: ( '(' )
            {
            // InternalMyDsl.g:2583:1: ( '(' )
            // InternalMyDsl.g:2584:2: '('
            {
             before(grammarAccess.getPasteAccess().getLeftParenthesisKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPasteAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__2__Impl"


    // $ANTLR start "rule__Paste__Group__3"
    // InternalMyDsl.g:2593:1: rule__Paste__Group__3 : rule__Paste__Group__3__Impl rule__Paste__Group__4 ;
    public final void rule__Paste__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2597:1: ( rule__Paste__Group__3__Impl rule__Paste__Group__4 )
            // InternalMyDsl.g:2598:2: rule__Paste__Group__3__Impl rule__Paste__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Paste__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paste__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__3"


    // $ANTLR start "rule__Paste__Group__3__Impl"
    // InternalMyDsl.g:2605:1: rule__Paste__Group__3__Impl : ( ( rule__Paste__ParametreAssignment_3 ) ) ;
    public final void rule__Paste__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2609:1: ( ( ( rule__Paste__ParametreAssignment_3 ) ) )
            // InternalMyDsl.g:2610:1: ( ( rule__Paste__ParametreAssignment_3 ) )
            {
            // InternalMyDsl.g:2610:1: ( ( rule__Paste__ParametreAssignment_3 ) )
            // InternalMyDsl.g:2611:2: ( rule__Paste__ParametreAssignment_3 )
            {
             before(grammarAccess.getPasteAccess().getParametreAssignment_3()); 
            // InternalMyDsl.g:2612:2: ( rule__Paste__ParametreAssignment_3 )
            // InternalMyDsl.g:2612:3: rule__Paste__ParametreAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Paste__ParametreAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPasteAccess().getParametreAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__3__Impl"


    // $ANTLR start "rule__Paste__Group__4"
    // InternalMyDsl.g:2620:1: rule__Paste__Group__4 : rule__Paste__Group__4__Impl ;
    public final void rule__Paste__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2624:1: ( rule__Paste__Group__4__Impl )
            // InternalMyDsl.g:2625:2: rule__Paste__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paste__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__4"


    // $ANTLR start "rule__Paste__Group__4__Impl"
    // InternalMyDsl.g:2631:1: rule__Paste__Group__4__Impl : ( ')' ) ;
    public final void rule__Paste__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2635:1: ( ( ')' ) )
            // InternalMyDsl.g:2636:1: ( ')' )
            {
            // InternalMyDsl.g:2636:1: ( ')' )
            // InternalMyDsl.g:2637:2: ')'
            {
             before(grammarAccess.getPasteAccess().getRightParenthesisKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPasteAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__Group__4__Impl"


    // $ANTLR start "rule__For__Group__0"
    // InternalMyDsl.g:2647:1: rule__For__Group__0 : rule__For__Group__0__Impl rule__For__Group__1 ;
    public final void rule__For__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2651:1: ( rule__For__Group__0__Impl rule__For__Group__1 )
            // InternalMyDsl.g:2652:2: rule__For__Group__0__Impl rule__For__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__For__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__0"


    // $ANTLR start "rule__For__Group__0__Impl"
    // InternalMyDsl.g:2659:1: rule__For__Group__0__Impl : ( 'For' ) ;
    public final void rule__For__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2663:1: ( ( 'For' ) )
            // InternalMyDsl.g:2664:1: ( 'For' )
            {
            // InternalMyDsl.g:2664:1: ( 'For' )
            // InternalMyDsl.g:2665:2: 'For'
            {
             before(grammarAccess.getForAccess().getForKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getForAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__0__Impl"


    // $ANTLR start "rule__For__Group__1"
    // InternalMyDsl.g:2674:1: rule__For__Group__1 : rule__For__Group__1__Impl rule__For__Group__2 ;
    public final void rule__For__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2678:1: ( rule__For__Group__1__Impl rule__For__Group__2 )
            // InternalMyDsl.g:2679:2: rule__For__Group__1__Impl rule__For__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__For__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__1"


    // $ANTLR start "rule__For__Group__1__Impl"
    // InternalMyDsl.g:2686:1: rule__For__Group__1__Impl : ( ( rule__For__NameAssignment_1 ) ) ;
    public final void rule__For__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2690:1: ( ( ( rule__For__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2691:1: ( ( rule__For__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2691:1: ( ( rule__For__NameAssignment_1 ) )
            // InternalMyDsl.g:2692:2: ( rule__For__NameAssignment_1 )
            {
             before(grammarAccess.getForAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2693:2: ( rule__For__NameAssignment_1 )
            // InternalMyDsl.g:2693:3: rule__For__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__For__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__1__Impl"


    // $ANTLR start "rule__For__Group__2"
    // InternalMyDsl.g:2701:1: rule__For__Group__2 : rule__For__Group__2__Impl rule__For__Group__3 ;
    public final void rule__For__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2705:1: ( rule__For__Group__2__Impl rule__For__Group__3 )
            // InternalMyDsl.g:2706:2: rule__For__Group__2__Impl rule__For__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__For__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__2"


    // $ANTLR start "rule__For__Group__2__Impl"
    // InternalMyDsl.g:2713:1: rule__For__Group__2__Impl : ( '=' ) ;
    public final void rule__For__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2717:1: ( ( '=' ) )
            // InternalMyDsl.g:2718:1: ( '=' )
            {
            // InternalMyDsl.g:2718:1: ( '=' )
            // InternalMyDsl.g:2719:2: '='
            {
             before(grammarAccess.getForAccess().getEqualsSignKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getForAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__2__Impl"


    // $ANTLR start "rule__For__Group__3"
    // InternalMyDsl.g:2728:1: rule__For__Group__3 : rule__For__Group__3__Impl rule__For__Group__4 ;
    public final void rule__For__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2732:1: ( rule__For__Group__3__Impl rule__For__Group__4 )
            // InternalMyDsl.g:2733:2: rule__For__Group__3__Impl rule__For__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__For__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__3"


    // $ANTLR start "rule__For__Group__3__Impl"
    // InternalMyDsl.g:2740:1: rule__For__Group__3__Impl : ( '[' ) ;
    public final void rule__For__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2744:1: ( ( '[' ) )
            // InternalMyDsl.g:2745:1: ( '[' )
            {
            // InternalMyDsl.g:2745:1: ( '[' )
            // InternalMyDsl.g:2746:2: '['
            {
             before(grammarAccess.getForAccess().getLeftSquareBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getForAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__3__Impl"


    // $ANTLR start "rule__For__Group__4"
    // InternalMyDsl.g:2755:1: rule__For__Group__4 : rule__For__Group__4__Impl rule__For__Group__5 ;
    public final void rule__For__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2759:1: ( rule__For__Group__4__Impl rule__For__Group__5 )
            // InternalMyDsl.g:2760:2: rule__For__Group__4__Impl rule__For__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__For__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__For__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__4"


    // $ANTLR start "rule__For__Group__4__Impl"
    // InternalMyDsl.g:2767:1: rule__For__Group__4__Impl : ( ( rule__For__TableauAssignment_4 )* ) ;
    public final void rule__For__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2771:1: ( ( ( rule__For__TableauAssignment_4 )* ) )
            // InternalMyDsl.g:2772:1: ( ( rule__For__TableauAssignment_4 )* )
            {
            // InternalMyDsl.g:2772:1: ( ( rule__For__TableauAssignment_4 )* )
            // InternalMyDsl.g:2773:2: ( rule__For__TableauAssignment_4 )*
            {
             before(grammarAccess.getForAccess().getTableauAssignment_4()); 
            // InternalMyDsl.g:2774:2: ( rule__For__TableauAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:2774:3: rule__For__TableauAssignment_4
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__For__TableauAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getForAccess().getTableauAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__4__Impl"


    // $ANTLR start "rule__For__Group__5"
    // InternalMyDsl.g:2782:1: rule__For__Group__5 : rule__For__Group__5__Impl ;
    public final void rule__For__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2786:1: ( rule__For__Group__5__Impl )
            // InternalMyDsl.g:2787:2: rule__For__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__For__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__5"


    // $ANTLR start "rule__For__Group__5__Impl"
    // InternalMyDsl.g:2793:1: rule__For__Group__5__Impl : ( ']' ) ;
    public final void rule__For__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2797:1: ( ( ']' ) )
            // InternalMyDsl.g:2798:1: ( ']' )
            {
            // InternalMyDsl.g:2798:1: ( ']' )
            // InternalMyDsl.g:2799:2: ']'
            {
             before(grammarAccess.getForAccess().getRightSquareBracketKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getForAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__Group__5__Impl"


    // $ANTLR start "rule__EndFor__Group__0"
    // InternalMyDsl.g:2809:1: rule__EndFor__Group__0 : rule__EndFor__Group__0__Impl rule__EndFor__Group__1 ;
    public final void rule__EndFor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2813:1: ( rule__EndFor__Group__0__Impl rule__EndFor__Group__1 )
            // InternalMyDsl.g:2814:2: rule__EndFor__Group__0__Impl rule__EndFor__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EndFor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EndFor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndFor__Group__0"


    // $ANTLR start "rule__EndFor__Group__0__Impl"
    // InternalMyDsl.g:2821:1: rule__EndFor__Group__0__Impl : ( 'EndFor' ) ;
    public final void rule__EndFor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2825:1: ( ( 'EndFor' ) )
            // InternalMyDsl.g:2826:1: ( 'EndFor' )
            {
            // InternalMyDsl.g:2826:1: ( 'EndFor' )
            // InternalMyDsl.g:2827:2: 'EndFor'
            {
             before(grammarAccess.getEndForAccess().getEndForKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getEndForAccess().getEndForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndFor__Group__0__Impl"


    // $ANTLR start "rule__EndFor__Group__1"
    // InternalMyDsl.g:2836:1: rule__EndFor__Group__1 : rule__EndFor__Group__1__Impl ;
    public final void rule__EndFor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2840:1: ( rule__EndFor__Group__1__Impl )
            // InternalMyDsl.g:2841:2: rule__EndFor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EndFor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndFor__Group__1"


    // $ANTLR start "rule__EndFor__Group__1__Impl"
    // InternalMyDsl.g:2847:1: rule__EndFor__Group__1__Impl : ( ( rule__EndFor__NameAssignment_1 ) ) ;
    public final void rule__EndFor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2851:1: ( ( ( rule__EndFor__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2852:1: ( ( rule__EndFor__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2852:1: ( ( rule__EndFor__NameAssignment_1 ) )
            // InternalMyDsl.g:2853:2: ( rule__EndFor__NameAssignment_1 )
            {
             before(grammarAccess.getEndForAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2854:2: ( rule__EndFor__NameAssignment_1 )
            // InternalMyDsl.g:2854:3: rule__EndFor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EndFor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEndForAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndFor__Group__1__Impl"


    // $ANTLR start "rule__Test__NumberAssignment_1"
    // InternalMyDsl.g:2863:1: rule__Test__NumberAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Test__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2867:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2868:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2868:2: ( RULE_STRING )
            // InternalMyDsl.g:2869:3: RULE_STRING
            {
             before(grammarAccess.getTestAccess().getNumberSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getNumberSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__NumberAssignment_1"


    // $ANTLR start "rule__Test__BodyAssignment_3"
    // InternalMyDsl.g:2878:1: rule__Test__BodyAssignment_3 : ( ruleINSTRUCTION ) ;
    public final void rule__Test__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2882:1: ( ( ruleINSTRUCTION ) )
            // InternalMyDsl.g:2883:2: ( ruleINSTRUCTION )
            {
            // InternalMyDsl.g:2883:2: ( ruleINSTRUCTION )
            // InternalMyDsl.g:2884:3: ruleINSTRUCTION
            {
             before(grammarAccess.getTestAccess().getBodyINSTRUCTIONParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleINSTRUCTION();

            state._fsp--;

             after(grammarAccess.getTestAccess().getBodyINSTRUCTIONParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__BodyAssignment_3"


    // $ANTLR start "rule__Open__BrowserAssignment_1"
    // InternalMyDsl.g:2893:1: rule__Open__BrowserAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Open__BrowserAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2897:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2898:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2898:2: ( RULE_STRING )
            // InternalMyDsl.g:2899:3: RULE_STRING
            {
             before(grammarAccess.getOpenAccess().getBrowserSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOpenAccess().getBrowserSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Open__BrowserAssignment_1"


    // $ANTLR start "rule__GoTo__UrlAssignment_1"
    // InternalMyDsl.g:2908:1: rule__GoTo__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GoTo__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2912:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2913:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2913:2: ( RULE_STRING )
            // InternalMyDsl.g:2914:3: RULE_STRING
            {
             before(grammarAccess.getGoToAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getUrlSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__UrlAssignment_1"


    // $ANTLR start "rule__Contains__TypeAssignment_1"
    // InternalMyDsl.g:2923:1: rule__Contains__TypeAssignment_1 : ( ruleTYPE_CONTAINS ) ;
    public final void rule__Contains__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2927:1: ( ( ruleTYPE_CONTAINS ) )
            // InternalMyDsl.g:2928:2: ( ruleTYPE_CONTAINS )
            {
            // InternalMyDsl.g:2928:2: ( ruleTYPE_CONTAINS )
            // InternalMyDsl.g:2929:3: ruleTYPE_CONTAINS
            {
             before(grammarAccess.getContainsAccess().getTypeTYPE_CONTAINSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_CONTAINS();

            state._fsp--;

             after(grammarAccess.getContainsAccess().getTypeTYPE_CONTAINSParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__TypeAssignment_1"


    // $ANTLR start "rule__Contains__ParametreAssignment_2"
    // InternalMyDsl.g:2938:1: rule__Contains__ParametreAssignment_2 : ( ruleTYPE_PARAMETRE ) ;
    public final void rule__Contains__ParametreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2942:1: ( ( ruleTYPE_PARAMETRE ) )
            // InternalMyDsl.g:2943:2: ( ruleTYPE_PARAMETRE )
            {
            // InternalMyDsl.g:2943:2: ( ruleTYPE_PARAMETRE )
            // InternalMyDsl.g:2944:3: ruleTYPE_PARAMETRE
            {
             before(grammarAccess.getContainsAccess().getParametreTYPE_PARAMETREParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_PARAMETRE();

            state._fsp--;

             after(grammarAccess.getContainsAccess().getParametreTYPE_PARAMETREParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contains__ParametreAssignment_2"


    // $ANTLR start "rule__Value__ValueAssignment"
    // InternalMyDsl.g:2953:1: rule__Value__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__Value__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2957:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2958:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2958:2: ( RULE_STRING )
            // InternalMyDsl.g:2959:3: RULE_STRING
            {
             before(grammarAccess.getValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueAssignment"


    // $ANTLR start "rule__Var__ValueAssignment_1"
    // InternalMyDsl.g:2968:1: rule__Var__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__Var__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2972:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2973:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2973:2: ( RULE_ID )
            // InternalMyDsl.g:2974:3: RULE_ID
            {
             before(grammarAccess.getVarAccess().getValueIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getValueIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__ValueAssignment_1"


    // $ANTLR start "rule__Equal__Var1Assignment_2"
    // InternalMyDsl.g:2983:1: rule__Equal__Var1Assignment_2 : ( RULE_ID ) ;
    public final void rule__Equal__Var1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2987:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2988:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2988:2: ( RULE_ID )
            // InternalMyDsl.g:2989:3: RULE_ID
            {
             before(grammarAccess.getEqualAccess().getVar1IDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEqualAccess().getVar1IDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Var1Assignment_2"


    // $ANTLR start "rule__Equal__Var2Assignment_5"
    // InternalMyDsl.g:2998:1: rule__Equal__Var2Assignment_5 : ( RULE_ID ) ;
    public final void rule__Equal__Var2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3002:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3003:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3003:2: ( RULE_ID )
            // InternalMyDsl.g:3004:3: RULE_ID
            {
             before(grammarAccess.getEqualAccess().getVar2IDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEqualAccess().getVar2IDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Var2Assignment_5"


    // $ANTLR start "rule__Click__TypeAssignment_1"
    // InternalMyDsl.g:3013:1: rule__Click__TypeAssignment_1 : ( ruleTYPE_CLICK ) ;
    public final void rule__Click__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3017:1: ( ( ruleTYPE_CLICK ) )
            // InternalMyDsl.g:3018:2: ( ruleTYPE_CLICK )
            {
            // InternalMyDsl.g:3018:2: ( ruleTYPE_CLICK )
            // InternalMyDsl.g:3019:3: ruleTYPE_CLICK
            {
             before(grammarAccess.getClickAccess().getTypeTYPE_CLICKParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_CLICK();

            state._fsp--;

             after(grammarAccess.getClickAccess().getTypeTYPE_CLICKParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__TypeAssignment_1"


    // $ANTLR start "rule__Click__ParametreAssignment_2"
    // InternalMyDsl.g:3028:1: rule__Click__ParametreAssignment_2 : ( ruleTYPE_PARAMETRE ) ;
    public final void rule__Click__ParametreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3032:1: ( ( ruleTYPE_PARAMETRE ) )
            // InternalMyDsl.g:3033:2: ( ruleTYPE_PARAMETRE )
            {
            // InternalMyDsl.g:3033:2: ( ruleTYPE_PARAMETRE )
            // InternalMyDsl.g:3034:3: ruleTYPE_PARAMETRE
            {
             before(grammarAccess.getClickAccess().getParametreTYPE_PARAMETREParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_PARAMETRE();

            state._fsp--;

             after(grammarAccess.getClickAccess().getParametreTYPE_PARAMETREParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__ParametreAssignment_2"


    // $ANTLR start "rule__Insert__TypeAssignment_2"
    // InternalMyDsl.g:3043:1: rule__Insert__TypeAssignment_2 : ( ruleTYPE_INSERT ) ;
    public final void rule__Insert__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3047:1: ( ( ruleTYPE_INSERT ) )
            // InternalMyDsl.g:3048:2: ( ruleTYPE_INSERT )
            {
            // InternalMyDsl.g:3048:2: ( ruleTYPE_INSERT )
            // InternalMyDsl.g:3049:3: ruleTYPE_INSERT
            {
             before(grammarAccess.getInsertAccess().getTypeTYPE_INSERTParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_INSERT();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getTypeTYPE_INSERTParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__TypeAssignment_2"


    // $ANTLR start "rule__Insert__NameAssignment_3"
    // InternalMyDsl.g:3058:1: rule__Insert__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Insert__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3062:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3063:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3063:2: ( RULE_STRING )
            // InternalMyDsl.g:3064:3: RULE_STRING
            {
             before(grammarAccess.getInsertAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__NameAssignment_3"


    // $ANTLR start "rule__Insert__ParametreAssignment_5"
    // InternalMyDsl.g:3073:1: rule__Insert__ParametreAssignment_5 : ( ruleTYPE_PARAMETRE ) ;
    public final void rule__Insert__ParametreAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3077:1: ( ( ruleTYPE_PARAMETRE ) )
            // InternalMyDsl.g:3078:2: ( ruleTYPE_PARAMETRE )
            {
            // InternalMyDsl.g:3078:2: ( ruleTYPE_PARAMETRE )
            // InternalMyDsl.g:3079:3: ruleTYPE_PARAMETRE
            {
             before(grammarAccess.getInsertAccess().getParametreTYPE_PARAMETREParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_PARAMETRE();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getParametreTYPE_PARAMETREParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__ParametreAssignment_5"


    // $ANTLR start "rule__Uncheck__TypeAssignment_1"
    // InternalMyDsl.g:3088:1: rule__Uncheck__TypeAssignment_1 : ( ruleTYPE_CHECK_UNCHECK ) ;
    public final void rule__Uncheck__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3092:1: ( ( ruleTYPE_CHECK_UNCHECK ) )
            // InternalMyDsl.g:3093:2: ( ruleTYPE_CHECK_UNCHECK )
            {
            // InternalMyDsl.g:3093:2: ( ruleTYPE_CHECK_UNCHECK )
            // InternalMyDsl.g:3094:3: ruleTYPE_CHECK_UNCHECK
            {
             before(grammarAccess.getUncheckAccess().getTypeTYPE_CHECK_UNCHECKParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_CHECK_UNCHECK();

            state._fsp--;

             after(grammarAccess.getUncheckAccess().getTypeTYPE_CHECK_UNCHECKParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uncheck__TypeAssignment_1"


    // $ANTLR start "rule__TYPE_CHECK_UNCHECK__TableauAssignment_1_1"
    // InternalMyDsl.g:3103:1: rule__TYPE_CHECK_UNCHECK__TableauAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TYPE_CHECK_UNCHECK__TableauAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3107:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3108:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3108:2: ( RULE_STRING )
            // InternalMyDsl.g:3109:3: RULE_STRING
            {
             before(grammarAccess.getTYPE_CHECK_UNCHECKAccess().getTableauSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTYPE_CHECK_UNCHECKAccess().getTableauSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TYPE_CHECK_UNCHECK__TableauAssignment_1_1"


    // $ANTLR start "rule__Check__TypeAssignment_1"
    // InternalMyDsl.g:3118:1: rule__Check__TypeAssignment_1 : ( ruleTYPE_CHECK_UNCHECK ) ;
    public final void rule__Check__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3122:1: ( ( ruleTYPE_CHECK_UNCHECK ) )
            // InternalMyDsl.g:3123:2: ( ruleTYPE_CHECK_UNCHECK )
            {
            // InternalMyDsl.g:3123:2: ( ruleTYPE_CHECK_UNCHECK )
            // InternalMyDsl.g:3124:3: ruleTYPE_CHECK_UNCHECK
            {
             before(grammarAccess.getCheckAccess().getTypeTYPE_CHECK_UNCHECKParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_CHECK_UNCHECK();

            state._fsp--;

             after(grammarAccess.getCheckAccess().getTypeTYPE_CHECK_UNCHECKParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Check__TypeAssignment_1"


    // $ANTLR start "rule__Choose__TypeAssignment_1"
    // InternalMyDsl.g:3133:1: rule__Choose__TypeAssignment_1 : ( ruleTYPE_CHOOSE ) ;
    public final void rule__Choose__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3137:1: ( ( ruleTYPE_CHOOSE ) )
            // InternalMyDsl.g:3138:2: ( ruleTYPE_CHOOSE )
            {
            // InternalMyDsl.g:3138:2: ( ruleTYPE_CHOOSE )
            // InternalMyDsl.g:3139:3: ruleTYPE_CHOOSE
            {
             before(grammarAccess.getChooseAccess().getTypeTYPE_CHOOSEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_CHOOSE();

            state._fsp--;

             after(grammarAccess.getChooseAccess().getTypeTYPE_CHOOSEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__TypeAssignment_1"


    // $ANTLR start "rule__Choose__ParametreAssignment_2"
    // InternalMyDsl.g:3148:1: rule__Choose__ParametreAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Choose__ParametreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3152:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3153:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3153:2: ( RULE_STRING )
            // InternalMyDsl.g:3154:3: RULE_STRING
            {
             before(grammarAccess.getChooseAccess().getParametreSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChooseAccess().getParametreSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__ParametreAssignment_2"


    // $ANTLR start "rule__Choose__NameAssignment_4"
    // InternalMyDsl.g:3163:1: rule__Choose__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Choose__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3167:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3168:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3168:2: ( RULE_STRING )
            // InternalMyDsl.g:3169:3: RULE_STRING
            {
             before(grammarAccess.getChooseAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChooseAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choose__NameAssignment_4"


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // InternalMyDsl.g:3178:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3182:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3183:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3183:2: ( RULE_ID )
            // InternalMyDsl.g:3184:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_0"


    // $ANTLR start "rule__Variable__InstructionAssignment_2"
    // InternalMyDsl.g:3193:1: rule__Variable__InstructionAssignment_2 : ( ruleTYPE_INSTRUCTION ) ;
    public final void rule__Variable__InstructionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3197:1: ( ( ruleTYPE_INSTRUCTION ) )
            // InternalMyDsl.g:3198:2: ( ruleTYPE_INSTRUCTION )
            {
            // InternalMyDsl.g:3198:2: ( ruleTYPE_INSTRUCTION )
            // InternalMyDsl.g:3199:3: ruleTYPE_INSTRUCTION
            {
             before(grammarAccess.getVariableAccess().getInstructionTYPE_INSTRUCTIONParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_INSTRUCTION();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getInstructionTYPE_INSTRUCTIONParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__InstructionAssignment_2"


    // $ANTLR start "rule__Read__TypeAssignment_1"
    // InternalMyDsl.g:3208:1: rule__Read__TypeAssignment_1 : ( ruleTYPE_READ ) ;
    public final void rule__Read__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3212:1: ( ( ruleTYPE_READ ) )
            // InternalMyDsl.g:3213:2: ( ruleTYPE_READ )
            {
            // InternalMyDsl.g:3213:2: ( ruleTYPE_READ )
            // InternalMyDsl.g:3214:3: ruleTYPE_READ
            {
             before(grammarAccess.getReadAccess().getTypeTYPE_READParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_READ();

            state._fsp--;

             after(grammarAccess.getReadAccess().getTypeTYPE_READParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__TypeAssignment_1"


    // $ANTLR start "rule__Read__ParametreAssignment_3"
    // InternalMyDsl.g:3223:1: rule__Read__ParametreAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Read__ParametreAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3227:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3228:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3228:2: ( RULE_STRING )
            // InternalMyDsl.g:3229:3: RULE_STRING
            {
             before(grammarAccess.getReadAccess().getParametreSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReadAccess().getParametreSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Read__ParametreAssignment_3"


    // $ANTLR start "rule__Count__ParametreAssignment_1"
    // InternalMyDsl.g:3238:1: rule__Count__ParametreAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Count__ParametreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3242:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3243:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3243:2: ( RULE_STRING )
            // InternalMyDsl.g:3244:3: RULE_STRING
            {
             before(grammarAccess.getCountAccess().getParametreSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCountAccess().getParametreSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Count__ParametreAssignment_1"


    // $ANTLR start "rule__Paste__TypeAssignment_1"
    // InternalMyDsl.g:3253:1: rule__Paste__TypeAssignment_1 : ( ruleTYPE_PASTE ) ;
    public final void rule__Paste__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3257:1: ( ( ruleTYPE_PASTE ) )
            // InternalMyDsl.g:3258:2: ( ruleTYPE_PASTE )
            {
            // InternalMyDsl.g:3258:2: ( ruleTYPE_PASTE )
            // InternalMyDsl.g:3259:3: ruleTYPE_PASTE
            {
             before(grammarAccess.getPasteAccess().getTypeTYPE_PASTEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTYPE_PASTE();

            state._fsp--;

             after(grammarAccess.getPasteAccess().getTypeTYPE_PASTEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__TypeAssignment_1"


    // $ANTLR start "rule__Paste__ParametreAssignment_3"
    // InternalMyDsl.g:3268:1: rule__Paste__ParametreAssignment_3 : ( RULE_ID ) ;
    public final void rule__Paste__ParametreAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3272:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3273:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3273:2: ( RULE_ID )
            // InternalMyDsl.g:3274:3: RULE_ID
            {
             before(grammarAccess.getPasteAccess().getParametreIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPasteAccess().getParametreIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paste__ParametreAssignment_3"


    // $ANTLR start "rule__For__NameAssignment_1"
    // InternalMyDsl.g:3283:1: rule__For__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__For__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3287:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3288:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3288:2: ( RULE_ID )
            // InternalMyDsl.g:3289:3: RULE_ID
            {
             before(grammarAccess.getForAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__NameAssignment_1"


    // $ANTLR start "rule__For__TableauAssignment_4"
    // InternalMyDsl.g:3298:1: rule__For__TableauAssignment_4 : ( RULE_STRING ) ;
    public final void rule__For__TableauAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3302:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3303:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3303:2: ( RULE_STRING )
            // InternalMyDsl.g:3304:3: RULE_STRING
            {
             before(grammarAccess.getForAccess().getTableauSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getForAccess().getTableauSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__For__TableauAssignment_4"


    // $ANTLR start "rule__EndFor__NameAssignment_1"
    // InternalMyDsl.g:3313:1: rule__EndFor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EndFor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3317:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3318:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3318:2: ( RULE_ID )
            // InternalMyDsl.g:3319:3: RULE_ID
            {
             before(grammarAccess.getEndForAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEndForAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EndFor__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00001EB261E00020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00001EB261C00022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});

}
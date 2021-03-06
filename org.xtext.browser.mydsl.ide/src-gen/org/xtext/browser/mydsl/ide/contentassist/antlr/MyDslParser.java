/*
 * generated by Xtext 2.15.0
 */
package org.xtext.browser.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.browser.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.browser.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getINSTRUCTIONAccess().getAlternatives(), "rule__INSTRUCTION__Alternatives");
			builder.put(grammarAccess.getTYPE_VERIFYAccess().getAlternatives(), "rule__TYPE_VERIFY__Alternatives");
			builder.put(grammarAccess.getTYPE_CONTAINSAccess().getAlternatives(), "rule__TYPE_CONTAINS__Alternatives");
			builder.put(grammarAccess.getTYPE_PARAMETREAccess().getAlternatives(), "rule__TYPE_PARAMETRE__Alternatives");
			builder.put(grammarAccess.getTYPE_CLICKAccess().getAlternatives(), "rule__TYPE_CLICK__Alternatives");
			builder.put(grammarAccess.getTYPE_CHECK_UNCHECKAccess().getAlternatives(), "rule__TYPE_CHECK_UNCHECK__Alternatives");
			builder.put(grammarAccess.getTYPE_INSTRUCTIONAccess().getAlternatives(), "rule__TYPE_INSTRUCTION__Alternatives");
			builder.put(grammarAccess.getTYPE_READAccess().getAlternatives(), "rule__TYPE_READ__Alternatives");
			builder.put(grammarAccess.getTestAccess().getGroup(), "rule__Test__Group__0");
			builder.put(grammarAccess.getOpenAccess().getGroup(), "rule__Open__Group__0");
			builder.put(grammarAccess.getGoToAccess().getGroup(), "rule__GoTo__Group__0");
			builder.put(grammarAccess.getVerifyAccess().getGroup(), "rule__Verify__Group__0");
			builder.put(grammarAccess.getContainsAccess().getGroup(), "rule__Contains__Group__0");
			builder.put(grammarAccess.getVarAccess().getGroup(), "rule__Var__Group__0");
			builder.put(grammarAccess.getEqualAccess().getGroup(), "rule__Equal__Group__0");
			builder.put(grammarAccess.getClickAccess().getGroup(), "rule__Click__Group__0");
			builder.put(grammarAccess.getInsertAccess().getGroup(), "rule__Insert__Group__0");
			builder.put(grammarAccess.getUncheckAccess().getGroup(), "rule__Uncheck__Group__0");
			builder.put(grammarAccess.getTYPE_CHECK_UNCHECKAccess().getGroup_1(), "rule__TYPE_CHECK_UNCHECK__Group_1__0");
			builder.put(grammarAccess.getCheckAccess().getGroup(), "rule__Check__Group__0");
			builder.put(grammarAccess.getChooseAccess().getGroup(), "rule__Choose__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getReadAccess().getGroup(), "rule__Read__Group__0");
			builder.put(grammarAccess.getCountAccess().getGroup(), "rule__Count__Group__0");
			builder.put(grammarAccess.getPasteAccess().getGroup(), "rule__Paste__Group__0");
			builder.put(grammarAccess.getForAccess().getGroup(), "rule__For__Group__0");
			builder.put(grammarAccess.getEndForAccess().getGroup(), "rule__EndFor__Group__0");
			builder.put(grammarAccess.getTestAccess().getNumberAssignment_1(), "rule__Test__NumberAssignment_1");
			builder.put(grammarAccess.getTestAccess().getBodyAssignment_3(), "rule__Test__BodyAssignment_3");
			builder.put(grammarAccess.getOpenAccess().getBrowserAssignment_1(), "rule__Open__BrowserAssignment_1");
			builder.put(grammarAccess.getGoToAccess().getUrlAssignment_1(), "rule__GoTo__UrlAssignment_1");
			builder.put(grammarAccess.getContainsAccess().getTypeAssignment_1(), "rule__Contains__TypeAssignment_1");
			builder.put(grammarAccess.getContainsAccess().getParametreAssignment_2(), "rule__Contains__ParametreAssignment_2");
			builder.put(grammarAccess.getValueAccess().getValueAssignment(), "rule__Value__ValueAssignment");
			builder.put(grammarAccess.getVarAccess().getValueAssignment_1(), "rule__Var__ValueAssignment_1");
			builder.put(grammarAccess.getEqualAccess().getVar1Assignment_2(), "rule__Equal__Var1Assignment_2");
			builder.put(grammarAccess.getEqualAccess().getVar2Assignment_5(), "rule__Equal__Var2Assignment_5");
			builder.put(grammarAccess.getClickAccess().getTypeAssignment_1(), "rule__Click__TypeAssignment_1");
			builder.put(grammarAccess.getClickAccess().getParametreAssignment_2(), "rule__Click__ParametreAssignment_2");
			builder.put(grammarAccess.getInsertAccess().getTypeAssignment_2(), "rule__Insert__TypeAssignment_2");
			builder.put(grammarAccess.getInsertAccess().getNameAssignment_3(), "rule__Insert__NameAssignment_3");
			builder.put(grammarAccess.getInsertAccess().getParametreAssignment_5(), "rule__Insert__ParametreAssignment_5");
			builder.put(grammarAccess.getUncheckAccess().getTypeAssignment_1(), "rule__Uncheck__TypeAssignment_1");
			builder.put(grammarAccess.getTYPE_CHECK_UNCHECKAccess().getTableauAssignment_1_1(), "rule__TYPE_CHECK_UNCHECK__TableauAssignment_1_1");
			builder.put(grammarAccess.getCheckAccess().getTypeAssignment_1(), "rule__Check__TypeAssignment_1");
			builder.put(grammarAccess.getChooseAccess().getTypeAssignment_1(), "rule__Choose__TypeAssignment_1");
			builder.put(grammarAccess.getChooseAccess().getParametreAssignment_2(), "rule__Choose__ParametreAssignment_2");
			builder.put(grammarAccess.getChooseAccess().getNameAssignment_4(), "rule__Choose__NameAssignment_4");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_0(), "rule__Variable__NameAssignment_0");
			builder.put(grammarAccess.getVariableAccess().getInstructionAssignment_2(), "rule__Variable__InstructionAssignment_2");
			builder.put(grammarAccess.getReadAccess().getTypeAssignment_1(), "rule__Read__TypeAssignment_1");
			builder.put(grammarAccess.getReadAccess().getParametreAssignment_3(), "rule__Read__ParametreAssignment_3");
			builder.put(grammarAccess.getCountAccess().getParametreAssignment_1(), "rule__Count__ParametreAssignment_1");
			builder.put(grammarAccess.getPasteAccess().getTypeAssignment_1(), "rule__Paste__TypeAssignment_1");
			builder.put(grammarAccess.getPasteAccess().getParametreAssignment_3(), "rule__Paste__ParametreAssignment_3");
			builder.put(grammarAccess.getForAccess().getNameAssignment_1(), "rule__For__NameAssignment_1");
			builder.put(grammarAccess.getForAccess().getTableauAssignment_4(), "rule__For__TableauAssignment_4");
			builder.put(grammarAccess.getEndForAccess().getNameAssignment_1(), "rule__EndFor__NameAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

/*
 * generated by Xtext 2.38.0
 */
package eu.coresense.variability.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import eu.coresense.variability.ide.contentassist.antlr.internal.InternalVariabilityParser;
import eu.coresense.variability.services.VariabilityGrammarAccess;
import java.util.Map;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class VariabilityParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(VariabilityGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, VariabilityGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getRosSystemAccess().getAlternatives_4(), "rule__RosSystem__Alternatives_4");
			builder.put(grammarAccess.getInterfaceReferenceAccess().getAlternatives(), "rule__InterfaceReference__Alternatives");
			builder.put(grammarAccess.getConnectionAccess().getAlternatives(), "rule__Connection__Alternatives");
			builder.put(grammarAccess.getRosConnectionAccess().getAlternatives(), "rule__RosConnection__Alternatives");
			builder.put(grammarAccess.getNamespaceAccess().getAlternatives(), "rule__Namespace__Alternatives");
			builder.put(grammarAccess.getRosParamNamesAccess().getAlternatives(), "rule__RosParamNames__Alternatives");
			builder.put(grammarAccess.getParameterTypeAccess().getAlternatives(), "rule__ParameterType__Alternatives");
			builder.put(grammarAccess.getParameterValueAccess().getAlternatives(), "rule__ParameterValue__Alternatives");
			builder.put(grammarAccess.getMessagePartAccess().getDataAlternatives_1_0(), "rule__MessagePart__DataAlternatives_1_0");
			builder.put(grammarAccess.getAbstractTypeAccess().getAlternatives(), "rule__AbstractType__Alternatives");
			builder.put(grammarAccess.getKEYWORDAccess().getAlternatives(), "rule__KEYWORD__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getRosNamesAccess().getAlternatives(), "rule__RosNames__Alternatives");
			builder.put(grammarAccess.getRosSystemAccess().getGroup(), "rule__RosSystem__Group__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_3(), "rule__RosSystem__Group_3__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_4_0(), "rule__RosSystem__Group_4_0__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_4_1(), "rule__RosSystem__Group_4_1__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_4_2(), "rule__RosSystem__Group_4_2__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_4_3(), "rule__RosSystem__Group_4_3__0");
			builder.put(grammarAccess.getRosSystemAccess().getGroup_4_4(), "rule__RosSystem__Group_4_4__0");
			builder.put(grammarAccess.getRosParameterAccess().getGroup(), "rule__RosParameter__Group__0");
			builder.put(grammarAccess.getRosParameterAccess().getGroup_6(), "rule__RosParameter__Group_6__0");
			builder.put(grammarAccess.getRosParameterAccess().getGroup_6_2(), "rule__RosParameter__Group_6_2__0");
			builder.put(grammarAccess.getProcessAccess().getGroup(), "rule__Process__Group__0");
			builder.put(grammarAccess.getProcessAccess().getGroup_4(), "rule__Process__Group_4__0");
			builder.put(grammarAccess.getProcessAccess().getGroup_4_3(), "rule__Process__Group_4_3__0");
			builder.put(grammarAccess.getProcessAccess().getGroup_5(), "rule__Process__Group_5__0");
			builder.put(grammarAccess.getRosNodeAccess().getGroup(), "rule__RosNode__Group__0");
			builder.put(grammarAccess.getRosNodeAccess().getGroup_6(), "rule__RosNode__Group_6__0");
			builder.put(grammarAccess.getRosNodeAccess().getGroup_7(), "rule__RosNode__Group_7__0");
			builder.put(grammarAccess.getRosNodeAccess().getGroup_8(), "rule__RosNode__Group_8__0");
			builder.put(grammarAccess.getRosInterfaceAccess().getGroup(), "rule__RosInterface__Group__0");
			builder.put(grammarAccess.getRosPublisherReferenceAccess().getGroup(), "rule__RosPublisherReference__Group__0");
			builder.put(grammarAccess.getRosSubscriberReferenceAccess().getGroup(), "rule__RosSubscriberReference__Group__0");
			builder.put(grammarAccess.getRosServiceServerReferenceAccess().getGroup(), "rule__RosServiceServerReference__Group__0");
			builder.put(grammarAccess.getRosServerClientReferenceAccess().getGroup(), "rule__RosServerClientReference__Group__0");
			builder.put(grammarAccess.getRosActionServerReferenceAccess().getGroup(), "rule__RosActionServerReference__Group__0");
			builder.put(grammarAccess.getRosActionClientReferenceAccess().getGroup(), "rule__RosActionClientReference__Group__0");
			builder.put(grammarAccess.getRosSystemConnectionAccess().getGroup(), "rule__RosSystemConnection__Group__0");
			builder.put(grammarAccess.getRosTopicConnectionAccess().getGroup(), "rule__RosTopicConnection__Group__0");
			builder.put(grammarAccess.getRosServiceConnectionAccess().getGroup(), "rule__RosServiceConnection__Group__0");
			builder.put(grammarAccess.getRosActionConnectionAccess().getGroup(), "rule__RosActionConnection__Group__0");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getGroup(), "rule__GlobalNamespace__Group__0");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getGroup_2(), "rule__GlobalNamespace__Group_2__0");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getGroup_2_2(), "rule__GlobalNamespace__Group_2_2__0");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup(), "rule__RelativeNamespace_Impl__Group__0");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2(), "rule__RelativeNamespace_Impl__Group_2__0");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2_2(), "rule__RelativeNamespace_Impl__Group_2_2__0");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getGroup(), "rule__PrivateNamespace__Group__0");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getGroup_2(), "rule__PrivateNamespace__Group_2__0");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getGroup_2_2(), "rule__PrivateNamespace__Group_2_2__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_4(), "rule__Parameter__Group_4__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_7(), "rule__Parameter__Group_7__0");
			builder.put(grammarAccess.getParameterListTypeAccess().getGroup(), "rule__ParameterListType__Group__0");
			builder.put(grammarAccess.getParameterListTypeAccess().getGroup_4(), "rule__ParameterListType__Group_4__0");
			builder.put(grammarAccess.getParameterStructTypeAccess().getGroup(), "rule__ParameterStructType__Group__0");
			builder.put(grammarAccess.getParameterStructTypeAccess().getGroup_4(), "rule__ParameterStructType__Group_4__0");
			builder.put(grammarAccess.getParameterIntegerTypeAccess().getGroup(), "rule__ParameterIntegerType__Group__0");
			builder.put(grammarAccess.getParameterIntegerTypeAccess().getGroup_2(), "rule__ParameterIntegerType__Group_2__0");
			builder.put(grammarAccess.getParameterStringTypeAccess().getGroup(), "rule__ParameterStringType__Group__0");
			builder.put(grammarAccess.getParameterStringTypeAccess().getGroup_2(), "rule__ParameterStringType__Group_2__0");
			builder.put(grammarAccess.getParameterDoubleTypeAccess().getGroup(), "rule__ParameterDoubleType__Group__0");
			builder.put(grammarAccess.getParameterDoubleTypeAccess().getGroup_2(), "rule__ParameterDoubleType__Group_2__0");
			builder.put(grammarAccess.getParameterDateTypeAccess().getGroup(), "rule__ParameterDateType__Group__0");
			builder.put(grammarAccess.getParameterDateTypeAccess().getGroup_2(), "rule__ParameterDateType__Group_2__0");
			builder.put(grammarAccess.getParameterBooleanTypeAccess().getGroup(), "rule__ParameterBooleanType__Group__0");
			builder.put(grammarAccess.getParameterBooleanTypeAccess().getGroup_2(), "rule__ParameterBooleanType__Group_2__0");
			builder.put(grammarAccess.getParameterBase64TypeAccess().getGroup(), "rule__ParameterBase64Type__Group__0");
			builder.put(grammarAccess.getParameterBase64TypeAccess().getGroup_2(), "rule__ParameterBase64Type__Group_2__0");
			builder.put(grammarAccess.getParameterAnyTypeAccess().getGroup(), "rule__ParameterAnyType__Group__0");
			builder.put(grammarAccess.getParameterAnyTypeAccess().getGroup_2(), "rule__ParameterAnyType__Group_2__0");
			builder.put(grammarAccess.getParameterArrayTypeAccess().getGroup(), "rule__ParameterArrayType__Group__0");
			builder.put(grammarAccess.getParameterArrayTypeAccess().getGroup_4(), "rule__ParameterArrayType__Group_4__0");
			builder.put(grammarAccess.getParameterListAccess().getGroup(), "rule__ParameterList__Group__0");
			builder.put(grammarAccess.getParameterListAccess().getGroup_3(), "rule__ParameterList__Group_3__0");
			builder.put(grammarAccess.getParameterAnyAccess().getGroup(), "rule__ParameterAny__Group__0");
			builder.put(grammarAccess.getParameterAnyAccess().getGroup_2(), "rule__ParameterAny__Group_2__0");
			builder.put(grammarAccess.getParameterStructAccess().getGroup(), "rule__ParameterStruct__Group__0");
			builder.put(grammarAccess.getParameterStructAccess().getGroup_1(), "rule__ParameterStruct__Group_1__0");
			builder.put(grammarAccess.getParameterStructMemberAccess().getGroup(), "rule__ParameterStructMember__Group__0");
			builder.put(grammarAccess.getParameterStructTypeMemberAccess().getGroup(), "rule__ParameterStructTypeMember__Group__0");
			builder.put(grammarAccess.getMessagePartAccess().getGroup(), "rule__MessagePart__Group__0");
			builder.put(grammarAccess.getBoolAccess().getGroup(), "rule__Bool__Group__0");
			builder.put(grammarAccess.getInt8Access().getGroup(), "rule__Int8__Group__0");
			builder.put(grammarAccess.getUint8Access().getGroup(), "rule__Uint8__Group__0");
			builder.put(grammarAccess.getInt16Access().getGroup(), "rule__Int16__Group__0");
			builder.put(grammarAccess.getUint16Access().getGroup(), "rule__Uint16__Group__0");
			builder.put(grammarAccess.getInt32Access().getGroup(), "rule__Int32__Group__0");
			builder.put(grammarAccess.getUint32Access().getGroup(), "rule__Uint32__Group__0");
			builder.put(grammarAccess.getInt64Access().getGroup(), "rule__Int64__Group__0");
			builder.put(grammarAccess.getUint64Access().getGroup(), "rule__Uint64__Group__0");
			builder.put(grammarAccess.getFloat32Access().getGroup(), "rule__Float32__Group__0");
			builder.put(grammarAccess.getFloat64Access().getGroup(), "rule__Float64__Group__0");
			builder.put(grammarAccess.getString0Access().getGroup(), "rule__String0__Group__0");
			builder.put(grammarAccess.getCharAccess().getGroup(), "rule__Char__Group__0");
			builder.put(grammarAccess.getByteAccess().getGroup(), "rule__Byte__Group__0");
			builder.put(grammarAccess.getTimeAccess().getGroup(), "rule__Time__Group__0");
			builder.put(grammarAccess.getDurationAccess().getGroup(), "rule__Duration__Group__0");
			builder.put(grammarAccess.getBoolArrayAccess().getGroup(), "rule__BoolArray__Group__0");
			builder.put(grammarAccess.getInt8ArrayAccess().getGroup(), "rule__Int8Array__Group__0");
			builder.put(grammarAccess.getUint8ArrayAccess().getGroup(), "rule__Uint8Array__Group__0");
			builder.put(grammarAccess.getInt16ArrayAccess().getGroup(), "rule__Int16Array__Group__0");
			builder.put(grammarAccess.getUint16ArrayAccess().getGroup(), "rule__Uint16Array__Group__0");
			builder.put(grammarAccess.getInt32ArrayAccess().getGroup(), "rule__Int32Array__Group__0");
			builder.put(grammarAccess.getUint32ArrayAccess().getGroup(), "rule__Uint32Array__Group__0");
			builder.put(grammarAccess.getInt64ArrayAccess().getGroup(), "rule__Int64Array__Group__0");
			builder.put(grammarAccess.getUint64ArrayAccess().getGroup(), "rule__Uint64Array__Group__0");
			builder.put(grammarAccess.getFloat32ArrayAccess().getGroup(), "rule__Float32Array__Group__0");
			builder.put(grammarAccess.getFloat64ArrayAccess().getGroup(), "rule__Float64Array__Group__0");
			builder.put(grammarAccess.getString0ArrayAccess().getGroup(), "rule__String0Array__Group__0");
			builder.put(grammarAccess.getByteArrayAccess().getGroup(), "rule__ByteArray__Group__0");
			builder.put(grammarAccess.getCharArrayAccess().getGroup(), "rule__CharArray__Group__0");
			builder.put(grammarAccess.getHeaderAccess().getGroup(), "rule__Header__Group__0");
			builder.put(grammarAccess.getArraySpecRefAccess().getGroup(), "rule__ArraySpecRef__Group__0");
			builder.put(grammarAccess.getRosSystemAccess().getNameAssignment_0(), "rule__RosSystem__NameAssignment_0");
			builder.put(grammarAccess.getRosSystemAccess().getFromFileAssignment_3_1(), "rule__RosSystem__FromFileAssignment_3_1");
			builder.put(grammarAccess.getRosSystemAccess().getComponentsAssignment_4_0_2(), "rule__RosSystem__ComponentsAssignment_4_0_2");
			builder.put(grammarAccess.getRosSystemAccess().getProcessesAssignment_4_1_2(), "rule__RosSystem__ProcessesAssignment_4_1_2");
			builder.put(grammarAccess.getRosSystemAccess().getComponentsAssignment_4_2_2(), "rule__RosSystem__ComponentsAssignment_4_2_2");
			builder.put(grammarAccess.getRosSystemAccess().getParameterAssignment_4_3_2(), "rule__RosSystem__ParameterAssignment_4_3_2");
			builder.put(grammarAccess.getRosSystemAccess().getConnectionsAssignment_4_4_2(), "rule__RosSystem__ConnectionsAssignment_4_4_2");
			builder.put(grammarAccess.getRosParameterAccess().getNameAssignment_1(), "rule__RosParameter__NameAssignment_1");
			builder.put(grammarAccess.getRosParameterAccess().getFromAssignment_3(), "rule__RosParameter__FromAssignment_3");
			builder.put(grammarAccess.getRosParameterAccess().getValueAssignment_6_1(), "rule__RosParameter__ValueAssignment_6_1");
			builder.put(grammarAccess.getRosParameterAccess().getValueAssignment_6_2_1(), "rule__RosParameter__ValueAssignment_6_2_1");
			builder.put(grammarAccess.getSubSystemAccess().getSystemAssignment(), "rule__SubSystem__SystemAssignment");
			builder.put(grammarAccess.getProcessAccess().getNameAssignment_1(), "rule__Process__NameAssignment_1");
			builder.put(grammarAccess.getProcessAccess().getComponentsAssignment_4_2(), "rule__Process__ComponentsAssignment_4_2");
			builder.put(grammarAccess.getProcessAccess().getComponentsAssignment_4_3_1(), "rule__Process__ComponentsAssignment_4_3_1");
			builder.put(grammarAccess.getProcessAccess().getThreadsAssignment_5_1(), "rule__Process__ThreadsAssignment_5_1");
			builder.put(grammarAccess.getRosNodeAccess().getNameAssignment_1(), "rule__RosNode__NameAssignment_1");
			builder.put(grammarAccess.getRosNodeAccess().getFromAssignment_5(), "rule__RosNode__FromAssignment_5");
			builder.put(grammarAccess.getRosNodeAccess().getNamespaceAssignment_6_1(), "rule__RosNode__NamespaceAssignment_6_1");
			builder.put(grammarAccess.getRosNodeAccess().getRosinterfacesAssignment_7_2(), "rule__RosNode__RosinterfacesAssignment_7_2");
			builder.put(grammarAccess.getRosNodeAccess().getRosparametersAssignment_8_2(), "rule__RosNode__RosparametersAssignment_8_2");
			builder.put(grammarAccess.getRosInterfaceAccess().getNameAssignment_1(), "rule__RosInterface__NameAssignment_1");
			builder.put(grammarAccess.getRosInterfaceAccess().getReferenceAssignment_3(), "rule__RosInterface__ReferenceAssignment_3");
			builder.put(grammarAccess.getRosPublisherReferenceAccess().getFromAssignment_2(), "rule__RosPublisherReference__FromAssignment_2");
			builder.put(grammarAccess.getRosSubscriberReferenceAccess().getFromAssignment_2(), "rule__RosSubscriberReference__FromAssignment_2");
			builder.put(grammarAccess.getRosServiceServerReferenceAccess().getFromAssignment_2(), "rule__RosServiceServerReference__FromAssignment_2");
			builder.put(grammarAccess.getRosServerClientReferenceAccess().getFromAssignment_2(), "rule__RosServerClientReference__FromAssignment_2");
			builder.put(grammarAccess.getRosActionServerReferenceAccess().getFromAssignment_2(), "rule__RosActionServerReference__FromAssignment_2");
			builder.put(grammarAccess.getRosActionClientReferenceAccess().getFromAssignment_2(), "rule__RosActionClientReference__FromAssignment_2");
			builder.put(grammarAccess.getRosSystemConnectionAccess().getFromAssignment_2(), "rule__RosSystemConnection__FromAssignment_2");
			builder.put(grammarAccess.getRosSystemConnectionAccess().getToAssignment_4(), "rule__RosSystemConnection__ToAssignment_4");
			builder.put(grammarAccess.getRosTopicConnectionAccess().getFromAssignment_2(), "rule__RosTopicConnection__FromAssignment_2");
			builder.put(grammarAccess.getRosTopicConnectionAccess().getToAssignment_4(), "rule__RosTopicConnection__ToAssignment_4");
			builder.put(grammarAccess.getRosServiceConnectionAccess().getFromAssignment_2(), "rule__RosServiceConnection__FromAssignment_2");
			builder.put(grammarAccess.getRosServiceConnectionAccess().getToAssignment_4(), "rule__RosServiceConnection__ToAssignment_4");
			builder.put(grammarAccess.getRosActionConnectionAccess().getFromAssignment_2(), "rule__RosActionConnection__FromAssignment_2");
			builder.put(grammarAccess.getRosActionConnectionAccess().getToAssignment_4(), "rule__RosActionConnection__ToAssignment_4");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_1(), "rule__GlobalNamespace__PartsAssignment_2_1");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_2_1(), "rule__GlobalNamespace__PartsAssignment_2_2_1");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_1(), "rule__RelativeNamespace_Impl__PartsAssignment_2_1");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_2_1(), "rule__RelativeNamespace_Impl__PartsAssignment_2_2_1");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_1(), "rule__PrivateNamespace__PartsAssignment_2_1");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_2_1(), "rule__PrivateNamespace__PartsAssignment_2_2_1");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
			builder.put(grammarAccess.getParameterAccess().getNamespaceAssignment_4_1(), "rule__Parameter__NamespaceAssignment_4_1");
			builder.put(grammarAccess.getParameterAccess().getTypeAssignment_6(), "rule__Parameter__TypeAssignment_6");
			builder.put(grammarAccess.getParameterAccess().getValueAssignment_7_1(), "rule__Parameter__ValueAssignment_7_1");
			builder.put(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_3(), "rule__ParameterListType__SequenceAssignment_3");
			builder.put(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_4_1(), "rule__ParameterListType__SequenceAssignment_4_1");
			builder.put(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_3(), "rule__ParameterStructType__ParameterstructypetmemberAssignment_3");
			builder.put(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_4_1(), "rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1");
			builder.put(grammarAccess.getParameterIntegerTypeAccess().getDefaultAssignment_2_1(), "rule__ParameterIntegerType__DefaultAssignment_2_1");
			builder.put(grammarAccess.getParameterStringTypeAccess().getDefaultAssignment_2_1(), "rule__ParameterStringType__DefaultAssignment_2_1");
			builder.put(grammarAccess.getParameterDoubleTypeAccess().getDefaultAssignment_2_1(), "rule__ParameterDoubleType__DefaultAssignment_2_1");
			builder.put(grammarAccess.getParameterDateTypeAccess().getDefaultAssignment_2_1(), "rule__ParameterDateType__DefaultAssignment_2_1");
			builder.put(grammarAccess.getParameterBooleanTypeAccess().getDefaultAssignment_2_1(), "rule__ParameterBooleanType__DefaultAssignment_2_1");
			builder.put(grammarAccess.getParameterBase64TypeAccess().getDefaultAssignment_2_1(), "rule__ParameterBase64Type__DefaultAssignment_2_1");
			builder.put(grammarAccess.getParameterAnyTypeAccess().getDefaultAssignment_2_1(), "rule__ParameterAnyType__DefaultAssignment_2_1");
			builder.put(grammarAccess.getParameterArrayTypeAccess().getTypeAssignment_2(), "rule__ParameterArrayType__TypeAssignment_2");
			builder.put(grammarAccess.getParameterArrayTypeAccess().getDefaultAssignment_4_1(), "rule__ParameterArrayType__DefaultAssignment_4_1");
			builder.put(grammarAccess.getParameterListAccess().getValueAssignment_2(), "rule__ParameterList__ValueAssignment_2");
			builder.put(grammarAccess.getParameterListAccess().getValueAssignment_3_1(), "rule__ParameterList__ValueAssignment_3_1");
			builder.put(grammarAccess.getParameterAnyAccess().getValueAssignment_2_1(), "rule__ParameterAny__ValueAssignment_2_1");
			builder.put(grammarAccess.getParameterStringAccess().getValueAssignment(), "rule__ParameterString__ValueAssignment");
			builder.put(grammarAccess.getParameterBase64Access().getValueAssignment(), "rule__ParameterBase64__ValueAssignment");
			builder.put(grammarAccess.getParameterIntegerAccess().getValueAssignment(), "rule__ParameterInteger__ValueAssignment");
			builder.put(grammarAccess.getParameterDoubleAccess().getValueAssignment(), "rule__ParameterDouble__ValueAssignment");
			builder.put(grammarAccess.getParameterBooleanAccess().getValueAssignment(), "rule__ParameterBoolean__ValueAssignment");
			builder.put(grammarAccess.getParameterStructAccess().getValueAssignment_1_2(), "rule__ParameterStruct__ValueAssignment_1_2");
			builder.put(grammarAccess.getParameterDateAccess().getValueAssignment(), "rule__ParameterDate__ValueAssignment");
			builder.put(grammarAccess.getParameterStructMemberAccess().getNameAssignment_0(), "rule__ParameterStructMember__NameAssignment_0");
			builder.put(grammarAccess.getParameterStructMemberAccess().getValueAssignment_2(), "rule__ParameterStructMember__ValueAssignment_2");
			builder.put(grammarAccess.getParameterStructTypeMemberAccess().getNameAssignment_0(), "rule__ParameterStructTypeMember__NameAssignment_0");
			builder.put(grammarAccess.getParameterStructTypeMemberAccess().getTypeAssignment_1(), "rule__ParameterStructTypeMember__TypeAssignment_1");
			builder.put(grammarAccess.getMessagePartAccess().getTypeAssignment_0(), "rule__MessagePart__TypeAssignment_0");
			builder.put(grammarAccess.getMessagePartAccess().getDataAssignment_1(), "rule__MessagePart__DataAssignment_1");
			builder.put(grammarAccess.getSpecBaseRefAccess().getReferenceAssignment(), "rule__SpecBaseRef__ReferenceAssignment");
			builder.put(grammarAccess.getArraySpecRefAccess().getReferenceAssignment_0(), "rule__ArraySpecRef__ReferenceAssignment_0");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private VariabilityGrammarAccess grammarAccess;

	@Override
	protected InternalVariabilityParser createParser() {
		InternalVariabilityParser result = new InternalVariabilityParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new VariabilityTokenSource(super.createLexer(stream));
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public VariabilityGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VariabilityGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

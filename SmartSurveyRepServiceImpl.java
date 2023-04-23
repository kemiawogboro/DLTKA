// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartsurveyrep.proto

package grpc.examples.smartsurvey;

public final class SmartSurveyRepServiceImpl {
  private SmartSurveyRepServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartsurvey_reportRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartsurvey_reportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartsurvey_reportResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartsurvey_reportResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024smartsurveyrep.proto\022\013smartsurvey\".\n\rr" +
      "eportRequest\022\016\n\006motion\030\001 \001(\t\022\r\n\005noise\030\003 " +
      "\001(\t\" \n\016reportResponse\022\016\n\006notice\030\001 \001(\t2\224\001" +
      "\n\006Report\022D\n\005alert\022\032.smartsurvey.reportRe" +
      "quest\032\033.smartsurvey.reportResponse\"\000(\001\022D" +
      "\n\005alarm\022\032.smartsurvey.reportRequest\032\033.sm" +
      "artsurvey.reportResponse\"\0000\001B8\n\031grpc.exa" +
      "mples.smartsurveyB\031SmartSurveyRepService" +
      "ImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_smartsurvey_reportRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smartsurvey_reportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartsurvey_reportRequest_descriptor,
        new java.lang.String[] { "Motion", "Noise", });
    internal_static_smartsurvey_reportResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smartsurvey_reportResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartsurvey_reportResponse_descriptor,
        new java.lang.String[] { "Notice", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

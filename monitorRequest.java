// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: smartsurveymon.proto

package grpc.examples.smartsurvey;

/**
 * <pre>
 *the request message containing movement, images, voices
 * </pre>
 *
 * Protobuf type {@code smartsurvey.monitorRequest}
 */
public  final class monitorRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:smartsurvey.monitorRequest)
    monitorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use monitorRequest.newBuilder() to construct.
  private monitorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private monitorRequest() {
    movement_ = 0;
    images_ = 0;
    voices_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private monitorRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            movement_ = input.readInt32();
            break;
          }
          case 16: {

            images_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            voices_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.examples.smartsurvey.SmartSurveyMonServiceImpl.internal_static_smartsurvey_monitorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.examples.smartsurvey.SmartSurveyMonServiceImpl.internal_static_smartsurvey_monitorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.examples.smartsurvey.monitorRequest.class, grpc.examples.smartsurvey.monitorRequest.Builder.class);
  }

  public static final int MOVEMENT_FIELD_NUMBER = 1;
  private int movement_;
  /**
   * <code>int32 movement = 1;</code>
   */
  public int getMovement() {
    return movement_;
  }

  public static final int IMAGES_FIELD_NUMBER = 2;
  private int images_;
  /**
   * <code>int32 images = 2;</code>
   */
  public int getImages() {
    return images_;
  }

  public static final int VOICES_FIELD_NUMBER = 3;
  private volatile java.lang.Object voices_;
  /**
   * <code>string voices = 3;</code>
   */
  public java.lang.String getVoices() {
    java.lang.Object ref = voices_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      voices_ = s;
      return s;
    }
  }
  /**
   * <code>string voices = 3;</code>
   */
  public com.google.protobuf.ByteString
      getVoicesBytes() {
    java.lang.Object ref = voices_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      voices_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (movement_ != 0) {
      output.writeInt32(1, movement_);
    }
    if (images_ != 0) {
      output.writeInt32(2, images_);
    }
    if (!getVoicesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, voices_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (movement_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, movement_);
    }
    if (images_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, images_);
    }
    if (!getVoicesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, voices_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.examples.smartsurvey.monitorRequest)) {
      return super.equals(obj);
    }
    grpc.examples.smartsurvey.monitorRequest other = (grpc.examples.smartsurvey.monitorRequest) obj;

    boolean result = true;
    result = result && (getMovement()
        == other.getMovement());
    result = result && (getImages()
        == other.getImages());
    result = result && getVoices()
        .equals(other.getVoices());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MOVEMENT_FIELD_NUMBER;
    hash = (53 * hash) + getMovement();
    hash = (37 * hash) + IMAGES_FIELD_NUMBER;
    hash = (53 * hash) + getImages();
    hash = (37 * hash) + VOICES_FIELD_NUMBER;
    hash = (53 * hash) + getVoices().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.examples.smartsurvey.monitorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.examples.smartsurvey.monitorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.examples.smartsurvey.monitorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.examples.smartsurvey.monitorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.examples.smartsurvey.monitorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.examples.smartsurvey.monitorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.examples.smartsurvey.monitorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.examples.smartsurvey.monitorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.examples.smartsurvey.monitorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.examples.smartsurvey.monitorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.examples.smartsurvey.monitorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.examples.smartsurvey.monitorRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.examples.smartsurvey.monitorRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *the request message containing movement, images, voices
   * </pre>
   *
   * Protobuf type {@code smartsurvey.monitorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:smartsurvey.monitorRequest)
      grpc.examples.smartsurvey.monitorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.examples.smartsurvey.SmartSurveyMonServiceImpl.internal_static_smartsurvey_monitorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.examples.smartsurvey.SmartSurveyMonServiceImpl.internal_static_smartsurvey_monitorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.examples.smartsurvey.monitorRequest.class, grpc.examples.smartsurvey.monitorRequest.Builder.class);
    }

    // Construct using grpc.examples.smartsurvey.monitorRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      movement_ = 0;

      images_ = 0;

      voices_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.examples.smartsurvey.SmartSurveyMonServiceImpl.internal_static_smartsurvey_monitorRequest_descriptor;
    }

    @java.lang.Override
    public grpc.examples.smartsurvey.monitorRequest getDefaultInstanceForType() {
      return grpc.examples.smartsurvey.monitorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.examples.smartsurvey.monitorRequest build() {
      grpc.examples.smartsurvey.monitorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.examples.smartsurvey.monitorRequest buildPartial() {
      grpc.examples.smartsurvey.monitorRequest result = new grpc.examples.smartsurvey.monitorRequest(this);
      result.movement_ = movement_;
      result.images_ = images_;
      result.voices_ = voices_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.examples.smartsurvey.monitorRequest) {
        return mergeFrom((grpc.examples.smartsurvey.monitorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.examples.smartsurvey.monitorRequest other) {
      if (other == grpc.examples.smartsurvey.monitorRequest.getDefaultInstance()) return this;
      if (other.getMovement() != 0) {
        setMovement(other.getMovement());
      }
      if (other.getImages() != 0) {
        setImages(other.getImages());
      }
      if (!other.getVoices().isEmpty()) {
        voices_ = other.voices_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.examples.smartsurvey.monitorRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.examples.smartsurvey.monitorRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int movement_ ;
    /**
     * <code>int32 movement = 1;</code>
     */
    public int getMovement() {
      return movement_;
    }
    /**
     * <code>int32 movement = 1;</code>
     */
    public Builder setMovement(int value) {
      
      movement_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 movement = 1;</code>
     */
    public Builder clearMovement() {
      
      movement_ = 0;
      onChanged();
      return this;
    }

    private int images_ ;
    /**
     * <code>int32 images = 2;</code>
     */
    public int getImages() {
      return images_;
    }
    /**
     * <code>int32 images = 2;</code>
     */
    public Builder setImages(int value) {
      
      images_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 images = 2;</code>
     */
    public Builder clearImages() {
      
      images_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object voices_ = "";
    /**
     * <code>string voices = 3;</code>
     */
    public java.lang.String getVoices() {
      java.lang.Object ref = voices_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        voices_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string voices = 3;</code>
     */
    public com.google.protobuf.ByteString
        getVoicesBytes() {
      java.lang.Object ref = voices_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        voices_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string voices = 3;</code>
     */
    public Builder setVoices(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      voices_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string voices = 3;</code>
     */
    public Builder clearVoices() {
      
      voices_ = getDefaultInstance().getVoices();
      onChanged();
      return this;
    }
    /**
     * <code>string voices = 3;</code>
     */
    public Builder setVoicesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      voices_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:smartsurvey.monitorRequest)
  }

  // @@protoc_insertion_point(class_scope:smartsurvey.monitorRequest)
  private static final grpc.examples.smartsurvey.monitorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.examples.smartsurvey.monitorRequest();
  }

  public static grpc.examples.smartsurvey.monitorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<monitorRequest>
      PARSER = new com.google.protobuf.AbstractParser<monitorRequest>() {
    @java.lang.Override
    public monitorRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new monitorRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<monitorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<monitorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.examples.smartsurvey.monitorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


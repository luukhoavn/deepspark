// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DeepSparkConf.proto

package org.acl.deepspark.utils;

public final class DeepSparkConf {
  private DeepSparkConf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DeepSparkParamOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DeepSparkParam)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 period = 1;</code>
     */
    boolean hasPeriod();
    /**
     * <code>required int32 period = 1;</code>
     */
    int getPeriod();

    /**
     * <code>required float moving_rate = 2;</code>
     */
    boolean hasMovingRate();
    /**
     * <code>required float moving_rate = 2;</code>
     */
    float getMovingRate();

    /**
     * <code>optional float decay_rate = 3 [default = 1];</code>
     */
    boolean hasDecayRate();
    /**
     * <code>optional float decay_rate = 3 [default = 1];</code>
     */
    float getDecayRate();

    /**
     * <code>optional int32 decay_step = 4 [default = -1];</code>
     */
    boolean hasDecayStep();
    /**
     * <code>optional int32 decay_step = 4 [default = -1];</code>
     */
    int getDecayStep();

    /**
     * <code>optional int32 decay_limit = 5 [default = -1];</code>
     */
    boolean hasDecayLimit();
    /**
     * <code>optional int32 decay_limit = 5 [default = -1];</code>
     */
    int getDecayLimit();

    /**
     * <code>optional float server_factor = 6 [default = 1];</code>
     */
    boolean hasServerFactor();
    /**
     * <code>optional float server_factor = 6 [default = 1];</code>
     */
    float getServerFactor();

    /**
     * <code>optional float factor_decay_rate = 7 [default = 1];</code>
     */
    boolean hasFactorDecayRate();
    /**
     * <code>optional float factor_decay_rate = 7 [default = 1];</code>
     */
    float getFactorDecayRate();

    /**
     * <code>optional int32 factor_decay_step = 8 [default = -1];</code>
     */
    boolean hasFactorDecayStep();
    /**
     * <code>optional int32 factor_decay_step = 8 [default = -1];</code>
     */
    int getFactorDecayStep();

    /**
     * <code>optional int32 factor_decay_limit = 9 [default = -1];</code>
     */
    boolean hasFactorDecayLimit();
    /**
     * <code>optional int32 factor_decay_limit = 9 [default = -1];</code>
     */
    int getFactorDecayLimit();
  }
  /**
   * Protobuf type {@code DeepSparkParam}
   */
  public  static final class DeepSparkParam extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:DeepSparkParam)
      DeepSparkParamOrBuilder {
    // Use DeepSparkParam.newBuilder() to construct.
    private DeepSparkParam(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private DeepSparkParam() {
      period_ = 0;
      movingRate_ = 0F;
      decayRate_ = 1F;
      decayStep_ = -1;
      decayLimit_ = -1;
      serverFactor_ = 1F;
      factorDecayRate_ = 1F;
      factorDecayStep_ = -1;
      factorDecayLimit_ = -1;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DeepSparkParam(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              period_ = input.readInt32();
              break;
            }
            case 21: {
              bitField0_ |= 0x00000002;
              movingRate_ = input.readFloat();
              break;
            }
            case 29: {
              bitField0_ |= 0x00000004;
              decayRate_ = input.readFloat();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              decayStep_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              decayLimit_ = input.readInt32();
              break;
            }
            case 53: {
              bitField0_ |= 0x00000020;
              serverFactor_ = input.readFloat();
              break;
            }
            case 61: {
              bitField0_ |= 0x00000040;
              factorDecayRate_ = input.readFloat();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              factorDecayStep_ = input.readInt32();
              break;
            }
            case 72: {
              bitField0_ |= 0x00000100;
              factorDecayLimit_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.acl.deepspark.utils.DeepSparkConf.internal_static_DeepSparkParam_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.acl.deepspark.utils.DeepSparkConf.internal_static_DeepSparkParam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam.class, org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam.Builder.class);
    }

    private int bitField0_;
    public static final int PERIOD_FIELD_NUMBER = 1;
    private int period_;
    /**
     * <code>required int32 period = 1;</code>
     */
    public boolean hasPeriod() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 period = 1;</code>
     */
    public int getPeriod() {
      return period_;
    }

    public static final int MOVING_RATE_FIELD_NUMBER = 2;
    private float movingRate_;
    /**
     * <code>required float moving_rate = 2;</code>
     */
    public boolean hasMovingRate() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required float moving_rate = 2;</code>
     */
    public float getMovingRate() {
      return movingRate_;
    }

    public static final int DECAY_RATE_FIELD_NUMBER = 3;
    private float decayRate_;
    /**
     * <code>optional float decay_rate = 3 [default = 1];</code>
     */
    public boolean hasDecayRate() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional float decay_rate = 3 [default = 1];</code>
     */
    public float getDecayRate() {
      return decayRate_;
    }

    public static final int DECAY_STEP_FIELD_NUMBER = 4;
    private int decayStep_;
    /**
     * <code>optional int32 decay_step = 4 [default = -1];</code>
     */
    public boolean hasDecayStep() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 decay_step = 4 [default = -1];</code>
     */
    public int getDecayStep() {
      return decayStep_;
    }

    public static final int DECAY_LIMIT_FIELD_NUMBER = 5;
    private int decayLimit_;
    /**
     * <code>optional int32 decay_limit = 5 [default = -1];</code>
     */
    public boolean hasDecayLimit() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int32 decay_limit = 5 [default = -1];</code>
     */
    public int getDecayLimit() {
      return decayLimit_;
    }

    public static final int SERVER_FACTOR_FIELD_NUMBER = 6;
    private float serverFactor_;
    /**
     * <code>optional float server_factor = 6 [default = 1];</code>
     */
    public boolean hasServerFactor() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional float server_factor = 6 [default = 1];</code>
     */
    public float getServerFactor() {
      return serverFactor_;
    }

    public static final int FACTOR_DECAY_RATE_FIELD_NUMBER = 7;
    private float factorDecayRate_;
    /**
     * <code>optional float factor_decay_rate = 7 [default = 1];</code>
     */
    public boolean hasFactorDecayRate() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional float factor_decay_rate = 7 [default = 1];</code>
     */
    public float getFactorDecayRate() {
      return factorDecayRate_;
    }

    public static final int FACTOR_DECAY_STEP_FIELD_NUMBER = 8;
    private int factorDecayStep_;
    /**
     * <code>optional int32 factor_decay_step = 8 [default = -1];</code>
     */
    public boolean hasFactorDecayStep() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional int32 factor_decay_step = 8 [default = -1];</code>
     */
    public int getFactorDecayStep() {
      return factorDecayStep_;
    }

    public static final int FACTOR_DECAY_LIMIT_FIELD_NUMBER = 9;
    private int factorDecayLimit_;
    /**
     * <code>optional int32 factor_decay_limit = 9 [default = -1];</code>
     */
    public boolean hasFactorDecayLimit() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional int32 factor_decay_limit = 9 [default = -1];</code>
     */
    public int getFactorDecayLimit() {
      return factorDecayLimit_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasPeriod()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMovingRate()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, period_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeFloat(2, movingRate_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeFloat(3, decayRate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, decayStep_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, decayLimit_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeFloat(6, serverFactor_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeFloat(7, factorDecayRate_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt32(8, factorDecayStep_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeInt32(9, factorDecayLimit_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, period_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, movingRate_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, decayRate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, decayStep_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, decayLimit_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(6, serverFactor_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(7, factorDecayRate_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, factorDecayStep_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, factorDecayLimit_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code DeepSparkParam}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DeepSparkParam)
        org.acl.deepspark.utils.DeepSparkConf.DeepSparkParamOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.acl.deepspark.utils.DeepSparkConf.internal_static_DeepSparkParam_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.acl.deepspark.utils.DeepSparkConf.internal_static_DeepSparkParam_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam.class, org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam.Builder.class);
      }

      // Construct using org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        period_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        movingRate_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000002);
        decayRate_ = 1F;
        bitField0_ = (bitField0_ & ~0x00000004);
        decayStep_ = -1;
        bitField0_ = (bitField0_ & ~0x00000008);
        decayLimit_ = -1;
        bitField0_ = (bitField0_ & ~0x00000010);
        serverFactor_ = 1F;
        bitField0_ = (bitField0_ & ~0x00000020);
        factorDecayRate_ = 1F;
        bitField0_ = (bitField0_ & ~0x00000040);
        factorDecayStep_ = -1;
        bitField0_ = (bitField0_ & ~0x00000080);
        factorDecayLimit_ = -1;
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.acl.deepspark.utils.DeepSparkConf.internal_static_DeepSparkParam_descriptor;
      }

      public org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam getDefaultInstanceForType() {
        return org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam.getDefaultInstance();
      }

      public org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam build() {
        org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam buildPartial() {
        org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam result = new org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.period_ = period_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.movingRate_ = movingRate_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.decayRate_ = decayRate_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.decayStep_ = decayStep_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.decayLimit_ = decayLimit_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.serverFactor_ = serverFactor_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.factorDecayRate_ = factorDecayRate_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.factorDecayStep_ = factorDecayStep_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.factorDecayLimit_ = factorDecayLimit_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam) {
          return mergeFrom((org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam other) {
        if (other == org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam.getDefaultInstance()) return this;
        if (other.hasPeriod()) {
          setPeriod(other.getPeriod());
        }
        if (other.hasMovingRate()) {
          setMovingRate(other.getMovingRate());
        }
        if (other.hasDecayRate()) {
          setDecayRate(other.getDecayRate());
        }
        if (other.hasDecayStep()) {
          setDecayStep(other.getDecayStep());
        }
        if (other.hasDecayLimit()) {
          setDecayLimit(other.getDecayLimit());
        }
        if (other.hasServerFactor()) {
          setServerFactor(other.getServerFactor());
        }
        if (other.hasFactorDecayRate()) {
          setFactorDecayRate(other.getFactorDecayRate());
        }
        if (other.hasFactorDecayStep()) {
          setFactorDecayStep(other.getFactorDecayStep());
        }
        if (other.hasFactorDecayLimit()) {
          setFactorDecayLimit(other.getFactorDecayLimit());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasPeriod()) {
          return false;
        }
        if (!hasMovingRate()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int period_ ;
      /**
       * <code>required int32 period = 1;</code>
       */
      public boolean hasPeriod() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 period = 1;</code>
       */
      public int getPeriod() {
        return period_;
      }
      /**
       * <code>required int32 period = 1;</code>
       */
      public Builder setPeriod(int value) {
        bitField0_ |= 0x00000001;
        period_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 period = 1;</code>
       */
      public Builder clearPeriod() {
        bitField0_ = (bitField0_ & ~0x00000001);
        period_ = 0;
        onChanged();
        return this;
      }

      private float movingRate_ ;
      /**
       * <code>required float moving_rate = 2;</code>
       */
      public boolean hasMovingRate() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required float moving_rate = 2;</code>
       */
      public float getMovingRate() {
        return movingRate_;
      }
      /**
       * <code>required float moving_rate = 2;</code>
       */
      public Builder setMovingRate(float value) {
        bitField0_ |= 0x00000002;
        movingRate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float moving_rate = 2;</code>
       */
      public Builder clearMovingRate() {
        bitField0_ = (bitField0_ & ~0x00000002);
        movingRate_ = 0F;
        onChanged();
        return this;
      }

      private float decayRate_ = 1F;
      /**
       * <code>optional float decay_rate = 3 [default = 1];</code>
       */
      public boolean hasDecayRate() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional float decay_rate = 3 [default = 1];</code>
       */
      public float getDecayRate() {
        return decayRate_;
      }
      /**
       * <code>optional float decay_rate = 3 [default = 1];</code>
       */
      public Builder setDecayRate(float value) {
        bitField0_ |= 0x00000004;
        decayRate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float decay_rate = 3 [default = 1];</code>
       */
      public Builder clearDecayRate() {
        bitField0_ = (bitField0_ & ~0x00000004);
        decayRate_ = 1F;
        onChanged();
        return this;
      }

      private int decayStep_ = -1;
      /**
       * <code>optional int32 decay_step = 4 [default = -1];</code>
       */
      public boolean hasDecayStep() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 decay_step = 4 [default = -1];</code>
       */
      public int getDecayStep() {
        return decayStep_;
      }
      /**
       * <code>optional int32 decay_step = 4 [default = -1];</code>
       */
      public Builder setDecayStep(int value) {
        bitField0_ |= 0x00000008;
        decayStep_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 decay_step = 4 [default = -1];</code>
       */
      public Builder clearDecayStep() {
        bitField0_ = (bitField0_ & ~0x00000008);
        decayStep_ = -1;
        onChanged();
        return this;
      }

      private int decayLimit_ = -1;
      /**
       * <code>optional int32 decay_limit = 5 [default = -1];</code>
       */
      public boolean hasDecayLimit() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int32 decay_limit = 5 [default = -1];</code>
       */
      public int getDecayLimit() {
        return decayLimit_;
      }
      /**
       * <code>optional int32 decay_limit = 5 [default = -1];</code>
       */
      public Builder setDecayLimit(int value) {
        bitField0_ |= 0x00000010;
        decayLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 decay_limit = 5 [default = -1];</code>
       */
      public Builder clearDecayLimit() {
        bitField0_ = (bitField0_ & ~0x00000010);
        decayLimit_ = -1;
        onChanged();
        return this;
      }

      private float serverFactor_ = 1F;
      /**
       * <code>optional float server_factor = 6 [default = 1];</code>
       */
      public boolean hasServerFactor() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional float server_factor = 6 [default = 1];</code>
       */
      public float getServerFactor() {
        return serverFactor_;
      }
      /**
       * <code>optional float server_factor = 6 [default = 1];</code>
       */
      public Builder setServerFactor(float value) {
        bitField0_ |= 0x00000020;
        serverFactor_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float server_factor = 6 [default = 1];</code>
       */
      public Builder clearServerFactor() {
        bitField0_ = (bitField0_ & ~0x00000020);
        serverFactor_ = 1F;
        onChanged();
        return this;
      }

      private float factorDecayRate_ = 1F;
      /**
       * <code>optional float factor_decay_rate = 7 [default = 1];</code>
       */
      public boolean hasFactorDecayRate() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional float factor_decay_rate = 7 [default = 1];</code>
       */
      public float getFactorDecayRate() {
        return factorDecayRate_;
      }
      /**
       * <code>optional float factor_decay_rate = 7 [default = 1];</code>
       */
      public Builder setFactorDecayRate(float value) {
        bitField0_ |= 0x00000040;
        factorDecayRate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float factor_decay_rate = 7 [default = 1];</code>
       */
      public Builder clearFactorDecayRate() {
        bitField0_ = (bitField0_ & ~0x00000040);
        factorDecayRate_ = 1F;
        onChanged();
        return this;
      }

      private int factorDecayStep_ = -1;
      /**
       * <code>optional int32 factor_decay_step = 8 [default = -1];</code>
       */
      public boolean hasFactorDecayStep() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional int32 factor_decay_step = 8 [default = -1];</code>
       */
      public int getFactorDecayStep() {
        return factorDecayStep_;
      }
      /**
       * <code>optional int32 factor_decay_step = 8 [default = -1];</code>
       */
      public Builder setFactorDecayStep(int value) {
        bitField0_ |= 0x00000080;
        factorDecayStep_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 factor_decay_step = 8 [default = -1];</code>
       */
      public Builder clearFactorDecayStep() {
        bitField0_ = (bitField0_ & ~0x00000080);
        factorDecayStep_ = -1;
        onChanged();
        return this;
      }

      private int factorDecayLimit_ = -1;
      /**
       * <code>optional int32 factor_decay_limit = 9 [default = -1];</code>
       */
      public boolean hasFactorDecayLimit() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional int32 factor_decay_limit = 9 [default = -1];</code>
       */
      public int getFactorDecayLimit() {
        return factorDecayLimit_;
      }
      /**
       * <code>optional int32 factor_decay_limit = 9 [default = -1];</code>
       */
      public Builder setFactorDecayLimit(int value) {
        bitField0_ |= 0x00000100;
        factorDecayLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 factor_decay_limit = 9 [default = -1];</code>
       */
      public Builder clearFactorDecayLimit() {
        bitField0_ = (bitField0_ & ~0x00000100);
        factorDecayLimit_ = -1;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:DeepSparkParam)
    }

    // @@protoc_insertion_point(class_scope:DeepSparkParam)
    private static final org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam();
    }

    public static org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<DeepSparkParam>
        PARSER = new com.google.protobuf.AbstractParser<DeepSparkParam>() {
      public DeepSparkParam parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new DeepSparkParam(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<DeepSparkParam> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DeepSparkParam> getParserForType() {
      return PARSER;
    }

    public org.acl.deepspark.utils.DeepSparkConf.DeepSparkParam getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_DeepSparkParam_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DeepSparkParam_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023DeepSparkConf.proto\"\364\001\n\016DeepSparkParam" +
      "\022\016\n\006period\030\001 \002(\005\022\023\n\013moving_rate\030\002 \002(\002\022\025\n" +
      "\ndecay_rate\030\003 \001(\002:\0011\022\026\n\ndecay_step\030\004 \001(\005" +
      ":\002-1\022\027\n\013decay_limit\030\005 \001(\005:\002-1\022\030\n\rserver_" +
      "factor\030\006 \001(\002:\0011\022\034\n\021factor_decay_rate\030\007 \001" +
      "(\002:\0011\022\035\n\021factor_decay_step\030\010 \001(\005:\002-1\022\036\n\022" +
      "factor_decay_limit\030\t \001(\005:\002-1B\031\n\027org.acl." +
      "deepspark.utils"
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
    internal_static_DeepSparkParam_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DeepSparkParam_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_DeepSparkParam_descriptor,
        new java.lang.String[] { "Period", "MovingRate", "DecayRate", "DecayStep", "DecayLimit", "ServerFactor", "FactorDecayRate", "FactorDecayStep", "FactorDecayLimit", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
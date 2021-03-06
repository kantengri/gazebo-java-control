// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: friction.proto

package gazebo.msgs;

public final class GzFriction {
  private GzFriction() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface FrictionOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional double mu = 1;
    /**
     * <code>optional double mu = 1;</code>
     */
    boolean hasMu();
    /**
     * <code>optional double mu = 1;</code>
     */
    double getMu();

    // optional double mu2 = 2;
    /**
     * <code>optional double mu2 = 2;</code>
     */
    boolean hasMu2();
    /**
     * <code>optional double mu2 = 2;</code>
     */
    double getMu2();

    // optional .gazebo.msgs.Vector3d fdir1 = 3;
    /**
     * <code>optional .gazebo.msgs.Vector3d fdir1 = 3;</code>
     */
    boolean hasFdir1();
    /**
     * <code>optional .gazebo.msgs.Vector3d fdir1 = 3;</code>
     */
    gazebo.msgs.GzVector3d.Vector3d getFdir1();
    /**
     * <code>optional .gazebo.msgs.Vector3d fdir1 = 3;</code>
     */
    gazebo.msgs.GzVector3d.Vector3dOrBuilder getFdir1OrBuilder();

    // optional double slip1 = 4;
    /**
     * <code>optional double slip1 = 4;</code>
     */
    boolean hasSlip1();
    /**
     * <code>optional double slip1 = 4;</code>
     */
    double getSlip1();

    // optional double slip2 = 5;
    /**
     * <code>optional double slip2 = 5;</code>
     */
    boolean hasSlip2();
    /**
     * <code>optional double slip2 = 5;</code>
     */
    double getSlip2();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Friction}
   */
  public static final class Friction extends
      com.google.protobuf.GeneratedMessage
      implements FrictionOrBuilder {
    // Use Friction.newBuilder() to construct.
    private Friction(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Friction(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Friction defaultInstance;
    public static Friction getDefaultInstance() {
      return defaultInstance;
    }

    public Friction getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Friction(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            case 9: {
              bitField0_ |= 0x00000001;
              mu_ = input.readDouble();
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              mu2_ = input.readDouble();
              break;
            }
            case 26: {
              gazebo.msgs.GzVector3d.Vector3d.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = fdir1_.toBuilder();
              }
              fdir1_ = input.readMessage(gazebo.msgs.GzVector3d.Vector3d.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(fdir1_);
                fdir1_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 33: {
              bitField0_ |= 0x00000008;
              slip1_ = input.readDouble();
              break;
            }
            case 41: {
              bitField0_ |= 0x00000010;
              slip2_ = input.readDouble();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gazebo.msgs.GzFriction.internal_static_gazebo_msgs_Friction_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.GzFriction.internal_static_gazebo_msgs_Friction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.GzFriction.Friction.class, gazebo.msgs.GzFriction.Friction.Builder.class);
    }

    public static com.google.protobuf.Parser<Friction> PARSER =
        new com.google.protobuf.AbstractParser<Friction>() {
      public Friction parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Friction(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Friction> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional double mu = 1;
    public static final int MU_FIELD_NUMBER = 1;
    private double mu_;
    /**
     * <code>optional double mu = 1;</code>
     */
    public boolean hasMu() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional double mu = 1;</code>
     */
    public double getMu() {
      return mu_;
    }

    // optional double mu2 = 2;
    public static final int MU2_FIELD_NUMBER = 2;
    private double mu2_;
    /**
     * <code>optional double mu2 = 2;</code>
     */
    public boolean hasMu2() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional double mu2 = 2;</code>
     */
    public double getMu2() {
      return mu2_;
    }

    // optional .gazebo.msgs.Vector3d fdir1 = 3;
    public static final int FDIR1_FIELD_NUMBER = 3;
    private gazebo.msgs.GzVector3d.Vector3d fdir1_;
    /**
     * <code>optional .gazebo.msgs.Vector3d fdir1 = 3;</code>
     */
    public boolean hasFdir1() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .gazebo.msgs.Vector3d fdir1 = 3;</code>
     */
    public gazebo.msgs.GzVector3d.Vector3d getFdir1() {
      return fdir1_;
    }
    /**
     * <code>optional .gazebo.msgs.Vector3d fdir1 = 3;</code>
     */
    public gazebo.msgs.GzVector3d.Vector3dOrBuilder getFdir1OrBuilder() {
      return fdir1_;
    }

    // optional double slip1 = 4;
    public static final int SLIP1_FIELD_NUMBER = 4;
    private double slip1_;
    /**
     * <code>optional double slip1 = 4;</code>
     */
    public boolean hasSlip1() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional double slip1 = 4;</code>
     */
    public double getSlip1() {
      return slip1_;
    }

    // optional double slip2 = 5;
    public static final int SLIP2_FIELD_NUMBER = 5;
    private double slip2_;
    /**
     * <code>optional double slip2 = 5;</code>
     */
    public boolean hasSlip2() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional double slip2 = 5;</code>
     */
    public double getSlip2() {
      return slip2_;
    }

    private void initFields() {
      mu_ = 0D;
      mu2_ = 0D;
      fdir1_ = gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance();
      slip1_ = 0D;
      slip2_ = 0D;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (hasFdir1()) {
        if (!getFdir1().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeDouble(1, mu_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeDouble(2, mu2_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, fdir1_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeDouble(4, slip1_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeDouble(5, slip2_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, mu_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, mu2_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, fdir1_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, slip1_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(5, slip2_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static gazebo.msgs.GzFriction.Friction parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzFriction.Friction parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzFriction.Friction parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzFriction.Friction parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzFriction.Friction parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzFriction.Friction parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzFriction.Friction parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gazebo.msgs.GzFriction.Friction parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzFriction.Friction parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzFriction.Friction parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gazebo.msgs.GzFriction.Friction prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code gazebo.msgs.Friction}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gazebo.msgs.GzFriction.FrictionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.GzFriction.internal_static_gazebo_msgs_Friction_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.GzFriction.internal_static_gazebo_msgs_Friction_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.GzFriction.Friction.class, gazebo.msgs.GzFriction.Friction.Builder.class);
      }

      // Construct using gazebo.msgs.GzFriction.Friction.newBuilder()
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
          getFdir1FieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        mu_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000001);
        mu2_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (fdir1Builder_ == null) {
          fdir1_ = gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance();
        } else {
          fdir1Builder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        slip1_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000008);
        slip2_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.GzFriction.internal_static_gazebo_msgs_Friction_descriptor;
      }

      public gazebo.msgs.GzFriction.Friction getDefaultInstanceForType() {
        return gazebo.msgs.GzFriction.Friction.getDefaultInstance();
      }

      public gazebo.msgs.GzFriction.Friction build() {
        gazebo.msgs.GzFriction.Friction result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gazebo.msgs.GzFriction.Friction buildPartial() {
        gazebo.msgs.GzFriction.Friction result = new gazebo.msgs.GzFriction.Friction(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.mu_ = mu_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.mu2_ = mu2_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (fdir1Builder_ == null) {
          result.fdir1_ = fdir1_;
        } else {
          result.fdir1_ = fdir1Builder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.slip1_ = slip1_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.slip2_ = slip2_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gazebo.msgs.GzFriction.Friction) {
          return mergeFrom((gazebo.msgs.GzFriction.Friction)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.GzFriction.Friction other) {
        if (other == gazebo.msgs.GzFriction.Friction.getDefaultInstance()) return this;
        if (other.hasMu()) {
          setMu(other.getMu());
        }
        if (other.hasMu2()) {
          setMu2(other.getMu2());
        }
        if (other.hasFdir1()) {
          mergeFdir1(other.getFdir1());
        }
        if (other.hasSlip1()) {
          setSlip1(other.getSlip1());
        }
        if (other.hasSlip2()) {
          setSlip2(other.getSlip2());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (hasFdir1()) {
          if (!getFdir1().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.GzFriction.Friction parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.GzFriction.Friction) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional double mu = 1;
      private double mu_ ;
      /**
       * <code>optional double mu = 1;</code>
       */
      public boolean hasMu() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional double mu = 1;</code>
       */
      public double getMu() {
        return mu_;
      }
      /**
       * <code>optional double mu = 1;</code>
       */
      public Builder setMu(double value) {
        bitField0_ |= 0x00000001;
        mu_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double mu = 1;</code>
       */
      public Builder clearMu() {
        bitField0_ = (bitField0_ & ~0x00000001);
        mu_ = 0D;
        onChanged();
        return this;
      }

      // optional double mu2 = 2;
      private double mu2_ ;
      /**
       * <code>optional double mu2 = 2;</code>
       */
      public boolean hasMu2() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional double mu2 = 2;</code>
       */
      public double getMu2() {
        return mu2_;
      }
      /**
       * <code>optional double mu2 = 2;</code>
       */
      public Builder setMu2(double value) {
        bitField0_ |= 0x00000002;
        mu2_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double mu2 = 2;</code>
       */
      public Builder clearMu2() {
        bitField0_ = (bitField0_ & ~0x00000002);
        mu2_ = 0D;
        onChanged();
        return this;
      }

      // optional .gazebo.msgs.Vector3d fdir1 = 3;
      private gazebo.msgs.GzVector3d.Vector3d fdir1_ = gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzVector3d.Vector3d, gazebo.msgs.GzVector3d.Vector3d.Builder, gazebo.msgs.GzVector3d.Vector3dOrBuilder> fdir1Builder_;
      /**
       * <code>optional .gazebo.msgs.Vector3d fdir1 = 3;</code>
       */
      public boolean hasFdir1() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .gazebo.msgs.Vector3d fdir1 = 3;</code>
       */
      public gazebo.msgs.GzVector3d.Vector3d getFdir1() {
        if (fdir1Builder_ == null) {
          return fdir1_;
        } else {
          return fdir1Builder_.getMessage();
        }
      }
      /**
       * <code>optional .gazebo.msgs.Vector3d fdir1 = 3;</code>
       */
      public Builder setFdir1(gazebo.msgs.GzVector3d.Vector3d value) {
        if (fdir1Builder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fdir1_ = value;
          onChanged();
        } else {
          fdir1Builder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Vector3d fdir1 = 3;</code>
       */
      public Builder setFdir1(
          gazebo.msgs.GzVector3d.Vector3d.Builder builderForValue) {
        if (fdir1Builder_ == null) {
          fdir1_ = builderForValue.build();
          onChanged();
        } else {
          fdir1Builder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Vector3d fdir1 = 3;</code>
       */
      public Builder mergeFdir1(gazebo.msgs.GzVector3d.Vector3d value) {
        if (fdir1Builder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              fdir1_ != gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance()) {
            fdir1_ =
              gazebo.msgs.GzVector3d.Vector3d.newBuilder(fdir1_).mergeFrom(value).buildPartial();
          } else {
            fdir1_ = value;
          }
          onChanged();
        } else {
          fdir1Builder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Vector3d fdir1 = 3;</code>
       */
      public Builder clearFdir1() {
        if (fdir1Builder_ == null) {
          fdir1_ = gazebo.msgs.GzVector3d.Vector3d.getDefaultInstance();
          onChanged();
        } else {
          fdir1Builder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .gazebo.msgs.Vector3d fdir1 = 3;</code>
       */
      public gazebo.msgs.GzVector3d.Vector3d.Builder getFdir1Builder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getFdir1FieldBuilder().getBuilder();
      }
      /**
       * <code>optional .gazebo.msgs.Vector3d fdir1 = 3;</code>
       */
      public gazebo.msgs.GzVector3d.Vector3dOrBuilder getFdir1OrBuilder() {
        if (fdir1Builder_ != null) {
          return fdir1Builder_.getMessageOrBuilder();
        } else {
          return fdir1_;
        }
      }
      /**
       * <code>optional .gazebo.msgs.Vector3d fdir1 = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzVector3d.Vector3d, gazebo.msgs.GzVector3d.Vector3d.Builder, gazebo.msgs.GzVector3d.Vector3dOrBuilder> 
          getFdir1FieldBuilder() {
        if (fdir1Builder_ == null) {
          fdir1Builder_ = new com.google.protobuf.SingleFieldBuilder<
              gazebo.msgs.GzVector3d.Vector3d, gazebo.msgs.GzVector3d.Vector3d.Builder, gazebo.msgs.GzVector3d.Vector3dOrBuilder>(
                  fdir1_,
                  getParentForChildren(),
                  isClean());
          fdir1_ = null;
        }
        return fdir1Builder_;
      }

      // optional double slip1 = 4;
      private double slip1_ ;
      /**
       * <code>optional double slip1 = 4;</code>
       */
      public boolean hasSlip1() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional double slip1 = 4;</code>
       */
      public double getSlip1() {
        return slip1_;
      }
      /**
       * <code>optional double slip1 = 4;</code>
       */
      public Builder setSlip1(double value) {
        bitField0_ |= 0x00000008;
        slip1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double slip1 = 4;</code>
       */
      public Builder clearSlip1() {
        bitField0_ = (bitField0_ & ~0x00000008);
        slip1_ = 0D;
        onChanged();
        return this;
      }

      // optional double slip2 = 5;
      private double slip2_ ;
      /**
       * <code>optional double slip2 = 5;</code>
       */
      public boolean hasSlip2() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional double slip2 = 5;</code>
       */
      public double getSlip2() {
        return slip2_;
      }
      /**
       * <code>optional double slip2 = 5;</code>
       */
      public Builder setSlip2(double value) {
        bitField0_ |= 0x00000010;
        slip2_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double slip2 = 5;</code>
       */
      public Builder clearSlip2() {
        bitField0_ = (bitField0_ & ~0x00000010);
        slip2_ = 0D;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Friction)
    }

    static {
      defaultInstance = new Friction(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Friction)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Friction_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_Friction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016friction.proto\022\013gazebo.msgs\032\016vector3d." +
      "proto\"g\n\010Friction\022\n\n\002mu\030\001 \001(\001\022\013\n\003mu2\030\002 \001" +
      "(\001\022$\n\005fdir1\030\003 \001(\0132\025.gazebo.msgs.Vector3d" +
      "\022\r\n\005slip1\030\004 \001(\001\022\r\n\005slip2\030\005 \001(\001B\014B\nGzFric" +
      "tion"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gazebo_msgs_Friction_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gazebo_msgs_Friction_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gazebo_msgs_Friction_descriptor,
              new java.lang.String[] { "Mu", "Mu2", "Fdir1", "Slip1", "Slip2", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.GzVector3d.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}

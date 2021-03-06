// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: color.proto

package gazebo.msgs;

public final class GzColor {
  private GzColor() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ColorOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required float r = 2;
    /**
     * <code>required float r = 2;</code>
     */
    boolean hasR();
    /**
     * <code>required float r = 2;</code>
     */
    float getR();

    // required float g = 3;
    /**
     * <code>required float g = 3;</code>
     */
    boolean hasG();
    /**
     * <code>required float g = 3;</code>
     */
    float getG();

    // required float b = 4;
    /**
     * <code>required float b = 4;</code>
     */
    boolean hasB();
    /**
     * <code>required float b = 4;</code>
     */
    float getB();

    // optional float a = 5 [default = 1];
    /**
     * <code>optional float a = 5 [default = 1];</code>
     */
    boolean hasA();
    /**
     * <code>optional float a = 5 [default = 1];</code>
     */
    float getA();
  }
  /**
   * Protobuf type {@code gazebo.msgs.Color}
   */
  public static final class Color extends
      com.google.protobuf.GeneratedMessage
      implements ColorOrBuilder {
    // Use Color.newBuilder() to construct.
    private Color(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Color(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Color defaultInstance;
    public static Color getDefaultInstance() {
      return defaultInstance;
    }

    public Color getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Color(
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
            case 21: {
              bitField0_ |= 0x00000001;
              r_ = input.readFloat();
              break;
            }
            case 29: {
              bitField0_ |= 0x00000002;
              g_ = input.readFloat();
              break;
            }
            case 37: {
              bitField0_ |= 0x00000004;
              b_ = input.readFloat();
              break;
            }
            case 45: {
              bitField0_ |= 0x00000008;
              a_ = input.readFloat();
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
      return gazebo.msgs.GzColor.internal_static_gazebo_msgs_Color_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.GzColor.internal_static_gazebo_msgs_Color_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.GzColor.Color.class, gazebo.msgs.GzColor.Color.Builder.class);
    }

    public static com.google.protobuf.Parser<Color> PARSER =
        new com.google.protobuf.AbstractParser<Color>() {
      public Color parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Color(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Color> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required float r = 2;
    public static final int R_FIELD_NUMBER = 2;
    private float r_;
    /**
     * <code>required float r = 2;</code>
     */
    public boolean hasR() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required float r = 2;</code>
     */
    public float getR() {
      return r_;
    }

    // required float g = 3;
    public static final int G_FIELD_NUMBER = 3;
    private float g_;
    /**
     * <code>required float g = 3;</code>
     */
    public boolean hasG() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required float g = 3;</code>
     */
    public float getG() {
      return g_;
    }

    // required float b = 4;
    public static final int B_FIELD_NUMBER = 4;
    private float b_;
    /**
     * <code>required float b = 4;</code>
     */
    public boolean hasB() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required float b = 4;</code>
     */
    public float getB() {
      return b_;
    }

    // optional float a = 5 [default = 1];
    public static final int A_FIELD_NUMBER = 5;
    private float a_;
    /**
     * <code>optional float a = 5 [default = 1];</code>
     */
    public boolean hasA() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional float a = 5 [default = 1];</code>
     */
    public float getA() {
      return a_;
    }

    private void initFields() {
      r_ = 0F;
      g_ = 0F;
      b_ = 0F;
      a_ = 1F;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasR()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasG()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasB()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeFloat(2, r_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeFloat(3, g_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeFloat(4, b_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeFloat(5, a_);
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
          .computeFloatSize(2, r_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, g_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, b_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, a_);
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

    public static gazebo.msgs.GzColor.Color parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzColor.Color parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzColor.Color parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzColor.Color parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzColor.Color parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzColor.Color parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzColor.Color parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gazebo.msgs.GzColor.Color parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzColor.Color parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzColor.Color parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gazebo.msgs.GzColor.Color prototype) {
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
     * Protobuf type {@code gazebo.msgs.Color}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gazebo.msgs.GzColor.ColorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.GzColor.internal_static_gazebo_msgs_Color_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.GzColor.internal_static_gazebo_msgs_Color_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.GzColor.Color.class, gazebo.msgs.GzColor.Color.Builder.class);
      }

      // Construct using gazebo.msgs.GzColor.Color.newBuilder()
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
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        r_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000001);
        g_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000002);
        b_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000004);
        a_ = 1F;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.GzColor.internal_static_gazebo_msgs_Color_descriptor;
      }

      public gazebo.msgs.GzColor.Color getDefaultInstanceForType() {
        return gazebo.msgs.GzColor.Color.getDefaultInstance();
      }

      public gazebo.msgs.GzColor.Color build() {
        gazebo.msgs.GzColor.Color result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gazebo.msgs.GzColor.Color buildPartial() {
        gazebo.msgs.GzColor.Color result = new gazebo.msgs.GzColor.Color(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.r_ = r_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.g_ = g_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.b_ = b_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.a_ = a_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gazebo.msgs.GzColor.Color) {
          return mergeFrom((gazebo.msgs.GzColor.Color)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.GzColor.Color other) {
        if (other == gazebo.msgs.GzColor.Color.getDefaultInstance()) return this;
        if (other.hasR()) {
          setR(other.getR());
        }
        if (other.hasG()) {
          setG(other.getG());
        }
        if (other.hasB()) {
          setB(other.getB());
        }
        if (other.hasA()) {
          setA(other.getA());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasR()) {
          
          return false;
        }
        if (!hasG()) {
          
          return false;
        }
        if (!hasB()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.GzColor.Color parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.GzColor.Color) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required float r = 2;
      private float r_ ;
      /**
       * <code>required float r = 2;</code>
       */
      public boolean hasR() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required float r = 2;</code>
       */
      public float getR() {
        return r_;
      }
      /**
       * <code>required float r = 2;</code>
       */
      public Builder setR(float value) {
        bitField0_ |= 0x00000001;
        r_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float r = 2;</code>
       */
      public Builder clearR() {
        bitField0_ = (bitField0_ & ~0x00000001);
        r_ = 0F;
        onChanged();
        return this;
      }

      // required float g = 3;
      private float g_ ;
      /**
       * <code>required float g = 3;</code>
       */
      public boolean hasG() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required float g = 3;</code>
       */
      public float getG() {
        return g_;
      }
      /**
       * <code>required float g = 3;</code>
       */
      public Builder setG(float value) {
        bitField0_ |= 0x00000002;
        g_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float g = 3;</code>
       */
      public Builder clearG() {
        bitField0_ = (bitField0_ & ~0x00000002);
        g_ = 0F;
        onChanged();
        return this;
      }

      // required float b = 4;
      private float b_ ;
      /**
       * <code>required float b = 4;</code>
       */
      public boolean hasB() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required float b = 4;</code>
       */
      public float getB() {
        return b_;
      }
      /**
       * <code>required float b = 4;</code>
       */
      public Builder setB(float value) {
        bitField0_ |= 0x00000004;
        b_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float b = 4;</code>
       */
      public Builder clearB() {
        bitField0_ = (bitField0_ & ~0x00000004);
        b_ = 0F;
        onChanged();
        return this;
      }

      // optional float a = 5 [default = 1];
      private float a_ = 1F;
      /**
       * <code>optional float a = 5 [default = 1];</code>
       */
      public boolean hasA() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional float a = 5 [default = 1];</code>
       */
      public float getA() {
        return a_;
      }
      /**
       * <code>optional float a = 5 [default = 1];</code>
       */
      public Builder setA(float value) {
        bitField0_ |= 0x00000008;
        a_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float a = 5 [default = 1];</code>
       */
      public Builder clearA() {
        bitField0_ = (bitField0_ & ~0x00000008);
        a_ = 1F;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.Color)
    }

    static {
      defaultInstance = new Color(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.Color)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_Color_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_Color_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013color.proto\022\013gazebo.msgs\"6\n\005Color\022\t\n\001r" +
      "\030\002 \002(\002\022\t\n\001g\030\003 \002(\002\022\t\n\001b\030\004 \002(\002\022\014\n\001a\030\005 \001(\002:" +
      "\0011B\tB\007GzColor"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gazebo_msgs_Color_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gazebo_msgs_Color_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gazebo_msgs_Color_descriptor,
              new java.lang.String[] { "R", "G", "B", "A", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}

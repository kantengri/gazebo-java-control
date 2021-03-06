// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: camera_cmd.proto

package gazebo.msgs;

public final class GzCameraCmd {
  private GzCameraCmd() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CameraCmdOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string follow_model = 1;
    /**
     * <code>optional string follow_model = 1;</code>
     */
    boolean hasFollowModel();
    /**
     * <code>optional string follow_model = 1;</code>
     */
    java.lang.String getFollowModel();
    /**
     * <code>optional string follow_model = 1;</code>
     */
    com.google.protobuf.ByteString
        getFollowModelBytes();
  }
  /**
   * Protobuf type {@code gazebo.msgs.CameraCmd}
   */
  public static final class CameraCmd extends
      com.google.protobuf.GeneratedMessage
      implements CameraCmdOrBuilder {
    // Use CameraCmd.newBuilder() to construct.
    private CameraCmd(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CameraCmd(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CameraCmd defaultInstance;
    public static CameraCmd getDefaultInstance() {
      return defaultInstance;
    }

    public CameraCmd getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CameraCmd(
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
            case 10: {
              bitField0_ |= 0x00000001;
              followModel_ = input.readBytes();
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
      return gazebo.msgs.GzCameraCmd.internal_static_gazebo_msgs_CameraCmd_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.GzCameraCmd.internal_static_gazebo_msgs_CameraCmd_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.GzCameraCmd.CameraCmd.class, gazebo.msgs.GzCameraCmd.CameraCmd.Builder.class);
    }

    public static com.google.protobuf.Parser<CameraCmd> PARSER =
        new com.google.protobuf.AbstractParser<CameraCmd>() {
      public CameraCmd parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CameraCmd(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<CameraCmd> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string follow_model = 1;
    public static final int FOLLOW_MODEL_FIELD_NUMBER = 1;
    private java.lang.Object followModel_;
    /**
     * <code>optional string follow_model = 1;</code>
     */
    public boolean hasFollowModel() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string follow_model = 1;</code>
     */
    public java.lang.String getFollowModel() {
      java.lang.Object ref = followModel_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          followModel_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string follow_model = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFollowModelBytes() {
      java.lang.Object ref = followModel_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        followModel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      followModel_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getFollowModelBytes());
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
          .computeBytesSize(1, getFollowModelBytes());
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

    public static gazebo.msgs.GzCameraCmd.CameraCmd parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzCameraCmd.CameraCmd parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzCameraCmd.CameraCmd parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzCameraCmd.CameraCmd parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzCameraCmd.CameraCmd parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzCameraCmd.CameraCmd parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzCameraCmd.CameraCmd parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gazebo.msgs.GzCameraCmd.CameraCmd parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzCameraCmd.CameraCmd parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzCameraCmd.CameraCmd parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gazebo.msgs.GzCameraCmd.CameraCmd prototype) {
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
     * Protobuf type {@code gazebo.msgs.CameraCmd}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gazebo.msgs.GzCameraCmd.CameraCmdOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.GzCameraCmd.internal_static_gazebo_msgs_CameraCmd_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.GzCameraCmd.internal_static_gazebo_msgs_CameraCmd_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.GzCameraCmd.CameraCmd.class, gazebo.msgs.GzCameraCmd.CameraCmd.Builder.class);
      }

      // Construct using gazebo.msgs.GzCameraCmd.CameraCmd.newBuilder()
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
        followModel_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.GzCameraCmd.internal_static_gazebo_msgs_CameraCmd_descriptor;
      }

      public gazebo.msgs.GzCameraCmd.CameraCmd getDefaultInstanceForType() {
        return gazebo.msgs.GzCameraCmd.CameraCmd.getDefaultInstance();
      }

      public gazebo.msgs.GzCameraCmd.CameraCmd build() {
        gazebo.msgs.GzCameraCmd.CameraCmd result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gazebo.msgs.GzCameraCmd.CameraCmd buildPartial() {
        gazebo.msgs.GzCameraCmd.CameraCmd result = new gazebo.msgs.GzCameraCmd.CameraCmd(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.followModel_ = followModel_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gazebo.msgs.GzCameraCmd.CameraCmd) {
          return mergeFrom((gazebo.msgs.GzCameraCmd.CameraCmd)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.GzCameraCmd.CameraCmd other) {
        if (other == gazebo.msgs.GzCameraCmd.CameraCmd.getDefaultInstance()) return this;
        if (other.hasFollowModel()) {
          bitField0_ |= 0x00000001;
          followModel_ = other.followModel_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.GzCameraCmd.CameraCmd parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.GzCameraCmd.CameraCmd) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string follow_model = 1;
      private java.lang.Object followModel_ = "";
      /**
       * <code>optional string follow_model = 1;</code>
       */
      public boolean hasFollowModel() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string follow_model = 1;</code>
       */
      public java.lang.String getFollowModel() {
        java.lang.Object ref = followModel_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          followModel_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string follow_model = 1;</code>
       */
      public com.google.protobuf.ByteString
          getFollowModelBytes() {
        java.lang.Object ref = followModel_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          followModel_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string follow_model = 1;</code>
       */
      public Builder setFollowModel(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        followModel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string follow_model = 1;</code>
       */
      public Builder clearFollowModel() {
        bitField0_ = (bitField0_ & ~0x00000001);
        followModel_ = getDefaultInstance().getFollowModel();
        onChanged();
        return this;
      }
      /**
       * <code>optional string follow_model = 1;</code>
       */
      public Builder setFollowModelBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        followModel_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.CameraCmd)
    }

    static {
      defaultInstance = new CameraCmd(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.CameraCmd)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_CameraCmd_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_CameraCmd_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020camera_cmd.proto\022\013gazebo.msgs\"!\n\tCamer" +
      "aCmd\022\024\n\014follow_model\030\001 \001(\tB\rB\013GzCameraCm" +
      "d"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gazebo_msgs_CameraCmd_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gazebo_msgs_CameraCmd_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gazebo_msgs_CameraCmd_descriptor,
              new java.lang.String[] { "FollowModel", });
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

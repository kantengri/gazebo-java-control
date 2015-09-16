// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: log_playback_stats.proto

package gazebo.msgs;

public final class GzLogPlaybackStats {
  private GzLogPlaybackStats() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface LogPlaybackStatisticsOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .gazebo.msgs.Time start_time = 1;
    /**
     * <code>required .gazebo.msgs.Time start_time = 1;</code>
     *
     * <pre>
     *&#47; &#92;brief Log start time
     * </pre>
     */
    boolean hasStartTime();
    /**
     * <code>required .gazebo.msgs.Time start_time = 1;</code>
     *
     * <pre>
     *&#47; &#92;brief Log start time
     * </pre>
     */
    gazebo.msgs.GzTime.Time getStartTime();
    /**
     * <code>required .gazebo.msgs.Time start_time = 1;</code>
     *
     * <pre>
     *&#47; &#92;brief Log start time
     * </pre>
     */
    gazebo.msgs.GzTime.TimeOrBuilder getStartTimeOrBuilder();

    // required .gazebo.msgs.Time end_time = 2;
    /**
     * <code>required .gazebo.msgs.Time end_time = 2;</code>
     *
     * <pre>
     *&#47; &#92;brief Log end time
     * </pre>
     */
    boolean hasEndTime();
    /**
     * <code>required .gazebo.msgs.Time end_time = 2;</code>
     *
     * <pre>
     *&#47; &#92;brief Log end time
     * </pre>
     */
    gazebo.msgs.GzTime.Time getEndTime();
    /**
     * <code>required .gazebo.msgs.Time end_time = 2;</code>
     *
     * <pre>
     *&#47; &#92;brief Log end time
     * </pre>
     */
    gazebo.msgs.GzTime.TimeOrBuilder getEndTimeOrBuilder();
  }
  /**
   * Protobuf type {@code gazebo.msgs.LogPlaybackStatistics}
   */
  public static final class LogPlaybackStatistics extends
      com.google.protobuf.GeneratedMessage
      implements LogPlaybackStatisticsOrBuilder {
    // Use LogPlaybackStatistics.newBuilder() to construct.
    private LogPlaybackStatistics(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private LogPlaybackStatistics(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final LogPlaybackStatistics defaultInstance;
    public static LogPlaybackStatistics getDefaultInstance() {
      return defaultInstance;
    }

    public LogPlaybackStatistics getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private LogPlaybackStatistics(
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
              gazebo.msgs.GzTime.Time.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = startTime_.toBuilder();
              }
              startTime_ = input.readMessage(gazebo.msgs.GzTime.Time.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(startTime_);
                startTime_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              gazebo.msgs.GzTime.Time.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = endTime_.toBuilder();
              }
              endTime_ = input.readMessage(gazebo.msgs.GzTime.Time.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(endTime_);
                endTime_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
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
      return gazebo.msgs.GzLogPlaybackStats.internal_static_gazebo_msgs_LogPlaybackStatistics_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gazebo.msgs.GzLogPlaybackStats.internal_static_gazebo_msgs_LogPlaybackStatistics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics.class, gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics.Builder.class);
    }

    public static com.google.protobuf.Parser<LogPlaybackStatistics> PARSER =
        new com.google.protobuf.AbstractParser<LogPlaybackStatistics>() {
      public LogPlaybackStatistics parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LogPlaybackStatistics(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<LogPlaybackStatistics> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .gazebo.msgs.Time start_time = 1;
    public static final int START_TIME_FIELD_NUMBER = 1;
    private gazebo.msgs.GzTime.Time startTime_;
    /**
     * <code>required .gazebo.msgs.Time start_time = 1;</code>
     *
     * <pre>
     *&#47; &#92;brief Log start time
     * </pre>
     */
    public boolean hasStartTime() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .gazebo.msgs.Time start_time = 1;</code>
     *
     * <pre>
     *&#47; &#92;brief Log start time
     * </pre>
     */
    public gazebo.msgs.GzTime.Time getStartTime() {
      return startTime_;
    }
    /**
     * <code>required .gazebo.msgs.Time start_time = 1;</code>
     *
     * <pre>
     *&#47; &#92;brief Log start time
     * </pre>
     */
    public gazebo.msgs.GzTime.TimeOrBuilder getStartTimeOrBuilder() {
      return startTime_;
    }

    // required .gazebo.msgs.Time end_time = 2;
    public static final int END_TIME_FIELD_NUMBER = 2;
    private gazebo.msgs.GzTime.Time endTime_;
    /**
     * <code>required .gazebo.msgs.Time end_time = 2;</code>
     *
     * <pre>
     *&#47; &#92;brief Log end time
     * </pre>
     */
    public boolean hasEndTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .gazebo.msgs.Time end_time = 2;</code>
     *
     * <pre>
     *&#47; &#92;brief Log end time
     * </pre>
     */
    public gazebo.msgs.GzTime.Time getEndTime() {
      return endTime_;
    }
    /**
     * <code>required .gazebo.msgs.Time end_time = 2;</code>
     *
     * <pre>
     *&#47; &#92;brief Log end time
     * </pre>
     */
    public gazebo.msgs.GzTime.TimeOrBuilder getEndTimeOrBuilder() {
      return endTime_;
    }

    private void initFields() {
      startTime_ = gazebo.msgs.GzTime.Time.getDefaultInstance();
      endTime_ = gazebo.msgs.GzTime.Time.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasStartTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEndTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getStartTime().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getEndTime().isInitialized()) {
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
        output.writeMessage(1, startTime_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, endTime_);
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
          .computeMessageSize(1, startTime_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, endTime_);
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

    public static gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics prototype) {
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
     * Protobuf type {@code gazebo.msgs.LogPlaybackStatistics}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatisticsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gazebo.msgs.GzLogPlaybackStats.internal_static_gazebo_msgs_LogPlaybackStatistics_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gazebo.msgs.GzLogPlaybackStats.internal_static_gazebo_msgs_LogPlaybackStatistics_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics.class, gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics.Builder.class);
      }

      // Construct using gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics.newBuilder()
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
          getStartTimeFieldBuilder();
          getEndTimeFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (startTimeBuilder_ == null) {
          startTime_ = gazebo.msgs.GzTime.Time.getDefaultInstance();
        } else {
          startTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (endTimeBuilder_ == null) {
          endTime_ = gazebo.msgs.GzTime.Time.getDefaultInstance();
        } else {
          endTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gazebo.msgs.GzLogPlaybackStats.internal_static_gazebo_msgs_LogPlaybackStatistics_descriptor;
      }

      public gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics getDefaultInstanceForType() {
        return gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics.getDefaultInstance();
      }

      public gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics build() {
        gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics buildPartial() {
        gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics result = new gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (startTimeBuilder_ == null) {
          result.startTime_ = startTime_;
        } else {
          result.startTime_ = startTimeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (endTimeBuilder_ == null) {
          result.endTime_ = endTime_;
        } else {
          result.endTime_ = endTimeBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics) {
          return mergeFrom((gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics other) {
        if (other == gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics.getDefaultInstance()) return this;
        if (other.hasStartTime()) {
          mergeStartTime(other.getStartTime());
        }
        if (other.hasEndTime()) {
          mergeEndTime(other.getEndTime());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasStartTime()) {
          
          return false;
        }
        if (!hasEndTime()) {
          
          return false;
        }
        if (!getStartTime().isInitialized()) {
          
          return false;
        }
        if (!getEndTime().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gazebo.msgs.GzLogPlaybackStats.LogPlaybackStatistics) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .gazebo.msgs.Time start_time = 1;
      private gazebo.msgs.GzTime.Time startTime_ = gazebo.msgs.GzTime.Time.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzTime.Time, gazebo.msgs.GzTime.Time.Builder, gazebo.msgs.GzTime.TimeOrBuilder> startTimeBuilder_;
      /**
       * <code>required .gazebo.msgs.Time start_time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Log start time
       * </pre>
       */
      public boolean hasStartTime() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .gazebo.msgs.Time start_time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Log start time
       * </pre>
       */
      public gazebo.msgs.GzTime.Time getStartTime() {
        if (startTimeBuilder_ == null) {
          return startTime_;
        } else {
          return startTimeBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Time start_time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Log start time
       * </pre>
       */
      public Builder setStartTime(gazebo.msgs.GzTime.Time value) {
        if (startTimeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          startTime_ = value;
          onChanged();
        } else {
          startTimeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time start_time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Log start time
       * </pre>
       */
      public Builder setStartTime(
          gazebo.msgs.GzTime.Time.Builder builderForValue) {
        if (startTimeBuilder_ == null) {
          startTime_ = builderForValue.build();
          onChanged();
        } else {
          startTimeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time start_time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Log start time
       * </pre>
       */
      public Builder mergeStartTime(gazebo.msgs.GzTime.Time value) {
        if (startTimeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              startTime_ != gazebo.msgs.GzTime.Time.getDefaultInstance()) {
            startTime_ =
              gazebo.msgs.GzTime.Time.newBuilder(startTime_).mergeFrom(value).buildPartial();
          } else {
            startTime_ = value;
          }
          onChanged();
        } else {
          startTimeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time start_time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Log start time
       * </pre>
       */
      public Builder clearStartTime() {
        if (startTimeBuilder_ == null) {
          startTime_ = gazebo.msgs.GzTime.Time.getDefaultInstance();
          onChanged();
        } else {
          startTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time start_time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Log start time
       * </pre>
       */
      public gazebo.msgs.GzTime.Time.Builder getStartTimeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getStartTimeFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Time start_time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Log start time
       * </pre>
       */
      public gazebo.msgs.GzTime.TimeOrBuilder getStartTimeOrBuilder() {
        if (startTimeBuilder_ != null) {
          return startTimeBuilder_.getMessageOrBuilder();
        } else {
          return startTime_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Time start_time = 1;</code>
       *
       * <pre>
       *&#47; &#92;brief Log start time
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzTime.Time, gazebo.msgs.GzTime.Time.Builder, gazebo.msgs.GzTime.TimeOrBuilder> 
          getStartTimeFieldBuilder() {
        if (startTimeBuilder_ == null) {
          startTimeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              gazebo.msgs.GzTime.Time, gazebo.msgs.GzTime.Time.Builder, gazebo.msgs.GzTime.TimeOrBuilder>(
                  startTime_,
                  getParentForChildren(),
                  isClean());
          startTime_ = null;
        }
        return startTimeBuilder_;
      }

      // required .gazebo.msgs.Time end_time = 2;
      private gazebo.msgs.GzTime.Time endTime_ = gazebo.msgs.GzTime.Time.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzTime.Time, gazebo.msgs.GzTime.Time.Builder, gazebo.msgs.GzTime.TimeOrBuilder> endTimeBuilder_;
      /**
       * <code>required .gazebo.msgs.Time end_time = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Log end time
       * </pre>
       */
      public boolean hasEndTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .gazebo.msgs.Time end_time = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Log end time
       * </pre>
       */
      public gazebo.msgs.GzTime.Time getEndTime() {
        if (endTimeBuilder_ == null) {
          return endTime_;
        } else {
          return endTimeBuilder_.getMessage();
        }
      }
      /**
       * <code>required .gazebo.msgs.Time end_time = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Log end time
       * </pre>
       */
      public Builder setEndTime(gazebo.msgs.GzTime.Time value) {
        if (endTimeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          endTime_ = value;
          onChanged();
        } else {
          endTimeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time end_time = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Log end time
       * </pre>
       */
      public Builder setEndTime(
          gazebo.msgs.GzTime.Time.Builder builderForValue) {
        if (endTimeBuilder_ == null) {
          endTime_ = builderForValue.build();
          onChanged();
        } else {
          endTimeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time end_time = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Log end time
       * </pre>
       */
      public Builder mergeEndTime(gazebo.msgs.GzTime.Time value) {
        if (endTimeBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              endTime_ != gazebo.msgs.GzTime.Time.getDefaultInstance()) {
            endTime_ =
              gazebo.msgs.GzTime.Time.newBuilder(endTime_).mergeFrom(value).buildPartial();
          } else {
            endTime_ = value;
          }
          onChanged();
        } else {
          endTimeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time end_time = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Log end time
       * </pre>
       */
      public Builder clearEndTime() {
        if (endTimeBuilder_ == null) {
          endTime_ = gazebo.msgs.GzTime.Time.getDefaultInstance();
          onChanged();
        } else {
          endTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .gazebo.msgs.Time end_time = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Log end time
       * </pre>
       */
      public gazebo.msgs.GzTime.Time.Builder getEndTimeBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getEndTimeFieldBuilder().getBuilder();
      }
      /**
       * <code>required .gazebo.msgs.Time end_time = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Log end time
       * </pre>
       */
      public gazebo.msgs.GzTime.TimeOrBuilder getEndTimeOrBuilder() {
        if (endTimeBuilder_ != null) {
          return endTimeBuilder_.getMessageOrBuilder();
        } else {
          return endTime_;
        }
      }
      /**
       * <code>required .gazebo.msgs.Time end_time = 2;</code>
       *
       * <pre>
       *&#47; &#92;brief Log end time
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          gazebo.msgs.GzTime.Time, gazebo.msgs.GzTime.Time.Builder, gazebo.msgs.GzTime.TimeOrBuilder> 
          getEndTimeFieldBuilder() {
        if (endTimeBuilder_ == null) {
          endTimeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              gazebo.msgs.GzTime.Time, gazebo.msgs.GzTime.Time.Builder, gazebo.msgs.GzTime.TimeOrBuilder>(
                  endTime_,
                  getParentForChildren(),
                  isClean());
          endTime_ = null;
        }
        return endTimeBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:gazebo.msgs.LogPlaybackStatistics)
    }

    static {
      defaultInstance = new LogPlaybackStatistics(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gazebo.msgs.LogPlaybackStatistics)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gazebo_msgs_LogPlaybackStatistics_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gazebo_msgs_LogPlaybackStatistics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030log_playback_stats.proto\022\013gazebo.msgs\032" +
      "\ntime.proto\"c\n\025LogPlaybackStatistics\022%\n\n" +
      "start_time\030\001 \002(\0132\021.gazebo.msgs.Time\022#\n\010e" +
      "nd_time\030\002 \002(\0132\021.gazebo.msgs.TimeB\024B\022GzLo" +
      "gPlaybackStats"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gazebo_msgs_LogPlaybackStatistics_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gazebo_msgs_LogPlaybackStatistics_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gazebo_msgs_LogPlaybackStatistics_descriptor,
              new java.lang.String[] { "StartTime", "EndTime", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gazebo.msgs.GzTime.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
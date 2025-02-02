// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityGetRecvGiftListRsp.proto

package emu.grasscutter.net.proto;

public final class ActivityGetRecvGiftListRspOuterClass {
  private ActivityGetRecvGiftListRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityGetRecvGiftListRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityGetRecvGiftListRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 schedule_id = 7;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData> 
        getRecvGiftListList();
    /**
     * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
     */
    emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData getRecvGiftList(int index);
    /**
     * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
     */
    int getRecvGiftListCount();
    /**
     * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftDataOrBuilder> 
        getRecvGiftListOrBuilderList();
    /**
     * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
     */
    emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftDataOrBuilder getRecvGiftListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 8266
   * Obf: JPDDFNPJNHD
   * </pre>
   *
   * Protobuf type {@code ActivityGetRecvGiftListRsp}
   */
  public static final class ActivityGetRecvGiftListRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityGetRecvGiftListRsp)
      ActivityGetRecvGiftListRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityGetRecvGiftListRsp.newBuilder() to construct.
    private ActivityGetRecvGiftListRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityGetRecvGiftListRsp() {
      recvGiftList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityGetRecvGiftListRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActivityGetRecvGiftListRsp(
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
            case 26: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                recvGiftList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData>();
                mutable_bitField0_ |= 0x00000001;
              }
              recvGiftList_.add(
                  input.readMessage(emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData.parser(), extensionRegistry));
              break;
            }
            case 56: {

              scheduleId_ = input.readUInt32();
              break;
            }
            case 112: {

              retcode_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          recvGiftList_ = java.util.Collections.unmodifiableList(recvGiftList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.internal_static_ActivityGetRecvGiftListRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.internal_static_ActivityGetRecvGiftListRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp.class, emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp.Builder.class);
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 7;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 7;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int RECV_GIFT_LIST_FIELD_NUMBER = 3;
    private java.util.List<emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData> recvGiftList_;
    /**
     * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData> getRecvGiftListList() {
      return recvGiftList_;
    }
    /**
     * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftDataOrBuilder> 
        getRecvGiftListOrBuilderList() {
      return recvGiftList_;
    }
    /**
     * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
     */
    @java.lang.Override
    public int getRecvGiftListCount() {
      return recvGiftList_.size();
    }
    /**
     * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData getRecvGiftList(int index) {
      return recvGiftList_.get(index);
    }
    /**
     * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftDataOrBuilder getRecvGiftListOrBuilder(
        int index) {
      return recvGiftList_.get(index);
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
      for (int i = 0; i < recvGiftList_.size(); i++) {
        output.writeMessage(3, recvGiftList_.get(i));
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(7, scheduleId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < recvGiftList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, recvGiftList_.get(i));
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, scheduleId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp other = (emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp) obj;

      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getRecvGiftListList()
          .equals(other.getRecvGiftListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getRecvGiftListCount() > 0) {
        hash = (37 * hash) + RECV_GIFT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRecvGiftListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp prototype) {
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
     * CmdId: 8266
     * Obf: JPDDFNPJNHD
     * </pre>
     *
     * Protobuf type {@code ActivityGetRecvGiftListRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityGetRecvGiftListRsp)
        emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.internal_static_ActivityGetRecvGiftListRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.internal_static_ActivityGetRecvGiftListRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp.class, emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp.newBuilder()
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
          getRecvGiftListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        scheduleId_ = 0;

        retcode_ = 0;

        if (recvGiftListBuilder_ == null) {
          recvGiftList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          recvGiftListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.internal_static_ActivityGetRecvGiftListRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp build() {
        emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp buildPartial() {
        emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp result = new emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp(this);
        int from_bitField0_ = bitField0_;
        result.scheduleId_ = scheduleId_;
        result.retcode_ = retcode_;
        if (recvGiftListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            recvGiftList_ = java.util.Collections.unmodifiableList(recvGiftList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.recvGiftList_ = recvGiftList_;
        } else {
          result.recvGiftList_ = recvGiftListBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp) {
          return mergeFrom((emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp other) {
        if (other == emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp.getDefaultInstance()) return this;
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (recvGiftListBuilder_ == null) {
          if (!other.recvGiftList_.isEmpty()) {
            if (recvGiftList_.isEmpty()) {
              recvGiftList_ = other.recvGiftList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRecvGiftListIsMutable();
              recvGiftList_.addAll(other.recvGiftList_);
            }
            onChanged();
          }
        } else {
          if (!other.recvGiftList_.isEmpty()) {
            if (recvGiftListBuilder_.isEmpty()) {
              recvGiftListBuilder_.dispose();
              recvGiftListBuilder_ = null;
              recvGiftList_ = other.recvGiftList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              recvGiftListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRecvGiftListFieldBuilder() : null;
            } else {
              recvGiftListBuilder_.addAllMessages(other.recvGiftList_);
            }
          }
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
        emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 7;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 7;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData> recvGiftList_ =
        java.util.Collections.emptyList();
      private void ensureRecvGiftListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          recvGiftList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData>(recvGiftList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData, emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData.Builder, emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftDataOrBuilder> recvGiftListBuilder_;

      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData> getRecvGiftListList() {
        if (recvGiftListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(recvGiftList_);
        } else {
          return recvGiftListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public int getRecvGiftListCount() {
        if (recvGiftListBuilder_ == null) {
          return recvGiftList_.size();
        } else {
          return recvGiftListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData getRecvGiftList(int index) {
        if (recvGiftListBuilder_ == null) {
          return recvGiftList_.get(index);
        } else {
          return recvGiftListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public Builder setRecvGiftList(
          int index, emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData value) {
        if (recvGiftListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecvGiftListIsMutable();
          recvGiftList_.set(index, value);
          onChanged();
        } else {
          recvGiftListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public Builder setRecvGiftList(
          int index, emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData.Builder builderForValue) {
        if (recvGiftListBuilder_ == null) {
          ensureRecvGiftListIsMutable();
          recvGiftList_.set(index, builderForValue.build());
          onChanged();
        } else {
          recvGiftListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public Builder addRecvGiftList(emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData value) {
        if (recvGiftListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecvGiftListIsMutable();
          recvGiftList_.add(value);
          onChanged();
        } else {
          recvGiftListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public Builder addRecvGiftList(
          int index, emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData value) {
        if (recvGiftListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecvGiftListIsMutable();
          recvGiftList_.add(index, value);
          onChanged();
        } else {
          recvGiftListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public Builder addRecvGiftList(
          emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData.Builder builderForValue) {
        if (recvGiftListBuilder_ == null) {
          ensureRecvGiftListIsMutable();
          recvGiftList_.add(builderForValue.build());
          onChanged();
        } else {
          recvGiftListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public Builder addRecvGiftList(
          int index, emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData.Builder builderForValue) {
        if (recvGiftListBuilder_ == null) {
          ensureRecvGiftListIsMutable();
          recvGiftList_.add(index, builderForValue.build());
          onChanged();
        } else {
          recvGiftListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public Builder addAllRecvGiftList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData> values) {
        if (recvGiftListBuilder_ == null) {
          ensureRecvGiftListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, recvGiftList_);
          onChanged();
        } else {
          recvGiftListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public Builder clearRecvGiftList() {
        if (recvGiftListBuilder_ == null) {
          recvGiftList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          recvGiftListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public Builder removeRecvGiftList(int index) {
        if (recvGiftListBuilder_ == null) {
          ensureRecvGiftListIsMutable();
          recvGiftList_.remove(index);
          onChanged();
        } else {
          recvGiftListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData.Builder getRecvGiftListBuilder(
          int index) {
        return getRecvGiftListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftDataOrBuilder getRecvGiftListOrBuilder(
          int index) {
        if (recvGiftListBuilder_ == null) {
          return recvGiftList_.get(index);  } else {
          return recvGiftListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftDataOrBuilder> 
           getRecvGiftListOrBuilderList() {
        if (recvGiftListBuilder_ != null) {
          return recvGiftListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(recvGiftList_);
        }
      }
      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData.Builder addRecvGiftListBuilder() {
        return getRecvGiftListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData.getDefaultInstance());
      }
      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData.Builder addRecvGiftListBuilder(
          int index) {
        return getRecvGiftListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData.getDefaultInstance());
      }
      /**
       * <code>repeated .ActivityRecvGiftData recv_gift_list = 3;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData.Builder> 
           getRecvGiftListBuilderList() {
        return getRecvGiftListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData, emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData.Builder, emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftDataOrBuilder> 
          getRecvGiftListFieldBuilder() {
        if (recvGiftListBuilder_ == null) {
          recvGiftListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData, emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftData.Builder, emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.ActivityRecvGiftDataOrBuilder>(
                  recvGiftList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          recvGiftList_ = null;
        }
        return recvGiftListBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ActivityGetRecvGiftListRsp)
    }

    // @@protoc_insertion_point(class_scope:ActivityGetRecvGiftListRsp)
    private static final emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp();
    }

    public static emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityGetRecvGiftListRsp>
        PARSER = new com.google.protobuf.AbstractParser<ActivityGetRecvGiftListRsp>() {
      @java.lang.Override
      public ActivityGetRecvGiftListRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivityGetRecvGiftListRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActivityGetRecvGiftListRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityGetRecvGiftListRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ActivityGetRecvGiftListRspOuterClass.ActivityGetRecvGiftListRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityGetRecvGiftListRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityGetRecvGiftListRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ActivityGetRecvGiftListRsp.proto\032\032Acti" +
      "vityRecvGiftData.proto\"q\n\032ActivityGetRec" +
      "vGiftListRsp\022\023\n\013schedule_id\030\007 \001(\r\022\017\n\007ret" +
      "code\030\016 \001(\005\022-\n\016recv_gift_list\030\003 \003(\0132\025.Act" +
      "ivityRecvGiftDataB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.getDescriptor(),
        });
    internal_static_ActivityGetRecvGiftListRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityGetRecvGiftListRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityGetRecvGiftListRsp_descriptor,
        new java.lang.String[] { "ScheduleId", "Retcode", "RecvGiftList", });
    emu.grasscutter.net.proto.ActivityRecvGiftDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

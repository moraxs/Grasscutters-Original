// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriChessEquipCardReq.proto

package emu.grasscutter.net.proto;

public final class IrodoriChessEquipCardReqOuterClass {
    private IrodoriChessEquipCardReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface IrodoriChessEquipCardReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:IrodoriChessEquipCardReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>bool is_hard_map = 7;</code>
         *
         * @return The isHardMap.
         */
        boolean getIsHardMap();

        /**
         * <code>uint32 card_id = 11;</code>
         *
         * @return The cardId.
         */
        int getCardId();

        /**
         * <code>uint32 level_id = 10;</code>
         *
         * @return The levelId.
         */
        int getLevelId();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 8466
     * Name: HGIEPCDKBPA
     * </pre>
     *
     * Protobuf type {@code IrodoriChessEquipCardReq}
     */
    public static final class IrodoriChessEquipCardReq extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:IrodoriChessEquipCardReq)
            IrodoriChessEquipCardReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use IrodoriChessEquipCardReq.newBuilder() to construct.
        private IrodoriChessEquipCardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private IrodoriChessEquipCardReq() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new IrodoriChessEquipCardReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private IrodoriChessEquipCardReq(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
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
                        case 56:
                            {
                                isHardMap_ = input.readBool();
                                break;
                            }
                        case 80:
                            {
                                levelId_ = input.readUInt32();
                                break;
                            }
                        case 88:
                            {
                                cardId_ = input.readUInt32();
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                    .internal_static_IrodoriChessEquipCardReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                    .internal_static_IrodoriChessEquipCardReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq
                                    .class,
                            emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq
                                    .Builder.class);
        }

        public static final int IS_HARD_MAP_FIELD_NUMBER = 7;
        private boolean isHardMap_;
        /**
         * <code>bool is_hard_map = 7;</code>
         *
         * @return The isHardMap.
         */
        @java.lang.Override
        public boolean getIsHardMap() {
            return isHardMap_;
        }

        public static final int CARD_ID_FIELD_NUMBER = 11;
        private int cardId_;
        /**
         * <code>uint32 card_id = 11;</code>
         *
         * @return The cardId.
         */
        @java.lang.Override
        public int getCardId() {
            return cardId_;
        }

        public static final int LEVEL_ID_FIELD_NUMBER = 10;
        private int levelId_;
        /**
         * <code>uint32 level_id = 10;</code>
         *
         * @return The levelId.
         */
        @java.lang.Override
        public int getLevelId() {
            return levelId_;
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
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (isHardMap_ != false) {
                output.writeBool(7, isHardMap_);
            }
            if (levelId_ != 0) {
                output.writeUInt32(10, levelId_);
            }
            if (cardId_ != 0) {
                output.writeUInt32(11, cardId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (isHardMap_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(7, isHardMap_);
            }
            if (levelId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(10, levelId_);
            }
            if (cardId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(11, cardId_);
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
            if (!(obj
                    instanceof
                    emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq other =
                    (emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq)
                            obj;

            if (getIsHardMap() != other.getIsHardMap()) return false;
            if (getCardId() != other.getCardId()) return false;
            if (getLevelId() != other.getLevelId()) return false;
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
            hash = (37 * hash) + IS_HARD_MAP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsHardMap());
            hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
            hash = (53 * hash) + getCardId();
            hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
            hash = (53 * hash) + getLevelId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .IrodoriChessEquipCardReq
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .IrodoriChessEquipCardReq
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .IrodoriChessEquipCardReq
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .IrodoriChessEquipCardReq
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .IrodoriChessEquipCardReq
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .IrodoriChessEquipCardReq
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .IrodoriChessEquipCardReq
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .IrodoriChessEquipCardReq
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .IrodoriChessEquipCardReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .IrodoriChessEquipCardReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .IrodoriChessEquipCardReq
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .IrodoriChessEquipCardReq
                parseFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq
                        prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         *
         *
         * <pre>
         * CmdId: 8466
         * Name: HGIEPCDKBPA
         * </pre>
         *
         * Protobuf type {@code IrodoriChessEquipCardReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:IrodoriChessEquipCardReq)
                emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .IrodoriChessEquipCardReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .internal_static_IrodoriChessEquipCardReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .internal_static_IrodoriChessEquipCardReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                                        .IrodoriChessEquipCardReq.class,
                                emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                                        .IrodoriChessEquipCardReq.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                isHardMap_ = false;

                cardId_ = 0;

                levelId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .internal_static_IrodoriChessEquipCardReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq
                    build() {
                emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq
                    buildPartial() {
                emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq
                        result =
                                new emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                                        .IrodoriChessEquipCardReq(this);
                result.isHardMap_ = isHardMap_;
                result.cardId_ = cardId_;
                result.levelId_ = levelId_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other
                        instanceof
                        emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                                            .IrodoriChessEquipCardReq)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq
                            other) {
                if (other
                        == emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq
                                .getDefaultInstance()) return this;
                if (other.getIsHardMap() != false) {
                    setIsHardMap(other.getIsHardMap());
                }
                if (other.getCardId() != 0) {
                    setCardId(other.getCardId());
                }
                if (other.getLevelId() != 0) {
                    setLevelId(other.getLevelId());
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
                emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                                            .IrodoriChessEquipCardReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private boolean isHardMap_;
            /**
             * <code>bool is_hard_map = 7;</code>
             *
             * @return The isHardMap.
             */
            @java.lang.Override
            public boolean getIsHardMap() {
                return isHardMap_;
            }
            /**
             * <code>bool is_hard_map = 7;</code>
             *
             * @param value The isHardMap to set.
             * @return This builder for chaining.
             */
            public Builder setIsHardMap(boolean value) {

                isHardMap_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_hard_map = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsHardMap() {

                isHardMap_ = false;
                onChanged();
                return this;
            }

            private int cardId_;
            /**
             * <code>uint32 card_id = 11;</code>
             *
             * @return The cardId.
             */
            @java.lang.Override
            public int getCardId() {
                return cardId_;
            }
            /**
             * <code>uint32 card_id = 11;</code>
             *
             * @param value The cardId to set.
             * @return This builder for chaining.
             */
            public Builder setCardId(int value) {

                cardId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 card_id = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCardId() {

                cardId_ = 0;
                onChanged();
                return this;
            }

            private int levelId_;
            /**
             * <code>uint32 level_id = 10;</code>
             *
             * @return The levelId.
             */
            @java.lang.Override
            public int getLevelId() {
                return levelId_;
            }
            /**
             * <code>uint32 level_id = 10;</code>
             *
             * @param value The levelId to set.
             * @return This builder for chaining.
             */
            public Builder setLevelId(int value) {

                levelId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 level_id = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLevelId() {

                levelId_ = 0;
                onChanged();
                return this;
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

            // @@protoc_insertion_point(builder_scope:IrodoriChessEquipCardReq)
        }

        // @@protoc_insertion_point(class_scope:IrodoriChessEquipCardReq)
        private static final emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .IrodoriChessEquipCardReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                            .IrodoriChessEquipCardReq();
        }

        public static emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass
                        .IrodoriChessEquipCardReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<IrodoriChessEquipCardReq> PARSER =
                new com.google.protobuf.AbstractParser<IrodoriChessEquipCardReq>() {
                    @java.lang.Override
                    public IrodoriChessEquipCardReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new IrodoriChessEquipCardReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<IrodoriChessEquipCardReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<IrodoriChessEquipCardReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.IrodoriChessEquipCardReqOuterClass.IrodoriChessEquipCardReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_IrodoriChessEquipCardReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_IrodoriChessEquipCardReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\036IrodoriChessEquipCardReq.proto\"R\n\030Irod"
                    + "oriChessEquipCardReq\022\023\n\013is_hard_map\030\007 \001("
                    + "\010\022\017\n\007card_id\030\013 \001(\r\022\020\n\010level_id\030\n \001(\rB!\n\031"
                    + "emu.grasscutter.net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_IrodoriChessEquipCardReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_IrodoriChessEquipCardReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_IrodoriChessEquipCardReq_descriptor,
                        new java.lang.String[] {
                            "IsHardMap", "CardId", "LevelId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FleurFairMusicRecord.proto

package emu.grasscutter.net.proto;

public final class FleurFairMusicRecordOuterClass {
    private FleurFairMusicRecordOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface FleurFairMusicRecordOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:FleurFairMusicRecord)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 max_score = 2;</code>
         *
         * @return The maxScore.
         */
        int getMaxScore();

        /**
         * <code>bool is_unlock = 6;</code>
         *
         * @return The isUnlock.
         */
        boolean getIsUnlock();

        /**
         * <code>uint32 max_combo = 13;</code>
         *
         * @return The maxCombo.
         */
        int getMaxCombo();
    }
    /**
     *
     *
     * <pre>
     * Name: IMGLNGHDKNK
     * </pre>
     *
     * Protobuf type {@code FleurFairMusicRecord}
     */
    public static final class FleurFairMusicRecord extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:FleurFairMusicRecord)
            FleurFairMusicRecordOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use FleurFairMusicRecord.newBuilder() to construct.
        private FleurFairMusicRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private FleurFairMusicRecord() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new FleurFairMusicRecord();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private FleurFairMusicRecord(
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
                        case 16:
                            {
                                maxScore_ = input.readUInt32();
                                break;
                            }
                        case 48:
                            {
                                isUnlock_ = input.readBool();
                                break;
                            }
                        case 104:
                            {
                                maxCombo_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass
                    .internal_static_FleurFairMusicRecord_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass
                    .internal_static_FleurFairMusicRecord_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord.class,
                            emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord.Builder
                                    .class);
        }

        public static final int MAX_SCORE_FIELD_NUMBER = 2;
        private int maxScore_;
        /**
         * <code>uint32 max_score = 2;</code>
         *
         * @return The maxScore.
         */
        @java.lang.Override
        public int getMaxScore() {
            return maxScore_;
        }

        public static final int IS_UNLOCK_FIELD_NUMBER = 6;
        private boolean isUnlock_;
        /**
         * <code>bool is_unlock = 6;</code>
         *
         * @return The isUnlock.
         */
        @java.lang.Override
        public boolean getIsUnlock() {
            return isUnlock_;
        }

        public static final int MAX_COMBO_FIELD_NUMBER = 13;
        private int maxCombo_;
        /**
         * <code>uint32 max_combo = 13;</code>
         *
         * @return The maxCombo.
         */
        @java.lang.Override
        public int getMaxCombo() {
            return maxCombo_;
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
            if (maxScore_ != 0) {
                output.writeUInt32(2, maxScore_);
            }
            if (isUnlock_ != false) {
                output.writeBool(6, isUnlock_);
            }
            if (maxCombo_ != 0) {
                output.writeUInt32(13, maxCombo_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (maxScore_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(2, maxScore_);
            }
            if (isUnlock_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(6, isUnlock_);
            }
            if (maxCombo_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(13, maxCombo_);
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
                    emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord other =
                    (emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord) obj;

            if (getMaxScore() != other.getMaxScore()) return false;
            if (getIsUnlock() != other.getIsUnlock()) return false;
            if (getMaxCombo() != other.getMaxCombo()) return false;
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
            hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
            hash = (53 * hash) + getMaxScore();
            hash = (37 * hash) + IS_UNLOCK_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsUnlock());
            hash = (37 * hash) + MAX_COMBO_FIELD_NUMBER;
            hash = (53 * hash) + getMaxCombo();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
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
                emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord prototype) {
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
         * Name: IMGLNGHDKNK
         * </pre>
         *
         * Protobuf type {@code FleurFairMusicRecord}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:FleurFairMusicRecord)
                emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecordOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass
                        .internal_static_FleurFairMusicRecord_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass
                        .internal_static_FleurFairMusicRecord_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord.class,
                                emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord.newBuilder()
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
                maxScore_ = 0;

                isUnlock_ = false;

                maxCombo_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass
                        .internal_static_FleurFairMusicRecord_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord build() {
                emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                    buildPartial() {
                emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord result =
                        new emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord(this);
                result.maxScore_ = maxScore_;
                result.isUnlock_ = isUnlock_;
                result.maxCombo_ = maxCombo_;
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
                        emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord other) {
                if (other
                        == emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                                .getDefaultInstance()) return this;
                if (other.getMaxScore() != 0) {
                    setMaxScore(other.getMaxScore());
                }
                if (other.getIsUnlock() != false) {
                    setIsUnlock(other.getIsUnlock());
                }
                if (other.getMaxCombo() != 0) {
                    setMaxCombo(other.getMaxCombo());
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
                emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int maxScore_;
            /**
             * <code>uint32 max_score = 2;</code>
             *
             * @return The maxScore.
             */
            @java.lang.Override
            public int getMaxScore() {
                return maxScore_;
            }
            /**
             * <code>uint32 max_score = 2;</code>
             *
             * @param value The maxScore to set.
             * @return This builder for chaining.
             */
            public Builder setMaxScore(int value) {

                maxScore_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 max_score = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMaxScore() {

                maxScore_ = 0;
                onChanged();
                return this;
            }

            private boolean isUnlock_;
            /**
             * <code>bool is_unlock = 6;</code>
             *
             * @return The isUnlock.
             */
            @java.lang.Override
            public boolean getIsUnlock() {
                return isUnlock_;
            }
            /**
             * <code>bool is_unlock = 6;</code>
             *
             * @param value The isUnlock to set.
             * @return This builder for chaining.
             */
            public Builder setIsUnlock(boolean value) {

                isUnlock_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_unlock = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsUnlock() {

                isUnlock_ = false;
                onChanged();
                return this;
            }

            private int maxCombo_;
            /**
             * <code>uint32 max_combo = 13;</code>
             *
             * @return The maxCombo.
             */
            @java.lang.Override
            public int getMaxCombo() {
                return maxCombo_;
            }
            /**
             * <code>uint32 max_combo = 13;</code>
             *
             * @param value The maxCombo to set.
             * @return This builder for chaining.
             */
            public Builder setMaxCombo(int value) {

                maxCombo_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 max_combo = 13;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMaxCombo() {

                maxCombo_ = 0;
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

            // @@protoc_insertion_point(builder_scope:FleurFairMusicRecord)
        }

        // @@protoc_insertion_point(class_scope:FleurFairMusicRecord)
        private static final emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass
                        .FleurFairMusicRecord
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord();
        }

        public static emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<FleurFairMusicRecord> PARSER =
                new com.google.protobuf.AbstractParser<FleurFairMusicRecord>() {
                    @java.lang.Override
                    public FleurFairMusicRecord parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new FleurFairMusicRecord(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<FleurFairMusicRecord> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<FleurFairMusicRecord> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.FleurFairMusicRecordOuterClass.FleurFairMusicRecord
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_FleurFairMusicRecord_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_FleurFairMusicRecord_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\032FleurFairMusicRecord.proto\"O\n\024FleurFai"
                    + "rMusicRecord\022\021\n\tmax_score\030\002 \001(\r\022\021\n\tis_un"
                    + "lock\030\006 \001(\010\022\021\n\tmax_combo\030\r \001(\rB!\n\031emu.gra"
                    + "sscutter.net.protoZ\004/genb\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_FleurFairMusicRecord_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FleurFairMusicRecord_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_FleurFairMusicRecord_descriptor,
                        new java.lang.String[] {
                            "MaxScore", "IsUnlock", "MaxCombo",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}

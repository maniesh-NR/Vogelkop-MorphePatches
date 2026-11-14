package defpackage;

import defpackage.bjb;
import defpackage.j4o;
import java.util.List;

/* loaded from: classes.dex */
public final class u75 {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;
    private static final int NEXT_TAG_UNSET = 0;
    static final int READ_DONE = Integer.MAX_VALUE;
    private int endGroupTag;
    private final r75 input;
    private int nextTag = 0;
    private int tag;

    private u75(r75 r75Var) {
        r75 r75Var2 = (r75) ifb.checkNotNull(r75Var, "input");
        this.input = r75Var2;
        r75Var2.wrapper = this;
    }

    public static u75 forCodedInput(r75 r75Var) {
        Object obj = r75Var.wrapper;
        return obj != null ? (u75) obj : new u75(r75Var);
    }

    private <T> void mergeGroupFieldInternal(T t, ani aniVar, yk8 yk8Var) throws bjb {
        this.input.checkRecursionLimit();
        int i = this.endGroupTag;
        this.endGroupTag = j4o.makeTag(j4o.getTagFieldNumber(this.tag), 4);
        this.input.groupDepth++;
        try {
            aniVar.mergeFrom(t, this, yk8Var);
            if (this.tag == this.endGroupTag) {
            } else {
                throw bjb.parseFailure();
            }
        } finally {
            r75 r75Var = this.input;
            r75Var.groupDepth--;
            this.endGroupTag = i;
        }
    }

    private <T> void mergeMessageFieldInternal(T t, ani aniVar, yk8 yk8Var) throws bjb {
        int uInt32 = this.input.readUInt32();
        this.input.checkRecursionLimit();
        int iPushLimit = this.input.pushLimit(uInt32);
        this.input.messageDepth++;
        aniVar.mergeFrom(t, this, yk8Var);
        this.input.checkLastTagWas(0);
        r3.messageDepth--;
        this.input.popLimit(iPushLimit);
    }

    private Object readField(j4o.a aVar, Class<?> cls, yk8 yk8Var) {
        switch (t75.$SwitchMap$com$google$protobuf$WireFormat$FieldType[aVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(readEnum());
            case 5:
                return Integer.valueOf(readFixed32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                return readMessage(cls, yk8Var);
            case 11:
                return Integer.valueOf(readSFixed32());
            case 12:
                return Long.valueOf(readSFixed64());
            case 13:
                return Integer.valueOf(readSInt32());
            case 14:
                return Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return Integer.valueOf(readUInt32());
            case 17:
                return Long.valueOf(readUInt64());
            default:
                qp2.o("unsupported field type.");
                return null;
        }
    }

    private <T> T readGroup(ani aniVar, yk8 yk8Var) throws bjb {
        T t = (T) aniVar.newInstance();
        mergeGroupFieldInternal(t, aniVar, yk8Var);
        aniVar.makeImmutable(t);
        return t;
    }

    private <T> T readMessage(ani aniVar, yk8 yk8Var) throws bjb {
        T t = (T) aniVar.newInstance();
        mergeMessageFieldInternal(t, aniVar, yk8Var);
        aniVar.makeImmutable(t);
        return t;
    }

    private void requirePosition(int i) throws bjb {
        if (this.input.getTotalBytesRead() != i) {
            throw bjb.truncatedMessage();
        }
    }

    private void requireWireType(int i) throws bjb.a {
        if (j4o.getTagWireType(this.tag) != i) {
            throw bjb.invalidWireType();
        }
    }

    private void verifyPackedFixed32Length(int i) throws bjb {
        if ((i & 3) != 0) {
            throw bjb.parseFailure();
        }
    }

    private void verifyPackedFixed64Length(int i) throws bjb {
        if ((i & 7) != 0) {
            throw bjb.parseFailure();
        }
    }

    public int getFieldNumber() {
        int tag = this.nextTag;
        if (tag != 0) {
            this.tag = tag;
            this.nextTag = 0;
        } else {
            tag = this.input.readTag();
            this.tag = tag;
        }
        return (tag == 0 || tag == this.endGroupTag) ? READ_DONE : j4o.getTagFieldNumber(tag);
    }

    public int getTag() {
        return this.tag;
    }

    public <T> void mergeGroupField(T t, ani aniVar, yk8 yk8Var) throws bjb {
        requireWireType(3);
        mergeGroupFieldInternal(t, aniVar, yk8Var);
    }

    public <T> void mergeMessageField(T t, ani aniVar, yk8 yk8Var) throws bjb {
        requireWireType(2);
        mergeMessageFieldInternal(t, aniVar, yk8Var);
    }

    public boolean readBool() throws bjb.a {
        requireWireType(0);
        return this.input.readBool();
    }

    public void readBoolList(List<Boolean> list) throws bjb {
        int tag;
        int tag2;
        boolean z = list instanceof ln3;
        int i = this.tag;
        if (!z) {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 0) {
                do {
                    list.add(Boolean.valueOf(this.input.readBool()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw bjb.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Boolean.valueOf(this.input.readBool()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        ln3 ln3Var = (ln3) list;
        int tagWireType2 = j4o.getTagWireType(i);
        if (tagWireType2 == 0) {
            do {
                ln3Var.addBoolean(this.input.readBool());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw bjb.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            ln3Var.addBoolean(this.input.readBool());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    public v44 readBytes() throws bjb.a {
        requireWireType(2);
        return this.input.readBytes();
    }

    public void readBytesList(List<v44> list) throws bjb.a {
        int tag;
        if (j4o.getTagWireType(this.tag) != 2) {
            throw bjb.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag = this.input.readTag();
            }
        } while (tag == this.tag);
        this.nextTag = tag;
    }

    public double readDouble() throws bjb.a {
        requireWireType(1);
        return this.input.readDouble();
    }

    public void readDoubleList(List<Double> list) throws bjb {
        int tag;
        int tag2;
        boolean z = list instanceof ee7;
        int i = this.tag;
        if (!z) {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 1) {
                do {
                    list.add(Double.valueOf(this.input.readDouble()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw bjb.invalidWireType();
            }
            int uInt32 = this.input.readUInt32();
            verifyPackedFixed64Length(uInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
            do {
                list.add(Double.valueOf(this.input.readDouble()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        ee7 ee7Var = (ee7) list;
        int tagWireType2 = j4o.getTagWireType(i);
        if (tagWireType2 == 1) {
            do {
                ee7Var.addDouble(this.input.readDouble());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw bjb.invalidWireType();
        }
        int uInt322 = this.input.readUInt32();
        verifyPackedFixed64Length(uInt322);
        int totalBytesRead2 = this.input.getTotalBytesRead() + uInt322;
        do {
            ee7Var.addDouble(this.input.readDouble());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    public int readEnum() throws bjb.a {
        requireWireType(0);
        return this.input.readEnum();
    }

    public void readEnumList(List<Integer> list) throws bjb {
        int tag;
        int tag2;
        boolean z = list instanceof nbb;
        int i = this.tag;
        if (!z) {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.input.readEnum()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw bjb.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Integer.valueOf(this.input.readEnum()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        nbb nbbVar = (nbb) list;
        int tagWireType2 = j4o.getTagWireType(i);
        if (tagWireType2 == 0) {
            do {
                nbbVar.addInt(this.input.readEnum());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw bjb.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            nbbVar.addInt(this.input.readEnum());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    public int readFixed32() throws bjb.a {
        requireWireType(5);
        return this.input.readFixed32();
    }

    public void readFixed32List(List<Integer> list) throws bjb {
        int tag;
        int tag2;
        boolean z = list instanceof nbb;
        int i = this.tag;
        if (!z) {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 2) {
                int uInt32 = this.input.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(this.input.readFixed32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw bjb.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.input.readFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        nbb nbbVar = (nbb) list;
        int tagWireType2 = j4o.getTagWireType(i);
        if (tagWireType2 == 2) {
            int uInt322 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt322);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt322;
            do {
                nbbVar.addInt(this.input.readFixed32());
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw bjb.invalidWireType();
        }
        do {
            nbbVar.addInt(this.input.readFixed32());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.tag);
        this.nextTag = tag2;
    }

    public long readFixed64() throws bjb.a {
        requireWireType(1);
        return this.input.readFixed64();
    }

    public void readFixed64List(List<Long> list) throws bjb {
        int tag;
        int tag2;
        boolean z = list instanceof m0d;
        int i = this.tag;
        if (!z) {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(this.input.readFixed64()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw bjb.invalidWireType();
            }
            int uInt32 = this.input.readUInt32();
            verifyPackedFixed64Length(uInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(this.input.readFixed64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        m0d m0dVar = (m0d) list;
        int tagWireType2 = j4o.getTagWireType(i);
        if (tagWireType2 == 1) {
            do {
                m0dVar.addLong(this.input.readFixed64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw bjb.invalidWireType();
        }
        int uInt322 = this.input.readUInt32();
        verifyPackedFixed64Length(uInt322);
        int totalBytesRead2 = this.input.getTotalBytesRead() + uInt322;
        do {
            m0dVar.addLong(this.input.readFixed64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    public float readFloat() throws bjb.a {
        requireWireType(5);
        return this.input.readFloat();
    }

    public void readFloatList(List<Float> list) throws bjb {
        int tag;
        int tag2;
        boolean z = list instanceof q89;
        int i = this.tag;
        if (!z) {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 2) {
                int uInt32 = this.input.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
                do {
                    list.add(Float.valueOf(this.input.readFloat()));
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw bjb.invalidWireType();
            }
            do {
                list.add(Float.valueOf(this.input.readFloat()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        q89 q89Var = (q89) list;
        int tagWireType2 = j4o.getTagWireType(i);
        if (tagWireType2 == 2) {
            int uInt322 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt322);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt322;
            do {
                q89Var.addFloat(this.input.readFloat());
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw bjb.invalidWireType();
        }
        do {
            q89Var.addFloat(this.input.readFloat());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.tag);
        this.nextTag = tag2;
    }

    @Deprecated
    public <T> T readGroup(Class<T> cls, yk8 yk8Var) throws bjb.a {
        requireWireType(3);
        return (T) readGroup(x6h.getInstance().schemaFor(cls), yk8Var);
    }

    @Deprecated
    public <T> T readGroupBySchemaWithCheck(ani aniVar, yk8 yk8Var) throws bjb.a {
        requireWireType(3);
        return (T) readGroup(aniVar, yk8Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public <T> void readGroupList(List<T> list, ani aniVar, yk8 yk8Var) throws bjb.a {
        int tag;
        if (j4o.getTagWireType(this.tag) != 3) {
            throw bjb.invalidWireType();
        }
        int i = this.tag;
        do {
            list.add(readGroup(aniVar, yk8Var));
            if (this.input.isAtEnd() || this.nextTag != 0) {
                return;
            } else {
                tag = this.input.readTag();
            }
        } while (tag == i);
        this.nextTag = tag;
    }

    @Deprecated
    public <T> void readGroupList(List<T> list, Class<T> cls, yk8 yk8Var) throws bjb.a {
        readGroupList(list, x6h.getInstance().schemaFor(cls), yk8Var);
    }

    public int readInt32() throws bjb.a {
        requireWireType(0);
        return this.input.readInt32();
    }

    public void readInt32List(List<Integer> list) throws bjb {
        int tag;
        int tag2;
        boolean z = list instanceof nbb;
        int i = this.tag;
        if (!z) {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.input.readInt32()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw bjb.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Integer.valueOf(this.input.readInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        nbb nbbVar = (nbb) list;
        int tagWireType2 = j4o.getTagWireType(i);
        if (tagWireType2 == 0) {
            do {
                nbbVar.addInt(this.input.readInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw bjb.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            nbbVar.addInt(this.input.readInt32());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    public long readInt64() throws bjb.a {
        requireWireType(0);
        return this.input.readInt64();
    }

    public void readInt64List(List<Long> list) throws bjb {
        int tag;
        int tag2;
        boolean z = list instanceof m0d;
        int i = this.tag;
        if (!z) {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(this.input.readInt64()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw bjb.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Long.valueOf(this.input.readInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        m0d m0dVar = (m0d) list;
        int tagWireType2 = j4o.getTagWireType(i);
        if (tagWireType2 == 0) {
            do {
                m0dVar.addLong(this.input.readInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw bjb.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            m0dVar.addLong(this.input.readInt64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <K, V> void readMap(java.util.Map<K, V> r8, aad.a r9, defpackage.yk8 r10) throws bjb.a {
        /*
            r7 = this;
            r0 = 2
            r7.requireWireType(r0)
            r75 r1 = r7.input
            int r1 = r1.readUInt32()
            r75 r2 = r7.input
            int r1 = r2.pushLimit(r1)
            java.lang.Object r2 = r9.defaultKey
            java.lang.Object r3 = r9.defaultValue
        L14:
            int r4 = r7.getFieldNumber()     // Catch: java.lang.Throwable -> L63
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5a
            r75 r5 = r7.input     // Catch: java.lang.Throwable -> L63
            boolean r5 = r5.isAtEnd()     // Catch: java.lang.Throwable -> L63
            if (r5 != 0) goto L5a
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L45
            if (r4 == r0) goto L38
            boolean r4 = r7.skipField()     // Catch: bjb.a -> L4d java.lang.Throwable -> L63
            if (r4 != 0) goto L14
            bjb r4 = new bjb     // Catch: bjb.a -> L4d java.lang.Throwable -> L63
            r4.<init>(r6)     // Catch: bjb.a -> L4d java.lang.Throwable -> L63
            throw r4     // Catch: bjb.a -> L4d java.lang.Throwable -> L63
        L38:
            j4o$a r4 = r9.valueType     // Catch: bjb.a -> L4d java.lang.Throwable -> L63
            java.lang.Object r5 = r9.defaultValue     // Catch: bjb.a -> L4d java.lang.Throwable -> L63
            java.lang.Class r5 = r5.getClass()     // Catch: bjb.a -> L4d java.lang.Throwable -> L63
            java.lang.Object r3 = r7.readField(r4, r5, r10)     // Catch: bjb.a -> L4d java.lang.Throwable -> L63
            goto L14
        L45:
            j4o$a r4 = r9.keyType     // Catch: bjb.a -> L4d java.lang.Throwable -> L63
            r5 = 0
            java.lang.Object r2 = r7.readField(r4, r5, r5)     // Catch: bjb.a -> L4d java.lang.Throwable -> L63
            goto L14
        L4d:
            r4 = move-exception
            boolean r5 = r7.skipField()     // Catch: java.lang.Throwable -> L63
            if (r5 != 0) goto L14
            bjb r8 = new bjb     // Catch: java.lang.Throwable -> L63
            r8.<init>(r6, r4)     // Catch: java.lang.Throwable -> L63
            throw r8     // Catch: java.lang.Throwable -> L63
        L5a:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L63
            r75 r7 = r7.input
            r7.popLimit(r1)
            return
        L63:
            r8 = move-exception
            r75 r7 = r7.input
            r7.popLimit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u75.readMap(java.util.Map, aad$a, yk8):void");
    }

    public <T> T readMessage(Class<T> cls, yk8 yk8Var) throws bjb.a {
        requireWireType(2);
        return (T) readMessage(x6h.getInstance().schemaFor(cls), yk8Var);
    }

    public <T> T readMessageBySchemaWithCheck(ani aniVar, yk8 yk8Var) throws bjb.a {
        requireWireType(2);
        return (T) readMessage(aniVar, yk8Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void readMessageList(List<T> list, ani aniVar, yk8 yk8Var) throws bjb.a {
        int tag;
        if (j4o.getTagWireType(this.tag) != 2) {
            throw bjb.invalidWireType();
        }
        int i = this.tag;
        do {
            list.add(readMessage(aniVar, yk8Var));
            if (this.input.isAtEnd() || this.nextTag != 0) {
                return;
            } else {
                tag = this.input.readTag();
            }
        } while (tag == i);
        this.nextTag = tag;
    }

    public <T> void readMessageList(List<T> list, Class<T> cls, yk8 yk8Var) throws bjb.a {
        readMessageList(list, x6h.getInstance().schemaFor(cls), yk8Var);
    }

    public int readSFixed32() throws bjb.a {
        requireWireType(5);
        return this.input.readSFixed32();
    }

    public void readSFixed32List(List<Integer> list) throws bjb {
        int tag;
        int tag2;
        boolean z = list instanceof nbb;
        int i = this.tag;
        if (!z) {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 2) {
                int uInt32 = this.input.readUInt32();
                verifyPackedFixed32Length(uInt32);
                int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
                do {
                    list.add(Integer.valueOf(this.input.readSFixed32()));
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                return;
            }
            if (tagWireType != 5) {
                throw bjb.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.input.readSFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        nbb nbbVar = (nbb) list;
        int tagWireType2 = j4o.getTagWireType(i);
        if (tagWireType2 == 2) {
            int uInt322 = this.input.readUInt32();
            verifyPackedFixed32Length(uInt322);
            int totalBytesRead2 = this.input.getTotalBytesRead() + uInt322;
            do {
                nbbVar.addInt(this.input.readSFixed32());
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            return;
        }
        if (tagWireType2 != 5) {
            throw bjb.invalidWireType();
        }
        do {
            nbbVar.addInt(this.input.readSFixed32());
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.tag);
        this.nextTag = tag2;
    }

    public long readSFixed64() throws bjb.a {
        requireWireType(1);
        return this.input.readSFixed64();
    }

    public void readSFixed64List(List<Long> list) throws bjb {
        int tag;
        int tag2;
        boolean z = list instanceof m0d;
        int i = this.tag;
        if (!z) {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 1) {
                do {
                    list.add(Long.valueOf(this.input.readSFixed64()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw bjb.invalidWireType();
            }
            int uInt32 = this.input.readUInt32();
            verifyPackedFixed64Length(uInt32);
            int totalBytesRead = this.input.getTotalBytesRead() + uInt32;
            do {
                list.add(Long.valueOf(this.input.readSFixed64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            return;
        }
        m0d m0dVar = (m0d) list;
        int tagWireType2 = j4o.getTagWireType(i);
        if (tagWireType2 == 1) {
            do {
                m0dVar.addLong(this.input.readSFixed64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw bjb.invalidWireType();
        }
        int uInt322 = this.input.readUInt32();
        verifyPackedFixed64Length(uInt322);
        int totalBytesRead2 = this.input.getTotalBytesRead() + uInt322;
        do {
            m0dVar.addLong(this.input.readSFixed64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
    }

    public int readSInt32() throws bjb.a {
        requireWireType(0);
        return this.input.readSInt32();
    }

    public void readSInt32List(List<Integer> list) throws bjb {
        int tag;
        int tag2;
        boolean z = list instanceof nbb;
        int i = this.tag;
        if (!z) {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.input.readSInt32()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw bjb.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Integer.valueOf(this.input.readSInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        nbb nbbVar = (nbb) list;
        int tagWireType2 = j4o.getTagWireType(i);
        if (tagWireType2 == 0) {
            do {
                nbbVar.addInt(this.input.readSInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw bjb.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            nbbVar.addInt(this.input.readSInt32());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    public long readSInt64() throws bjb.a {
        requireWireType(0);
        return this.input.readSInt64();
    }

    public void readSInt64List(List<Long> list) throws bjb {
        int tag;
        int tag2;
        boolean z = list instanceof m0d;
        int i = this.tag;
        if (!z) {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(this.input.readSInt64()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw bjb.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Long.valueOf(this.input.readSInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        m0d m0dVar = (m0d) list;
        int tagWireType2 = j4o.getTagWireType(i);
        if (tagWireType2 == 0) {
            do {
                m0dVar.addLong(this.input.readSInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw bjb.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            m0dVar.addLong(this.input.readSInt64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    public String readString() throws bjb.a {
        requireWireType(2);
        return this.input.readString();
    }

    public void readStringList(List<String> list) throws bjb.a {
        readStringListInternal(list, false);
    }

    public void readStringListInternal(List<String> list, boolean z) throws bjb.a {
        int tag;
        int tag2;
        if (j4o.getTagWireType(this.tag) != 2) {
            throw bjb.invalidWireType();
        }
        if (!(list instanceof d7c) || z) {
            do {
                list.add(z ? readStringRequireUtf8() : readString());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag = this.input.readTag();
                }
            } while (tag == this.tag);
            this.nextTag = tag;
            return;
        }
        d7c d7cVar = (d7c) list;
        do {
            readBytes();
            d7cVar.N0();
            if (this.input.isAtEnd()) {
                return;
            } else {
                tag2 = this.input.readTag();
            }
        } while (tag2 == this.tag);
        this.nextTag = tag2;
    }

    public void readStringListRequireUtf8(List<String> list) throws bjb.a {
        readStringListInternal(list, true);
    }

    public String readStringRequireUtf8() throws bjb.a {
        requireWireType(2);
        return this.input.readStringRequireUtf8();
    }

    public int readUInt32() throws bjb.a {
        requireWireType(0);
        return this.input.readUInt32();
    }

    public void readUInt32List(List<Integer> list) throws bjb {
        int tag;
        int tag2;
        boolean z = list instanceof nbb;
        int i = this.tag;
        if (!z) {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 0) {
                do {
                    list.add(Integer.valueOf(this.input.readUInt32()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw bjb.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Integer.valueOf(this.input.readUInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        nbb nbbVar = (nbb) list;
        int tagWireType2 = j4o.getTagWireType(i);
        if (tagWireType2 == 0) {
            do {
                nbbVar.addInt(this.input.readUInt32());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw bjb.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            nbbVar.addInt(this.input.readUInt32());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    public long readUInt64() throws bjb.a {
        requireWireType(0);
        return this.input.readUInt64();
    }

    public void readUInt64List(List<Long> list) throws bjb {
        int tag;
        int tag2;
        boolean z = list instanceof m0d;
        int i = this.tag;
        if (!z) {
            int tagWireType = j4o.getTagWireType(i);
            if (tagWireType == 0) {
                do {
                    list.add(Long.valueOf(this.input.readUInt64()));
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        tag = this.input.readTag();
                    }
                } while (tag == this.tag);
                this.nextTag = tag;
                return;
            }
            if (tagWireType != 2) {
                throw bjb.invalidWireType();
            }
            int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(Long.valueOf(this.input.readUInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead);
            requirePosition(totalBytesRead);
            return;
        }
        m0d m0dVar = (m0d) list;
        int tagWireType2 = j4o.getTagWireType(i);
        if (tagWireType2 == 0) {
            do {
                m0dVar.addLong(this.input.readUInt64());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    tag2 = this.input.readTag();
                }
            } while (tag2 == this.tag);
            this.nextTag = tag2;
            return;
        }
        if (tagWireType2 != 2) {
            throw bjb.invalidWireType();
        }
        int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
        do {
            m0dVar.addLong(this.input.readUInt64());
        } while (this.input.getTotalBytesRead() < totalBytesRead2);
        requirePosition(totalBytesRead2);
    }

    public boolean shouldDiscardUnknownFields() {
        return this.input.shouldDiscardUnknownFields();
    }

    public boolean skipField() {
        int i;
        if (this.input.isAtEnd() || (i = this.tag) == this.endGroupTag) {
            return false;
        }
        return this.input.skipField(i);
    }
}

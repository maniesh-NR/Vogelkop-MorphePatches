package defpackage;

/* loaded from: classes.dex */
public abstract class bmm {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    private final void mergeFrom(Object obj, u75 u75Var, int i) {
        while (u75Var.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(obj, u75Var, i)) {
        }
    }

    public abstract void addFixed32(Object obj, int i, int i2);

    public abstract void addFixed64(Object obj, int i, long j);

    public abstract void addGroup(Object obj, int i, Object obj2);

    public abstract void addLengthDelimited(Object obj, int i, v44 v44Var);

    public abstract void addVarint(Object obj, int i, long j);

    public abstract Object getBuilderFromMessage(Object obj);

    public abstract Object getFromMessage(Object obj);

    public abstract int getSerializedSize(Object obj);

    public abstract int getSerializedSizeAsMessageSet(Object obj);

    public abstract void makeImmutable(Object obj);

    public abstract Object merge(Object obj, Object obj2);

    public final boolean mergeOneFieldFrom(Object obj, u75 u75Var, int i) throws bjb {
        int tag = u75Var.getTag();
        int tagFieldNumber = j4o.getTagFieldNumber(tag);
        int tagWireType = j4o.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(obj, tagFieldNumber, u75Var.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(obj, tagFieldNumber, u75Var.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(obj, tagFieldNumber, u75Var.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                if (i != 0) {
                    return false;
                }
                throw bjb.invalidEndTag();
            }
            if (tagWireType != 5) {
                throw bjb.invalidWireType();
            }
            addFixed32(obj, tagFieldNumber, u75Var.readFixed32());
            return true;
        }
        Object objNewBuilder = newBuilder();
        int iMakeTag = j4o.makeTag(tagFieldNumber, 4);
        int i2 = i + 1;
        if (i2 >= recursionLimit) {
            throw bjb.recursionLimitExceeded();
        }
        mergeFrom(objNewBuilder, u75Var, i2);
        if (iMakeTag != u75Var.getTag()) {
            throw bjb.invalidEndTag();
        }
        addGroup(obj, tagFieldNumber, toImmutable(objNewBuilder));
        return true;
    }

    public abstract Object newBuilder();

    public abstract void setBuilderToMessage(Object obj, Object obj2);

    public void setRecursionLimit(int i) {
        recursionLimit = i;
    }

    public abstract void setToMessage(Object obj, Object obj2);

    public abstract boolean shouldDiscardUnknownFields(u75 u75Var);

    public abstract Object toImmutable(Object obj);

    public abstract void writeAsMessageSetTo(Object obj, a85 a85Var);

    public abstract void writeTo(Object obj, a85 a85Var);
}

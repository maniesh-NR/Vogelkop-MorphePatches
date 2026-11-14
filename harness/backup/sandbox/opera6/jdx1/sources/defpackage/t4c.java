package defpackage;

/* loaded from: classes.dex */
public class t4c {
    private volatile boolean corrupted;
    private final rvd defaultInstance;
    private v44 delayedBytes;
    private yk8 extensionRegistry;
    private volatile v44 memoizedBytes;
    protected volatile rvd value;

    public t4c() {
        this.defaultInstance = null;
    }

    public t4c(rvd rvdVar, yk8 yk8Var, v44 v44Var) {
        checkArguments(yk8Var, v44Var);
        this.defaultInstance = rvdVar;
        this.extensionRegistry = yk8Var;
        this.delayedBytes = v44Var;
    }

    public t4c(yk8 yk8Var, v44 v44Var) {
        checkArguments(yk8Var, v44Var);
        this.extensionRegistry = yk8Var;
        this.delayedBytes = v44Var;
        this.defaultInstance = null;
    }

    private static void checkArguments(yk8 yk8Var, v44 v44Var) {
        if (yk8Var == null) {
            t3p.q("found null ExtensionRegistry");
        } else {
            if (v44Var != null) {
                return;
            }
            t3p.q("found null ByteString");
        }
    }

    public static t4c fromValue(rvd rvdVar) {
        t4c t4cVar = new t4c();
        t4cVar.setValue(rvdVar);
        return t4cVar;
    }

    private void mergeValue(t4c t4cVar) {
        if (this.value == null && t4cVar.value != null) {
            setValue(getValue(t4cVar.value.getDefaultInstanceForType()).toBuilder().mergeFrom(t4cVar.value).build());
        } else if (this.value == null || t4cVar.value != null) {
            setValue(this.value.toBuilder().mergeFrom(t4cVar.value).build());
        } else {
            setValue(mergeValueAndBytes(this.value, t4cVar.delayedBytes, t4cVar.extensionRegistry));
        }
    }

    private static rvd mergeValueAndBytes(rvd rvdVar, v44 v44Var, yk8 yk8Var) {
        try {
            return rvdVar.toBuilder().mergeFrom(v44Var, yk8Var).build();
        } catch (bjb unused) {
            return rvdVar;
        }
    }

    public void clear() {
        this.delayedBytes = null;
        this.value = null;
        this.memoizedBytes = null;
    }

    public int computeMessageSetExtensionSize(int i) {
        return computeSize(3) + y75.computeUInt32Size(2, i) + (y75.computeTagSize(1) << 1);
    }

    public int computeSize(int i) {
        return computeSizeNoTag() + y75.computeTagSize(i);
    }

    public int computeSizeNoTag() {
        return y75.computeLengthDelimitedFieldSize(getSerializedSize());
    }

    public boolean containsDefaultInstance() {
        v44 v44Var;
        if (this.memoizedBytes != null && this.memoizedBytes.isEmpty()) {
            return true;
        }
        if (this.value == null && ((v44Var = this.delayedBytes) == null || v44Var.isEmpty())) {
            return true;
        }
        return this.defaultInstance != null && this.value == this.defaultInstance;
    }

    public void ensureInitialized(rvd rvdVar) {
        if (this.value == null) {
            synchronized (this) {
                if (this.value != null) {
                    return;
                }
                try {
                    if (this.delayedBytes != null) {
                        this.value = (rvd) rvdVar.getParserForType().parseFrom(this.delayedBytes, this.extensionRegistry);
                        this.memoizedBytes = this.delayedBytes;
                    } else {
                        this.value = rvdVar;
                        this.memoizedBytes = v44.EMPTY;
                    }
                } catch (bjb unused) {
                    this.corrupted = true;
                    this.value = rvdVar;
                    this.memoizedBytes = v44.EMPTY;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4c)) {
            return false;
        }
        t4c t4cVar = (t4c) obj;
        rvd rvdVar = this.value;
        rvd rvdVar2 = t4cVar.value;
        return rvdVar == null ? rvdVar2 == null ? toByteString().equals(t4cVar.toByteString()) : getValue(rvdVar2.getDefaultInstanceForType()).equals(rvdVar2) : rvdVar2 != null ? rvdVar.equals(rvdVar2) : rvdVar.equals(t4cVar.getValue(rvdVar.getDefaultInstanceForType()));
    }

    public int getSerializedSize() {
        v44 v44Var = this.delayedBytes;
        if (v44Var != null) {
            return v44Var.size();
        }
        if (this.memoizedBytes != null) {
            return this.memoizedBytes.size();
        }
        if (this.value != null) {
            return this.value.getSerializedSize();
        }
        return 0;
    }

    public rvd getValue() {
        return getValue(this.defaultInstance);
    }

    @Deprecated
    public rvd getValue(rvd rvdVar) {
        ensureInitialized(rvdVar);
        return this.value;
    }

    public int hashCode() {
        return 1;
    }

    public boolean isCorrupted() {
        return this.corrupted;
    }

    public void merge(t4c t4cVar) {
        v44 v44Var;
        if (t4cVar.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(t4cVar);
            return;
        }
        yk8 yk8Var = this.extensionRegistry;
        if (yk8Var == null) {
            yk8Var = t4cVar.extensionRegistry;
            this.extensionRegistry = yk8Var;
        }
        v44 v44Var2 = this.delayedBytes;
        if (v44Var2 != null && (v44Var = t4cVar.delayedBytes) != null && yk8Var == t4cVar.extensionRegistry) {
            this.delayedBytes = v44Var2.concat(v44Var);
            return;
        }
        if (this.value != null || t4cVar.value != null) {
            mergeValue(t4cVar);
        } else if (this.defaultInstance == null) {
            this.delayedBytes = this.delayedBytes.concat(t4cVar.delayedBytes);
        } else {
            setValue(mergeValueAndBytes(getValue(), t4cVar.delayedBytes, t4cVar.extensionRegistry));
        }
    }

    public void mergeFrom(r75 r75Var, yk8 yk8Var) {
        if (containsDefaultInstance()) {
            setByteString(r75Var.readBytes(), yk8Var);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = yk8Var;
        }
        v44 v44Var = this.delayedBytes;
        if (v44Var != null) {
            setByteString(v44Var.concat(r75Var.readBytes()), this.extensionRegistry);
        } else {
            try {
                setValue(this.value.toBuilder().mergeFrom(r75Var, yk8Var).build());
            } catch (bjb unused) {
            }
        }
    }

    public void set(t4c t4cVar) {
        this.delayedBytes = t4cVar.delayedBytes;
        this.value = t4cVar.value;
        this.memoizedBytes = t4cVar.memoizedBytes;
        yk8 yk8Var = t4cVar.extensionRegistry;
        if (yk8Var != null) {
            this.extensionRegistry = yk8Var;
        }
    }

    public void setByteString(v44 v44Var, yk8 yk8Var) {
        checkArguments(yk8Var, v44Var);
        this.delayedBytes = v44Var;
        this.extensionRegistry = yk8Var;
        this.value = null;
        this.memoizedBytes = null;
    }

    public rvd setValue(rvd rvdVar) {
        rvd rvdVar2 = this.value;
        this.delayedBytes = null;
        this.memoizedBytes = null;
        this.value = rvdVar;
        return rvdVar2;
    }

    public v44 toByteString() {
        v44 v44Var = this.delayedBytes;
        if (v44Var != null) {
            return v44Var;
        }
        if (this.memoizedBytes != null) {
            return this.memoizedBytes;
        }
        synchronized (this) {
            if (this.memoizedBytes != null) {
                return this.memoizedBytes;
            }
            if (this.value == null) {
                this.memoizedBytes = v44.EMPTY;
            } else {
                this.memoizedBytes = this.value.toByteString();
            }
            return this.memoizedBytes;
        }
    }

    public void writeTo(a85 a85Var, int i) {
        if (this.memoizedBytes != null) {
            a85Var.writeBytes(i, this.memoizedBytes);
            return;
        }
        v44 v44Var = this.delayedBytes;
        if (v44Var != null) {
            a85Var.writeBytes(i, v44Var);
        } else if (this.value != null) {
            a85Var.writeMessage(i, this.value);
        } else {
            a85Var.writeBytes(i, v44.EMPTY);
        }
    }
}

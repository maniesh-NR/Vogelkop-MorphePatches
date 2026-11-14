package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class mgb {
    private volatile v44 bytes;
    private volatile boolean corrupted;
    private final rvd defaultInstance;
    private final yk8 extensionRegistry;
    protected volatile rvd value;

    public static class a implements Map.Entry {
        private final Map.Entry<Object, mgb> entry;

        private a(Map.Entry<Object, mgb> entry) {
            this.entry = entry;
        }

        public mgb getField() {
            return this.entry.getValue();
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.entry.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            mgb value = this.entry.getValue();
            if (value == null) {
                return null;
            }
            return value.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (!(obj instanceof rvd)) {
                qp2.o("Lazy field only supports MessageLite values.");
                return null;
            }
            rvd rvdVar = this.entry.getValue().value;
            this.entry.setValue(new mgb((rvd) obj));
            return rvdVar;
        }
    }

    public static class b implements Iterator {
        private Iterator<Map.Entry<Object, Object>> iterator;

        public b(Iterator<Map.Entry<Object, Object>> it) {
            this.iterator = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry<Object, Object> next() {
            Map.Entry<Object, Object> next = this.iterator.next();
            return next.getValue() instanceof mgb ? new a(next) : next;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.iterator.remove();
        }
    }

    public mgb(rvd rvdVar) {
        if (rvdVar == null) {
            qp2.o("message cannot be null");
            throw null;
        }
        this.value = rvdVar;
        this.defaultInstance = rvdVar.getDefaultInstanceForType();
        this.extensionRegistry = yk8.getEmptyRegistry();
        this.bytes = null;
        this.corrupted = false;
    }

    public mgb(rvd rvdVar, yk8 yk8Var, v44 v44Var) {
        if (rvdVar == null) {
            qp2.o("defaultInstance cannot be null");
            throw null;
        }
        if (yk8Var == null) {
            qp2.o("extensionRegistry cannot be null");
            throw null;
        }
        if (v44Var == null) {
            qp2.o("bytes cannot be null");
            throw null;
        }
        this.defaultInstance = rvdVar;
        this.extensionRegistry = yk8Var;
        this.bytes = v44Var;
        this.corrupted = false;
        this.value = null;
    }

    private void ensureInitialized() {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.corrupted) {
                throw new bjb("Repeat access to corrupted lazy field");
            }
            try {
                boolean zLazyExtensionEnabled = yk8.lazyExtensionEnabled();
                rvd rvdVar = this.defaultInstance;
                this.value = zLazyExtensionEnabled ? (rvd) rvdVar.getParserForType().parsePartialFrom(this.bytes, this.extensionRegistry) : (rvd) rvdVar.getParserForType().parseFrom(this.bytes, this.extensionRegistry);
            } catch (bjb e) {
                this.corrupted = true;
                throw e;
            }
        }
    }

    private boolean hasBytes() {
        return this.bytes != null;
    }

    private boolean isEmpty() {
        return this.bytes != null ? this.bytes.isEmpty() : this.value.equals(this.defaultInstance);
    }

    public static mgb mergeFrom(mgb mgbVar, mgb mgbVar2) {
        yk8 yk8Var;
        rvd rvdVar;
        if (mgbVar.isEmpty()) {
            return mgbVar2;
        }
        if (mgbVar2.isEmpty()) {
            return mgbVar;
        }
        if (mgbVar.hasBytes() && mgbVar2.hasBytes() && (yk8Var = mgbVar.extensionRegistry) == mgbVar2.extensionRegistry && (rvdVar = mgbVar.defaultInstance) == mgbVar2.defaultInstance) {
            return new mgb(rvdVar, yk8Var, mgbVar.bytes.concat(mgbVar2.bytes));
        }
        try {
            mgbVar.ensureInitialized();
            if (mgbVar2.value != null) {
                return new mgb(mgbVar.value.toBuilder().mergeFrom(mgbVar2.value).build());
            }
            try {
                return new mgb(mgbVar.value.toBuilder().mergeFrom(mgbVar2.bytes, mgbVar2.extensionRegistry).build());
            } catch (bjb e) {
                throw new xib("Cannot merge lazy field from invalid bytes with a different extension registry.", e);
            }
        } catch (bjb e2) {
            throw new xib("Cannot merge invalid lazy field from bytes that is absent or with a different extension registry.", e2);
        }
    }

    public static mgb mergeFrom(mgb mgbVar, r75 r75Var, yk8 yk8Var) {
        if (mgbVar.isEmpty()) {
            return new mgb(mgbVar.defaultInstance, yk8Var, r75Var.readBytes());
        }
        if (mgbVar.hasBytes()) {
            if (mgbVar.extensionRegistry == yk8Var) {
                v44 bytes = r75Var.readBytes();
                return bytes.isEmpty() ? mgbVar : new mgb(mgbVar.defaultInstance, yk8Var, mgbVar.bytes.concat(bytes));
            }
            try {
                mgbVar.ensureInitialized();
            } catch (bjb e) {
                throw new xib("Cannot merge invalid lazy field from bytes that is absent or with a different extension registry.", e);
            }
        }
        try {
            qvd builder = mgbVar.value.toBuilder();
            r75Var.readMessage(builder, yk8Var);
            return new mgb(builder.build());
        } catch (bjb e2) {
            throw new xib("Cannot merge lazy field from invalid bytes with a different extension registry.", e2);
        }
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

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgb)) {
            return getValue().equals(obj);
        }
        mgb mgbVar = (mgb) obj;
        if (this.bytes == null || mgbVar.bytes == null || this.extensionRegistry != mgbVar.extensionRegistry || !this.bytes.equals(mgbVar.bytes)) {
            return getValue().equals(mgbVar.getValue());
        }
        return true;
    }

    public int getSerializedSize() {
        return this.bytes != null ? this.bytes.size() : this.value.getSerializedSize();
    }

    public rvd getValue() {
        try {
            ensureInitialized();
            return this.value;
        } catch (bjb e) {
            if (yk8.lazyExtensionEnabled()) {
                throw new xib(e);
            }
            return this.defaultInstance;
        }
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public v44 toByteString() {
        if (this.bytes != null) {
            return this.bytes;
        }
        synchronized (this) {
            if (this.bytes != null) {
                return this.bytes;
            }
            this.bytes = this.value.toByteString();
            return this.bytes;
        }
    }

    public String toString() {
        return getValue().toString();
    }

    public void writeTo(a85 a85Var, int i) {
        if (this.bytes != null) {
            a85Var.writeBytes(i, this.bytes);
        } else {
            a85Var.writeMessage(i, this.value);
        }
    }
}

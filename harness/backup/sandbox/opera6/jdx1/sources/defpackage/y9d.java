package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class y9d implements Map.Entry, ptb {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ y9d(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && Intrinsics.a(entry.getKey(), obj2) && Intrinsics.a(entry.getValue(), getValue());
            case 1:
                entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && Intrinsics.a(entry.getKey(), obj2) && Intrinsics.a(entry.getValue(), getValue());
            case 2:
            default:
                return super.equals(obj);
            case 3:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                return Intrinsics.a(entry2.getKey(), (String) obj2) && Intrinsics.a(entry2.getValue(), (List) this.c);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            default:
                return (String) this.b;
        }
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.a) {
            case 0:
                return this.c;
            case 1:
                return this.c;
            case 2:
                return this.c;
            default:
                return (List) this.c;
        }
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int iHashCode;
        byte b = this.a;
        int iHashCode2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                if (value != null) {
                    iHashCode2 = value.hashCode();
                    break;
                }
                break;
            case 1:
                iHashCode = obj != null ? obj.hashCode() : 0;
                Object value2 = getValue();
                if (value2 != null) {
                    iHashCode2 = value2.hashCode();
                    break;
                }
                break;
            case 2:
            default:
                return super.hashCode();
            case 3:
                return ((String) obj).hashCode() ^ ((List) this.c).hashCode();
        }
        return iHashCode ^ iHashCode2;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return obj + "=" + getValue();
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            case 2:
            default:
                return super.toString();
            case 3:
                return ((String) obj) + '=' + ((List) this.c);
        }
    }
}

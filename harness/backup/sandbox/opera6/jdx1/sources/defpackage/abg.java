package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class abg extends f6 {
    public final /* synthetic */ byte a;
    public final wag b;

    public /* synthetic */ abg(wag wagVar, byte b) {
        this.a = b;
        this.b = wagVar;
    }

    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                wag wagVar = this.b;
                Object obj2 = wagVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && wagVar.containsKey(entry.getKey());
            default:
                return this.b.containsKey(obj);
        }
    }

    public final int d() {
        switch (this.a) {
        }
        return this.b.c();
    }

    public final Iterator iterator() {
        byte b = this.a;
        wag wagVar = this.b;
        switch (b) {
            case 0:
                return new bbg(wagVar);
            default:
                v6m[] v6mVarArr = new v6m[8];
                for (int i = 0; i < 8; i++) {
                    v6mVarArr[i] = new x6m((byte) 1);
                }
                return new dbg(wagVar, v6mVarArr);
        }
    }

    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.b.remove(entry.getKey(), entry.getValue());
            default:
                wag wagVar = this.b;
                if (!wagVar.containsKey(obj)) {
                    return false;
                }
                wagVar.remove(obj);
                return true;
        }
    }
}

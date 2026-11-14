package defpackage;

import ads_mobile_sdk.ca3;
import androidx.collection.ArrayMap;
import j$.util.Collection;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class l72 extends AbstractSet implements Collection {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Map b;

    public /* synthetic */ l72(Map map, byte b) {
        this.a = b;
        this.b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((uqj) this.b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 1:
                ((uqj) this.b).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((uqj) map).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value) {
                    return obj2 != null && obj2.equals(value);
                }
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                ((ca3) map).get(entry2.getKey());
                return entry2.getValue() == null;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case 0:
                return new o72((ArrayMap) map);
            case 1:
                return new xqj((uqj) map);
            default:
                ca3 ca3Var = (ca3) map;
                ca3Var.b$1();
                return new rw4(ca3Var);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((uqj) this.b).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.a;
        Map map = this.b;
        switch (b) {
            case 0:
                return ((ArrayMap) map).c;
            case 1:
                return ((uqj) map).size();
            default:
                ca3 ca3Var = (ca3) map;
                ca3Var.b$1();
                return ca3Var.b;
        }
    }
}

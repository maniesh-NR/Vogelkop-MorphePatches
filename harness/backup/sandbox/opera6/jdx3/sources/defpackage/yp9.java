package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class yp9 extends LinkedHashMap {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yp9(int i, float f, boolean z, byte b) {
        super(i, f, z);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yp9(Object obj, int i, byte b) {
        super(i, 0.75f, true);
        this.a = b;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        switch (this.a) {
            case 3:
                if (obj instanceof ckn) {
                    return super.containsKey((ckn) obj);
                }
                return false;
            default:
                return super.containsKey(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        switch (this.a) {
            case 3:
                if (obj instanceof gkn) {
                    return super.containsValue((gkn) obj);
                }
                return false;
            default:
                return super.containsValue(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        switch (this.a) {
            case 3:
                if (obj instanceof ckn) {
                    return (gkn) super.get((ckn) obj);
                }
                return null;
            default:
                return super.get(obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        switch (this.a) {
            case 3:
                return obj instanceof ckn ? (gkn) super.getOrDefault((ckn) obj, (gkn) obj2) : obj2;
            default:
                return super.getOrDefault(obj, obj2);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        switch (this.a) {
            case 3:
                if (obj instanceof ckn) {
                    return (gkn) super.remove((ckn) obj);
                }
                return null;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        switch (this.a) {
            case 3:
                if ((obj instanceof ckn) && (obj2 instanceof gkn)) {
                    return super.remove((ckn) obj, (gkn) obj2);
                }
                return false;
            default:
                return super.remove(obj, obj2);
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.a) {
            case 0:
                if (size() > 4) {
                }
                break;
            case 1:
                if (size() > 100) {
                }
                break;
            case 2:
                if (size() > 100) {
                }
                break;
            default:
                if (super.size() > 4) {
                }
                break;
        }
        return false;
    }
}

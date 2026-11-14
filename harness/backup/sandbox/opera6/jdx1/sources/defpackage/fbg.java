package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class fbg extends b7 implements w1b {
    public final /* synthetic */ byte b;
    public final tag c;

    public /* synthetic */ fbg(tag tagVar, byte b) {
        this.b = b;
        this.c = tagVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.b;
        tag tagVar = this.c;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = tagVar.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && tagVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return tagVar.containsKey(obj);
        }
    }

    public final int d() {
        byte b = this.b;
        tag tagVar = this.c;
        switch (b) {
        }
        return tagVar.e;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.b;
        tag tagVar = this.c;
        switch (b) {
            case 0:
                u6m u6mVar = tagVar.d;
                v6m[] v6mVarArr = new v6m[8];
                for (int i = 0; i < 8; i++) {
                    v6mVarArr[i] = new x6m((byte) 0);
                }
                return new hbg(u6mVar, v6mVarArr);
            default:
                u6m u6mVar2 = tagVar.d;
                v6m[] v6mVarArr2 = new v6m[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    v6mVarArr2[i2] = new x6m((byte) 1);
                }
                return new hbg(u6mVar2, v6mVarArr2);
        }
    }
}

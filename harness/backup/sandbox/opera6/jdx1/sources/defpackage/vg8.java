package defpackage;

import java.util.Enumeration;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class vg8 implements Enumeration {
    public final /* synthetic */ byte a;
    public int b;

    public /* synthetic */ vg8(byte b) {
        this.a = b;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        switch (this.a) {
            case 0:
                int i = this.b;
                lh8[] lh8VarArr = zg8.b;
                if (i < 4) {
                    break;
                }
                break;
            default:
                int i2 = this.b;
                lh8[] lh8VarArr2 = zg8.b;
                if (i2 < 4) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.a) {
            case 0:
                HashMap map = new HashMap();
                for (lh8 lh8Var : zg8.c[this.b]) {
                    map.put(lh8Var.b, lh8Var);
                }
                this.b++;
                return map;
            default:
                this.b++;
                return new HashMap();
        }
    }
}

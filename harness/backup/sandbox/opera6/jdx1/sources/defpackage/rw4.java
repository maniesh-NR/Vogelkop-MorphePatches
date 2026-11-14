package defpackage;

import ads_mobile_sdk.ca3;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class rw4 implements Iterator {
    public final /* synthetic */ byte a;
    public int b;
    public final /* synthetic */ Object c;

    public rw4(ca3 ca3Var) {
        this.a = (byte) 1;
        this.c = ca3Var;
        this.b = -1;
    }

    public rw4(sw4 sw4Var) {
        this.a = (byte) 0;
        this.c = sw4Var;
        this.b = sw4Var.c.size() - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b >= 0) {
                    break;
                }
                break;
            default:
                ca3 ca3Var = (ca3) this.c;
                ca3Var.b$1();
                if (this.b + 1 < ca3Var.b) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ArrayList arrayList = ((sw4) obj).c;
                int i = this.b;
                this.b = i - 1;
                return ((pw4) arrayList.get(i)).a;
            default:
                ca3 ca3Var = (ca3) obj;
                ca3Var.b$1();
                if (!hasNext()) {
                    t3p.y();
                    return null;
                }
                Object[] objArr = ca3Var.a;
                int i2 = this.b + 1;
                this.b = i2;
                if (objArr[i2] == null) {
                    return null;
                }
                h9o.t();
                return null;
        }
    }
}

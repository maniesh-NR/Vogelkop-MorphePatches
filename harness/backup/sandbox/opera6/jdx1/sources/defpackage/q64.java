package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class q64 implements k64 {
    public final boolean a;
    public final String b;

    public q64(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean a(hfi hfiVar) {
        int i;
        boolean z = this.a;
        String strN = this.b;
        if (z && strN == null) {
            strN = hfiVar.n();
        }
        ffi ffiVar = hfiVar.b;
        if (ffiVar != null) {
            Iterator it = ffiVar.h().iterator();
            i = 0;
            while (it.hasNext()) {
                hfi hfiVar2 = (hfi) ((jfi) it.next());
                if (strN == null || hfiVar2.n().equals(strN)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    public final String toString() {
        return this.a ? sko.k("only-of-type <", this.b, ">") : "only-child";
    }
}

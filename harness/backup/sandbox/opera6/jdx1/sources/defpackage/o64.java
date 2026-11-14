package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o64 implements k64 {
    public List a;

    public final boolean a(hfi hfiVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (z.o((t64) it.next(), hfiVar)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "not(" + this.a + ")";
    }
}

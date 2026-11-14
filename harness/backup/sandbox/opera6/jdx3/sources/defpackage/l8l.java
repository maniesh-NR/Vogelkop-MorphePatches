package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class l8l extends n1 {
    public k8l c;
    public String d;

    public final void H0(String str) {
        String strI;
        String strQ;
        if (str != null) {
            strI = wqm.i(str);
            strQ = wqm.q(str);
        } else {
            strI = null;
            strQ = null;
        }
        k8l k8lVar = this.c;
        if (k8lVar != null && Objects.equals(k8lVar.a, strI) && Objects.equals(this.d, strQ)) {
            return;
        }
        this.c = new k8l(strI);
        this.d = strQ;
        v0();
    }
}

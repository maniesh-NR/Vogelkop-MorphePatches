package defpackage;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class l7f {
    public final njb a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public l7f(njb njbVar, int[] iArr, String[] strArr) {
        this.a = njbVar;
        this.b = iArr;
        this.c = strArr;
        if (iArr.length == strArr.length) {
            this.d = !(strArr.length == 0) ? Collections.singleton(strArr[0]) : v08.a;
        } else {
            qp2.n("Check failed.");
            throw null;
        }
    }
}

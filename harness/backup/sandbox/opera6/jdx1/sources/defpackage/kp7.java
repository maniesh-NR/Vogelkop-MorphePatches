package defpackage;

import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class kp7 extends h5a {
    public static final /* synthetic */ int c = 0;
    public final ip7 a = ip7.e;
    public final vt8 b = vt8.a;

    @Override // defpackage.h5a
    public final vt8 a() {
        return this.b;
    }

    @Override // defpackage.h5a
    public final boolean b(bp3 bp3Var, xd4 xd4Var) {
        Set setA = xd4Var.a();
        Objects.toString(setA);
        toString();
        ip7 ip7Var = this.a;
        if (!setA.contains(ip7Var)) {
            return false;
        }
        for (qrm qrmVar : (List) bp3Var.h) {
            Set setL = qrmVar.l(xd4Var);
            Objects.toString(setL);
            toString();
            qrmVar.toString();
            if (setL != null && !setL.contains(ip7Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.a + ')';
    }
}

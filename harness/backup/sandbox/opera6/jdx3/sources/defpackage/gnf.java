package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class gnf extends aqi implements nq {
    public final bie u;

    public gnf(String str, String str2, String str3, String str4, String str5, String str6, dl dlVar, String str7, bie bieVar, int i, bp bpVar, i3j i3jVar, ap apVar) {
        super(str, str3, str4, str5, str2, Arrays.hashCode(new Object[]{str, str2, str3, str4}) + "," + i, str6, dlVar, str7, yo.OPERA, bpVar, i3jVar, apVar);
        this.u = bieVar;
    }

    @Override // defpackage.nq
    public final mq a(dl dlVar, km kmVar, k8 k8Var, kq kqVar, List list) {
        return new inf(this, dlVar, kmVar, k8Var, kqVar, list);
    }

    @Override // defpackage.aqi, defpackage.yz
    public final void c() {
        super.c();
        this.u.d();
    }

    @Override // defpackage.yz
    public final v50 e() {
        return v50.b;
    }

    @Override // defpackage.aqi
    public final boolean u() {
        return this.u.b().d();
    }
}

package ads_mobile_sdk;

import defpackage.prb;
import defpackage.qcp;
import defpackage.rnp;
import defpackage.xzh;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ls1 implements qcp, rnp {
    public final td1 a;

    public ls1(td1 td1Var) {
        this.a = td1Var;
    }

    @Override // defpackage.rnp
    public final kh3 a() {
        return this.a.a();
    }

    @Override // defpackage.rnp
    public final Object a(xm2 xm2Var) {
        td1 td1Var = this.a;
        td1Var.getClass();
        return cc1.a(td1Var, xm2Var);
    }

    @Override // defpackage.rnp
    /* renamed from: a */
    public final Unit mo0a(xm2 xm2Var) {
        return this.a.mo0a(xm2Var);
    }

    @Override // defpackage.rnp
    public final void a(xzh xzhVar) {
        td1 td1Var = this.a;
        td1Var.getClass();
        td1Var.k = xzhVar;
    }

    @Override // defpackage.rnp
    public final a2 b() {
        return this.a.b();
    }

    @Override // defpackage.rnp
    public final void destroy() {
        this.a.destroy();
    }

    @Override // defpackage.rnp
    public final prb g() {
        this.a.getClass();
        return null;
    }

    @Override // defpackage.rnp
    public final xzh getResponseInfo() {
        xzh xzhVar = this.a.k;
        if (xzhVar != null) {
            return xzhVar;
        }
        return null;
    }
}

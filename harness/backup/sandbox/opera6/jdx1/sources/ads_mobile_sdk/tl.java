package ads_mobile_sdk;

import defpackage.bpd;

/* loaded from: classes.dex */
public class tl extends ov {
    public final td1 b;
    public final fv2 c;

    public tl(td1 td1Var, fv2 fv2Var) {
        super(td1Var);
        this.b = td1Var;
        this.c = fv2Var;
    }

    public td1 b() {
        return this.b;
    }

    public void setAdEventCallback(bpd bpdVar) {
        b().j().a(bpdVar);
    }
}

package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class lnc implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx5 b;
    public final /* synthetic */ snc c;

    public /* synthetic */ lnc(byte b, nx5 nx5Var, snc sncVar) {
        this.a = b;
        this.b = nx5Var;
        this.c = sncVar;
    }

    public /* synthetic */ lnc(snc sncVar, nx5 nx5Var) {
        this.a = (byte) 2;
        this.c = sncVar;
        this.b = nx5Var;
    }

    public final Object invoke() {
        byte b = this.a;
        nx5 nx5Var = this.b;
        snc sncVar = this.c;
        switch (b) {
            case 0:
                return new e2f(nx5Var, (d7a) sncVar.b.b, (gmc) sncVar.r.getValue(), (qs6) sncVar.y.getValue());
            case 1:
                return new o0i(nx5Var, (qs6) sncVar.y.getValue(), (d7a) sncVar.b.b);
            default:
                return new gmc(sncVar.q, (jg8) sncVar.b.d, nx5Var);
        }
    }
}

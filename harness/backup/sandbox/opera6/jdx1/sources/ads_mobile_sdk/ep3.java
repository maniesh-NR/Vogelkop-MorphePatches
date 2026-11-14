package ads_mobile_sdk;

import defpackage.eyo;
import defpackage.fsg;
import defpackage.o0g;
import defpackage.sbl;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class ep3 extends k61 {
    public final ko3 c;
    public final qw d;
    public final qr0 e;
    public final nx5 f;
    public final nx5 g;
    public final ux2 h;
    public final ah0 i;
    public final eyo j;
    public final ynb k;
    public final zyk l;

    public ep3(ko3 ko3Var, qw qwVar, qr0 qr0Var, nx5 nx5Var, nx5 nx5Var2, ux2 ux2Var, ah0 ah0Var, eyo eyoVar) {
        super((fw0) null, 1);
        this.c = ko3Var;
        this.d = qwVar;
        this.e = qr0Var;
        this.f = nx5Var;
        this.g = nx5Var2;
        this.h = ux2Var;
        this.i = ah0Var;
        this.j = eyoVar;
        this.k = o0g.e();
        this.l = z4c.b(new qm(this, (byte) 23));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.ep3 r11, nt5 r12) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ep3.a(ads_mobile_sdk.ep3, nt5):java.lang.Object");
    }

    public final Object a(nt5 nt5Var) {
        if (((Boolean) this.l.getValue()).booleanValue()) {
            Object objZ = this.k.Z(nt5Var);
            return objZ == px5.a ? objZ : Unit.a;
        }
        Object objB = this.j.b(nt5Var);
        return objB == px5.a ? objB : Unit.a;
    }

    @Override // ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        if (((Boolean) this.l.getValue()).booleanValue()) {
            qr0 qr0Var = this.e;
            qr0Var.getClass();
            mt5 mt5Var2 = null;
            defpackage.na2.B(((Boolean) qr0Var.a("gads:webview_initialization_executor:enabled", Boolean.FALSE, fo.a)).booleanValue() ? this.g : this.f, h.a, null, new fsg(new sbl((byte) 11, mt5Var2, (Object) this), mt5Var2, (byte) 3), 2);
        } else {
            this.k.B0();
        }
        return new hv0(Unit.a);
    }
}

package ads_mobile_sdk;

import defpackage.fsg;
import defpackage.ijp;
import defpackage.pep;
import defpackage.sqo;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class x03 extends ijp {
    public final nx5 c;
    public final qr0 d;
    public final bk1 e;

    public x03(nx5 nx5Var, qr0 qr0Var, bk1 bk1Var) {
        this.c = nx5Var;
        this.d = qr0Var;
        this.e = bk1Var;
    }

    @Override // ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        pep pepVar = this.d.s;
        pepVar.getClass();
        if (((Boolean) pepVar.a("gads:initialize_sdk_core_post_init:enabled", Boolean.FALSE, fo.a)).booleanValue()) {
            sqo sqoVar = new sqo((byte) 4, null, this);
            defpackage.na2.B(this.c, h.a, null, new fsg(sqoVar, null, (byte) 3), 2);
        }
        return new hv0(Unit.a);
    }
}

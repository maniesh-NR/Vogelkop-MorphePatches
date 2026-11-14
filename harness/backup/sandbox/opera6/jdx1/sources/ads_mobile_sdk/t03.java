package ads_mobile_sdk;

import defpackage.fsg;
import defpackage.pep;
import defpackage.zhl;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class t03 extends k61 {
    public final nx5 c;
    public final qr0 d;
    public final bk1 e;

    public t03(nx5 nx5Var, qr0 qr0Var, bk1 bk1Var) {
        super((fw0) null, 1);
        this.c = nx5Var;
        this.d = qr0Var;
        this.e = bk1Var;
    }

    @Override // ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        pep pepVar = this.d.s;
        pepVar.getClass();
        if (((Boolean) pepVar.a("gads:initialize_sdk_core_as_init_task:enabled", Boolean.TRUE, fo.a)).booleanValue()) {
            zhl zhlVar = new zhl((byte) 28, (mt5) null, this);
            defpackage.na2.B(this.c, h.a, null, new fsg(zhlVar, null, (byte) 3), 2);
        }
        return new hv0(Unit.a);
    }
}

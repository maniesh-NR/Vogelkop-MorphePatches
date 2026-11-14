package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class z38 implements rul {
    public final tul a;
    public final a2k b;
    public final wi6 c;
    public final Function0 d;
    public final y38 e = new y38(this);

    public z38(tul tulVar, a2k a2kVar, wi6 wi6Var, Function0 function0) {
        this.a = tulVar;
        this.b = a2kVar;
        this.c = wi6Var;
        this.d = function0;
    }

    @Override // defpackage.rul
    public final ble a() {
        return this.e;
    }

    @Override // defpackage.rul
    public final boolean b() {
        return false;
    }

    @Override // defpackage.rul
    public final wi6 c() {
        return this.c;
    }

    @Override // defpackage.rul
    public final we1 d() {
        return this.b;
    }

    @Override // defpackage.rul
    public final tul getState() {
        return this.a;
    }
}

package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class afg implements rul {
    public final tul a;
    public final Function0 b;
    public final zeg c = new zeg(this);

    public afg(tul tulVar, Function0 function0) {
        this.a = tulVar;
        this.b = function0;
    }

    @Override // defpackage.rul
    public final ble a() {
        return this.c;
    }

    @Override // defpackage.rul
    public final boolean b() {
        return true;
    }

    @Override // defpackage.rul
    public final wi6 c() {
        return null;
    }

    @Override // defpackage.rul
    public final we1 d() {
        return null;
    }

    @Override // defpackage.rul
    public final tul getState() {
        return this.a;
    }
}

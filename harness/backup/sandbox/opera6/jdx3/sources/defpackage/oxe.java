package defpackage;

import android.app.ActivityManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class oxe extends dx4 {
    public final boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxe(Context context) {
        super(27000);
        d9j[] d9jVarArr = d9j.a;
        this.g = !((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    @Override // defpackage.t6j
    public final ix4 b(hx4 hx4Var) {
        if (!this.g) {
            nxe[] nxeVarArr = nxe.a;
            hx4Var.b(5);
        }
        return hx4Var.a();
    }

    @Override // defpackage.dx4
    public final r6j h(r6j r6jVar, int i) {
        return r6jVar.a(i, new x6j(zwe.class, new nf8((byte) 20)), 2132021306, 2131232153, true, new zbe((byte) 10));
    }
}

package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* loaded from: classes.dex */
public final class tp1 extends k8 {
    public final /* synthetic */ byte o = 0;
    public final /* synthetic */ xp1 p;
    public final Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp1(xp1 xp1Var, Context context) {
        super(xp1Var);
        this.p = xp1Var;
        this.q = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp1(xp1 xp1Var, shf shfVar) {
        super(xp1Var);
        this.p = xp1Var;
        this.q = shfVar;
    }

    @Override // defpackage.k8
    public final IntentFilter M() {
        switch (this.o) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    @Override // defpackage.k8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int S() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp1.S():int");
    }

    @Override // defpackage.k8
    public final void e0() {
        byte b = this.o;
        xp1 xp1Var = this.p;
        switch (b) {
            case 0:
                xp1Var.m(true, true);
                break;
            default:
                xp1Var.m(true, true);
                break;
        }
    }
}

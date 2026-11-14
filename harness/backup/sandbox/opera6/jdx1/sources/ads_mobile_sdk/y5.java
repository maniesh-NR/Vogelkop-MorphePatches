package ads_mobile_sdk;

import android.content.Context;
import android.os.SystemClock;
import defpackage.cwh;
import defpackage.dvj;
import defpackage.jym;
import defpackage.mip;
import defpackage.wdp;
import defpackage.yvh;
import java.util.Optional;

/* loaded from: classes.dex */
public final class y5 implements wdp {
    public final mip a;
    public final defpackage.r83 b;
    public final Optional c;
    public final cu2 d;
    public final Context e;
    public final av2 f;
    public final boolean g;
    public final qr0 h;
    public final long i;
    public final boolean j;
    public final Optional k;

    public y5(mip mipVar, defpackage.r83 r83Var, Optional optional, cu2 cu2Var, Context context, av2 av2Var, boolean z, qr0 qr0Var, long j, boolean z2, Optional optional2) {
        this.a = mipVar;
        this.b = r83Var;
        this.c = optional;
        this.d = cu2Var;
        this.e = context;
        this.f = av2Var;
        this.g = z;
        this.h = qr0Var;
        this.i = j;
        this.j = z2;
        this.k = optional2;
    }

    @Override // defpackage.wdp
    /* renamed from: a */
    public final lw0 mo15a() {
        return lw0.AD_REQUEST;
    }

    @Override // defpackage.wdp
    public final Object d(mt5 mt5Var) {
        cwh cwhVarA = this.d.a();
        dvj dvjVar = ax0.f;
        boolean zA = (jym.c() && this.b.d.getBoolean("_emulatorLiveAds", false)) ? false : cwhVarA.a(this.e);
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        cwhVarA.getClass();
        awh awhVar = awh.a;
        bwh bwhVar = bwh.a;
        yvh yvhVar = cwhVarA.a;
        byte b = cwhVarA.c.a;
        defpackage.v23 v23Var = (defpackage.v23) this.c.orElse(null);
        boolean zG = v23Var != null ? v23Var.g() : false;
        long j = jElapsedRealtime - this.i;
        Boolean bool = (Boolean) this.k.orElse(null);
        return new hv0(new x5(this.b, jElapsedRealtime, yvhVar, zA, this.f, b, zG, this.g, this.h, j, this.j, bool != null ? bool.booleanValue() : false));
    }
}

package ads_mobile_sdk;

import android.content.Context;
import android.widget.RelativeLayout;
import defpackage.bro;
import defpackage.fsg;
import defpackage.hkm;
import defpackage.m7p;
import java.util.Optional;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public abstract class ks0 extends mt0 {
    public final av2 E;
    public final m7p F;
    public sy0 G;
    public final zyk H;
    public final boolean I;
    public int J;
    public final boolean K;
    public final boolean L;

    public ks0(Context context, nx5 nx5Var, CoroutineContext coroutineContext, nx5 nx5Var2, qr0 qr0Var, ah3 ah3Var, String str, av2 av2Var, a2 a2Var, m7p m7pVar, ax0 ax0Var, bro broVar, Optional optional) {
        super(context, nx5Var, coroutineContext, nx5Var2, qr0Var, ah3Var, str, ax0Var, broVar, optional);
        this.E = av2Var;
        this.F = m7pVar;
        this.H = z4c.b(new qm(this, (byte) 27));
        this.I = a2Var.E;
        this.J = a2Var.K;
        this.K = a2Var.N;
        this.L = a2Var.L;
    }

    @Override // ads_mobile_sdk.mt0
    public Object a(RelativeLayout relativeLayout, mt5 mt5Var) {
        mt5 mt5Var2 = null;
        hkm hkmVar = new hkm(this, relativeLayout, mt5Var2, (byte) 24);
        defpackage.na2.B(this.d, h.a, null, new fsg(hkmVar, mt5Var2, (byte) 3), 2);
        return Unit.a;
    }

    @Override // defpackage.obp
    public final Object a(boolean z, tg0 tg0Var) {
        Object objA = a(z, (nt5) tg0Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // ads_mobile_sdk.mt0
    public final void a(int i) {
        this.J = i;
    }

    @Override // ads_mobile_sdk.mt0
    public final void a(y46 y46Var) {
        mt5 mt5Var = null;
        hkm hkmVar = new hkm(this, y46Var, mt5Var, (byte) 18);
        defpackage.na2.B(this.d, h.a, null, new fsg(hkmVar, mt5Var, (byte) 3), 2);
    }

    @Override // ads_mobile_sdk.mt0
    public final boolean f() {
        return this.L;
    }

    @Override // ads_mobile_sdk.mt0
    public final boolean h() {
        return this.K;
    }

    @Override // ads_mobile_sdk.mt0
    public final boolean i() {
        return this.I;
    }

    @Override // ads_mobile_sdk.mt0
    public final cy0 j() {
        return (cy0) this.H.getValue();
    }

    @Override // ads_mobile_sdk.mt0
    public final int k() {
        return this.J;
    }
}

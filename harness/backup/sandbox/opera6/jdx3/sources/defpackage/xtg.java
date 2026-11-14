package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.opera.android.StatusBarDrawingFrameLayout;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class xtg extends ltl {
    public final ua7 r;
    public final zyk s;
    public ttg t;
    public boolean u;
    public kf v;

    /* JADX WARN: Illegal instructions before constructor call */
    public xtg(gjm gjmVar) {
        itl itlVar = (itl) u7k.j(2131558884).a;
        itlVar.e = true;
        super(itlVar);
        this.r = new ua7((Fragment) this, gjmVar);
        this.s = z4c.b(new yse(this, (byte) 7));
    }

    public static void J0() {
        vx3 vx3VarA = ay3.a("https://support-vpn-pro.opera.com/", lqm.v, false);
        vx3VarA.b = 3;
        o18.t(vx3VarA, true, vx3VarA);
    }

    public final void G0() {
        ptg ptgVar = (ptg) this.r.p();
        vug vugVarH0 = H0();
        String str = ptgVar.c;
        vugVarH0.getClass();
        na2.B(p7n.a(vugVarH0), (CoroutineContext) null, (rx5) null, new jj4(vugVarH0, str, (mt5) null, (byte) 14), 3);
    }

    public final vug H0() {
        return (vug) this.s.getValue();
    }

    public final void I0(int i) {
        String str;
        String str2;
        if (this.u) {
            return;
        }
        this.u = true;
        ptg ptgVar = (ptg) this.r.p();
        vug vugVarH0 = H0();
        int i2 = ptgVar.a;
        ltg ltgVar = ptgVar.b;
        orm ormVar = vugVarH0.f;
        wm0 wm0VarE = bwg.E(i2);
        String str3 = (ltgVar == null || (str2 = ltgVar.a) == null) ? "organic" : str2;
        String str4 = (ltgVar == null || (str = ltgVar.b) == null) ? "organic" : str;
        xm0 xm0VarF = bwg.F(i);
        x5f x5fVar = (x5f) ormVar;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            new ck0(zpaVar, x56VarF).b(new rg((Object) wm0VarE, (Object) str3, (Object) str4, (Object) xm0VarF, (byte) 11));
            x5fVar.U0(x56VarF);
        }
    }

    @Override // defpackage.ryl
    public final void g0() {
        I0(1);
        super.g0();
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        I0(2);
        super.onDestroy();
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        super.onDestroyView();
        this.t = null;
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int i = 4;
        int i2 = 2;
        Class<xtg> cls = xtg.class;
        j14.Y(new z99(qbe.t(new cw(ic4.l(f03.g(new jj4((byte) 1, (mt5) null, requireContext())), -1), this, (byte) 16)), new te5(i2, this, cls, "applyLayoutVariant", "applyLayoutVariant(Lcom/opera/android/premium/giveaway/ui/PremiumGiveawayFragment$LayoutVariant;)V", i, (byte) 2), (byte) 2), fsp.y(getViewLifecycleOwner()));
        j14.Y(new z99(scd.D(H0().i, getViewLifecycleOwner().getLifecycle()), new te5(i2, this, cls, "applyUiState", "applyUiState(Lcom/opera/android/premium/giveaway/ui/PremiumGiveawayUiState;)V", i, (byte) 3), (byte) 2), fsp.y(getViewLifecycleOwner()));
        j14.Y(new z99(scd.D(new yc1(H0().j, (byte) 13), getViewLifecycleOwner().getLifecycle()), new te5(i2, this, cls, "handleUiEvent", "handleUiEvent(Lcom/opera/android/premium/giveaway/ui/PremiumGiveawayUiEvent;)V", i, (byte) 4), (byte) 2), fsp.y(getViewLifecycleOwner()));
    }

    @Override // defpackage.ltl
    public final void y0(LayoutInflater layoutInflater, StatusBarDrawingFrameLayout statusBarDrawingFrameLayout) {
        this.v = kf.e(statusBarDrawingFrameLayout.findViewById(2131362473));
    }
}

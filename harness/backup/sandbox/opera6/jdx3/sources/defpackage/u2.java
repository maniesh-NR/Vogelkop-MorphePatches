package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.opera.android.FullscreenWebActivity;

/* loaded from: classes.dex */
public final class u2 extends k24 implements o37 {
    public final ua7 f;
    public final zyk g = z4c.b(new t2(this, 0));

    public u2(gjm gjmVar) {
        this.f = new ua7((Fragment) this, gjmVar);
    }

    @Override // defpackage.k24
    public final View n0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Integer numR = e82.r(((o2) this.f.p()).a.a);
        dg5 dg5Var = numR != null ? new dg5(numR.intValue()) : null;
        rn9 rn9Var = new rn9((k24) this, (byte) 12);
        rn9Var.d = dg5Var;
        rn9Var.b = true;
        return rn9Var.j(new ue5(-976838628, new whf(this, (byte) 1), true));
    }

    public final d3 o0() {
        return (d3) this.g.getValue();
    }

    public final void p0(int i, String str) {
        FullscreenWebActivity.A0(requireContext(), str, new rxh(i));
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.f;
    }
}

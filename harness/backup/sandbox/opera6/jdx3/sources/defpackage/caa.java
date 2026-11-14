package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class caa extends k24 implements o37 {
    public final ua7 f;
    public final zyk g = z4c.b(new t2(this, (byte) 22));

    public caa(gjm gjmVar) {
        this.f = new ua7((Fragment) this, gjmVar);
    }

    @Override // defpackage.k24
    public final View n0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Integer numR = e82.r(((baa) this.f.p()).a.a);
        dg5 dg5Var = numR != null ? new dg5(numR.intValue()) : null;
        rn9 rn9Var = new rn9(this, (byte) 12);
        rn9Var.d = dg5Var;
        rn9Var.b = true;
        return rn9Var.j(new ue5(379252710, new whf(this, (byte) 27), true));
    }

    public final eaa o0() {
        return (eaa) this.g.getValue();
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.f;
    }
}

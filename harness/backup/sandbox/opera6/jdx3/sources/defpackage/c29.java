package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class c29 extends k24 implements o37 {
    public final ua7 f;
    public final zyk g = z4c.b(new t2(this, (byte) 19));

    public c29(gjm gjmVar) {
        this.f = new ua7((Fragment) this, gjmVar);
    }

    @Override // defpackage.k24
    public final View n0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Integer numR = e82.r(((b29) this.f.p()).a.a);
        dg5 dg5Var = numR != null ? new dg5(numR.intValue()) : null;
        rn9 rn9Var = new rn9(this, (byte) 12);
        rn9Var.d = dg5Var;
        rn9Var.b = true;
        return rn9Var.j(new ue5(1577282693, new whf(this, (byte) 24), true));
    }

    public final e29 o0() {
        return (e29) this.g.getValue();
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.f;
    }
}

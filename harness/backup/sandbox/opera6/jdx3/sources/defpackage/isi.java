package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class isi extends k24 implements o37 {
    public final ua7 f;
    public final zyk g = z4c.b(new yse(this, 12));

    public isi(gjm gjmVar) {
        this.f = new ua7((Fragment) this, gjmVar);
    }

    @Override // defpackage.ryl
    public final void g0() {
        cqp.r0(this.f, Unit.a);
        super.g0();
    }

    @Override // defpackage.k24
    public final View n0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Integer numR = e82.r(((hsi) this.f.p()).a.a);
        dg5 dg5Var = numR != null ? new dg5(numR.intValue()) : null;
        rn9 rn9Var = new rn9(this, (byte) 12);
        rn9Var.d = dg5Var;
        rn9Var.b = true;
        return rn9Var.j(new ue5(417893187, new nqi((Object) this, (byte) 2), true));
    }

    public final qsi o0() {
        return (qsi) this.g.getValue();
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.f;
    }
}

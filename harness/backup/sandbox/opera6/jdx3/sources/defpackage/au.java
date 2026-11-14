package defpackage;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class au extends eu {
    public final et c;
    public final bs d;
    public is e;

    public au(ViewGroup viewGroup, tta ttaVar, bs bsVar) {
        et etVar = new et(viewGroup.getContext(), ttaVar, vr8.l);
        etVar.A = f03.t(2130969300, etVar.getContext(), 2131101243);
        super(etVar);
        this.c = etVar;
        this.d = bsVar;
        etVar.setOnClickListener(new ks8(new gf((Object) this, (byte) 5), (byte) 2));
        etVar.setOnLongClickListener(new zt((Object) this, (byte) 0));
    }

    @Override // defpackage.eu
    public final void U(js jsVar) {
        is isVar = (is) jsVar;
        this.e = isVar;
        et etVar = this.c;
        etVar.l = false;
        etVar.s();
        etVar.invalidate();
        st stVar = isVar.c;
        st stVar2 = etVar.s;
        etVar.s = stVar;
        if (!Intrinsics.a(stVar2 != null ? stVar2.j : null, stVar.j)) {
            etVar.w = 0;
            etVar.v();
            etVar.x = null;
            etVar.y = null;
            etVar.q(false);
            etVar.s();
            etVar.invalidate();
        }
        int i = isVar.c.k ? 2131231793 : 2131231792;
        if (etVar.o == i) {
            return;
        }
        etVar.o = i;
        etVar.p = sgb.F(i, etVar.getContext());
        etVar.invalidate();
    }
}

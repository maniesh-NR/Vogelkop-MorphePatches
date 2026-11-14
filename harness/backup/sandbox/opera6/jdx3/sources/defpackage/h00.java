package defpackage;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class h00 extends l00 {
    @Override // defpackage.xv8, defpackage.o43, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        int i;
        cie cieVar = f0().u;
        super.V(ja2Var, z);
        if (z || TextUtils.isEmpty(cieVar.r0) || TextUtils.isEmpty(cieVar.s0) || (i = cieVar.t0) <= 0) {
            return;
        }
        q9n.d(new g00(this, Math.min(i, 10), (byte) 0), ((i) this).itemView);
    }

    @Override // defpackage.l00, defpackage.ab2
    public final /* bridge */ /* synthetic */ mq Z() {
        return Z();
    }

    @Override // defpackage.l00, defpackage.o43
    public final /* bridge */ /* synthetic */ mq e0() {
        return e0();
    }

    @Override // defpackage.l00, defpackage.bu8
    public final /* bridge */ /* synthetic */ yz f0() {
        return f0();
    }

    @Override // defpackage.xv8, defpackage.bu8, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.p) {
            am2.v(ay3.a(wqm.I(f0().u.s0), lqm.p, false));
        } else {
            super.onClick(view);
        }
    }
}

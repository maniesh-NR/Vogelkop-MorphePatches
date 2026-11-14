package defpackage;

import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class kpb extends lpb {
    public final boolean e;

    public kpb(qq6 qq6Var, boolean z) {
        super(qq6Var, false, "", "");
        this.e = z;
    }

    @Override // defpackage.lpb
    public final int b() {
        return this.e ? 2132019362 : 2132019365;
    }

    @Override // defpackage.lpb
    public final int d() {
        return this.e ? 2132019364 : 2132019363;
    }

    @Override // defpackage.lpb
    public final void e(az0 az0Var, LinearLayout linearLayout) {
        super.e(az0Var, linearLayout);
        az0Var.b(this.e ? 2132019360 : 2132019361);
    }
}

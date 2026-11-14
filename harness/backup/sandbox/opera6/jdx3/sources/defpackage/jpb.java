package defpackage;

import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class jpb extends lpb {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jpb(qq6 qq6Var, boolean z, String str, String str2, byte b) {
        super(qq6Var, z, str, str2);
        this.e = b;
    }

    @Override // defpackage.lpb
    public final void e(az0 az0Var, LinearLayout linearLayout) {
        switch (this.e) {
            case 0:
                super.e(az0Var, linearLayout);
                wy0 wy0Var = az0Var.a;
                wy0Var.i = null;
                wy0Var.j = null;
                break;
            default:
                super.e(az0Var, linearLayout);
                break;
        }
    }
}

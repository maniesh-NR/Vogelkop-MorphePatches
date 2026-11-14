package defpackage;

import com.opera.android.browser.chromium.ChromiumContent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class hq9 {
    public final gq9 a = new gq9(this);
    public final xr5 b;
    public final umi c;
    public final x5f d;
    public final hd e;
    public final ki f;
    public final qt6 g;
    public short h;
    public final xy0 i;

    public hq9(xr5 xr5Var, ChromiumContent chromiumContent, umi umiVar, x5f x5fVar, hd hdVar, ki kiVar, boolean z, boolean z2) {
        this.b = xr5Var;
        this.c = umiVar;
        this.d = x5fVar;
        this.e = hdVar;
        this.f = kiVar;
        qt6 qt6Var = new qt6();
        qt6Var.f = this;
        qt6Var.d = new i18(this.c, this.d, this.e, this.f);
        qt6Var.c = chromiumContent;
        qt6Var.a = z;
        qt6Var.b = z2;
        this.g = qt6Var;
        xy0 xy0Var = new xy0(new WeakReference(this));
        this.i = xy0Var;
        xy0Var.sendEmptyMessage(1);
    }
}

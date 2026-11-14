package defpackage;

import com.opera.android.media.MediaPlayerMini;

/* loaded from: classes.dex */
public final class uld implements rjg {
    public final /* synthetic */ p12 a;

    public uld(p12 p12Var) {
        this.a = p12Var;
    }

    @Override // defpackage.rjg
    public final void d(sjg sjgVar) {
        p12 p12Var = this.a;
        if (sjgVar == ((sjg) p12Var.d)) {
            return;
        }
        if (sjgVar.a == 3 && p12Var.m()) {
            ((MediaPlayerMini) p12Var.c).postOnAnimationDelayed(new zr9(this, (sjg) p12Var.d, (byte) 27), 150L);
        }
        ((se3) p12Var.h).d();
    }

    @Override // defpackage.rjg
    public final void i(sjg sjgVar) {
        p12 p12Var = this.a;
        if (sjgVar == ((sjg) p12Var.d)) {
            return;
        }
        ((se3) p12Var.h).c();
    }
}

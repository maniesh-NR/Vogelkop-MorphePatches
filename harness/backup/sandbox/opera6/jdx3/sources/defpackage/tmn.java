package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class tmn implements Drawable.Callback {
    public final qjn a;
    public boolean b;
    public final /* synthetic */ ks3 c;

    public tmn(ks3 ks3Var, qjn qjnVar) {
        this.c = ks3Var;
        this.a = qjnVar;
        this.b = qjnVar.b();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        boolean z = this.b;
        qjn qjnVar = this.a;
        boolean z2 = !z && qjnVar.b();
        this.b = qjnVar.b();
        if (z2) {
            this.c.r();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }
}

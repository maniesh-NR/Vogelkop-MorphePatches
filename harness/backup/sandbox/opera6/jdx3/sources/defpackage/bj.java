package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class bj extends sgb {
    public final /* synthetic */ cj k;
    public final /* synthetic */ yqd l;

    public bj(cj cjVar, yqd yqdVar) {
        this.k = cjVar;
        this.l = yqdVar;
    }

    public final void U(Bitmap bitmap, boolean z) {
        cj cjVar = this.k;
        if (bitmap == null) {
            cjVar.b = false;
        }
        if (!z) {
            cjVar.c = false;
        }
        this.l.run();
    }
}

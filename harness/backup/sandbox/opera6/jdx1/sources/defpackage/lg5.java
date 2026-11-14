package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class lg5 implements ScrollCaptureCallback {
    public final k0j a;
    public final ccb b;
    public final foi c;
    public final v31 d;
    public final a64 e;
    public final nga f;

    public lg5(k0j k0jVar, ccb ccbVar, a64 a64Var, foi foiVar, v31 v31Var) {
        this.a = k0jVar;
        this.b = ccbVar;
        this.c = foiVar;
        this.d = v31Var;
        this.e = new a64(a64Var.l().plus(q97.a));
        this.f = new nga(ccbVar.b(), new kg5(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.view.ScrollCaptureSession r9, defpackage.ccb r10, nt5 r11) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg5.a(android.view.ScrollCaptureSession, ccb, nt5):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        na2.B(this.e, dze.b, null, new r3(this, runnable, null, (byte) 20), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        d3k d3kVarB = na2.B(this.e, null, null, new ig5(this, scrollCaptureSession, rect, consumer, null), 3);
        d3kVarB.s(new bo3(cancellationSignal, (byte) 29));
        cancellationSignal.setOnCancelListener(new mg5(d3kVarB, (byte) 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(xvg.u(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        ((t0g) this.c.a).setValue(Boolean.TRUE);
        runnable.run();
    }
}

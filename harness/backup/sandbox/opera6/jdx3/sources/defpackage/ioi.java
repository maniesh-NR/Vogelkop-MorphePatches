package defpackage;

import J.N;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.util.Size;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import com.opera.android.browser.WebContentsWrapper;
import java.util.ArrayList;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class ioi implements ScrollCaptureCallback {
    public hoi a;

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureEnd(Runnable runnable) {
        hoi hoiVar = this.a;
        hoiVar.getClass();
        N.Mud1A5Xc();
        r72 r72Var = hoiVar.c;
        if (r72Var != null) {
            r72Var.b();
            hoiVar.c = null;
        }
        hoiVar.d = null;
        hoiVar.e = 0;
        hoiVar.f = 1.0f;
        runnable.run();
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) throws Surface.OutOfResourcesException, IllegalArgumentException {
        hoi hoiVar = this.a;
        Surface surface = scrollCaptureSession.getSurface();
        wa waVar = new wa(consumer, (byte) 23);
        rect.offset(0, hoiVar.e);
        if (!rect.intersect(hoiVar.d) || rect.height() < 20) {
            waVar.c(new Rect());
            return;
        }
        r72 r72Var = hoiVar.c;
        g1d g1dVar = new g1d((ng3) r72Var.c, rect, new fb((byte) 1));
        byte b = r72Var.a;
        if (b == 4) {
            g1dVar.a();
        } else if (b == 5) {
            ((ArrayList) r72Var.b).add(g1dVar);
        } else {
            g1dVar.b(b);
        }
        g1dVar.e = new uf(hoiVar, g1dVar, waVar, rect, surface, (byte) 3);
        byte b2 = g1dVar.c;
        if (b2 != 0) {
            g1dVar.b(b2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    @Override // android.view.ScrollCaptureCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrollCaptureSearch(android.os.CancellationSignal r5, java.util.function.Consumer r6) {
        /*
            r4 = this;
            hoi r4 = r4.a
            com.opera.android.browser.WebContentsWrapper r5 = r4.b
            org.chromium.content_public.browser.WebContents r5 = r5.e()
            com.opera.android.browser.WebContentsWrapper r0 = r4.b
            android.view.View r0 = r0.getView()
            if (r0 == 0) goto L41
            if (r5 == 0) goto L41
            com.opera.android.browser.WebContentsWrapper r0 = r4.b
            long r0 = r0.a
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L41
            boolean r0 = J.N.MWxyiKiL(r0)
            if (r0 == 0) goto L41
            org.chromium.content.browser.webcontents.WebContentsImpl r5 = (org.chromium.content.browser.webcontents.WebContentsImpl) r5
            huh r5 = r5.g
            android.graphics.Rect r0 = new android.graphics.Rect
            float r1 = r5.e
            float r1 = r5.a(r1)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            int r2 = r5.b()
            r3 = 0
            r0.<init>(r3, r3, r1, r2)
            float r5 = r5.h
            r4.f = r5
            goto L46
        L41:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
        L46:
            r6.accept(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ioi.onScrollCaptureSearch(android.os.CancellationSignal, java.util.function.Consumer):void");
    }

    @Override // android.view.ScrollCaptureCallback
    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        hoi hoiVar = this.a;
        a36 a36Var = hoiVar.a;
        WebContentsWrapper webContentsWrapper = hoiVar.b;
        r72 r72Var = new r72(webContentsWrapper.c(), webContentsWrapper);
        hoiVar.c = r72Var;
        goi goiVar = new goi(hoiVar, cancellationSignal, runnable);
        ((h7f) r72Var.d).b(goiVar);
        goiVar.b(r72Var.a);
        if (r72Var.a == 4) {
            vzk vzkVar = ((ng3) r72Var.c).a;
            goiVar.a(vzkVar == null ? null : (Size) vzkVar.c, vzkVar != null ? (Point) vzkVar.d : null);
        }
        N.Mjfn11hV();
    }
}

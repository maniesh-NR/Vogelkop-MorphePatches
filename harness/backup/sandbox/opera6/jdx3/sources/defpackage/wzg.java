package defpackage;

import J.N;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.opera.android.favorites.SpeedDialDataFetcher;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class wzg implements uu5, bnj, rr9, rba, hpf, dn, OnCompleteListener {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public wzg(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new CountDownLatch(1);
                break;
            case 13:
                this.b = new dfe(new Reference[16]);
                this.c = new ReferenceQueue();
                break;
            default:
                this.b = new ArrayDeque();
                this.c = new kze(Boolean.FALSE);
                break;
        }
    }

    public /* synthetic */ wzg(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.b = obj2;
        this.c = obj;
    }

    public wzg(Resources resources, uu1 uu1Var) {
        this.a = (byte) 3;
        this.b = resources.getResourcePackageName(2131364071);
        this.c = resources;
    }

    public wzg(TextView textView) {
        this.a = (byte) 6;
        this.b = textView;
    }

    public wzg(d7h d7hVar, iu2 iu2Var) {
        this.a = (byte) 11;
        this.b = iu2Var;
        Objects.requireNonNull(d7hVar);
        this.c = d7hVar;
    }

    public /* synthetic */ wzg(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public static boolean b(String str) {
        return !str.isEmpty() && str.charAt(0) == '/';
    }

    @Override // defpackage.bnj
    public final void F(Bitmap bitmap) {
        ((SpeedDialDataFetcher) this.c).finalizeAndSetIcon(bitmap, false);
    }

    @Override // defpackage.hpf
    public final void I(fpf fpfVar) {
        ((d7h) this.c).c(fpfVar.d, (iu2) this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        if (r9 != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.uu5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable l(nyb r8, mt5 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.x0i
            if (r0 == 0) goto L13
            r0 = r9
            x0i r0 = (defpackage.x0i) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            x0i r0 = new x0i
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L32
            if (r2 != r3) goto L2c
            ybh.y(r9)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            goto La3
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r7)
            return r4
        L32:
            s9m r7 = r0.u
            nyb r8 = r0.t
            ybh.y(r9)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            goto L89
        L3a:
            ybh.y(r9)
            if (r8 != 0) goto L41
            r9 = -1
            goto L4e
        L41:
            boolean r9 = r8 instanceof defpackage.myb     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            if (r9 == 0) goto L47
            r9 = 0
            goto L4e
        L47:
            boolean r9 = r8 instanceof defpackage.lyb     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            if (r9 == 0) goto L4d
            r9 = r5
            goto L4e
        L4d:
            r9 = -2
        L4e:
            if (r9 == 0) goto L64
            if (r9 != r5) goto L5e
            p0i r7 = t0i.b     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            lyb r8 = (defpackage.lyb) r8     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            java.lang.Throwable r7 = r8.a     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            q0i r8 = new q0i     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            r8.<init>(r7)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            goto Laf
        L5e:
            oye r7 = new oye     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            r7.<init>()     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            throw r7     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
        L64:
            java.lang.Object r9 = r7.b     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            s9m r9 = (s9m) r9     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            java.util.List r9 = r9.b     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            java.lang.Object r9 = kotlin.collections.CollectionsKt.K(r9)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            s9m r9 = (s9m) r9     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            java.lang.Object r7 = r7.c     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            jyb r7 = (jyb) r7     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            uu5 r7 = r7.a(r9)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            if (r7 == 0) goto L8c
            r0.t = r8     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            r0.u = r9     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            r0.x = r5     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            java.lang.Object r7 = r7.l(r8, r0)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            if (r7 == r1) goto La2
            r6 = r9
            r9 = r7
            r7 = r6
        L89:
            if (r9 != 0) goto La3
            r9 = r7
        L8c:
            myb r8 = (defpackage.myb) r8     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            fr6 r7 = r8.a     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            x9m r8 = r9.c     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            r0.t = r4     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            r0.u = r4     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            r0.x = r3     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            tna r7 = r7.T()     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            java.lang.Object r9 = r7.b(r8, r0)     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            if (r9 != r1) goto La3
        La2:
            return r1
        La3:
            p0i r7 = t0i.b     // Catch: java.lang.Throwable -> La7 java.util.concurrent.CancellationException -> Lb5
            r8 = r9
            goto Laf
        La7:
            r7 = move-exception
            p0i r8 = t0i.b
            q0i r8 = new q0i
            r8.<init>(r7)
        Laf:
            t0i r7 = new t0i
            r7.<init>(r8)
            return r7
        Lb5:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzg.l(nyb, mt5):java.io.Serializable");
    }

    public final void c(w8k w8kVar, int i) {
        ((a5o) this.c).a(new mjf((t1h) this.b, w8kVar, false, i));
    }

    @Override // defpackage.rba
    public final void d() {
        a4m a4mVar = (a4m) ((ioc) this.c).e;
        nv6 nv6VarB = ru9.c(a4mVar.a).b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("translate_web_pages.tap_to_access_feature_hint.shown", true);
        nv6VarB.w();
        f6l f6lVar = a4mVar.j;
        if (f6lVar == null) {
            return;
        }
        a4mVar.c.H(f6lVar);
        a4mVar.j = null;
    }

    @Override // defpackage.bnj
    public final void f(boolean z) {
        SpeedDialDataFetcher speedDialDataFetcher = (SpeedDialDataFetcher) this.c;
        WebContents webContents = (WebContents) this.b;
        if (webContents == null || webContents.isDestroyed()) {
            speedDialDataFetcher.finalizeAndSetIcon(null, z);
        } else {
            N.MF7CqBEc(speedDialDataFetcher, webContents, speedDialDataFetcher.e);
        }
    }

    @Override // defpackage.hpf
    public final void h(cpf cpfVar) {
        ((iu2) this.b).run(sgb.F(2131231790, (Context) ((d7h) this.c).b));
    }

    @Override // defpackage.dn
    public final void i() {
        ((dzo) ((joo) this.c).o.p.a).c.loadUrl("javascript:(function() {var css = 'body { display: flex; justify-content: center; align-items: center; }';var style = document.createElement('style');style.type = 'text/css';style.appendChild(document.createTextNode(css));document.head.appendChild(style);})()");
        ((dn) this.b).i();
    }

    @Override // defpackage.hpf
    public final void n(epf epfVar) {
        ((iu2) this.b).run(sgb.F(2131231790, (Context) ((d7h) this.c).b));
    }

    public final void onComplete(Task task) {
        switch (this.a) {
            case 16:
                vko vkoVar = (vko) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                synchronized (vkoVar.f) {
                    vkoVar.e.remove(taskCompletionSource);
                }
                return;
            default:
                sup supVar = (sup) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                synchronized (supVar.f) {
                    supVar.e.remove(taskCompletionSource2);
                }
                return;
        }
    }

    @Override // defpackage.rr9
    public final void onFailure(Throwable th) {
        nbl nblVar = (nbl) this.c;
        yqa yqaVar = (yqa) this.b;
        if (((xwh) yqaVar.c).f) {
            return;
        }
        Object obj = ((ai4) ((ArrayList) yqaVar.b).get(0)).e.a.get("CAPTURE_CONFIG_ID_KEY");
        int iIntValue = obj == null ? -1 : ((Integer) obj).intValue();
        boolean z = th instanceof gwa;
        r9i r9iVar = nblVar.c;
        if (z) {
            ap2 ap2Var = new ap2(iIntValue, (gwa) th);
            r9iVar.getClass();
            xug.i();
            ((xm2) r9iVar.e).k.accept(ap2Var);
        } else {
            ap2 ap2Var2 = new ap2(iIntValue, new gwa(2, "Failed to submit capture request", th));
            r9iVar.getClass();
            xug.i();
            ((xm2) r9iVar.e).k.accept(ap2Var2);
        }
        nblVar.b.P();
    }

    @Override // defpackage.rr9
    public final void onSuccess(Object obj) {
        ((nbl) this.c).b.P();
    }

    @Override // defpackage.dn
    public final void p(bm bmVar) {
        ((dn) this.b).p(bmVar);
    }

    @Override // defpackage.hpf
    public final void r(gpf gpfVar) {
        ((iu2) this.b).run(sgb.F(2131231790, (Context) ((d7h) this.c).b));
    }

    @Override // defpackage.rba
    public final void s() {
        ((a4m) ((ioc) this.c).e).f.i = 2131363835;
        ((View) this.b).callOnClick();
    }

    @Override // defpackage.rba
    public final void t() {
    }

    @Override // defpackage.rba
    public final void z() {
    }
}

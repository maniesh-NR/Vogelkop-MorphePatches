package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import defpackage.anp;
import defpackage.e3p;
import defpackage.iao;
import defpackage.kap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class h7 {
    public final n61 a;
    public final u83 b;
    public final ia3 c;
    public final th3 d;
    public final anp e;
    public final long f;
    public final kap g;
    public final long h;
    public final long i = System.currentTimeMillis();
    public final boolean j;
    public final long k;

    public h7(n61 n61Var, u83 u83Var, ia3 ia3Var, th3 th3Var, anp anpVar, kap kapVar, l7 l7Var) {
        this.a = n61Var;
        this.b = u83Var;
        this.c = ia3Var;
        this.d = th3Var;
        this.e = anpVar;
        this.f = l7Var.L();
        this.g = kapVar;
        this.h = l7Var.q();
        this.j = l7Var.w();
        this.k = l7Var.r();
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x009a: IGET (r11 I:anp) = (r4 I:ads_mobile_sdk.h7) ads_mobile_sdk.h7.e anp, block:B:44:0x0096 */
    /* JADX WARN: Type inference failed for: r4v4, types: [ads_mobile_sdk.h7] */
    public final String a(Context context, String str, View view, Activity activity) {
        ?? r4;
        f7 f7Var;
        th3 th3Var = this.d;
        iao iaoVar = new iao(fl0.EVENT_ID_SIGNAL_CLICK, th3Var.b, th3Var.a);
        try {
            try {
                iaoVar.b();
                n61 n61Var = this.a;
                try {
                    synchronized (n61Var) {
                        f7Var = n61Var.e;
                        f7Var.getClass();
                    }
                    String str2 = (String) g7.j(f7Var, new e3p(this, context, str, view, activity, (byte) 1), m97.a).get(this.f, TimeUnit.MILLISECONDS);
                    iaoVar.a();
                    this.e.a();
                    return str2;
                } catch (InterruptedException e) {
                    e = e;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    iaoVar.a(interruptedException);
                    iaoVar.a();
                    this.e.a();
                    return "";
                } catch (ExecutionException e2) {
                    e = e2;
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    iaoVar.a(th);
                    iaoVar.a();
                    this.e.a();
                    return "3";
                } catch (TimeoutException unused) {
                    this.d.b(fl0.EVENT_ID_CLICK_SIGNAL_TIMEOUT);
                    iaoVar.a();
                    this.e.a();
                    return "17";
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    iaoVar.a(th3);
                    throw th3;
                }
            } catch (Throwable th4) {
                iaoVar.a();
                r4.e.a();
                throw th4;
            }
        } catch (InterruptedException e3) {
            e = e3;
        } catch (ExecutionException e4) {
            e = e4;
        } catch (TimeoutException unused2) {
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final String a(boolean z) {
        if (!z) {
            this.d.b(fl0.EVENT_ID_QUERY_SIGNAL_TIMEOUT);
            return "17";
        }
        up1 up1Var = (up1) this.g.get();
        long j = this.i;
        th3 th3Var = up1Var.b;
        try {
            new iao(fl0.EVENT_ID_MINIMAL_SIGNAL_QUERY, th3Var.b, th3Var.a).b();
            return up1Var.a(j);
        } finally {
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x009a: IGET (r11 I:anp) = (r4 I:ads_mobile_sdk.h7) ads_mobile_sdk.h7.e anp, block:B:44:0x0096 */
    /* JADX WARN: Type inference failed for: r4v4, types: [ads_mobile_sdk.h7] */
    public final String b(Context context, String str, View view, Activity activity) {
        ?? r4;
        f7 f7Var;
        th3 th3Var = this.d;
        iao iaoVar = new iao(fl0.EVENT_ID_SIGNAL_VIEW, th3Var.b, th3Var.a);
        try {
            try {
                iaoVar.b();
                n61 n61Var = this.a;
                try {
                    synchronized (n61Var) {
                        f7Var = n61Var.e;
                        f7Var.getClass();
                    }
                    String str2 = (String) g7.j(f7Var, new e3p(this, context, str, view, activity, (byte) 0), m97.a).get(this.f, TimeUnit.MILLISECONDS);
                    iaoVar.a();
                    this.e.a();
                    return str2;
                } catch (InterruptedException e) {
                    e = e;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    iaoVar.a(interruptedException);
                    iaoVar.a();
                    this.e.a();
                    return "";
                } catch (ExecutionException e2) {
                    e = e2;
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    iaoVar.a(th);
                    iaoVar.a();
                    this.e.a();
                    return "3";
                } catch (TimeoutException unused) {
                    this.d.b(fl0.EVENT_ID_VIEW_SIGNAL_TIMEOUT);
                    iaoVar.a();
                    this.e.a();
                    return "17";
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    iaoVar.a(th3);
                    throw th3;
                }
            } catch (Throwable th4) {
                iaoVar.a();
                r4.e.a();
                throw th4;
            }
        } catch (InterruptedException e3) {
            e = e3;
        } catch (ExecutionException e4) {
            e = e4;
        } catch (TimeoutException unused2) {
        } catch (Throwable th5) {
            th = th5;
        }
    }
}

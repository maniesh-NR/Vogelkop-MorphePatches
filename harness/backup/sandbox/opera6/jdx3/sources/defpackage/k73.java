package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.fragment.app.i;
import androidx.fragment.app.r;
import androidx.fragment.app.w;
import com.opera.android.browser.chromium.media.OperaMediaRouterClient;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import org.chromium.base.ApplicationStatus;
import org.chromium.components.media_router.BrowserMediaRouter;
import org.chromium.components.media_router.BrowserMediaRouterDialogController;

/* loaded from: classes.dex */
public abstract class k73 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public k73() {
        this.a = (byte) 5;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public k73(Context context, a5o a5oVar) {
        this.a = (byte) 1;
        this.b = a5oVar;
        this.c = context.getApplicationContext();
        this.d = new Object();
        this.e = new LinkedHashSet();
    }

    public k73(ViewGroup viewGroup, js5 js5Var, g1j g1jVar, jv0 jv0Var, wln wlnVar) {
        this.a = (byte) 2;
        this.b = viewGroup;
        this.c = js5Var;
        this.d = g1jVar;
        this.e = jv0Var;
        this.f = wlnVar;
    }

    public k73(String str, vnd vndVar, BrowserMediaRouterDialogController browserMediaRouterDialogController) {
        this.a = (byte) 0;
        this.b = str;
        this.c = vndVar;
        this.d = BrowserMediaRouter.a();
        this.e = browserMediaRouterDialogController;
    }

    public k73(String str, wjh wjhVar, a64 a64Var) {
        this.a = (byte) 4;
        this.b = str;
        this.c = wjhVar;
        this.d = a64Var;
        this.e = na2.f(a64Var, (jg8) wjhVar.e, rx5.b, new bz1((byte) 9, null, this));
        this.f = new AtomicBoolean();
    }

    public k73(p83 p83Var) {
        this.a = (byte) 3;
        Path path = new Path();
        this.c = path;
        this.d = new Path();
        this.e = new PathMeasure(path, false);
        this.b = p83Var;
        this.f = new Matrix();
    }

    public static float D(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public abstract void A();

    public String B() {
        return "";
    }

    public final void C() {
        k73 k73Var = (k73) this.e;
        if (k73Var != null) {
            k73Var.f = (k73) this.f;
        } else {
            k73 k73Var2 = (k73) this.b;
            if (k73Var2 != null) {
                k73Var2.c = (k73) this.f;
            }
        }
        k73 k73Var3 = (k73) this.f;
        if (k73Var3 != null) {
            k73Var3.e = k73Var;
        } else {
            k73 k73Var4 = (k73) this.b;
            if (k73Var4 != null) {
                k73Var4.d = k73Var;
            }
        }
        this.b = null;
        this.f = null;
        this.e = null;
    }

    public abstract void a(xan xanVar);

    public abstract void b(Canvas canvas, Rect rect, float f, boolean z, boolean z2);

    public final void c(k73 k73Var) {
        k73Var.C();
        k73Var.w(this);
        k73 k73Var2 = (k73) this.d;
        if (k73Var2 == null) {
            this.c = k73Var;
            this.d = k73Var;
        } else {
            k73Var2.f = k73Var;
            k73Var.e = k73Var2;
            this.d = k73Var;
        }
    }

    public abstract Object d();

    public final void e() {
        if (((AtomicBoolean) this.f).getAndSet(true)) {
            return;
        }
        ((i07) this.e).k((CancellationException) null);
        na2.B((a64) this.d, (jg8) ((wjh) this.c).d, (rx5) null, new yf((byte) 20, (mt5) null, this), 2);
    }

    public void f(int i, int i2, Canvas canvas, Paint paint) {
    }

    public abstract void g(Canvas canvas, Paint paint, rl7 rl7Var, int i);

    public abstract void h(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3);

    public k73 i() {
        return (k73) this.b;
    }

    public int j() {
        hfc hfcVar = (p83) this.b;
        return ((p83) hfcVar).a + (((p83) hfcVar).l << 1);
    }

    public int k() {
        return -1;
    }

    public final void l(k73 k73Var) {
        k73Var.C();
        k73 k73Var2 = (k73) this.f;
        k73Var.f = k73Var2;
        if (k73Var2 != null) {
            k73Var2.e = k73Var;
        }
        k73Var.e = this;
        this.f = k73Var;
        k73 k73Var3 = (k73) this.b;
        k73Var.b = k73Var3;
        if (((k73) k73Var.f) == null) {
            k73Var3.d = k73Var;
        }
    }

    public final void m(k73 k73Var) {
        k73Var.C();
        k73 k73Var2 = (k73) this.e;
        k73Var.e = k73Var2;
        if (k73Var2 != null) {
            k73Var2.f = k73Var;
        }
        k73Var.f = this;
        this.e = k73Var;
        k73 k73Var3 = (k73) this.b;
        k73Var.b = k73Var3;
        if (((k73) k73Var.e) == null) {
            k73Var3.c = k73Var;
        }
    }

    public abstract void n();

    public boolean o() {
        return false;
    }

    public final void p() {
        BrowserMediaRouterDialogController browserMediaRouterDialogController = (BrowserMediaRouterDialogController) this.e;
        OperaMediaRouterClient.b.getClass();
        r rVar = ApplicationStatus.d;
        w supportFragmentManager = rVar == null ? null : rVar.getSupportFragmentManager();
        if (supportFragmentManager == null) {
            browserMediaRouterDialogController.a();
            return;
        }
        i iVarQ = q(supportFragmentManager);
        this.f = iVarQ;
        if (iVarQ == null) {
            browserMediaRouterDialogController.a();
        }
    }

    public abstract i q(w wVar);

    public abstract Object r(izd izdVar);

    public abstract Object s();

    public abstract void t(ge5 ge5Var);

    public final String toString() {
        switch (this.a) {
            case 5:
                return getClass().getSimpleName() + "{" + B() + "}";
            default:
                return super.toString();
        }
    }

    public abstract void u(ge5 ge5Var);

    public abstract void v(int i, ks5 ks5Var, ls5 ls5Var);

    public void w(k73 k73Var) {
        this.b = k73Var;
    }

    public final void x(Object obj) {
        synchronized (this.d) {
            Object obj2 = this.f;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f = obj;
                ((a5o) this.b).d.execute(new fh4(CollectionsKt.k0((LinkedHashSet) this.e), this, (byte) 13));
            }
        }
    }

    public boolean y(qs5 qs5Var, boolean z) {
        js5 js5Var = (js5) this.c;
        if (!js5Var.a(qs5Var, z)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) this.b;
        if (viewGroup.getVisibility() != 0 || viewGroup.getParent() == null) {
            return false;
        }
        js5Var.e(qs5Var, this);
        return true;
    }

    public abstract void z();
}

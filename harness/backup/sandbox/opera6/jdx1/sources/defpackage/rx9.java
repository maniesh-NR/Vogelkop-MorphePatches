package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rx9 {
    public final f3k a;
    public final Handler b;
    public final ArrayList c;
    public final kwh d;
    public final zg3 e;
    public boolean f;
    public boolean g;
    public uvh h;
    public ox9 i;
    public boolean j;
    public ox9 k;
    public Bitmap l;
    public ox9 m;
    public int n;
    public int o;
    public int p;

    public rx9(a aVar, f3k f3kVar, int i, int i2, Bitmap bitmap) {
        zg3 zg3Var = aVar.a;
        ry9 ry9Var = aVar.c;
        Context baseContext = ry9Var.getBaseContext();
        qyn.l(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        kwh kwhVarB = a.b(baseContext).f.b(baseContext);
        Context baseContext2 = ry9Var.getBaseContext();
        qyn.l(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        kwh kwhVarB2 = a.b(baseContext2).f.b(baseContext2);
        kwhVarB2.getClass();
        uvh uvhVarB = new uvh(kwhVarB2.a, kwhVarB2, Bitmap.class, kwhVarB2.b).b(kwh.l).b(((rwh) ((rwh) ((rwh) new rwh().f(w97.b)).r()).n()).i(i, i2));
        this.c = new ArrayList();
        this.d = kwhVarB;
        Handler handler = new Handler(Looper.getMainLooper(), new qx9(this, (byte) 0));
        this.e = zg3Var;
        this.b = handler;
        this.h = uvhVarB;
        this.a = f3kVar;
        c(ylm.b, bitmap);
    }

    public final void a() {
        int i;
        if (!this.f || this.g) {
            return;
        }
        ox9 ox9Var = this.m;
        if (ox9Var != null) {
            this.m = null;
            b(ox9Var);
            return;
        }
        this.g = true;
        f3k f3kVar = this.a;
        int i2 = f3kVar.l.c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((i2 <= 0 || (i = f3kVar.k) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((nx9) r2.e.get(i)).i);
        int i3 = (f3kVar.k + 1) % f3kVar.l.c;
        f3kVar.k = i3;
        this.k = new ox9(this.b, i3, jUptimeMillis);
        uvh uvhVarB = this.h.b((rwh) new rwh().m(new o6f(Double.valueOf(Math.random()))));
        uvhVarB.u = f3kVar;
        uvhVarB.v = true;
        uvhVarB.t(this.k);
    }

    public final void b(ox9 ox9Var) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, ox9Var).sendToTarget();
            return;
        }
        if (!this.f) {
            this.m = ox9Var;
            return;
        }
        if (ox9Var.e != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.e.b(bitmap);
                this.l = null;
            }
            ox9 ox9Var2 = this.i;
            this.i = ox9Var;
            ArrayList arrayList = this.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                kx9 kx9Var = (kx9) ((px9) arrayList.get(size));
                Object callback = kx9Var.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    kx9Var.stop();
                    kx9Var.invalidateSelf();
                } else {
                    kx9Var.invalidateSelf();
                    ox9 ox9Var3 = ((rx9) kx9Var.a.b).i;
                    if ((ox9Var3 != null ? ox9Var3.c : -1) == r6.a.l.c - 1) {
                        kx9Var.f++;
                    }
                    int i = kx9Var.g;
                    if (i != -1 && kx9Var.f >= i) {
                        ArrayList arrayList2 = kx9Var.k;
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((Animatable2Compat.AnimationCallback) kx9Var.k.get(i2)).onAnimationEnd(kx9Var);
                            }
                        }
                        kx9Var.stop();
                    }
                }
            }
            if (ox9Var2 != null) {
                handler.obtainMessage(2, ox9Var2).sendToTarget();
            }
        }
        a();
    }

    public final void c(f2m f2mVar, Bitmap bitmap) {
        qyn.l(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.h = this.h.b(new rwh().p(f2mVar, true));
        this.n = rm5.x(bitmap);
        this.o = bitmap.getWidth();
        this.p = bitmap.getHeight();
    }
}

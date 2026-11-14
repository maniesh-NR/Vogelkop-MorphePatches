package defpackage;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class f3d extends Drawable implements Drawable.Callback, Animatable {
    public static final ThreadPoolExecutor H = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), (ThreadFactory) new o3d());
    public boolean A;
    public final Semaphore B;
    public final dnb C;
    public float D;
    public int E;
    public int F;
    public int G;
    public p2d a;
    public final p3d b;
    public boolean c;
    public boolean d;
    public final ArrayList e;
    public l45 f;
    public String g;
    public x79 h;
    public String i;
    public boolean j;
    public boolean k;
    public gi5 l;
    public int m;
    public boolean n;
    public final Matrix o;
    public Bitmap p;
    public Canvas q;
    public Rect r;
    public RectF s;
    public ezb t;
    public Rect u;
    public Rect v;
    public RectF w;
    public RectF x;
    public Matrix y;
    public Matrix z;

    public f3d() {
        p3d p3dVar = new p3d();
        this.b = p3dVar;
        this.c = true;
        this.d = false;
        this.E = 1;
        this.e = new ArrayList();
        this.k = true;
        this.m = 255;
        this.F = 1;
        this.n = false;
        this.o = new Matrix();
        this.A = false;
        nl2 nl2Var = new nl2(this, (byte) 12);
        this.B = new Semaphore(1);
        this.C = new dnb(this, (byte) 16);
        this.D = -3.4028235E38f;
        p3dVar.addUpdateListener(nl2Var);
    }

    public static void g(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a(dvb dvbVar, Integer num, ykj ykjVar) {
        b(dvbVar, num, new i2d(ykjVar, (byte) 1));
    }

    public final void b(final dvb dvbVar, final Object obj, final ua7 ua7Var) {
        gi5 gi5Var = this.l;
        if (gi5Var == null) {
            this.e.add(new e3d() { // from class: d3d
                @Override // defpackage.e3d
                public final void run() {
                    this.a.b(dvbVar, obj, ua7Var);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (dvbVar == dvb.c) {
            gi5Var.d(ua7Var, obj);
        } else {
            evb evbVar = dvbVar.b;
            if (evbVar != null) {
                evbVar.d(ua7Var, obj);
            } else {
                List listM = m(dvbVar);
                for (int i = 0; i < listM.size(); i++) {
                    ((dvb) listM.get(i)).b.d(ua7Var, obj);
                }
                zIsEmpty = true ^ listM.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == k3d.z) {
                r(this.b.b());
            }
        }
    }

    public final boolean c() {
        return this.c || this.d;
    }

    public final void d() {
        p2d p2dVar = this.a;
        if (p2dVar == null) {
            return;
        }
        z8b z8bVar = w1c.a;
        Rect rect = p2dVar.i;
        List list = Collections.EMPTY_LIST;
        gi5 gi5Var = new gi5(this, new t1c(list, p2dVar, "__container", -1L, 1, -1L, null, list, new id1(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), p2dVar.h, p2dVar);
        this.l = gi5Var;
        gi5Var.F = this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        gi5 gi5Var = this.l;
        if (gi5Var != null) {
            int i = this.G;
            if (i == 0) {
                i = 1;
            }
            boolean z = i == 2;
            Runnable runnable = this.C;
            ThreadPoolExecutor threadPoolExecutor = H;
            p3d p3dVar = this.b;
            Semaphore semaphore = this.B;
            if (z) {
                try {
                    semaphore.acquire();
                    if (s()) {
                        r(p3dVar.b());
                    }
                } catch (InterruptedException unused) {
                    if (z) {
                        semaphore.release();
                        if (gi5Var.E != p3dVar.b()) {
                            threadPoolExecutor.execute(runnable);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (z) {
                        semaphore.release();
                        if (gi5Var.E != p3dVar.b()) {
                            threadPoolExecutor.execute(runnable);
                        }
                    }
                    throw th;
                }
            }
            if (this.n) {
                l(canvas, gi5Var);
            } else {
                h(canvas);
            }
            this.A = false;
            if (z) {
                semaphore.release();
                if (gi5Var.E != p3dVar.b()) {
                    threadPoolExecutor.execute(runnable);
                }
            }
        }
    }

    public final void e() {
        p3d p3dVar = this.b;
        if (p3dVar.m) {
            p3dVar.cancel();
            if (!isVisible()) {
                this.E = 1;
            }
        }
        this.a = null;
        this.l = null;
        this.f = null;
        this.D = -3.4028235E38f;
        p3dVar.l = null;
        p3dVar.j = -2.1474836E9f;
        p3dVar.k = 2.1474836E9f;
        invalidateSelf();
    }

    public final void f() {
        p2d p2dVar = this.a;
        if (p2dVar == null) {
            return;
        }
        int i = this.F;
        int i2 = p2dVar.m;
        int iA = vep.A(i);
        boolean z = false;
        if (iA != 1 && (iA == 2 || i2 > 4)) {
            z = true;
        }
        this.n = z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        p2d p2dVar = this.a;
        if (p2dVar == null) {
            return -1;
        }
        return p2dVar.i.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        p2d p2dVar = this.a;
        if (p2dVar == null) {
            return -1;
        }
        return p2dVar.i.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(Canvas canvas) {
        gi5 gi5Var = this.l;
        p2d p2dVar = this.a;
        if (gi5Var == null || p2dVar == null) {
            return;
        }
        Matrix matrix = this.o;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preScale(r3.width() / p2dVar.i.width(), r3.height() / p2dVar.i.height());
            matrix.preTranslate(r3.left, r3.top);
        }
        gi5Var.h(canvas, matrix, this.m);
    }

    public final boolean i() {
        p3d p3dVar = this.b;
        if (p3dVar == null) {
            return false;
        }
        return p3dVar.m;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.A) {
            return;
        }
        this.A = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return i();
    }

    public final void j() {
        this.e.clear();
        p3d p3dVar = this.b;
        p3dVar.j(true);
        Iterator it = p3dVar.c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(p3dVar);
        }
        if (isVisible()) {
            return;
        }
        this.E = 1;
    }

    public final void k() {
        if (this.l == null) {
            this.e.add(new z2d(this, (byte) 1));
            return;
        }
        f();
        boolean zC = c();
        p3d p3dVar = this.b;
        if (zC || p3dVar.getRepeatCount() == 0) {
            if (isVisible()) {
                p3dVar.m = true;
                boolean zF = p3dVar.f();
                Iterator it = p3dVar.b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(p3dVar, zF);
                }
                p3dVar.k((int) (p3dVar.f() ? p3dVar.c() : p3dVar.e()));
                p3dVar.f = 0L;
                p3dVar.i = 0;
                if (p3dVar.m) {
                    p3dVar.j(false);
                    Choreographer.getInstance().postFrameCallback(p3dVar);
                }
                this.E = 1;
            } else {
                this.E = 2;
            }
        }
        if (c()) {
            return;
        }
        p((int) (p3dVar.d < 0.0f ? p3dVar.e() : p3dVar.c()));
        p3dVar.j(true);
        p3dVar.g(p3dVar.f());
        if (isVisible()) {
            return;
        }
        this.E = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.graphics.Canvas r10, defpackage.gi5 r11) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f3d.l(android.graphics.Canvas, gi5):void");
    }

    public final List m(dvb dvbVar) {
        if (this.l == null) {
            izc.b("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.l.c(dvbVar, 0, arrayList, new dvb(new String[0]));
        return arrayList;
    }

    public final void n() {
        if (this.l == null) {
            this.e.add(new z2d(this, (byte) 0));
            return;
        }
        f();
        boolean zC = c();
        p3d p3dVar = this.b;
        if (zC || p3dVar.getRepeatCount() == 0) {
            if (isVisible()) {
                p3dVar.m = true;
                p3dVar.j(false);
                Choreographer.getInstance().postFrameCallback(p3dVar);
                p3dVar.f = 0L;
                if (p3dVar.f() && p3dVar.h == p3dVar.e()) {
                    p3dVar.k(p3dVar.c());
                } else if (!p3dVar.f() && p3dVar.h == p3dVar.c()) {
                    p3dVar.k(p3dVar.e());
                }
                Iterator it = p3dVar.c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(p3dVar);
                }
                this.E = 1;
            } else {
                this.E = 3;
            }
        }
        if (c()) {
            return;
        }
        p((int) (p3dVar.d < 0.0f ? p3dVar.e() : p3dVar.c()));
        p3dVar.j(true);
        p3dVar.g(p3dVar.f());
        if (isVisible()) {
            return;
        }
        this.E = 1;
    }

    public boolean o(p2d p2dVar) {
        if (this.a == p2dVar) {
            return false;
        }
        this.A = true;
        e();
        this.a = p2dVar;
        d();
        p3d p3dVar = this.b;
        boolean z = p3dVar.l == null;
        p3dVar.l = p2dVar;
        if (z) {
            p3dVar.l(Math.max(p3dVar.j, p2dVar.j), Math.min(p3dVar.k, p2dVar.k));
        } else {
            p3dVar.l((int) p2dVar.j, (int) p2dVar.k);
        }
        float f = p3dVar.h;
        p3dVar.h = 0.0f;
        p3dVar.g = 0.0f;
        p3dVar.k((int) f);
        p3dVar.i();
        r(p3dVar.getAnimatedFraction());
        ArrayList arrayList = this.e;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            e3d e3dVar = (e3d) it.next();
            if (e3dVar != null) {
                e3dVar.run();
            }
            it.remove();
        }
        arrayList.clear();
        f();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void p(int i) {
        if (this.a != null) {
            this.b.k(i);
        } else {
            this.e.add(new c3d(this, i, (byte) 1));
        }
    }

    public final void q(final int i, final int i2) {
        if (this.a == null) {
            this.e.add(new e3d() { // from class: b3d
                @Override // defpackage.e3d
                public final void run() {
                    this.a.q(i, i2);
                }
            });
        } else {
            this.b.l(i, i2 + 0.99f);
        }
    }

    public final void r(final float f) {
        p2d p2dVar = this.a;
        if (p2dVar == null) {
            this.e.add(new e3d() { // from class: a3d
                @Override // defpackage.e3d
                public final void run() {
                    this.a.r(f);
                }
            });
        } else {
            this.b.k(l1e.d(p2dVar.j, p2dVar.k, f));
        }
    }

    public final boolean s() {
        p2d p2dVar = this.a;
        if (p2dVar == null) {
            return false;
        }
        float f = this.D;
        float fB = this.b.b();
        this.D = fB;
        return Math.abs(fB - f) * p2dVar.b() >= 50.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.m = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        izc.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.E;
            if (i == 2) {
                k();
                return visible;
            }
            if (i == 3) {
                n();
                return visible;
            }
        } else {
            if (this.b.m) {
                j();
                this.E = 3;
                return visible;
            }
            if (zIsVisible) {
                this.E = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        k();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.e.clear();
        p3d p3dVar = this.b;
        p3dVar.j(true);
        p3dVar.g(p3dVar.f());
        if (isVisible()) {
            return;
        }
        this.E = 1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}

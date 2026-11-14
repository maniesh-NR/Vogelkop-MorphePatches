package defpackage;

import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class hi7 {
    public static final long q;
    public static final long r;
    public static final long s;
    public static final long t;
    public static final /* synthetic */ int u = 0;
    public final yh7 a;
    public final zh7 b;
    public final CoordinatorLayout c;
    public final ViewGroup d;
    public final igi e;
    public final qim f;
    public final kze g;
    public final Point h;
    public final ni7 i;
    public final float j;
    public final j22 k;
    public final ks6 l;
    public Point m;
    public Point n;
    public boolean o;
    public final di7 p;

    static {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.d;
        q = cs5.x0(200, un7Var);
        r = cs5.x0(200, un7Var);
        s = cs5.x0(200, un7Var);
        t = cs5.x0(150, un7Var);
    }

    public hi7(yh7 yh7Var, zh7 zh7Var, CoordinatorLayout coordinatorLayout, ViewGroup viewGroup, igi igiVar, qim qimVar, kze kzeVar, Point point) {
        this.a = yh7Var;
        this.b = zh7Var;
        this.c = coordinatorLayout;
        this.d = viewGroup;
        this.e = igiVar;
        this.f = qimVar;
        this.g = kzeVar;
        this.h = point;
        View view = (View) igiVar.e;
        ni7 ni7Var = new ni7(view);
        this.i = ni7Var;
        this.j = ((View) igiVar.f).getTranslationY();
        final byte b = 1;
        j22 j22Var = new j22(this, b);
        this.k = j22Var;
        final byte b2 = 2;
        ks6 ks6Var = new ks6(this, b2);
        this.l = ks6Var;
        this.n = point;
        di7 di7Var = new di7(viewGroup.getContext());
        this.p = di7Var;
        ((FrameLayout) igiVar.c).addOnLayoutChangeListener(new z22(this, (byte) 6));
        ni7Var.j = fan.a(16.0f, view.getResources());
        final byte b3 = 0;
        ni7Var.i = new Function0(this) { // from class: bi7
            public final /* synthetic */ hi7 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                float width;
                float left;
                int width2;
                byte b4 = b3;
                hi7 hi7Var = this.b;
                switch (b4) {
                    case 0:
                        width = (((View) hi7Var.e.f).getWidth() / 2.0f) * 2.5f;
                        break;
                    case 1:
                        igi igiVar2 = hi7Var.e;
                        left = ((View) igiVar2.f).getLeft();
                        width2 = ((View) igiVar2.f).getWidth();
                        width = (width2 / 2.0f) + left;
                        break;
                    default:
                        igi igiVar3 = hi7Var.e;
                        left = ((View) igiVar3.f).getTop();
                        width2 = ((View) igiVar3.f).getWidth();
                        width = (width2 / 2.0f) + left;
                        break;
                }
                return Float.valueOf(width);
            }
        };
        ni7Var.g = new Function0(this) { // from class: bi7
            public final /* synthetic */ hi7 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                float width;
                float left;
                int width2;
                byte b4 = b;
                hi7 hi7Var = this.b;
                switch (b4) {
                    case 0:
                        width = (((View) hi7Var.e.f).getWidth() / 2.0f) * 2.5f;
                        break;
                    case 1:
                        igi igiVar2 = hi7Var.e;
                        left = ((View) igiVar2.f).getLeft();
                        width2 = ((View) igiVar2.f).getWidth();
                        width = (width2 / 2.0f) + left;
                        break;
                    default:
                        igi igiVar3 = hi7Var.e;
                        left = ((View) igiVar3.f).getTop();
                        width2 = ((View) igiVar3.f).getWidth();
                        width = (width2 / 2.0f) + left;
                        break;
                }
                return Float.valueOf(width);
            }
        };
        ni7Var.h = new Function0(this) { // from class: bi7
            public final /* synthetic */ hi7 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                float width;
                float left;
                int width2;
                byte b4 = b2;
                hi7 hi7Var = this.b;
                switch (b4) {
                    case 0:
                        width = (((View) hi7Var.e.f).getWidth() / 2.0f) * 2.5f;
                        break;
                    case 1:
                        igi igiVar2 = hi7Var.e;
                        left = ((View) igiVar2.f).getLeft();
                        width2 = ((View) igiVar2.f).getWidth();
                        width = (width2 / 2.0f) + left;
                        break;
                    default:
                        igi igiVar3 = hi7Var.e;
                        left = ((View) igiVar3.f).getTop();
                        width2 = ((View) igiVar3.f).getWidth();
                        width = (width2 / 2.0f) + left;
                        break;
                }
                return Float.valueOf(width);
            }
        };
        int i = 0;
        int i2 = 0;
        Class<hi7> cls = hi7.class;
        ni7Var.b = new q2(i2, this, cls, "handlePositionChanged", "handlePositionChanged()V", i, (byte) 25);
        ni7Var.c = new q2(i2, this, cls, "handleDraggingStarted", "handleDraggingStarted()V", i, (byte) 26);
        ni7Var.e = new r2(1, this, hi7.class, "handleDropZoneProgress", "handleDropZoneProgress(F)V", 0, (byte) 29);
        ni7Var.d = new ci7(1, this, cls, "handleDrop", "handleDrop(Z)V", i, (byte) 0);
        ni7Var.f = new q2(0, this, cls, "handleFinishedMovementIdle", "handleFinishedMovementIdle()V", i, (byte) 27);
        qimVar.r.b(j22Var);
        kzeVar.k(ks6Var);
        ViewGroup.LayoutParams qv5Var = new qv5(0, 0);
        qv5Var.b(new gi7(this));
        coordinatorLayout.addView(di7Var, qv5Var);
        zh7Var.a(yh7Var, true);
    }

    public final void a(ei7 ei7Var) {
        if (this.o) {
            return;
        }
        this.o = true;
        if (((FrameLayout) this.e.b).getParent() == null) {
            return;
        }
        this.c.removeView(this.p);
        this.f.r.c(this.k);
        this.g.p(this.l);
        c(ei7Var);
        this.b.a(this.a, false);
    }

    public final void b() {
        View view = (View) this.e.e;
        if (this.i.k) {
            return;
        }
        Point point = this.m;
        if (point == null) {
            point = new Point(view.getLeft(), view.getTop());
        }
        this.n = point;
        g(point);
    }

    public abstract void c(ei7 ei7Var);

    public void d() {
    }

    public void e() {
        a(ei7.b);
    }

    public void f() {
    }

    public void g(Point point) {
        gg2.G = point;
    }
}

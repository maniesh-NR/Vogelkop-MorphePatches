package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final class i21 implements View.OnTouchListener {
    public final Rect a;
    public f1p b;
    public final j39 c;
    public final Handler d;
    public final View e;
    public final h21 f;
    public final a36 g;
    public final eq1 h;
    public final q8n i;
    public final Supplier j;
    public final ig k;
    public final h7f l;
    public final f21 m;
    public View n;
    public int o;
    public final int p;
    public final boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final boolean u;
    public boolean v;
    public int w;
    public final boolean x;
    public final boolean y;
    public v1o z;

    public i21(e21 e21Var) {
        Context context = e21Var.a;
        View view = e21Var.b;
        Drawable drawable = e21Var.e;
        Supplier supplier = e21Var.c;
        q8n q8nVar = e21Var.d;
        this.a = new Rect();
        this.k = new ig(this, (byte) 2);
        c21 c21Var = new c21(this, (byte) 0);
        h7f h7fVar = new h7f();
        this.l = h7fVar;
        this.q = false;
        j39 j39Var = new j39(context, 2132084390);
        this.c = j39Var;
        View rootView = view.getRootView();
        this.e = rootView;
        this.j = supplier;
        this.f = new h21(rootView);
        this.g = new a36();
        if (urj.c == null) {
            urj.c = new urj((byte) 6);
        }
        eq1 eq1Var = new eq1(j39Var);
        this.h = eq1Var;
        this.d = new Handler();
        this.i = q8nVar;
        this.b = new f1p(new Rect(), new g21(0, false, false, false, false), false);
        eq1Var.setWidth(-2);
        eq1Var.setHeight(-2);
        eq1Var.setBackgroundDrawable(drawable);
        eq1Var.setTouchInterceptor(this);
        eq1Var.setOnDismissListener(c21Var);
        PopupWindow.OnDismissListener onDismissListener = e21Var.f;
        if (onDismissListener != null) {
            h7fVar.b(onDismissListener);
        }
        this.m = e21Var.g;
        this.q = e21Var.h;
        eq1Var.setOutsideTouchable(false);
        this.y = false;
        this.s = false;
        this.t = false;
        this.u = e21Var.i;
        this.x = false;
        eq1Var.setFocusable(false);
        if (eq1Var.isShowing()) {
            eq1Var.update();
        }
        eq1Var.setElevation(e21Var.j);
        eq1Var.setTouchModal(false);
        if (e21Var.l) {
            eq1Var.setOutsideTouchable(e21Var.k);
        }
    }

    public final void a() {
        View.OnLayoutChangeListener onLayoutChangeListener = this.z;
        if (onLayoutChangeListener != null) {
            ((v1o) onLayoutChangeListener).a.removeOnLayoutChangeListener(onLayoutChangeListener);
            this.z = null;
        }
        this.h.dismiss();
    }

    public final int b() throws Resources.NotFoundException {
        j39 j39Var = this.c;
        float f = j39Var.getResources().getDisplayMetrics().density;
        int iU = na2.u(2130970364, j39Var);
        if (iU == -1) {
            iU = j39Var.getResources().getDimensionPixelSize(2131166701);
        }
        return iU + (((int) Math.ceil(f)) << 1);
    }

    public final boolean c() throws Resources.NotFoundException {
        int iB = b();
        return ((Rect) this.b.b).height() >= iB && ((Rect) this.b.b).width() >= iB;
    }

    public final void d() {
        if (this.h.isShowing()) {
            return;
        }
        if (this.y) {
            this.z = new v1o(this.e, new c4(this, (byte) 18));
        }
        this.i.n0(this);
        this.f.n0(this);
        f();
        if (c()) {
            e();
        }
    }

    public final void e() {
        boolean z = this.x;
        eq1 eq1Var = this.h;
        if (z && this.w == 0) {
            g21 g21Var = (g21) this.b.a;
            boolean z2 = g21Var.b;
            eq1Var.setAnimationStyle(g21Var.a ? z2 ? 2132082727 : 2132082726 : z2 ? 2132082729 : 2132082728);
        }
        View view = this.n;
        if (view == null) {
            view = (View) this.j.get();
            this.n = view;
        }
        eq1Var.setContentView(view);
        Rect rect = (Rect) this.b.b;
        int i = rect.left;
        int i2 = rect.top;
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (layoutParams instanceof WindowManager.LayoutParams) {
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
            i += layoutParams2.x;
            i2 += layoutParams2.y;
        }
        Point point = new Point(i, i2);
        try {
            eq1Var.showAtLocation(new d21((Object) this, (Context) this.c, (byte) 0), 8388659, point.x, point.y);
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5 A[PHI: r8
      0x00d5: PHI (r8v32 boolean) = (r8v31 boolean), (r8v31 boolean), (r8v33 boolean), (r8v33 boolean) binds: [B:41:0x00c6, B:42:0x00c8, B:46:0x00cf, B:47:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0128 A[PHI: r15
      0x0128: PHI (r15v6 boolean) = (r15v5 boolean), (r15v5 boolean), (r15v10 boolean), (r15v10 boolean) binds: [B:74:0x0118, B:75:0x011a, B:79:0x0121, B:80:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i21.f():void");
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        joh.q(motionEvent.getAction() == 4 ? "InProductHelp.OutsideTouch" : "InProductHelp.InsideTouch");
        return false;
    }
}

package defpackage;

import android.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class g87 extends ce5 {
    public Function0 e;
    public y77 f;
    public final View g;
    public final v77 h;
    public boolean i;

    public g87(Function0 function0, y77 y77Var, View view, d2c d2cVar, n27 n27Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), y77Var.e ? 2132083135 : 2132083220), 0);
        this.e = function0;
        this.f = y77Var;
        this.g = view;
        Window window = getWindow();
        if (window == null) {
            qp2.n("Dialog has no window");
            throw null;
        }
        y77 y77Var2 = this.f;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = y77Var2.g;
            window2.setAttributes(attributes);
        }
        byte b = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        ocp.p(window, this.f.e);
        window.setGravity(17);
        if (!this.f.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            eg1.a.a(attributes2);
            if (Build.VERSION.SDK_INT >= 30) {
                fg1 fg1Var = fg1.a;
                fg1Var.b(attributes2, 0);
                fg1Var.c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        v77 v77Var = new v77(getContext(), window);
        setTitle(this.f.f);
        v77Var.setTag(2131362390, "Dialog:" + uuid);
        v77Var.setClipChildren(false);
        v77Var.setElevation(n27Var.o0(8.0f));
        v77Var.setOutlineProvider(new zq3((byte) 2));
        this.h = v77Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(v77Var);
        v77Var.setTag(2131365017, z7h.j(view));
        v77Var.setTag(2131365021, w8h.k(view));
        v77Var.setTag(2131365020, b8h.e(view));
        e(this.e, this.f, d2cVar);
        getOnBackPressedDispatcher().a(this, new xt2(new h51(this, b), (byte) 8));
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof v77) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void e(Function0 function0, y77 y77Var, d2c d2cVar) {
        int i;
        this.e = function0;
        this.f = y77Var;
        cwi cwiVar = y77Var.c;
        boolean zC = w91.c(this.g);
        int iOrdinal = cwiVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zC = true;
            } else {
                if (iOrdinal != 2) {
                    h9o.p();
                    return;
                }
                zC = false;
            }
        }
        getWindow().setFlags(zC ? 8192 : -8193, 8192);
        int iOrdinal2 = d2cVar.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                h9o.p();
                return;
            }
            i = 1;
        }
        v77 v77Var = this.h;
        v77Var.setLayoutDirection(i);
        boolean z = y77Var.e;
        boolean z2 = y77Var.d;
        Window window = v77Var.h;
        boolean z3 = (v77Var.l && z2 == v77Var.j && z == v77Var.k) ? false : true;
        v77Var.j = z2;
        v77Var.k = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !v77Var.l) {
                window.setLayout(i2, -2);
                v77Var.l = true;
            }
        }
        setCanceledOnTouchOutside(y77Var.b);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.e.invoke();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            y77 r1 = r9.f
            boolean r1 = r1.b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L83
            v77 r1 = r9.h
            r1.getClass()
            float r5 = r10.getX()
            float r5 = java.lang.Math.abs(r5)
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L67
            float r5 = r10.getY()
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L67
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 == 0) goto L67
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = zed.b(r5)
            if (r7 > r5) goto L67
            if (r5 > r6) goto L67
            float r5 = r10.getY()
            int r5 = zed.b(r5)
            if (r8 > r5) goto L67
            if (r5 <= r1) goto L83
        L67:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L80
            if (r10 == r4) goto L74
            if (r10 != r2) goto L8d
            r9.i = r3
            return r0
        L74:
            boolean r10 = r9.i
            if (r10 == 0) goto L8d
            kotlin.jvm.functions.Function0 r10 = r9.e
            r10.invoke()
            r9.i = r3
            return r4
        L80:
            r9.i = r4
            return r4
        L83:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L8e
            if (r10 == r4) goto L8e
            if (r10 == r2) goto L8e
        L8d:
            return r0
        L8e:
            r9.i = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g87.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

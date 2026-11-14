package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.snackbar.Snackbar;

/* loaded from: classes.dex */
public final class gtj {
    public final asj a;
    public final View b;
    public boolean c;
    public fsj d;
    public boolean e;
    public boolean f;

    public gtj(asj asjVar, View view, View view2) {
        this.a = asjVar;
        this.b = view;
        k();
        asjVar.f(view2);
        if (view2 == null && this.d == null) {
            this.d = new fsj(asjVar, view);
        }
        asjVar.a(new pt(this, (byte) 2));
    }

    public static gtj c(View view, int i, int i2) {
        return d(view, new rxh(i), i2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:3:0x000f->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.gtj d(android.view.View r9, defpackage.pxh r10, int r11, android.view.View r12) {
        /*
            gtj r0 = new gtj
            android.content.res.Resources r1 = r9.getResources()
            java.lang.CharSequence r10 = r10.a(r1)
            int[] r1 = defpackage.asj.E
            r1 = 0
            r2 = r9
            r3 = r1
        Lf:
            boolean r4 = r2 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r4 == 0) goto L16
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L38
        L16:
            boolean r4 = r2 instanceof android.widget.FrameLayout
            if (r4 == 0) goto L29
            int r3 = r2.getId()
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            if (r3 != r4) goto L26
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L38
        L26:
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L29:
            android.view.ViewParent r2 = r2.getParent()
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L34
            android.view.View r2 = (android.view.View) r2
            goto L35
        L34:
            r2 = r1
        L35:
            if (r2 != 0) goto Lf
            r2 = r3
        L38:
            if (r2 == 0) goto L7f
            android.content.Context r1 = r2.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r1)
            int[] r4 = defpackage.asj.E
            android.content.res.TypedArray r4 = r1.obtainStyledAttributes(r4)
            r5 = 0
            r6 = -1
            int r7 = r4.getResourceId(r5, r6)
            r8 = 1
            int r8 = r4.getResourceId(r8, r6)
            r4.recycle()
            if (r7 == r6) goto L5e
            if (r8 == r6) goto L5e
            r4 = 2131559105(0x7f0d02c1, float:1.8743545E38)
            goto L61
        L5e:
            r4 = 2131558650(0x7f0d00fa, float:1.8742622E38)
        L61:
            android.view.View r3 = r3.inflate(r4, r2, r5)
            com.google.android.material.snackbar.SnackbarContentLayout r3 = (com.google.android.material.snackbar.SnackbarContentLayout) r3
            asj r4 = new asj
            r4.<init>(r1, r2, r3, r3)
            com.google.android.material.snackbar.Snackbar$SnackbarLayout r1 = r4.i
            android.view.View r1 = r1.getChildAt(r5)
            com.google.android.material.snackbar.SnackbarContentLayout r1 = (com.google.android.material.snackbar.SnackbarContentLayout) r1
            android.widget.TextView r1 = r1.a
            r1.setText(r10)
            r4.k = r11
            r0.<init>(r4, r9, r12)
            return r0
        L7f:
            java.lang.String r9 = "No suitable parent found from the given view. Please provide a valid view."
            defpackage.qp2.o(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gtj.d(android.view.View, pxh, int, android.view.View):gtj");
    }

    public static gtj e(View view, CharSequence charSequence, int i) {
        return d(view, new qxh(charSequence), i, null);
    }

    public final void a() {
        if (this.e) {
            this.e = false;
            boolean z = this.f;
            asj asjVar = this.a;
            if (!z) {
                Snackbar.SnackbarLayout snackbarLayout = ((na3) asjVar).i;
                tji tjiVar = new tji((Object) this, (byte) 25);
                if (snackbarLayout.isAttachedToWindow()) {
                    tjiVar.invoke(snackbarLayout);
                } else {
                    snackbarLayout.addOnAttachStateChangeListener(new i7n(snackbarLayout, tjiVar));
                }
            }
            asjVar.b(3);
        }
    }

    public final void b(View view) {
        Snackbar.SnackbarLayout snackbarLayout = ((na3) this.a).i;
        snackbarLayout.setZ(snackbarLayout.getZ() + view.getZ());
    }

    public final void f(int i, View.OnClickListener onClickListener) {
        asj asjVar = this.a;
        asjVar.i(((na3) asjVar).h.getText(i), onClickListener);
        boolean z = onClickListener != null;
        if (this.c == z) {
            return;
        }
        this.c = z;
        k();
    }

    public final void g(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.a.i(charSequence, onClickListener);
        boolean z = onClickListener != null;
        if (this.c == z) {
            return;
        }
        this.c = z;
        k();
    }

    public final void h(int i) {
        CircularProgressIndicator circularProgressIndicatorFindViewById = ((na3) this.a).i.findViewById(2131364494);
        if (circularProgressIndicatorFindViewById instanceof CircularProgressIndicator) {
            CircularProgressIndicator circularProgressIndicator = circularProgressIndicatorFindViewById;
            if (circularProgressIndicator.isIndeterminate()) {
                circularProgressIndicator.setIndeterminate(false);
            }
            circularProgressIndicator.g(i, true);
        }
    }

    public final void i() {
        ProgressBar progressBar = (ProgressBar) ((na3) this.a).i.findViewById(2131364494);
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    public final void j() {
        if (this.e) {
            return;
        }
        this.e = true;
        asj asjVar = this.a;
        i3j i3jVarX = i3j.x();
        int i = ((na3) asjVar).k;
        boolean z = false;
        int recommendedTimeoutMillis = -2;
        if (i != -2) {
            recommendedTimeoutMillis = asjVar.C.getRecommendedTimeoutMillis(i, (asjVar.D ? 4 : 0) | 3);
        }
        ka3 ka3Var = ((na3) asjVar).w;
        synchronized (i3jVarX.a) {
            if (i3jVarX.E(ka3Var)) {
                xsj xsjVar = (xsj) i3jVarX.c;
                xsjVar.b = recommendedTimeoutMillis;
                ((Handler) i3jVarX.b).removeCallbacksAndMessages(xsjVar);
                i3jVarX.K((xsj) i3jVarX.c);
            } else {
                xsj xsjVar2 = (xsj) i3jVarX.d;
                if (xsjVar2 != null && xsjVar2.a.get() == ka3Var) {
                    z = true;
                }
                if (z) {
                    ((xsj) i3jVarX.d).b = recommendedTimeoutMillis;
                } else {
                    i3jVarX.d = new xsj(recommendedTimeoutMillis, ka3Var);
                }
                xsj xsjVar3 = (xsj) i3jVarX.c;
                if (xsjVar3 == null || !i3jVarX.l(xsjVar3, 4)) {
                    i3jVarX.c = null;
                    i3jVarX.M();
                }
            }
        }
        vml.c(new etj(this, (byte) 1));
    }

    public final void k() {
        int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(this.c ? 2131167530 : 2131167529);
        Snackbar.SnackbarLayout snackbarLayout = ((na3) this.a).i;
        ViewGroup.LayoutParams layoutParams = snackbarLayout.getLayoutParams();
        layoutParams.width = dimensionPixelSize > 0 ? -2 : -1;
        snackbarLayout.setLayoutParams(layoutParams);
        snackbarLayout.setMinimumWidth(dimensionPixelSize);
    }
}

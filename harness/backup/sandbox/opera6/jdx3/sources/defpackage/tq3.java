package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class tq3 extends zp1 {
    public BottomSheetBehavior g;
    public FrameLayout h;
    public CoordinatorLayout i;
    public FrameLayout j;
    public boolean k;
    public boolean l;
    public boolean m;
    public sq3 n;
    public final boolean o;
    public g77 p;
    public final rq3 q;

    /* JADX WARN: Multi-variable type inference failed */
    public tq3(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(2130968816, typedValue, true) ? typedValue.resourceId : 2132083961;
        }
        super(context, i);
        this.k = true;
        this.l = true;
        this.q = new rq3(this);
        d().g(1);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{2130969615});
        this.o = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void cancel() {
        if (this.g == null) {
            f();
        }
        super/*android.app.Dialog*/.cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        if (this.h == null) {
            cdd addVar = null;
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), 2131558648, null);
            this.h = frameLayout;
            frameLayout.findViewById(2131363972);
            this.i = this.h.findViewById(2131362449);
            FrameLayout frameLayout2 = (FrameLayout) this.h.findViewById(2131362514);
            this.j = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorD = BottomSheetBehavior.D(frameLayout2);
            this.g = bottomSheetBehaviorD;
            ArrayList arrayList = bottomSheetBehaviorD.a0;
            rq3 rq3Var = this.q;
            if (!arrayList.contains(rq3Var)) {
                arrayList.add(rq3Var);
            }
            this.g.K(this.k);
            BottomSheetBehavior bottomSheetBehavior = this.g;
            FrameLayout frameLayout3 = this.j;
            g77 g77Var = new g77();
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                addVar = new cdd();
            } else if (i >= 33) {
                addVar = new add();
            }
            g77Var.a = addVar;
            g77Var.b = bottomSheetBehavior;
            g77Var.c = frameLayout3;
            this.p = g77Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FrameLayout g(View view, int i, ViewGroup.LayoutParams layoutParams) {
        f();
        CoordinatorLayout coordinatorLayoutFindViewById = this.h.findViewById(2131362449);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayoutFindViewById, false);
        }
        if (this.o) {
            FrameLayout frameLayout = this.h;
            u59 u59Var = new u59(this, (byte) 18);
            WeakHashMap weakHashMap = r5n.a;
            h5n.c(frameLayout, u59Var);
        }
        this.j.removeAllViews();
        FrameLayout frameLayout2 = this.j;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayoutFindViewById.findViewById(2131364823).setOnClickListener(new ic(this, (byte) 3));
        r5n.l(this.j, new ja3(this, (byte) 1));
        this.j.setOnTouchListener(new ma3((byte) 1));
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r6 = this;
            super/*android.app.Dialog*/.onAttachedToWindow()
            android.view.Window r0 = r6.getWindow()
            r1 = 0
            if (r0 == 0) goto L43
            boolean r2 = r6.o
            r3 = 1
            if (r2 == 0) goto L25
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 35
            if (r2 >= r4) goto L1a
            int r2 = r0.getNavigationBarColor()
            goto L1b
        L1a:
            r2 = r1
        L1b:
            int r2 = android.graphics.Color.alpha(r2)
            r4 = 255(0xff, float:3.57E-43)
            if (r2 >= r4) goto L25
            r2 = r3
            goto L26
        L25:
            r2 = r1
        L26:
            android.widget.FrameLayout r4 = r6.h
            if (r4 == 0) goto L2f
            r5 = r2 ^ 1
            r4.setFitsSystemWindows(r5)
        L2f:
            androidx.coordinatorlayout.widget.CoordinatorLayout r4 = r6.i
            if (r4 == 0) goto L38
            r5 = r2 ^ 1
            r4.setFitsSystemWindows(r5)
        L38:
            r2 = r2 ^ r3
            ocp.p(r0, r2)
            sq3 r2 = r6.n
            if (r2 == 0) goto L43
            r2.e(r0)
        L43:
            g77 r0 = r6.p
            if (r0 == 0) goto L62
            java.lang.Object r2 = r0.c
            android.view.View r2 = (android.view.View) r2
            boolean r6 = r6.k
            java.lang.Object r3 = r0.a
            add r3 = (add) r3
            if (r6 == 0) goto L5d
            if (r3 == 0) goto L62
            java.lang.Object r6 = r0.b
            zcd r6 = (zcd) r6
            r3.b(r6, r2, r1)
            return
        L5d:
            if (r3 == 0) goto L62
            r3.c(r2)
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq3.onAttachedToWindow():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT < 35) {
                window.setStatusBarColor(0);
            }
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public void onDetachedFromWindow() {
        add addVar;
        sq3 sq3Var = this.n;
        if (sq3Var != null) {
            sq3Var.e(null);
        }
        g77 g77Var = this.p;
        if (g77Var == null || (addVar = (add) g77Var.a) == null) {
            return;
        }
        addVar.c((View) g77Var.c);
    }

    public void onStart() {
        super/*ce5*/.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.g;
        if (bottomSheetBehavior == null || bottomSheetBehavior.P != 5) {
            return;
        }
        bottomSheetBehavior.M(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCancelable(boolean z) {
        g77 g77Var;
        super/*android.app.Dialog*/.setCancelable(z);
        if (this.k != z) {
            this.k = z;
            BottomSheetBehavior bottomSheetBehavior = this.g;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.K(z);
            }
            if (getWindow() == null || (g77Var = this.p) == null) {
                return;
            }
            View view = (View) g77Var.c;
            boolean z2 = this.k;
            add addVar = (add) g77Var.a;
            if (z2) {
                if (addVar != null) {
                    addVar.b((zcd) g77Var.b, view, false);
                }
            } else if (addVar != null) {
                addVar.c(view);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCanceledOnTouchOutside(boolean z) {
        super/*android.app.Dialog*/.setCanceledOnTouchOutside(z);
        if (z && !this.k) {
            this.k = true;
        }
        this.l = z;
        this.m = true;
    }

    public void setContentView(int i) {
        super.setContentView(g(null, i, null));
    }

    public void setContentView(View view) {
        super.setContentView(g(view, 0, null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(g(view, 0, layoutParams));
    }
}

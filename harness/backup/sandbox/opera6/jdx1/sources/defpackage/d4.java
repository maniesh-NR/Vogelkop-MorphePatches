package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class d4 extends ViewGroup {
    public WeakReference a;
    public IBinder b;
    public w7o c;
    public tt9 d;
    public Function0 e;
    public boolean f;
    public boolean g;

    public d4(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        s5n s5nVar = new s5n(this, (byte) 1);
        addOnAttachStateChangeListener(s5nVar);
        t5n t5nVar = new t5n(this);
        z5i.J(this).a.add(t5nVar);
        this.e = new uef(this, s5nVar, t5nVar, (byte) 8);
    }

    public abstract void a(ih5 ih5Var, int i);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            IBinder windowToken = getWindowToken();
            v31 v31Var = null;
            if (this.b != windowToken) {
                this.b = windowToken;
                this.a = null;
            }
            if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                if (childAt instanceof v31) {
                    v31Var = (v31) childAt;
                }
            }
            if (v31Var != null) {
                v31Var.Q(n(y9m.I(this), v31Var.o()));
            }
            if (g()) {
                f();
            }
        }
    }

    public final void c() {
        if (this.f) {
            return;
        }
        yt7.k(sko.k("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
    }

    public final void d() {
        if (this.d != null || isAttachedToWindow()) {
            f();
        } else {
            qp2.n("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void e() {
        getChildAt(0);
        w7o w7oVar = this.c;
        if (w7oVar != null) {
            w7oVar.a();
        }
        this.c = null;
        requestLayout();
    }

    public final void f() {
        if (this.c == null) {
            try {
                this.f = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    this.c = z7o.a(this, j(), new ue5(1003123809, new whf(this, (byte) 2), true));
                } finally {
                    Trace.endSection();
                }
            } finally {
                this.f = false;
            }
        }
    }

    public abstract boolean g();

    public void h(int i, int i2, int i3, int i4, boolean z) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void i(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.g || super.isTransitionGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fh5 j() {
        /*
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = 0
            android.view.View r0 = r9.getChildAt(r0)
            boolean r2 = r0 instanceof defpackage.v31
            if (r2 == 0) goto L13
            v31 r0 = (defpackage.v31) r0
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L1b
            fh5 r0 = r0.o()
            goto L1c
        L1b:
            r0 = r1
        L1c:
            android.view.View r4 = defpackage.y9m.I(r9)
            fh5 r2 = defpackage.y9m.L(r4)
            if (r2 != 0) goto L83
            zh5 r5 = r9.k()
            ndc r9 = defpackage.z7h.j(r4)
            if (r9 != 0) goto L41
            if (r0 == 0) goto L38
            r0.e()
            ndc r9 = r0.d
            goto L39
        L38:
            r9 = r1
        L39:
            if (r9 != 0) goto L41
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            qp2.n(r9)
            return r1
        L41:
            r6 = r9
            rki r9 = b8h.e(r4)
            if (r9 != 0) goto L59
            if (r0 == 0) goto L50
            r0.e()
            rki r9 = r0.e
            goto L51
        L50:
            r9 = r1
        L51:
            if (r9 != 0) goto L59
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!"
            qp2.n(r9)
            return r1
        L59:
            r7 = r9
            w7n r9 = w8h.k(r4)
            if (r9 != 0) goto L69
            if (r0 == 0) goto L67
            r0.e()
            w7n r1 = r0.f
        L67:
            r8 = r1
            goto L6a
        L69:
            r8 = r9
        L6a:
            fh5 r2 = new fh5
            android.view.View r9 = defpackage.y9m.I(r4)
            fh5 r3 = defpackage.y9m.L(r9)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r2)
            r0 = 2131362029(0x7f0a00ed, float:1.8343827E38)
            r4.setTag(r0, r9)
            return r2
        L83:
            fh5 r9 = r9.n(r4, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4.j():fh5");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Type inference failed for: r0v0, types: [tt9] */
    /* JADX WARN: Type inference failed for: r0v1, types: [zh5] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [zh5] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [hoh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.zh5 k() {
        /*
            r4 = this;
            tt9 r0 = r4.d
            if (r0 != 0) goto L8d
            zh5 r0 = defpackage.z3o.a(r4)
            if (r0 != 0) goto L1f
            android.view.ViewParent r1 = r4.getParent()
        Le:
            if (r0 != 0) goto L1f
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L1f
            android.view.View r1 = (android.view.View) r1
            zh5 r0 = defpackage.z3o.a(r1)
            android.view.ViewParent r1 = defpackage.y7h.h(r1)
            goto Le
        L1f:
            r1 = 0
            if (r0 == 0) goto L46
            boolean r2 = r0 instanceof defpackage.hoh
            if (r2 == 0) goto L3b
            r2 = r0
            hoh r2 = (defpackage.hoh) r2
            nak r2 = r2.u
            java.lang.Object r2 = r2.getValue()
            eoh r2 = (defpackage.eoh) r2
            eoh r3 = defpackage.eoh.b
            int r2 = r2.compareTo(r3)
            if (r2 > 0) goto L3b
            r2 = r1
            goto L3c
        L3b:
            r2 = r0
        L3c:
            if (r2 == 0) goto L47
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r4.a = r3
            goto L47
        L46:
            r0 = r1
        L47:
            if (r0 != 0) goto L8d
            java.lang.ref.WeakReference r0 = r4.a
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r0.get()
            zh5 r0 = (defpackage.zh5) r0
            if (r0 == 0) goto L6c
            boolean r2 = r0 instanceof defpackage.hoh
            if (r2 == 0) goto L6d
            r2 = r0
            hoh r2 = (defpackage.hoh) r2
            nak r2 = r2.u
            java.lang.Object r2 = r2.getValue()
            eoh r2 = (defpackage.eoh) r2
            eoh r3 = defpackage.eoh.b
            int r2 = r2.compareTo(r3)
            if (r2 > 0) goto L6d
        L6c:
            r0 = r1
        L6d:
            if (r0 != 0) goto L8d
            hoh r0 = defpackage.z3o.b(r4)
            nak r2 = r0.u
            java.lang.Object r2 = r2.getValue()
            eoh r2 = (defpackage.eoh) r2
            eoh r3 = defpackage.eoh.b
            int r2 = r2.compareTo(r3)
            if (r2 <= 0) goto L84
            r1 = r0
        L84:
            if (r1 == 0) goto L8d
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r4.a = r2
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4.k():zh5");
    }

    public final void l(tt9 tt9Var) {
        if (this.d != tt9Var) {
            this.d = tt9Var;
            if (tt9Var != null) {
                this.a = null;
            }
            w7o w7oVar = this.c;
            if (w7oVar != null) {
                w7oVar.a();
                this.c = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    public final void m() throws pxb {
        eek gmhVar;
        Function0 function0 = this.e;
        if (function0 != null) {
            function0.invoke();
        }
        if (isAttachedToWindow()) {
            ndc ndcVarJ = z7h.j(this);
            if (ndcVarJ == null) {
                a8b.c("View tree for " + this + " has no ViewTreeLifecycleOwner");
                t3p.v();
                return;
            }
            gmhVar = fac.w(this, ndcVarJ.getLifecycle());
        } else {
            pqh pqhVar = new pqh();
            tu4 tu4Var = new tu4(this, pqhVar, (byte) 6);
            addOnAttachStateChangeListener(tu4Var);
            pqhVar.a = new eek(this, tu4Var, (byte) 22);
            gmhVar = new gmh(pqhVar, (byte) 1);
        }
        this.e = gmhVar;
    }

    public final fh5 n(View view, fh5 fh5Var) {
        zh5 zh5VarK = k();
        ndc ndcVarJ = z7h.j(view);
        w7n w7nVarK = w8h.k(view);
        rki rkiVarE = b8h.e(view);
        fh5Var.e();
        if (zh5VarK == fh5Var.c) {
            fh5Var.e();
            if (ndcVarJ == fh5Var.d) {
                fh5Var.e();
                if (w7nVarK == fh5Var.f) {
                    fh5Var.e();
                    if (rkiVarE == fh5Var.e) {
                        return fh5Var;
                    }
                }
            }
        }
        CoroutineContext coroutineContextJ = zh5VarK.j();
        fh5Var.e();
        if (coroutineContextJ != fh5Var.c.j()) {
            e();
        }
        if (ndcVarJ == null) {
            fh5Var.e();
            ndcVarJ = fh5Var.d;
        }
        ndc ndcVar = ndcVarJ;
        if (rkiVarE == null) {
            fh5Var.e();
            rkiVarE = fh5Var.e;
        }
        fh5 fh5Var2 = new fh5(fh5Var, view, zh5VarK, ndcVar, rkiVarE, w7nVarK);
        view.setTag(2131362029, new WeakReference(fh5Var2));
        return fh5Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        see seeVar = z3o.a;
        Object objH = y7h.h(this);
        View view = this;
        while (objH instanceof View) {
            View view2 = (View) objH;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objH = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new c4(this, (byte) 0));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        h(i, i2, i3, i4, z);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        i(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    @Override // android.view.ViewGroup
    public final void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.g = true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

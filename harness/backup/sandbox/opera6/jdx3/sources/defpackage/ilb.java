package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ilb extends clb {
    public static final long m;
    public static final long n;
    public jlb d;
    public i e;
    public byte f;
    public final pde g;
    public final j1k h;
    public final xh7 i = new xh7();
    public final LinkedHashSet j = new LinkedHashSet();
    public final pde k = new pde(new LinkedHashSet());
    public final pde l = new pde(null);

    static {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.d;
        m = cs5.x0(120, un7Var);
        n = cs5.x0(120, un7Var);
    }

    public ilb(pde pdeVar, j1k j1kVar) {
        this.g = pdeVar;
        this.h = j1kVar;
    }

    public final boolean a(i iVar) {
        return iVar instanceof hlb;
    }

    public final void b(RecyclerView recyclerView, i iVar) {
        super.b(recyclerView, iVar);
        View view = iVar.itemView;
        a26.r(view);
        view.setTranslationZ(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
        LinkedHashSet linkedHashSet = this.j;
        if (linkedHashSet.remove(iVar)) {
            this.k.r(linkedHashSet);
        }
        View view2 = iVar.itemView;
        xh7 xh7Var = this.i;
        ValueAnimator valueAnimator = (ValueAnimator) ((LinkedHashMap) xh7Var.c).get(view2);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = (ValueAnimator) ((LinkedHashMap) xh7Var.d).get(view2);
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ((LinkedHashMap) xh7Var.e).remove(view2);
    }

    public final long e(RecyclerView recyclerView, int i) {
        return i == 8 ? pn7.f(m) : pn7.f(n);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(androidx.recyclerview.widget.RecyclerView r6, androidx.recyclerview.widget.i r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.hlb
            r1 = 0
            if (r0 == 0) goto L4c
            hlb r7 = (defpackage.hlb) r7
            boolean r0 = r7.o()
            if (r0 == 0) goto L34
            androidx.recyclerview.widget.f r0 = r6.n
            if (r0 == 0) goto L2f
            boolean r2 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager
            r3 = 1
            r4 = 3
            if (r2 == 0) goto L20
            androidx.recyclerview.widget.GridLayoutManager r0 = (androidx.recyclerview.widget.GridLayoutManager) r0
            int r0 = r0.b
            if (r0 <= r3) goto L30
            r4 = 15
            goto L30
        L20:
            boolean r2 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r2 == 0) goto L2f
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.getOrientation()
            if (r0 == r3) goto L30
            r4 = 12
            goto L30
        L2f:
            r4 = r1
        L30:
            int r1 = clb.j(r4, r1)
        L34:
            boolean r7 = r7.y()
            if (r7 == 0) goto L4b
            pde r5 = r5.g
            java.lang.Object r5 = r5.g()
            eyj r5 = (defpackage.eyj) r5
            boolean r5 = r5.w
            if (r5 == 0) goto L4b
            int r5 = x7d.m(r6)
            r1 = r1 | r5
        L4b:
            return r1
        L4c:
            int r5 = clb.j(r1, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilb.f(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.i):int");
    }

    public final float g(i iVar) {
        float height;
        int height2;
        RecyclerView parent = iVar.itemView.getParent();
        if (parent instanceof RecyclerView) {
            RecyclerView recyclerView = parent;
            if (recyclerView.getWidth() != 0 && recyclerView.getHeight() != 0) {
                int iM = x7d.m(recyclerView);
                if ((iM & 12) != 0) {
                    height = iVar.itemView.getWidth();
                    height2 = recyclerView.getWidth();
                } else if ((iM & 3) != 0) {
                    height = iVar.itemView.getHeight();
                    height2 = recyclerView.getHeight();
                }
                return (height / height2) * 0.5f;
            }
        }
        return 0.5f;
    }

    public final float h(float f) {
        return Float.MAX_VALUE;
    }

    public final void k(Canvas canvas, RecyclerView recyclerView, i iVar, float f, float f2, int i, boolean z) {
        super.k(canvas, recyclerView, iVar, f, f2, i, z);
        if (((Set) this.k.g()).contains(iVar)) {
            float fB = (f == 0.0f || (x7d.m(recyclerView) & 12) == 0) ? (f2 == 0.0f || (x7d.m(recyclerView) & 3) == 0) ? 0.0f : djh.b(Math.abs(f2) / (g(iVar) * recyclerView.getHeight()), 0.0f, 1.0f) : djh.b(Math.abs(f) / (g(iVar) * recyclerView.getWidth()), 0.0f, 1.0f);
            iVar.itemView.setAlpha(((((eyj) this.g.g()).x - 1.0f) * fB) + 1.0f);
            xh7 xh7Var = this.i;
            LinkedHashMap linkedHashMap = (LinkedHashMap) xh7Var.e;
            View view = iVar.itemView;
            Float f3 = (Float) linkedHashMap.get(view);
            if ((f3 != null ? f3.floatValue() : 0.0f) != fB) {
                linkedHashMap.put(view, Float.valueOf(fB));
                xh7Var.c();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(i iVar, int i) {
        i iVar2 = iVar;
        this.f = i;
        this.e = iVar2;
        if (iVar2 == null) {
            jlb jlbVar = this.d;
            if (jlbVar != null) {
                i iVar3 = jlbVar.d;
                if (iVar3 instanceof jal) {
                    ((jal) iVar3).Y();
                }
                jlbVar.b.M(jlbVar.a);
            }
            o(null);
        }
        if (iVar2 != null && i == 1) {
            LinkedHashSet linkedHashSet = this.j;
            if (linkedHashSet.add(iVar2)) {
                this.k.r(linkedHashSet);
            }
        }
        if (iVar2 == null || i != 2) {
            iVar2 = null;
        }
        xh7 xh7Var = this.i;
        LinkedHashMap linkedHashMap = (LinkedHashMap) xh7Var.d;
        pde pdeVar = this.l;
        hlb hlbVar = (i) pdeVar.g();
        if (Intrinsics.a(iVar2, hlbVar)) {
            return;
        }
        long j = m;
        if (hlbVar != null) {
            View view = ((i) hlbVar).itemView;
            ValueAnimator valueAnimator = (ValueAnimator) linkedHashMap.get(view);
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.addUpdateListener(new vh7(xh7Var, (byte) 1));
            valueAnimatorOfFloat.addListener(new wh7(xh7Var, view, (byte) 0));
            valueAnimatorOfFloat.start();
            linkedHashMap.put(view, valueAnimatorOfFloat);
            View view2 = ((i) hlbVar).itemView;
            a26.g(view2, pn7.f(j), a26.A(view2), new uh7(1.0f, 1.0f, 0.0f), true);
            if (hlbVar instanceof hlb) {
                hlbVar.c();
            }
            this.h.invoke();
        }
        pdeVar.r(iVar2);
        if (iVar2 != null) {
            View view3 = iVar2.itemView;
            ValueAnimator valueAnimator2 = (ValueAnimator) linkedHashMap.get(view3);
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.setDuration(200L);
            valueAnimatorOfFloat2.addUpdateListener(new vh7(xh7Var, (byte) 2));
            valueAnimatorOfFloat2.start();
            linkedHashMap.put(view3, valueAnimatorOfFloat2);
            View view4 = iVar2.itemView;
            long jF = pn7.f(j);
            pde pdeVar2 = this.g;
            a26.g(view4, jF, a26.A(view4), new uh7(((eyj) pdeVar2.g()).z, ((eyj) pdeVar2.g()).A, ((eyj) pdeVar2.g()).y), false);
            if (iVar2 instanceof hlb) {
                ((hlb) iVar2).D();
            }
        }
    }

    public final void o(jlb jlbVar) {
        if (Intrinsics.a(jlbVar, this.d)) {
            return;
        }
        jlb jlbVar2 = this.d;
        if (jlbVar2 != null) {
            View view = jlbVar2.c;
            xh7 xh7Var = this.i;
            LinkedHashMap linkedHashMap = (LinkedHashMap) xh7Var.c;
            ValueAnimator valueAnimator = (ValueAnimator) linkedHashMap.get(view);
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.addUpdateListener(new vh7(xh7Var, (byte) 3));
            valueAnimatorOfFloat.addListener(new wh7(xh7Var, view, (byte) 1));
            valueAnimatorOfFloat.start();
            linkedHashMap.put(view, valueAnimatorOfFloat);
            jlbVar2.b.F();
        }
        this.d = jlbVar;
        if (jlbVar != null) {
            View view2 = jlbVar.c;
            xh7 xh7Var2 = this.i;
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) xh7Var2.c;
            ValueAnimator valueAnimator2 = (ValueAnimator) linkedHashMap2.get(view2);
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.setDuration(200L);
            valueAnimatorOfFloat2.addUpdateListener(new vh7(xh7Var2, (byte) 0));
            valueAnimatorOfFloat2.start();
            linkedHashMap2.put(view2, valueAnimatorOfFloat2);
            jlbVar.b.L();
        }
    }
}

package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.OverlayView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class vi7 extends blb {
    public final umi e;
    public final boolean f;
    public final ns8 h;
    public i i;
    public final int j;
    public final boolean k;
    public ac1 l;
    public ti7 m;
    public o28 n;
    public OverlayView o;
    public fr8 p;
    public final short s;
    public boolean q = true;
    public final int[] r = new int[2];
    public boolean t = true;
    public final flb g = new flb(this);

    /* JADX WARN: Multi-variable type inference failed */
    public vi7(umi umiVar, int i, boolean z, int i2, ns8 ns8Var, boolean z2) {
        this.e = umiVar;
        this.j = i;
        this.k = z;
        this.s = i2;
        this.h = ns8Var;
        this.f = z2;
    }

    @Override // defpackage.blb
    public final boolean b(i iVar) {
        return this.q && (iVar instanceof th7);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bb  */
    @Override // defpackage.blb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.i c(androidx.recyclerview.widget.i r18, java.util.ArrayList r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi7.c(androidx.recyclerview.widget.i, java.util.ArrayList, int, int):androidx.recyclerview.widget.i");
    }

    @Override // defpackage.blb
    public final void d(RecyclerView recyclerView, i iVar) {
        super.d(recyclerView, iVar);
        if (this.p == null) {
            return;
        }
        iVar.itemView.setVisibility(0);
        OverlayView overlayView = this.o;
        fr8 fr8Var = this.p;
        overlayView.getClass();
        fr8Var.i = null;
        ArrayList arrayList = overlayView.c;
        arrayList.remove(fr8Var);
        if (arrayList.isEmpty()) {
            overlayView.d = null;
            overlayView.setVisibility(8);
        } else {
            overlayView.d = (fr8) arrayList.get(0);
        }
        this.p = null;
    }

    @Override // defpackage.blb
    public final int g() {
        return this.j;
    }

    @Override // defpackage.blb
    public final boolean l() {
        return false;
    }

    @Override // defpackage.blb
    public final boolean m() {
        return this.t;
    }

    @Override // defpackage.blb
    public final void o(Canvas canvas, RecyclerView recyclerView, i iVar, float f, float f2, int i, boolean z) {
        if (this.p == null) {
            super.o(canvas, recyclerView, iVar, f, f2, i, z);
        }
    }

    @Override // defpackage.blb
    public final void p(Canvas canvas, RecyclerView recyclerView, i iVar, float f, float f2, int i, boolean z) {
        View view = iVar.itemView;
        if (this.p != null) {
            if (view.isAttachedToWindow()) {
                fr8 fr8Var = this.p;
                int i2 = (int) f;
                int i3 = (int) f2;
                o8f o8fVar = fr8Var.i;
                if (o8fVar != null) {
                    if (i2 == fr8Var.j && i3 == fr8Var.k) {
                        return;
                    }
                    fr8Var.j = i2;
                    fr8Var.k = i3;
                    o8fVar.run(fr8Var);
                    return;
                }
                return;
            }
            int[] iArr = this.r;
            recyclerView.getLocationInWindow(iArr);
            iArr[0] = iVar.itemView.getLeft() + iArr[0];
            int top = iVar.itemView.getTop() + iArr[1];
            iArr[1] = top;
            fr8 fr8Var2 = this.p;
            int i4 = ((int) f) + iArr[0];
            int i5 = ((int) f2) + top;
            o8f o8fVar2 = fr8Var2.i;
            if (o8fVar2 != null) {
                if (i4 == fr8Var2.j && i5 == fr8Var2.k) {
                    return;
                }
                fr8Var2.j = i4;
                fr8Var2.k = i5;
                o8fVar2.run(fr8Var2);
            }
        }
    }

    @Override // defpackage.blb
    public final void q(RecyclerView recyclerView) {
        recyclerView.invalidate();
    }

    @Override // defpackage.blb
    public final boolean r(RecyclerView recyclerView, i iVar, i iVar2) {
        return this.q && (iVar instanceof th7) && ((th7) iVar).I(iVar2);
    }

    @Override // defpackage.blb
    public final void s(RecyclerView recyclerView, i iVar, int i) {
        th7 th7Var = this.i;
        if (th7Var != null) {
            th7Var.K(iVar);
        }
    }

    @Override // defpackage.blb
    public final void t(i iVar, int i) {
        i iVar2;
        ns8 ns8Var = this.h;
        if (i == 0) {
            if (iVar == null) {
                i iVar3 = this.i;
                ti7 ti7Var = this.m;
                if (ti7Var != null) {
                    v(iVar3, ti7Var);
                }
                w(null, 0, 0);
                this.i.E();
                this.i = null;
                if (ns8Var != null) {
                    ns8Var.o(iVar3);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 2 || (iVar2 = this.i) == iVar) {
            return;
        }
        boolean z = iVar2 != null;
        if (z) {
            ti7 ti7Var2 = this.m;
            if (ti7Var2 != null) {
                v(iVar2, ti7Var2);
            }
            w(null, 0, 0);
            this.i.E();
            this.i = null;
        }
        this.i = iVar;
        ((th7) iVar).B();
        if (this.p == null) {
            View view = iVar.itemView;
            if (view instanceof fr8) {
                OverlayView overlayView = this.o;
                if (overlayView == null) {
                    overlayView = (OverlayView) view.getRootView().findViewById(2131362848);
                    this.o = overlayView;
                }
                fr8 fr8Var = (fr8) iVar.itemView;
                this.p = fr8Var;
                ArrayList arrayList = overlayView.c;
                arrayList.add(fr8Var);
                fr8 fr8Var2 = (fr8) arrayList.get(0);
                overlayView.d = fr8Var2;
                fr8Var.i = new o8f(overlayView, (byte) 5);
                if (fr8Var2 == fr8Var) {
                    overlayView.invalidate();
                }
                overlayView.setVisibility(0);
                iVar.itemView.setVisibility(8);
            }
        }
        if (z || ns8Var == null) {
            return;
        }
        ns8Var.c(iVar);
    }

    public void v(i iVar, ti7 ti7Var) {
        ti7Var.a(iVar);
        ArrayList arrayList = this.g.t;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            elb elbVar = (elb) arrayList.get(size);
            if (elbVar.e == iVar) {
                elbVar.j = true;
                elbVar.g.setDuration(10000L);
                elbVar.s = false;
                elbVar.e.itemView.setHasTransientState(false);
                return;
            }
        }
    }

    public final void w(ti7 ti7Var, int i, int i2) {
        ti7 ti7Var2 = this.m;
        if (ti7Var2 == null ? ti7Var == null : ti7Var2.equals(ti7Var)) {
            ac1 ac1Var = this.l;
            if (ac1Var != null) {
                oml omlVar = (oml) ac1Var.d;
                if (omlVar != null) {
                    omlVar.cancel(false);
                    ac1Var.d = null;
                }
                this.l = null;
            }
            ti7 ti7Var3 = this.m;
            if (ti7Var3 != null) {
                ti7Var3.c(this.i, i, i2);
                return;
            }
            return;
        }
        ti7 ti7Var4 = this.m;
        if (ti7Var4 != null) {
            ti7Var4.c(null, 0, 0);
        }
        this.m = ti7Var;
        if (ti7Var != null) {
            ti7Var.c(this.i, i, i2);
        }
        ac1 ac1Var2 = this.l;
        if (ac1Var2 == null) {
            return;
        }
        oml omlVar2 = (oml) ac1Var2.d;
        if (omlVar2 != null) {
            omlVar2.cancel(false);
            ac1Var2.d = null;
        }
        this.l = null;
    }
}

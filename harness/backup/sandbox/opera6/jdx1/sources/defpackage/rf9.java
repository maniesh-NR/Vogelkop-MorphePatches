package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class rf9 extends b8e implements jg9, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View o;
    public ViewTreeObserver p;
    public final qf9 q;
    public final qf9 r;

    /* JADX WARN: Type inference failed for: r0v0, types: [qf9] */
    /* JADX WARN: Type inference failed for: r0v1, types: [qf9] */
    public rf9() {
        final byte b = 0;
        this.q = new Function1(this) { // from class: qf9
            public final /* synthetic */ rf9 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b2 = b;
                rf9 rf9Var = this.b;
                ch4 ch4Var = (ch4) obj;
                switch (b2) {
                    case 0:
                        View viewY = qbe.y(rf9Var);
                        if (!viewY.isFocused() && !viewY.hasFocus()) {
                            gg9 gg9Var = ui6.f0(rf9Var).l;
                            View viewI0 = p37.i0(rf9Var);
                            Integer numC = ag9.c(ch4Var.a);
                            int[] iArr = new int[2];
                            viewI0.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            viewY.getLocationOnScreen(iArr2);
                            vg9 vg9VarR = gyg.r(gg9Var.c);
                            Rect rect = null;
                            voh vohVarT = vg9VarR != null ? gyg.t(vg9VarR) : null;
                            if (vohVarT != null) {
                                int i = (int) vohVarT.a;
                                int i2 = iArr[0];
                                int i3 = iArr2[0];
                                int i4 = (int) vohVarT.b;
                                int i5 = iArr[1];
                                int i6 = iArr2[1];
                                rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) vohVarT.c) + i2) - i3, (((int) vohVarT.d) + i5) - i6);
                            }
                            if (!ag9.b(viewY, numC, rect)) {
                                ch4Var.b = true;
                            }
                        }
                        break;
                    default:
                        qbe.y(rf9Var);
                        break;
                }
                return Unit.a;
            }
        };
        final byte b2 = 1;
        this.r = new Function1(this) { // from class: qf9
            public final /* synthetic */ rf9 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b2;
                rf9 rf9Var = this.b;
                ch4 ch4Var = (ch4) obj;
                switch (b22) {
                    case 0:
                        View viewY = qbe.y(rf9Var);
                        if (!viewY.isFocused() && !viewY.hasFocus()) {
                            gg9 gg9Var = ui6.f0(rf9Var).l;
                            View viewI0 = p37.i0(rf9Var);
                            Integer numC = ag9.c(ch4Var.a);
                            int[] iArr = new int[2];
                            viewI0.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            viewY.getLocationOnScreen(iArr2);
                            vg9 vg9VarR = gyg.r(gg9Var.c);
                            Rect rect = null;
                            voh vohVarT = vg9VarR != null ? gyg.t(vg9VarR) : null;
                            if (vohVarT != null) {
                                int i = (int) vohVarT.a;
                                int i2 = iArr[0];
                                int i3 = iArr2[0];
                                int i4 = (int) vohVarT.b;
                                int i5 = iArr[1];
                                int i6 = iArr2[1];
                                rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) vohVarT.c) + i2) - i3, (((int) vohVarT.d) + i5) - i6);
                            }
                            if (!ag9.b(viewY, numC, rect)) {
                                ch4Var.b = true;
                            }
                        }
                        break;
                    default:
                        qbe.y(rf9Var);
                        break;
                }
                return Unit.a;
            }
        };
    }

    @Override // defpackage.b8e
    public final void L0() {
        ViewTreeObserver viewTreeObserver = p37.i0(this).getViewTreeObserver();
        this.p = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // defpackage.b8e
    public final void M0() {
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.p = null;
        p37.i0(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.o = null;
    }

    public final vg9 T0() {
        boolean z;
        if (!this.a.n) {
            a8b.b("visitLocalDescendants called on an unattached node");
        }
        b8e b8eVar = this.a;
        if ((b8eVar.d & 1024) != 0) {
            boolean z2 = false;
            while (true) {
                b8eVar = b8eVar.f;
                if (b8eVar == null) {
                    break;
                }
                if ((b8eVar.c & 1024) != 0) {
                    b8e b8eVarU = b8eVar;
                    dfe dfeVar = null;
                    while (b8eVarU != null) {
                        if (b8eVarU instanceof vg9) {
                            vg9 vg9Var = (vg9) b8eVarU;
                            if (z2) {
                                return vg9Var;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (b8eVarU.c & 1024) != 0 && (b8eVarU instanceof i17)) {
                            int i = 0;
                            for (b8e b8eVar2 = ((i17) b8eVarU).p; b8eVar2 != null; b8eVar2 = b8eVar2.f) {
                                if ((b8eVar2.c & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        b8eVarU = b8eVar2;
                                    } else {
                                        if (dfeVar == null) {
                                            dfeVar = new dfe(new b8e[16]);
                                        }
                                        if (b8eVarU != null) {
                                            dfeVar.c(b8eVarU);
                                            b8eVarU = null;
                                        }
                                        dfeVar.c(b8eVar2);
                                    }
                                }
                            }
                            if (i != 1) {
                            }
                        }
                        b8eVarU = ui6.U(dfeVar);
                    }
                }
            }
        }
        qp2.n("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) throws pxb {
        boolean z;
        if (ui6.e0(this).n != null) {
            View viewY = qbe.y(this);
            gg9 gg9Var = ui6.f0(this).l;
            v31 v31VarF0 = ui6.f0(this);
            boolean z2 = true;
            if (view == null || view.equals(v31VarF0)) {
                z = false;
            } else {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == viewY.getParent()) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            if (view2 == null || view2.equals(v31VarF0)) {
                z2 = false;
            } else {
                for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                    if (parent2 == viewY.getParent()) {
                        break;
                    }
                }
                z2 = false;
            }
            if (z && z2) {
                this.o = view2;
                return;
            }
            if (z2) {
                this.o = view2;
                vg9 vg9VarT0 = T0();
                if (vg9VarT0.Y0().d()) {
                    return;
                }
                k1g.W(vg9VarT0);
                return;
            }
            if (!z) {
                this.o = null;
                return;
            }
            this.o = null;
            if (T0().Y0().g()) {
                gg9Var.b(8, false, false);
            }
        }
    }

    @Override // defpackage.jg9
    public final void p(hg9 hg9Var) {
        hg9Var.a(false);
        hg9Var.e(this.q);
        hg9Var.c(this.r);
    }
}

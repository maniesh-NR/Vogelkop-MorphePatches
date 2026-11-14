package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.cb3;
import defpackage.g99;
import defpackage.ho5;
import defpackage.shh;
import defpackage.uo5;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Flow extends ho5 {
    public boolean h;
    public boolean i;
    public g99 j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.ho5
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // defpackage.ho5
    public final void h(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.h(attributeSet);
        int[] iArr = shh.b;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, iArr);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.h = true;
                } else if (index == 22) {
                    this.i = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        g99 g99Var = new g99();
        g99Var.r0 = 0;
        g99Var.s0 = 0;
        g99Var.t0 = 0;
        g99Var.u0 = 0;
        g99Var.v0 = 0;
        g99Var.w0 = 0;
        g99Var.x0 = false;
        g99Var.y0 = 0;
        g99Var.z0 = 0;
        g99Var.A0 = new cb3();
        g99Var.B0 = null;
        g99Var.C0 = -1;
        g99Var.D0 = -1;
        g99Var.E0 = -1;
        g99Var.F0 = -1;
        g99Var.G0 = -1;
        g99Var.H0 = -1;
        g99Var.I0 = 0.5f;
        g99Var.J0 = 0.5f;
        g99Var.K0 = 0.5f;
        g99Var.L0 = 0.5f;
        g99Var.M0 = 0.5f;
        g99Var.N0 = 0.5f;
        g99Var.O0 = 0;
        g99Var.P0 = 0;
        g99Var.Q0 = 2;
        g99Var.R0 = 2;
        g99Var.S0 = 0;
        g99Var.T0 = -1;
        g99Var.U0 = 0;
        g99Var.V0 = new ArrayList();
        g99Var.W0 = null;
        g99Var.X0 = null;
        g99Var.Y0 = null;
        g99Var.a1 = 0;
        this.j = g99Var;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, iArr);
            int indexCount2 = typedArrayObtainStyledAttributes2.getIndexCount();
            for (int i2 = 0; i2 < indexCount2; i2++) {
                int index2 = typedArrayObtainStyledAttributes2.getIndex(i2);
                if (index2 == 0) {
                    this.j.U0 = typedArrayObtainStyledAttributes2.getInt(index2, 0);
                } else if (index2 == 1) {
                    g99 g99Var2 = this.j;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                    g99Var2.r0 = dimensionPixelSize;
                    g99Var2.s0 = dimensionPixelSize;
                    g99Var2.t0 = dimensionPixelSize;
                    g99Var2.u0 = dimensionPixelSize;
                } else if (index2 == 18) {
                    g99 g99Var3 = this.j;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                    g99Var3.t0 = dimensionPixelSize2;
                    g99Var3.v0 = dimensionPixelSize2;
                    g99Var3.w0 = dimensionPixelSize2;
                } else if (index2 == 19) {
                    this.j.u0 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                } else if (index2 == 2) {
                    this.j.v0 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                } else if (index2 == 3) {
                    this.j.r0 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                } else if (index2 == 4) {
                    this.j.w0 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                } else if (index2 == 5) {
                    this.j.s0 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                } else if (index2 == 54) {
                    this.j.S0 = typedArrayObtainStyledAttributes2.getInt(index2, 0);
                } else if (index2 == 44) {
                    this.j.C0 = typedArrayObtainStyledAttributes2.getInt(index2, 0);
                } else if (index2 == 53) {
                    this.j.D0 = typedArrayObtainStyledAttributes2.getInt(index2, 0);
                } else if (index2 == 38) {
                    this.j.E0 = typedArrayObtainStyledAttributes2.getInt(index2, 0);
                } else if (index2 == 46) {
                    this.j.G0 = typedArrayObtainStyledAttributes2.getInt(index2, 0);
                } else if (index2 == 40) {
                    this.j.F0 = typedArrayObtainStyledAttributes2.getInt(index2, 0);
                } else if (index2 == 48) {
                    this.j.H0 = typedArrayObtainStyledAttributes2.getInt(index2, 0);
                } else if (index2 == 42) {
                    this.j.I0 = typedArrayObtainStyledAttributes2.getFloat(index2, 0.5f);
                } else if (index2 == 37) {
                    this.j.K0 = typedArrayObtainStyledAttributes2.getFloat(index2, 0.5f);
                } else if (index2 == 45) {
                    this.j.M0 = typedArrayObtainStyledAttributes2.getFloat(index2, 0.5f);
                } else if (index2 == 39) {
                    this.j.L0 = typedArrayObtainStyledAttributes2.getFloat(index2, 0.5f);
                } else if (index2 == 47) {
                    this.j.N0 = typedArrayObtainStyledAttributes2.getFloat(index2, 0.5f);
                } else if (index2 == 51) {
                    this.j.J0 = typedArrayObtainStyledAttributes2.getFloat(index2, 0.5f);
                } else if (index2 == 41) {
                    this.j.Q0 = typedArrayObtainStyledAttributes2.getInt(index2, 2);
                } else if (index2 == 50) {
                    this.j.R0 = typedArrayObtainStyledAttributes2.getInt(index2, 2);
                } else if (index2 == 43) {
                    this.j.O0 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                } else if (index2 == 52) {
                    this.j.P0 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                } else if (index2 == 49) {
                    this.j.T0 = typedArrayObtainStyledAttributes2.getInt(index2, -1);
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        this.d = this.j;
        o();
    }

    @Override // defpackage.ho5
    public final void j(uo5 uo5Var, boolean z) {
        g99 g99Var = this.j;
        int i = g99Var.t0;
        if (i > 0 || g99Var.u0 > 0) {
            if (z) {
                g99Var.v0 = g99Var.u0;
                g99Var.w0 = i;
            } else {
                g99Var.v0 = i;
                g99Var.w0 = g99Var.u0;
            }
        }
    }

    @Override // defpackage.ho5, android.view.View
    public final void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        if (this.h || this.i) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.b; i++) {
                    View view = (View) constraintLayout.a.get(this.a[i]);
                    if (view != null) {
                        if (this.h) {
                            view.setVisibility(visibility);
                        }
                        if (this.i && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ho5, android.view.View
    public final void onMeasure(int i, int i2) {
        p(this.j, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0103 A[EDGE_INSN: B:406:0x0103->B:60:0x0103 BREAK  A[LOOP:1: B:54:0x00ec->B:59:0x00fe], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0132  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.g99 r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.p(g99, int, int):void");
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        d();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}

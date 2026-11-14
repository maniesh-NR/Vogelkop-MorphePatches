package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class i2o implements View.OnApplyWindowInsetsListener {
    public final s75 a;
    public g3o b;

    public i2o(View view, s75 s75Var) {
        g3o g3oVarB;
        this.a = s75Var;
        WeakHashMap weakHashMap = r5n.a;
        g3o g3oVarA = i5n.a(view);
        if (g3oVarA != null) {
            int i = Build.VERSION.SDK_INT;
            g3oVarB = (i >= 36 ? new t2o(g3oVarA) : i >= 35 ? new s2o(g3oVarA) : i >= 34 ? new r2o(g3oVarA) : i >= 31 ? new q2o(g3oVarA) : i >= 30 ? new p2o(g3oVarA) : new o2o(g3oVarA)).b();
        } else {
            g3oVarB = null;
        }
        this.b = g3oVarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = g3o.g(view, windowInsets);
            return j2o.j(view, windowInsets);
        }
        g3o g3oVarG = g3o.g(view, windowInsets);
        d3o d3oVar = g3oVarG.a;
        g3o g3oVarA = this.b;
        if (g3oVarA == null) {
            WeakHashMap weakHashMap = r5n.a;
            g3oVarA = i5n.a(view);
            this.b = g3oVarA;
        }
        if (g3oVarA == null) {
            this.b = g3oVarG;
            return j2o.j(view, windowInsets);
        }
        s75 s75VarK = j2o.k(view);
        if (s75VarK != null && Objects.equals((g3o) s75VarK.c, g3oVarG)) {
            return j2o.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        g3o g3oVar = this.b;
        int i = 1;
        while (i <= 512) {
            r9b r9bVarI = d3oVar.i(i);
            r9b r9bVarI2 = g3oVar.a.i(i);
            int i2 = r9bVarI.a;
            int i3 = r9bVarI.d;
            int i4 = r9bVarI.c;
            int i5 = r9bVarI.b;
            int i6 = r9bVarI2.a;
            int i7 = r9bVarI2.d;
            int i8 = r9bVarI2.c;
            int i9 = r9bVarI2.b;
            if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                iArr = iArr2;
                z = true;
            } else {
                iArr = iArr2;
                z = false;
            }
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i10 = iArr2[0];
        int i11 = iArr3[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.b = g3oVarG;
            return j2o.j(view, windowInsets);
        }
        g3o g3oVar2 = this.b;
        n2o n2oVar = new n2o(i12, (i10 & 8) != 0 ? j2o.e : (i11 & 8) != 0 ? j2o.f : (i10 & 519) != 0 ? j2o.g : (i11 & 519) != 0 ? j2o.h : null, (i12 & 8) != 0 ? 160L : 250L);
        n2oVar.a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(n2oVar.a.b());
        r9b r9bVarI3 = d3oVar.i(i12);
        r9b r9bVarI4 = g3oVar2.a.i(i12);
        int iMin = Math.min(r9bVarI3.a, r9bVarI4.a);
        int i13 = r9bVarI3.b;
        int i14 = r9bVarI4.b;
        int iMin2 = Math.min(i13, i14);
        int i15 = r9bVarI3.c;
        int i16 = r9bVarI4.c;
        int iMin3 = Math.min(i15, i16);
        int i17 = r9bVarI3.d;
        int i18 = r9bVarI4.d;
        mgh mghVar = new mgh(r9b.c(iMin, iMin2, iMin3, Math.min(i17, i18)), r9b.c(Math.max(r9bVarI3.a, r9bVarI4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), (byte) 12);
        j2o.g(view, n2oVar, g3oVarG, false);
        duration.addUpdateListener(new h2o(n2oVar, g3oVarG, g3oVar2, i12, view));
        duration.addListener(new al9(n2oVar, view, (byte) 6));
        kff.a(view, new ll4(view, n2oVar, mghVar, duration, (byte) 4, false));
        this.b = g3oVarG;
        return j2o.j(view, windowInsets);
    }
}

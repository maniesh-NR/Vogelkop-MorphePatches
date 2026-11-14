package com.opera.android.favorites;

import android.view.View;
import androidx.recyclerview.widget.CustomGridLayoutManager;
import androidx.recyclerview.widget.g;
import defpackage.cs5;
import defpackage.esk;
import defpackage.vph;

/* loaded from: classes.dex */
public class FavoriteGridLayoutManager extends CustomGridLayoutManager {
    public final boolean h;
    public final esk i;
    public final esk j;
    public int k;
    public int l;

    public FavoriteGridLayoutManager(esk eskVar, esk eskVar2, boolean z) {
        this.h = z;
        this.i = eskVar;
        this.j = eskVar2;
    }

    @Override // androidx.recyclerview.widget.CustomGridLayoutManager
    public final void E(fr[] frVarArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 == 0 ? 0 : frVarArr[i3 - 1].c + this.l;
            fr frVar = frVarArr[i3];
            int i5 = this.k + i4;
            frVar.b = i4;
            frVar.c = i5;
            i3++;
        }
    }

    @Override // androidx.recyclerview.widget.f
    public final void onMeasure(g gVar, vph vphVar, int i, int i2) {
        int iC;
        int size = View.MeasureSpec.getSize(i);
        int iB = vphVar.b();
        tta ttaVar = (tta) this.i.get();
        int iIntValue = ((Integer) this.j.get()).intValue();
        sta staVar = ttaVar.h;
        int i3 = staVar.a;
        int i4 = size - (iIntValue << 1);
        int i5 = ttaVar.c;
        int i6 = i5;
        int iT = 1;
        while (iT < 16 && i6 + i3 + i5 <= i4) {
            i6 += i3 + i5;
            iT++;
        }
        if (iT > 1) {
            iC = djh.c((i4 - (i5 * iT)) / (iT - 1), i3, staVar.b);
        } else {
            iC = 0;
        }
        this.k = i5;
        this.l = iC;
        if (this.h && iT > 1) {
            iT = cs5.t(iB, 1, iT - 1);
        }
        this.c = new fr[0];
        requestLayout();
        K(iT);
        super.onMeasure(gVar, vphVar, i, i2);
    }
}

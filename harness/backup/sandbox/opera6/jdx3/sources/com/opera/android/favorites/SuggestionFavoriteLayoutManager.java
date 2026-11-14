package com.opera.android.favorites;

import android.util.SparseArray;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.gr8;
import defpackage.hok;
import defpackage.i0l;
import defpackage.ook;
import defpackage.qok;
import defpackage.s93;
import defpackage.s9i;
import defpackage.tq8;
import defpackage.tta;
import defpackage.w6j;
import defpackage.x5f;
import defpackage.zzh;
import java.util.HashSet;

/* loaded from: classes.dex */
public class SuggestionFavoriteLayoutManager extends LinearLayoutManager {
    public int a;
    public int b;
    public int c;
    public final RecyclerView d;
    public final hok e;
    public final zzh f;
    public int g;
    public int h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestionFavoriteLayoutManager(RecyclerView recyclerView, tta ttaVar, gr8 gr8Var, hok hokVar, zzh zzhVar) {
        super(0, false);
        recyclerView.getContext();
        this.a = 16;
        this.h = -1;
        this.i = -1;
        this.b = ttaVar.c;
        this.c = ttaVar.a;
        this.a = gr8Var.a;
        this.d = recyclerView;
        while (true) {
            int size = this.d.p.size();
            RecyclerView recyclerView2 = this.d;
            if (size <= 0) {
                recyclerView2.m(new s93(this, (byte) 2));
                this.e = hokVar;
                this.f = zzhVar;
                return;
            }
            recyclerView2.r0(0);
        }
    }

    public final void D() {
        int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == this.h && iFindLastVisibleItemPosition == this.i) {
            return;
        }
        this.h = iFindFirstVisibleItemPosition;
        this.i = iFindLastVisibleItemPosition;
        hok hokVar = this.e;
        w6j w6jVar = (w6j) hokVar.D;
        s9i s9iVar = hokVar.c;
        for (int i = 0; i < ((tq8) s9iVar.b).e.size(); i++) {
            qok qokVar = (qok) ((tq8) s9iVar.b).u(i);
            ook ookVar = qokVar.e;
            if (i < iFindFirstVisibleItemPosition || i > iFindLastVisibleItemPosition) {
                if (((SparseArray) w6jVar.c).get(i) == null) {
                    ((SparseArray) w6jVar.d).append(i, ookVar);
                }
            } else if (((HashSet) hokVar.C).add(qokVar)) {
                byte b = ookVar.d;
                if (b == 7) {
                    String.valueOf(-1);
                    throw null;
                }
                if (b == 8) {
                    x5f x5fVar = (x5f) hokVar.F;
                    boolean zS = z7h.s(ookVar.b);
                    x5fVar.getClass();
                    x5fVar.T0(new ou5(zS, false, (byte) 1));
                }
                SparseArray sparseArray = (SparseArray) w6jVar.c;
                byte b2 = ookVar.d;
                if (b2 != 6 && b2 != 11) {
                    ((SparseArray) w6jVar.d).remove(i);
                    if (((ook) sparseArray.get(i)) == null) {
                        sparseArray.append(i, ookVar);
                    }
                }
            } else {
                continue;
            }
        }
    }

    public final void onLayoutCompleted(vph vphVar) {
        D();
    }

    public final void onMeasure(androidx.recyclerview.widget.g gVar, vph vphVar, int i, int i2) {
        int i3;
        super/*androidx.recyclerview.widget.f*/.onMeasure(gVar, vphVar, i, i2);
        RecyclerView recyclerView = this.d;
        int paddingLeft = cs5.W(recyclerView) ? recyclerView.getPaddingLeft() : recyclerView.getPaddingRight();
        int measuredWidth = (recyclerView.getMeasuredWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        int iMin = Math.min((measuredWidth - paddingLeft) / this.b, this.a);
        int i4 = this.b * iMin;
        int i5 = this.g;
        if (i0l.g()) {
            i3 = this.b - this.c;
            this.g = i3;
        } else {
            i3 = (measuredWidth - i4) / (iMin > 1 ? iMin - 1 : 1);
            this.g = i3;
        }
        if (i5 != i3) {
            recyclerView.a0();
        }
        this.f.run(Integer.valueOf(iMin));
    }
}

package androidx.recyclerview.widget;

import android.view.View;
import defpackage.lph;
import defpackage.or;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {
    public final /* synthetic */ RecyclerView a;

    public c(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(or orVar) {
        byte b = orVar.a;
        RecyclerView recyclerView = this.a;
        if (b == 1) {
            recyclerView.n.onItemsAdded(recyclerView, orVar.b, orVar.d);
            return;
        }
        if (b == 2) {
            recyclerView.n.onItemsRemoved(recyclerView, orVar.b, orVar.d);
        } else if (b == 4) {
            recyclerView.n.onItemsUpdated(recyclerView, orVar.b, orVar.d, orVar.c);
        } else {
            if (b != 8) {
                return;
            }
            recyclerView.n.onItemsMoved(recyclerView, orVar.b, orVar.d, 1);
        }
    }

    public final void b(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.f.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iH; i6++) {
            View viewG = recyclerView.f.g(i6);
            i iVarU = RecyclerView.U(viewG);
            if (iVarU != null && !iVarU.shouldIgnore() && (i4 = iVarU.mPosition) >= i && i4 < i5) {
                iVarU.addFlags(2);
                iVarU.addChangePayload(obj);
                ((lph) viewG.getLayoutParams()).c = true;
            }
        }
        g gVar = recyclerView.c;
        ArrayList arrayList = gVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i iVar = (i) arrayList.get(size);
            if (iVar != null && (i3 = iVar.mPosition) >= i && i3 < i5) {
                iVar.addFlags(2);
                gVar.h(size);
            }
        }
        recyclerView.k0 = true;
    }

    public final void c(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.f.h();
        for (int i3 = 0; i3 < iH; i3++) {
            i iVarU = RecyclerView.U(recyclerView.f.g(i3));
            if (iVarU != null && !iVarU.shouldIgnore() && iVarU.mPosition >= i) {
                iVarU.offsetPosition(i2, false);
                recyclerView.h0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.c.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            i iVar = (i) arrayList.get(i4);
            if (iVar != null && iVar.mPosition >= i) {
                iVar.offsetPosition(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.j0 = true;
    }

    public final void d(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.f.h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iH; i11++) {
            i iVarU = RecyclerView.U(recyclerView.f.g(i11));
            if (iVarU != null && (i9 = iVarU.mPosition) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    iVarU.offsetPosition(i2 - i, false);
                } else {
                    iVarU.offsetPosition(i5, false);
                }
                recyclerView.h0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.c.c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            i iVar = (i) arrayList.get(i12);
            if (iVar != null && (i8 = iVar.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    iVar.offsetPosition(i2 - i, false);
                } else {
                    iVar.offsetPosition(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.j0 = true;
    }
}

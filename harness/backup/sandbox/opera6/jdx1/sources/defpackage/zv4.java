package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zv4 {
    public final isd a;
    public View e;
    public byte d = 0;
    public final yv4 b = new yv4((byte) 0);
    public final ArrayList c = new ArrayList();

    public zv4(isd isdVar) {
        this.a = isdVar;
    }

    public final void a(View view, int i, boolean z) {
        RecyclerView recyclerView = (RecyclerView) this.a.b;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.o(childCount, z);
        if (z) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        i iVarU = RecyclerView.U(view);
        d dVar = recyclerView.m;
        if (dVar != null && iVarU != null) {
            dVar.onViewAttachedToWindow(iVarU);
        }
        ArrayList arrayList = recyclerView.C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((mph) recyclerView.C.get(size)).getClass();
            }
        }
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) this.a.b;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.o(childCount, z);
        if (z) {
            i(view);
        }
        i iVarU = RecyclerView.U(view);
        if (iVarU != null) {
            if (!iVarU.isTmpDetached() && !iVarU.shouldIgnore()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + iVarU + recyclerView.F());
            }
            iVarU.clearTmpDetachFlag();
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int iF = f(i);
        this.b.q(iF);
        RecyclerView recyclerView = (RecyclerView) this.a.b;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null) {
            i iVarU = RecyclerView.U(childAt);
            if (iVarU != null) {
                if (iVarU.isTmpDetached() && !iVarU.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + iVarU + recyclerView.F());
                }
                iVarU.addFlags(NotificationCompat.FLAG_LOCAL_ONLY);
            }
        } else {
            int[] iArr = RecyclerView.C0;
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i) {
        return ((RecyclerView) this.a.b).getChildAt(f(i));
    }

    public final int e() {
        return ((RecyclerView) this.a.b).getChildCount() - this.c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) this.a.b).getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            yv4 yv4Var = this.b;
            int iF = i - (i2 - yv4Var.f(i2));
            if (iF == 0) {
                while (yv4Var.i(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iF;
        }
        return -1;
    }

    public final View g(int i) {
        return ((RecyclerView) this.a.b).getChildAt(i);
    }

    public final int h() {
        return ((RecyclerView) this.a.b).getChildCount();
    }

    public final void i(View view) {
        this.c.add(view);
        i iVarU = RecyclerView.U(view);
        if (iVarU != null) {
            iVarU.onEnteredHiddenState((RecyclerView) this.a.b);
        }
    }

    public final int j(View view) {
        int iIndexOfChild = ((RecyclerView) this.a.b).indexOfChild(view);
        if (iIndexOfChild != -1) {
            yv4 yv4Var = this.b;
            if (!yv4Var.i(iIndexOfChild)) {
                return iIndexOfChild - yv4Var.f(iIndexOfChild);
            }
        }
        return -1;
    }

    public final void k(int i) {
        isd isdVar = this.a;
        byte b = this.d;
        if (b == 1) {
            qp2.n("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (b == 2) {
            qp2.n("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            int iF = f(i);
            View childAt = ((RecyclerView) isdVar.b).getChildAt(iF);
            if (childAt != null) {
                this.d = (byte) 1;
                this.e = childAt;
                if (this.b.q(iF)) {
                    l(childAt);
                }
                isdVar.I(iF);
            }
        } finally {
            this.d = (byte) 0;
            this.e = null;
        }
    }

    public final void l(View view) {
        i iVarU;
        if (!this.c.remove(view) || (iVarU = RecyclerView.U(view)) == null) {
            return;
        }
        iVarU.onLeftHiddenState((RecyclerView) this.a.b);
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}

package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class ka2 extends iph {
    public final Point a;
    public final byte b;
    public final Rect c = new Rect();
    public final ArrayList d = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public ka2(Point point, int i) {
        this.a = point;
        this.b = i;
    }

    public abstract int e(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public final wa2 f(View view, RecyclerView recyclerView, vph vphVar) {
        wa2 wa2Var;
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            wa2Var = new wa2();
        } else {
            wa2Var = (wa2) vep.r(1, arrayList);
            wa2Var.a.setEmpty();
            wa2Var.b.setEmpty();
            wa2Var.c = true;
            wa2Var.d = false;
        }
        Rect rect = wa2Var.b;
        Rect rect2 = wa2Var.a;
        Point point = this.a;
        int i = point.x / 2;
        int i2 = point.y / 2;
        rect2.set(i, i2, i, i2);
        ab2 ab2Var = (ab2) recyclerView.T(view);
        int adapterPosition = ab2Var == 0 ? -1 : ab2Var.getAdapterPosition();
        if (adapterPosition != -1) {
            wa2Var.c = adapterPosition != vphVar.b() - 1;
            qv8 qv8Var = (qv8) this;
            int iU = ab2Var.U();
            byte b = qv8Var.b;
            boolean z = b == 1 || iU == -1 || iU == b;
            if (z || qv8Var.e(adapterPosition) == 0) {
                rect.left += qv8Var.f;
            }
            if (z || qv8Var.e(adapterPosition) == b - 1) {
                rect.right += qv8Var.f;
            }
            if (b != 1 ? !(adapterPosition >= b || qv8Var.e.d(adapterPosition, b) != 0) : adapterPosition == 0) {
                rect.top = rect.top;
            }
            if (ab2Var instanceof xa2) {
                ((xa2) ab2Var).J(wa2Var);
            }
            if (recyclerView.getLayoutDirection() == 1) {
                int i3 = rect.left;
                rect.left = rect.right;
                rect.right = i3;
            }
        }
        return wa2Var;
    }

    public abstract boolean g(View view, RecyclerView recyclerView, vph vphVar, wa2 wa2Var);

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, vph vphVar) {
        wa2 wa2VarF = f(view, recyclerView, vphVar);
        wa2VarF.a(g(view, recyclerView, vphVar, wa2VarF) ? fan.a(1.0f, recyclerView.getContext().getResources()) : 0, rect);
        this.d.add(wa2VarF);
    }
}

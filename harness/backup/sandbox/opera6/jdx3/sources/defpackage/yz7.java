package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.f;

/* loaded from: classes.dex */
public class yz7 {
    public final d a;
    public final wz7 b;
    public final x93 c;
    public boolean d;

    public yz7(d dVar, int i, int i2, int i3, int i4) {
        this(dVar, new wz7(i, i2, i3, i4));
    }

    public yz7(d dVar, wz7 wz7Var) {
        this.a = dVar;
        this.b = wz7Var;
        wz7Var.setHasStableIds(dVar.hasStableIds());
        byte b = 3;
        this.c = new x93(new sa2((byte) 8, dVar.hasStableIds() ? 3 : 1, false), new d[]{wz7Var, dVar});
        dVar.registerAdapterDataObserver(new a83(this, b));
    }

    public final void a(int i) {
        wz7 wz7Var = this.b;
        if (wz7Var.c != i) {
            wz7Var.c = i;
            if (wz7Var.e) {
                wz7Var.notifyItemChanged(0);
            }
        }
    }

    public final void b(int i) {
        wz7 wz7Var = this.b;
        if (wz7Var.d != i) {
            wz7Var.d = i;
            if (wz7Var.e) {
                wz7Var.notifyItemChanged(0);
            }
        }
    }

    public final void c() {
        this.d = true;
        d();
    }

    public final void d() {
        f fVar;
        if (this.d) {
            boolean z = this.a.getItemCount() == 0;
            wz7 wz7Var = this.b;
            if (z == wz7Var.e) {
                return;
            }
            wz7Var.e = z;
            RecyclerView recyclerView = wz7Var.f;
            if (recyclerView != null && (fVar = recyclerView.n) != null) {
                fVar.setMeasurementCacheEnabled(!z);
            }
            if (z) {
                wz7Var.notifyItemInserted(0);
            } else {
                wz7Var.notifyItemRemoved(0);
            }
        }
    }
}

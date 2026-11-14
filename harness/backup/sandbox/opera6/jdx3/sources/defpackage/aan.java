package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class aan extends can {
    public final yc3 d = new yc3(this, 9);
    public z61 e;

    public final void e(RecyclerView recyclerView) {
        recyclerView.o(this.d);
        ViewTreeObserver.OnGlobalLayoutListener z9nVar = new z9n(this, recyclerView);
        z61 z61Var = new z61(z9nVar, (byte) 11);
        this.e = z61Var;
        recyclerView.addOnAttachStateChangeListener(z61Var);
        if (recyclerView.isAttachedToWindow()) {
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(z9nVar);
        }
    }

    public final void f(i iVar) {
        if (iVar instanceof y9n) {
            View view = iVar.itemView;
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i = -1;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                if (((ban) obj).a.equals(view)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                c(iVar.itemView, (y9n) iVar);
            }
        }
    }
}

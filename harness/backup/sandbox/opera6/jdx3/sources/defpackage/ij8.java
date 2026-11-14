package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ij8 extends iph {
    public final int a;
    public final int b;

    public ij8(Context context) {
        this.a = new ixh(8.0f).k(context);
        this.b = new ixh(12.0f).k(context);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, vph vphVar) {
        int bindingAdapterPosition;
        super.getItemOffsets(rect, view, recyclerView, vphVar);
        i iVarT = recyclerView.T(view);
        if (!(iVarT instanceof ymh) || (bindingAdapterPosition = ((ymh) iVarT).getBindingAdapterPosition()) == -1) {
            return;
        }
        d dVar = recyclerView.m;
        umh umhVar = dVar instanceof umh ? (umh) dVar : null;
        if (umhVar == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) umhVar.d;
        smh smhVar = bindingAdapterPosition == 0 ? null : (smh) arrayList.get(bindingAdapterPosition - 1);
        smh smhVar2 = bindingAdapterPosition != arrayList.size() + (-1) ? (smh) arrayList.get(bindingAdapterPosition + 1) : null;
        boolean z = smhVar instanceof hj8;
        int i = this.b;
        int i2 = this.a;
        rect.top = z ? i2 : i;
        if (smhVar2 instanceof hj8) {
            i = i2;
        }
        rect.bottom = i;
    }
}

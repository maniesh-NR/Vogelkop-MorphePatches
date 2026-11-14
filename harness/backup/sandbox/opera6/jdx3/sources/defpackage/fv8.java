package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class fv8 extends iph {
    public final zi4 a;
    public final xu8 b;
    public final yu8 c;
    public final laj d;
    public final int e;
    public final int f;
    public lv8 g;
    public int h;

    public fv8(Context context, pde pdeVar, tsd tsdVar, zi4 zi4Var, xu8 xu8Var, yu8 yu8Var) {
        this.a = zi4Var;
        this.b = xu8Var;
        this.c = yu8Var;
        laj lajVarG = u0h.g(context, maj.a);
        this.d = lajVarG;
        int color = context.getColor(2131099826);
        this.e = color;
        int color2 = context.getColor(2131103887);
        this.f = color2;
        int iOrdinal = ((w6k) tsdVar.g()).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                h9o.p();
                throw null;
            }
            color = color2;
        }
        this.g = new lv8(color);
        int iOrdinal2 = ((w6k) tsdVar.g()).ordinal();
        if (iOrdinal2 == 0) {
            lajVarG = null;
        } else if (iOrdinal2 != 1) {
            h9o.p();
            throw null;
        }
        zi4Var.Y(lajVarG);
        a26.S(tsdVar, pdeVar, new cl4(this, (byte) 18));
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, vph vphVar) {
        i iVarT = recyclerView.T(view);
        int iS = RecyclerView.S(view);
        rect.top = ((mv8) this.b.invoke(Integer.valueOf(iS))).b().a.k(view.getContext()) + rect.top;
        if (iVarT instanceof ev8) {
            return;
        }
        int i = rect.left;
        int i2 = this.h;
        rect.left = i + i2;
        rect.right += i2;
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, vph vphVar) {
        ry7 ry7Var = new ry7(recyclerView, this, (byte) 9);
        zi4 zi4Var = this.a;
        if (zi4Var.F() || canvas.isHardwareAccelerated()) {
            zi4Var.k(canvas, ry7Var);
        }
        ry7Var.invoke(canvas);
    }
}

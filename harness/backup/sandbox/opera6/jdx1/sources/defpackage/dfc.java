package defpackage;

import android.view.View;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.i;
import java.util.List;

/* loaded from: classes.dex */
public final class dfc {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int layoutPosition;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((i) this.k.get(i2)).itemView;
            lph lphVar = (lph) view3.getLayoutParams();
            if (view3 != view && !lphVar.a.isRemoved() && (layoutPosition = (lphVar.a.getLayoutPosition() - this.d) * this.e) >= 0 && layoutPosition < i) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((lph) view2.getLayoutParams()).a.getLayoutPosition();
        }
    }

    public final boolean b(vph vphVar) {
        int i = this.d;
        return i >= 0 && i < vphVar.b();
    }

    public final View c(g gVar) {
        List list = this.k;
        if (list == null) {
            View viewD = gVar.d(this.d);
            this.d += this.e;
            return viewD;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((i) this.k.get(i)).itemView;
            lph lphVar = (lph) view.getLayoutParams();
            if (!lphVar.a.isRemoved() && this.d == lphVar.a.getLayoutPosition()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}

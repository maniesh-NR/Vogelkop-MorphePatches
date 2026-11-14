package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class ou1 extends iph {
    public final /* synthetic */ byte a;
    public int b;

    public /* synthetic */ ou1(byte b, int i) {
        this.a = b;
        this.b = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, vph vphVar) {
        int iS;
        switch (this.a) {
            case 0:
                if (recyclerView.T(view).getBindingAdapterPosition() != 0) {
                    boolean zW = cs5.W(recyclerView);
                    int i = this.b;
                    if (!zW) {
                        rect.left = i;
                        break;
                    } else {
                        rect.right = i;
                        break;
                    }
                } else {
                    rect.setEmpty();
                    break;
                }
            case 1:
                int i2 = this.b;
                rect.left = i2 / 2;
                rect.right = i2 / 2;
                break;
            case 2:
                int i3 = RecyclerView.S(view) == 0 ? 0 : this.b;
                if (!cs5.W(recyclerView)) {
                    rect.left = i3;
                    break;
                } else {
                    rect.right = i3;
                    break;
                }
            case 3:
                int i4 = this.b;
                rect.right = i4 / 2;
                rect.left = i4 / 2;
                break;
            default:
                GridLayoutManager gridLayoutManager = recyclerView.n;
                GridLayoutManager gridLayoutManager2 = gridLayoutManager instanceof GridLayoutManager ? gridLayoutManager : null;
                if (gridLayoutManager2 != null && (iS = RecyclerView.S(view)) != -1) {
                    int i5 = gridLayoutManager2.b;
                    tx7 tx7Var = gridLayoutManager2.g;
                    if (tx7Var.d(iS, i5) < tx7Var.d(vphVar.b() - 1, i5)) {
                        rect.bottom = this.b;
                        break;
                    }
                }
                break;
        }
    }
}

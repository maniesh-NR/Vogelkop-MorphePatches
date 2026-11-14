package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.e;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class z6b extends oph {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public Object c;

    public z6b(LinearLayoutManager linearLayoutManager, nw8 nw8Var) {
        this.b = linearLayoutManager;
        this.c = nw8Var;
    }

    public z6b(Function0 function0) {
        this.b = function0;
    }

    public z6b(ldd lddVar, e eVar) {
        this.c = lddVar;
        this.b = eVar;
    }

    @Override // defpackage.oph
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        nxf nxfVar;
        int iS;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                e eVar = (e) obj;
                ldd lddVar = (ldd) this.c;
                if (i == 0 && (nxfVar = lddVar.o) != null) {
                    View viewFindSnapView = nxfVar.findSnapView((LinearLayoutManager) lddVar.h.n);
                    if (viewFindSnapView != null && (iS = RecyclerView.S(viewFindSnapView)) != -1) {
                        lddVar.d = eVar.G(iS);
                        lddVar.m.setText(eVar.G(iS).c());
                        lddVar.l0(iS);
                    }
                    lddVar.k0();
                    break;
                }
                break;
            case 2:
                Integer num = (Integer) this.c;
                if ((num == null || i != num.intValue()) && i == 1) {
                    ((Function0) obj).invoke();
                }
                this.c = Integer.valueOf(i);
                break;
        }
    }

    @Override // defpackage.oph
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) obj;
                if (i2 > 0) {
                    int itemCount = linearLayoutManager.getItemCount();
                    int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    int iMax = itemCount / 2;
                    if (25 <= iMax) {
                        iMax = Math.max(25, itemCount - 25);
                    }
                    if (iFindLastVisibleItemPosition >= iMax) {
                        recyclerView.post((nw8) this.c);
                        break;
                    }
                }
                break;
            case 1:
                e eVar = (e) obj;
                ldd lddVar = (ldd) this.c;
                RecyclerView recyclerView2 = lddVar.h;
                int iFindFirstVisibleItemPosition = i < 0 ? ((LinearLayoutManager) recyclerView2.n).findFirstVisibleItemPosition() : ((LinearLayoutManager) recyclerView2.n).findLastVisibleItemPosition();
                if (lddVar.o == null) {
                    lddVar.d = eVar.G(iFindFirstVisibleItemPosition);
                }
                lddVar.m.setText(eVar.G(iFindFirstVisibleItemPosition).c());
                lddVar.l0(iFindFirstVisibleItemPosition);
                break;
        }
    }
}

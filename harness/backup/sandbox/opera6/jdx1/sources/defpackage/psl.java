package defpackage;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class psl implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ psl(Toolbar toolbar, byte b) {
        this.a = b;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Toolbar toolbar = this.b;
        switch (b) {
            case 0:
                qsl qslVar = toolbar.L;
                ptd ptdVar = qslVar == null ? null : qslVar.b;
                if (ptdVar != null) {
                    ptdVar.collapseActionView();
                    break;
                }
                break;
            default:
                ArrayList arrayList = toolbar.G;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    toolbar.o().removeItem(((MenuItem) obj).getItemId());
                }
                itd itdVarO = toolbar.o();
                ArrayList arrayListM = toolbar.m();
                ntd ntdVar = toolbar.F;
                lsk lskVar = new lsk(toolbar.getContext());
                Iterator it = ntdVar.b.iterator();
                while (it.hasNext()) {
                    ((mud) it.next()).d(itdVarO, lskVar);
                }
                ArrayList arrayListM2 = toolbar.m();
                arrayListM2.removeAll(arrayListM);
                toolbar.G = arrayListM2;
                break;
        }
    }
}

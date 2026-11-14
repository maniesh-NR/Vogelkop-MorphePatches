package defpackage;

import android.view.MenuItem;
import com.google.android.material.chip.ChipGroup;
import com.opera.android.history.f;
import com.opera.android.history.g;
import com.opera.android.ui.catalog.widget.OperaChip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class bda implements vx4, xsi, lkm {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dda b;

    public /* synthetic */ bda(dda ddaVar, byte b) {
        this.a = b;
        this.b = ddaVar;
    }

    public final void R(ArrayList arrayList) {
        byte b = this.a;
        int i = 0;
        dda ddaVar = this.b;
        switch (b) {
            case 2:
                ztn ztnVar = ddaVar.A;
                ztn ztnVar2 = ztnVar != null ? ztnVar : null;
                List listK0 = CollectionsKt.k0(arrayList);
                ztnVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = listK0.iterator();
                while (it.hasNext()) {
                    long jLongValue = ((Number) it.next()).longValue();
                    ztnVar2.f.remove(Long.valueOf(jLongValue));
                    g gVar = (g) ((LinkedHashMap) ztnVar2.g.b).get(Long.valueOf(jLongValue));
                    if (gVar != null) {
                        arrayList2.add(gVar.a);
                    }
                }
                f fVarL0 = ((dda) ztnVar2.c.b).L0();
                fVarL0.getClass();
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    fVarL0.f.k.remove((zda) obj);
                }
                break;
            default:
                jy0 jy0Var = ddaVar.C;
                jy0 jy0Var2 = jy0Var != null ? jy0Var : null;
                List listK02 = CollectionsKt.k0(arrayList);
                jy0Var2.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = listK02.iterator();
                while (it2.hasNext()) {
                    long jLongValue2 = ((Number) it2.next()).longValue();
                    jy0Var2.e.remove(Long.valueOf(jLongValue2));
                    gy0 gy0Var = (gy0) ((LinkedHashMap) jy0Var2.f.b).get(Long.valueOf(jLongValue2));
                    if (gy0Var != null) {
                        arrayList3.add(gy0Var.a);
                    }
                }
                f fVarL02 = ((dda) jy0Var2.b.a).L0();
                fVarL02.getClass();
                int size2 = arrayList3.size();
                while (i < size2) {
                    Object obj2 = arrayList3.get(i);
                    i++;
                    fVarL02.f.k.remove((zda) obj2);
                }
                break;
        }
    }

    public final void a(ChipGroup chipGroup) {
        int iE = chipGroup.h.e();
        dda ddaVar = this.b;
        ei eiVar = ddaVar.y;
        if (eiVar == null) {
            eiVar = null;
        }
        if (iE == ((OperaChip) eiVar.g).getId()) {
            ddaVar.L0().i(aea.a);
            return;
        }
        ei eiVar2 = ddaVar.y;
        if (iE == ((OperaChip) (eiVar2 != null ? eiVar2 : null).d).getId()) {
            ddaVar.L0().i(aea.b);
        }
    }

    @Override // defpackage.xsi
    public final void b(MenuItem menuItem, boolean z) {
        this.b.N0(menuItem, z);
    }
}

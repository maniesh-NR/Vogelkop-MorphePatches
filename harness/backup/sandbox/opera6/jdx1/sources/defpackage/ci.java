package defpackage;

import android.view.ActionMode;
import android.view.View;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ci implements ub7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ci(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.ub7
    public final void dispose() {
        switch (this.a) {
            case 0:
                yh yhVar = ((uh) this.b).a;
                if (yhVar != null) {
                    yhVar.b();
                    return;
                } else {
                    qp2.n("Launcher has not been initialized");
                    return;
                }
            case 1:
                g87 g87Var = (g87) this.b;
                g87Var.dismiss();
                g87Var.h.e();
                return;
            case 2:
                aog aogVar = (aog) this.b;
                aogVar.e();
                aogVar.setTag(2131365017, null);
                aogVar.m.removeViewImmediate(aogVar);
                return;
            case 3:
                eb1 eb1Var = (eb1) this.b;
                tuj tujVar = eb1Var.e;
                txi txiVar = (txi) tujVar.j;
                if (txiVar != null) {
                    txiVar.d();
                }
                tujVar.c();
                ActionMode actionMode = eb1Var.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                eb1Var.h = null;
                return;
            case 4:
                eb3 eb3Var = (eb3) ((fb3) this.b).c.getValue();
                if (eb3Var != null) {
                    eb3Var.close();
                    return;
                }
                return;
            case 5:
                nh4 nh4Var = ((ztl) this.b).c;
                if (nh4Var != null) {
                    nh4Var.d((Throwable) null);
                    return;
                }
                return;
            case 6:
                ((k24) ((rn9) this.b).c).j0((btj) null);
                return;
            case 7:
                ((dil) this.b).m();
                return;
            case 8:
                bk8 bk8Var = (bk8) this.b;
                View view = bk8Var.b;
                if (bk8Var.a) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(bk8Var);
                    bk8Var.a = false;
                }
                view.removeOnAttachStateChangeListener(bk8Var);
                return;
            case 9:
                ((i5c) this.b).d = null;
                return;
            case 10:
                u5c u5cVar = (u5c) this.b;
                tn tnVar = u5cVar.c;
                if (tnVar != null) {
                    tnVar.a = false;
                }
                u5cVar.c = null;
                return;
            case 11:
                q5c q5cVar = (q5c) this.b;
                q5cVar.f = true;
                q5cVar.d = 0;
                q5cVar.c();
                return;
            case 12:
                w6e w6eVar = (w6e) this.b;
                w6eVar.dismiss();
                w6eVar.i.e();
                return;
            case 13:
                o93 o93Var = ((xg5) this.b).b;
                if (o93Var != null) {
                    o93Var.b(hjm.b, 3);
                    return;
                }
                return;
            case 14:
                z0c z0cVar = (z0c) this.b;
                tn tnVar2 = (tn) z0cVar.b;
                gb1 gb1Var = (gb1) z0cVar.c;
                synchronized (((j06) tnVar2.b)) {
                    n08 linkedHashMap = new LinkedHashMap((Map) tnVar2.d);
                    linkedHashMap.remove(gb1Var);
                    int size = linkedHashMap.size();
                    if (size == 0) {
                        linkedHashMap = n08.a;
                    } else if (size == 1) {
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        linkedHashMap = Collections.singletonMap(entry.getKey(), entry.getValue());
                    }
                    tnVar2.d = linkedHashMap;
                }
                return;
            default:
                kxn kxnVar = (kxn) this.b;
                if (kxnVar != null) {
                    kxnVar.a.a.clear();
                    return;
                }
                return;
        }
    }
}

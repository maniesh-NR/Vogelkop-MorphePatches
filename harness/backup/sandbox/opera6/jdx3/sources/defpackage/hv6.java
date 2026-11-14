package defpackage;

import android.app.Dialog;
import android.view.View;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final /* synthetic */ class hv6 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hv6(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ hv6(boolean z, r4i r4iVar, q4i q4iVar) {
        this.a = (byte) 1;
        this.b = z;
        this.c = r4iVar;
        this.d = q4iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.d;
        boolean z = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                l6e l6eVar = (l6e) obj;
                iv6 iv6Var = (iv6) ((d5o) obj2).c;
                if (!z) {
                    iv6Var.d.k(l6eVar);
                    r9g r9gVar = iv6Var.f;
                    if (r9gVar != null) {
                        long j = l6eVar.b;
                        psi psiVar = (psi) r9gVar.b;
                        q6e q6eVar = psiVar.c;
                        q6eVar.o(q6eVar.c(j));
                        psiVar.l.i(Unit.a);
                    }
                }
                iv6Var.b();
                break;
            case 1:
                r4i r4iVar = (r4i) obj2;
                q4i q4iVar = (q4i) obj;
                if (!z) {
                    r4iVar.c = s4i.c;
                    Dialog dialog = r4iVar.getDialog();
                    if (dialog != null) {
                        dialog.dismiss();
                        break;
                    }
                } else {
                    pt1 pt1Var = r4iVar.i;
                    mt5 mt5Var = null;
                    if (pt1Var == null) {
                        pt1Var = null;
                    }
                    ((OperaMaterialButton) pt1Var.b).R(true);
                    na2.B(cqp.V(r4iVar.getLifecycle()), (CoroutineContext) null, (rx5) null, new p71(q4iVar, r4iVar, mt5Var, (byte) 22), 3);
                    break;
                }
                break;
            default:
                qwf qwfVar = (qwf) obj;
                vxi vxiVar = (vxi) ((p8f) obj2).d;
                if (!z) {
                    swf swfVar = (swf) vxiVar.e;
                    ArrayList arrayListA = swfVar.a();
                    i7f i7fVar = swfVar.g;
                    HashSet hashSet = swfVar.f;
                    if (hashSet.remove((qwf) arrayListA.get(0))) {
                        g7f g7fVarC = u35.c(i7fVar, i7fVar);
                        while (g7fVarC.hasNext()) {
                            ((rwf) g7fVarC.next()).a(false);
                        }
                    }
                    if (hashSet.add(qwfVar)) {
                        g7f g7fVarC2 = u35.c(i7fVar, i7fVar);
                        while (g7fVarC2.hasNext()) {
                            ((rwf) g7fVarC2.next()).a(true);
                        }
                    }
                    ((qp2) vxiVar.d).getClass();
                }
                vxiVar.b();
                break;
        }
    }
}

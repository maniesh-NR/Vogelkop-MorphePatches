package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.i;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rs1 extends i implements View.OnClickListener {
    public final ot1 b;
    public qs1 c;
    public final /* synthetic */ ss1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs1(ss1 ss1Var, ot1 ot1Var) {
        super(ot1Var);
        this.d = ss1Var;
        this.b = ot1Var;
        ot1Var.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ss1 ss1Var = this.d;
        int i = ss1Var.b;
        qs1 qs1Var = this.c;
        Object obj = null;
        if (i != (qs1Var == null ? null : qs1Var).a) {
            boolean z = (qs1Var == null ? null : qs1Var).c && !ss1Var.c;
            ndc ndcVar = (ts1) ss1Var.d.a;
            qs1 qs1Var2 = qs1Var == null ? null : qs1Var;
            at1 at1Var = (at1) ndcVar.r.getValue();
            Context contextRequireContext = ndcVar.requireContext();
            at1Var.getClass();
            d7j d7jVarD = d7j.d(qs1Var2.a);
            at1Var.k(d7jVarD, false, at1Var.q);
            if (at1Var.l.g() != m18.b) {
                if (z) {
                    at1Var.e.c(new lt1(), ndcVar, new ug(new f9((Object) at1Var, (Object) d7jVarD, (Object) contextRequireContext, (byte) 5), (byte) 2));
                    return;
                } else {
                    at1Var.g(contextRequireContext, ndcVar, qs1Var2);
                    return;
                }
            }
            if (!qs1Var2.d) {
                at1Var.g(contextRequireContext, ndcVar, qs1Var2);
                return;
            }
            Iterator it = ((Iterable) at1Var.m.h.g()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.a(((k15) next).a, String.valueOf(qs1Var2.a))) {
                    obj = next;
                    break;
                }
            }
            k15 k15Var = (k15) obj;
            if (k15Var == null) {
                return;
            }
            at1Var.n.b(ndcVar, o3i.APP_ICON, k15Var, q4i.b, new xs1(at1Var, contextRequireContext, ndcVar, qs1Var2, (byte) 1));
        }
    }
}

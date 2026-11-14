package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class csm extends kuk implements Function1 {
    public boolean t;
    public final /* synthetic */ ism u;
    public final /* synthetic */ ArrayList v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csm(ism ismVar, ArrayList arrayList, int i, int i2, int i3, mt5 mt5Var) {
        super(1, mt5Var);
        this.u = ismVar;
        this.v = arrayList;
        this.w = i;
        this.x = i2;
        this.y = i3;
    }

    public final mt5 create(mt5 mt5Var) {
        return new csm(this.u, this.v, this.w, this.x, this.y, mt5Var);
    }

    public final Object invoke(Object obj) {
        return create((mt5) obj).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        ism ismVar;
        px5 px5Var = px5.a;
        boolean z = this.t;
        if (!z) {
            ybh.y(obj);
            cd5 cd5Var = ism.l;
            ArrayList arrayList = this.v;
            int size = arrayList.size();
            int i = 0;
            loop0: while (true) {
                ismVar = this.u;
                if (i >= size) {
                    break;
                }
                Object obj2 = arrayList.get(i);
                i++;
                ai4 ai4Var = (ai4) obj2;
                if (Collections.unmodifiableList(ai4Var.a).isEmpty()) {
                    break;
                }
                Iterator it = Collections.unmodifiableList(ai4Var.a).iterator();
                while (it.hasNext()) {
                    if (((Map) ismVar.c.f.getValue()).get((g07) it.next()) == null) {
                        break loop0;
                    }
                }
            }
            ism.n(arrayList.size(), "Capture request failed due to invalid surface");
            bsm bsmVarO = ism.o(ismVar.k);
            ni4 ni4Var = (ni4) ismVar.h.getValue();
            int i2 = bsmVarO.d.a;
            eb4 eb4VarB = bsmVarO.a.b();
            this.t = true;
            obj = ni4Var.a(arrayList, i2, eb4VarB, this.w, this.x, this.y, this);
            if (obj == px5Var) {
                return px5Var;
            }
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ybh.y(obj);
        }
        return (List) obj;
    }
}

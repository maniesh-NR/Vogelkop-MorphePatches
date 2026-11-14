package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class fsm extends kuk implements Function1 {
    public final /* synthetic */ List A;
    public List t;
    public List u;
    public List v;
    public boolean w;
    public final /* synthetic */ ism x;
    public final /* synthetic */ List y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsm(ism ismVar, List list, List list2, List list3, mt5 mt5Var) {
        super(1, mt5Var);
        this.x = ismVar;
        this.y = list;
        this.z = list2;
        this.A = list3;
    }

    public final mt5 create(mt5 mt5Var) {
        return new fsm(this.x, this.y, this.z, this.A, mt5Var);
    }

    public final Object invoke(Object obj) {
        return create((mt5) obj).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        List listAsList;
        List listAsList2;
        List listAsList3;
        px5 px5Var = px5.a;
        boolean z = this.w;
        try {
            if (!z) {
                ybh.y(obj);
                ism ismVar = this.x;
                List list = this.y;
                List list2 = this.z;
                List list3 = this.A;
                nd4 nd4VarA = ismVar.c.a();
                this.t = list;
                this.u = list2;
                this.v = list3;
                this.w = true;
                obj = nd4VarA.k(this);
                if (obj == px5Var) {
                    return px5Var;
                }
                listAsList = list;
                listAsList2 = list2;
                listAsList3 = list3;
            } else {
                if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                listAsList3 = this.v;
                listAsList2 = this.u;
                listAsList = this.t;
                ybh.y(obj);
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            try {
                qd4 qd4Var = (qd4) autoCloseable;
                if (listAsList == null) {
                    listAsList = Arrays.asList(gd4.a);
                }
                List list4 = listAsList;
                if (listAsList2 == null) {
                    listAsList2 = Arrays.asList(gd4.a);
                }
                List list5 = listAsList2;
                if (listAsList3 == null) {
                    listAsList3 = Arrays.asList(gd4.a);
                }
                h07 h07VarH = sc4.h(qd4Var, null, null, null, list4, list5, listAsList3, 7);
                fr3.t(autoCloseable, null);
                return h07VarH;
            } finally {
            }
        } catch (CancellationException unused) {
            return ism.l;
        }
    }
}

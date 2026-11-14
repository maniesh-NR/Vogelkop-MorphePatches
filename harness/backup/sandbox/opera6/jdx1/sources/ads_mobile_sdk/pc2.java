package ads_mobile_sdk;

import defpackage.ybh;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class pc2 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ sc2 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ n13 d;
    public final /* synthetic */ a2 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc2(sc2 sc2Var, ArrayList arrayList, n13 n13Var, a2 a2Var, int i, String str, mt5 mt5Var) {
        super(2, mt5Var);
        this.b = sc2Var;
        this.c = arrayList;
        this.d = n13Var;
        this.e = a2Var;
        this.f = i;
        this.g = str;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new pc2(this.b, this.c, this.d, this.e, this.f, this.g, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objA;
        px5 px5Var = px5.a;
        boolean z = this.a;
        n13 n13Var = this.d;
        sc2 sc2Var = this.b;
        if (!z) {
            ybh.y(obj);
            zm1 zm1Var = sc2Var.h;
            Integer num = new Integer(this.f);
            pn7.b.getClass();
            pn7 pn7Var = new pn7(0L);
            this.a = true;
            objA = zm1.a(zm1Var, this.c, n13Var, this.e, num, this.g, pn7Var, null, null, null, null, this, 960);
            if (objA == px5Var) {
                return px5Var;
            }
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ybh.y(obj);
            objA = obj;
        }
        List list = (List) objA;
        tv2 tv2Var = sc2Var.i;
        a2 a2Var = this.e;
        if (a2Var != null) {
            tv2.a(tv2Var, list, a2Var, n13Var.b.b, null, null, 56);
        } else {
            tv2Var.a(list);
        }
        return Unit.a;
    }
}

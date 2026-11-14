package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class frl implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ frl(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ frl(String str, c8e c8eVar, erl erlVar, int i) {
        this.a = (byte) 0;
        this.b = str;
        this.c = c8eVar;
        this.d = erlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object[] objArr = 0;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                t0h.c((String) obj5, (c8e) obj4, (erl) obj3, (ih5) obj, aoh.m(1));
                break;
            case 1:
                myn mynVar = (myn) obj5;
                Function0 function0 = (Function0) obj4;
                ayn aynVar = (ayn) obj3;
                ih5 ih5Var = (ih5) obj;
                int iIntValue = ((Integer) obj2).intValue();
                vt9 vt9Var = (vt9) ih5Var;
                if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    na2.c(gyg.P(-2008169392, new nqi(mynVar, (byte) 19), vt9Var), gyg.P(-1208594863, new is1(function0, (byte) 14), vt9Var), null, gyg.P(30420475, new b57((Object) mynVar, (Object) aynVar, (byte) 21), vt9Var), vt9Var, 3126, 4);
                } else {
                    vt9Var.Q();
                }
                break;
            default:
                w7o w7oVar = (w7o) obj5;
                fh5 fh5Var = (fh5) obj4;
                ue5 ue5Var = (ue5) obj3;
                ih5 ih5Var2 = (ih5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vt9 vt9Var2 = (vt9) ih5Var2;
                if (vt9Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    v31 v31Var = w7oVar.a;
                    boolean zH = vt9Var2.h(w7oVar);
                    Object objK = vt9Var2.K();
                    mt5 mt5Var = null;
                    zpa zpaVar = hh5.a;
                    if (zH || objK == zpaVar) {
                        objK = new v7o(w7oVar, mt5Var, objArr == true ? 1 : 0);
                        vt9Var2.g0(objK);
                    }
                    rm5.e(vt9Var2, v31Var, (Function2) objK);
                    boolean zH2 = vt9Var2.h(w7oVar);
                    Object objK2 = vt9Var2.K();
                    if (zH2 || objK2 == zpaVar) {
                        objK2 = new v7o(w7oVar, mt5Var, b2);
                        vt9Var2.g0(objK2);
                    }
                    rm5.e(vt9Var2, v31Var, (Function2) objK2);
                    fh5Var.a(v31Var, ue5Var, vt9Var2, 0);
                } else {
                    vt9Var2.Q();
                }
                break;
        }
        return Unit.a;
    }
}

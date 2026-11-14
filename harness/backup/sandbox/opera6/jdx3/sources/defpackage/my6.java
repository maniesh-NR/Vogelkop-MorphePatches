package defpackage;

import java.util.List;
import java.util.TreeSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class my6 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ List v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my6(List list, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = list;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                my6 my6Var = new my6(this.v, mt5Var, (byte) 0);
                my6Var.u = obj;
                return my6Var;
            default:
                my6 my6Var2 = new my6(this.v, mt5Var, (byte) 1);
                my6Var2.u = obj;
                return my6Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((fon) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        String q0iVar;
        byte b = this.t;
        List list = this.v;
        switch (b) {
            case 0:
                fon fonVar = (fon) this.u;
                px5 px5Var = px5.a;
                ybh.y(obj);
                eon eonVar = (eon) fonVar.toBuilder();
                eonVar.copyOnWrite();
                ((fon) ((a) eonVar).instance).c();
                eonVar.copyOnWrite();
                ((fon) ((a) eonVar).instance).b(list);
                return eonVar.build();
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                try {
                    p0i p0iVar = t0i.b;
                    if (list != null) {
                        TreeSet treeSet = jko.a;
                        rpb rpbVarD = fcp.d();
                        rpbVarD.getClass();
                        q0iVar = rpbVarD.b(list, new k72(txo.Companion.serializer(), (byte) 0));
                    } else {
                        q0iVar = null;
                    }
                } catch (Throwable th) {
                    p0i p0iVar2 = t0i.b;
                    q0iVar = new q0i(th);
                }
                return new t0i(q0iVar);
        }
    }
}

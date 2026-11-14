package defpackage;

import ads_mobile_sdk.yz;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class sto extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sto(yz yzVar, prb prbVar, mt5 mt5Var, boolean z) {
        super(2, mt5Var);
        this.t = (byte) 10;
        this.w = prbVar;
        this.u = z;
        this.x = yzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sto(Object obj, Object obj2, Object obj3, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sto(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = obj;
        this.x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sto(String str, Object obj, mt5 mt5Var, Object obj2, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = str;
        this.v = obj;
        this.x = obj2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.x;
        Object obj3 = this.w;
        switch (b) {
            case 0:
                sto stoVar = new sto(obj3, obj2, mt5Var, (byte) 0);
                stoVar.v = obj;
                return stoVar;
            case 1:
                return new sto(this.v, obj3, obj2, mt5Var, (byte) 1);
            case 2:
                return new sto((String) obj3, this.v, mt5Var, obj2, (byte) 2);
            case 3:
                return new sto((String) obj3, this.v, mt5Var, obj2, (byte) 3);
            case 4:
                return new sto(this.v, obj3, obj2, mt5Var, (byte) 4);
            case 5:
                return new sto((String) obj3, this.v, mt5Var, obj2, (byte) 5);
            case 6:
                return new sto(this.v, obj3, obj2, mt5Var, (byte) 6);
            case 7:
                return new sto(this.v, obj3, obj2, mt5Var, (byte) 7);
            case 8:
                return new sto(this.v, obj3, obj2, mt5Var, (byte) 8);
            case 9:
                return new sto(this.v, obj3, obj2, mt5Var, (byte) 9);
            case 10:
                sto stoVar2 = new sto((yz) obj2, (prb) obj3, mt5Var, this.u);
                stoVar2.v = obj;
                return stoVar2;
            case 11:
                return new sto((String) obj3, this.v, mt5Var, obj2, (byte) 11);
            case 12:
                return new sto(this.v, obj3, obj2, mt5Var, (byte) 12);
            case 13:
                return new sto(this.v, obj3, obj2, mt5Var, (byte) 13);
            default:
                sto stoVar3 = new sto(obj3, obj2, mt5Var, (byte) 14);
                stoVar3.v = obj;
                return stoVar3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sto.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

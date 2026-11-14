package defpackage;

import com.opera.android.BrowserActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ww3 extends kuk implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte t;
    public boolean u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww3(ece eceVar, String str, dwn dwnVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 3;
        this.z = eceVar;
        this.A = str;
        this.B = dwnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ww3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
        this.z = obj5;
        this.A = obj6;
        this.B = obj7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww3(tcc tccVar, qcc qccVar, nx5 nx5Var, Function2 function2, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 4;
        this.y = tccVar;
        this.z = qccVar;
        this.A = nx5Var;
        this.B = function2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.z;
        Object obj3 = this.B;
        Object obj4 = this.A;
        switch (b) {
            case 0:
                return new ww3((BrowserActivity) this.v, (g89) this.w, (qt3) this.x, (qt3) this.y, (ut3) obj2, (qt3) obj4, (qt3) obj3, mt5Var, (byte) 0);
            case 1:
                return new ww3((n38) this.v, (pqh) this.w, (pqh) this.x, (bza) this.y, this.z, (pqh) obj4, (y55) obj3, mt5Var, (byte) 1);
            case 2:
                return new ww3((n38) this.v, (bza) this.w, this.x, (vrf) this.y, (y55) obj2, (wsd) obj4, (bl9) obj3, mt5Var, (byte) 2);
            case 3:
                return new ww3((ece) obj2, (String) obj4, (dwn) obj3, mt5Var);
            default:
                return new ww3((tcc) this.y, (qcc) obj2, (nx5) obj4, (Function2) obj3, mt5Var);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

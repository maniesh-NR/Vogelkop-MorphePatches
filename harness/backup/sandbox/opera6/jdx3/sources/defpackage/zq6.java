package defpackage;

import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class zq6 extends kuk implements er9 {
    public /* synthetic */ List t;
    public /* synthetic */ gxc u;
    public /* synthetic */ cel v;
    public /* synthetic */ yxc w;

    public final Object invokeSuspend(Object obj) {
        wla wlaVar;
        ola olaVar;
        List list = this.t;
        gxc gxcVar = this.u;
        cel celVar = this.v;
        yxc yxcVar = this.w;
        px5 px5Var = px5.a;
        ybh.y(obj);
        cum ftjVar = gxcVar == null ? new ftj((byte) 7) : new pq4(gxcVar.a, gxcVar.b);
        int iOrdinal = celVar.ordinal();
        ola olaVar2 = null;
        if (iOrdinal == 0) {
            wlaVar = wla.CELSIUS;
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                return null;
            }
            wlaVar = wla.FAHRENHEIT;
        }
        if (yxcVar != null) {
            int iOrdinal2 = yxcVar.ordinal();
            if (iOrdinal2 == 0) {
                olaVar = ola.AUTO;
            } else {
                if (iOrdinal2 != 1) {
                    h9o.p();
                    return null;
                }
                olaVar = ola.MANUAL;
            }
            olaVar2 = olaVar;
        }
        return new vq6(list, ftjVar, wlaVar, olaVar2);
    }

    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        zq6 zq6Var = new zq6(5, (mt5) obj5);
        zq6Var.t = (List) obj;
        zq6Var.u = (gxc) obj2;
        zq6Var.v = (cel) obj3;
        zq6Var.w = (yxc) obj4;
        return zq6Var.invokeSuspend(Unit.a);
    }
}

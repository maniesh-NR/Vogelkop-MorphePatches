package defpackage;

import ads_mobile_sdk.gv2;
import ads_mobile_sdk.jk;
import ads_mobile_sdk.li3;
import ads_mobile_sdk.ws;
import ads_mobile_sdk.y31;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class uf4 extends kuk implements Function1 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uf4(byte b, mt5 mt5Var, Object obj) {
        super(1, mt5Var);
        this.t = b;
        this.u = obj;
    }

    public final mt5 create(mt5 mt5Var) {
        byte b = this.t;
        Object obj = this.u;
        switch (b) {
            case 0:
                return new uf4((byte) 0, mt5Var, (pqh) obj);
            case 1:
                return new uf4((byte) 1, mt5Var, (dk4) obj);
            case 2:
                return new uf4((byte) 2, mt5Var, (li3) obj);
            case 3:
                return new uf4((byte) 3, mt5Var, (pzh) obj);
            default:
                return new uf4((byte) 4, mt5Var, (ws) obj);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.t;
        Object obj2 = this.u;
        switch (b) {
            case 0:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 1:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 2:
                return new uf4((byte) 2, (mt5) obj, (li3) obj2).invokeSuspend(Unit.a);
            case 3:
                return new uf4((byte) 3, (mt5) obj, (pzh) obj2).invokeSuspend(Unit.a);
            default:
                return new uf4((byte) 4, (mt5) obj, (ws) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) throws InterruptedException {
        y31 y31Var;
        byte[] bArrBytes;
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                ((pqh) this.u).a = null;
                return new agf(null, new yc4(13), 1);
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                ((dk4) this.u).x.await();
                return Unit.a;
            case 2:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                li3 li3Var = (li3) this.u;
                jk jkVar = li3Var.o;
                Set set = li3Var.p;
                String strM = li3Var.f.a.a.m();
                synchronized (jkVar.g) {
                    int i = jkVar.h;
                    jkVar.h = i + 1;
                    if (set.isEmpty()) {
                        y31Var = new y31(Integer.valueOf(i), null, null);
                    } else {
                        String strP = CollectionsKt.P(CollectionsKt.b0(set), ",", (CharSequence) null, (String) null, 0, (Function1) null, 62);
                        Integer num = (Integer) jkVar.i.get(strP);
                        int iIntValue = num != null ? num.intValue() : 0;
                        jkVar.i.put(strP, Integer.valueOf(iIntValue + 1));
                        if (strM == null) {
                            y31Var = new y31(Integer.valueOf(i), Integer.valueOf(iIntValue), null);
                        } else {
                            String str = strM + "|" + strP;
                            Integer num2 = (Integer) jkVar.j.get(str);
                            int iIntValue2 = num2 != null ? num2.intValue() : 0;
                            jkVar.j.put(str, Integer.valueOf(iIntValue2 + 1));
                            y31Var = new y31(Integer.valueOf(i), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                        }
                    }
                }
                return y31Var;
            case 3:
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                vzh vzhVar = ((pzh) this.u).g;
                if (vzhVar == null || (bArrBytes = vzhVar.bytes()) == null) {
                    bArrBytes = new byte[0];
                }
                return new gv2(bArrBytes);
            default:
                px5 px5Var5 = px5.a;
                ybh.y(obj);
                return ws.a((ws) this.u);
        }
    }
}

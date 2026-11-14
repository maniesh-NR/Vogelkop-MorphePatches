package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class ivd implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public /* synthetic */ ivd(String str, long j, byte b) {
        this.a = b;
        this.b = str;
        this.c = j;
    }

    public final Object invoke(Object obj) throws Exception {
        if0 if0Var;
        byte b = this.a;
        byte b2 = 2;
        long j = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                wsk wskVarH = ((osk) obj).h("UPDATE messages SET local_content = ? WHERE id = ?");
                try {
                    if (str == null) {
                        wskVarH.j1(1);
                    } else {
                        wskVarH.h(1, str);
                    }
                    wskVarH.T0(2, j);
                    wskVarH.n();
                    wskVarH.close();
                    return null;
                } catch (Throwable th) {
                    wskVarH.close();
                    throw th;
                }
            case 1:
                ((x60) obj).a(str, new x41(j, (byte) 14));
                return Unit.a;
            case 2:
                ld0 ld0Var = (ld0) obj;
                int iHashCode = str.hashCode();
                if (iHashCode != 196489212) {
                    if (iHashCode != 221996398) {
                        if (iHashCode == 424487059 && str.equals("latest_purchase_time")) {
                            ld0Var.b.p(3, 1, j);
                        }
                    } else if (str.equals("latest_free_offer_claim_time")) {
                        ld0Var.b.p(7, 1, j);
                    }
                } else if (str.equals("first_purchase_time")) {
                    ld0Var.b.p(2, 1, j);
                }
                return Unit.a;
            case 3:
                ((x60) obj).a(str, new x41(j, (byte) 16));
                return Unit.a;
            case 4:
                ((x60) obj).a(str, new x41(j, (byte) 15));
                return Unit.a;
            case 5:
                new ivd(str, j, b2).invoke((ld0) ((nd0) obj).c.getValue());
                return Unit.a;
            default:
                zj0 zj0Var = (zj0) obj;
                y55 y55Var = zj0Var.a;
                r56 r56Var = new r56(2188, -1, 2);
                u56 u56Var = zj0Var.b;
                Map map = (Map) u56Var.n(10);
                if (map == null || map.isEmpty()) {
                    HashMap map2 = new HashMap();
                    u56Var.q(10, 1, map2);
                    if0Var = new if0(u56Var, 10, map2);
                } else {
                    if0Var = new if0(u56Var, 10, map);
                }
                if0Var.put(str, r56Var);
                r56Var.p(0, 1, 1L);
                r56Var.p(1, 1, j);
                return Unit.a;
        }
    }
}

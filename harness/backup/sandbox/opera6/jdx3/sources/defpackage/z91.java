package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class z91 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ z91(int i, vd0 vd0Var) {
        this.a = (byte) 4;
        this.b = i;
        this.c = vd0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ z91(Serializable serializable, int i, byte b) {
        this.a = b;
        this.c = serializable;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        if0 if0Var;
        byte b = this.a;
        Object obj2 = this.c;
        byte b2 = this.b;
        switch (b) {
            case 0:
                byte[] bArr = (byte[]) obj2;
                rsk rskVar = (rsk) obj;
                int i = b2 + 1;
                if (bArr == null) {
                    rskVar.j1(i);
                } else {
                    rskVar.Z0(i, bArr);
                }
                return Unit.a;
            case 1:
                String str = (String) obj2;
                rsk rskVar2 = (rsk) obj;
                int i2 = b2 + 1;
                if (str == null) {
                    rskVar2.j1(i2);
                } else {
                    rskVar2.w(i2, str);
                }
                return Unit.a;
            case 2:
                Long l = (Long) obj2;
                rsk rskVar3 = (rsk) obj;
                int i3 = b2 + 1;
                if (l == null) {
                    rskVar3.j1(i3);
                } else {
                    rskVar3.T0(i3, l.longValue());
                }
                return Unit.a;
            case 3:
                boolean zA1 = ((vg9) obj).a1(b2);
                ((pqh) obj2).a = Boolean.valueOf(zA1);
                return Boolean.valueOf(zA1);
            default:
                un0 un0Var = (un0) ((ck0) obj).e.getValue();
                String strValueOf = String.valueOf((int) b2);
                o5f o5fVar = new o5f((vd0) obj2, (byte) 1);
                un0Var.a.getClass();
                qj0 qj0Var = new qj0(2443, -1, 1);
                sn0 sn0Var = un0Var.b;
                Map map = (Map) sn0Var.n(12);
                if (map == null || map.isEmpty()) {
                    HashMap map2 = new HashMap();
                    sn0Var.q(12, 1, map2);
                    if0Var = new if0(sn0Var, 12, map2);
                } else {
                    if0Var = new if0(sn0Var, 12, map);
                }
                if0Var.put(strValueOf, qj0Var);
                o5fVar.invoke(new rj0(qj0Var));
                return Unit.a;
        }
    }
}

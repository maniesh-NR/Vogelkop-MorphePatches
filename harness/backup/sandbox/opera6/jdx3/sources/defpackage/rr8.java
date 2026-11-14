package defpackage;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class rr8 extends ldk {
    public final k32 j;
    public final vuh k;
    public final HashMap l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr8(umi umiVar, k32 k32Var, vuh vuhVar) {
        super(umiVar);
        r16 r16Var = ngh.a;
        this.l = new HashMap();
        this.j = k32Var;
        this.k = vuhVar;
    }

    @Override // defpackage.ldk
    public final Object a() {
        return (List) kfo.Y(((jqh) this.j.get()).a, true, false, new u4h((byte) 12));
    }

    @Override // defpackage.ldk
    public final void b(Object obj) {
        gqh gqhVar = (gqh) obj;
        k32 k32Var = this.j;
        jqh jqhVar = (jqh) k32Var.get();
        jqhVar.getClass();
        gqhVar.getClass();
        kfo.Y(jqhVar.a, false, true, new vvf(jqhVar, gqhVar, (byte) 13));
        vml.e(new br((Object) this, ((Integer) kfo.Y(((jqh) k32Var.get()).a, true, false, new u4h((byte) 13))).intValue(), (byte) 11));
    }

    @Override // defpackage.ldk
    public final int c() {
        return 2;
    }

    @Override // defpackage.ldk
    public final void d(Object obj) {
        List<gqh> list = (List) obj;
        HashMap map = this.l;
        if (list != null) {
            for (gqh gqhVar : list) {
                if (!map.containsKey(gqhVar.b)) {
                    map.put(gqhVar.b, gqhVar.a);
                }
            }
        }
        vml.e(new br((Object) this, map.size(), (byte) 11));
    }
}

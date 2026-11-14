package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class f5f implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;

    public /* synthetic */ f5f(long j, Function0 function0, boolean z) {
        this.a = (byte) 2;
        this.d = j;
        this.b = function0;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public /* synthetic */ f5f(String str, long j, long j2, byte b) {
        this.a = b;
        this.b = str;
        this.c = (int) j;
        this.d = j2;
    }

    public final Object invoke(Object obj) {
        if0 if0Var;
        byte b = this.a;
        boolean z = this.c;
        long j = this.d;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((ck0) obj).j(new f5f((String) obj2, z ? 1L : 0L, this.d, (byte) 1));
                return Unit.a;
            case 1:
                String str = (String) obj2;
                hi0 hi0Var = (hi0) obj;
                g5f g5fVar = new g5f(z ? 1L : 0L, j);
                hi0Var.a.getClass();
                zd0 zd0Var = new zd0(2443, -1, 2);
                fi0 fi0Var = hi0Var.b;
                Map map = (Map) fi0Var.n(45);
                if (map == null || map.isEmpty()) {
                    HashMap map2 = new HashMap();
                    fi0Var.q(45, 1, map2);
                    if0Var = new if0(fi0Var, 45, map2);
                } else {
                    if0Var = new if0(fi0Var, 45, map);
                }
                if0Var.put(str, zd0Var);
                zd0Var.p(0, 1, g5fVar.a ? 1L : 0L);
                zd0Var.p(1, 1, g5fVar.b);
                return Unit.a;
            default:
                g74 g74Var = (g74) obj;
                return g74Var.a(new ha1((Function0) obj2, this.c, scd.u(g74Var, Float.intBitsToFloat((int) (g74Var.a.e() >> 32)) / 2.0f), new kh3(j, 5), (byte) 0));
        }
    }
}

package ads_mobile_sdk;

import defpackage.iop;
import defpackage.s3p;
import defpackage.ulo;
import defpackage.xzo;
import defpackage.zg;
import java.util.ArrayDeque;
import java.util.Optional;

/* loaded from: classes.dex */
public final class nt3 {
    public final ike a;
    public final gt3 b;
    public final zg c;

    public nt3(ike ikeVar, zg zgVar) {
        int[] iArr = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
        int i = iArr[7] % iArr[8];
        this.a = ikeVar;
        this.c = zgVar;
        this.b = new gt3((byte) 0);
    }

    public final Optional a() throws xzo {
        try {
            try {
                ArrayDeque arrayDeque = this.b.a;
                if (arrayDeque.isEmpty()) {
                    throw new xzo();
                }
                dt3 dt3Var = (dt3) arrayDeque.pop();
                long j = dt3Var.a;
                long j2 = dt3Var.b;
                long j3 = dt3Var.c;
                ike ikeVar = this.a;
                if (ikeVar.b < j2) {
                    return Optional.of(zk2.H);
                }
                this.c.a(j);
                if (j3 == 0) {
                    while (ikeVar.b > j2) {
                        ikeVar.a();
                    }
                }
                return Optional.empty();
            } catch (iop | ulo e) {
                h9o.v(us3.a("CEiv6BFfPnitUE+D"), e);
                return null;
            }
        } catch (s3p unused) {
            return Optional.of(zk2.H);
        } catch (xzo unused2) {
            return Optional.of(zk2.x);
        }
    }
}

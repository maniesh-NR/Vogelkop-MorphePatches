package defpackage;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class nbh {
    public final Context a;
    public final umi b;
    public final orm c;
    public final skm d;
    public final csh e;

    public nbh(Context context, umi umiVar, orm ormVar, skm skmVar) {
        this.a = context;
        this.b = umiVar;
        this.c = ormVar;
        this.d = skmVar;
        zre zreVar = new zre(context);
        p98 p98Var = new p98((byte) 1);
        p98 p98Var2 = new p98((byte) 0);
        a1b a1bVar = h1b.b;
        Object[] objArr = {zreVar, p98Var, p98Var2};
        c09.e(3, objArr);
        this.e = h1b.o(3, objArr);
    }

    public final wbh a(Context context, Bundle bundle, boolean z) {
        int i;
        int i2;
        if (!bundle.containsKey("notification_type")) {
            throw new djb("notification_type");
        }
        int i3 = bundle.getInt("notification_type", -1);
        int[] iArrB = vep.B(5);
        int length = iArrB.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i = 0;
                break;
            }
            i = iArrB[i4];
            if (v0g.f(i) == i3) {
                break;
            }
            i4++;
        }
        s0f wgfVar = null;
        if (i == 0) {
            throw new djb("notification_type", null);
        }
        if (z) {
            int i5 = bundle.getInt("notification_action_type", -1);
            int[] iArrB2 = vep.B(7);
            int length2 = iArrB2.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length2) {
                    i2 = 0;
                    break;
                }
                i2 = iArrB2[i6];
                if (v0g.e(i2) == i5) {
                    break;
                }
                i6++;
            }
            if (i2 != 0) {
                int iA = vep.A(i2);
                if (iA == 0) {
                    wgfVar = new wgf(context, bundle);
                } else if (iA == 5) {
                    wgfVar = new rgf(bundle);
                } else if (iA != 6) {
                    int iA2 = vep.A(i2);
                    umi umiVar = this.b;
                    s0f eijVar = iA2 != 1 ? iA2 != 2 ? iA2 != 4 ? null : new eij(context, umiVar, bundle) : new xhj(bundle) : new vhj(context, umiVar, bundle);
                    if (eijVar == null) {
                        throw new djb("notification_action_type", null);
                    }
                    wgfVar = eijVar;
                } else {
                    wgfVar = new kgf(bundle);
                }
            }
        }
        s0f s0fVar = wgfVar;
        a1b a1bVarU = this.e.u(0);
        while (a1bVarU.hasNext()) {
            xbh xbhVar = (xbh) a1bVarU.next();
            if (xbhVar.a(i)) {
                return xbhVar.b(i, context, this.c, this.d, bundle, s0fVar);
            }
        }
        throw new ejb();
    }
}

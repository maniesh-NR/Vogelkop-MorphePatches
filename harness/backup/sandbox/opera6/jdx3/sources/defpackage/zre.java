package defpackage;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class zre implements xbh {
    public final ua7 a;

    public zre(Context context) {
        this.a = new ua7(context);
    }

    @Override // defpackage.xbh
    public final boolean a(int i) {
        return i == 1 || i == 2 || i == 3;
    }

    @Override // defpackage.xbh
    public final wbh b(int i, Context context, orm ormVar, skm skmVar, Bundle bundle, s0f s0fVar) {
        int iA = vep.A(i);
        ua7 ua7Var = this.a;
        if (iA == 0) {
            return new s82(context, ormVar, skmVar, bundle, s0fVar, ua7Var);
        }
        if (iA == 1) {
            return new qe3(context, ormVar, skmVar, bundle, s0fVar, ua7Var);
        }
        if (iA == 2) {
            return new woc(context, ormVar, skmVar, bundle, s0fVar);
        }
        throw new ejb();
    }
}

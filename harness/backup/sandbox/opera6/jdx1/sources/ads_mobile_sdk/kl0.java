package ads_mobile_sdk;

import defpackage.eyo;
import defpackage.sgb;
import defpackage.tso;
import defpackage.vkp;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class kl0 extends st2 {
    public final i41 k;
    public long l;
    public long m;

    public kl0(tso tsoVar, vkp vkpVar, qr0 qr0Var, eyo eyoVar, i41 i41Var) {
        super(tsoVar, vkpVar, qr0Var, eyoVar);
        this.k = i41Var;
    }

    @Override // ads_mobile_sdk.st2
    public final Object a(kuk kukVar) {
        Object objQ = sgb.q(new jl0(this, null), kukVar);
        return objQ == px5.a ? objQ : Unit.a;
    }
}

package defpackage;

import android.net.Uri;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class dvh extends evh {
    public final bjh f;
    public final lld g;

    public dvh(oj9 oj9Var, h1b h1bVar, jxi jxiVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(oj9Var, h1bVar, jxiVar, arrayList, arrayList2, arrayList3);
        Uri.parse(((oa3) h1bVar.get(0)).a);
        long j = jxiVar.e;
        bjh bjhVar = j <= 0 ? null : new bjh(null, jxiVar.d, j);
        this.f = bjhVar;
        this.g = bjhVar == null ? new lld(new bjh(null, 0L, -1L), (byte) 27) : null;
    }

    @Override // defpackage.evh
    public final String b() {
        return null;
    }

    @Override // defpackage.evh
    public final gb6 c() {
        return this.g;
    }

    @Override // defpackage.evh
    public final bjh d() {
        return this.f;
    }
}

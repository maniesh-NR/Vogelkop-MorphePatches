package defpackage;

import android.content.Context;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class n7l implements o7l {
    public static final crb d = phj.o(rpb.d, new bvk(8));
    public static final bpk e = new bpk(1, 2, (byte) 6);
    public final umi a;
    public final zyk b;
    public final zyk c = z4c.b(new dnj(this, 29));

    public n7l(Context context, umi umiVar) {
        this.a = umiVar;
        this.b = z4c.b(new vg4(context, (byte) 19));
    }

    public final f58 a() {
        return (f58) this.c.getValue();
    }

    @Override // defpackage.o7l
    public final void e(Set set, tmi tmiVar) {
        new rml(Unit.a, this.a).b(new d7k((Object) this, (Object) set, (byte) 16)).t(new n6k((Object) tmiVar, (byte) 25)).l();
    }

    @Override // defpackage.o7l
    public final void g(m7l m7lVar, q7l q7lVar) {
        new rml(Unit.a, this.a).b(new d7k((Object) this, (Object) m7lVar, (byte) 17)).t(new i7l(q7lVar, m7lVar, (byte) 0)).l();
    }

    @Override // defpackage.o7l
    public final void k(int i, d7k d7kVar) {
        new rml(Unit.a, this.a).b(new h7l(this, i, (byte) 1)).t(new n6k((Object) d7kVar, (byte) 24)).l();
    }

    @Override // defpackage.o7l
    public final oml l(int i, d7k d7kVar) {
        return new rml(Unit.a, this.a).b(new h7l(this, i, (byte) 0)).t(new n6k((Object) d7kVar, (byte) 23)).l();
    }
}

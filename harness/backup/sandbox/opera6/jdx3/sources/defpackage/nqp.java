package defpackage;

/* loaded from: classes.dex */
public final class nqp implements jrp {
    public final /* synthetic */ byte a;
    public final z4k b;

    public /* synthetic */ nqp(z4k z4kVar, byte b) {
        this.a = b;
        this.b = z4kVar;
    }

    @Override // defpackage.jrp
    /* renamed from: zza */
    public final Object mo1zza() {
        byte b = this.a;
        z4k z4kVar = this.b;
        switch (b) {
            case 0:
                return new mqp(((h61) z4kVar.b).a);
            default:
                return new pup(((h61) z4kVar.b).a);
        }
    }
}

package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class tpd implements zpd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aqd b;
    public final /* synthetic */ long c;

    public /* synthetic */ tpd(aqd aqdVar, long j, byte b) {
        this.a = b;
        this.b = aqdVar;
        this.c = j;
    }

    @Override // defpackage.zpd
    public final void b(nod nodVar) {
        byte b = this.a;
        long j = this.c;
        aqd aqdVar = this.b;
        switch (b) {
            case 0:
                aqdVar.f.t.seekTo(j);
                break;
            default:
                aqdVar.f.t.seekToDefaultPosition((int) j);
                break;
        }
    }
}

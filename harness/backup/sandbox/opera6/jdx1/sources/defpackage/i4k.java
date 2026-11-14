package defpackage;

/* loaded from: classes.dex */
public final class i4k extends hk9 {
    public final /* synthetic */ twi b;
    public final /* synthetic */ yv4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4k(yv4 yv4Var, twi twiVar, twi twiVar2) {
        super(twiVar);
        this.c = yv4Var;
        this.b = twiVar2;
    }

    @Override // defpackage.hk9, defpackage.twi
    public final swi getSeekPoints(long j) {
        swi seekPoints = this.b.getSeekPoints(j);
        vwi vwiVar = seekPoints.a;
        long j2 = vwiVar.a;
        long j3 = vwiVar.b;
        long j4 = this.c.b;
        vwi vwiVar2 = new vwi(j2, j3 + j4);
        vwi vwiVar3 = seekPoints.b;
        return new swi(vwiVar2, new vwi(vwiVar3.a, vwiVar3.b + j4));
    }
}

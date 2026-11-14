package defpackage;

/* loaded from: classes.dex */
public final class zeg implements ble {
    public final /* synthetic */ afg a;

    public zeg(afg afgVar) {
        this.a = afgVar;
    }

    @Override // defpackage.ble
    public final Object B0(long j, long j2, mt5 mt5Var) {
        if (i1n.c(j2) > 0.0f) {
            this.a.a.b.i(0.0f);
        }
        return super.B0(j, j2, mt5Var);
    }

    @Override // defpackage.ble
    public final long K(int i, long j, long j2) {
        afg afgVar = this.a;
        if (!((Boolean) afgVar.b.invoke()).booleanValue()) {
            return 0L;
        }
        tul tulVar = afgVar.a;
        tulVar.b.i(Float.intBitsToFloat((int) (j & 4294967295L)) + tulVar.b.h());
        return 0L;
    }
}

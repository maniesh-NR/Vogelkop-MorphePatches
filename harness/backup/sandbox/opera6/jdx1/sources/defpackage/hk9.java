package defpackage;

/* loaded from: classes.dex */
public abstract class hk9 implements twi {
    public final twi a;

    public hk9(twi twiVar) {
        this.a = twiVar;
    }

    @Override // defpackage.twi
    public long getDurationUs() {
        return this.a.getDurationUs();
    }

    @Override // defpackage.twi
    public swi getSeekPoints(long j) {
        return this.a.getSeekPoints(j);
    }

    @Override // defpackage.twi
    public final boolean isSeekable() {
        return this.a.isSeekable();
    }
}

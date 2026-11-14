package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class b5i implements ke7, urg {
    public final /* synthetic */ byte a;
    public final /* synthetic */ double b;

    public /* synthetic */ b5i(double d, byte b) {
        this.a = b;
        this.b = d;
    }

    public final double d(double d) {
        switch (this.a) {
            case 0:
                if (d < 0.0d) {
                    d = 0.0d;
                }
                return Math.pow(d, 1.0d / this.b);
            default:
                if (d < 0.0d) {
                    d = 0.0d;
                }
                return Math.pow(d, this.b);
        }
    }

    @Override // defpackage.urg
    public final boolean test(Object obj) {
        kqm kqmVar = (kqm) obj;
        return kqmVar == null || kqmVar.h < this.b;
    }
}

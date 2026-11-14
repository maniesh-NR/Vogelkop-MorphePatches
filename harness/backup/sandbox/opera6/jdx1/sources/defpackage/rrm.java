package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class rrm implements n7h {
    public final /* synthetic */ byte a;
    public final /* synthetic */ srm b;

    public /* synthetic */ rrm(srm srmVar, byte b) {
        this.a = b;
        this.b = srmVar;
    }

    public final Object get() {
        byte b = this.a;
        srm srmVar = this.b;
        switch (b) {
            case 0:
                return (nd4) srmVar.a.invoke(((jd4) srmVar.d.getValue()).a);
            default:
                return ((jd4) srmVar.d.getValue()).b;
        }
    }
}

package defpackage;

/* loaded from: classes.dex */
public final class qwi {
    public final nwi a;
    public final hwi b;

    public qwi(nwi nwiVar, hwi hwiVar) {
        this.a = nwiVar;
        this.b = hwiVar;
    }

    public static qwi a() {
        mwi mwiVar = new mwi();
        nwi nwiVar = nwi.a;
        return new qwi(nwiVar, new hwi(mwiVar, nwiVar));
    }
}

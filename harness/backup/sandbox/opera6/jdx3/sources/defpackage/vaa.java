package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class vaa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aba b;

    public /* synthetic */ vaa(aba abaVar, byte b) {
        this.a = b;
        this.b = abaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        aba abaVar = this.b;
        switch (b) {
            case 0:
                abaVar.b(true);
                break;
            default:
                abaVar.b.setVisibility(8);
                xf8.F0(abaVar.i, abaVar.a());
                break;
        }
    }
}

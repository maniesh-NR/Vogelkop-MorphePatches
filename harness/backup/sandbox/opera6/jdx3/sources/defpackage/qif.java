package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class qif implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ isd b;

    public /* synthetic */ qif(isd isdVar, byte b) {
        this.a = b;
        this.b = isdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        isd isdVar = this.b;
        switch (b) {
            case 0:
                vzk vzkVar = (vzk) isdVar.b;
                vzkVar.W(null, null, (tvh) ((i16) vzkVar.c).b);
                break;
            case 1:
                ((vzk) isdVar.b).W(null, null, null);
                break;
            default:
                ((vzk) isdVar.b).W(null, null, null);
                break;
        }
    }
}

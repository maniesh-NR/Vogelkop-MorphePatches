package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class wxh implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ isd b;

    public /* synthetic */ wxh(isd isdVar, byte b) {
        this.a = b;
        this.b = isdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        isd isdVar = this.b;
        switch (b) {
            case 0:
                ((eof) isdVar.b).run(Boolean.TRUE);
                break;
            case 1:
                ((eof) isdVar.b).run(Boolean.FALSE);
                break;
            default:
                ((eof) isdVar.b).run(Boolean.FALSE);
                break;
        }
    }
}

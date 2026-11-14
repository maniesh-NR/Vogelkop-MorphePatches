package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bwk implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cwk b;

    public /* synthetic */ bwk(cwk cwkVar, byte b) {
        this.a = b;
        this.b = cwkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cwk cwkVar = this.b;
        switch (b) {
            case 0:
                cwkVar.b.setVisibility(4);
                break;
            default:
                cwkVar.b.animate().setDuration(100L).alpha(0.0f).withEndAction(new bwk(cwkVar, (byte) 0));
                s03 s03Var = cwkVar.o;
                if (s03Var != null) {
                    vml.a(s03Var);
                    s03Var.b = true;
                    cwkVar.o = null;
                    break;
                }
                break;
        }
    }
}

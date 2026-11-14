package defpackage;

/* loaded from: classes.dex */
public final class a87 extends k8 {
    public final /* synthetic */ byte o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a87(s9i s9iVar, xbf xbfVar, byte b) {
        super(s9iVar, xbfVar);
        this.o = b;
    }

    @Override // defpackage.k8
    public final void i0(qim qimVar, yo7 yo7Var) {
        byte b = this.o;
        ijm ijmVar = ijm.b;
        switch (b) {
            case 0:
                z77 z77Var = qimVar.c;
                xbf xbfVar = (xbf) this.b;
                ojh ojhVar = new ojh(yo7Var);
                nt2 nt2Var = new nt2(new ljh(xbfVar, ojhVar, (byte) 1), ojhVar, (byte) 2);
                z77Var.getClass();
                z77Var.b(nt2Var, ijmVar);
                break;
            default:
                nej nejVar = qimVar.d;
                xq3 xq3Var = new xq3((xbf) this.b, new ojh(yo7Var), (byte) 7);
                nejVar.getClass();
                nejVar.b(xq3Var, ijmVar);
                break;
        }
    }

    public final void s0(qim qimVar, ai aiVar) {
        byte b = this.o;
        ijm ijmVar = ijm.b;
        switch (b) {
            case 0:
                z77 z77Var = qimVar.c;
                s9i s9iVar = (s9i) this.a;
                wjh wjhVar = new wjh(aiVar);
                nt2 nt2Var = new nt2(new ljh(s9iVar, wjhVar, (byte) 0), wjhVar, (byte) 1);
                z77Var.getClass();
                z77Var.b(nt2Var, ijmVar);
                break;
            default:
                nej nejVar = qimVar.d;
                xq3 xq3Var = new xq3((s9i) this.a, new wjh(aiVar), (byte) 8);
                nejVar.getClass();
                nejVar.b(xq3Var, ijmVar);
                break;
        }
    }
}

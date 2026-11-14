package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class nd5 implements idc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nd5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.idc
    public final void E(ndc ndcVar, occ occVar) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                xd5.o((kcf) obj2, (xd5) obj, occVar);
                break;
            default:
                ntd ntdVar = (ntd) obj2;
                mud mudVar = (mud) obj;
                ntdVar.getClass();
                if (occVar == occ.ON_DESTROY) {
                    ntdVar.b(mudVar);
                    break;
                }
                break;
        }
    }
}

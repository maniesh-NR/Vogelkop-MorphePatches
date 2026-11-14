package defpackage;

/* loaded from: classes.dex */
public final class d4i implements f7f {
    public final /* synthetic */ e4i a;
    public final /* synthetic */ ndc b;
    public final /* synthetic */ o3i c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ikc e;

    public d4i(e4i e4iVar, ndc ndcVar, o3i o3iVar, String str, ikc ikcVar) {
        this.a = e4iVar;
        this.b = ndcVar;
        this.c = o3iVar;
        this.d = str;
        this.e = ikcVar;
    }

    public final void d0(Object obj) {
        int iOrdinal = ((m18) obj).ordinal();
        if (iOrdinal != 0) {
            String str = this.d;
            o3i o3iVar = this.c;
            ndc ndcVar = this.b;
            ikc ikcVar = this.e;
            e4i e4iVar = this.a;
            if (iOrdinal == 1) {
                e4iVar.a(ndcVar, o3iVar, str);
            } else if (iOrdinal == 2) {
                dy3 dy3Var = new dy3(new oba(2, 0, new int[]{2131364332}));
                gjm gjmVar = e4iVar.c;
                gjmVar.e(dy3Var, false);
                oje ojeVarA = gjmVar.a(dy3.class);
                i51 i51Var = new i51(e4iVar, ndcVar, o3iVar, str, (byte) 17);
                x79 x79Var = new x79();
                x79Var.a = ojeVarA;
                x79Var.b = ikcVar;
                x79Var.c = i51Var;
                ob obVar = new ob(x79Var, (byte) 15);
                ojeVarA.d.a(obVar);
                x79Var.e = obVar;
            } else if (iOrdinal != 3) {
                h9o.p();
                return;
            }
            ikcVar.p(this);
        }
    }
}

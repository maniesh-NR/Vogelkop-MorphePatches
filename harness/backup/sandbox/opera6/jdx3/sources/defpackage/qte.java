package defpackage;

/* loaded from: classes.dex */
public final class qte extends cx4 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qte(ekc ekcVar, int i, byte b) {
        super(ekcVar, i);
        this.h = b;
    }

    @Override // defpackage.s6j
    public final ix4 a(hx4 hx4Var, Object obj) {
        switch (this.h) {
            case 1:
                h6g h6gVar = (h6g) obj;
                if (!h6gVar.c.a) {
                    g6g[] g6gVarArr = g6g.a;
                    hx4Var.b(4);
                }
                if (h6gVar.h) {
                    g6g[] g6gVarArr2 = g6g.a;
                    hx4Var.b(9);
                }
                return hx4Var.a();
            case 2:
                if (!((uzj) obj).a) {
                    tzj[] tzjVarArr = tzj.a;
                    hx4Var.b(1);
                    hx4Var.b(2);
                    hx4Var.b(3);
                }
                return hx4Var.a();
            case 3:
                vxk vxkVar = (vxk) obj;
                if (!vxkVar.i) {
                    hx4Var.b(4);
                }
                if (!vxkVar.j) {
                    hx4Var.b(5);
                }
                if (!vxkVar.k) {
                    hx4Var.b(6);
                }
                if (!vxkVar.l) {
                    hx4Var.b(7);
                }
                return hx4Var.a();
            default:
                return super.a(hx4Var, obj);
        }
    }

    @Override // defpackage.cx4
    public final r6j h(r6j r6jVar, Object obj, int i) {
        byte b = 1;
        byte b2 = 19;
        switch (this.h) {
            case 0:
                return r6jVar.a(i, new x6j(wre.class, new nf8((byte) 19)), 2132021274, 2131232211, true, new zbe((byte) 8));
            case 1:
                return r6jVar.a(i, new x6j(jt2.class, new nf8((byte) 29)), 2132021453, 2131232172, true, new m3g(b));
            case 2:
                return r6jVar.a(i, new x6j(d8j.class, new voj((byte) 14)), 2132021619, 2131232250, true, new bli((byte) 29));
            default:
                return r6j.b(r6jVar, i, new x6j(hxk.class, new voj(b2)), 2132021734, 0, new bvk((byte) 1), 24);
        }
    }
}

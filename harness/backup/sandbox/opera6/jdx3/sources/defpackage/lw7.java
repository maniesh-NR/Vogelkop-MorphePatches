package defpackage;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class lw7 implements as6 {
    public final /* synthetic */ byte a;
    public tcc b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lw7(Object obj, tcc tccVar, byte b) {
        this.a = b;
        this.c = obj;
        this.b = tccVar;
    }

    public lw7(ow7 ow7Var, tcc tccVar) {
        this.a = (byte) 0;
        this.c = ow7Var;
        this.b = tccVar;
        tccVar.a(this);
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        switch (this.a) {
            case 0:
                tcc tccVar = this.b;
                if (tccVar != null) {
                    tccVar.b(this);
                    this.b = null;
                    break;
                }
                break;
            case 1:
                tcc tccVar2 = this.b;
                if (tccVar2 != null) {
                    tccVar2.b(this);
                }
                this.b = null;
                break;
            default:
                tcc tccVar3 = this.b;
                if (tccVar3 != null) {
                    tccVar3.b(this);
                }
                this.b = null;
                break;
        }
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ow7 ow7Var = (ow7) obj;
                if (ow7Var.j) {
                    ow7Var.g.i();
                    break;
                }
                break;
            case 1:
                ((HashSet) ((noc) obj).a.j).clear();
                break;
            default:
                cy cyVar = (cy) obj;
                ((xdh) cyVar.d).i();
                ((qdh) cyVar.c).c.clear();
                break;
        }
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ow7 ow7Var = (ow7) obj;
                boolean z = ow7Var.j;
                if (z && z) {
                    ow7Var.g.d(ow7Var.c);
                    break;
                }
                break;
            case 1:
                ((noc) obj).b.d();
                break;
            default:
                ((wdh) ((cy) obj).e).j();
                break;
        }
    }
}

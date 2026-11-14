package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class u6j implements f7f {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    public u6j(hx5 hx5Var) {
        this.a = (byte) 0;
        this.c = hx5Var;
        this.b = true;
    }

    public u6j(r9l r9lVar) {
        this.a = (byte) 1;
        this.c = r9lVar;
    }

    public final void d0(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                hx5 hx5Var = (hx5) obj2;
                Object objInvoke = ((Function1) hx5Var.o).invoke(obj);
                if (objInvoke != null) {
                    if (this.b || obj == null || !obj.equals(objInvoke)) {
                        this.b = false;
                        hx5Var.r(objInvoke);
                        break;
                    }
                }
                break;
            default:
                qyi qyiVar = (qyi) obj;
                r9l r9lVar = (r9l) obj2;
                s9i s9iVar = r9lVar.w;
                g4l g4lVar = r9lVar.D;
                boolean zY = s9iVar.Y();
                if (this.b != zY) {
                    if (zY) {
                        g4l.a(g4lVar, (qyiVar.equals(oyi.a) || !((pyi) qyiVar).c) ? null : uz3.e, 1);
                    } else {
                        g4l.e(g4lVar);
                    }
                    this.b = zY;
                    break;
                }
                break;
        }
    }
}

package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v82 implements w82 {
    public final /* synthetic */ byte a;
    public Object b;

    public v82(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }

    public v82(xw8 xw8Var) {
        this.a = (byte) 2;
        this.b = xw8Var;
    }

    @Override // defpackage.w82
    public final void a(c53 c53Var) {
        int i = 0;
        z = false;
        boolean z = false;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((w82) obj).a(c53Var);
                }
                break;
            case 1:
                v82 v82Var = (v82) this.b;
                if (v82Var != null) {
                    v82Var.a(c53Var);
                    break;
                }
                break;
            default:
                xw8 xw8Var = (xw8) this.b;
                ((c5k) xw8Var.s.b).n.c(false, false);
                vu8 vu8Var = xw8Var.m;
                vu8Var.f = true;
                vu8Var.g = false;
                vu8Var.t();
                uv8 uv8Var = xw8Var.n;
                if (uv8Var != null) {
                    if (c53Var.b != null && !c53Var.b()) {
                        z = true;
                    }
                    if (uv8Var.e != z) {
                        uv8Var.e = z;
                        ow8 ow8Var = uv8Var.d;
                        sv8 sv8Var = new sv8(uv8Var.t());
                        ow8Var.W(sv8Var, sv8Var);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.w82
    public final void b(c53 c53Var) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((w82) obj).b(c53Var);
                }
                break;
            case 1:
                v82 v82Var = (v82) this.b;
                if (v82Var != null) {
                    v82Var.b(c53Var);
                    break;
                }
                break;
            default:
                if (c53Var.b == null) {
                    ((xw8) this.b).w.f();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.w82
    public final void c(c53 c53Var) {
        int i = 0;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((w82) obj).c(c53Var);
                }
                break;
            case 1:
                v82 v82Var = (v82) this.b;
                if (v82Var != null) {
                    v82Var.c(c53Var);
                    break;
                }
                break;
            default:
                ((c5k) ((xw8) this.b).s.b).n.c(false, false);
                break;
        }
    }

    @Override // defpackage.w82
    public final void d(k92 k92Var, Exception exc) {
        int i = 0;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((w82) obj).d(k92Var, exc);
                }
                break;
            case 1:
                v82 v82Var = (v82) this.b;
                if (v82Var != null) {
                    v82Var.d(k92Var, exc);
                    break;
                }
                break;
            default:
                xw8 xw8Var = (xw8) this.b;
                ((c5k) xw8Var.s.b).n.c(false, false);
                vu8 vu8Var = xw8Var.m;
                vu8Var.f = true;
                vu8Var.g = true;
                vu8Var.t();
                break;
        }
    }
}

package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class iqf extends p10 {
    public static final iqf e;
    public static final iqf f;
    public static final iqf g;
    public static final iqf h;
    public final /* synthetic */ byte d;

    static {
        int i = 1;
        e = new iqf(i, 2, (byte) 0);
        int i2 = 1;
        f = new iqf(i2, i2, (byte) 1);
        g = new iqf(i, 2, (byte) 2);
        int i3 = 1;
        h = new iqf(i3, i3, (byte) 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iqf(int i, int i2, byte b) {
        super(i, i2, (byte) 2);
        this.d = b;
    }

    @Override // defpackage.p10
    public final void a(r05 r05Var, kw1 kw1Var, lqj lqjVar, j1c j1cVar, drf drfVar) {
        switch (this.d) {
            case 0:
                Object objInvoke = ((Function0) r05Var.y(0)).invoke();
                qt9 qt9Var = (qt9) r05Var.y(1);
                int iX = r05Var.x(0);
                qt9Var.getClass();
                lqjVar.T(lqjVar.c(qt9Var), objInvoke);
                kw1Var.m(iX, objInvoke);
                kw1Var.r(objInvoke);
                break;
            case 1:
                qt9 qt9Var2 = (qt9) r05Var.y(0);
                int iX2 = r05Var.x(0);
                kw1Var.u();
                qt9Var2.getClass();
                kw1Var.p(iX2, lqjVar.C(lqjVar.c(qt9Var2)));
                break;
            case 2:
                Object objY = r05Var.y(0);
                qt9 qt9Var3 = (qt9) r05Var.y(1);
                int iX3 = r05Var.x(0);
                if (objY instanceof zt9) {
                    zt9 zt9Var = (zt9) objY;
                    ((dfe) j1cVar.d).c(zt9Var);
                    ((tee) j1cVar.c).a(zt9Var);
                }
                Object objJ = lqjVar.J(lqjVar.c(qt9Var3), iX3, objY);
                if (!(objJ instanceof zt9)) {
                    if (objJ instanceof znh) {
                        ((znh) objJ).c();
                        break;
                    }
                } else {
                    j1cVar.f((zt9) objJ);
                    break;
                }
                break;
            default:
                Object objY2 = r05Var.y(0);
                int iX4 = r05Var.x(0);
                if (objY2 instanceof zt9) {
                    zt9 zt9Var2 = (zt9) objY2;
                    ((dfe) j1cVar.d).c(zt9Var2);
                    ((tee) j1cVar.c).a(zt9Var2);
                }
                Object objJ2 = lqjVar.J(lqjVar.t, iX4, objY2);
                if (!(objJ2 instanceof zt9)) {
                    if (objJ2 instanceof znh) {
                        ((znh) objJ2).c();
                        break;
                    }
                } else {
                    j1cVar.f((zt9) objJ2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.p10
    public final qt9 b(r05 r05Var) {
        switch (this.d) {
            case 0:
                return (qt9) r05Var.y(1);
            case 1:
                return (qt9) r05Var.y(0);
            default:
                return super.b(r05Var);
        }
    }
}

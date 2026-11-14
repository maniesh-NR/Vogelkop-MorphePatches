package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class zv8 implements qp5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x5f b;

    public /* synthetic */ zv8(x5f x5fVar, byte b) {
        this.a = b;
        this.b = x5fVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        x5f x5fVar = this.b;
        switch (b) {
            case 0:
                vb0 vb0Var = (vb0) obj;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
                    dh0 dh0Var = new dh0(2443, -1, 1);
                    dh0Var.q(0, vb0Var == null ? 0 : 1, vb0Var);
                    List list = (List) xb0VarX.n(24);
                    ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 24, am2.q(xb0VarX, 24, 1)) : new hf0(xb0VarX, 24, list)).add(dh0Var);
                    x5fVar.U0(x56VarF);
                    break;
                }
                break;
            case 1:
                j90 j90Var = (j90) obj;
                if (x5fVar.h) {
                    zpa zpaVar2 = x5fVar.d;
                    x56 x56VarF2 = zpa.F();
                    xb0 xb0VarX2 = x56VarF2.B(zpaVar2).x(zpaVar2);
                    nj0 nj0Var = new nj0(2443, -1, 1);
                    nj0Var.q(0, j90Var == null ? 0 : 1, j90Var);
                    List list2 = (List) xb0VarX2.n(33);
                    ((list2 == null || list2.isEmpty()) ? new hf0(xb0VarX2, 33, am2.q(xb0VarX2, 33, 1)) : new hf0(xb0VarX2, 33, list2)).add(nj0Var);
                    x5fVar.U0(x56VarF2);
                    break;
                }
                break;
            default:
                vb0 vb0Var2 = (vb0) obj;
                if (x5fVar.h) {
                    zpa zpaVar3 = x5fVar.d;
                    x56 x56VarF3 = zpa.F();
                    xb0 xb0VarX3 = x56VarF3.B(zpaVar3).x(zpaVar3);
                    om0 om0Var = new om0(2443, -1, 1);
                    om0Var.q(0, vb0Var2 == null ? 0 : 1, vb0Var2);
                    List list3 = (List) xb0VarX3.n(25);
                    ((list3 == null || list3.isEmpty()) ? new hf0(xb0VarX3, 25, am2.q(xb0VarX3, 25, 1)) : new hf0(xb0VarX3, 25, list3)).add(om0Var);
                    x5fVar.U0(x56VarF3);
                    break;
                }
                break;
        }
    }
}

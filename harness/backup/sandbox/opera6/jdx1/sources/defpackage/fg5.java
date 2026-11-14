package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class fg5 extends j0i implements Function2 {
    public int u;
    public int v;
    public int w;
    public boolean x;
    public /* synthetic */ Object y;
    public final /* synthetic */ gg5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg5(gg5 gg5Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.z = gg5Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        fg5 fg5Var = new fg5(this.z, mt5Var);
        fg5Var.y = obj;
        return fg5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((l1j) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        l1j l1jVar;
        int i;
        int i2;
        int i3;
        String strH;
        int i4;
        int i5;
        String str;
        gg5 gg5Var = this.z;
        dee deeVar = gg5Var.a;
        ide ideVar = gg5Var.c;
        px5 px5Var = px5.a;
        boolean z = this.x;
        if (!z) {
            ybh.y(obj);
            l1jVar = (l1j) this.y;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.w;
            i2 = this.v;
            i3 = this.u;
            l1jVar = (l1j) this.y;
            ybh.y(obj);
        }
        if (i3 >= Math.min(gg5Var.d + 10, ideVar.b)) {
            return Unit.a;
        }
        int i6 = i3 + 1;
        int iC = ideVar.c(i3);
        switch (iC) {
            case 0:
                strH = "up";
                break;
            case 1:
                String strO = rfp.o(deeVar.g(i2), "down ");
                i2++;
                strH = strO;
                break;
            case 2:
                strH = sko.h(ideVar.c(i6), ideVar.c(i3 + 2), "remove ", " ");
                i6 = i3 + 3;
                break;
            case 3:
                int iC2 = ideVar.c(i6);
                int iC3 = ideVar.c(i3 + 2);
                int iC4 = ideVar.c(i3 + 3);
                StringBuilder sbO = sko.o(iC2, iC3, "move ", " ", " ");
                sbO.append(iC4);
                strH = sbO.toString();
                i6 = i3 + 4;
                break;
            case 4:
                strH = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int iC5 = ideVar.c(i6);
                i5 = i2 + 1;
                str = "insertBottomUp " + iC5 + " " + deeVar.g(i2);
                int i7 = i4;
                strH = str;
                i6 = i7;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int iC6 = ideVar.c(i6);
                i5 = i2 + 1;
                str = "insertTopDown " + iC6 + " " + deeVar.g(i2);
                int i72 = i4;
                strH = str;
                i6 = i72;
                i2 = i5;
                break;
            case 7:
                Object objG = deeVar.g(i2);
                y9m.t(2, objG);
                i2 += 2;
                strH = "apply " + ((Function2) objG);
                break;
            case 8:
                strH = rfp.o(gg5Var.b.g(i), "reuse ");
                i++;
                break;
            case 9:
                strH = "recompose pending";
                break;
            default:
                strH = sko.i(iC, "unknown op: ");
                break;
        }
        this.y = l1jVar;
        this.u = i6;
        this.v = i2;
        this.w = i;
        this.x = true;
        l1jVar.a(this, i3 + ": " + strH);
        return px5Var;
    }
}

package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class s22 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v22 b;

    public /* synthetic */ s22(v22 v22Var, byte b) {
        this.a = b;
        this.b = v22Var;
    }

    public final Object invoke(Object obj) {
        vsn vsnVarG;
        vsn vsnVarG2;
        kze kzeVar;
        vsn vsnVarG3;
        qyj qyjVarF;
        vsn vsnVarG4;
        vsn vsnVarG5;
        kze kzeVar2;
        vsn vsnVarG6;
        qyj qyjVarF2;
        vsn vsnVarG7;
        kze kzeVar3;
        byte b = this.a;
        og ogVar = og.a;
        v22 v22Var = this.b;
        switch (b) {
            case 0:
                xf8.F0(v22Var.d, (List) obj);
                break;
            case 1:
                x22 x22Var = v22Var.i;
                r22 r22Var = v22Var.h;
                if (r22Var != null && (vsnVarG3 = r22Var.g()) != null && (qyjVarF = vsnVarG3.c.f()) != null) {
                    qyjVarF.f();
                }
                r22 r22Var2 = v22Var.h;
                if (r22Var2 != null && (vsnVarG2 = r22Var2.g()) != null && (kzeVar = vsnVarG2.l) != null) {
                    kzeVar.r(ogVar);
                }
                r22 r22Var3 = v22Var.h;
                if (r22Var3 != null && (vsnVarG = r22Var3.g()) != null) {
                    ((d5o) vsnVarG.k.g).w(u70.d);
                }
                if (x22Var.n == v22Var.h) {
                    mrn mrnVar = x22Var.l;
                    if (!Intrinsics.a(mrnVar.z, (Object) null)) {
                        mrnVar.z = null;
                    }
                    x22Var.n = null;
                }
                v22Var.h = null;
                i7f i7fVar = x22Var.o;
                g7f g7fVarC = u35.c(i7fVar, i7fVar);
                while (g7fVarC.hasNext()) {
                    ((bx0) g7fVarC.next()).a.b();
                }
                break;
            case 2:
                x22 x22Var2 = v22Var.i;
                r22 r22Var4 = v22Var.h;
                if (r22Var4 != null && (vsnVarG6 = r22Var4.g()) != null && (qyjVarF2 = vsnVarG6.c.f()) != null) {
                    qyjVarF2.f();
                }
                r22 r22Var5 = v22Var.h;
                if (r22Var5 != null && (vsnVarG5 = r22Var5.g()) != null && (kzeVar2 = vsnVarG5.l) != null) {
                    kzeVar2.r(ogVar);
                }
                r22 r22Var6 = v22Var.h;
                if (r22Var6 != null && (vsnVarG4 = r22Var6.g()) != null) {
                    ((d5o) vsnVarG4.k.g).w(u70.c);
                }
                if (!v22Var.c && x22Var2.n == v22Var.h) {
                    mrn mrnVar2 = x22Var2.l;
                    if (!Intrinsics.a(mrnVar2.z, (Object) null)) {
                        mrnVar2.z = null;
                    }
                    x22Var2.n = null;
                }
                break;
            default:
                x22 x22Var3 = v22Var.i;
                mrn mrnVar3 = x22Var3.l;
                if (!Intrinsics.a(mrnVar3.z, v22Var)) {
                    mrnVar3.z = v22Var;
                }
                r22 r22Var7 = x22Var3.n;
                r22 r22Var8 = v22Var.h;
                if (r22Var7 == r22Var8) {
                    if (r22Var8 != null && (vsnVarG7 = r22Var8.g()) != null && (kzeVar3 = vsnVarG7.l) != null) {
                        kzeVar3.r(ng.a);
                    }
                } else if (r22Var8 != null) {
                    x22Var3.n = r22Var8;
                    x22Var3.h(r22Var8);
                }
                x22Var3.g.setVisibility(0);
                break;
        }
        return Unit.a;
    }
}

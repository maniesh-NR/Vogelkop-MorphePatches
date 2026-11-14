package defpackage;

import J.N;
import com.opera.android.webcore.WebcoreRpcBridge;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class l62 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s62 b;

    public /* synthetic */ l62(s62 s62Var, byte b) {
        this.a = b;
        this.b = s62Var;
    }

    public final Object invoke(Object obj) {
        v5n v5nVar;
        Boolean bool;
        byte b = this.a;
        s62 s62Var = this.b;
        switch (b) {
            case 0:
                ((WebcoreRpcBridge) s62Var.w.d).a((String) obj);
                return Unit.a;
            case 1:
                r9i r9iVar = s62Var.w;
                float fFloatValue = ((Float) obj).floatValue();
                long j = ((WebcoreRpcBridge) r9iVar.d).a;
                if (j != 0) {
                    N.M0ycnTP5(j, fFloatValue);
                }
                return Unit.a;
            case 2:
                s62Var.u.r(((Boolean) obj).booleanValue() ? x52.b : x52.c);
                s62Var.C = false;
                return Unit.a;
            case 3:
                String str = (String) obj;
                zz1 zz1Var = (zz1) s62Var.v.o;
                if (zz1Var != null && (v5nVar = zz1Var.j) != null) {
                    v5nVar.d(str);
                }
                return Unit.a;
            default:
                g7m g7mVar = s62Var.c;
                itm itmVar = ((ela) obj).a;
                t62 t62Var = s62Var.a;
                x70 x70Var = null;
                if (itmVar == null) {
                    bool = null;
                } else if (itmVar instanceof nhe) {
                    bool = Boolean.FALSE;
                } else if (itmVar instanceof whi) {
                    bool = Boolean.TRUE;
                } else {
                    if (!(itmVar instanceof zf1)) {
                        h9o.p();
                        return null;
                    }
                    bool = null;
                }
                if (bool != null) {
                    skm skmVar = (skm) ((ji) g7mVar.e).get();
                    boolean zBooleanValue = bool.booleanValue();
                    x5f x5fVar = (x5f) skmVar;
                    x5fVar.getClass();
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    new ck0(zpaVar, x56VarF).h().a.r(9, 1, zBooleanValue);
                    x5fVar.U0(x56VarF);
                }
                if (!((ru9) ((yv3) g7mVar.c).get()).a.getBoolean("ai.tos_accepted", false)) {
                    int iOrdinal = t62Var.ordinal();
                    if (iOrdinal == 0) {
                        x70Var = x70.l;
                    } else {
                        if (iOrdinal != 1) {
                            h9o.p();
                            return null;
                        }
                        x70Var = x70.n;
                    }
                } else if (itmVar != null) {
                    if (itmVar instanceof zf1) {
                        x70Var = x70.d;
                    } else if (itmVar instanceof nhe) {
                        if (!Intrinsics.a((x70) g7mVar.k, x70.m)) {
                            x70Var = x70.i;
                        }
                    } else if (!(itmVar instanceof whi)) {
                        h9o.p();
                        return null;
                    }
                }
                if (x70Var != null && x70Var != ((x70) g7mVar.k)) {
                    g7mVar.f(x70Var);
                }
                return Unit.a;
        }
    }
}

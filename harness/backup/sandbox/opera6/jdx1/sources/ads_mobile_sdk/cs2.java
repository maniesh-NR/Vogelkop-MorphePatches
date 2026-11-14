package ads_mobile_sdk;

import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class cs2 extends kuk implements Function1 {
    public pfe a;
    public vs2 b;
    public boolean c;
    public final /* synthetic */ vs2 d;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cs2(vs2 vs2Var, mt5 mt5Var, byte b) {
        super(1, mt5Var);
        this.t = b;
        this.d = vs2Var;
    }

    public final mt5 create(mt5 mt5Var) {
        byte b = this.t;
        vs2 vs2Var = this.d;
        switch (b) {
            case 0:
                return new cs2(vs2Var, mt5Var, (byte) 0);
            default:
                return new cs2(vs2Var, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.t;
        vs2 vs2Var = this.d;
        switch (b) {
            case 0:
                return new cs2(vs2Var, (mt5) obj, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new cs2(vs2Var, (mt5) obj, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        pfe pfeVar;
        pfe pfeVar2;
        byte b = this.t;
        vs2 vs2Var = this.d;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.c;
                if (!z) {
                    ybh.y(obj);
                    pfe pfeVar3 = vs2Var.e;
                    this.a = pfeVar3;
                    this.b = vs2Var;
                    this.c = true;
                    if (pfeVar3.i(this) == px5Var) {
                        return px5Var;
                    }
                    pfeVar = pfeVar3;
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vs2Var = this.b;
                    pfeVar = this.a;
                    ybh.y(obj);
                }
                try {
                    return new pn7(vs2Var.m);
                } finally {
                }
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.c;
                if (!z2) {
                    ybh.y(obj);
                    pfe pfeVar4 = vs2Var.e;
                    this.a = pfeVar4;
                    this.b = vs2Var;
                    this.c = true;
                    if (pfeVar4.i(this) == px5Var2) {
                        return px5Var2;
                    }
                    pfeVar2 = pfeVar4;
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vs2Var = this.b;
                    pfeVar2 = this.a;
                    ybh.y(obj);
                }
                try {
                    return new pn7(vs2Var.n);
                } finally {
                }
        }
    }
}

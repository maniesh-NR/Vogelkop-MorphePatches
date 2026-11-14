package ads_mobile_sdk;

import defpackage.r71;
import defpackage.ybh;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.chromium.net.CronetEngine;

/* loaded from: classes.dex */
public final class e30 extends kuk implements Function1 {
    public byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ p30 c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ AtomicReference e;
    public final /* synthetic */ ynb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e30(boolean z, p30 p30Var, Long l, AtomicReference atomicReference, ynb ynbVar, mt5 mt5Var) {
        super(1, mt5Var);
        this.b = z;
        this.c = p30Var;
        this.d = l;
        this.e = atomicReference;
        this.f = ynbVar;
    }

    public final mt5 create(mt5 mt5Var) {
        return new e30(this.b, this.c, this.d, this.e, this.f, mt5Var);
    }

    public final Object invoke(Object obj) {
        return create((mt5) obj).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        wq wqVar;
        wq wqVar2;
        boolean zA;
        boolean zHasNext;
        px5 px5Var = px5.a;
        byte b = this.a;
        mt5 mt5Var = null;
        try {
            try {
            } finally {
                if (z) {
                    if (wqVar != wqVar2) {
                        if (zA) {
                            while (true) {
                                if (!zHasNext) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (b != 0) {
                try {
                    if (b == 1) {
                        ybh.y(obj);
                    } else {
                        if (b != 2) {
                            qp2.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ybh.y(obj);
                        this.e.set(((CronetEngine.Builder) obj).build());
                        rg3 rg3Var = hh3.b().a;
                        ub2 ub2VarE = rg3Var != null ? rg3Var.e() : null;
                        if (ub2VarE != null) {
                            ub2VarE.z = "Fallback-Cronet-Provider";
                        }
                    }
                } catch (Throwable th) {
                    vr3 vr3Var = xu0.a;
                    xu0.c("Cronet was unable to be initialized and the SDK will not be able to make network requests: " + th.getMessage(), null);
                }
            } else {
                ybh.y(obj);
                if (this.b) {
                    throw new IllegalStateException("Cronet fallback provider forced to use.");
                }
                qr0 qr0Var = this.c.b;
                long j = qr0Var != null ? ((pn7) qr0Var.a("gads:cronet_init_timeout:seconds", new pn7(qr0.A), fo.a$21)).a : qr0.A;
                r71 r71Var = new r71(this.c, this.e, this.d, mt5Var, (byte) 17);
                this.a = (byte) 1;
                if (uyg.v(j, r71Var, this) == px5Var) {
                    return px5Var;
                }
            }
            this.f.B0();
            return Unit.a;
        } catch (Throwable th2) {
            this.f.B0();
        }
    }
}

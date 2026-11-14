package ads_mobile_sdk;

import android.net.Uri;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ey0 extends kuk implements Function2 {
    public boolean a;
    public final /* synthetic */ ry0 b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey0(ry0 ry0Var, Uri uri, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.b = ry0Var;
        this.c = uri;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Uri uri = this.c;
        ry0 ry0Var = this.b;
        switch (b) {
            case 0:
                return new ey0(ry0Var, uri, mt5Var, (byte) 0);
            default:
                return new ey0(ry0Var, uri, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Uri uri = this.c;
        ry0 ry0Var = this.b;
        switch (b) {
            case 0:
                return new ey0(ry0Var, uri, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            default:
                return new ey0(ry0Var, uri, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.a;
                if (!z) {
                    ybh.y(obj);
                    jz2 jz2Var = this.b.u;
                    if (jz2Var != null) {
                        String string = this.c.toString();
                        this.a = true;
                        if (jz2Var.b(string, this) == px5Var) {
                            break;
                        }
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.a;
                if (!z2) {
                    ybh.y(obj);
                    ry0 ry0Var = this.b;
                    bl1 bl1Var = ry0Var.a;
                    cy0 cy0Var = ry0Var.b;
                    Uri uri = this.c;
                    this.a = true;
                    bl1Var.getClass();
                    if (bl1.a(bl1Var, cy0Var, uri, (nt5) this) == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
        }
        return Unit.a;
    }
}

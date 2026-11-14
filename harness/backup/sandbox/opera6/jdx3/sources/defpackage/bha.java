package defpackage;

import com.opera.api.Callback;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class bha implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nh4 b;

    public /* synthetic */ bha(nh4 nh4Var, byte b) {
        this.a = b;
        this.b = nh4Var;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        nh4 nh4Var = this.b;
        switch (b) {
            case 0:
                if (nh4Var.r() instanceof c0f) {
                    p0i p0iVar = t0i.b;
                    nh4Var.resumeWith(Unit.a);
                    break;
                }
                break;
            case 1:
                p0i p0iVar2 = t0i.b;
                nh4Var.resumeWith((yah) obj);
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                if (!(nh4Var.r() instanceof qh4)) {
                    p0i p0iVar3 = t0i.b;
                    nh4Var.resumeWith(bool);
                    break;
                }
                break;
            case 3:
                ky9 ky9Var = (ky9) obj;
                if (!(nh4Var.r() instanceof qh4)) {
                    p0i p0iVar4 = t0i.b;
                    nh4Var.resumeWith(ky9Var);
                    break;
                }
                break;
            case 4:
                h4k h4kVar = (h4k) obj;
                if (!(nh4Var.r() instanceof qh4)) {
                    p0i p0iVar5 = t0i.b;
                    nh4Var.resumeWith(h4kVar);
                    break;
                }
                break;
            case 5:
                elk elkVar = (elk) obj;
                if (!(nh4Var.r() instanceof qh4)) {
                    p0i p0iVar6 = t0i.b;
                    nh4Var.resumeWith(elkVar);
                    break;
                }
                break;
            case 6:
                elk elkVar2 = (elk) obj;
                if (!(nh4Var.r() instanceof qh4)) {
                    p0i p0iVar7 = t0i.b;
                    nh4Var.resumeWith(elkVar2);
                    break;
                }
                break;
            case 7:
                wfc wfcVar = (wfc) obj;
                if (!(nh4Var.r() instanceof qh4)) {
                    p0i p0iVar8 = t0i.b;
                    nh4Var.resumeWith(wfcVar);
                    break;
                }
                break;
            case 8:
                w1m w1mVar = (w1m) obj;
                if (!(nh4Var.r() instanceof qh4)) {
                    p0i p0iVar9 = t0i.b;
                    nh4Var.resumeWith(w1mVar);
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                String str = (String) obj;
                if (!(nh4Var.r() instanceof qh4)) {
                    p0i p0iVar10 = t0i.b;
                    nh4Var.resumeWith(str);
                    break;
                }
                break;
            default:
                String str2 = (String) obj;
                if (!(nh4Var.r() instanceof qh4)) {
                    p0i p0iVar11 = t0i.b;
                    nh4Var.resumeWith(str2);
                    break;
                }
                break;
        }
    }
}

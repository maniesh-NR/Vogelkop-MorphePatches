package defpackage;

import com.opera.api.Callback;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nt2 extends tim {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt2(l6g l6gVar, uii uiiVar) {
        super(uiiVar);
        this.b = (byte) 0;
        this.c = l6gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nt2(uim uimVar, Object obj, byte b) {
        super(uimVar);
        this.b = b;
        this.c = obj;
    }

    @Override // defpackage.d63
    public final void onFinished(hjm hjmVar) {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((l6g) obj).run();
                break;
            case 1:
                wjh wjhVar = (wjh) obj;
                if (((sa2) wjhVar.e).e()) {
                    ((ai) wjhVar.b).invoke((vjh) wjhVar.f);
                    break;
                }
                break;
            default:
                ojh ojhVar = (ojh) obj;
                if (ojhVar.c.e()) {
                    yo7 yo7Var = ojhVar.a;
                    Callback callback = (Callback) yo7Var.b;
                    vjh vjhVar = (vjh) yo7Var.c;
                    qjh qjhVar = (qjh) yo7Var.d;
                    Integer num = vjhVar.b;
                    eo0 eo0Var = eo0.c;
                    callback.run(new pjh(null, eo0Var, null, num));
                    if (!Intrinsics.a(eo0Var, eo0Var)) {
                        qjhVar.c.f(new glj(2132019051, 5000));
                        break;
                    }
                }
                break;
        }
    }
}

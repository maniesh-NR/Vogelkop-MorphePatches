package defpackage;

import com.opera.android.FullscreenWebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class x8k implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y8k b;
    public final /* synthetic */ ch5 c;

    public /* synthetic */ x8k(y8k y8kVar, ch5 ch5Var, byte b) {
        this.a = b;
        this.b = y8kVar;
        this.c = ch5Var;
    }

    public final Object invoke() {
        byte b = this.a;
        kl0 kl0Var = kl0.j;
        d4 d4Var = this.c;
        y8k y8kVar = this.b;
        switch (b) {
            case 0:
                wsf wsfVar = y8kVar.b;
                wsfVar.getClass();
                wsfVar.a(new vsf(wsfVar, kl0Var, (byte) 1));
                FullscreenWebActivity.z0(d4Var.getContext(), "https://www.opera.com/terms", new rxh(2132021773));
                break;
            default:
                wsf wsfVar2 = y8kVar.b;
                wsfVar2.getClass();
                wsfVar2.a(new vsf(wsfVar2, kl0Var, (byte) 0));
                FullscreenWebActivity.z0(d4Var.getContext(), "https://www.opera.com/privacy", new rxh(2132021379));
                break;
        }
        return Unit.a;
    }
}

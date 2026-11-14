package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class du2 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eu2 b;

    public /* synthetic */ du2(eu2 eu2Var, byte b) {
        this.a = b;
        this.b = eu2Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        eu2 eu2Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                hu2 hu2VarH0 = eu2Var.H0();
                x5g.b(hu2VarH0.e, new tt2(iIntValue, hu2VarH0, (byte) 1));
                break;
            default:
                if (((pkj) obj) == pkj.a) {
                    Intent intent = new Intent("android.settings.LOCK_SCREEN_SETTINGS");
                    if (qvf.b(65536, intent) == null) {
                        intent = new Intent("android.settings.SETTINGS");
                    }
                    intent.setFlags(268435456);
                    try {
                        eu2Var.requireContext().startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                    }
                }
                break;
        }
        return Unit.a;
    }
}

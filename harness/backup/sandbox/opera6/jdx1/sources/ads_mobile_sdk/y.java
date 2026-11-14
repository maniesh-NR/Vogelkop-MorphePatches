package ads_mobile_sdk;

import android.app.Activity;
import android.os.Bundle;
import defpackage.fdp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class y extends ozb implements Function1 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Activity activity, byte b) {
        super(1);
        this.i = b;
        this.a = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Activity activity, Bundle bundle) {
        super(1);
        this.i = (byte) 3;
        this.a = activity;
    }

    public final Object invoke(Object obj) {
        byte b = this.i;
        Activity activity = this.a;
        switch (b) {
            case 0:
                jp jpVar = (jp) ((fdp) obj);
                jpVar.getClass();
                if (jpVar.f.B0()) {
                    jpVar.a(activity, 0);
                    jpVar.b(pn3.d);
                }
                break;
            case 1:
                jp jpVar2 = (jp) ((fdp) obj);
                jpVar2.getClass();
                if (jpVar2.f.B0()) {
                    jpVar2.a(activity, 4);
                    jpVar2.b(pn3.d);
                }
                break;
            case 2:
                jp jpVar3 = (jp) ((fdp) obj);
                jpVar3.getClass();
                if (jpVar3.f.B0()) {
                    jpVar3.a(activity, 0);
                    jpVar3.b(pn3.d);
                }
                break;
            case 3:
                jp jpVar4 = (jp) ((fdp) obj);
                jpVar4.getClass();
                if (jpVar4.f.B0()) {
                    jpVar4.b(pn3.d);
                }
                break;
            case 4:
                jp jpVar5 = (jp) ((fdp) obj);
                jpVar5.getClass();
                if (jpVar5.f.B0()) {
                    jpVar5.a(activity, 0);
                    jpVar5.b(pn3.d);
                }
                break;
            case 5:
                jp jpVar6 = (jp) ((fdp) obj);
                jpVar6.getClass();
                if (jpVar6.f.B0()) {
                    jpVar6.a(activity, 4);
                    jpVar6.b(pn3.d);
                }
                break;
            default:
                jp jpVar7 = (jp) ((fdp) obj);
                jpVar7.getClass();
                if (jpVar7.f.B0()) {
                    jpVar7.b(pn3.d);
                }
                break;
        }
        return Unit.a;
    }
}

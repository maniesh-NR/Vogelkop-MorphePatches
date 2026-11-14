package defpackage;

import com.opera.android.OperaApplication;
import com.opera.android.startup.WelcomeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class tzn implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ WelcomeActivity b;

    public /* synthetic */ tzn(WelcomeActivity welcomeActivity, byte b) {
        this.a = b;
        this.b = welcomeActivity;
    }

    public final Object invoke() {
        byte b = this.a;
        ndc ndcVar = this.b;
        switch (b) {
            case 0:
                int i = WelcomeActivity.w;
                return ndcVar.j();
            case 1:
                int i2 = WelcomeActivity.w;
                String[] strArr = OperaApplication.K;
                ((cj3) ((si3) ((OperaApplication) ndcVar.getApplication()).r.o.get()).o.getValue()).d.j(ndcVar, new glm(new q0n((byte) 11), (byte) 5));
                return Unit.a;
            case 2:
                Boolean bool = (Boolean) ((m9k) ndcVar.p.get()).e.g();
                bool.getClass();
                return bool;
            case 3:
                int i3 = WelcomeActivity.w;
                ndcVar.W();
                return Unit.a;
            default:
                return ((u9k) ndcVar.q.get()).a;
        }
    }
}

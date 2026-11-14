package defpackage;

import com.opera.android.startup.WelcomeActivity;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class xzn extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ WelcomeActivity j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xzn(WelcomeActivity welcomeActivity, byte b) {
        super(0);
        this.i = b;
        this.j = welcomeActivity;
    }

    public final Object invoke() {
        byte b = this.i;
        WelcomeActivity welcomeActivity = this.j;
        switch (b) {
            case 0:
                return welcomeActivity.getViewModelStore();
            default:
                return welcomeActivity.getDefaultViewModelCreationExtras();
        }
    }
}

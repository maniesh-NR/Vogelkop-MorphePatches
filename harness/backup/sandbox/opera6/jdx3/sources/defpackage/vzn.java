package defpackage;

import com.opera.android.startup.WelcomeActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class vzn implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ WelcomeActivity b;

    public /* synthetic */ vzn(WelcomeActivity welcomeActivity, byte b) {
        this.a = b;
        this.b = welcomeActivity;
    }

    public final Object get() {
        byte b = this.a;
        WelcomeActivity welcomeActivity = this.b;
        switch (b) {
            case 0:
                mcj mcjVar = welcomeActivity.r;
                if (mcjVar == null) {
                    return null;
                }
                return mcjVar;
            case 1:
                int i = WelcomeActivity.w;
                return welcomeActivity.a;
            case 2:
                int i2 = WelcomeActivity.w;
                return new ilm(welcomeActivity, (byte) 18);
            default:
                int i3 = WelcomeActivity.w;
                return new ttn(welcomeActivity, (byte) 3);
        }
    }
}

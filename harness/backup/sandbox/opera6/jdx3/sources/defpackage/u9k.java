package defpackage;

import com.opera.android.startup.WelcomeActivity;

/* loaded from: classes.dex */
public final class u9k {
    public final pde a;
    public tn b;

    /* JADX WARN: Multi-variable type inference failed */
    public u9k(WelcomeActivity welcomeActivity) {
        pde pdeVar = new pde(r9k.a);
        this.a = pdeVar;
        e7d.a(welcomeActivity, new wt2(this, (byte) 6));
        if (pdeVar.g() instanceof r9k) {
            welcomeActivity.getApplicationContext();
            this.b = new tn(new jri(this, welcomeActivity, (byte) 14));
        }
    }
}

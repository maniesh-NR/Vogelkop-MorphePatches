package defpackage;

import com.opera.android.settings.cleardata.OnboardingProfileReset;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class y25 extends r25 {
    public final /* synthetic */ byte f = 0;

    public y25() {
        super("RecentSearches", new rxh(2132020645), new rxh(2132020646), 2131232229, a35.g);
    }

    public /* synthetic */ y25(String str, rxh rxhVar, rxh rxhVar2, int i, a35 a35Var) {
        super(str, rxhVar, rxhVar2, i, a35Var);
    }

    @Override // defpackage.r25
    public final void a(s25 s25Var, Runnable runnable) {
        switch (this.f) {
            case 0:
                s25Var.e.b(runnable);
                break;
            default:
                new OnboardingProfileReset.Request(s25Var.b, new wx(s25Var, runnable, (byte) 27));
                break;
        }
    }

    @Override // defpackage.r25
    public final void c(s25 s25Var, Callback callback) {
        switch (this.f) {
            case 0:
                s28 s28Var = s25Var.e;
                k25 k25Var = new k25((iu2) callback, s25Var, (byte) 1);
                if (!s28Var.d) {
                    k25Var.run(0);
                    break;
                } else {
                    ((ko7) s28Var.h).f(new vr9(s28Var, k25Var));
                    break;
                }
            default:
                ((iu2) callback).run(s25Var.a.getString(2132018233));
                break;
        }
    }

    @Override // defpackage.r25
    public final boolean d(s25 s25Var) {
        switch (this.f) {
            case 1:
                return !s25Var.f.i("onboarding_deleted");
            default:
                return super.d(s25Var);
        }
    }
}

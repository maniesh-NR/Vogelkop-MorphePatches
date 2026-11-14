package defpackage;

import android.content.Context;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class aha implements bag {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ aha(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override // defpackage.bag
    public final b87 p(Context context, Runnable runnable, Runnable runnable2, Callback callback) {
        switch (this.a) {
            case 0:
                return new zga((vdf) runnable, (rl) runnable2, (o8f) callback);
            default:
                return new zga((rl) runnable2, (vdf) runnable, (o8f) callback);
        }
    }

    @Override // defpackage.bag
    public final void s() {
        byte b = this.a;
        nh4 nh4Var = this.b;
        switch (b) {
            case 0:
                nh4 nh4Var2 = nh4Var;
                if (nh4Var2.r() instanceof c0f) {
                    p0i p0iVar = t0i.b;
                    nh4Var2.resumeWith(Boolean.FALSE);
                    break;
                }
                break;
            default:
                ((vdf) nh4Var).run();
                break;
        }
    }

    @Override // defpackage.bag
    public final void t() {
        byte b = this.a;
        nh4 nh4Var = this.b;
        switch (b) {
            case 0:
                nh4 nh4Var2 = nh4Var;
                if (nh4Var2.r() instanceof c0f) {
                    p0i p0iVar = t0i.b;
                    nh4Var2.resumeWith(Boolean.TRUE);
                    break;
                }
                break;
            default:
                ((vdf) nh4Var).run();
                break;
        }
    }
}

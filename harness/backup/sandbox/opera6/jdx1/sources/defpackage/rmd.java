package defpackage;

import android.view.animation.Animation;
import androidx.mediarouter.app.d;

/* loaded from: classes.dex */
public final class rmd implements Animation.AnimationListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rmd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((d) obj).l(true);
                break;
            default:
                ond ondVar = ((nnd) obj).j;
                ondVar.z = false;
                ondVar.o();
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        byte b = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((nnd) this.b).j.z = true;
                break;
        }
    }
}

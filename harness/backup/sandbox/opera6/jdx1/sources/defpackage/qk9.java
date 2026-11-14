package defpackage;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class qk9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ qk9(Fragment fragment, byte b) {
        this.a = b;
        this.b = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Fragment fragment = this.b;
        switch (b) {
            case 0:
                fragment.startPostponedEnterTransition();
                break;
            default:
                fragment.callStartTransitionListener(false);
                break;
        }
    }
}

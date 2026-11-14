package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.fragment.app.Fragment;
import com.google.android.tv.ads.controls.ErrorMessageFragment;
import com.google.android.tv.ads.controls.WhyThisAdFragment;

/* loaded from: classes.dex */
public final class gqp extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ gqp(Fragment fragment, byte b) {
        this.a = b;
        this.b = fragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Fragment fragment = this.b;
        switch (b) {
            case 0:
                ((ErrorMessageFragment) fragment).requireActivity().finish();
                break;
            default:
                ((WhyThisAdFragment) fragment).requireActivity().finish();
                break;
        }
    }
}

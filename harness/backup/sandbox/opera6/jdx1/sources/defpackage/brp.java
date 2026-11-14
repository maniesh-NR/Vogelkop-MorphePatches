package defpackage;

import android.animation.AnimatorSet;

/* loaded from: classes.dex */
public final class brp extends gcf {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ AnimatorSet Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ brp(AnimatorSet animatorSet, byte b) {
        super(true);
        this.Y = b;
        this.Z = animatorSet;
    }

    @Override // defpackage.gcf
    public final void handleOnBackPressed() {
        byte b = this.Y;
        AnimatorSet animatorSet = this.Z;
        switch (b) {
            case 0:
                animatorSet.start();
                break;
            default:
                animatorSet.start();
                break;
        }
    }
}

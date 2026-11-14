package defpackage;

import android.animation.AnimatorSet;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class kop implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AnimatorSet b;

    public /* synthetic */ kop(AnimatorSet animatorSet, byte b) {
        this.a = b;
        this.b = animatorSet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        AnimatorSet animatorSet = this.b;
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

package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class yig extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uig b;
    public final /* synthetic */ zig c;

    public /* synthetic */ yig(zig zigVar, uig uigVar, byte b) {
        this.a = b;
        this.c = zigVar;
        this.b = uigVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        uig uigVar = this.b;
        zig zigVar = this.c;
        switch (b) {
            case 0:
                zigVar.h(1);
                if (zigVar.C) {
                    uigVar.post(zigVar.t);
                    zigVar.C = false;
                    break;
                }
                break;
            case 1:
                zigVar.h(2);
                if (zigVar.C) {
                    uigVar.post(zigVar.t);
                    zigVar.C = false;
                    break;
                }
                break;
            default:
                zigVar.h(2);
                if (zigVar.C) {
                    uigVar.post(zigVar.t);
                    zigVar.C = false;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        zig zigVar = this.c;
        switch (b) {
            case 0:
                zigVar.h(3);
                break;
            case 1:
                zigVar.h(3);
                break;
            default:
                zigVar.h(3);
                break;
        }
    }
}

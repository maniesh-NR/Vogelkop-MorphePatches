package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/* loaded from: classes.dex */
public final class d extends f {
    public final boolean b;
    public boolean c;
    public yqa d;

    public d(c0 c0Var, boolean z) {
        super(c0Var);
        this.b = z;
    }

    public final yqa b(Context context) throws Resources.NotFoundException {
        Animation animationLoadAnimation;
        yqa yqaVar;
        if (this.c) {
            return this.d;
        }
        c0 c0Var = this.a;
        Fragment fragment = c0Var.c;
        boolean z = c0Var.a == 2;
        int nextTransition = fragment.getNextTransition();
        int popEnterAnim = this.b ? z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z ? fragment.getEnterAnim() : fragment.getExitAnim();
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        yqa yqaVar2 = null;
        if (viewGroup != null && viewGroup.getTag(2131365029) != null) {
            fragment.mContainer.setTag(2131365029, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z, popEnterAnim);
            if (animationOnCreateAnimation != null) {
                yqaVar2 = new yqa(animationOnCreateAnimation);
            } else {
                Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z, popEnterAnim);
                if (animatorOnCreateAnimator != null) {
                    yqaVar2 = new yqa(animatorOnCreateAnimator);
                } else {
                    if (popEnterAnim == 0 && nextTransition != 0) {
                        popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z ? jpo.S(R.attr.activityOpenEnterAnimation, context) : jpo.S(R.attr.activityOpenExitAnimation, context) : z ? 2130837513 : 2130837514 : z ? jpo.S(R.attr.activityCloseEnterAnimation, context) : jpo.S(R.attr.activityCloseExitAnimation, context) : z ? 2130837511 : 2130837512 : z ? 2130837515 : 2130837516;
                    }
                    if (popEnterAnim != 0) {
                        boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                        if (zEquals) {
                            try {
                                animationLoadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                            } catch (Resources.NotFoundException e) {
                                throw e;
                            } catch (RuntimeException unused) {
                            }
                            if (animationLoadAnimation != null) {
                                yqaVar = new yqa(animationLoadAnimation);
                                yqaVar2 = yqaVar;
                            }
                        } else {
                            try {
                                Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                if (animatorLoadAnimator != null) {
                                    yqaVar = new yqa(animatorLoadAnimator);
                                    yqaVar2 = yqaVar;
                                }
                            } catch (RuntimeException e2) {
                                if (zEquals) {
                                    throw e2;
                                }
                                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                                if (animationLoadAnimation2 != null) {
                                    yqaVar2 = new yqa(animationLoadAnimation2);
                                }
                            }
                        }
                    }
                }
            }
        }
        this.d = yqaVar2;
        this.c = true;
        return yqaVar2;
    }
}

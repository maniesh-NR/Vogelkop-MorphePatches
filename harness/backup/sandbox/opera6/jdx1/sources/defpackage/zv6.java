package defpackage;

import android.animation.AnimatorSet;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class zv6 {
    public static final zv6 a = new zv6();

    public final void a(@NotNull AnimatorSet animatorSet) {
        animatorSet.reverse();
    }

    public final void b(@NotNull AnimatorSet animatorSet, long j) {
        animatorSet.setCurrentPlayTime(j);
    }
}

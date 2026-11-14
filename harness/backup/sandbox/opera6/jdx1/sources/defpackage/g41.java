package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g41 {
    public static final g41 a = new g41();

    public final void a(@NotNull View view, kmg kmgVar) {
        Context context = view.getContext();
        PointerIcon systemIcon = kmgVar instanceof o91 ? PointerIcon.getSystemIcon(context, ((o91) kmgVar).b) : PointerIcon.getSystemIcon(context, 1000);
        if (Intrinsics.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}

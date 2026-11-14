package defpackage;

import android.graphics.Path;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class f91 {
    public static final d91 a() {
        return new d91(new Path());
    }

    public static final void b(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}

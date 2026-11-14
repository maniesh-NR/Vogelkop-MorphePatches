package defpackage;

import android.os.ext.SdkExtensions;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class y04 {

    @NotNull
    public static final y04 a = new y04();

    private y04() {
    }

    public final int a(int i) {
        return SdkExtensions.getExtensionVersion(i);
    }
}

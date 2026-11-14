package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public enum vmn {
    NETWORK_ERROR("Failed to fetch wallpapers: %s"),
    INVALID_THEMES("Invalid themes: %s"),
    INVALID_WALLPAPERS("No valid wallpapers from list: %s");

    public final String a;

    vmn(String str) {
        this.a = str;
    }

    public final String d(Serializable serializable) {
        return String.format(Locale.ROOT, this.a, Arrays.copyOf(new Object[]{String.valueOf(serializable)}, 1));
    }
}

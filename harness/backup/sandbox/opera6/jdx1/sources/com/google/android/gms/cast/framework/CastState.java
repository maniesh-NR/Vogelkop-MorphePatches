package com.google.android.gms.cast.framework;

import androidx.annotation.NonNull;
import defpackage.p3p;
import java.util.Locale;

/* loaded from: classes.dex */
public final class CastState {
    public static final int CONNECTED = 4;
    public static final int CONNECTING = 3;
    public static final int NOT_CONNECTED = 2;
    public static final int NO_DEVICES_AVAILABLE = 1;

    private CastState() {
    }

    @NonNull
    public static String toString(int i) {
        if (i == 1) {
            return "NO_DEVICES_AVAILABLE";
        }
        if (i == 2) {
            return "NOT_CONNECTED";
        }
        if (i == 3) {
            return "CONNECTING";
        }
        if (i == 4) {
            return "CONNECTED";
        }
        Locale locale = Locale.ROOT;
        return p3p.i(i, "UNKNOWN_STATE(", ")");
    }
}

package com.opera.android.sync;

import androidx.annotation.NonNull;
import java.util.Date;

/* loaded from: classes.dex */
public final class SyncedSessionWindow {
    public final String a;
    public final long b;

    public SyncedSessionWindow(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        new Date(j2);
    }

    @NonNull
    public static SyncedSessionWindow create(@NonNull String str, long j, int i, int i2, long j2) {
        return new SyncedSessionWindow(str, j, j2);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof SyncedSessionWindow) && ((SyncedSessionWindow) obj).b == this.b;
    }

    public final int hashCode() {
        return (int) this.b;
    }
}

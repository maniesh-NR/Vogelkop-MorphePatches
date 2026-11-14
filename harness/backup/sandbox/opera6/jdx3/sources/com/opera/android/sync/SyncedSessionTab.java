package com.opera.android.sync;

import androidx.annotation.NonNull;
import java.util.Date;

/* loaded from: classes.dex */
public final class SyncedSessionTab {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;

    public SyncedSessionTab(String str, String str2, long j, long j2, long j3, String str3) {
        this.a = j;
        this.b = j2;
        new Date(j3);
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @NonNull
    public static SyncedSessionTab create(long j, long j2, @NonNull String str, long j3, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        return new SyncedSessionTab(str2, str3, j, j2, j3, str4);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SyncedSessionTab)) {
            return false;
        }
        SyncedSessionTab syncedSessionTab = (SyncedSessionTab) obj;
        return syncedSessionTab.a == this.a && syncedSessionTab.b == this.b;
    }

    public final int hashCode() {
        return ((int) this.a) + ((int) this.b);
    }
}

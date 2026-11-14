package com.opera.android.sync;

import androidx.annotation.NonNull;
import java.util.Date;

/* loaded from: classes.dex */
public final class SyncedSession {
    public final String a;
    public final String b;
    public final Date c;

    public SyncedSession(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = new Date(j);
    }

    @NonNull
    public static SyncedSession create(@NonNull String str, @NonNull String str2, int i, long j) {
        return new SyncedSession(str, str2, j);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof SyncedSession) && ((SyncedSession) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

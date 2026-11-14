package com.opera.android.history;

import J.N;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class HistoryManager {
    public long a = N.MTCPSh8F();
    public final a b = new a(this);

    public static class HistoryEntryArrayBuilder {
        public final NativeHistoryEntry[] a;

        public HistoryEntryArrayBuilder(int i) {
            this.a = new NativeHistoryEntry[i];
        }

        public final void set(int i, long j, @NonNull String str, @NonNull String str2, long j2, @NonNull String str3) {
            this.a[i] = new b(this, j, str, str2, j2, str3);
        }

        @NonNull
        public final NativeHistoryEntry[] toArray() {
            return this.a;
        }
    }

    public interface NativeHistoryEntry {
        String a();

        long b();

        long getId();

        String getTitle();

        String getUrl();
    }

    public static void run(@Nullable Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}

package com.opera.android.history;

import com.opera.android.history.HistoryManager;
import defpackage.zda;

/* loaded from: classes.dex */
public final class c extends zda {
    public final HistoryManager.NativeHistoryEntry a;

    public c(HistoryManager.NativeHistoryEntry nativeHistoryEntry) {
        this.a = nativeHistoryEntry;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}

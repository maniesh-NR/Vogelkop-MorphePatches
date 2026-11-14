package com.opera.android.history;

import com.opera.android.history.HistoryManager;

/* loaded from: classes.dex */
public final class b implements HistoryManager.NativeHistoryEntry {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;

    public b(HistoryManager.HistoryEntryArrayBuilder historyEntryArrayBuilder, long j, String str, String str2, long j2, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = str3;
    }

    @Override // com.opera.android.history.HistoryManager.NativeHistoryEntry
    public final String a() {
        return this.e;
    }

    @Override // com.opera.android.history.HistoryManager.NativeHistoryEntry
    public final long b() {
        return this.d;
    }

    @Override // com.opera.android.history.HistoryManager.NativeHistoryEntry
    public final long getId() {
        return this.a;
    }

    @Override // com.opera.android.history.HistoryManager.NativeHistoryEntry
    public final String getTitle() {
        return this.c;
    }

    @Override // com.opera.android.history.HistoryManager.NativeHistoryEntry
    public final String getUrl() {
        return this.b;
    }
}

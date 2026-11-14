package com.opera.android.history;

import J.N;
import com.opera.android.history.HistoryManager;
import org.chromium.base.Callback;

/* loaded from: classes.dex */
public final class a extends ekc implements Callback {
    public final /* synthetic */ HistoryManager l;

    public a(HistoryManager historyManager) {
        this.l = historyManager;
    }

    public final void l() {
        HistoryManager historyManager = this.l;
        N.MvugT_yT(historyManager.a, this);
        N.MjxAAgw2(historyManager.a, true);
    }

    public final void m() {
        HistoryManager historyManager = this.l;
        N.MvugT_yT(historyManager.a, (Object) null);
        N.MjxAAgw2(historyManager.a, false);
        r((Object) null);
    }

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public final void c(Object obj) {
        r((HistoryManager.NativeHistoryEntry[]) obj);
    }
}

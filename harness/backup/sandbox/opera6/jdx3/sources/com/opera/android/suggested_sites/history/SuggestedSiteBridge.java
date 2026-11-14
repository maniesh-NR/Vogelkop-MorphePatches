package com.opera.android.suggested_sites.history;

import androidx.annotation.NonNull;
import com.opera.api.Callback;
import defpackage.rqm;
import defpackage.wan;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class SuggestedSiteBridge {

    public static class HistoryArrayBuilder {
        public final ArrayList a;

        public HistoryArrayBuilder(int i) {
            this.a = new ArrayList(i);
        }

        public final void appendHistoryData(long j, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, long j2, long j3, long j4, long j5) {
            this.a.add(new rqm(j, str, str2, str3, str4, str5, str6, j4));
        }

        @NonNull
        public final List<rqm> result() {
            return this.a;
        }
    }

    public static class VisitArrayBuilder {
        public final ArrayList a;

        public VisitArrayBuilder(int i) {
            this.a = new ArrayList(i);
        }

        public final void appendVisitData(long j, long j2, long j3, long j4, int i) {
            this.a.add(new wan(j2, j3, i));
        }

        @NonNull
        public final List<wan> result() {
            return this.a;
        }
    }

    public static void callHistoryCallback(@NonNull Callback callback, @NonNull List<rqm> list) {
        callback.run(list);
    }

    public static void callVisitsCallback(@NonNull Callback callback, @NonNull List<wan> list) {
        callback.run(list);
    }

    @NonNull
    public static HistoryArrayBuilder getHistoryArrayBuilder(int i) {
        return new HistoryArrayBuilder(i);
    }

    @NonNull
    public static VisitArrayBuilder getVisitArrayBuilder(int i) {
        return new VisitArrayBuilder(i);
    }
}

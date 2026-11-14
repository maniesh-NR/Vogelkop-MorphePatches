package com.opera.android.continue_on_booking;

import J.N;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.eu5;
import defpackage.g7f;
import defpackage.gu5;
import defpackage.h7f;
import defpackage.hu5;
import defpackage.j8f;
import defpackage.ku5;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class NativeContinueOnBookingStorage {
    public EventHandler a;

    public static class EventHandler {
        public final h7f a = new h7f();

        public EventHandler() {
            N.MtZj_NMZ(this);
        }

        public final void onDataChanged() {
            h7f h7fVar = this.a;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ku5 ku5Var = ((eu5) g7fVarH.next()).a;
                ku5Var.f(new gu5(ku5Var, (byte) 2));
            }
        }
    }

    public static class NativeOffer implements j8f {
        public final Uri a;
        public final Uri b;
        public final String c;
        public final String d;
        public final String e;
        public final Double f;

        public NativeOffer(Uri uri, String str, Uri uri2, String str2, String str3, Double d) {
            this.a = uri;
            this.c = str;
            this.b = uri2;
            this.d = str2;
            this.e = str3;
            this.f = d;
        }

        @Override // defpackage.j8f
        public final String a() {
            return this.d;
        }

        @Override // defpackage.j8f
        public final Uri b() {
            return this.b;
        }

        @Override // defpackage.j8f
        public final String c() {
            return this.e;
        }

        @Override // defpackage.j8f
        public final Double d() {
            return this.f;
        }

        @Override // defpackage.j8f
        public final String getTitle() {
            return this.c;
        }

        @Override // defpackage.j8f
        public final Uri getUrl() {
            return this.a;
        }
    }

    public static class Request implements Runnable {
        public final hu5 a;

        public Request(hu5 hu5Var) {
            this.a = hu5Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            N.Mv3_1ixA("1759515", 30, this, NativeOffer.class);
        }
    }

    @NonNull
    public static NativeOffer createOffer(long j, @NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4, @Nullable String str5, double d, double d2) {
        return new NativeOffer(Uri.parse(str), str2, Uri.parse(str3), TextUtils.isEmpty(str4) ? null : str4, TextUtils.isEmpty(str5) ? null : str5, d >= 0.0d ? Double.valueOf(d) : null);
    }

    public static void response(@NonNull Request request, @NonNull NativeOffer[] nativeOfferArr) {
        request.a.run(Arrays.asList(nativeOfferArr));
    }
}

package com.opera.android.settings.cleardata;

import J.N;
import androidx.annotation.NonNull;
import defpackage.gh2;
import defpackage.oml;
import defpackage.umi;
import defpackage.vdf;
import defpackage.wx;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class OnboardingProfileReset {

    public static class Request {
        public final umi a;
        public final wx b;
        public oml c;
        public int d;
        public long e;

        public Request(umi umiVar, wx wxVar) {
            this.a = umiVar;
            this.b = wxVar;
            a();
        }

        public final void a() {
            if (this.e != 0) {
                return;
            }
            this.e = N.MHD5ixxA(this);
            oml omlVar = new oml(this.a.d(new vdf(this, (byte) 0)));
            this.c = omlVar;
            omlVar.b(null, 30L, TimeUnit.SECONDS, null);
        }
    }

    public static void onCompleted(@NonNull Request request, boolean z) {
        if (request.e == 0) {
            return;
        }
        request.e = 0L;
        oml omlVar = request.c;
        if (omlVar != null) {
            omlVar.cancel(false);
            request.c = null;
        }
        request.a.d(new gh2((byte) 7, request, z)).a(null);
    }
}

package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.leanplum.internal.Constants;
import com.opera.android.OperaApplication;
import com.opera.android.firebase.OperaFirebaseMessagingService;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes.dex */
public final class z9c implements w9c {
    public final Context a;

    public z9c(OperaApplication operaApplication) {
        this.a = operaApplication.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri a(android.content.Context r4, android.os.Bundle r5) {
        /*
            java.lang.String r0 = "_lpx"
            java.lang.String r5 = r5.getString(r0)
            r0 = 0
            if (r5 == 0) goto Lf
            orb r1 = new orb     // Catch: org.json.JSONException -> Lf
            r1.<init>(r5)     // Catch: org.json.JSONException -> Lf
            goto L10
        Lf:
            r1 = r0
        L10:
            if (r1 == 0) goto L2b
            java.lang.String r5 = "__name__"
            java.lang.String r5 = r1.m(r5, r0)
            if (r5 != 0) goto L1c
            r5 = 0
            goto L22
        L1c:
            java.lang.String r2 = "Open URL"
            boolean r5 = r5.equals(r2)
        L22:
            if (r5 == 0) goto L2b
            java.lang.String r5 = "URL"
            java.lang.String r5 = r1.m(r5, r0)
            goto L2c
        L2b:
            r5 = r0
        L2c:
            if (r5 == 0) goto L4b
            android.content.Context r4 = r4.getApplicationContext()
            c37 r1 = new c37
            t1 r2 = new t1
            r3 = 12
            r2.<init>(r4, r3)
            rqd r4 = new rqd
            r3 = 26
            r4.<init>(r3)
            r1.<init>(r2, r4)
            z0c r4 = r1.A(r5)
            if (r4 != 0) goto L4c
        L4b:
            return r0
        L4c:
            android.net.Uri r4 = android.net.Uri.parse(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z9c.a(android.content.Context, android.os.Bundle):android.net.Uri");
    }

    public static int b(Bundle bundle) {
        if (bundle == null) {
            return 1;
        }
        if (bundle.size() == 1 && bundle.containsKey(Constants.Keys.PUSH_VERSION)) {
            return 2;
        }
        hr5 hr5Var = y9c.a;
        String string = bundle.getString("category");
        hr5Var.getClass();
        return c(hr5.j(string));
    }

    public static int c(y9c y9cVar) {
        if (y9cVar == null || y9c.d == y9cVar || y9c.e == y9cVar || y9c.b == y9cVar || y9c.g == y9cVar) {
            return 1;
        }
        if (y9c.c == y9cVar) {
            return 3;
        }
        if (y9c.f == y9cVar) {
            return 4;
        }
        throw new RuntimeException(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(OperaFirebaseMessagingService operaFirebaseMessagingService, HashMap map, vn0 vn0Var) {
        String[] strArr = OperaApplication.K;
        ((OperaApplication) operaFirebaseMessagingService.getApplicationContext()).L().c.r0(e(map), vn0Var);
    }

    public static cm e(HashMap map) {
        int iC;
        String str = (String) map.get(Constants.Keys.PUSH_MESSAGE_ID_NO_MUTE_WITH_ACTION);
        if (str == null && (str = (String) map.get(Constants.Keys.PUSH_MESSAGE_ID_MUTE_WITH_ACTION)) == null && (str = (String) map.get(Constants.Keys.PUSH_MESSAGE_ID_NO_MUTE)) == null) {
            str = (String) map.get(Constants.Keys.PUSH_MESSAGE_ID_MUTE);
        }
        if (map.size() == 1 && map.containsKey(Constants.Keys.PUSH_VERSION)) {
            iC = 2;
        } else {
            hr5 hr5Var = y9c.a;
            String str2 = (String) map.get("category");
            hr5Var.getClass();
            iC = c(hr5.j(str2));
        }
        return new cm(str, iC, (byte) 3);
    }

    public final boolean h(Bundle bundle) {
        cm cmVar = new cm(bundle != null ? bundle.getString(Constants.Keys.PUSH_MESSAGE_ID) : null, b(bundle), (byte) 3);
        String[] strArr = OperaApplication.K;
        Context context = this.a;
        ((OperaApplication) context.getApplicationContext()).L().c.s0(cmVar, true);
        Uri uriA = a(context, bundle);
        if (uriA != null) {
            ((OperaApplication) context.getApplicationContext()).L().d.o0(cmVar.f(), uriA, sj0.b, xn0.f);
        }
        bundle.putLong("c.o.a.lp.created", SystemClock.uptimeMillis());
        if (!bundle.containsKey(Constants.Keys.PUSH_OCCURRENCE_ID) && !bundle.containsKey(Constants.Keys.LOCAL_PUSH_OCCURRENCE_ID)) {
            bundle.putString(Constants.Keys.PUSH_OCCURRENCE_ID, UUID.randomUUID().toString());
        }
        return true;
    }
}

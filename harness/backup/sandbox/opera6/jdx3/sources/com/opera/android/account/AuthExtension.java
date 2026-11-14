package com.opera.android.account;

import J.N;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.leanplum.internal.Constants;
import com.opera.android.OperaApplication;
import com.opera.android.oauth2.OAuth2Account;
import defpackage.cb;
import defpackage.db;
import defpackage.eme;
import defpackage.g7f;
import defpackage.h7f;
import defpackage.i7f;
import defpackage.myk;
import defpackage.orb;
import defpackage.yh2;
import defpackage.zh2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AuthExtension {
    public static final i7f a = new i7f();

    public static void emailVerified(@NonNull String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.isNull("user_id")) {
                throw new JSONException("Null field");
            }
            Object objU = orb.u(jSONObject.get("user_id"));
            if (objU == null) {
                throw new JSONException("user_id is null");
            }
            String strValueOf = String.valueOf(objU);
            Context context = t8.a;
            String[] strArr = OperaApplication.K;
            OAuth2Account oAuth2Account = ((OperaApplication) context.getApplicationContext()).b().c;
            String str2 = null;
            if (oAuth2Account != null) {
                long j = oAuth2Account.g;
                if (j != 0) {
                    str2 = (String) N.MIPULsoq(j);
                }
            }
            if (strValueOf.equals(str2)) {
                i7f i7fVar = a;
                i7fVar.getClass();
                g7f g7fVar = new g7f(i7fVar);
                while (g7fVar.hasNext()) {
                    zh2 zh2Var = (zh2) g7fVar.next();
                    if (zh2Var.b.i.d(qcc.e)) {
                        zh2Var.a.run();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }

    public static void getAccessToken(long j) {
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        db dbVarB = ((OperaApplication) context.getApplicationContext()).b();
        if (!dbVarB.d() && !dbVarB.e()) {
            N.MG9GgC1E(j, (Object) null);
            return;
        }
        eme emeVar = new eme(dbVarB, new yh2(j, (byte) 0));
        OAuth2Account oAuth2Account = dbVarB.c;
        if (oAuth2Account == null) {
            emeVar.b();
        } else {
            oAuth2Account.a(0, emeVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[PHI: r0
      0x0021: PHI (r0v1 java.lang.String) = (r0v0 java.lang.String), (r0v3 java.lang.String), (r0v4 java.lang.String), (r0v5 java.lang.String) binds: [B:3:0x0007, B:5:0x000f, B:7:0x0017, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void login(@androidx.annotation.NonNull java.lang.String r9, @androidx.annotation.Nullable java.lang.String r10, @androidx.annotation.NonNull java.lang.String r11, @androidx.annotation.NonNull java.lang.String r12) {
        /*
            java.lang.String r0 = "google"
            boolean r1 = r0.equals(r10)
            r2 = 0
            if (r1 != 0) goto L21
            java.lang.String r0 = "facebook"
            boolean r1 = r0.equals(r10)
            if (r1 != 0) goto L21
            java.lang.String r0 = "twitter"
            boolean r1 = r0.equals(r10)
            if (r1 != 0) goto L21
            java.lang.String r0 = "vk"
            boolean r1 = r0.equals(r10)
            if (r1 == 0) goto L23
        L21:
            r8 = r0
            goto L3a
        L23:
            java.lang.String r0 = "email"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L39
            java.lang.String r0 = "password"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L39
            java.lang.String r0 = "credentials"
            boolean r10 = r0.equals(r10)
        L39:
            r8 = r2
        L3a:
            android.content.Context r10 = t8.a
            java.lang.String[] r0 = com.opera.android.OperaApplication.K
            android.content.Context r10 = r10.getApplicationContext()
            com.opera.android.OperaApplication r10 = (com.opera.android.OperaApplication) r10
            db r3 = r10.b()
            boolean r10 = r11.isEmpty()
            if (r10 == 0) goto L50
            r6 = r2
            goto L51
        L50:
            r6 = r11
        L51:
            boolean r10 = r12.isEmpty()
            if (r10 == 0) goto L59
            r7 = r2
            goto L5a
        L59:
            r7 = r12
        L5a:
            r5 = 0
            r4 = r9
            r3.i(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.account.AuthExtension.login(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void logout(boolean z) {
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).b().j(z);
    }

    public static void upgradeSuccessful(@NonNull String str) throws JSONException {
        myk mykVarS;
        OAuth2Account oAuth2Account;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.isNull(Constants.Params.EMAIL)) {
                throw new JSONException("Null field");
            }
            Object objU = orb.u(jSONObject.get(Constants.Params.EMAIL));
            if (objU == null) {
                throw new JSONException("email is null");
            }
            String strValueOf = String.valueOf(objU);
            Object objOpt = jSONObject.opt("password");
            String strValueOf2 = (objOpt == null || objOpt == JSONObject.NULL) ? null : String.valueOf(objOpt);
            Context context = t8.a;
            String[] strArr = OperaApplication.K;
            db dbVarB = ((OperaApplication) context.getApplicationContext()).b();
            if (dbVarB.d()) {
                if (strValueOf2 != null) {
                    ((OperaApplication) context.getApplicationContext()).s().P(strValueOf, strValueOf2);
                }
            } else {
                if (strValueOf2 != null || !dbVarB.e() || (mykVarS = ((OperaApplication) t8.a.getApplicationContext()).s().s()) == null || (oAuth2Account = mykVarS.b.c) == null) {
                    return;
                }
                if (oAuth2Account.b() && ((SharedPreferences) oAuth2Account.a.a.get()).getString("pun_1", null) == null) {
                    return;
                }
                oAuth2Account.d(strValueOf);
                h7f h7fVar = ((db) oAuth2Account.b.c).e;
                h7fVar.getClass();
                g7f g7fVar = new g7f(h7fVar);
                while (g7fVar.hasNext()) {
                    ((cb) g7fVar.next()).f();
                }
            }
        } catch (JSONException unused) {
        }
    }
}

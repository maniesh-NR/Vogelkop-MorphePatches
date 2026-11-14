package com.opera.android.browser.minigame;

import android.content.Context;
import androidx.annotation.NonNull;
import com.leanplum.internal.Constants;
import com.leanplum.internal.RequestBuilder;
import com.opera.android.OperaApplication;
import defpackage.ck0;
import defpackage.o02;
import defpackage.orb;
import defpackage.x56;
import defpackage.x5f;
import defpackage.zpa;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class MinigameExtension {
    public static void report(@NonNull String str, @NonNull String str2, @NonNull String str3) throws JSONException {
        Context context = t8.a;
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
        zpa zpaVar = x5fVar.d;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object objU = orb.u(jSONObject.get(Constants.Params.EVENT));
            if (objU == null) {
                throw new JSONException("event is null");
            }
            String strValueOf = String.valueOf(objU);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode == -541203492) {
                if (strValueOf.equals("completion")) {
                    long j = jSONObject.getLong("score");
                    if (x5fVar.h) {
                        x56 x56VarF = zpa.F();
                        new ck0(zpaVar, x56VarF).d().a(new o02(str2, str3, j, (byte) 4));
                        x5fVar.U0(x56VarF);
                        return;
                    }
                    return;
                }
                return;
            }
            if (iHashCode == 109757538) {
                if (strValueOf.equals(RequestBuilder.ACTION_START) && x5fVar.h) {
                    x56 x56VarF2 = zpa.F();
                    new ck0(zpaVar, x56VarF2).d().a(new v2e(str2, str3, false));
                    x5fVar.U0(x56VarF2);
                    return;
                }
                return;
            }
            if (iHashCode == 1097506319 && strValueOf.equals(RequestBuilder.ACTION_RESTART) && x5fVar.h) {
                x56 x56VarF3 = zpa.F();
                new ck0(zpaVar, x56VarF3).d().a(new v2e(str2, str3, true));
                x5fVar.U0(x56VarF3);
            }
        } catch (JSONException unused) {
        }
    }
}

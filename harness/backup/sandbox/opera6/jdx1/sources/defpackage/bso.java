package defpackage;

import ads_mobile_sdk.bw2;
import ads_mobile_sdk.ji;
import ads_mobile_sdk.q6;
import ads_mobile_sdk.r6;
import ads_mobile_sdk.s6;
import ads_mobile_sdk.v52;
import ads_mobile_sdk.v62;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bso extends v52 {
    public final HashSet c;
    public final JSONObject d;
    public final long e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bso(ji jiVar, HashSet hashSet, JSONObject jSONObject, long j, byte b) {
        super(jiVar);
        this.f = b;
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        byte b = this.f;
        JSONObject jSONObject = this.d;
        switch (b) {
            case 0:
                break;
            default:
                ji jiVar = this.b;
                if (!v62.c(jSONObject, (JSONObject) jiVar.a)) {
                    jiVar.a = jSONObject;
                    break;
                }
                break;
        }
        return jSONObject.toString();
    }

    @Override // ads_mobile_sdk.v52, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f) {
            case 0:
                onPostExecute((String) obj);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }

    @Override // ads_mobile_sdk.v52
    public final void onPostExecute(String str) {
        r6 r6Var;
        byte b = this.f;
        long j = this.e;
        HashSet hashSet = this.c;
        switch (b) {
            case 0:
                r6 r6Var2 = r6.c;
                if (r6Var2 != null) {
                    for (q6 q6Var : Collections.unmodifiableCollection(r6Var2.a)) {
                        if (hashSet.contains(q6Var.g)) {
                            s6 s6Var = q6Var.d;
                            if (j >= s6Var.d && s6Var.c != 3) {
                                s6Var.c = (byte) 3;
                                bw2.a$1.a((WebView) s6Var.b.get(), "setNativeViewHierarchy", str, s6Var.a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (r6Var = r6.c) != null) {
                    for (q6 q6Var2 : Collections.unmodifiableCollection(r6Var.a)) {
                        if (hashSet.contains(q6Var2.g)) {
                            s6 s6Var2 = q6Var2.d;
                            if (j >= s6Var2.d) {
                                s6Var2.c = (byte) 2;
                                bw2.a$1.a((WebView) s6Var2.b.get(), "setNativeViewHierarchy", str, s6Var2.a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }
}

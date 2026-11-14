package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.leanplum.internal.Constants;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q1c extends lze {
    public final Context c;
    public final p1c d;

    public q1c(Context context, p1c p1cVar) {
        super(p1cVar);
        this.c = context.getApplicationContext();
        this.d = p1cVar;
    }

    @Override // defpackage.lze
    public final void b(Object obj) throws JSONException {
        l0c l0cVarE = e();
        Context context = this.c;
        p1c p1cVar = this.d;
        if (l0cVarE != null) {
            p1cVar.g(l0cVarE);
            String[] strArr = OperaApplication.K;
            y9j y9jVar = ((OperaApplication) context.getApplicationContext()).J().a;
            y9jVar.remove("discover_selected_country");
            y9jVar.remove("discover_selected_language");
        }
        l0c l0cVarD = d();
        if (l0cVarD != null) {
            p1cVar.g(l0cVarD);
            String[] strArr2 = OperaApplication.K;
            ((OperaApplication) context.getApplicationContext()).J().a.remove("news_server_configuration_user_choice");
        }
    }

    public final l0c d() throws JSONException {
        String[] strArr = OperaApplication.K;
        String strZ = ((OperaApplication) this.c.getApplicationContext()).J().z("news_server_configuration_user_choice");
        if (TextUtils.isEmpty(strZ)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strZ);
            if (!jSONObject.isNull("language") && !jSONObject.isNull(Constants.Keys.COUNTRY)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("language");
                JSONObject jSONObject3 = jSONObject.getJSONObject(Constants.Keys.COUNTRY);
                if (!jSONObject2.isNull("code") && !jSONObject3.isNull("code")) {
                    return new l0c(jSONObject3.getString("code"), jSONObject2.getString("code"));
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public final l0c e() {
        String[] strArr = OperaApplication.K;
        SettingsManager settingsManagerJ = ((OperaApplication) this.c.getApplicationContext()).J();
        String strZ = settingsManagerJ.z("discover_selected_country");
        String strZ2 = settingsManagerJ.z("discover_selected_language");
        if (TextUtils.isEmpty(strZ) || TextUtils.isEmpty(strZ2)) {
            return null;
        }
        return new l0c(strZ, strZ2);
    }
}

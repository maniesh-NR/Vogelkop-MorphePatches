package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.opera.android.suggestion.Suggestion;
import com.opera.android.suggestion.SuggestionProviderBridge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o6m extends SuggestionProviderBridge {
    public final m6m d;

    public o6m(m6m m6mVar) {
        super(20);
        this.d = m6mVar;
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void cancel() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void g(String str, boolean z, boolean z2, yv4 yv4Var) {
        List<j6m> list;
        ?? arrayList;
        if (!TextUtils.isEmpty(str)) {
            yv4Var.d(Collections.EMPTY_LIST);
            return;
        }
        m6m m6mVar = this.d;
        if (m6mVar.c == null) {
            list = Collections.EMPTY_LIST;
        } else {
            int i = m6mVar.p;
            if ((i == 0 || vep.A(i) != 0) ? false : dti.a(m6mVar.h.b().a(2, p6l.a, ""))) {
                qq8 qq8Var = m6mVar.d;
                if (qq8Var == null) {
                    SharedPreferences sharedPreferences = (SharedPreferences) m6mVar.a.get();
                    String string = sharedPreferences.getString("trending", "");
                    if (string.isEmpty()) {
                        arrayList = Collections.EMPTY_LIST;
                        qq8 qq8Var2 = new qq8((List) arrayList, sharedPreferences.getLong("expires", 0L), new k6m(sharedPreferences.getString("country_code", null), sharedPreferences.getString("language_code", null)));
                        m6mVar.d = qq8Var2;
                        qq8Var = qq8Var2;
                    } else {
                        try {
                            JSONArray jSONArray = new JSONArray(string);
                            arrayList = new ArrayList(jSONArray.length());
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                                if (jSONObjectOptJSONObject != null) {
                                    String strOptString = jSONObjectOptJSONObject.optString("search");
                                    arrayList.add(new j6m(jSONObjectOptJSONObject.getString("query"), strOptString != null ? Uri.parse(strOptString) : null));
                                } else {
                                    arrayList.add(new j6m(jSONArray.getString(i2), null));
                                }
                            }
                        } catch (JSONException unused) {
                        }
                        qq8 qq8Var22 = new qq8((List) arrayList, sharedPreferences.getLong("expires", 0L), new k6m(sharedPreferences.getString("country_code", null), sharedPreferences.getString("language_code", null)));
                        m6mVar.d = qq8Var22;
                        qq8Var = qq8Var22;
                    }
                }
                list = (List) qq8Var.b;
            } else {
                list = Collections.EMPTY_LIST;
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        for (j6m j6mVar : list) {
            String str2 = j6mVar.a;
            Uri uri = j6mVar.b;
            arrayList2.add(new Suggestion(10, str2, "", uri != null ? uri.toString() : "", null, null, 1000, "", 0, -1, null));
        }
        yv4Var.d(arrayList2);
    }
}

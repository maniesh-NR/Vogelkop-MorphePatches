package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n6m implements Runnable {
    public final /* synthetic */ n9h a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ long c;

    public n6m(qsh qshVar, n9h n9hVar, ArrayList arrayList, long j) {
        this.a = n9hVar;
        this.b = arrayList;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis() + this.c;
        n9h n9hVar = this.a;
        m6m m6mVar = (m6m) n9hVar.c;
        m6mVar.e = null;
        x5f x5fVar = m6mVar.b;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (x5fVar.h) {
            z56 z56Var = new z56(2443, 1, 21);
            z56Var.p(10, 1, size);
            x56 x56VarF = zpa.F();
            x56VarF.q(19, 1, z56Var);
            x5fVar.U0(x56VarF);
        }
        m6mVar.d = new qq8(arrayList, jCurrentTimeMillis, (k6m) n9hVar.b);
        SharedPreferences.Editor editorEdit = ((SharedPreferences) m6mVar.a.get()).edit();
        List<j6m> list = (List) m6mVar.d.b;
        JSONArray jSONArray = new JSONArray();
        for (j6m j6mVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("query", j6mVar.a);
                Uri uri = j6mVar.b;
                if (uri != null) {
                    jSONObject.put("search", uri.toString());
                }
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        editorEdit.putString("trending", jSONArray.toString()).putLong("expires", m6mVar.d.a).putString("country_code", ((k6m) m6mVar.d.c).a).putString("language_code", ((k6m) m6mVar.d.c).b).apply();
    }
}

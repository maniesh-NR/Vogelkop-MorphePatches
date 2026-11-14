package defpackage;

import android.content.Context;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pd7 extends ldk {
    public final String j;
    public final int k;
    public final ulp l;
    public final Context m;
    public Map n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd7(Context context, umi umiVar) {
        super(umiVar);
        r16 r16Var = ngh.a;
        this.j = "newsfeed_article_domains.json";
        this.k = 2;
        this.l = u55.Ro;
        this.m = context.getApplicationContext();
    }

    @Override // defpackage.ldk
    public final Object a() throws JSONException, IOException {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.m.openFileInput(this.j), Charsets.UTF_8), 8192);
            try {
                String strL = dgh.l(bufferedReader);
                bufferedReader.close();
                JSONArray jSONArray = new JSONArray(strL);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    Object objU = orb.u(jSONObject.get("domain"));
                    if (objU == null) {
                        throw new JSONException("domain is null");
                    }
                    linkedHashMap.put(String.valueOf(objU), new od7(jSONObject.getLong("expireTime")));
                }
                return linkedHashMap;
            } finally {
            }
        } catch (FileNotFoundException | IOException | JSONException unused) {
            return null;
        }
    }

    @Override // defpackage.ldk
    public final void b(Object obj) throws IOException {
        Map map = (Map) obj;
        vpb vpbVar = new vpb();
        if (map != null) {
            map.forEach(new by1(new whf(vpbVar, (byte) 21), (byte) 2));
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(this.m.openFileOutput(this.j, 0), Charsets.UTF_8), 8192);
            try {
                bufferedWriter.write(vpbVar.a.toString());
                bufferedWriter.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.ldk
    public final int c() {
        return this.k;
    }

    @Override // defpackage.ldk
    public final void d(Object obj) {
        Set setEntrySet;
        Map linkedHashMap = (Map) obj;
        this.l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (linkedHashMap != null && (setEntrySet = linkedHashMap.entrySet()) != null) {
            setEntrySet.removeIf(new zx1(new x41(jCurrentTimeMillis, (byte) 3), (byte) 8));
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        this.n = linkedHashMap;
    }
}

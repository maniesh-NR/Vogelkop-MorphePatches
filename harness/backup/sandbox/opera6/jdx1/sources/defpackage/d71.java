package defpackage;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class d71 {
    public final long a;
    public final ra7 b;
    public final Charset c;
    public final String d;

    public d71(long j, ra7 ra7Var) {
        this.a = j;
        this.b = ra7Var;
        Charset charset = Charsets.UTF_8;
        this.c = charset;
        this.d = sko.j("application/json; charset=", charset.name());
    }

    public static InputStream b(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getResponseCode() < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
    }

    public static Map c(Map map) {
        String lowerCase;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = "";
            if (str == null || (lowerCase = str.toLowerCase(Locale.ROOT)) == null) {
                lowerCase = "";
            }
            String str3 = (String) CollectionsKt.firstOrNull((List) entry.getValue());
            if (str3 != null) {
                str2 = str3;
            }
            arrayList.add(new Pair(lowerCase, str2));
        }
        return rbd.h(arrayList);
    }

    public static gqa d(HttpURLConnection httpURLConnection) {
        gqa gqaVar;
        try {
            try {
                httpURLConnection.connect();
                gqaVar = new gqa(httpURLConnection.getResponseCode(), new String(aib.E(b(httpURLConnection)), Charsets.UTF_8), c(httpURLConnection.getHeaderFields()));
            } finally {
            }
        } catch (FileNotFoundException unused) {
            gqaVar = new gqa(403, "", n08.a);
        }
        try {
            p0i p0iVar = t0i.b;
            b(httpURLConnection).close();
        } catch (Throwable unused2) {
            p0i p0iVar2 = t0i.b;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Throwable unused3) {
            p0i p0iVar3 = t0i.b;
        }
        return gqaVar;
    }

    public final HttpURLConnection a(String str, LinkedHashMap linkedHashMap) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        int i = (int) this.a;
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestProperty("Accept", this.d);
        return httpURLConnection;
    }
}

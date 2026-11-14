package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.chromium.content_public.common.ResourceRequestBody;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* loaded from: classes.dex */
public class ksc {
    public String a;
    public Origin b;
    public boolean c;
    public int d;
    public cm e;
    public HashMap f;
    public String g;
    public int h;
    public ResourceRequestBody i;
    public boolean j;
    public boolean k;
    public boolean l;

    public ksc(String str, int i) {
        this.a = str;
        this.d = i;
        this.c = false;
        this.h = 0;
        this.i = null;
    }

    public ksc(GURL gurl, int i) {
        this(gurl.g(), i);
    }

    public final String a() {
        if (this.f == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : this.f.entrySet()) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(((String) entry.getKey()).toLowerCase(Locale.US));
            sb.append(":");
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }
}

package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i8f {
    public final String a;
    public final l1b b;

    public i8f(String str, HashMap map) {
        this.a = str;
        this.b = l1b.h(map);
    }

    public static i8f a(Uri uri) throws gva {
        Uri uriNormalizeScheme = uri.normalizeScheme();
        if (uriNormalizeScheme.isOpaque()) {
            uriNormalizeScheme = Uri.parse(uriNormalizeScheme.toString().replaceFirst(":", "://"));
        }
        if (!uriNormalizeScheme.isHierarchical() || !"ofa".equals(uriNormalizeScheme.getScheme())) {
            throw new gva("Unexpected uri scheme");
        }
        String host = uriNormalizeScheme.getHost();
        String[] strArr = aik.a;
        if (host == null) {
            host = "";
        }
        String path = uriNormalizeScheme.getPath();
        String strConcat = host.concat(path != null ? path : "");
        if (strConcat.startsWith("/")) {
            throw new gva("Unexpected start '/'");
        }
        if (strConcat.contains("//")) {
            throw new gva("Unexpected empty segment");
        }
        if (strConcat.endsWith("/")) {
            throw new gva("Unexpected end '/'");
        }
        boolean zEquals = "sdx".equals(strConcat);
        HashMap map = new HashMap();
        for (String str : wqm.n(uriNormalizeScheme)) {
            String queryParameter = uriNormalizeScheme.getQueryParameter(str);
            if (str.length() <= 0 || queryParameter == null || (!zEquals && queryParameter.length() <= 0)) {
                throw new gva("Invalid key or value");
            }
            map.put(str, queryParameter);
        }
        return new i8f(strConcat, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i8f.class != obj.getClass()) {
            return false;
        }
        i8f i8fVar = (i8f) obj;
        return this.a.equals(i8fVar.a) && na2.s(this.b, i8fVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        Uri.Builder builderBuildUpon = Uri.parse("ofa://".concat(this.a)).buildUpon();
        q4 q4VarN = this.b.j().n();
        while (true) {
            q4 q4Var = q4VarN;
            if (!q4Var.hasNext()) {
                return builderBuildUpon.toString();
            }
            Map.Entry entry = (Map.Entry) q4Var.next();
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
    }
}

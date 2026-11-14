package ads_mobile_sdk;

import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class y01 {
    public static final Pattern c = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);
    public static final Pattern d = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
    public static final Pattern e = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>[.\\s]*<\\s*html[^>]*>", 2);
    public static final Pattern f = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>[.\\s]*<\\s*html[^>]*>[.\\s]*<\\s*head[^>]*>", 2);
    public final qr0 a;
    public final String b;

    public y01(qr0 qr0Var, String str) {
        this.a = qr0Var;
        this.b = str;
    }

    public static String a(String str, String str2) {
        return StringsKt.l0("\n      <script>Object.defineProperty(window,'" + str + "',{get:function(){return " + str2 + "}});</script>\n    ").toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[PHI: r0
      0x0049: PHI (r0v4 java.lang.Integer) = (r0v3 java.lang.Integer), (r0v10 java.lang.Integer), (r0v17 java.lang.Integer) binds: [B:7:0x0018, B:12:0x0030, B:17:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r4, java.util.List r5) {
        /*
            java.util.regex.Pattern r0 = ads_mobile_sdk.y01.f
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r1 = r0.find()
            r2 = 0
            if (r1 == 0) goto L16
            int r0 = r0.end()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L17
        L16:
            r0 = r2
        L17:
            r1 = 0
            if (r0 != 0) goto L49
            java.util.regex.Pattern r0 = ads_mobile_sdk.y01.e
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r3 = r0.find()
            if (r3 == 0) goto L2f
            int r0 = r0.end()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L30
        L2f:
            r0 = r2
        L30:
            if (r0 != 0) goto L49
            java.util.regex.Pattern r0 = ads_mobile_sdk.y01.d
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r3 = r0.find()
            if (r3 == 0) goto L46
            int r0 = r0.end()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L46:
            if (r2 == 0) goto L4e
            r0 = r2
        L49:
            int r0 = r0.intValue()
            goto L5c
        L4e:
            java.util.regex.Pattern r0 = ads_mobile_sdk.y01.c
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r0 = r0.find()
            if (r0 == 0) goto L5b
            return r4
        L5b:
            r0 = r1
        L5c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r1 = r4.substring(r1, r0)
            r2.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L69:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            r2.append(r1)
            goto L69
        L79:
            java.lang.String r4 = r4.substring(r0)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.y01.a(java.lang.String, java.util.List):java.lang.String");
    }

    public final String a(a2 a2Var) {
        qr0 qr0Var = this.a;
        qr0Var.getClass();
        if (!((Boolean) qr0Var.a("gads:omid_javascript_session_service:enabled", Boolean.FALSE, fo.a)).booleanValue() || !a2Var.O) {
            return null;
        }
        j82 j82Var = a2Var.S;
        if (j82Var.c) {
            return a("GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV", new m5a().g(rbd.c(new Pair[]{new Pair("creativeType", (j82Var.a == i82.a ? t00.e : t00.c).a), new Pair("contentUrl", a2Var.x)})));
        }
        return null;
    }
}

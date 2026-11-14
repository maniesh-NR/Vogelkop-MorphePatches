package defpackage;

import J.N;
import android.net.Uri;
import android.text.TextUtils;
import com.leanplum.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public abstract class wqm {
    public static final String[] a = {"/ofa/ofa", "/ofa/ofa/config-bundle"};
    public static final String[] b = {"https", "http"};
    public static final String[] c = {"m.", "mobile."};
    public static final Set d;
    public static final String[] e;
    public static final String[] f;
    public static final String[] g;
    public static final Pattern h;

    static {
        Object[] objArr = {Constants.Params.DATA, "filesystem", "http", "https"};
        HashSet hashSet = new HashSet(4);
        for (int i = 0; i < 4; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                qp2.o(rfp.o(obj, "duplicate element: "));
                return;
            }
        }
        d = Collections.unmodifiableSet(hashSet);
        List listAsList = Arrays.asList("https", "http");
        f = l(listAsList, Arrays.asList("www."));
        String[] strArr = c;
        ArrayList arrayList = new ArrayList(4);
        arrayList.add("www.");
        arrayList.add("app.");
        arrayList.addAll(Arrays.asList(strArr));
        e = (String[]) arrayList.toArray(new String[0]);
        g = l(listAsList, arrayList);
        h = Pattern.compile("%[0-9a-fA-F]{2}");
    }

    public static boolean A(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        return lowerCase.startsWith("opera:") || lowerCase.startsWith("about:") || lowerCase.startsWith("chrome:");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.lqm B(int r5) {
        /*
            r0 = r5 & 255(0xff, float:3.57E-43)
            lqm r1 = defpackage.lqm.i
            r2 = 134217728(0x8000000, float:3.85186E-34)
            if (r0 == 0) goto L3e
            r3 = 1
            r4 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 == r3) goto L32
            r2 = 2
            if (r0 == r2) goto L2f
            r2 = 5
            if (r0 == r2) goto L26
            r5 = 6
            if (r0 == r5) goto L23
            r5 = 7
            if (r0 == r5) goto L20
            r5 = 8
            if (r0 != r5) goto L3c
            lqm r5 = defpackage.lqm.j
            goto L4e
        L20:
            lqm r5 = defpackage.lqm.B
            goto L4e
        L23:
            lqm r5 = defpackage.lqm.o
            goto L4e
        L26:
            r5 = r5 & r4
            if (r5 != r4) goto L2c
            lqm r5 = defpackage.lqm.b
            goto L4e
        L2c:
            lqm r5 = defpackage.lqm.k
            goto L4e
        L2f:
            lqm r5 = defpackage.lqm.g
            goto L4e
        L32:
            r0 = r5 & r4
            if (r0 == r4) goto L39
            r5 = r5 & r2
            if (r5 != r2) goto L3c
        L39:
            lqm r5 = defpackage.lqm.a
            goto L4e
        L3c:
            r5 = 0
            goto L4e
        L3e:
            r0 = r5 & r2
            if (r0 != r2) goto L44
            r5 = r1
            goto L4e
        L44:
            r0 = 4194304(0x400000, float:5.877472E-39)
            r5 = r5 & r0
            if (r5 != r0) goto L4c
            lqm r5 = defpackage.lqm.p
            goto L4e
        L4c:
            lqm r5 = defpackage.lqm.d
        L4e:
            if (r5 != 0) goto L51
            return r1
        L51:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqm.B(int):lqm");
    }

    public static String C(String str) {
        return str.startsWith("chrome:") ? "opera".concat(str.substring(6)) : str;
    }

    public static boolean D(Uri uri) {
        return "http".equals(uri.getScheme()) || "https".equals(uri.getScheme());
    }

    public static Uri E(Uri uri, String str, String str2) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        if (str2.equals(queryParameter)) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str3 : n(uri)) {
            if (str3.equals(str)) {
                builderBuildUpon.appendQueryParameter(str, str2);
            } else {
                Iterator it = o(uri, str3).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str3, (String) it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static boolean F(String str, boolean z) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (int i = 0; i < 2; i++) {
            String strU = b[i];
            if (z) {
                strU = sko.u(strU, "://");
            }
            if (lowerCase.startsWith(strU)) {
                return true;
            }
        }
        return false;
    }

    public static String G(String str) {
        String strS = aik.s(str, b);
        return strS.startsWith("://") ? strS.substring(3) : strS;
    }

    public static String H(String str) {
        if (str.length() <= 1000) {
            return str;
        }
        return str.substring(0, Character.isHighSurrogate(str.charAt(999)) ? 999 : 1000).concat("…");
    }

    public static String I(String str) {
        String[] strArr = {"sms", "smsto", "tel", "http", "https", "javascript"};
        Uri uri = Uri.parse(str);
        for (int i = 0; i < 6; i++) {
            if (strArr[i].equalsIgnoreCase(uri.getScheme()) && uri.isOpaque()) {
                return uri.buildUpon().encodedOpaquePart("//" + uri.getEncodedSchemeSpecificPart()).build().toString();
            }
        }
        return str;
    }

    public static boolean J(String str, String str2, boolean z, boolean z2) {
        String[] strArr = z ? g : f;
        return j(str, strArr, z2).equals(j(str2, strArr, z2));
    }

    public static URI a(String str, String str2) {
        try {
            URI uri = new URI(str2);
            if (uri.getScheme() != null) {
                return uri;
            }
            return new URI(str + str2);
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public static GURL b(String str, String str2) {
        URI uriA = a(str, str2);
        if (uriA != null) {
            str2 = uriA.toString();
        }
        return new GURL(str2);
    }

    public static String c(String str) {
        String strSubstring;
        if (str.startsWith("opera://")) {
            if (v(str)) {
                strSubstring = str.substring(4);
                if (strSubstring.startsWith("//")) {
                    strSubstring = strSubstring.substring(2);
                }
            } else {
                strSubstring = str.startsWith("opera://") ? str.substring(8) : str;
            }
            if (!strSubstring.startsWith("push/")) {
                return "ofa://ui/".concat(strSubstring);
            }
        }
        return str;
    }

    public static String d(String str) {
        return new Uri.Builder().scheme("operaui").authority(str).build().toString();
    }

    public static String e(String str) throws NumberFormatException {
        Matcher matcher = h.matcher(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        StringBuilder sb = new StringBuilder();
        int iEnd = 0;
        while (matcher.find()) {
            int i = Integer.parseInt(str.substring(matcher.start() + 1, matcher.end()), 16);
            if ("!#$%&'()*+,/.;=?@[]".indexOf(i) == -1) {
                if (iEnd != matcher.start()) {
                    sb.append(byteArrayOutputStream.toString());
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    sb.append(str.substring(iEnd, matcher.start()));
                }
                byteArrayOutputStream.write(i);
                iEnd = matcher.end();
            }
        }
        sb.append(byteArrayOutputStream.toString());
        sb.append(str.substring(iEnd, str.length()));
        return sb.toString();
    }

    public static lsc f(String str, sqh sqhVar, lqm lqmVar) {
        if (str == null) {
            return null;
        }
        GURL gurl = (GURL) N.MxvwDZcS(str);
        if (!gurl.b) {
            return null;
        }
        lsc lscVar = new lsc(gurl.g(), 0);
        g(lscVar, sqhVar, lqmVar);
        return lscVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(defpackage.lsc r12, defpackage.sqh r13, defpackage.lqm r14) {
        /*
            java.lang.String r0 = r12.a
            java.lang.String r1 = "opera:"
            boolean r0 = r0.startsWith(r1)
            r1 = 5
            if (r0 == 0) goto L19
            java.lang.String r0 = r12.a
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r2 = "chrome"
            java.lang.String r0 = r2.concat(r0)
            r12.a = r0
        L19:
            r0 = 1
            r2 = 3
            r3 = 4
            r4 = 6
            r5 = 7
            r6 = 8
            r7 = 0
            r8 = 2
            if (r13 == 0) goto L4d
            cm r9 = new cm
            java.lang.String r10 = r13.a
            com.opera.android.browser.Referrer$Policy r13 = r13.b
            int[] r11 = defpackage.vz4.a
            int r13 = r13.ordinal()
            r13 = r11[r13]
            switch(r13) {
                case 1: goto L47;
                case 2: goto L45;
                case 3: goto L43;
                case 4: goto L41;
                case 5: goto L3f;
                case 6: goto L3d;
                case 7: goto L3b;
                case 8: goto L39;
                case 9: goto L37;
                default: goto L35;
            }
        L35:
            r13 = -1
            goto L48
        L37:
            r13 = r6
            goto L48
        L39:
            r13 = r5
            goto L48
        L3b:
            r13 = r4
            goto L48
        L3d:
            r13 = r1
            goto L48
        L3f:
            r13 = r8
            goto L48
        L41:
            r13 = r3
            goto L48
        L43:
            r13 = r2
            goto L48
        L45:
            r13 = r0
            goto L48
        L47:
            r13 = r7
        L48:
            r9.<init>(r10, r13, r6)
            r12.e = r9
        L4d:
            int r13 = r14.ordinal()
            if (r13 == 0) goto L9b
            if (r13 == r0) goto L95
            if (r13 == r8) goto L92
            if (r13 == r2) goto L8f
            if (r13 == r3) goto L8c
            if (r13 == r1) goto L8c
            r14 = 26
            if (r13 == r14) goto L89
            switch(r13) {
                case 7: goto L8f;
                case 8: goto L8f;
                case 9: goto L8f;
                case 10: goto L8f;
                case 11: goto L84;
                case 12: goto L81;
                case 13: goto L89;
                case 14: goto L7e;
                case 15: goto L7e;
                case 16: goto L8f;
                case 17: goto L8c;
                default: goto L64;
            }
        L64:
            switch(r13) {
                case 29: goto L7e;
                case 30: goto L79;
                case 31: goto L7e;
                case 32: goto L7e;
                case 33: goto L7e;
                case 34: goto L9b;
                case 35: goto L8f;
                case 36: goto L8f;
                case 37: goto L8f;
                case 38: goto L8f;
                case 39: goto L8f;
                case 40: goto L8f;
                case 41: goto L8f;
                case 42: goto L8f;
                case 43: goto L8f;
                case 44: goto L8f;
                case 45: goto L76;
                case 46: goto L8c;
                case 47: goto L92;
                case 48: goto L8f;
                case 49: goto L95;
                default: goto L67;
            }
        L67:
            switch(r13) {
                case 51: goto L8f;
                case 52: goto L70;
                case 53: goto L8f;
                case 54: goto L8f;
                case 55: goto L8f;
                case 56: goto L6b;
                default: goto L6a;
            }
        L6a:
            return
        L6b:
            r13 = 2097152(0x200000, float:2.938736E-39)
            r12.d = r13
            return
        L70:
            r13 = 2097154(0x200002, float:2.938739E-39)
            r12.d = r13
            return
        L76:
            r12.d = r5
            return
        L79:
            r13 = 4194304(0x400000, float:5.877472E-39)
            r12.d = r13
            return
        L7e:
            r12.d = r4
            return
        L81:
            r12.d = r6
            return
        L84:
            r13 = 134217728(0x8000000, float:3.85186E-34)
            r12.d = r13
            return
        L89:
            r12.d = r1
            return
        L8c:
            r12.d = r7
            return
        L8f:
            r12.d = r8
            return
        L92:
            r12.d = r7
            return
        L95:
            r13 = 33554437(0x2000005, float:9.40396E-38)
            r12.d = r13
            return
        L9b:
            r13 = 33554433(0x2000001, float:9.403956E-38)
            r12.d = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqm.g(lsc, sqh, lqm):void");
    }

    public static String h(Uri uri) {
        String encodedAuthority = uri.getEncodedAuthority();
        if (encodedAuthority == null) {
            return null;
        }
        int iIndexOf = encodedAuthority.indexOf("@") + 1;
        int iIndexOf2 = encodedAuthority.indexOf(":", iIndexOf);
        return iIndexOf2 > 0 ? encodedAuthority.substring(iIndexOf, iIndexOf2) : encodedAuthority.substring(iIndexOf);
    }

    public static String i(String str) {
        try {
            return new URI(str).getHost();
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public static String j(String str, String[] strArr, boolean z) {
        if (z) {
            str = aik.f(str);
        }
        String strS = aik.s(str, strArr);
        if (strS.indexOf(47) < 0) {
            strS = strS.concat("/");
        }
        try {
            return a26.B(strS);
        } catch (IllegalArgumentException unused) {
            return strS;
        }
    }

    public static String k(String str) {
        int i;
        char cCharAt;
        if (str == null) {
            return null;
        }
        if (str.startsWith("opera:")) {
            i = 6;
        } else {
            if (!str.startsWith("chrome:")) {
                return null;
            }
            i = 7;
        }
        while (i < str.length() && str.charAt(i) == '/') {
            i++;
        }
        int i2 = i;
        while (i2 < str.length() && (cCharAt = str.charAt(i2)) != '/' && cCharAt != '?' && cCharAt != '#') {
            i2++;
        }
        if (str.length() - i2 > 1) {
            return null;
        }
        return str.substring(i, i2).toLowerCase(Locale.ROOT);
    }

    public static String[] l(List list, List list2) {
        String[] strArr = new String[list.size() + ((list.size() + 1) * list2.size())];
        Iterator it = list2.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                Locale locale = Locale.US;
                strArr[i] = sko.v(str2, "://", str);
                i++;
            }
            strArr[i] = str;
            i++;
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            String str3 = (String) it3.next();
            Locale locale2 = Locale.US;
            strArr[i] = sko.u(str3, "://");
            i++;
        }
        return strArr;
    }

    public static String m(Uri uri, String str) {
        try {
            return uri.getQueryParameter(str);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public static Set n(Uri uri) {
        if (uri.isOpaque()) {
            yt7.k("This isn't a hierarchical URI.");
            return null;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int iIndexOf = encodedQuery.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = encodedQuery.length();
            }
            int iIndexOf2 = encodedQuery.indexOf(61, i);
            if (iIndexOf2 > iIndexOf || iIndexOf2 == -1) {
                iIndexOf2 = iIndexOf;
            }
            try {
                linkedHashSet.add(a26.B(encodedQuery.substring(i, iIndexOf2)));
                i = iIndexOf + 1;
            } catch (IllegalArgumentException e2) {
                qp2.g(e2);
                return null;
            }
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static List o(Uri uri, String str) {
        if (uri.isOpaque()) {
            yt7.k("This isn't a hierarchical URI.");
            return null;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.EMPTY_LIST;
        }
        String strC = a26.C(str);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int iIndexOf = encodedQuery.indexOf(38, i);
            int length = iIndexOf != -1 ? iIndexOf : encodedQuery.length();
            int iIndexOf2 = encodedQuery.indexOf(61, i);
            if (iIndexOf2 > length || iIndexOf2 == -1) {
                iIndexOf2 = length;
            }
            if (iIndexOf2 - i == strC.length() && encodedQuery.regionMatches(i, strC, 0, strC.length())) {
                if (iIndexOf2 == length) {
                    arrayList.add("");
                } else {
                    try {
                        arrayList.add(a26.B(encodedQuery.substring(iIndexOf2 + 1, length)));
                    } catch (IllegalArgumentException e2) {
                        qp2.g(e2);
                        return null;
                    }
                }
            }
            if (iIndexOf == -1) {
                return Collections.unmodifiableList(arrayList);
            }
            i = iIndexOf + 1;
        }
    }

    public static String p(String str) {
        int iIndexOf;
        if (!TextUtils.isEmpty(str) && (iIndexOf = str.indexOf(58)) > 0) {
            return str.substring(0, iIndexOf);
        }
        return null;
    }

    public static String q(String str) {
        String strG = aik.g(str);
        if (strG.startsWith("m.")) {
            strG = strG.substring(2);
        }
        if (strG.endsWith(".")) {
            strG = p3p.h(1, 0, strG);
        }
        if (strG.length() > 253) {
            return null;
        }
        ArrayList arrayListR = aik.r(true, strG, '.');
        int size = arrayListR.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListR.get(i);
            i++;
            String str2 = (String) obj;
            if (str2.isEmpty() || str2.length() > 63 || str2.charAt(0) == '-' || str2.charAt(str2.length() - 1) == '-') {
                return null;
            }
            for (int i2 = 0; i2 < str2.length(); i2++) {
                char cCharAt = str2.charAt(i2);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '-'))) {
                    return null;
                }
            }
        }
        return strG.toLowerCase(Locale.US);
    }

    public static boolean r(String str) {
        return str != null && str.startsWith("data:");
    }

    public static boolean s(String str) {
        if (str != null) {
            if (str.startsWith("ofa:")) {
                return true;
            }
            gpm gpmVarH = bwg.H(str);
            if (gpmVarH == null ? false : gpmVarH.i.a.equals("momi")) {
                return true;
            }
        }
        return false;
    }

    public static boolean t(String str) {
        try {
            String scheme = new URI(str).getScheme();
            if (scheme == null) {
                return false;
            }
            return d.contains(scheme);
        } catch (URISyntaxException unused) {
            return false;
        }
    }

    public static boolean u(String str) {
        Uri uriD0 = a26.d0(str);
        return uriD0 != null && D(uriD0) && "www.opera.com".equals(uriD0.getHost()) && "/ofa/ofa-beta".equals(uriD0.getPath());
    }

    public static boolean v(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("ofa:");
    }

    public static boolean w(String str) {
        Uri uri;
        return (str == null || (uri = Uri.parse(str)) == null || uri.getScheme() == null || !uri.getScheme().equals("operaui")) ? false : true;
    }

    public static boolean x(String str) {
        int iMhbidx2d = N.Mhbidx2d(str);
        if (iMhbidx2d != 0) {
            if (iMhbidx2d == 1) {
                return str.indexOf(58) == -1;
            }
            if (iMhbidx2d != 4 && iMhbidx2d != 5) {
                return false;
            }
        }
        return true;
    }

    public static boolean y(String str, String str2) {
        return str.length() > str2.length() ? str.endsWith(".".concat(str2)) : str.equals(str2);
    }

    public static boolean z(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("ofa://ui") || str.startsWith("momi://ui");
    }
}

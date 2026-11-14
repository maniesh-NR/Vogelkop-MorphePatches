package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class ya6 extends DefaultHandler implements v1g {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public ya6() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            h9o.s("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            String str = tym.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new ixi(j, j2));
            j += j2;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018b A[PHI: r13
      0x018b: PHI (r13v30 int) = (r13v5 int), (r13v8 int), (r13v33 int) binds: [B:110:0x0189, B:102:0x0176, B:39:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya6.c(org.xmlpull.v1.XmlPullParser, java.lang.String):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList f(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : LinearLayoutManager.INVALID_OFFSET;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!zch.r(xmlPullParser, "BaseURL"));
        if (text != null && n6h.i(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return nb6.K(new oa3(text, attributeValue3, i, i2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            oa3 oa3Var = (oa3) arrayList.get(i3);
            String strO = n6h.o(oa3Var.a, text);
            String str = attributeValue3 == null ? strO : attributeValue3;
            if (z) {
                i = oa3Var.c;
                i2 = oa3Var.d;
                str = oa3Var.b;
            }
            arrayList2.add(new oa3(strO, str, i, i2));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015b  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair g(org.xmlpull.v1.XmlPullParser r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya6.g(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int h(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static l37 i(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!zch.r(xmlPullParser, str));
        return new l37(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = tym.e.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d2 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d3 = d2 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d4 = d3 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d5 = d4 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d6 = d5 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j2 = (long) ((d6 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j2 : j2;
    }

    public static float k(XmlPullParser xmlPullParser, float f2) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = b.matcher(attributeValue);
            if (matcher.matches()) {
                int i = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? i / Integer.parseInt(r2) : i;
            }
        }
        return f2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0a69  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0a9e  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0b11  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0b1a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0b28  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0b3f  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0bfb  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0bfe  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0c17  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0c1e  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0c36  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0c63 A[LOOP:11: B:239:0x0691->B:471:0x0c63, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0f87 A[LOOP:5: B:151:0x0409->B:566:0x0f87, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:691:0x1365 A[LOOP:1: B:38:0x00c6->B:691:0x1365, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:699:0x1332 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:703:0x0e05 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:720:0x08d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:735:0x0ae9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.wa6 l(org.xmlpull.v1.XmlPullParser r164, android.net.Uri r165) throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalStateException, java.io.IOException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 5040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya6.l(org.xmlpull.v1.XmlPullParser, android.net.Uri):wa6");
    }

    public static bjh m(XmlPullParser xmlPullParser, String str, String str2) throws NumberFormatException {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j2 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
        } else {
            j = 0;
        }
        return new bjh(attributeValue, j, j2);
    }

    public static int n(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return NotificationCompat.FLAG_HIGH_PRIORITY;
                case "description":
                    return NotificationCompat.FLAG_GROUP_SUMMARY;
                case "enhanced-audio-intelligibility":
                    return 2048;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return NotificationCompat.FLAG_LOCAL_ONLY;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int o(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (cqp.P("http://dashif.org/guidelines/trickmode", ((l37) arrayList.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static jxi p(XmlPullParser xmlPullParser, jxi jxiVar) throws XmlPullParserException, NumberFormatException, IOException {
        long j;
        long j2 = jxiVar != null ? jxiVar.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j2 = Long.parseLong(attributeValue);
        }
        long j3 = j2;
        long j4 = 0;
        long j5 = jxiVar != null ? jxiVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j5 = Long.parseLong(attributeValue2);
        }
        long j6 = j5;
        if (jxiVar != null) {
            j = jxiVar.d;
            j4 = jxiVar.e;
        } else {
            j = 0;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j = Long.parseLong(strArrSplit[0]);
            j4 = (Long.parseLong(strArrSplit[1]) - j) + 1;
        }
        long j7 = j4;
        long j8 = j;
        bjh bjhVarM = jxiVar != null ? jxiVar.a : null;
        while (true) {
            xmlPullParser.next();
            if (zch.s(xmlPullParser, "Initialization")) {
                bjhVarM = m(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            bjh bjhVar = bjhVarM;
            if (zch.r(xmlPullParser, "SegmentBase")) {
                return new jxi(bjhVar, j3, j6, j8, j7);
            }
            bjhVarM = bjhVar;
        }
    }

    public static gxi q(XmlPullParser xmlPullParser, gxi gxiVar, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException, NumberFormatException {
        long j6 = gxiVar != null ? gxiVar.b : 1L;
        ArrayList arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j6 = Long.parseLong(attributeValue);
        }
        long j7 = j6;
        long j8 = gxiVar != null ? gxiVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j8 = Long.parseLong(attributeValue2);
        }
        long j9 = j8;
        long j10 = gxiVar != null ? gxiVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j10 = Long.parseLong(attributeValue3);
        }
        long j11 = j10;
        long j12 = gxiVar != null ? gxiVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j12 = Long.parseLong(attributeValue4);
        }
        long j13 = j12;
        long j14 = j4 == -9223372036854775807L ? j3 : j4;
        long j15 = j14 == Long.MAX_VALUE ? -9223372036854775807L : j14;
        bjh bjhVarM = null;
        ArrayList arrayListS = null;
        do {
            xmlPullParser.next();
            if (zch.s(xmlPullParser, "Initialization")) {
                bjhVarM = m(xmlPullParser, "sourceURL", "range");
            } else if (zch.s(xmlPullParser, "SegmentTimeline")) {
                arrayListS = s(xmlPullParser, j7, j2);
            } else if (zch.s(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!zch.r(xmlPullParser, "SegmentList"));
        if (gxiVar != null) {
            if (bjhVarM == null) {
                bjhVarM = gxiVar.a;
            }
            if (arrayListS == null) {
                arrayListS = gxiVar.f;
            }
            if (arrayList == null) {
                arrayList = gxiVar.j;
            }
        }
        return new gxi(bjhVarM, j7, j9, j13, j11, arrayListS, j15, arrayList, tym.N(j5), tym.N(j));
    }

    public static hxi r(XmlPullParser xmlPullParser, hxi hxiVar, List list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, NumberFormatException, IOException {
        long j6;
        long j7 = hxiVar != null ? hxiVar.b : 1L;
        bjh bjhVarM = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j7 = Long.parseLong(attributeValue);
        }
        long j8 = j7;
        long j9 = hxiVar != null ? hxiVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j9 = Long.parseLong(attributeValue2);
        }
        long j10 = j9;
        long j11 = hxiVar != null ? hxiVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j11 = Long.parseLong(attributeValue3);
        }
        long j12 = j11;
        long j13 = hxiVar != null ? hxiVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j13 = Long.parseLong(attributeValue4);
        }
        long j14 = j13;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            l37 l37Var = (l37) list.get(i);
            if (cqp.P("http://dashif.org/guidelines/last-segment-number", l37Var.a)) {
                j6 = Long.parseLong(l37Var.b);
                break;
            }
            i++;
        }
        long j15 = j6;
        long j16 = j4 == -9223372036854775807L ? j3 : j4;
        long j17 = j16 == Long.MAX_VALUE ? -9223372036854775807L : j16;
        shf shfVarT = t(xmlPullParser, "media", hxiVar != null ? hxiVar.k : null);
        shf shfVarT2 = t(xmlPullParser, "initialization", hxiVar != null ? hxiVar.j : null);
        ArrayList arrayListS = null;
        do {
            xmlPullParser.next();
            if (zch.s(xmlPullParser, "Initialization")) {
                bjhVarM = m(xmlPullParser, "sourceURL", "range");
            } else if (zch.s(xmlPullParser, "SegmentTimeline")) {
                arrayListS = s(xmlPullParser, j8, j2);
            } else {
                b(xmlPullParser);
            }
        } while (!zch.r(xmlPullParser, "SegmentTemplate"));
        if (hxiVar != null) {
            if (bjhVarM == null) {
                bjhVarM = hxiVar.a;
            }
            if (arrayListS == null) {
                arrayListS = hxiVar.f;
            }
        }
        return new hxi(bjhVarM, j8, j10, j14, j15, j12, arrayListS, j17, shfVarT2, shfVarT, tym.N(j5), tym.N(j));
    }

    public static ArrayList s(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        long j3;
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (zch.s(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long j5 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z) {
                    int i2 = i;
                    j3 = j5;
                    jA = a(arrayList, jA, j4, i2, j3);
                } else {
                    j3 = j5;
                }
                if (j3 != -9223372036854775807L) {
                    jA = j3;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j4 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z = true;
            } else {
                b(xmlPullParser);
            }
        } while (!zch.r(xmlPullParser, "SegmentTimeline"));
        if (z) {
            String str = tym.a;
            a(arrayList, jA, j4, i, tym.W(j2, j, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0120 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static shf t(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, shf r14) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya6.t(org.xmlpull.v1.XmlPullParser, java.lang.String, shf):shf");
    }

    @Override // defpackage.v1g
    public final Object e(Uri uri, ld6 ld6Var) throws XmlPullParserException, s1g {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
            xmlPullParserNewPullParser.setInput(ld6Var, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return l(xmlPullParserNewPullParser, uri);
            }
            throw s1g.g("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            throw s1g.g(null, e2);
        }
    }
}

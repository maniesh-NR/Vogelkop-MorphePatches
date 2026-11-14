package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class v7m implements vnk {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
    public static final unl i = new unl(30.0f, 1, 1);
    public final XmlPullParserFactory a;

    public v7m() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            h9o.s("Couldn't create XmlPullParserFactory instance", e2);
            throw null;
        }
    }

    public static x7m a(x7m x7mVar) {
        return x7mVar == null ? new x7m() : x7mVar;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = h.matcher(attributeValue);
        if (!matcher.matches()) {
            w7d.K("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i3 = Integer.parseInt(strGroup2);
            z4o.s(i2, i3, "Invalid cell resolution %s %s", (i2 == 0 || i3 == 0) ? false : true);
            return i3;
        } catch (NumberFormatException unused) {
            w7d.K("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, x7m x7mVar) throws nnk {
        Matcher matcher;
        String strGroup;
        String str2 = tym.a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new nnk(p3p.k(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            w7d.K("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new nnk(sko.k("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                x7mVar.j = 3;
                break;
            case "em":
                x7mVar.j = 2;
                break;
            case "px":
                x7mVar.j = 1;
                break;
            default:
                throw new nnk(sko.k("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        x7mVar.k = Float.parseFloat(strGroup2);
    }

    public static unl e(XmlPullParser xmlPullParser) throws NumberFormatException {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i2 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = tym.a;
            z4o.v("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f2 = 1.0f;
        }
        unl unlVar = i;
        int i3 = unlVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = unlVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new unl(i2 * f2, i3, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(org.xmlpull.v1.XmlPullParser r19, java.util.HashMap r20, int r21, fr r22, java.util.HashMap r23, java.util.HashMap r24) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7m.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, fr, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.u7m g(org.xmlpull.v1.XmlPullParser r21, defpackage.u7m r22, java.util.HashMap r23, defpackage.unl r24) throws java.lang.NumberFormatException, defpackage.nnk {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7m.g(org.xmlpull.v1.XmlPullParser, u7m, java.util.HashMap, unl):u7m");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012c  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.x7m h(org.xmlpull.v1.XmlPullParser r18, defpackage.x7m r19) {
        /*
            Method dump skipped, instructions count: 1428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7m.h(org.xmlpull.v1.XmlPullParser, x7m):x7m");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x00d5. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long i(java.lang.String r13, defpackage.unl r14) throws java.lang.NumberFormatException, defpackage.nnk {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7m.i(java.lang.String, unl):long");
    }

    public static fr k(XmlPullParser xmlPullParser) throws NumberFormatException {
        String strM = zch.m(xmlPullParser, "extent");
        if (strM == null) {
            return null;
        }
        Matcher matcher = g.matcher(strM);
        if (!matcher.matches()) {
            w7d.K("Ignoring non-pixel tts extent: ".concat(strM));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new fr(i2, Integer.parseInt(strGroup2), (byte) 24);
        } catch (NumberFormatException unused) {
            w7d.K("Ignoring malformed tts extent: ".concat(strM));
            return null;
        }
    }

    @Override // defpackage.vnk
    public final void j(byte[] bArr, int i2, int i3, unk unkVar, op5 op5Var) {
        kfo.g0(u(i2, i3, bArr), unkVar, op5Var);
    }

    @Override // defpackage.vnk
    public final lnk u(int i2, int i3, byte[] bArr) throws XmlPullParserException, IOException, NumberFormatException {
        lnk lnkVar;
        lnk lnkVar2 = null;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new w7m("", -3.4028235E38f, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            unl unlVarE = i;
            int iC = 15;
            int i4 = 0;
            w6j w6jVar = null;
            fr frVarK = null;
            while (eventType != 1) {
                u7m u7mVar = (u7m) arrayDeque.peek();
                if (i4 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    lnkVar = lnkVar2;
                    if (eventType == 2) {
                        try {
                            if ("tt".equals(name)) {
                                unlVarE = e(xmlPullParserNewPullParser);
                                iC = c(xmlPullParserNewPullParser);
                                frVarK = k(xmlPullParserNewPullParser);
                            }
                            unl unlVar = unlVarE;
                            int i5 = iC;
                            fr frVar = frVarK;
                            if (b(name)) {
                                if ("head".equals(name)) {
                                    f(xmlPullParserNewPullParser, map, i5, frVar, map2, map3);
                                } else {
                                    try {
                                        u7m u7mVarG = g(xmlPullParserNewPullParser, u7mVar, map2, unlVar);
                                        arrayDeque.push(u7mVarG);
                                        if (u7mVar != null) {
                                            ArrayList arrayList = u7mVar.m;
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                u7mVar.m = arrayList;
                                            }
                                            arrayList.add(u7mVarG);
                                        }
                                    } catch (nnk e2) {
                                        w7d.L("Suppressing parser error", e2);
                                    }
                                }
                                frVarK = frVar;
                                iC = i5;
                                unlVarE = unlVar;
                            } else {
                                w7d.G("Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            }
                            i4++;
                            frVarK = frVar;
                            iC = i5;
                            unlVarE = unlVar;
                        } catch (IOException e3) {
                            e = e3;
                            h9o.m("Unexpected error when reading input.", e);
                            return lnkVar;
                        } catch (XmlPullParserException e4) {
                            e = e4;
                            h9o.m("Unable to decode source", e);
                            return lnkVar;
                        }
                    } else if (eventType == 4) {
                        u7mVar.getClass();
                        u7m u7mVarA = u7m.a(xmlPullParserNewPullParser.getText());
                        ArrayList arrayList2 = u7mVar.m;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            u7mVar.m = arrayList2;
                        }
                        arrayList2.add(u7mVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            u7m u7mVar2 = (u7m) arrayDeque.peek();
                            u7mVar2.getClass();
                            w6jVar = new w6j(u7mVar2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else {
                    lnkVar = lnkVar2;
                    if (eventType == 2) {
                        i4++;
                    } else if (eventType == 3) {
                        i4--;
                    }
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                lnkVar2 = lnkVar;
            }
            lnkVar = lnkVar2;
            w6jVar.getClass();
            return w6jVar;
        } catch (IOException e5) {
            e = e5;
            lnkVar = lnkVar2;
        } catch (XmlPullParserException e6) {
            e = e6;
            lnkVar = lnkVar2;
        }
    }

    @Override // defpackage.vnk
    public final int z() {
        return 1;
    }
}

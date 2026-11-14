package defpackage;

import android.graphics.Matrix;
import android.util.Xml;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class sgi {
    public boolean a;
    public int b;
    public boolean c;
    public boolean d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public static Matrix A(String str) throws jgi {
        Matrix matrix = new Matrix();
        i1 i1Var = new i1(str);
        i1Var.W();
        while (!i1Var.r()) {
            String str2 = (String) i1Var.d;
            String strSubstring = null;
            if (!i1Var.r()) {
                int i = i1Var.b;
                int iCharAt = str2.charAt(i);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = i1Var.h();
                    }
                }
                int i2 = i1Var.b;
                while (i1.B(iCharAt)) {
                    iCharAt = i1Var.h();
                }
                if (iCharAt == 40) {
                    i1Var.b++;
                    strSubstring = str2.substring(i, i2);
                } else {
                    i1Var.b = i;
                }
            }
            if (strSubstring == null) {
                throw new jgi("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    i1Var.W();
                    float F = i1Var.F();
                    i1Var.V();
                    float F2 = i1Var.F();
                    i1Var.V();
                    float F3 = i1Var.F();
                    i1Var.V();
                    float F4 = i1Var.F();
                    i1Var.V();
                    float F5 = i1Var.F();
                    i1Var.V();
                    float F6 = i1Var.F();
                    i1Var.W();
                    if (!Float.isNaN(F6) && i1Var.n(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{F, F3, F5, F2, F4, F6, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new jgi("Invalid transform list: ".concat(str));
                    }
                    break;
                case "rotate":
                    i1Var.W();
                    float F7 = i1Var.F();
                    float fQ = i1Var.Q();
                    float fQ2 = i1Var.Q();
                    i1Var.W();
                    if (Float.isNaN(F7) || !i1Var.n(')')) {
                        throw new jgi("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fQ)) {
                        matrix.preRotate(F7);
                        break;
                    } else if (!Float.isNaN(fQ2)) {
                        matrix.preRotate(F7, fQ, fQ2);
                        break;
                    } else {
                        throw new jgi("Invalid transform list: ".concat(str));
                    }
                    break;
                case "scale":
                    i1Var.W();
                    float F8 = i1Var.F();
                    float fQ3 = i1Var.Q();
                    i1Var.W();
                    if (!Float.isNaN(F8) && i1Var.n(')')) {
                        if (!Float.isNaN(fQ3)) {
                            matrix.preScale(F8, fQ3);
                            break;
                        } else {
                            matrix.preScale(F8, F8);
                            break;
                        }
                    } else {
                        throw new jgi("Invalid transform list: ".concat(str));
                    }
                case "skewX":
                    i1Var.W();
                    float F9 = i1Var.F();
                    i1Var.W();
                    if (!Float.isNaN(F9) && i1Var.n(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(F9)), 0.0f);
                        break;
                    } else {
                        throw new jgi("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewY":
                    i1Var.W();
                    float F10 = i1Var.F();
                    i1Var.W();
                    if (!Float.isNaN(F10) && i1Var.n(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(F10)));
                        break;
                    } else {
                        throw new jgi("Invalid transform list: ".concat(str));
                    }
                case "translate":
                    i1Var.W();
                    float F11 = i1Var.F();
                    float fQ4 = i1Var.Q();
                    i1Var.W();
                    if (!Float.isNaN(F11) && i1Var.n(')')) {
                        if (!Float.isNaN(fQ4)) {
                            matrix.preTranslate(F11, fQ4);
                            break;
                        } else {
                            matrix.preTranslate(F11, 0.0f);
                            break;
                        }
                    } else {
                        throw new jgi("Invalid transform list: ".concat(str));
                    }
                    break;
                default:
                    throw new jgi(sko.k("Invalid transform list fn: ", strSubstring, ")"));
            }
            if (i1Var.r()) {
                return matrix;
            }
            i1Var.V();
        }
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0576  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void D(defpackage.bfi r16, java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 1880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sgi.D(bfi, java.lang.String, java.lang.String):void");
    }

    public static int b(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    public static int e(float f, float f2, float f3) {
        float f4 = f % 360.0f;
        if (f < 0.0f) {
            f4 += 360.0f;
        }
        float f5 = f4 / 60.0f;
        float f6 = f2 / 100.0f;
        float f7 = f3 / 100.0f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        float f8 = f7 >= 0.0f ? f7 > 1.0f ? 1.0f : f7 : 0.0f;
        float f9 = f8 <= 0.5f ? (f6 + 1.0f) * f8 : (f8 + f6) - (f6 * f8);
        float f10 = (f8 * 2.0f) - f9;
        return (b(f(f10, f9, f5 + 2.0f) * 256.0f) << 16) | (b(f(f10, f9, f5) * 256.0f) << 8) | b(f(f10, f9, f5 - 2.0f) * 256.0f);
    }

    public static float f(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        return f3 < 1.0f ? v0g.g(f2, f, f3, f) : f3 < 3.0f ? f2 : f3 < 4.0f ? v0g.g(4.0f, f3, f2 - f, f) : f;
    }

    public static void g(dfi dfiVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iJ = v0g.j(attributes, i);
            if (iJ != 73) {
                switch (iJ) {
                    case 52:
                        i1 i1Var = new i1(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!i1Var.r()) {
                            String strI = i1Var.I();
                            if (strI.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strI.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            i1Var.W();
                        }
                        dfiVar.d(hashSet);
                        break;
                    case 53:
                        dfiVar.i(strTrim);
                        break;
                    case 54:
                        i1 i1Var2 = new i1(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!i1Var2.r()) {
                            hashSet2.add(i1Var2.I());
                            i1Var2.W();
                        }
                        dfiVar.j(hashSet2);
                        break;
                    case 55:
                        ArrayList arrayListR = r(strTrim);
                        dfiVar.g(arrayListR != null ? new HashSet(arrayListR) : new HashSet(0));
                        break;
                }
            } else {
                i1 i1Var3 = new i1(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!i1Var3.r()) {
                    String strI2 = i1Var3.I();
                    int iIndexOf = strI2.indexOf(45);
                    if (iIndexOf != -1) {
                        strI2 = strI2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strI2, "", "").getLanguage());
                    i1Var3.W();
                }
                dfiVar.e(hashSet3);
            }
        }
    }

    public static void h(hfi hfiVar, Attributes attributes) throws jgi {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                hfiVar.c = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    hfiVar.d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new jgi(sko.j("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    hfiVar.d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public static void i(iei ieiVar, Attributes attributes) throws jgi {
        int i;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int iJ = v0g.j(attributes, i2);
            if (iJ == 23) {
                ieiVar.j = A(strTrim);
            } else if (iJ != 24) {
                if (iJ != 26) {
                    if (iJ != 60) {
                        continue;
                    } else {
                        if (strTrim != null) {
                            try {
                                if (strTrim.equals("pad")) {
                                    i = 1;
                                } else if (strTrim.equals("reflect")) {
                                    i = 2;
                                } else if (strTrim.equals("repeat")) {
                                    i = 3;
                                } else {
                                    qp2.o("No enum constant com.caverock.androidsvg.SVG.GradientSpread.".concat(strTrim));
                                }
                                ieiVar.k = i;
                            } catch (IllegalArgumentException unused) {
                                throw new jgi(sko.k("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                            }
                        } else {
                            t3p.q("Name is null");
                        }
                        i = 0;
                        ieiVar.k = i;
                    }
                } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                    ieiVar.l = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                ieiVar.i = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    hai.k("Invalid value for attribute gradientUnits");
                    return;
                }
                ieiVar.i = Boolean.TRUE;
            }
        }
    }

    public static void j(wei weiVar, Attributes attributes, String str) throws jgi {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (pgi.d(attributes.getLocalName(i)) == pgi.b) {
                i1 i1Var = new i1(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                i1Var.W();
                while (!i1Var.r()) {
                    float F = i1Var.F();
                    if (Float.isNaN(F)) {
                        throw new jgi(sko.k("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    i1Var.V();
                    float F2 = i1Var.F();
                    if (Float.isNaN(F2)) {
                        throw new jgi(sko.k("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    i1Var.V();
                    arrayList.add(Float.valueOf(F));
                    arrayList.add(Float.valueOf(F2));
                }
                weiVar.o = new float[arrayList.size()];
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    weiVar.o[i2] = ((Float) obj).floatValue();
                    i2++;
                }
            }
        }
    }

    public static void k(hfi hfiVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iJ = v0g.j(attributes, i);
                if (iJ == 0) {
                    i64 i64Var = new i64(strTrim);
                    ArrayList arrayList = null;
                    while (!i64Var.r()) {
                        String strI = i64Var.I();
                        if (strI != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strI);
                            i64Var.W();
                        }
                    }
                    hfiVar.g = arrayList;
                } else if (iJ != 72) {
                    bfi bfiVar = hfiVar.e;
                    if (bfiVar == null) {
                        bfiVar = new bfi();
                        hfiVar.e = bfiVar;
                    }
                    D(bfiVar, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    i1 i1Var = new i1(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strJ = i1Var.J(':', false);
                        i1Var.W();
                        if (i1Var.n(':')) {
                            i1Var.W();
                            String strJ2 = i1Var.J(';', true);
                            if (strJ2 != null) {
                                i1Var.W();
                                if (i1Var.r() || i1Var.n(';')) {
                                    bfi bfiVar2 = hfiVar.f;
                                    if (bfiVar2 == null) {
                                        bfiVar2 = new bfi();
                                        hfiVar.f = bfiVar2;
                                    }
                                    D(bfiVar2, strJ, strJ2);
                                    i1Var.W();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void l(wfi wfiVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iJ = v0g.j(attributes, i);
            if (iJ == 9) {
                wfiVar.p = u(strTrim);
            } else if (iJ == 10) {
                wfiVar.q = u(strTrim);
            } else if (iJ == 82) {
                wfiVar.n = u(strTrim);
            } else if (iJ == 83) {
                wfiVar.o = u(strTrim);
            }
        }
    }

    public static void m(lei leiVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (pgi.d(attributes.getLocalName(i)) == pgi.c) {
                leiVar.k(A(attributes.getValue(i)));
            }
        }
    }

    public static void n(nfi nfiVar, Attributes attributes) throws jgi {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iJ = v0g.j(attributes, i);
            if (iJ == 48) {
                y(nfiVar, strTrim);
            } else if (iJ == 80) {
                i1 i1Var = new i1(strTrim);
                i1Var.W();
                float F = i1Var.F();
                i1Var.V();
                float F2 = i1Var.F();
                i1Var.V();
                float F3 = i1Var.F();
                i1Var.V();
                float F4 = i1Var.F();
                if (Float.isNaN(F) || Float.isNaN(F2) || Float.isNaN(F3) || Float.isNaN(F4)) {
                    hai.k("Invalid viewBox definition - should have four numbers");
                    return;
                } else if (F3 < 0.0f) {
                    hai.k("Invalid viewBox. width cannot be negative");
                    return;
                } else {
                    if (F4 < 0.0f) {
                        hai.k("Invalid viewBox. height cannot be negative");
                        return;
                    }
                    nfiVar.o = new ree(F, F2, F3, F4);
                }
            } else {
                continue;
            }
        }
    }

    public static eei o(String str) throws jgi {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            y85 y85Var = null;
            if (1 < length) {
                long j2 = 0;
                int i2 = 1;
                while (i2 < length) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt < '0' || cCharAt > '9') {
                        if (cCharAt >= 'A' && cCharAt <= 'F') {
                            j = j2 << 4;
                            i = cCharAt - 'A';
                        } else {
                            if (cCharAt < 'a' || cCharAt > 'f') {
                                break;
                            }
                            j = j2 << 4;
                            i = cCharAt - 'a';
                        }
                        j2 = j + i + 10;
                    } else {
                        j2 = (j2 << 4) + (cCharAt - '0');
                    }
                    if (j2 > 4294967295L) {
                        break;
                    }
                    i2++;
                }
                if (i2 != 1) {
                    y85Var = new y85(j2, i2);
                }
            }
            if (y85Var == null) {
                throw new jgi("Bad hex colour value: ".concat(str));
            }
            long j3 = y85Var.a;
            int i3 = y85Var.b;
            if (i3 == 4) {
                int i4 = (int) j3;
                int i5 = i4 & 3840;
                int i6 = i4 & 240;
                int i7 = i4 & 15;
                return new eei((i5 << 12) | (-16777216) | (i5 << 8) | (i6 << 8) | (i6 << 4) | (i7 << 4) | i7);
            }
            if (i3 != 5) {
                if (i3 == 7) {
                    return new eei(((int) j3) | (-16777216));
                }
                if (i3 != 9) {
                    throw new jgi("Bad hex colour value: ".concat(str));
                }
                int i8 = (int) j3;
                return new eei((i8 << 24) | (i8 >>> 8));
            }
            int i9 = (int) j3;
            int i10 = 61440 & i9;
            int i11 = i9 & 3840;
            int i12 = i9 & 240;
            int i13 = i9 & 15;
            return new eei((i13 << 28) | (i13 << 24) | (i10 << 8) | (i10 << 4) | (i11 << 4) | i11 | i12 | (i12 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            i1 i1Var = new i1(str.substring(zStartsWith ? 5 : 4));
            i1Var.W();
            float F = i1Var.F();
            if (!Float.isNaN(F) && i1Var.n('%')) {
                F = (F * 256.0f) / 100.0f;
            }
            float fL = i1Var.l(F);
            if (!Float.isNaN(fL) && i1Var.n('%')) {
                fL = (fL * 256.0f) / 100.0f;
            }
            float fL2 = i1Var.l(fL);
            if (!Float.isNaN(fL2) && i1Var.n('%')) {
                fL2 = (fL2 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                i1Var.W();
                if (Float.isNaN(fL2) || !i1Var.n(')')) {
                    throw new jgi("Bad rgb() colour value: ".concat(str));
                }
                return new eei((b(F) << 16) | (-16777216) | (b(fL) << 8) | b(fL2));
            }
            float fL3 = i1Var.l(fL2);
            i1Var.W();
            if (Float.isNaN(fL3) || !i1Var.n(')')) {
                throw new jgi("Bad rgba() colour value: ".concat(str));
            }
            return new eei((b(fL3 * 256.0f) << 24) | (b(F) << 16) | (b(fL) << 8) | b(fL2));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) lgi.a.get(lowerCase);
            if (num != null) {
                return new eei(num.intValue());
            }
            throw new jgi("Invalid colour keyword: ".concat(lowerCase));
        }
        i1 i1Var2 = new i1(str.substring(zStartsWith2 ? 5 : 4));
        i1Var2.W();
        float F2 = i1Var2.F();
        float fL4 = i1Var2.l(F2);
        if (!Float.isNaN(fL4)) {
            i1Var2.n('%');
        }
        float fL5 = i1Var2.l(fL4);
        if (!Float.isNaN(fL5)) {
            i1Var2.n('%');
        }
        if (!zStartsWith2) {
            i1Var2.W();
            if (Float.isNaN(fL5) || !i1Var2.n(')')) {
                throw new jgi("Bad hsl() colour value: ".concat(str));
            }
            return new eei(e(F2, fL4, fL5) | (-16777216));
        }
        float fL6 = i1Var2.l(fL5);
        i1Var2.W();
        if (Float.isNaN(fL6) || !i1Var2.n(')')) {
            throw new jgi("Bad hsla() colour value: ".concat(str));
        }
        return new eei((b(fL6 * 256.0f) << 24) | e(F2, fL4, fL5));
    }

    public static float p(int i, String str) throws jgi {
        float f = new sa2((byte) 2, false).f(0, i, str);
        if (Float.isNaN(f)) {
            throw new jgi(sko.j("Invalid float value: ", str));
        }
        return f;
    }

    public static float q(String str) {
        int length = str.length();
        if (length != 0) {
            return p(length, str);
        }
        hai.k("Invalid float value (empty string)");
        return 0.0f;
    }

    public static ArrayList r(String str) {
        i1 i1Var = new i1(str);
        ArrayList arrayList = null;
        do {
            String strH = i1Var.H();
            if (strH == null) {
                strH = i1Var.J(',', true);
            }
            if (strH == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strH);
            i1Var.V();
        } while (!i1Var.r());
        return arrayList;
    }

    public static String s(String str) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
    }

    public static nei t(String str) throws jgi {
        int iW;
        if (str.length() == 0) {
            hai.k("Invalid length value (empty string)");
            return null;
        }
        int length = str.length();
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            iW = 9;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                iW = v0g.w(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new jgi("Invalid length unit specifier: ".concat(str));
            }
        } else {
            iW = 1;
        }
        try {
            return new nei(p(length, str), iW);
        } catch (NumberFormatException e) {
            throw new jgi("Invalid length value: ".concat(str), e);
        }
    }

    public static ArrayList u(String str) throws jgi {
        if (str.length() == 0) {
            hai.k("Invalid length list (empty string)");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        i1 i1Var = new i1(str);
        i1Var.W();
        while (!i1Var.r()) {
            float F = i1Var.F();
            if (Float.isNaN(F)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                String str2 = (String) i1Var.d;
                int i = i1Var.b;
                while (!i1Var.r() && !i1.B(str2.charAt(i1Var.b))) {
                    i1Var.b++;
                }
                String strSubstring = str2.substring(i, i1Var.b);
                i1Var.b = i;
                sb.append(strSubstring);
                throw new jgi(sb.toString());
            }
            int iK = i1Var.K();
            if (iK == 0) {
                iK = 1;
            }
            arrayList.add(new nei(F, iK));
            i1Var.V();
        }
        return arrayList;
    }

    public static nei v(i1 i1Var) {
        return i1Var.o("auto") ? new nei(0.0f) : i1Var.G();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000f A[PHI: r0
      0x000f: PHI (r0v1 float) = (r0v0 float), (r0v2 float) binds: [B:3:0x0007, B:5:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Float w(java.lang.String r2) {
        /*
            float r2 = q(r2)     // Catch: defpackage.jgi -> L15
            r0 = 0
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 < 0) goto Lf
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 <= 0) goto L10
        Lf:
            r2 = r0
        L10:
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch: defpackage.jgi -> L15
            return r2
        L15:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sgi.w(java.lang.String):java.lang.Float");
    }

    public static kfi x(String str) {
        boolean zStartsWith = str.startsWith("url(");
        kfi kfiVarO = eei.c;
        kfi kfiVar = fei.a;
        kfi kfiVar2 = null;
        if (!zStartsWith) {
            if (str.equals("none")) {
                return kfiVarO;
            }
            if (str.equals("currentColor")) {
                return kfiVar;
            }
            try {
                return o(str);
            } catch (jgi unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new sei(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals("none")) {
                if (strTrim2.equals("currentColor")) {
                    kfiVarO = kfiVar;
                } else {
                    try {
                        kfiVarO = o(strTrim2);
                    } catch (jgi unused2) {
                        kfiVarO = null;
                    }
                }
            }
            kfiVar2 = kfiVarO;
        }
        return new sei(strTrim, kfiVar2);
    }

    public static void y(lfi lfiVar, String str) throws jgi {
        int i;
        i1 i1Var = new i1(str);
        i1Var.W();
        String strI = i1Var.I();
        if ("defer".equals(strI)) {
            i1Var.W();
            strI = i1Var.I();
        }
        hwg hwgVar = (hwg) kgi.a.get(strI);
        i1Var.W();
        if (i1Var.r()) {
            i = 0;
        } else {
            String strI2 = i1Var.I();
            strI2.getClass();
            if (strI2.equals("meet")) {
                i = 1;
            } else {
                if (!strI2.equals("slice")) {
                    throw new jgi("Invalid preserveAspectRatio definition: ".concat(str));
                }
                i = 2;
            }
        }
        lfiVar.n = new iwg(hwgVar, i);
    }

    public static HashMap z(i1 i1Var) {
        HashMap map = new HashMap();
        i1Var.W();
        String strJ = i1Var.J('=', false);
        while (strJ != null) {
            i1Var.n('=');
            map.put(strJ, i1Var.H());
            i1Var.W();
            strJ = i1Var.J('=', false);
        }
        return map;
    }

    public final void B(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            ogi ogiVar = new ogi(this);
            xMLReader.setContentHandler(ogiVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", ogiVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new jgi("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new jgi("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new jgi("SVG parse error", e3);
        }
    }

    public final void C(InputStream inputStream) throws XmlPullParserException, ParserConfigurationException, SAXException, IOException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                rgi rgiVar = new rgi();
                rgiVar.a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        E();
                    } else if (eventType == 8) {
                        xmlPullParserNewPullParser.getText();
                        i1 i1Var = new i1(xmlPullParserNewPullParser.getText());
                        String strI = i1Var.I();
                        z(i1Var);
                        strI.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (((cfi) ((p8f) this.e).b) == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                inputStream.reset();
                                B(inputStream);
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        F(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, rgiVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        H(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        G(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (IOException e) {
                throw new jgi("Stream error", e);
            }
        } catch (XmlPullParserException e2) {
            throw new jgi("XML parser problem", e2);
        }
    }

    public final void E() {
        p8f p8fVar = new p8f((byte) 12, false);
        p8fVar.b = null;
        p8fVar.c = new s64((byte) 0);
        p8fVar.d = new HashMap();
        this.e = p8fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:438:0x08e1, code lost:
    
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x010a, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x0498, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x0654, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x0995, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x0a58, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x0bb7, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:872:0x0de7, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:426:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:784:0x08e3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(java.lang.String r26, java.lang.String r27, java.lang.String r28, org.xml.sax.Attributes r29) throws defpackage.jgi {
        /*
            Method dump skipped, instructions count: 3840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sgi.F(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public final void G(String str) {
        if (this.a) {
            return;
        }
        if (this.c) {
            StringBuilder sb = (StringBuilder) this.h;
            if (sb == null) {
                sb = new StringBuilder(str.length());
                this.h = sb;
            }
            sb.append(str);
            return;
        }
        if (!this.d) {
            if (((ffi) this.f) instanceof ufi) {
                a(str);
            }
        } else {
            StringBuilder sb2 = (StringBuilder) this.i;
            if (sb2 == null) {
                sb2 = new StringBuilder(str.length());
                this.i = sb2;
            }
            sb2.append(str);
        }
    }

    public final void H(char[] cArr, int i, int i2) {
        if (this.a) {
            return;
        }
        if (this.c) {
            StringBuilder sb = (StringBuilder) this.h;
            if (sb == null) {
                sb = new StringBuilder(i2);
                this.h = sb;
            }
            sb.append(cArr, i, i2);
            return;
        }
        if (!this.d) {
            if (((ffi) this.f) instanceof ufi) {
                a(new String(cArr, i, i2));
            }
        } else {
            StringBuilder sb2 = (StringBuilder) this.i;
            if (sb2 == null) {
                sb2 = new StringBuilder(i2);
                this.i = sb2;
            }
            sb2.append(cArr, i, i2);
        }
    }

    public final void I(int i, boolean z) {
        ngn ngnVar = (ngn) this.g;
        if (i != 0 && i != 5) {
            ngnVar.a();
            J(i, z);
        } else {
            ngnVar.d = z;
            ngnVar.e = i;
            ngnVar.d();
        }
    }

    public final void J(int i, boolean z) {
        ssi ssiVar = (ssi) this.f;
        int i2 = this.b;
        if (i == i2 && z == this.a) {
            return;
        }
        boolean z2 = this.a && (i2 == 1 || i2 == 3 || i2 == 4);
        boolean z3 = z && (i == 1 || i == 3 || i == 4);
        if (z2 != z3) {
            se3 se3Var = (se3) this.i;
            if (z3) {
                se3Var.d();
                if (!this.c) {
                    this.c = true;
                    vml.d(ssiVar, 2000L);
                }
            } else {
                se3Var.a();
                this.d = false;
                this.c = false;
                vml.a(ssiVar);
            }
        }
        this.a = z;
        this.b = i;
    }

    public final void a(String str) {
        efi efiVar = (efi) ((ffi) this.f);
        int size = efiVar.i.size();
        jfi jfiVar = size == 0 ? null : (jfi) efiVar.i.get(size - 1);
        if (jfiVar instanceof xfi) {
            xfi xfiVar = (xfi) jfiVar;
            xfiVar.c = z1m.l(new StringBuilder(), xfiVar.c, str);
        } else {
            ffi ffiVar = (ffi) this.f;
            xfi xfiVar2 = new xfi();
            xfiVar2.c = str;
            ffiVar.f(xfiVar2);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (this.a) {
            int i = this.b - 1;
            this.b = i;
            if (i == 0) {
                this.a = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            qgi qgiVar = (qgi) qgi.e.get(str2);
            if (qgiVar == null) {
                qgiVar = qgi.d;
            }
            switch (qgiVar.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.f = ((jfi) ((ffi) this.f)).b;
                    break;
                case 5:
                case 26:
                    this.c = false;
                    if (((StringBuilder) this.h) != null) {
                        qgi qgiVar2 = (qgi) this.g;
                        if (qgiVar2 == qgi.c || qgiVar2 == qgi.a) {
                            ((p8f) this.e).getClass();
                        }
                        ((StringBuilder) this.h).setLength(0);
                        break;
                    }
                    break;
                case 21:
                    StringBuilder sb = (StringBuilder) this.i;
                    if (sb != null) {
                        this.d = false;
                        String string = sb.toString();
                        z zVar = new z((byte) 3, 1);
                        p8f p8fVar = (p8f) this.e;
                        i64 i64Var = new i64(string);
                        i64Var.W();
                        ((s64) p8fVar.c).j(zVar.k(i64Var));
                        ((StringBuilder) this.i).setLength(0);
                        break;
                    }
                    break;
            }
        }
    }

    public final int d(boolean z) {
        if (!z) {
            return 1;
        }
        int i = this.b;
        if (i == 0) {
            return 4;
        }
        if (i != 2) {
            return (i == 5 || i == 6) ? 4 : 3;
        }
        return 2;
    }
}

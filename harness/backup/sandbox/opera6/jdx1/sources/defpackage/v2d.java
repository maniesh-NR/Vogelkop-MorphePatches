package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class v2d {
    public static final z8b a = z8b.G("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static final z8b b = z8b.G("id", "layers", "w", "h", "p", "u");
    public static final z8b c = z8b.G("list");
    public static final z8b d = z8b.G("cm", "tm", "dr");

    public static p2d a(vsb vsbVar) throws NumberFormatException {
        float f;
        HashMap map;
        ArrayList arrayList;
        fxj fxjVar;
        float f2;
        float f3;
        float f4;
        float f5;
        ArrayList arrayList2;
        HashMap map2;
        ArrayList arrayList3;
        float fC = dzm.c();
        j1d j1dVar = new j1d((Object) null);
        ArrayList arrayList4 = new ArrayList();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        fxj fxjVar2 = new fxj(0);
        p2d p2dVar = new p2d();
        vsbVar.k();
        float fQ = 0.0f;
        int iR = 0;
        int iR2 = 0;
        float fQ2 = 0.0f;
        float fQ3 = 0.0f;
        while (vsbVar.o()) {
            int i = 1;
            switch (vsbVar.E(a)) {
                case 0:
                    iR = vsbVar.r();
                    break;
                case 1:
                    iR2 = vsbVar.r();
                    break;
                case 2:
                    map2 = map5;
                    arrayList3 = arrayList5;
                    fQ = (float) vsbVar.q();
                    arrayList5 = arrayList3;
                    map5 = map2;
                    break;
                case 3:
                    f = fC;
                    fQ2 = ((float) vsbVar.q()) - 0.01f;
                    arrayList5 = arrayList5;
                    map5 = map5;
                    fC = f;
                    break;
                case 4:
                    map2 = map5;
                    arrayList3 = arrayList5;
                    fQ3 = (float) vsbVar.q();
                    arrayList5 = arrayList3;
                    map5 = map2;
                    break;
                case 5:
                    f = fC;
                    map = map5;
                    arrayList = arrayList5;
                    fxjVar = fxjVar2;
                    f2 = fQ;
                    f3 = fQ2;
                    f4 = fQ3;
                    String[] strArrSplit = vsbVar.s().split("\\.");
                    int i2 = Integer.parseInt(strArrSplit[0]);
                    int i3 = Integer.parseInt(strArrSplit[1]);
                    int i4 = Integer.parseInt(strArrSplit[2]);
                    if (i2 < 4 || (i2 <= 4 && (i3 < 4 || (i3 <= 4 && i4 < 0)))) {
                        p2dVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fQ = f2;
                    arrayList5 = arrayList;
                    fxjVar2 = fxjVar;
                    map5 = map;
                    fQ3 = f4;
                    fQ2 = f3;
                    fC = f;
                    break;
                case 6:
                    f = fC;
                    map = map5;
                    arrayList = arrayList5;
                    fxjVar = fxjVar2;
                    f2 = fQ;
                    f3 = fQ2;
                    f4 = fQ3;
                    vsbVar.h();
                    int i5 = 0;
                    while (vsbVar.o()) {
                        t1c t1cVarA = w1c.a(vsbVar, p2dVar);
                        if (t1cVarA.e == 3) {
                            i5++;
                        }
                        arrayList4.add(t1cVarA);
                        j1dVar.g(t1cVarA.d, t1cVarA);
                        if (i5 > 4) {
                            izc.b("You have " + i5 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    vsbVar.l();
                    fQ = f2;
                    arrayList5 = arrayList;
                    fxjVar2 = fxjVar;
                    map5 = map;
                    fQ3 = f4;
                    fQ2 = f3;
                    fC = f;
                    break;
                case 7:
                    f = fC;
                    arrayList = arrayList5;
                    fxjVar = fxjVar2;
                    vsbVar.h();
                    while (vsbVar.o()) {
                        ArrayList arrayList6 = new ArrayList();
                        String strS = null;
                        j1d j1dVar2 = new j1d((Object) null);
                        vsbVar.k();
                        HashMap map6 = map5;
                        String strS2 = null;
                        int iR3 = 0;
                        int iR4 = 0;
                        while (vsbVar.o()) {
                            float f6 = fQ3;
                            int iE = vsbVar.E(b);
                            if (iE != 0) {
                                float f7 = fQ2;
                                if (iE != 1) {
                                    if (iE == 2) {
                                        iR3 = vsbVar.r();
                                    } else if (iE == 3) {
                                        iR4 = vsbVar.r();
                                    } else if (iE == 4) {
                                        strS = vsbVar.s();
                                    } else if (iE != 5) {
                                        vsbVar.G();
                                        vsbVar.H();
                                        f5 = fQ;
                                    } else {
                                        vsbVar.s();
                                    }
                                    fQ3 = f6;
                                    fQ2 = f7;
                                } else {
                                    vsbVar.h();
                                    while (vsbVar.o()) {
                                        t1c t1cVarA2 = w1c.a(vsbVar, p2dVar);
                                        j1dVar2.g(t1cVarA2.d, t1cVarA2);
                                        arrayList6.add(t1cVarA2);
                                        fQ = fQ;
                                    }
                                    f5 = fQ;
                                    vsbVar.l();
                                }
                                fQ = f5;
                                fQ3 = f6;
                                fQ2 = f7;
                            } else {
                                strS2 = vsbVar.s();
                                fQ3 = f6;
                            }
                        }
                        float f8 = fQ;
                        float f9 = fQ2;
                        float f10 = fQ3;
                        vsbVar.m();
                        if (strS != null) {
                            map4.put(strS2, new h3d(iR3, iR4, strS2, strS));
                        } else {
                            map3.put(strS2, arrayList6);
                        }
                        fQ = f8;
                        map5 = map6;
                        fQ3 = f10;
                        fQ2 = f9;
                    }
                    map = map5;
                    f2 = fQ;
                    f3 = fQ2;
                    f4 = fQ3;
                    vsbVar.l();
                    fQ = f2;
                    arrayList5 = arrayList;
                    fxjVar2 = fxjVar;
                    map5 = map;
                    fQ3 = f4;
                    fQ2 = f3;
                    fC = f;
                    break;
                case 8:
                    f = fC;
                    vsbVar.k();
                    while (vsbVar.o()) {
                        if (vsbVar.E(c) != 0) {
                            vsbVar.G();
                            vsbVar.H();
                        } else {
                            vsbVar.h();
                            while (vsbVar.o()) {
                                z8b z8bVar = qh9.a;
                                vsbVar.k();
                                String strS3 = null;
                                String strS4 = null;
                                String strS5 = null;
                                while (true) {
                                    arrayList2 = arrayList5;
                                    if (vsbVar.o()) {
                                        int iE2 = vsbVar.E(qh9.a);
                                        if (iE2 != 0) {
                                            fxj fxjVar3 = fxjVar2;
                                            if (iE2 == 1) {
                                                strS4 = vsbVar.s();
                                            } else if (iE2 == 2) {
                                                strS5 = vsbVar.s();
                                            } else if (iE2 != 3) {
                                                vsbVar.G();
                                                vsbVar.H();
                                            } else {
                                                vsbVar.q();
                                            }
                                            arrayList5 = arrayList2;
                                            fxjVar2 = fxjVar3;
                                        } else {
                                            strS3 = vsbVar.s();
                                            arrayList5 = arrayList2;
                                        }
                                    }
                                }
                                vsbVar.m();
                                map5.put(strS4, new ih9(strS3, strS4, strS5));
                                arrayList5 = arrayList2;
                            }
                            vsbVar.l();
                        }
                    }
                    arrayList = arrayList5;
                    fxjVar = fxjVar2;
                    vsbVar.m();
                    map = map5;
                    f2 = fQ;
                    f3 = fQ2;
                    f4 = fQ3;
                    fQ = f2;
                    arrayList5 = arrayList;
                    fxjVar2 = fxjVar;
                    map5 = map;
                    fQ3 = f4;
                    fQ2 = f3;
                    fC = f;
                    break;
                case 9:
                    vsbVar.h();
                    while (vsbVar.o()) {
                        z8b z8bVar2 = kh9.a;
                        ArrayList arrayList7 = new ArrayList();
                        vsbVar.k();
                        double dQ = 0.0d;
                        char cCharAt = 0;
                        String strS6 = null;
                        String strS7 = null;
                        while (vsbVar.o()) {
                            int iE3 = vsbVar.E(kh9.a);
                            float f11 = fC;
                            if (iE3 == 0) {
                                cCharAt = vsbVar.s().charAt(0);
                            } else if (iE3 == 1) {
                                vsbVar.q();
                            } else if (iE3 == 2) {
                                dQ = vsbVar.q();
                            } else if (iE3 == 3) {
                                strS6 = vsbVar.s();
                            } else if (iE3 == 4) {
                                strS7 = vsbVar.s();
                            } else if (iE3 != 5) {
                                vsbVar.G();
                                vsbVar.H();
                            } else {
                                vsbVar.k();
                                while (vsbVar.o()) {
                                    if (vsbVar.E(kh9.b) != 0) {
                                        vsbVar.G();
                                        vsbVar.H();
                                    } else {
                                        vsbVar.h();
                                        while (vsbVar.o()) {
                                            arrayList7.add((abj) wq5.a(vsbVar, p2dVar));
                                        }
                                        vsbVar.l();
                                    }
                                }
                                vsbVar.m();
                            }
                            fC = f11;
                        }
                        vsbVar.m();
                        jh9 jh9Var = new jh9(arrayList7, cCharAt, dQ, strS6, strS7);
                        fxjVar2.e(jh9Var.hashCode(), jh9Var);
                        fC = fC;
                    }
                    f = fC;
                    vsbVar.l();
                    map = map5;
                    arrayList = arrayList5;
                    fxjVar = fxjVar2;
                    f2 = fQ;
                    f3 = fQ2;
                    f4 = fQ3;
                    fQ = f2;
                    arrayList5 = arrayList;
                    fxjVar2 = fxjVar;
                    map5 = map;
                    fQ3 = f4;
                    fQ2 = f3;
                    fC = f;
                    break;
                case 10:
                    vsbVar.h();
                    while (vsbVar.o()) {
                        vsbVar.k();
                        while (vsbVar.o()) {
                            int iE4 = vsbVar.E(d);
                            if (iE4 == 0) {
                                vsbVar.s();
                            } else if (iE4 == i) {
                                vsbVar.q();
                            } else if (iE4 != 2) {
                                vsbVar.G();
                                vsbVar.H();
                            } else {
                                vsbVar.q();
                            }
                            i = 1;
                        }
                        vsbVar.m();
                        arrayList5.add(new j06((byte) 17));
                        i = 1;
                    }
                    vsbVar.l();
                    f = fC;
                    map = map5;
                    arrayList = arrayList5;
                    fxjVar = fxjVar2;
                    f2 = fQ;
                    f3 = fQ2;
                    f4 = fQ3;
                    fQ = f2;
                    arrayList5 = arrayList;
                    fxjVar2 = fxjVar;
                    map5 = map;
                    fQ3 = f4;
                    fQ2 = f3;
                    fC = f;
                    break;
                default:
                    vsbVar.G();
                    vsbVar.H();
                    f = fC;
                    map = map5;
                    arrayList = arrayList5;
                    fxjVar = fxjVar2;
                    f2 = fQ;
                    f3 = fQ2;
                    f4 = fQ3;
                    fQ = f2;
                    arrayList5 = arrayList;
                    fxjVar2 = fxjVar;
                    map5 = map;
                    fQ3 = f4;
                    fQ2 = f3;
                    fC = f;
                    break;
            }
        }
        float f12 = fC;
        p2dVar.i = new Rect(0, 0, (int) (iR * f12), (int) (iR2 * f12));
        p2dVar.j = fQ;
        p2dVar.k = fQ2;
        p2dVar.l = fQ3;
        p2dVar.h = arrayList4;
        p2dVar.g = j1dVar;
        p2dVar.c = map3;
        p2dVar.d = map4;
        p2dVar.f = fxjVar2;
        p2dVar.e = map5;
        return p2dVar;
    }
}

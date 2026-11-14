package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class fhc implements qv2 {
    public final csh a;
    public final int b;

    public fhc(int i, csh cshVar) {
        this.b = i;
        this.a = cshVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static fhc b(int i, g1g g1gVar) {
        qv2 sfkVar;
        String str;
        int i2 = 4;
        scd.q(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = g1gVar.c;
        int iA = -2;
        int i4 = 0;
        while (g1gVar.a() > 8) {
            int iO = g1gVar.o();
            int iO2 = g1gVar.b + g1gVar.o();
            g1gVar.M(iO2);
            if (iO != 1414744396) {
                vv2 vv2Var = null;
                switch (iO) {
                    case 1718776947:
                        if (iA == 2) {
                            g1gVar.O(i2);
                            int iO3 = g1gVar.o();
                            int iO4 = g1gVar.o();
                            g1gVar.O(i2);
                            int iO5 = g1gVar.o();
                            switch (iO5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                nj9 nj9Var = new nj9();
                                nj9Var.t = iO3;
                                nj9Var.u = iO4;
                                nj9Var.m = dzd.p(str);
                                sfkVar = new sfk(new oj9(nj9Var));
                                break;
                            } else {
                                vep.y(iO5, "Ignoring track with unsupported compression ");
                                sfkVar = vv2Var;
                                break;
                            }
                        } else {
                            if (iA == 1) {
                                int iT = g1gVar.t();
                                String str2 = iT != 1 ? iT != 85 ? iT != 255 ? iT != 8192 ? iT != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iT2 = g1gVar.t();
                                    int iO6 = g1gVar.o();
                                    g1gVar.O(6);
                                    int iT3 = g1gVar.t();
                                    String str3 = tym.a;
                                    int iA2 = tym.A(iT3, ByteOrder.LITTLE_ENDIAN);
                                    int iT4 = g1gVar.a() > 0 ? g1gVar.t() : 0;
                                    nj9 nj9Var2 = new nj9();
                                    nj9Var2.m = dzd.p(str2);
                                    nj9Var2.E = iT2;
                                    nj9Var2.F = iO6;
                                    if (str2.equals("audio/raw") && iA2 != 0) {
                                        nj9Var2.G = iA2;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && iT4 > 0) {
                                        byte[] bArr = new byte[iT4];
                                        g1gVar.k(bArr, 0, iT4);
                                        nj9Var2.p = h1b.v(bArr);
                                    }
                                    sfkVar = new sfk(new oj9(nj9Var2));
                                    break;
                                } else {
                                    vep.y(iT, "Ignoring track with unsupported format tag ");
                                }
                            } else {
                                w7d.K("Ignoring strf box for unsupported track type: ".concat(tym.D(iA)));
                            }
                            sfkVar = vv2Var;
                        }
                    case 1751742049:
                        int iO7 = g1gVar.o();
                        g1gVar.O(8);
                        int iO8 = g1gVar.o();
                        int iO9 = g1gVar.o();
                        g1gVar.O(i2);
                        g1gVar.o();
                        g1gVar.O(12);
                        sfkVar = new uv2(iO7, iO8, iO9);
                        break;
                    case 1752331379:
                        int iO10 = g1gVar.o();
                        g1gVar.O(12);
                        g1gVar.o();
                        int iO11 = g1gVar.o();
                        int iO12 = g1gVar.o();
                        g1gVar.O(i2);
                        int iO13 = g1gVar.o();
                        int iO14 = g1gVar.o();
                        g1gVar.O(i2);
                        vv2Var = new vv2(iO10, iO11, iO12, iO13, iO14, g1gVar.o());
                        sfkVar = vv2Var;
                        break;
                    case 1852994675:
                        sfkVar = new bgk(g1gVar.y(g1gVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        sfkVar = vv2Var;
                        break;
                }
            } else {
                sfkVar = b(g1gVar.o(), g1gVar);
            }
            if (sfkVar != null) {
                if (sfkVar.getType() == 1752331379) {
                    iA = ((vv2) sfkVar).a();
                }
                int i5 = i4 + 1;
                int iB = w0b.b(objArrCopyOf.length, i5);
                if (iB > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                }
                objArrCopyOf[i4] = sfkVar;
                i4 = i5;
            }
            g1gVar.N(iO2);
            g1gVar.M(i3);
            i2 = 4;
        }
        return new fhc(i, h1b.o(i4, objArrCopyOf));
    }

    public final qv2 a(Class cls) {
        a1b a1bVarU = this.a.u(0);
        while (a1bVarU.hasNext()) {
            qv2 qv2Var = (qv2) a1bVarU.next();
            if (qv2Var.getClass() == cls) {
                return qv2Var;
            }
        }
        return null;
    }

    @Override // defpackage.qv2
    public final int getType() {
        return this.b;
    }
}

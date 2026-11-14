package ads_mobile_sdk;

import defpackage.dep;
import defpackage.efp;
import defpackage.g9p;
import defpackage.iop;
import defpackage.jyo;
import defpackage.l6p;
import defpackage.s3p;
import defpackage.ulo;
import defpackage.xmp;
import defpackage.xzo;
import defpackage.zg;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/* loaded from: classes.dex */
public final /* synthetic */ class ts3 implements g9p {
    public static final /* synthetic */ ts3 b;
    public static final /* synthetic */ ts3 c;
    public static final /* synthetic */ ts3 d;
    public static final /* synthetic */ ts3 e;
    public static final /* synthetic */ ts3 f;
    public static final /* synthetic */ ts3 g;
    public static final /* synthetic */ ts3 h;
    public static final /* synthetic */ ts3 i;
    public static final /* synthetic */ ts3 j;
    public static final /* synthetic */ ts3 k;
    public static final /* synthetic */ ts3 l;
    public static final /* synthetic */ ts3 m;
    public static final /* synthetic */ ts3 n;
    public static final /* synthetic */ ts3 o;
    public static final /* synthetic */ ts3 p;
    public static final /* synthetic */ ts3 q;
    public final /* synthetic */ int a;

    static {
        int iA = u0h.a(((~1566288819) & 1018167620) | 793479703, (1566288819 & 284165456) | 1648575546, -1602978314, 292218004) ^ (846942590 % 524688209);
        q = new ts3(15);
        p = new ts3(14);
        o = new ts3(13);
        n = new ts3(12);
        m = new ts3(11);
        l = new ts3(10);
        k = new ts3(9);
        j = new ts3(8);
        i = new ts3(7);
        h = new ts3(6);
        g = new ts3(5);
        f = new ts3(4);
        e = new ts3(3);
        d = new ts3(iA);
        c = new ts3(1);
        b = new ts3(0);
    }

    public /* synthetic */ ts3(int i2) {
        this.a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) throws efp {
        zk2 zk2Var;
        zk2 zk2Var2;
        byte[] bArr;
        byte[] bArr2;
        zk2 zk2Var3;
        byte[] bArr3;
        byte[] bArr4;
        zk2 zk2Var4;
        zk2 zk2Var5;
        zk2 zk2Var6;
        zk2 zk2Var7;
        zk2 zk2Var8;
        zk2 zk2Var9;
        zk2 zk2Var10;
        long jC;
        st3 st3VarA;
        zk2 zk2Var11;
        ike ikeVar;
        ArrayList arrayList;
        st3 st3VarA2;
        long j2;
        zk2 zk2Var12;
        st3 st3VarA3;
        zk2 zk2Var13;
        zk2 zk2Var14;
        zk2 zk2Var15;
        int iA = u0h.a(1278170217, 57720280, 1421285553, 105108813) ^ 19713753;
        int i2 = 0;
        try {
            try {
                switch (this.a) {
                    case 0:
                        return ((nt3) obj).a();
                    case 1:
                        try {
                            ike ikeVar2 = ((nt3) obj).a;
                            long jC2 = ikeVar2.a().c();
                            st3 st3VarA4 = ikeVar2.a();
                            List listE = st3VarA4.e();
                            if (jC2 < 0) {
                                jC2 += ((ArrayList) listE).size();
                            }
                            if (jC2 >= 0) {
                                ArrayList arrayList2 = (ArrayList) listE;
                                if (jC2 < arrayList2.size()) {
                                    arrayList2.remove((int) jC2);
                                    ikeVar2.a(st3VarA4);
                                    return Optional.empty();
                                }
                            }
                            throw new efp();
                        } catch (dep unused) {
                            zk2Var = zk2.z;
                            return Optional.of(zk2Var);
                        } catch (efp unused2) {
                            zk2Var = zk2.J;
                            return Optional.of(zk2Var);
                        } catch (s3p unused3) {
                            zk2Var = zk2.y;
                            return Optional.of(zk2Var);
                        }
                    case 2:
                        nt3 nt3Var = (nt3) obj;
                        try {
                            ike ikeVar3 = nt3Var.a;
                            st3 st3VarA5 = ikeVar3.a();
                            ws3 ws3VarD = ikeVar3.a().d();
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                st3VarA5.a(byteArrayOutputStream);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                int length = byteArray.length;
                                if (length == 0) {
                                    bArr = new byte[0];
                                } else {
                                    byte[] bArr5 = new byte[length];
                                    System.arraycopy(byteArray, 0, bArr5, 0, length);
                                    bArr = bArr5;
                                }
                                byte[] bArr6 = ws3VarD.a;
                                int length2 = bArr6.length + bArr.length;
                                byte[] bArr7 = new byte[length2];
                                System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
                                System.arraycopy(bArr, 0, bArr7, ws3VarD.a.length, bArr.length);
                                if (length2 == 0) {
                                    bArr2 = new byte[0];
                                } else {
                                    bArr2 = new byte[length2];
                                    System.arraycopy(bArr7, 0, bArr2, 0, length2);
                                }
                                nt3Var.a.a(st3.a(new ws3(bArr2)));
                                return Optional.empty();
                            } catch (dep unused4) {
                                zk2Var2 = zk2.l;
                                return Optional.of(zk2Var2);
                            } catch (IOException e2) {
                                h9o.v(us3.a("CEiv6BFfPnitUE+D"), e2);
                                return null;
                            }
                        } catch (dep unused5) {
                            zk2Var2 = zk2.z;
                        } catch (s3p unused6) {
                            zk2Var2 = zk2.y;
                        }
                    case 3:
                        nt3 nt3Var2 = (nt3) obj;
                        try {
                            ike ikeVar4 = nt3Var2.a;
                            st3 st3VarA6 = ikeVar4.a();
                            ws3 ws3VarD2 = ikeVar4.a().d();
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                dpj.i(st3VarA6.c(), new e7(iA, byteArrayOutputStream2), false);
                                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                int length3 = byteArray2.length;
                                if (length3 == 0) {
                                    bArr3 = new byte[0];
                                } else {
                                    byte[] bArr8 = new byte[length3];
                                    System.arraycopy(byteArray2, 0, bArr8, 0, length3);
                                    bArr3 = bArr8;
                                }
                                byte[] bArr9 = ws3VarD2.a;
                                int length4 = bArr9.length + bArr3.length;
                                byte[] bArr10 = new byte[length4];
                                System.arraycopy(bArr9, 0, bArr10, 0, bArr9.length);
                                System.arraycopy(bArr3, 0, bArr10, ws3VarD2.a.length, bArr3.length);
                                if (length4 == 0) {
                                    bArr4 = new byte[0];
                                } else {
                                    bArr4 = new byte[length4];
                                    System.arraycopy(bArr10, 0, bArr4, 0, length4);
                                }
                                nt3Var2.a.a(st3.a(new ws3(bArr4)));
                                return Optional.empty();
                            } catch (dep unused7) {
                                zk2Var3 = zk2.l;
                                return Optional.of(zk2Var3);
                            } catch (IOException | l6p e3) {
                                h9o.v(us3.a("CEiv6BFfPnitUE+D"), e3);
                                return null;
                            }
                        } catch (dep unused8) {
                            zk2Var3 = zk2.z;
                        } catch (s3p unused9) {
                            zk2Var3 = zk2.y;
                        }
                    case 4:
                        nt3 nt3Var3 = (nt3) obj;
                        try {
                            zg zgVar = nt3Var3.c;
                            ike ikeVar5 = nt3Var3.a;
                            try {
                                ikeVar5.a.set(ikeVar5.a(-(nt3Var3.b.a().b + zgVar.d())), ikeVar5.a());
                                return Optional.empty();
                            } catch (s3p unused10) {
                                zk2Var4 = zk2.i;
                                return Optional.of(zk2Var4);
                            }
                        } catch (s3p | xzo unused11) {
                            zk2Var4 = zk2.y;
                        } catch (ulo | xmp unused12) {
                            zk2Var4 = zk2.z;
                        }
                    case 5:
                        try {
                            ike ikeVar6 = ((nt3) obj).a;
                            ikeVar6.a(st3.a(ikeVar6.a().c() << ((int) ikeVar6.a().c())));
                            return Optional.empty();
                        } catch (dep unused13) {
                            zk2Var5 = zk2.z;
                            return Optional.of(zk2Var5);
                        } catch (s3p unused14) {
                            zk2Var5 = zk2.y;
                            return Optional.of(zk2Var5);
                        }
                    case 6:
                        try {
                            ike ikeVar7 = ((nt3) obj).a;
                            ikeVar7.a(st3.a(ikeVar7.a().c() >>> ((int) ikeVar7.a().c())));
                            return Optional.empty();
                        } catch (dep unused15) {
                            zk2Var6 = zk2.z;
                            return Optional.of(zk2Var6);
                        } catch (s3p unused16) {
                            zk2Var6 = zk2.y;
                            return Optional.of(zk2Var6);
                        }
                    case 7:
                        try {
                            ike ikeVar8 = ((nt3) obj).a;
                            ikeVar8.a(st3.a(ikeVar8.a().g() - ikeVar8.a().g()));
                            return Optional.empty();
                        } catch (dep unused17) {
                            zk2Var7 = zk2.z;
                            return Optional.of(zk2Var7);
                        } catch (s3p unused18) {
                            zk2Var7 = zk2.y;
                            return Optional.of(zk2Var7);
                        }
                    case 8:
                        try {
                            ike ikeVar9 = ((nt3) obj).a;
                            ikeVar9.a(st3.a(ikeVar9.a().c() - ikeVar9.a().c()));
                            return Optional.empty();
                        } catch (dep unused19) {
                            zk2Var8 = zk2.z;
                            return Optional.of(zk2Var8);
                        } catch (s3p unused20) {
                            zk2Var8 = zk2.y;
                            return Optional.of(zk2Var8);
                        }
                    case 9:
                        nt3 nt3Var4 = (nt3) obj;
                        try {
                            ike ikeVar10 = nt3Var4.a;
                            long jC3 = ikeVar10.a().c();
                            st3 st3VarA7 = ikeVar10.a();
                            try {
                                ike ikeVar11 = nt3Var4.a;
                                ArrayList arrayList3 = ikeVar11.a;
                                st3 st3Var = (st3) arrayList3.get(ikeVar11.a(jC3));
                                arrayList3.set(ikeVar11.a(jC3), st3VarA7);
                                ikeVar11.a(st3Var);
                                return Optional.empty();
                            } catch (s3p unused21) {
                                zk2Var9 = zk2.i;
                                return Optional.of(zk2Var9);
                            }
                        } catch (dep unused22) {
                            zk2Var9 = zk2.z;
                        } catch (s3p unused23) {
                            zk2Var9 = zk2.y;
                        }
                    case 10:
                        nt3 nt3Var5 = (nt3) obj;
                        try {
                            ike ikeVar12 = nt3Var5.a;
                            jC = nt3Var5.b.a().b + ikeVar12.a().c();
                            st3VarA = ikeVar12.a();
                        } catch (dep unused24) {
                            zk2Var10 = zk2.z;
                        } catch (s3p | xzo unused25) {
                            zk2Var10 = zk2.y;
                        }
                        try {
                            ike ikeVar13 = nt3Var5.a;
                            ArrayList arrayList4 = ikeVar13.a;
                            long j3 = -jC;
                            st3 st3Var2 = (st3) arrayList4.get(ikeVar13.a(j3));
                            arrayList4.set(ikeVar13.a(j3), st3VarA);
                            ikeVar13.a(st3Var2);
                            return Optional.empty();
                        } catch (l6p e4) {
                            h9o.v(us3.a("CEiv6BFfPnitUE+D"), e4);
                            return null;
                        } catch (s3p unused26) {
                            zk2Var10 = zk2.i;
                            return Optional.of(zk2Var10);
                        }
                    case 11:
                        nt3 nt3Var6 = (nt3) obj;
                        try {
                            zg zgVar2 = nt3Var6.c;
                            ikeVar = nt3Var6.a;
                            arrayList = ikeVar.a;
                            long jD = nt3Var6.b.a().b + zgVar2.d();
                            st3VarA2 = ikeVar.a();
                            j2 = -jD;
                        } catch (s3p | xzo unused27) {
                            zk2Var11 = zk2.y;
                        } catch (ulo | xmp unused28) {
                            zk2Var11 = zk2.z;
                        }
                        try {
                            st3 st3Var3 = (st3) arrayList.get(ikeVar.a(j2));
                            arrayList.set(ikeVar.a(j2), st3VarA2);
                            ikeVar.a(st3Var3);
                            return Optional.empty();
                        } catch (l6p e5) {
                            h9o.v(us3.a("CEiv6BFfPnitUE+D"), e5);
                            return null;
                        } catch (s3p unused29) {
                            zk2Var11 = zk2.i;
                            return Optional.of(zk2Var11);
                        }
                    case 12:
                        nt3 nt3Var7 = (nt3) obj;
                        try {
                            long jC4 = nt3Var7.a.a().c();
                            try {
                                ike ikeVar14 = nt3Var7.a;
                                if (jC4 == 0) {
                                    st3VarA3 = ikeVar14.a();
                                } else {
                                    ikeVar14.b--;
                                    st3VarA3 = (st3) ikeVar14.a.remove(ikeVar14.a(jC4));
                                }
                                ikeVar14.a(st3VarA3);
                                return Optional.empty();
                            } catch (l6p e6) {
                                h9o.v(us3.a("CEiv6BFfPnitUE+D"), e6);
                                return null;
                            } catch (s3p unused30) {
                                zk2Var12 = zk2.h;
                                return Optional.of(zk2Var12);
                            }
                        } catch (dep unused31) {
                            zk2Var12 = zk2.z;
                        } catch (s3p unused32) {
                            zk2Var12 = zk2.y;
                        }
                    case 13:
                        nt3 nt3Var8 = (nt3) obj;
                        try {
                            ike ikeVar15 = nt3Var8.a;
                            zg zgVar3 = nt3Var8.c;
                            long jC5 = ikeVar15.a().c();
                            long jC6 = ikeVar15.a().c();
                            gt3 gt3Var = nt3Var8.b;
                            gt3Var.a(zgVar3.a(), jC6, gt3Var.a().b);
                            zgVar3.a(jC5);
                            return Optional.empty();
                        } catch (dep unused33) {
                            zk2Var13 = zk2.z;
                            return Optional.of(zk2Var13);
                        } catch (iop | ulo unused34) {
                            zk2Var13 = zk2.s;
                            return Optional.of(zk2Var13);
                        } catch (jyo unused35) {
                            zk2Var13 = zk2.C;
                            return Optional.of(zk2Var13);
                        } catch (s3p unused36) {
                            zk2Var13 = zk2.y;
                            return Optional.of(zk2Var13);
                        } catch (xzo unused37) {
                            zk2Var13 = zk2.x;
                            return Optional.of(zk2Var13);
                        }
                    case 14:
                        nt3 nt3Var9 = (nt3) obj;
                        try {
                        } catch (s3p unused38) {
                            zk2Var14 = zk2.y;
                        }
                        try {
                            nt3Var9.a.a(st3.b(nt3Var9.a.a().b()));
                            return Optional.empty();
                        } catch (dep unused39) {
                            zk2Var14 = zk2.q;
                            return Optional.of(zk2Var14);
                        } catch (l6p e7) {
                            h9o.v(us3.a("CEiv6BFfPnitUE+D"), e7);
                            return null;
                        }
                    default:
                        try {
                            ike ikeVar16 = ((nt3) obj).a;
                            ArrayList arrayList5 = (ArrayList) ikeVar16.a().e();
                            int size = arrayList5.size();
                            while (i2 < size) {
                                Object obj2 = arrayList5.get(i2);
                                i2++;
                                ikeVar16.a((st3) obj2);
                            }
                            return Optional.empty();
                        } catch (dep unused40) {
                            zk2Var15 = zk2.z;
                            return Optional.of(zk2Var15);
                        } catch (l6p unused41) {
                            zk2Var15 = zk2.b;
                            return Optional.of(zk2Var15);
                        } catch (s3p unused42) {
                            zk2Var15 = zk2.y;
                            return Optional.of(zk2Var15);
                        }
                }
            } catch (l6p e8) {
                h9o.v(us3.a("CEiv6BFfPnitUE+D"), e8);
                return null;
            }
        } catch (l6p e9) {
            h9o.v(us3.a("CEiv6BFfPnitUE+D"), e9);
            return null;
        }
    }
}

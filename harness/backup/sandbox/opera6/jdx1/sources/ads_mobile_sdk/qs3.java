package ads_mobile_sdk;

import defpackage.dep;
import defpackage.efp;
import defpackage.g9p;
import defpackage.iop;
import defpackage.l6p;
import defpackage.s3p;
import defpackage.ulo;
import defpackage.x7p;
import defpackage.xmp;
import defpackage.zg;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* loaded from: classes.dex */
public final /* synthetic */ class qs3 implements g9p {
    public static final /* synthetic */ qs3 b;
    public static final /* synthetic */ qs3 c;
    public static final /* synthetic */ qs3 d;
    public static final /* synthetic */ qs3 e;
    public static final /* synthetic */ qs3 f;
    public static final /* synthetic */ qs3 g;
    public static final /* synthetic */ qs3 h;
    public static final /* synthetic */ qs3 i;
    public static final /* synthetic */ qs3 j;
    public static final /* synthetic */ qs3 k;
    public static final /* synthetic */ qs3 l;
    public static final /* synthetic */ qs3 m;
    public static final /* synthetic */ qs3 n;
    public static final /* synthetic */ qs3 o;
    public static final /* synthetic */ qs3 p;
    public static final /* synthetic */ qs3 q;
    public static final /* synthetic */ qs3 r;
    public static final /* synthetic */ qs3 s;
    public static final /* synthetic */ qs3 t;
    public static final /* synthetic */ qs3 u;
    public static final /* synthetic */ qs3 v;
    public final /* synthetic */ int a;

    static {
        int iA = u0h.a(((~1281944976) & 1463473736) | 847256033, (1281944976 & 1698424328) | 948255187, -1554299394, 419914800) ^ (1727952741 % 1091714937);
        v = new qs3(20);
        u = new qs3(19);
        t = new qs3(18);
        s = new qs3(17);
        r = new qs3(16);
        q = new qs3(15);
        p = new qs3(14);
        o = new qs3(13);
        n = new qs3(12);
        m = new qs3(11);
        l = new qs3(10);
        k = new qs3(9);
        j = new qs3(8);
        i = new qs3(7);
        h = new qs3(6);
        g = new qs3(5);
        f = new qs3(4);
        e = new qs3(3);
        d = new qs3(iA);
        c = new qs3(1);
        b = new qs3(0);
    }

    public /* synthetic */ qs3(int i2) {
        this.a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) throws l6p, efp {
        zk2 zk2Var;
        zk2 zk2Var2;
        zk2 zk2Var3;
        zk2 zk2Var4;
        zk2 zk2Var5;
        zk2 zk2Var6;
        zk2 zk2Var7;
        zk2 zk2Var8;
        zk2 zk2Var9;
        zk2 zk2Var10;
        st3 st3VarA;
        int[] iArr;
        Object obj2;
        zk2 zk2Var11;
        zk2 zk2Var12;
        zk2 zk2Var13;
        zk2 zk2Var14;
        zk2 zk2Var15;
        zk2 zk2Var16;
        zk2 zk2Var17;
        zk2 zk2Var18;
        zk2 zk2Var19;
        zk2 zk2Var20;
        Object obj3 = null;
        char c2 = 1;
        try {
            try {
                try {
                    try {
                        switch (this.a) {
                            case 0:
                                nt3 nt3Var = (nt3) obj;
                                try {
                                    ike ikeVar = nt3Var.a;
                                    long jC = ikeVar.a().c();
                                    if (ikeVar.a().c() != 0) {
                                        nt3Var.c.a(jC);
                                    }
                                    return Optional.empty();
                                } catch (dep unused) {
                                    zk2Var = zk2.z;
                                    return Optional.of(zk2Var);
                                } catch (iop | ulo unused2) {
                                    zk2Var = zk2.j;
                                    return Optional.of(zk2Var);
                                } catch (s3p unused3) {
                                    zk2Var = zk2.y;
                                    return Optional.of(zk2Var);
                                }
                            case 1:
                                try {
                                    ike ikeVar2 = ((nt3) obj).a;
                                    long jC2 = ikeVar2.a().c();
                                    st3 st3VarA2 = ikeVar2.a();
                                    st3 st3VarA3 = ikeVar2.a();
                                    List listE = st3VarA3.e();
                                    if (jC2 < 0) {
                                        jC2 += ((ArrayList) listE).size() + 1;
                                    }
                                    if (jC2 >= 0) {
                                        ArrayList arrayList = (ArrayList) listE;
                                        if (jC2 < arrayList.size() + 1) {
                                            arrayList.add((int) jC2, st3VarA2);
                                            ikeVar2.a(st3VarA3);
                                            return Optional.empty();
                                        }
                                    }
                                    throw new efp();
                                } catch (dep unused4) {
                                    zk2Var2 = zk2.z;
                                    return Optional.of(zk2Var2);
                                } catch (efp unused5) {
                                    zk2Var2 = zk2.J;
                                    return Optional.of(zk2Var2);
                                } catch (s3p unused6) {
                                    zk2Var2 = zk2.y;
                                    return Optional.of(zk2Var2);
                                }
                            case 2:
                                nt3 nt3Var2 = (nt3) obj;
                                try {
                                    ike ikeVar3 = nt3Var2.a;
                                    long jC3 = ikeVar3.a().c();
                                    if (ikeVar3.a().c() == 0) {
                                        nt3Var2.c.a(jC3);
                                    }
                                    return Optional.empty();
                                } catch (dep unused7) {
                                    zk2Var3 = zk2.z;
                                    return Optional.of(zk2Var3);
                                } catch (iop | ulo unused8) {
                                    zk2Var3 = zk2.j;
                                    return Optional.of(zk2Var3);
                                } catch (s3p unused9) {
                                    zk2Var3 = zk2.y;
                                    return Optional.of(zk2Var3);
                                }
                            case 3:
                                try {
                                    ((nt3) obj).a.a(st3.a(((ArrayList) r0.a().e()).size()));
                                    return Optional.empty();
                                } catch (dep unused10) {
                                    zk2Var4 = zk2.z;
                                    return Optional.of(zk2Var4);
                                } catch (s3p unused11) {
                                    zk2Var4 = zk2.y;
                                    return Optional.of(zk2Var4);
                                }
                            case 4:
                                try {
                                    ((nt3) obj).a.a(st3.a(r0.a().d().a.length));
                                    return Optional.empty();
                                } catch (dep unused12) {
                                    zk2Var5 = zk2.z;
                                    return Optional.of(zk2Var5);
                                } catch (s3p unused13) {
                                    zk2Var5 = zk2.y;
                                    return Optional.of(zk2Var5);
                                }
                            case 5:
                                try {
                                    ike ikeVar4 = ((nt3) obj).a;
                                    ikeVar4.a(st3.a(Math.log(ikeVar4.a().g())));
                                    return Optional.empty();
                                } catch (dep unused14) {
                                    zk2Var6 = zk2.z;
                                    return Optional.of(zk2Var6);
                                } catch (s3p unused15) {
                                    zk2Var6 = zk2.y;
                                    return Optional.of(zk2Var6);
                                }
                            case 6:
                                try {
                                    ike ikeVar5 = ((nt3) obj).a;
                                    ikeVar5.a(st3.a((ikeVar5.a().c() == 0 || ikeVar5.a().c() == 0) ? 0L : 1L));
                                    return Optional.empty();
                                } catch (dep unused16) {
                                    zk2Var7 = zk2.z;
                                    return Optional.of(zk2Var7);
                                } catch (s3p unused17) {
                                    zk2Var7 = zk2.y;
                                    return Optional.of(zk2Var7);
                                }
                            case 7:
                                try {
                                    ike ikeVar6 = ((nt3) obj).a;
                                    ikeVar6.a(st3.a(ikeVar6.a().c() != 0 ? 0L : 1L));
                                    return Optional.empty();
                                } catch (dep unused18) {
                                    zk2Var8 = zk2.z;
                                    return Optional.of(zk2Var8);
                                } catch (s3p unused19) {
                                    zk2Var8 = zk2.y;
                                    return Optional.of(zk2Var8);
                                }
                            case 8:
                                try {
                                    ike ikeVar7 = ((nt3) obj).a;
                                    long jC4 = ikeVar7.a().c();
                                    long jC5 = ikeVar7.a().c();
                                    if (jC4 == 0 && jC5 == 0) {
                                        j = 0;
                                    }
                                    ikeVar7.a(st3.a(j));
                                    return Optional.empty();
                                } catch (dep unused20) {
                                    zk2Var9 = zk2.z;
                                    return Optional.of(zk2Var9);
                                } catch (s3p unused21) {
                                    zk2Var9 = zk2.y;
                                    return Optional.of(zk2Var9);
                                }
                            case 9:
                                nt3 nt3Var3 = (nt3) obj;
                                try {
                                    ike ikeVar8 = nt3Var3.a;
                                    try {
                                        nt3Var3.a.a(st3.a(new ot3(false).compare(ikeVar8.a(), ikeVar8.a()) >= 0 ? 0L : 1L));
                                        return Optional.empty();
                                    } catch (IllegalArgumentException unused22) {
                                        return Optional.of(zk2.e);
                                    }
                                } catch (s3p unused23) {
                                    return Optional.of(zk2.y);
                                }
                            case 10:
                                nt3 nt3Var4 = (nt3) obj;
                                try {
                                    try {
                                        try {
                                            ike ikeVar9 = nt3Var4.a;
                                            long jC6 = ikeVar9.a().c();
                                            int[] iArr2 = {1516266761, 1142957872, 446044582, 1147282962, 861635011, -1643766350, 500618996, 1941690360, 410409117};
                                            char c3 = 7;
                                            char c4 = '\b';
                                            int i2 = iArr2[7] % iArr2[8];
                                            ArrayList arrayList2 = new ArrayList();
                                            int i3 = 0;
                                            int i4 = 0;
                                            while (i3 < ikeVar9.b) {
                                                try {
                                                    st3VarA = st3.a((st3) ikeVar9.a.get(i3));
                                                    iArr = new int[]{524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
                                                    obj2 = obj3;
                                                } catch (l6p e2) {
                                                    e = e2;
                                                }
                                                try {
                                                    int i5 = iArr[0];
                                                    char c5 = c2;
                                                    char c6 = c3;
                                                    char c7 = c4;
                                                    if (i4 >= (u0h.a(((~i5) & iArr[c2]) | iArr[2], (i5 & iArr[3]) | iArr[4], iArr[5], iArr[6]) ^ (iArr[c6] % iArr[c4]))) {
                                                        throw new l6p();
                                                    }
                                                    if (i4 == arrayList2.size()) {
                                                        arrayList2.add(st3VarA);
                                                    } else {
                                                        arrayList2.set(i4, st3VarA);
                                                    }
                                                    i4++;
                                                    i3++;
                                                    obj3 = obj2;
                                                    c3 = c6;
                                                    c2 = c5;
                                                    c4 = c7;
                                                } catch (l6p e3) {
                                                    e = e3;
                                                    throw new AssertionError(us3.a("CEiv6BFfPnitUE+D"), e);
                                                }
                                            }
                                            char c8 = c3;
                                            char c9 = c4;
                                            zg zgVar = nt3Var4.c;
                                            zg zgVar2 = new zg((ws3) zgVar.b, zgVar.a, ((x7p) zgVar.c).mo12a(), (ftj) zgVar.d);
                                            int[] iArr3 = {343945053, 300943123, 276960570, 1098387973, 1376531620, 1545514151, 271059426, 857490000, 454333378};
                                            int i6 = iArr3[c8] % iArr3[c9];
                                            int[] iArr4 = {114723506, 151129280, 1368781114, 134385090, 816173334, -1981646764, 34563124, 1737518944, 282828202};
                                            int i7 = iArr4[c8] % iArr4[c9];
                                            zgVar2.a(jC6);
                                            ikeVar9.a(st3.a(new dpj((byte) 15)));
                                            return Optional.empty();
                                        } catch (iop | ulo unused24) {
                                            zk2Var10 = zk2.u;
                                            return Optional.of(zk2Var10);
                                        }
                                    } catch (l6p e4) {
                                        e = e4;
                                        this = null;
                                        h9o.v(us3.a("CEiv6BFfPnitUE+D"), e);
                                        return this;
                                    }
                                } catch (dep unused25) {
                                    zk2Var10 = zk2.z;
                                    return Optional.of(zk2Var10);
                                } catch (s3p unused26) {
                                    zk2Var10 = zk2.y;
                                    return Optional.of(zk2Var10);
                                }
                            case 11:
                                try {
                                    ike ikeVar10 = ((nt3) obj).a;
                                    ikeVar10.a(st3.a(ikeVar10.a().a((Class) ikeVar10.a().b())));
                                    return Optional.empty();
                                } catch (dep unused27) {
                                    zk2Var11 = zk2.q;
                                    return Optional.of(zk2Var11);
                                } catch (s3p unused28) {
                                    zk2Var11 = zk2.y;
                                    return Optional.of(zk2Var11);
                                }
                            case 12:
                                try {
                                    ike ikeVar11 = ((nt3) obj).a;
                                    long jC7 = ikeVar11.a().c();
                                    long jC8 = ikeVar11.a().c();
                                    if (jC7 == 0) {
                                        return Optional.of(zk2.G);
                                    }
                                    ikeVar11.a(st3.a(jC8 % jC7));
                                    return Optional.empty();
                                } catch (dep unused29) {
                                    zk2Var12 = zk2.z;
                                    return Optional.of(zk2Var12);
                                } catch (s3p unused30) {
                                    zk2Var12 = zk2.y;
                                    return Optional.of(zk2Var12);
                                }
                            case 13:
                                try {
                                    ike ikeVar12 = ((nt3) obj).a;
                                    ikeVar12.a(st3.a(ikeVar12.a().g() * ikeVar12.a().g()));
                                    return Optional.empty();
                                } catch (dep unused31) {
                                    zk2Var13 = zk2.z;
                                    return Optional.of(zk2Var13);
                                } catch (s3p unused32) {
                                    zk2Var13 = zk2.y;
                                    return Optional.of(zk2Var13);
                                }
                            case 14:
                                try {
                                    ike ikeVar13 = ((nt3) obj).a;
                                    ikeVar13.a(st3.a(ikeVar13.a().c() * ikeVar13.a().c()));
                                    return Optional.empty();
                                } catch (dep unused33) {
                                    zk2Var14 = zk2.z;
                                    return Optional.of(zk2Var14);
                                } catch (s3p unused34) {
                                    zk2Var14 = zk2.y;
                                    return Optional.of(zk2Var14);
                                }
                            case 15:
                                try {
                                    ike ikeVar14 = ((nt3) obj).a;
                                    long jC9 = ikeVar14.a().c();
                                    ArrayList arrayList3 = new ArrayList();
                                    for (long j2 = 0; j2 < jC9; j2++) {
                                        arrayList3.add(ikeVar14.a());
                                    }
                                    Collections.reverse(arrayList3);
                                    ikeVar14.a(st3.a(arrayList3));
                                    return Optional.empty();
                                } catch (dep unused35) {
                                    zk2Var15 = zk2.z;
                                    return Optional.of(zk2Var15);
                                } catch (s3p unused36) {
                                    zk2Var15 = zk2.y;
                                    return Optional.of(zk2Var15);
                                }
                            case 16:
                                try {
                                    ike ikeVar15 = ((nt3) obj).a;
                                    ikeVar15.a(st3.a(Math.pow(ikeVar15.a().g(), ikeVar15.a().g())));
                                    return Optional.empty();
                                } catch (dep unused37) {
                                    zk2Var16 = zk2.z;
                                    return Optional.of(zk2Var16);
                                } catch (s3p unused38) {
                                    zk2Var16 = zk2.y;
                                    return Optional.of(zk2Var16);
                                }
                            case 17:
                                try {
                                    ((nt3) obj).a.a(st3.a((Object) null));
                                    return Optional.empty();
                                } catch (l6p unused39) {
                                    return Optional.of(zk2.b);
                                }
                            case 18:
                                nt3 nt3Var5 = (nt3) obj;
                                try {
                                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(nt3Var5.c.b(64L).a());
                                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                                    nt3Var5.a.a(st3.a(Double.longBitsToDouble(byteBufferWrap.getLong())));
                                    return Optional.empty();
                                } catch (l6p unused40) {
                                    zk2Var17 = zk2.b;
                                    return Optional.of(zk2Var17);
                                } catch (ulo unused41) {
                                    zk2Var17 = zk2.A;
                                    return Optional.of(zk2Var17);
                                }
                            case 19:
                                nt3 nt3Var6 = (nt3) obj;
                                try {
                                    nt3Var6.a.a(st3.a(nt3Var6.c.d()));
                                    return Optional.empty();
                                } catch (l6p unused42) {
                                    zk2Var18 = zk2.b;
                                    return Optional.of(zk2Var18);
                                } catch (ulo unused43) {
                                    zk2Var18 = zk2.A;
                                    return Optional.of(zk2Var18);
                                } catch (xmp unused44) {
                                    zk2Var18 = zk2.E;
                                    return Optional.of(zk2Var18);
                                }
                            default:
                                nt3 nt3Var7 = (nt3) obj;
                                try {
                                    long jD = nt3Var7.c.d();
                                    if (jD < 0 || jD > 2147483647L) {
                                        zk2Var20 = zk2.A;
                                    } else {
                                        if ((7 & jD) == 0) {
                                            nt3Var7.a.a(st3.a(nt3Var7.c.b(jD)));
                                            return Optional.empty();
                                        }
                                        zk2Var20 = zk2.f;
                                    }
                                    return Optional.of(zk2Var20);
                                } catch (l6p unused45) {
                                    zk2Var19 = zk2.b;
                                    return Optional.of(zk2Var19);
                                } catch (ulo unused46) {
                                    zk2Var19 = zk2.A;
                                    return Optional.of(zk2Var19);
                                } catch (xmp unused47) {
                                    zk2Var19 = zk2.E;
                                    return Optional.of(zk2Var19);
                                }
                        }
                    } catch (l6p e5) {
                        e = e5;
                    }
                } catch (l6p e6) {
                    h9o.v(us3.a("CEiv6BFfPnitUE+D"), e6);
                    return null;
                }
            } catch (l6p e7) {
                h9o.v(us3.a("CEiv6BFfPnitUE+D"), e7);
                return this;
            }
        } catch (iop e8) {
            h9o.v(us3.a("CEiv6BFfPnitUE+D"), e8);
            return null;
        }
    }
}

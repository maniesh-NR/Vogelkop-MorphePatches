package defpackage;

/* loaded from: classes.dex */
public final class xa5 {
    public static final float[] a;
    public static final float[] b;
    public static final x1m c;
    public static final x1m d;
    public static final e5i e;
    public static final e5i f;
    public static final e5i g;
    public static final e5i h;
    public static final e5i i;
    public static final e5i j;
    public static final e5i k;
    public static final e5i l;
    public static final e5i m;
    public static final e5i n;
    public static final e5i o;
    public static final e5i p;
    public static final e5i q;
    public static final e5i r;
    public static final izb s;
    public static final izb t;
    public static final e5i u;
    public static final e5i v;
    public static final e5i w;
    public static final naf x;
    public static final va5[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        x1m x1mVar = new x1m(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        x1m x1mVar2 = new x1m(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        x1m x1mVar3 = new x1m(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = x1mVar3;
        x1m x1mVar4 = new x1m(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = x1mVar4;
        r0o r0oVar = x1p.h;
        e5i e5iVar = new e5i("sRGB IEC61966-2.1", fArr, r0oVar, x1mVar, 0);
        e = e5iVar;
        e5i e5iVar2 = new e5i("sRGB IEC61966-2.1 (Linear)", fArr, r0oVar, 1.0d, 0.0f, 1.0f, 1);
        f = e5iVar2;
        e5i e5iVar3 = new e5i("scRGB-nl IEC 61966-2-2:2003", fArr, r0oVar, null, new yq4((byte) 15), new yq4((byte) 16), -0.799f, 2.399f, x1mVar, 2);
        g = e5iVar3;
        e5i e5iVar4 = new e5i("scRGB IEC 61966-2-2:2003", fArr, r0oVar, 1.0d, -0.5f, 7.499f, 3);
        h = e5iVar4;
        e5i e5iVar5 = new e5i("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, r0oVar, new x1m(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = e5iVar5;
        e5i e5iVar6 = new e5i("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, r0oVar, new x1m(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = e5iVar6;
        e5i e5iVar7 = new e5i("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new r0o(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = e5iVar7;
        e5i e5iVar8 = new e5i("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, r0oVar, x1mVar, 7);
        l = e5iVar8;
        e5i e5iVar9 = new e5i("NTSC (1953)", fArr2, x1p.e, new x1m(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = e5iVar9;
        e5i e5iVar10 = new e5i("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, r0oVar, new x1m(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        n = e5iVar10;
        e5i e5iVar11 = new e5i("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, r0oVar, 2.2d, 0.0f, 1.0f, 10);
        o = e5iVar11;
        e5i e5iVar12 = new e5i("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, x1p.f, new x1m(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = e5iVar12;
        r0o r0oVar2 = x1p.g;
        e5i e5iVar13 = new e5i("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, r0oVar2, 1.0d, -65504.0f, 65504.0f, 12);
        q = e5iVar13;
        e5i e5iVar14 = new e5i("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, r0oVar2, 1.0d, -65504.0f, 65504.0f, 13);
        r = e5iVar14;
        izb izbVar = new izb("Generic XYZ", 12884901889L, 14, (byte) 1);
        s = izbVar;
        izb izbVar2 = new izb("Generic L*a*b*", 12884901890L, 15, (byte) 0);
        t = izbVar2;
        e5i e5iVar15 = new e5i("None", fArr, r0oVar, x1mVar2, 16);
        u = e5iVar15;
        e5i e5iVar16 = new e5i("Hybrid Log Gamma encoding", fArr3, r0oVar, null, new yq4((byte) 17), new yq4((byte) 18), 0.0f, 1.0f, x1mVar3, 17);
        v = e5iVar16;
        e5i e5iVar17 = new e5i("Perceptual Quantizer encoding", fArr3, r0oVar, null, new yq4((byte) 19), new yq4((byte) 20), 0.0f, 1.0f, x1mVar4, 18);
        w = e5iVar17;
        naf nafVar = new naf(19, 12884901890L, "Oklab");
        x = nafVar;
        y = new va5[]{e5iVar, e5iVar2, e5iVar3, e5iVar4, e5iVar5, e5iVar6, e5iVar7, e5iVar8, e5iVar9, e5iVar10, e5iVar11, e5iVar12, e5iVar13, e5iVar14, izbVar, izbVar2, e5iVar15, e5iVar16, e5iVar17, nafVar};
    }

    public static double a(x1m x1mVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = x1mVar.b;
        double d6 = x1mVar.c;
        double d7 = x1mVar.d;
        double d8 = x1mVar.e;
        double d9 = x1mVar.f;
        double d10 = d5 * d4;
        return (x1mVar.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(x1m x1mVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / x1mVar.b;
        double d5 = 1.0d / x1mVar.c;
        double d6 = 1.0d / x1mVar.d;
        double d7 = x1mVar.e;
        double d8 = x1mVar.f;
        double d9 = (d2 * d3) / (x1mVar.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(x1m x1mVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = x1mVar.b;
        double d6 = x1mVar.d;
        double dPow = (Math.pow(d4, d6) * x1mVar.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * x1mVar.f) + x1mVar.e), x1mVar.g) * d3;
    }

    public static double d(x1m x1mVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -x1mVar.b;
        double d6 = x1mVar.e;
        double d7 = 1.0d / x1mVar.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-x1mVar.f)) + x1mVar.c), 1.0d / x1mVar.d) * d3;
    }
}

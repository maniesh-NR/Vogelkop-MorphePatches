package defpackage;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class oj9 {
    public static final String A0;
    public static final oj9 Q = new oj9(new nj9());
    public static final String R = "0";
    public static final String S = "1";
    public static final String T = "2";
    public static final String U = "3";
    public static final String V = "4";
    public static final String W = "5";
    public static final String X = "6";
    public static final String Y = "7";
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public static final String u0;
    public static final String v0;
    public static final String w0;
    public static final String x0;
    public static final String y0;
    public static final String z0;
    public final float A;
    public final byte[] B;
    public final int C;
    public final ja5 D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public int P;
    public final String a;
    public final String b;
    public final h1b c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final lxd l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List q;
    public final vl7 r;
    public final long s;
    public final boolean t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final float y;
    public final int z;

    static {
        String str = tym.a;
        Z = "9";
        a0 = "a";
        b0 = "b";
        c0 = "c";
        d0 = "d";
        e0 = "e";
        f0 = "f";
        g0 = "g";
        h0 = "h";
        i0 = "i";
        j0 = "j";
        k0 = "k";
        l0 = "l";
        m0 = "m";
        n0 = "n";
        o0 = "o";
        p0 = "p";
        q0 = "q";
        r0 = "r";
        s0 = "s";
        t0 = "t";
        u0 = "u";
        v0 = "v";
        w0 = "w";
        x0 = "x";
        y0 = "y";
        z0 = "z";
        A0 = "10";
    }

    public oj9(nj9 nj9Var) throws MissingResourceException {
        boolean z;
        String str;
        this.a = nj9Var.a;
        String strO = tym.O(nj9Var.d);
        this.d = strO;
        if (nj9Var.c.isEmpty() && nj9Var.b != null) {
            this.c = h1b.v(new jzb(strO, nj9Var.b));
            this.b = nj9Var.b;
        } else if (!nj9Var.c.isEmpty() && nj9Var.b == null) {
            h1b h1bVar = nj9Var.c;
            this.c = h1bVar;
            int size = h1bVar.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    str = ((jzb) h1bVar.get(0)).b;
                    break;
                }
                Object obj = h1bVar.get(i);
                i++;
                jzb jzbVar = (jzb) obj;
                if (TextUtils.equals(jzbVar.a, strO)) {
                    str = jzbVar.b;
                    break;
                }
            }
            this.b = str;
        } else if (nj9Var.c.isEmpty() && nj9Var.b == null) {
            z = true;
            z4o.H(z);
            this.c = nj9Var.c;
            this.b = nj9Var.b;
        } else {
            for (int i2 = 0; i2 < nj9Var.c.size(); i2++) {
                if (((jzb) nj9Var.c.get(i2)).b.equals(nj9Var.b)) {
                    z = true;
                    break;
                }
            }
            z = false;
            z4o.H(z);
            this.c = nj9Var.c;
            this.b = nj9Var.b;
        }
        this.e = nj9Var.e;
        z4o.G("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", nj9Var.g == 0 || (nj9Var.f & 32768) != 0);
        this.f = nj9Var.f;
        this.g = nj9Var.g;
        int i3 = nj9Var.h;
        this.h = i3;
        int i4 = nj9Var.i;
        this.i = i4;
        this.j = i4 != -1 ? i4 : i3;
        this.k = nj9Var.j;
        this.l = nj9Var.k;
        this.m = nj9Var.l;
        this.n = nj9Var.m;
        this.o = nj9Var.n;
        this.p = nj9Var.o;
        List list = nj9Var.p;
        this.q = list == null ? Collections.EMPTY_LIST : list;
        vl7 vl7Var = nj9Var.q;
        this.r = vl7Var;
        this.s = nj9Var.r;
        this.t = nj9Var.s;
        this.u = nj9Var.t;
        this.v = nj9Var.u;
        this.w = nj9Var.v;
        this.x = nj9Var.w;
        this.y = nj9Var.x;
        int i5 = nj9Var.y;
        this.z = i5 == -1 ? 0 : i5;
        float f = nj9Var.z;
        this.A = f == -1.0f ? 1.0f : f;
        this.B = nj9Var.A;
        this.C = nj9Var.B;
        this.D = nj9Var.C;
        this.E = nj9Var.D;
        this.F = nj9Var.E;
        this.G = nj9Var.F;
        this.H = nj9Var.G;
        int i6 = nj9Var.H;
        this.I = i6 == -1 ? 0 : i6;
        int i7 = nj9Var.I;
        this.J = i7 != -1 ? i7 : 0;
        this.K = nj9Var.J;
        this.L = nj9Var.K;
        this.M = nj9Var.L;
        this.N = nj9Var.M;
        int i8 = nj9Var.N;
        if (i8 != 0 || vl7Var == null) {
            this.O = i8;
        } else {
            this.O = 1;
        }
    }

    public static String c(oj9 oj9Var) {
        int i;
        String str;
        String strL;
        String str2;
        int i2;
        if (oj9Var == null) {
            return "null";
        }
        int i3 = oj9Var.e;
        h1b h1bVar = oj9Var.c;
        String str3 = oj9Var.d;
        int i4 = oj9Var.G;
        int i5 = oj9Var.F;
        int i6 = oj9Var.E;
        float f = oj9Var.y;
        ja5 ja5Var = oj9Var.D;
        float f2 = oj9Var.A;
        int i7 = oj9Var.x;
        int i8 = oj9Var.w;
        int i9 = oj9Var.v;
        int i10 = oj9Var.u;
        vl7 vl7Var = oj9Var.r;
        String str4 = oj9Var.k;
        int i11 = oj9Var.j;
        String str5 = oj9Var.m;
        int i12 = oj9Var.f;
        r40 r40Var = new r40(String.valueOf(','), (byte) 3);
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(oj9Var.a);
        sb.append(", mimeType=");
        sb.append(oj9Var.n);
        if (str5 != null) {
            sb.append(", container=");
            sb.append(str5);
        }
        if (i11 != -1) {
            sb.append(", bitrate=");
            sb.append(i11);
        }
        if (str4 != null) {
            sb.append(", codecs=");
            sb.append(str4);
        }
        if (vl7Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i13 = 0;
            while (i13 < vl7Var.d) {
                UUID uuid = vl7Var.a[i13].b;
                if (uuid.equals(q54.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(q54.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(q54.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(q54.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(q54.a)) {
                    linkedHashSet.add("universal");
                } else {
                    i2 = i13;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i13 = i2 + 1;
                }
                i2 = i13;
                i13 = i2 + 1;
            }
            sb.append(", drm=[");
            r40Var.a(sb, linkedHashSet.iterator());
            sb.append(']');
        }
        if (i10 != -1 && i9 != -1) {
            vep.w(i10, i9, ", res=", "x", sb);
        }
        if (i8 != -1 && i7 != -1) {
            vep.w(i8, i7, ", decRes=", "x", sb);
        }
        double d = f2;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d) {
            Double.isNaN(d);
            sb.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            String str6 = tym.a;
            sb.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (ja5Var != null) {
            int i14 = ja5Var.f;
            int i15 = ja5Var.e;
            if ((i15 != -1 && i14 != -1) || ja5Var.d()) {
                sb.append(", color=");
                if (ja5Var.d()) {
                    String strB = ja5.b(ja5Var.a);
                    String strA = ja5.a(ja5Var.b);
                    String strC = ja5.c(ja5Var.c);
                    String str7 = tym.a;
                    Locale locale = Locale.US;
                    strL = sko.l(strB, "/", strA, "/", strC);
                } else {
                    strL = "NA/NA/NA";
                }
                if (i15 == -1 || i14 == -1) {
                    str2 = "NA/NA";
                } else {
                    str2 = i15 + "/" + i14;
                }
                sb.append(strL + "/" + str2);
            }
        }
        if (f != -1.0f) {
            sb.append(", fps=");
            sb.append(f);
        }
        if (i6 != -1) {
            sb.append(", maxSubLayers=");
            sb.append(i6);
        }
        if (i5 != -1) {
            sb.append(", channels=");
            sb.append(i5);
        }
        if (i4 != -1) {
            sb.append(", sample_rate=");
            sb.append(i4);
        }
        if (str3 != null) {
            sb.append(", language=");
            sb.append(str3);
        }
        if (!h1bVar.isEmpty()) {
            sb.append(", labels=[");
            r40Var.a(sb, nb6.W(new b10((byte) 12), h1bVar).iterator());
            sb.append("]");
        }
        if (i3 != 0) {
            sb.append(", selectionFlags=[");
            String str8 = tym.a;
            ArrayList arrayList = new ArrayList();
            if ((i3 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i3 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i3 & 2) != 0) {
                arrayList.add("forced");
            }
            r40Var.a(sb, arrayList.iterator());
            sb.append("]");
        }
        if (i12 != 0) {
            sb.append(", roleFlags=[");
            String str9 = tym.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i12 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i12 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i12 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i12 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i12 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i12 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i12 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i12;
            if ((i & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                arrayList2.add("sign");
            }
            if ((i & NotificationCompat.FLAG_GROUP_SUMMARY) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            r40Var.a(sb, arrayList2.iterator());
            sb.append("]");
        } else {
            i = i12;
        }
        if ((i & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            int i16 = oj9Var.g;
            String str10 = tym.a;
            if (i16 == 0) {
                str = AdError.UNDEFINED_DOMAIN;
            } else if (i16 == 1) {
                str = "original";
            } else if (i16 == 2) {
                str = "depth-linear";
            } else if (i16 == 3) {
                str = "depth-inverse";
            } else {
                if (i16 != 4) {
                    qp2.n("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final nj9 a() {
        nj9 nj9Var = new nj9();
        nj9Var.a = this.a;
        nj9Var.b = this.b;
        nj9Var.c = this.c;
        nj9Var.d = this.d;
        nj9Var.e = this.e;
        nj9Var.f = this.f;
        nj9Var.h = this.h;
        nj9Var.i = this.i;
        nj9Var.j = this.k;
        nj9Var.k = this.l;
        nj9Var.l = this.m;
        nj9Var.m = this.n;
        nj9Var.n = this.o;
        nj9Var.o = this.p;
        nj9Var.p = this.q;
        nj9Var.q = this.r;
        nj9Var.r = this.s;
        nj9Var.s = this.t;
        nj9Var.t = this.u;
        nj9Var.u = this.v;
        nj9Var.v = this.w;
        nj9Var.w = this.x;
        nj9Var.x = this.y;
        nj9Var.y = this.z;
        nj9Var.z = this.A;
        nj9Var.A = this.B;
        nj9Var.B = this.C;
        nj9Var.C = this.D;
        nj9Var.D = this.E;
        nj9Var.E = this.F;
        nj9Var.F = this.G;
        nj9Var.G = this.H;
        nj9Var.H = this.I;
        nj9Var.I = this.J;
        nj9Var.J = this.K;
        nj9Var.K = this.L;
        nj9Var.L = this.M;
        nj9Var.M = this.N;
        nj9Var.N = this.O;
        return nj9Var;
    }

    public final boolean b(oj9 oj9Var) {
        List list = this.q;
        if (list.size() != oj9Var.q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) oj9Var.q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final oj9 d(oj9 oj9Var) {
        String str;
        String str2;
        int i;
        int i2;
        if (this == oj9Var) {
            return this;
        }
        int i3 = dzd.i(this.n);
        String str3 = oj9Var.a;
        int i4 = oj9Var.M;
        int i5 = oj9Var.N;
        String str4 = oj9Var.b;
        if (str4 == null) {
            str4 = this.b;
        }
        h1b h1bVar = (!oj9Var.c.isEmpty() ? oj9Var : this).c;
        if ((i3 != 3 && i3 != 1) || (str = oj9Var.d) == null) {
            str = this.d;
        }
        int i6 = this.h;
        if (i6 == -1) {
            i6 = oj9Var.h;
        }
        int i7 = this.i;
        if (i7 == -1) {
            i7 = oj9Var.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String strU = tym.u(oj9Var.k, i3);
            if (tym.Z(strU).length == 1) {
                str5 = strU;
            }
        }
        lxd lxdVarB = oj9Var.l;
        lxd lxdVar = this.l;
        if (lxdVar != null) {
            lxdVarB = lxdVar.b(lxdVarB);
        }
        float f = this.y;
        if (f == -1.0f && i3 == 2) {
            f = oj9Var.y;
        }
        int i8 = this.e | oj9Var.e;
        int i9 = this.f | oj9Var.f;
        vl7 vl7Var = oj9Var.r;
        ArrayList arrayList = new ArrayList();
        if (vl7Var != null) {
            String str6 = vl7Var.c;
            ul7[] ul7VarArr = vl7Var.a;
            int length = ul7VarArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10;
                ul7 ul7Var = ul7VarArr[i11];
                int i12 = length;
                if (ul7Var.e != null) {
                    arrayList.add(ul7Var);
                }
                i10 = i11 + 1;
                length = i12;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        vl7 vl7Var2 = this.r;
        if (vl7Var2 != null) {
            if (str2 == null) {
                str2 = vl7Var2.c;
            }
            int size = arrayList.size();
            ul7[] ul7VarArr2 = vl7Var2.a;
            String str7 = str2;
            int length2 = ul7VarArr2.length;
            int i13 = 0;
            while (i13 < length2) {
                int i14 = i13;
                ul7 ul7Var2 = ul7VarArr2[i14];
                int i15 = length2;
                if (ul7Var2.e != null) {
                    UUID uuid = ul7Var2.b;
                    i2 = i5;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size) {
                            i = size;
                            arrayList.add(ul7Var2);
                            break;
                        }
                        i = size;
                        if (!((ul7) arrayList.get(i16)).b.equals(uuid)) {
                            i16++;
                            size = i;
                        }
                    }
                } else {
                    i = size;
                    i2 = i5;
                }
                i13 = i14 + 1;
                length2 = i15;
                i5 = i2;
                size = i;
            }
            str2 = str7;
        }
        int i17 = i5;
        vl7 vl7Var3 = arrayList.isEmpty() ? null : new vl7(str2, arrayList);
        nj9 nj9VarA = a();
        nj9VarA.a = str3;
        nj9VarA.b = str4;
        nj9VarA.c = h1b.s(h1bVar);
        nj9VarA.d = str;
        nj9VarA.e = i8;
        nj9VarA.f = i9;
        nj9VarA.h = i6;
        nj9VarA.i = i7;
        nj9VarA.j = str5;
        nj9VarA.k = lxdVarB;
        nj9VarA.q = vl7Var3;
        nj9VarA.x = f;
        nj9VarA.L = i4;
        nj9VarA.M = i17;
        return new oj9(nj9VarA);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || oj9.class != obj.getClass()) {
            return false;
        }
        oj9 oj9Var = (oj9) obj;
        int i2 = this.P;
        return (i2 == 0 || (i = oj9Var.P) == 0 || i2 == i) && this.e == oj9Var.e && this.f == oj9Var.f && this.g == oj9Var.g && this.h == oj9Var.h && this.i == oj9Var.i && this.o == oj9Var.o && this.s == oj9Var.s && this.u == oj9Var.u && this.v == oj9Var.v && this.w == oj9Var.w && this.x == oj9Var.x && this.z == oj9Var.z && this.C == oj9Var.C && this.E == oj9Var.E && this.F == oj9Var.F && this.G == oj9Var.G && this.H == oj9Var.H && this.I == oj9Var.I && this.J == oj9Var.J && this.K == oj9Var.K && this.M == oj9Var.M && this.N == oj9Var.N && this.O == oj9Var.O && Float.compare(this.y, oj9Var.y) == 0 && Float.compare(this.A, oj9Var.A) == 0 && Objects.equals(this.a, oj9Var.a) && Objects.equals(this.b, oj9Var.b) && this.c.equals(oj9Var.c) && Objects.equals(this.k, oj9Var.k) && Objects.equals(this.m, oj9Var.m) && Objects.equals(this.n, oj9Var.n) && Objects.equals(this.d, oj9Var.d) && Arrays.equals(this.B, oj9Var.B) && Objects.equals(this.l, oj9Var.l) && Objects.equals(this.D, oj9Var.D) && Objects.equals(this.r, oj9Var.r) && b(oj9Var);
    }

    public final int hashCode() {
        int i = this.P;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str4 = this.k;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        lxd lxdVar = this.l;
        int iHashCode5 = (iHashCode4 + (lxdVar == null ? 0 : lxdVar.hashCode())) * 961;
        String str5 = this.m;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.n;
        int iFloatToIntBits = ((((((((((((((((((((((Float.floatToIntBits(this.A) + ((((Float.floatToIntBits(this.y) + ((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31)) * 31) + this.z) * 31)) * 31) + this.C) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.M) * 31) + this.N) * 31) + this.O;
        this.P = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.y);
        sb.append(", ");
        sb.append(this.D);
        sb.append("], [");
        sb.append(this.F);
        sb.append(", ");
        return p3p.k(this.G, "])", sb);
    }
}

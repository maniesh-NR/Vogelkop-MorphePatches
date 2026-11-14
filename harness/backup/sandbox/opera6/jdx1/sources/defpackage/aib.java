package defpackage;

import android.content.Context;
import android.media.ImageReader;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.widget.EdgeEffect;
import androidx.core.app.NotificationCompat;
import com.opera.api.Callback;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class aib {
    public static final u62 b;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final String[] h;
    public static final kmb i;
    public static final ff1 j;
    public static final j8m k;
    public static final a2k l;
    public static final byte[] m;
    public static final byte[] n;
    public static final iip o;
    public static Boolean p;
    public static final u62 a = new u62(0);
    public static final ue5 c = new ue5(-658133435, new ef5((byte) 20), false);

    static {
        byte b2 = 1;
        b = new u62(b2);
        new ue5(133218179, new gf5((byte) 2), false);
        d = new int[]{0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
        e = new int[]{0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
        f = new int[]{67108863, 33554431};
        g = new int[]{26, 25};
        h = new String[]{"AT", "BE", "BG", "CY", "CZ", "DE", "DK", "EE", "ES", "FI", "FR", "GR", "HR", "HU", "IE", "IS", "IT", "LI", "LT", "LU", "LV", "MT", "NL", "NO", "PL", "PT", "RO", "SE", "SI", "SK"};
        i = new kmb();
        j = new ff1(Float.NaN, Float.NaN);
        k = new j8m(new bli((byte) 8), new bli((byte) 9));
        l = new a2k(new y8f(4333543705419175690L));
        m = new byte[]{0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
        n = new byte[]{0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};
        o = new iip(b2);
    }

    public static final void A(w6f w6fVar, tcc tccVar, Object obj, Function0 function0) {
        tccVar.a(new ju2(w6fVar, obj, function0, (byte) 3));
    }

    public static final void B(w6f w6fVar, ndc ndcVar, Object obj, Function0 function0) {
        A(w6fVar, ndcVar.getLifecycle(), obj, function0);
    }

    public static final byte[] E(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        byte[] bArr = new byte[8192];
        int i2 = inputStream.read(bArr);
        while (i2 >= 0) {
            byteArrayOutputStream.write(bArr, 0, i2);
            i2 = inputStream.read(bArr);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void F(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        long j2 = jArr[8];
        long j3 = jArr[18];
        long j4 = j2 + (j3 << 4);
        jArr[8] = j4;
        long j5 = j4 + (j3 << 1);
        jArr[8] = j5;
        jArr[8] = j5 + j3;
        long j6 = jArr[7];
        long j7 = jArr[17];
        long j8 = j6 + (j7 << 4);
        jArr[7] = j8;
        long j9 = j8 + (j7 << 1);
        jArr[7] = j9;
        jArr[7] = j9 + j7;
        long j10 = jArr[6];
        long j11 = jArr[16];
        long j12 = j10 + (j11 << 4);
        jArr[6] = j12;
        long j13 = j12 + (j11 << 1);
        jArr[6] = j13;
        jArr[6] = j13 + j11;
        long j14 = jArr[5];
        long j15 = jArr[15];
        long j16 = j14 + (j15 << 4);
        jArr[5] = j16;
        long j17 = j16 + (j15 << 1);
        jArr[5] = j17;
        jArr[5] = j17 + j15;
        long j18 = jArr[4];
        long j19 = jArr[14];
        long j20 = j18 + (j19 << 4);
        jArr[4] = j20;
        long j21 = j20 + (j19 << 1);
        jArr[4] = j21;
        jArr[4] = j21 + j19;
        long j22 = jArr[3];
        long j23 = jArr[13];
        long j24 = j22 + (j23 << 4);
        jArr[3] = j24;
        long j25 = j24 + (j23 << 1);
        jArr[3] = j25;
        jArr[3] = j25 + j23;
        long j26 = jArr[2];
        long j27 = jArr[12];
        long j28 = j26 + (j27 << 4);
        jArr[2] = j28;
        long j29 = j28 + (j27 << 1);
        jArr[2] = j29;
        jArr[2] = j29 + j27;
        long j30 = jArr[1];
        long j31 = jArr[11];
        long j32 = j30 + (j31 << 4);
        jArr[1] = j32;
        long j33 = j32 + (j31 << 1);
        jArr[1] = j33;
        jArr[1] = j33 + j31;
        long j34 = jArr[0];
        long j35 = jArr[10];
        long j36 = j34 + (j35 << 4);
        jArr[0] = j36;
        long j37 = j36 + (j35 << 1);
        jArr[0] = j37;
        jArr[0] = j37 + j35;
        G(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void G(long[] jArr) {
        jArr[10] = 0;
        int i2 = 0;
        while (i2 < 10) {
            long j2 = jArr[i2];
            long j3 = j2 / 67108864;
            jArr[i2] = j2 - (j3 << 26);
            int i3 = i2 + 1;
            long j4 = jArr[i3] + j3;
            jArr[i3] = j4;
            long j5 = j4 / 33554432;
            jArr[i3] = j4 - (j5 << 25);
            i2 += 2;
            jArr[i2] = jArr[i2] + j5;
        }
        long j6 = jArr[0];
        long j7 = jArr[10];
        long j8 = j6 + (j7 << 4);
        jArr[0] = j8;
        long j9 = j8 + (j7 << 1);
        jArr[0] = j9;
        long j10 = j9 + j7;
        jArr[0] = j10;
        jArr[10] = 0;
        long j11 = j10 / 67108864;
        jArr[0] = j10 - (j11 << 26);
        jArr[1] = jArr[1] + j11;
    }

    public static yla H(Context context, l0c l0cVar) {
        String strSubstring;
        TelephonyManager telephonyManager;
        List listAsList = Arrays.asList(new jp8(0, "id", "id", Collections.singletonList("510")), new jp8(1, Arrays.asList("404", "405"), "in", Arrays.asList("en", "hi", "bn", "te", "mr", "ta", "ur", "kn", "ml", "gu")), new jp8(1, "bd", "bn", Collections.singletonList("470")), new jp8(1, "pk", "ur", Collections.singletonList("410")), new jp8(2, "fr", "fr", Collections.singletonList("208")), new jp8(2, "de", "de", Collections.singletonList("262")), new jp8(2, "gb", "en", Arrays.asList("234", "235")), new jp8(2, "es", "es", Collections.singletonList("214")), new jp8(2, "ae", "ar", Arrays.asList("424", "430", "431")), new jp8(2, "bh", "ar", Collections.singletonList("426")), new jp8(2, "kw", "ar", Collections.singletonList("419")), new jp8(2, "om", "ar", Collections.singletonList("422")), new jp8(2, "qa", "ar", Collections.singletonList("427")), new jp8(2, "iq", "ar", Collections.singletonList("418")), new jp8(2, "sa", "ar", Collections.singletonList("420")), new jp8(2, Collections.singletonList("655"), "za", Arrays.asList("en", "af", "zu")), new jp8(2, Collections.singletonList("621"), "ng", Arrays.asList("en", "ha")), new jp8(2, Collections.singletonList("640"), "tz", Arrays.asList("sw", "en")), new jp8(2, "gh", "en", Collections.singletonList("620")), new jp8(2, Collections.singletonList("639"), "ke", Arrays.asList("en", "sw")), new jp8(2, "ru", "ru", Collections.singletonList("250")), new jp8(2, "ua", "ru", Collections.singletonList("255")), new jp8(2, "by", "ru", Collections.singletonList("257")), new jp8(2, "zm", "en", Collections.singletonList("645")), new jp8(2, Collections.singletonList("641"), "ug", Arrays.asList("sw", "en")), new jp8(2, "zw", "en", Collections.singletonList("648")), new jp8(2, "mw", "en", Collections.singletonList("650")), new jp8(2, "ss", "en", Collections.singletonList("659")), new jp8(2, Collections.singletonList("624"), "cm", Arrays.asList("fr", "en")), new jp8(2, Collections.singletonList("630"), "cd", Arrays.asList("fr", "sw")), new jp8(2, "bj", "fr", Collections.singletonList("616")), new jp8(2, "bf", "fr", Collections.singletonList("613")), new jp8(2, "gn", "fr", Collections.singletonList("611")), new jp8(2, "sn", "fr", Collections.singletonList("608")), new jp8(2, "ml", "fr", Collections.singletonList("610")), new jp8(2, "ne", "fr", Collections.singletonList("614")), new jp8(2, Collections.singletonList("635"), "rw", Arrays.asList("fr", "sw")), new jp8(2, "ci", "fr", Collections.singletonList("384")), new jp8(2, "bi", "fr", Collections.singletonList("642")), new jp8(2, "mg", "fr", Collections.singletonList("646")), new jp8(2, "td", "fr", Collections.singletonList("622")), new jp8(2, "cv", "pt", Collections.singletonList("625")), new jp8(2, "st", "pt", Collections.singletonList("626")), new jp8(2, "ao", "pt", Collections.singletonList("631")), new jp8(2, "mz", "pt", Collections.singletonList("643")), new jp8(2, "gw", "pt", Collections.singletonList("632")), new jp8(2, "eg", "ar", Collections.singletonList("602")), new jp8(2, Collections.singletonList("603"), "dz", Arrays.asList("ar", "fr")), new jp8(2, Collections.singletonList("604"), "ma", Arrays.asList("ar", "fr")), new jp8(2, Collections.singletonList("605"), "tn", Arrays.asList("ar", "fr")), new jp8(2, "ly", "ar", Collections.singletonList("606")), new jp8(2, "sd", "ar", Collections.singletonList("634")), new jp8(2, "so", "ar", Collections.singletonList("637")), new jp8(2, "mr", "ar", Collections.singletonList("609")), new jp8(2, "dj", "ar", Collections.singletonList("638")), new jp8(2, Collections.singletonList("636"), "et", Arrays.asList("am", "en")), new jp8(2, "lr", "en", Collections.singletonList("618")), new jp8(2, "sl", "en", Collections.singletonList("619")), new jp8(2, "tg", "fr", Collections.singletonList("615")), new jp8(2, "cg", "fr", Collections.singletonList("630")), new jp8(2, "ga", "fr", Collections.singletonList("628")), new jp8(2, "br", "pt", Collections.singletonList("724")), new jp8(2, "mx", "es", Collections.singletonList("334")), new jp8(2, "ar", "es", Collections.singletonList("722")), new jp8(2, "co", "es", Collections.singletonList("732")), new jp8(2, "cl", "es", Collections.singletonList("730")), new jp8(2, "pe", "es", Collections.singletonList("716")), new kp8(), new lp8());
        Iterator it = listAsList.iterator();
        mp8 mp8VarB = null;
        while (it.hasNext() && (mp8VarB = ((np8) it.next()).c(l0cVar)) == null) {
        }
        if (mp8VarB == null) {
            String lowerCase = ((String) i0l.h(context).get()).toLowerCase(Locale.ROOT);
            String lowerCase2 = Locale.getDefault().getCountry().toLowerCase(Locale.US);
            switch (((bu6) i0l.b.d(context)).a) {
                case 0:
                    try {
                        telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    } catch (Throwable unused) {
                    }
                    if (telephonyManager == null) {
                        strSubstring = "";
                        break;
                    } else {
                        strSubstring = telephonyManager.getNetworkOperator().substring(0, 3);
                        break;
                    }
                default:
                    strSubstring = (String) s6e.b(context).b.e;
                    break;
            }
            Iterator it2 = listAsList.iterator();
            while (it2.hasNext() && (mp8VarB = ((np8) it2.next()).b(l0cVar, lowerCase, lowerCase2, strSubstring)) == null) {
            }
        }
        if (mp8VarB != null) {
            try {
                return new yla(new URL(mp8VarB.n()), new URL(mp8VarB.z()), 2, l0cVar, false);
            } catch (MalformedURLException unused2) {
            }
        }
        h9o.e();
        return null;
    }

    public static void I(bf9 bf9Var, String str, String str2, String str3, String str4, Callback callback) throws JSONException {
        if (str.isEmpty()) {
            bf9Var.G(str3, callback);
            return;
        }
        Uri uri = Uri.parse(str3);
        Uri uri2 = str4 != null ? Uri.parse(str4) : null;
        if (bf9Var.q() == null) {
            callback.run(Boolean.FALSE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        orb orbVar = new orb();
        try {
            jSONObject.put("type", orb.t("link"));
            orbVar.p(str, "title");
            if (str2 != null) {
                orbVar.p(str2, "description");
            }
            orbVar.p(uri, "url");
            if (uri2 != null) {
                orbVar.p(uri2, "preview");
            }
            bf9Var.E(new w59(jSONObject.toString(), orbVar.a.toString(), (String) null, (String) null), new j12(callback, (byte) 3));
        } catch (JSONException e2) {
            t3p.n(e2);
        }
    }

    public static byte[] J(byte[] bArr) {
        int length = bArr.length;
        fub fubVar = new fub();
        fubVar.update(bArr, 0, length);
        return fubVar.digest();
    }

    public static y85 K(int i2, lp6 lp6Var, g1g g1gVar) throws s1g, InterruptedIOException {
        y85 y85VarB = y85.b(lp6Var, g1gVar);
        while (true) {
            int i3 = y85VarB.b;
            if (i3 == i2) {
                return y85VarB;
            }
            vep.y(i3, "Ignoring unknown WAV chunk: ");
            long j2 = y85VarB.a;
            long j3 = 8 + j2;
            if (j2 % 2 != 0) {
                j3 = 9 + j2;
            }
            if (j3 > 2147483647L) {
                throw s1g.h("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
            lp6Var.h((int) j3, false);
            y85VarB = y85.b(lp6Var, g1gVar);
        }
    }

    public static void L(long[] jArr, long[] jArr2) {
        long j2 = jArr2[0];
        long j3 = j2 << 1;
        long j4 = jArr2[1];
        long j5 = jArr2[2];
        long j6 = jArr2[3];
        long j7 = jArr2[4];
        long j8 = jArr2[5];
        long j9 = jArr2[6];
        long j10 = jArr2[7];
        long j11 = jArr2[8];
        long j12 = jArr2[9];
        F(new long[]{j2 * j2, j3 * j4, ((j2 * j5) + (j4 * j4)) << 1, ((j2 * j6) + (j4 * j5)) << 1, (j3 * j7) + ((j4 << 2) * j6) + (j5 * j5), ((j2 * j8) + ((j4 * j7) + (j5 * j6))) << 1, (((j4 << 1) * j8) + ((j2 * j9) + ((j5 * j7) + (j6 * j6)))) << 1, ((j2 * j10) + ((j4 * j9) + ((j5 * j8) + (j6 * j7)))) << 1, (j7 * j7) + ((((j2 * j11) + (j5 * j9)) + (((j6 * j8) + (j4 * j10)) << 1)) << 1), ((j2 * j12) + ((j4 * j11) + ((j5 * j10) + ((j6 * j9) + (j7 * j8))))) << 1, (((j5 * j11) + ((j7 * j9) + (j8 * j8))) + (((j4 * j12) + (j6 * j10)) << 1)) << 1, ((j5 * j12) + ((j6 * j11) + ((j7 * j10) + (j8 * j9)))) << 1, (j9 * j9) + (((j7 * j11) + (((j6 * j12) + (j8 * j10)) << 1)) << 1), ((j7 * j12) + ((j8 * j11) + (j9 * j10))) << 1, (((j8 << 1) * j12) + ((j9 * j11) + (j10 * j10))) << 1, ((j9 * j12) + (j10 * j11)) << 1, ((j10 << 2) * j12) + (j11 * j11), (j11 << 1) * j12, (j12 << 1) * j12}, jArr);
    }

    public static void M(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] - jArr3[i2];
        }
    }

    public static void N(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] + jArr3[i2];
        }
    }

    public static List O(Set set, ti3 ti3Var, boolean z) {
        if (set == null) {
            return l08.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            nvm nvmVar = (nvm) it.next();
            if (nvmVar.d == ti3Var) {
                mkVar = new mk(nvmVar.f, new nk(nvmVar.b, z ? nvmVar.c : null, nvmVar.e, nvmVar.a));
            }
            if (mkVar != null) {
                arrayList.add(mkVar);
            }
        }
        return arrayList;
    }

    public static final long P(long j2) {
        a4c a4cVar = a4c.a;
        return ap5.a(yo5.j(j2), yo5.h(j2), yo5.i(j2), yo5.g(j2));
    }

    public static boolean Q(String str) {
        if (wqm.F(str, true) && a26.e0(str) != null) {
            String[] strArr = aik.a;
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = Character.codePointAt(str, iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            return true;
        }
        return false;
    }

    public static void R(short s, t87 t87Var) {
        t87Var.a((byte) (s >>> 8));
        t87Var.a((byte) s);
    }

    public static void S(int i2, t87 t87Var) {
        t87Var.a((byte) (i2 >>> 24));
        t87Var.a((byte) (i2 >>> 16));
        t87Var.a((byte) (i2 >>> 8));
        t87Var.a((byte) i2);
    }

    public static final void a(ks1 ks1Var, Function1 function1, Function0 function0, Function0 function02, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-995448190);
        int i3 = i2 | (vt9Var.h(ks1Var) ? 4 : 2) | (vt9Var.h(function1) ? 32 : 16) | (vt9Var.h(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.h(function02) ? 2048 : 1024);
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            yi4.g(function02, (c8e) null, false, false, 0L, (u8i) null, gyg.P(-927174388, new hs1(ks1Var, function1, function0, function02), vt9Var), vt9Var, ((i3 >> 9) & 14) | 1572864, 62);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new hs1(ks1Var, function1, function0, function02, i2);
        }
    }

    public static final void b(Boolean bool, Function1 function1, c8e c8eVar, ih5 ih5Var, int i2) {
        c8e c8eVar2;
        int i3;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(745127183);
        int i4 = i2 | (vt9Var.f(bool) ? 4 : 2) | (vt9Var.h(function1) ? 32 : 16) | 384;
        if (vt9Var.N(i4 & 1, (i4 & 147) != 146)) {
            o9i o9iVarA = m9i.a(new x62(8.0f, true, new t40((byte) 19)), rbe.l, vt9Var, 54);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            z7e z7eVar = z7e.b;
            c8e c8eVarP = qyn.P(vt9Var, z7eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            ijl.b("Is default browser?", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, vt9Var, 6, 0, 262142);
            vt9Var = vt9Var;
            g1b g1bVarU = rm5.U(Arrays.asList("Default", "Yes", "No"));
            if (bool == null) {
                i3 = 0;
            } else if (bool.equals(Boolean.TRUE)) {
                i3 = 1;
            } else {
                if (!bool.equals(Boolean.FALSE)) {
                    h9o.p();
                    return;
                }
                i3 = 2;
            }
            boolean z = (i4 & 112) == 32;
            Object objK = vt9Var.K();
            if (z || objK == hh5.a) {
                objK = new ra(function1, (byte) 11);
                vt9Var.g0(objK);
            }
            e(g1bVarU, i3, (Function1) objK, null, vt9Var, 0);
            vt9Var.p(true);
            c8eVar2 = z7eVar;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new g9(bool, function1, c8eVar2, i2, (byte) 14);
        }
    }

    public static final void c(i47 i47Var, c8e c8eVar, ih5 ih5Var, int i2) {
        i47 i47Var2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(931859840);
        int i3 = (vt9Var.f(i47Var) ? 4 : 2) | i2 | 48;
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            e57 e57Var = (e57) dyg.h(((x47) i47Var).m, vt9Var).getValue();
            boolean z = (i3 & 14) == 4;
            Object objK = vt9Var.K();
            if (z || objK == hh5.a) {
                i47Var2 = i47Var;
                r2 r2Var = new r2(1, i47Var2, i47.class, "onUiAction", "onUiAction(Lcom/opera/momi/clientsdk/ui/dev/UiAction;)V", 0, (byte) 28);
                vt9Var.g0(r2Var);
                objK = r2Var;
            } else {
                i47Var2 = i47Var;
            }
            z7e z7eVar = z7e.b;
            d(e57Var, (mtb) objK, z7eVar, vt9Var, 384, 0);
            c8eVar = z7eVar;
        } else {
            i47Var2 = i47Var;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fx0(i47Var2, c8eVar, i2, (byte) 26);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(e57 r20, kotlin.jvm.functions.Function1 r21, defpackage.c8e r22, defpackage.ih5 r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aib.d(e57, kotlin.jvm.functions.Function1, c8e, ih5, int, int):void");
    }

    public static final void e(final g1b g1bVar, final int i2, final Function1 function1, c8e c8eVar, ih5 ih5Var, final int i3) {
        final c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(2147082372);
        int i4 = (vt9Var.f(g1bVar) ? 4 : 2) | i3 | (vt9Var.d(i2) ? 32 : 16);
        if ((i3 & 384) == 0) {
            i4 |= vt9Var.h(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        int i5 = i4 | 3072;
        if (vt9Var.N(i5 & 1, (i5 & 1171) != 1170)) {
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (objK == zpaVar) {
                objK = hyg.k(Boolean.FALSE);
                vt9Var.g0(objK);
            }
            afe afeVar = (afe) objK;
            boolean z = ((i5 & 14) == 4) | ((i5 & 112) == 32);
            Object objK2 = vt9Var.K();
            if (z || objK2 == zpaVar) {
                objK2 = (String) CollectionsKt.M(i2, g1bVar);
                vt9Var.g0(objK2);
            }
            String str = (String) objK2;
            boolean zBooleanValue = ((Boolean) afeVar.getValue()).booleanValue();
            Object objK3 = vt9Var.K();
            if (objK3 == zpaVar) {
                objK3 = new gb1(afeVar, (byte) 11);
                vt9Var.g0(objK3);
            }
            Function1 function12 = (Function1) objK3;
            ue5 ue5VarP = gyg.P(1125250862, new l5c(str, afeVar, g1bVar, function1), vt9Var);
            z7e z7eVar = z7e.b;
            ic4.c(zBooleanValue, function12, z7eVar, ue5VarP, vt9Var, 3504);
            c8eVar2 = z7eVar;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: c57
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    aib.e(g1bVar, i2, function1, c8eVar2, (ih5) obj, aoh.m(i3 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(g1b g1bVar, Function1 function1, c8e c8eVar, ih5 ih5Var, int i2) {
        c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(948610506);
        int i3 = i2 | (vt9Var.h(g1bVar) ? 4 : 2) | (vt9Var.h(function1) ? 32 : 16) | 384;
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            o9i o9iVarA = m9i.a(new x62(8.0f, true, new t40((byte) 19)), rbe.l, vt9Var, 54);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            z7e z7eVar = z7e.b;
            c8e c8eVarP = qyn.P(vt9Var, z7eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (objK == zpaVar) {
                objK = hyg.k(0);
                vt9Var.g0(objK);
            }
            afe afeVar = (afe) objK;
            boolean zD = vt9Var.d(((Number) afeVar.getValue()).intValue());
            Object objK2 = vt9Var.K();
            if (zD || objK2 == zpaVar) {
                objK2 = (b2h) CollectionsKt.M(((Number) afeVar.getValue()).intValue(), g1bVar);
                vt9Var.g0(objK2);
            }
            b2h b2hVar = (b2h) objK2;
            boolean zH = ((i3 & 112) == 32) | vt9Var.h(b2hVar);
            Object objK3 = vt9Var.K();
            if (zH || objK3 == zpaVar) {
                objK3 = new gb3(function1, b2hVar, (byte) 26);
                vt9Var.g0(objK3);
            }
            yi4.a((Function0) objK3, (c8e) null, b2hVar != null, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, yi4.t, vt9Var, 805306368, 506);
            byte b2 = 10;
            ArrayList arrayList = new ArrayList(k95.o(g1bVar, 10));
            Iterator it = g1bVar.iterator();
            while (it.hasNext()) {
                b2h b2hVar2 = (b2h) it.next();
                arrayList.add(b2hVar2.b + "#" + b2hVar2.a);
            }
            g1b g1bVarU = rm5.U(arrayList);
            int iIntValue = ((Number) afeVar.getValue()).intValue();
            Object objK4 = vt9Var.K();
            if (objK4 == zpaVar) {
                objK4 = new gb1(afeVar, b2);
                vt9Var.g0(objK4);
            }
            e(g1bVarU, iIntValue, (Function1) objK4, null, vt9Var, 384);
            vt9Var.p(true);
            c8eVar2 = z7eVar;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new g9(g1bVar, function1, c8eVar2, i2, (byte) 13);
        }
    }

    public static final void g(String str, c8e c8eVar, ih5 ih5Var, int i2) {
        c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1898150702);
        int i3 = i2 | 48;
        if (vt9Var.N(i3 & 1, (i3 & 19) != 18)) {
            db5 db5VarA = cb5.a(new x62(4.0f, true, new t40((byte) 19)), rbe.n, vt9Var, 6);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            z7e z7eVar = z7e.b;
            c8e c8eVarP = qyn.P(vt9Var, z7eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            ijl.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(abm.a)).m, vt9Var, 6, 0, 131070);
            vt9Var = vt9Var;
            scd.d(null, 0.0f, 0L, vt9Var, 0, 7);
            vt9Var.p(true);
            c8eVar2 = z7eVar;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new a57(str, c8eVar2, i2, (byte) 0);
        }
    }

    public static final void h(String str, String str2, c8e c8eVar, ih5 ih5Var, int i2) {
        String str3;
        c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(729047771);
        int i3 = i2 | (vt9Var.f(str) ? 4 : 2) | 384;
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            g31 g31Var = (g31) vt9Var.j(mi5.e);
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (objK == zpaVar) {
                objK = rm5.p(h.a, vt9Var);
                vt9Var.g0(objK);
            }
            nx5 nx5Var = (nx5) objK;
            o9i o9iVarA = m9i.a(new x62(8.0f, true, new t40((byte) 19)), rbe.l, vt9Var, 54);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            z7e z7eVar = z7e.b;
            c8e c8eVarP = qyn.P(vt9Var, z7eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            Object objK2 = vt9Var.K();
            if (objK2 == zpaVar) {
                objK2 = new tb6((byte) 27);
                vt9Var.g0(objK2);
            }
            int i4 = i3 & 14;
            r9h.i(str, (Function1) objK2, (c8e) null, false, true, (ikl) null, gyg.P(1887606299, new lx0(str2, (byte) 6), vt9Var), (ue5) null, (ue5) null, (ue5) null, (uac) null, (rvb) null, (ovb) null, 0, 0, (paj) null, (sgl) null, vt9Var, i4 | 1597488, 8388524);
            str3 = str;
            vt9Var = vt9Var;
            boolean zH = vt9Var.h(nx5Var) | vt9Var.h(g31Var) | (i4 == 4);
            Object objK3 = vt9Var.K();
            if (zH || objK3 == zpaVar) {
                objK3 = new hv((byte) 13, nx5Var, g31Var, str3);
                vt9Var.g0(objK3);
            }
            f03.a((Function0) objK3, (c8e) null, false, (pta) null, (paj) null, yi4.u, vt9Var, 1572864, 62);
            vt9Var.p(true);
            c8eVar2 = z7eVar;
        } else {
            str3 = str;
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new yl4(str3, str2, c8eVar2, i2, (byte) 1);
        }
    }

    public static final void i(Function0 function0, Function0 function02, String str, Function0 function03, Function0 function04, Function0 function05, c8e c8eVar, ih5 ih5Var, int i2) {
        c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-148446346);
        int i3 = i2 | (vt9Var.h(function0) ? 4 : 2) | (vt9Var.h(function02) ? 32 : 16) | (vt9Var.f(str) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.h(function03) ? 2048 : 1024) | (vt9Var.h(function04) ? 16384 : 8192) | (vt9Var.h(function05) ? 131072 : 65536) | 1572864;
        if (vt9Var.N(i3 & 1, (i3 & 599187) != 599186)) {
            o9i o9iVarA = m9i.a(new x62(8.0f, true, new t40((byte) 19)), rbe.l, vt9Var, 54);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            z7e z7eVar = z7e.b;
            c8e c8eVarP = qyn.P(vt9Var, z7eVar);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            ijl.b(uyg.q((shk) ahk.X.getValue(), vt9Var), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, vt9Var, 0, 0, 262142);
            f03.a(function0, (c8e) null, false, (pta) null, (paj) null, yi4.v, vt9Var, (i3 & 14) | 1572864, 62);
            f03.a(function02, (c8e) null, false, (pta) null, (paj) null, yi4.w, vt9Var, ((i3 >> 3) & 14) | 1572864, 62);
            ijl.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, vt9Var, (i3 >> 6) & 14, 0, 262142);
            vt9Var = vt9Var;
            f03.a(function03, (c8e) null, false, (pta) null, (paj) null, yi4.x, vt9Var, ((i3 >> 9) & 14) | 1572864, 62);
            f03.a(function04, (c8e) null, false, (pta) null, (paj) null, yi4.y, vt9Var, ((i3 >> 12) & 14) | 1572864, 62);
            f03.a(function05, (c8e) null, false, (pta) null, (paj) null, yi4.z, vt9Var, ((i3 >> 15) & 14) | 1572864, 62);
            vt9Var.p(true);
            c8eVar2 = z7eVar;
        } else {
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new skf(function0, function02, str, function03, function04, function05, c8eVar2, i2);
        }
    }

    public static float j(EdgeEffect edgeEffect, float f2, float f3, n27 n27Var) {
        float f4 = os7.a;
        double dB = n27Var.b() * 386.0878f * 160.0f * 0.84f;
        double d2 = os7.a * dB;
        float fExp = (float) (Math.exp((os7.b / os7.c) * Math.log((Math.abs(f2) * 0.35f) / d2)) * d2);
        int i2 = Build.VERSION.SDK_INT;
        if (fExp > (i2 >= 31 ? m41.o(edgeEffect) : 0.0f) * f3) {
            return 0.0f;
        }
        int iB = zed.b(f2);
        if (i2 >= 31) {
            edgeEffect.onAbsorb(iB);
            return f2;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iB);
        }
        return f2;
    }

    public static void k(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt != '\"') {
                sb.append(cCharAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }

    public static void l(byte[] bArr, t87 t87Var) {
        t87Var.g(0, bArr.length, bArr);
    }

    public static final ide m(k5c k5cVar, r5c r5cVar, nv6 nv6Var) {
        int iMin;
        puj pujVar = r5cVar.a;
        z4 z4Var = ((sak) ytj.s(pujVar.a, pujVar)).c;
        dfe dfeVar = (dfe) nv6Var.a;
        int i2 = 1;
        if (!(dfeVar.c != 0) && z4Var.isEmpty()) {
            return vbb.a;
        }
        ide ideVar = new ide();
        if (((dfe) nv6Var.a).c != 0) {
            int i3 = dfeVar.c;
            if (i3 == 0) {
                h9o.h("MutableVector is empty.");
                return null;
            }
            Object[] objArr = dfeVar.a;
            int i4 = ((a5c) objArr[0]).a;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = ((a5c) objArr[i5]).a;
                if (i6 < i4) {
                    i4 = i6;
                }
            }
            if (i4 < 0) {
                d8b.a("negative minIndex");
            }
            int i7 = dfeVar.c;
            if (i7 == 0) {
                h9o.h("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = dfeVar.a;
            int i8 = ((a5c) objArr2[0]).b;
            for (int i9 = 0; i9 < i7; i9++) {
                int i10 = ((a5c) objArr2[i9]).b;
                if (i10 > i8) {
                    i8 = i10;
                }
            }
            iMin = Math.min(i8, k5cVar.getItemCount() - 1);
            i2 = i4;
        } else {
            iMin = 0;
        }
        int size = z4Var.size();
        for (int i11 = 0; i11 < size; i11++) {
            q5c q5cVar = (q5c) z4Var.get(i11);
            int iW = qbe.w(q5cVar.c, k5cVar, q5cVar.a);
            if ((i2 > iW || iW > iMin) && iW >= 0 && iW < k5cVar.getItemCount()) {
                ideVar.a(iW);
            }
        }
        if (i2 <= iMin) {
            while (true) {
                ideVar.a(i2);
                if (i2 == iMin) {
                    break;
                }
                i2++;
            }
        }
        int i12 = ideVar.b;
        if (i12 == 0) {
            return ideVar;
        }
        Arrays.sort(ideVar.a, 0, i12);
        return ideVar;
    }

    public static final void n(or4 or4Var, Throwable th) {
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = na2.a("Channel was consumed, consumer had failed", th);
            }
        }
        or4Var.k(cancellationExceptionA);
    }

    public static boolean o(lp6 lp6Var) {
        g1g g1gVar = new g1g(8);
        int i2 = y85.b(lp6Var, g1gVar).b;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        lp6Var.peekFully(g1gVar.a, 0, 4, false);
        g1gVar.N(0);
        int iM = g1gVar.m();
        if (iM == 1463899717) {
            return true;
        }
        w7d.q("Unsupported form type: " + iM);
        return false;
    }

    public static long p(long j2, a4c a4cVar) {
        int i2;
        int iG;
        int iJ;
        int iH;
        if (a4cVar == a4c.a) {
            i2 = yo5.j(j2);
            iG = yo5.h(j2);
            iJ = yo5.i(j2);
            iH = yo5.g(j2);
        } else {
            i2 = yo5.i(j2);
            iG = yo5.g(j2);
            iJ = yo5.j(j2);
            iH = yo5.h(j2);
        }
        return ap5.a(i2, iG, iJ, iH);
    }

    public static byte[] q(long[] jArr) {
        long j2;
        int[] iArr;
        int i2;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            j2 = 19;
            iArr = g;
            if (i4 >= 2) {
                break;
            }
            int i5 = 0;
            while (i5 < 9) {
                long j3 = jArrCopyOf[i5];
                int i6 = -((int) (((j3 >> 31) & j3) >> iArr[i5 & 1]));
                jArrCopyOf[i5] = j3 + (i6 << r15);
                i5++;
                jArrCopyOf[i5] = jArrCopyOf[i5] - i6;
            }
            long j4 = jArrCopyOf[9];
            jArrCopyOf[9] = j4 + (r6 << 25);
            jArrCopyOf[0] = jArrCopyOf[0] - ((-((int) (((j4 >> 31) & j4) >> 25))) * 19);
            i4++;
        }
        long j5 = jArrCopyOf[0];
        jArrCopyOf[0] = j5 + (r3 << 26);
        jArrCopyOf[1] = jArrCopyOf[1] - (-((int) (((j5 >> 31) & j5) >> 26)));
        int i7 = 0;
        while (true) {
            iArr2 = f;
            if (i7 >= 2) {
                break;
            }
            int i8 = i3;
            while (i8 < 9) {
                long j6 = jArrCopyOf[i8];
                int i9 = i8 & 1;
                int i10 = i3;
                int i11 = i7;
                int i12 = (int) (j6 >> iArr[i9]);
                jArrCopyOf[i8] = j6 & iArr2[i9];
                i8++;
                jArrCopyOf[i8] = jArrCopyOf[i8] + i12;
                i3 = i10;
                j2 = j2;
                i7 = i11;
            }
            i7++;
        }
        int i13 = i3;
        jArrCopyOf[9] = jArrCopyOf[9] & 33554431;
        long j7 = (((int) (r2 >> 25)) * j2) + jArrCopyOf[i13];
        jArrCopyOf[i13] = j7;
        int i14 = ~((((int) j7) - 67108845) >> 31);
        for (int i15 = 1; i15 < 10; i15++) {
            int i16 = ~(((int) jArrCopyOf[i15]) ^ iArr2[i15 & 1]);
            int i17 = i16 & (i16 << 16);
            int i18 = i17 & (i17 << 8);
            int i19 = i18 & (i18 << 4);
            int i20 = i19 & (i19 << 2);
            i14 &= (i20 & (i20 << 1)) >> 31;
        }
        jArrCopyOf[i13] = jArrCopyOf[i13] - (67108845 & i14);
        long j8 = 33554431 & i14;
        jArrCopyOf[1] = jArrCopyOf[1] - j8;
        for (i2 = 2; i2 < 10; i2 += 2) {
            jArrCopyOf[i2] = jArrCopyOf[i2] - (67108863 & i14);
            int i21 = i2 + 1;
            jArrCopyOf[i21] = jArrCopyOf[i21] - j8;
        }
        for (int i22 = i13; i22 < 10; i22++) {
            jArrCopyOf[i22] = jArrCopyOf[i22] << e[i22];
        }
        byte[] bArr = new byte[32];
        for (int i23 = i13; i23 < 10; i23++) {
            int i24 = d[i23];
            long j9 = bArr[i24];
            long j10 = jArrCopyOf[i23];
            bArr[i24] = (byte) (j9 | (j10 & 255));
            bArr[i24 + 1] = (byte) (bArr[r5] | ((j10 >> 8) & 255));
            bArr[i24 + 2] = (byte) (bArr[r5] | ((j10 >> 16) & 255));
            bArr[i24 + 3] = (byte) (bArr[r4] | ((j10 >> 24) & 255));
        }
        return bArr;
    }

    public static int r(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 90) {
            return 1;
        }
        if (i2 == 180) {
            return 2;
        }
        if (i2 == 270) {
            return 3;
        }
        qp2.o(sko.i(i2, "Invalid rotation: "));
        return 0;
    }

    public static long s(int i2, long j2) {
        return ap5.a(0, yo5.h(j2), (i2 & 4) != 0 ? yo5.i(j2) : 0, yo5.g(j2));
    }

    public static wub t() {
        if (n9a.q == null) {
            n9a.q = new n9a((byte) 26);
        }
        return wub.D();
    }

    public static rn9 u(int i2, int i3, int i4, int i5) {
        return new rn9(ImageReader.newInstance(i2, i3, i4, i5));
    }

    public static long[] v(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i2 = 0; i2 < 10; i2++) {
            int i3 = d[i2];
            jArr[i2] = (((((bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8)) | ((bArr[i3 + 2] & 255) << 16)) | ((bArr[i3 + 3] & 255) << 24)) >> e[i2]) & f[i2 & 1];
        }
        return jArr;
    }

    public static HashMap w() {
        HashMap map = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        map.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        ArrayList arrayListI = u35.i(36, map, u35.i(34, map, u35.i(33, map, u35.i(32, map, u35.i(31, map, u35.i(30, map, u35.i(27, map, u35.i(20, map, u35.i(7, map, arrayList2, 1, "EG"), 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"), 2, "IT");
        arrayListI.add("VA");
        map.put(39, arrayListI);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("RO");
        ArrayList arrayListI2 = u35.i(43, map, u35.i(41, map, u35.i(40, map, arrayList3, 1, "CH"), 1, "AT"), 4, "GB");
        arrayListI2.add("GG");
        arrayListI2.add("IM");
        arrayListI2.add("JE");
        map.put(44, arrayListI2);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("DK");
        ArrayList arrayListI3 = u35.i(46, map, u35.i(45, map, arrayList4, 1, "SE"), 2, "NO");
        arrayListI3.add("SJ");
        map.put(47, arrayListI3);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("PL");
        ArrayList arrayListI4 = u35.i(60, map, u35.i(58, map, u35.i(57, map, u35.i(56, map, u35.i(55, map, u35.i(54, map, u35.i(53, map, u35.i(52, map, u35.i(51, map, u35.i(49, map, u35.i(48, map, arrayList5, 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"), 3, "AU");
        arrayListI4.add("CC");
        arrayListI4.add("CX");
        map.put(61, arrayListI4);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("ID");
        ArrayList arrayListI5 = u35.i(211, map, u35.i(98, map, u35.i(95, map, u35.i(94, map, u35.i(93, map, u35.i(92, map, u35.i(91, map, u35.i(90, map, u35.i(86, map, u35.i(84, map, u35.i(82, map, u35.i(81, map, u35.i(66, map, u35.i(65, map, u35.i(64, map, u35.i(63, map, u35.i(62, map, arrayList6, 1, "PH"), 1, "NZ"), 1, "SG"), 1, "TH"), 1, "JP"), 1, "KR"), 1, "VN"), 1, "CN"), 1, "TR"), 1, "IN"), 1, "PK"), 1, "AF"), 1, "LK"), 1, "MM"), 1, "IR"), 1, "SS"), 2, "MA");
        arrayListI5.add("EH");
        map.put(212, arrayListI5);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("DZ");
        ArrayList arrayListI6 = u35.i(261, map, u35.i(260, map, u35.i(258, map, u35.i(257, map, u35.i(NotificationCompat.FLAG_LOCAL_ONLY, map, u35.i(255, map, u35.i(254, map, u35.i(253, map, u35.i(252, map, u35.i(251, map, u35.i(250, map, u35.i(249, map, u35.i(248, map, u35.i(247, map, u35.i(246, map, u35.i(245, map, u35.i(244, map, u35.i(243, map, u35.i(242, map, u35.i(241, map, u35.i(240, map, u35.i(239, map, u35.i(238, map, u35.i(237, map, u35.i(236, map, u35.i(235, map, u35.i(234, map, u35.i(233, map, u35.i(232, map, u35.i(231, map, u35.i(230, map, u35.i(229, map, u35.i(228, map, u35.i(227, map, u35.i(226, map, u35.i(225, map, u35.i(224, map, u35.i(223, map, u35.i(222, map, u35.i(221, map, u35.i(220, map, u35.i(218, map, u35.i(216, map, u35.i(213, map, arrayList7, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"), 2, "RE");
        arrayListI6.add("YT");
        map.put(262, arrayListI6);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("ZW");
        ArrayList arrayListI7 = u35.i(269, map, u35.i(268, map, u35.i(267, map, u35.i(266, map, u35.i(265, map, u35.i(264, map, u35.i(263, map, arrayList8, 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"), 2, "SH");
        arrayListI7.add("TA");
        map.put(290, arrayListI7);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ER");
        ArrayList arrayListI8 = u35.i(357, map, u35.i(356, map, u35.i(355, map, u35.i(354, map, u35.i(353, map, u35.i(352, map, u35.i(351, map, u35.i(350, map, u35.i(299, map, u35.i(298, map, u35.i(297, map, u35.i(291, map, arrayList9, 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"), 2, "FI");
        arrayListI8.add("AX");
        map.put(358, arrayListI8);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("BG");
        ArrayList arrayListI9 = u35.i(509, map, u35.i(508, map, u35.i(507, map, u35.i(506, map, u35.i(505, map, u35.i(504, map, u35.i(503, map, u35.i(502, map, u35.i(501, map, u35.i(500, map, u35.i(423, map, u35.i(421, map, u35.i(420, map, u35.i(389, map, u35.i(387, map, u35.i(386, map, u35.i(385, map, u35.i(383, map, u35.i(382, map, u35.i(381, map, u35.i(380, map, u35.i(378, map, u35.i(377, map, u35.i(376, map, u35.i(375, map, u35.i(374, map, u35.i(373, map, u35.i(372, map, u35.i(371, map, u35.i(370, map, u35.i(359, map, arrayList10, 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"), 3, "GP");
        arrayListI9.add("BL");
        arrayListI9.add("MF");
        map.put(590, arrayListI9);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("BO");
        ArrayList arrayListI10 = u35.i(598, map, u35.i(597, map, u35.i(596, map, u35.i(595, map, u35.i(594, map, u35.i(593, map, u35.i(592, map, u35.i(591, map, arrayList11, 1, "GY"), 1, "EC"), 1, "GF"), 1, "PY"), 1, "MQ"), 1, "SR"), 1, "UY"), 2, "CW");
        arrayListI10.add("BQ");
        map.put(599, arrayListI10);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("TL");
        map.put(998, u35.i(996, map, u35.i(995, map, u35.i(994, map, u35.i(993, map, u35.i(992, map, u35.i(979, map, u35.i(977, map, u35.i(976, map, u35.i(975, map, u35.i(974, map, u35.i(973, map, u35.i(972, map, u35.i(971, map, u35.i(970, map, u35.i(968, map, u35.i(967, map, u35.i(966, map, u35.i(965, map, u35.i(964, map, u35.i(963, map, u35.i(962, map, u35.i(961, map, u35.i(960, map, u35.i(888, map, u35.i(886, map, u35.i(883, map, u35.i(882, map, u35.i(881, map, u35.i(880, map, u35.i(878, map, u35.i(870, map, u35.i(856, map, u35.i(855, map, u35.i(853, map, u35.i(852, map, u35.i(850, map, u35.i(808, map, u35.i(800, map, u35.i(692, map, u35.i(691, map, u35.i(690, map, u35.i(689, map, u35.i(688, map, u35.i(687, map, u35.i(686, map, u35.i(685, map, u35.i(683, map, u35.i(682, map, u35.i(681, map, u35.i(680, map, u35.i(679, map, u35.i(678, map, u35.i(677, map, u35.i(676, map, u35.i(675, map, u35.i(674, map, u35.i(673, map, u35.i(672, map, u35.i(670, map, arrayList12, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return map;
    }

    public static byte[] x(byte[] bArr, byte[] bArr2) {
        j6a j6aVar = new j6a(new tci());
        j6aVar.b(new qe6(bArr));
        j6aVar.c(bArr2.length, bArr2);
        byte[] bArr3 = new byte[64];
        j6aVar.a(bArr3);
        return bArr3;
    }

    public static final boolean y(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 != 0.0f) {
            float f31 = 1.0f / f30;
            fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
            fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
            fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
            fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
            fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
            fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
            fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
            fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
            fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        return !(f30 == 0.0f);
    }

    public static void z(long[] jArr, long[] jArr2, long[] jArr3) {
        long j2 = jArr2[0];
        long j3 = jArr3[0];
        long j4 = j2 * j3;
        long j5 = jArr3[1];
        long j6 = jArr2[1];
        long j7 = (j6 * j3) + (j2 * j5);
        long j8 = jArr3[2];
        long j9 = jArr2[2];
        long j10 = (j9 * j3) + (j2 * j8) + ((j6 << 1) * j5);
        long j11 = jArr3[3];
        long j12 = jArr2[3];
        long j13 = (j12 * j3) + (j2 * j11) + (j9 * j5) + (j6 * j8);
        long j14 = jArr3[4];
        long j15 = jArr2[4];
        long j16 = (j15 * j3) + (j2 * j14) + (j9 * j8) + (((j12 * j5) + (j6 * j11)) << 1);
        long j17 = jArr3[5];
        long j18 = jArr2[5];
        long j19 = (j18 * j3) + (j2 * j17) + (j15 * j5) + (j6 * j14) + (j12 * j8) + (j9 * j11);
        long j20 = jArr3[6];
        long j21 = (j2 * j20) + (j15 * j8) + (j9 * j14) + (((j18 * j5) + ((j6 * j17) + (j12 * j11))) << 1);
        long j22 = jArr2[6];
        long j23 = (j22 * j3) + j21;
        long j24 = jArr3[7];
        long j25 = jArr2[7];
        long j26 = (j25 * j3) + (j2 * j24) + (j22 * j5) + (j6 * j20) + (j18 * j8) + (j9 * j17) + (j15 * j11) + (j12 * j14);
        long j27 = jArr3[8];
        long j28 = (j2 * j27) + (j22 * j8) + (j9 * j20) + (j15 * j14) + (((j25 * j5) + ((j6 * j24) + ((j18 * j11) + (j12 * j17)))) << 1);
        long j29 = jArr2[8];
        long j30 = (j29 * j3) + j28;
        long j31 = jArr3[9];
        long j32 = jArr2[9];
        long j33 = (j3 * j32) + (j2 * j31) + (j29 * j5) + (j6 * j27) + (j25 * j8) + (j9 * j24) + (j22 * j11) + (j12 * j20) + (j18 * j14) + (j15 * j17);
        long j34 = j5 * j32;
        long j35 = (j29 * j8) + (j9 * j27) + (j22 * j14) + (j15 * j20) + ((j34 + ((j6 * j31) + ((j25 * j11) + ((j12 * j24) + (j18 * j17))))) << 1);
        long j36 = j8 * j32;
        long j37 = j36 + (j9 * j31) + (j29 * j11) + (j12 * j27) + (j25 * j14) + (j15 * j24) + (j22 * j17) + (j18 * j20);
        long j38 = j11 * j32;
        long j39 = (j29 * j14) + (j15 * j27) + (j22 * j20) + ((j38 + ((j12 * j31) + ((j25 * j17) + (j18 * j24)))) << 1);
        long j40 = j14 * j32;
        long j41 = j29 * j20;
        long j42 = j20 * j32;
        F(new long[]{j4, j7, j10, j13, j16, j19, j23, j26, j30, j33, j35, j37, j39, j40 + (j15 * j31) + (j29 * j17) + (j18 * j27) + (j25 * j20) + (j22 * j24), j41 + (j22 * j27) + (((j17 * j32) + ((j18 * j31) + (j25 * j24))) << 1), j42 + (j22 * j31) + (j29 * j24) + (j25 * j27), (j29 * j27) + (((j24 * j32) + (j25 * j31)) << 1), (j27 * j32) + (j29 * j31), (j32 << 1) * j31}, jArr);
    }
}

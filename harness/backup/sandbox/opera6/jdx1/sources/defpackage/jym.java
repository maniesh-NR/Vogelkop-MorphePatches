package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

/* loaded from: classes.dex */
public final class jym {
    public static long b = -1;
    public static long c = -1;
    public final /* synthetic */ byte a;

    public /* synthetic */ jym(byte b2) {
        this.a = b2;
    }

    public static void A(long[] jArr, long[] jArr2, int i) {
        long[] jArr3 = new long[13];
        n(jArr, jArr3);
        while (true) {
            z(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                n(jArr2, jArr3);
            }
        }
    }

    public static boolean B(int i, g1g g1gVar, boolean z) throws s1g {
        if (g1gVar.a() < 7) {
            if (z) {
                return false;
            }
            throw s1g.d("too short header: " + g1gVar.a(), null);
        }
        if (g1gVar.A() != i) {
            if (z) {
                return false;
            }
            throw s1g.d("expected header type " + Integer.toHexString(i), null);
        }
        if (g1gVar.A() == 118 && g1gVar.A() == 111 && g1gVar.A() == 114 && g1gVar.A() == 98 && g1gVar.A() == 105 && g1gVar.A() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw s1g.d("expected characters 'vorbis'", null);
    }

    public static final void a(String str, boolean z, ih5 ih5Var, int i) {
        String str2;
        boolean z2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(375451546);
        int i2 = i | (vt9Var.f(str) ? 4 : 2) | (vt9Var.g(z) ? 32 : 16);
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            tfd tfdVarC = nr3.c(rbe.f, false);
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
            y4h.o(vt9Var, tfdVarC, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            ijl.b(str, y9m.o(z7eVar, z ? 0.0f : 1.0f), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, vt9Var, i2 & 14, 0, 262140);
            z2 = z;
            str2 = str;
            vt9Var = vt9Var;
            if (z2) {
                vt9Var.W(1716368799);
                v4h.a(mpj.h(z7eVar, 16.0f), ((u95) vt9Var.j(aq5.a)).a, 2.0f, 0L, 0, 0.0f, vt9Var, 390, 56);
                vt9Var.p(false);
            } else {
                vt9Var.W(1716546894);
                vt9Var.p(false);
            }
            vt9Var.p(true);
        } else {
            str2 = str;
            z2 = z;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new sn3((byte) 7, i, str2, z2);
        }
    }

    public static final void b(final c2i c2iVar, final ldh ldhVar, c8e c8eVar, final boolean z, final boolean z2, ih5 ih5Var, int i) {
        c8e c8eVar2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(525104377);
        int i2 = (vt9Var.h(c2iVar) ? 4 : 2) | i | (vt9Var.h(ldhVar) ? 32 : 16) | (vt9Var.f(c8eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.g(z) ? 2048 : 1024) | (vt9Var.g(z2) ? 16384 : 8192);
        if (vt9Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            c8eVar2 = c8eVar;
            c26.a(c8eVar2, ((acj) vt9Var.j(ccj.a)).d, i41.j(((sa5) vt9Var.j(ua5.a)).F, vt9Var, 24576), null, gyg.P(826694727, new cr9() { // from class: b2i
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Function0 function0;
                    ih5 ih5Var2 = (ih5) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    vt9 vt9Var2 = (vt9) ih5Var2;
                    if (vt9Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                        c8e c8eVarX = a26.X(mpj.a, 16.0f);
                        sd3 sd3Var = rbe.l;
                        o9i o9iVarA = m9i.a(new x62(16.0f, true, new t40((byte) 19)), sd3Var, vt9Var2, 54);
                        int iHashCode = Long.hashCode(vt9Var2.T);
                        oag oagVarL = vt9Var2.l();
                        c8e c8eVarP = qyn.P(vt9Var2, c8eVarX);
                        bh5.To.getClass();
                        vt9Var2.a0();
                        boolean z3 = vt9Var2.S;
                        Function0 function02 = m3c.S;
                        if (z3) {
                            vt9Var2.k(function02);
                        } else {
                            vt9Var2.j0();
                        }
                        ah5 ah5Var = ujp.f;
                        y4h.o(vt9Var2, o9iVarA, ah5Var);
                        ah5 ah5Var2 = ujp.e;
                        y4h.o(vt9Var2, oagVarL, ah5Var2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        ah5 ah5Var3 = ujp.g;
                        y4h.o(vt9Var2, numValueOf, ah5Var3);
                        y4h.m(vt9Var2);
                        ah5 ah5Var4 = ujp.d;
                        y4h.o(vt9Var2, c8eVarP, ah5Var4);
                        z7e z7eVar = z7e.b;
                        c8e c8eVarJ = x1p.j(mpj.h(z7eVar, 80.0f), ((acj) vt9Var2.j(ccj.a)).d);
                        yya yyaVar = new yya((Context) vt9Var2.j(j41.b));
                        c2i c2iVar2 = c2iVar;
                        yyaVar.c = c2iVar2.d.g;
                        dza.a(yyaVar);
                        hn9.a(yyaVar.a(), "Mission icon", c8eVarJ, null, null, null, vt9Var2, 48, 2040);
                        if (1.0f <= 0.0d) {
                            y7b.a("invalid weight; must be greater than zero");
                        }
                        g4c g4cVar = new g4c(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        db5 db5VarA = cb5.a(new x62(16.0f, true, new t40((byte) 19)), rbe.n, vt9Var2, 6);
                        int iHashCode2 = Long.hashCode(vt9Var2.T);
                        oag oagVarL2 = vt9Var2.l();
                        c8e c8eVarP2 = qyn.P(vt9Var2, g4cVar);
                        vt9Var2.a0();
                        if (vt9Var2.S) {
                            function0 = function02;
                            vt9Var2.k(function0);
                        } else {
                            function0 = function02;
                            vt9Var2.j0();
                        }
                        y4h.o(vt9Var2, db5VarA, ah5Var);
                        y4h.o(vt9Var2, oagVarL2, ah5Var2);
                        u35.j(iHashCode2, vt9Var2, ah5Var3, vt9Var2);
                        y4h.o(vt9Var2, c8eVarP2, ah5Var4);
                        Function0 function03 = function0;
                        ijl.b(c2iVar2.c, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, ((wam) vt9Var2.j(abm.a)).j, vt9Var2, 0, 24960, 110590);
                        vt9 vt9Var3 = vt9Var2;
                        o9i o9iVarA2 = m9i.a(b72.a, sd3Var, vt9Var3, 48);
                        int iHashCode3 = Long.hashCode(vt9Var3.T);
                        oag oagVarL3 = vt9Var3.l();
                        c8e c8eVarP3 = qyn.P(vt9Var3, z7eVar);
                        vt9Var3.a0();
                        if (vt9Var3.S) {
                            vt9Var3.k(function03);
                        } else {
                            vt9Var3.j0();
                        }
                        y4h.o(vt9Var3, o9iVarA2, ah5Var);
                        y4h.o(vt9Var3, oagVarL3, ah5Var2);
                        u35.j(iHashCode3, vt9Var3, ah5Var3, vt9Var3);
                        y4h.o(vt9Var3, c8eVarP3, ah5Var4);
                        n01 n01Var = c2iVar2.e;
                        if (n01Var != null) {
                            vt9Var3.W(-299945275);
                            z4o.a(n01Var, true, null, vt9Var3, 48);
                            vt9Var3.p(false);
                        } else {
                            vt9Var3.W(-299864551);
                            vt9Var3.p(false);
                        }
                        if (1.0f <= 0.0d) {
                            y7b.a("invalid weight; must be greater than zero");
                        }
                        ocp.c(vt9Var3, new g4c(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                        ec ecVar = c2iVar2.f;
                        if (ecVar == null && c2iVar2.h == null) {
                            vt9Var3.W(-299167175);
                            vt9Var3.p(false);
                        } else {
                            vt9Var3.W(-299684193);
                            ldh ldhVar2 = ldhVar;
                            boolean zF = vt9Var3.f(ldhVar2) | vt9Var3.h(c2iVar2);
                            Object objK = vt9Var3.K();
                            if (zF || objK == hh5.a) {
                                objK = new s4f(ldhVar2, c2iVar2, (byte) 15);
                                vt9Var3.g0(objK);
                            }
                            yi4.i((Function0) objK, (c8e) null, z2, (paj) null, (z14) null, (go3) null, new zvf(24.0f, 6.0f, 24.0f, 6.0f), gyg.P(1448213893, new oa1((byte) 1, ecVar, z), vt9Var3), vt9Var3, 805306368, 378);
                            vt9Var3 = vt9Var3;
                            vt9Var3.p(false);
                        }
                        vt9Var3.p(true);
                        vt9Var3.p(true);
                        vt9Var3.p(true);
                    } else {
                        vt9Var2.Q();
                    }
                    return Unit.a;
                }
            }, vt9Var), vt9Var, ((i2 >> 6) & 14) | 196608, 24);
        } else {
            c8eVar2 = c8eVar;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new lv4(c2iVar, ldhVar, c8eVar2, z, z2, i);
        }
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }

    public static final ax7 d(ax7 ax7Var, String str) {
        String strLookupPrefix = ((Node) ((i4d) ax7Var).b).lookupPrefix("http://schemas.android.com/apk/res/android");
        Object obj = null;
        u39 u39Var = new u39(y1j.c(new d82(new rao(ax7Var, null), (byte) 3), u91.s));
        while (true) {
            if (!u39Var.hasNext()) {
                break;
            }
            Object next = u39Var.next();
            ax7 ax7Var2 = (ax7) next;
            if (Intrinsics.a(((Node) ((i4d) ax7Var2).b).getNamespaceURI(), "http://schemas.android.com/aapt") && Intrinsics.a(((Node) ((i4d) ax7Var2).b).getLocalName(), "attr")) {
                if (Intrinsics.a(ax7Var2.c.getAttribute("name"), strLookupPrefix + ":" + str)) {
                    obj = next;
                    break;
                }
            }
        }
        return (ax7) obj;
    }

    public static final String e(ax7 ax7Var, String str) throws DOMException {
        String attributeNS = ax7Var.c.getAttributeNS("http://schemas.android.com/apk/res/android", str);
        if (StringsKt.N(attributeNS)) {
            return null;
        }
        return attributeNS;
    }

    public static void f(long j, String str) {
        if (j >= 0) {
            return;
        }
        qp2.o(str);
    }

    public static String i(d54 d54Var) {
        StringBuilder sb = new StringBuilder(d54Var.size());
        for (int i = 0; i < d54Var.size(); i++) {
            byte bD = d54Var.d(i);
            if (bD == 34) {
                sb.append("\\\"");
            } else if (bD == 39) {
                sb.append("\\'");
            } else if (bD != 92) {
                switch (bD) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bD < 32 || bD > 126) {
                            sb.append('\\');
                            sb.append((char) (((bD >>> 6) & 3) + 48));
                            sb.append((char) (((bD >>> 3) & 7) + 48));
                            sb.append((char) ((bD & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bD);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final int j(View view, bz3 bz3Var) {
        int iMakeMeasureSpec;
        int measuredHeight;
        int iD0;
        int i = view.getLayoutParams().height;
        if (i == -2) {
            if (view.isLayoutRequested() || view.getMeasuredHeight() == 0) {
                int i2 = view.getLayoutParams().width;
                if (i2 == -2 || i2 == -1) {
                    int i3 = bz3Var.a;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3 - (marginLayoutParams == null ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin), LinearLayoutManager.INVALID_OFFSET);
                } else {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getLayoutParams().width, 1073741824);
                }
                view.measure(iMakeMeasureSpec, 0);
            }
            measuredHeight = view.getMeasuredHeight();
            iD0 = p37.D0(view);
        } else {
            if (i == -1) {
                return bz3Var.b;
            }
            measuredHeight = view.getLayoutParams().height;
            iD0 = p37.D0(view);
        }
        return iD0 + measuredHeight;
    }

    public static void k(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = ((j3 >>> 49) ^ (j4 << 15)) & 576460752303423487L;
        jArr2[4] = ((j4 >>> 44) ^ (j5 << 20)) & 576460752303423487L;
        jArr2[5] = ((j5 >>> 39) ^ (j6 << 25)) & 576460752303423487L;
        jArr2[6] = (j6 >>> 34) ^ (j7 << 30);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        k(jArr, jArr4);
        k(jArr2, jArr5);
        long[] jArr6 = new long[8];
        for (int i = 0; i < 7; i++) {
            m(jArr6, jArr4[i], jArr5[i], jArr3, i << 1);
        }
        long j = jArr3[0];
        long j2 = jArr3[1];
        long j3 = jArr3[2] ^ j;
        long j4 = j3 ^ j2;
        jArr3[1] = j4;
        long j5 = j2 ^ jArr3[3];
        long j6 = j3 ^ jArr3[4];
        long j7 = j6 ^ j5;
        jArr3[2] = j7;
        long j8 = j5 ^ jArr3[5];
        long j9 = j6 ^ jArr3[6];
        long j10 = j9 ^ j8;
        jArr3[3] = j10;
        long j11 = j8 ^ jArr3[7];
        long j12 = j9 ^ jArr3[8];
        long j13 = j12 ^ j11;
        jArr3[4] = j13;
        long j14 = j11 ^ jArr3[9];
        long j15 = j12 ^ jArr3[10];
        long j16 = j15 ^ j14;
        jArr3[5] = j16;
        long j17 = j14 ^ jArr3[11];
        long j18 = j15 ^ jArr3[12];
        long j19 = j18 ^ j17;
        jArr3[6] = j19;
        long j20 = j18 ^ (j17 ^ jArr3[13]);
        jArr3[7] = j ^ j20;
        jArr3[8] = j4 ^ j20;
        jArr3[9] = j7 ^ j20;
        jArr3[10] = j10 ^ j20;
        jArr3[11] = j13 ^ j20;
        jArr3[12] = j16 ^ j20;
        jArr3[13] = j19 ^ j20;
        m(jArr6, jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        m(jArr6, jArr4[0] ^ jArr4[2], jArr5[0] ^ jArr5[2], jArr3, 2);
        m(jArr6, jArr4[0] ^ jArr4[3], jArr5[0] ^ jArr5[3], jArr3, 3);
        m(jArr6, jArr4[1] ^ jArr4[2], jArr5[1] ^ jArr5[2], jArr3, 3);
        m(jArr6, jArr4[0] ^ jArr4[4], jArr5[0] ^ jArr5[4], jArr3, 4);
        m(jArr6, jArr4[1] ^ jArr4[3], jArr5[1] ^ jArr5[3], jArr3, 4);
        m(jArr6, jArr4[0] ^ jArr4[5], jArr5[0] ^ jArr5[5], jArr3, 5);
        m(jArr6, jArr4[1] ^ jArr4[4], jArr5[1] ^ jArr5[4], jArr3, 5);
        m(jArr6, jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 5);
        m(jArr6, jArr4[0] ^ jArr4[6], jArr5[0] ^ jArr5[6], jArr3, 6);
        m(jArr6, jArr4[1] ^ jArr4[5], jArr5[1] ^ jArr5[5], jArr3, 6);
        m(jArr6, jArr4[2] ^ jArr4[4], jArr5[2] ^ jArr5[4], jArr3, 6);
        m(jArr6, jArr4[1] ^ jArr4[6], jArr5[1] ^ jArr5[6], jArr3, 7);
        m(jArr6, jArr4[2] ^ jArr4[5], jArr5[2] ^ jArr5[5], jArr3, 7);
        m(jArr6, jArr4[3] ^ jArr4[4], jArr5[3] ^ jArr5[4], jArr3, 7);
        m(jArr6, jArr4[2] ^ jArr4[6], jArr5[2] ^ jArr5[6], jArr3, 8);
        m(jArr6, jArr4[3] ^ jArr4[5], jArr5[3] ^ jArr5[5], jArr3, 8);
        m(jArr6, jArr4[3] ^ jArr4[6], jArr5[3] ^ jArr5[6], jArr3, 9);
        m(jArr6, jArr4[4] ^ jArr4[5], jArr5[4] ^ jArr5[5], jArr3, 9);
        m(jArr6, jArr4[4] ^ jArr4[6], jArr5[4] ^ jArr5[6], jArr3, 10);
        m(jArr6, jArr4[5] ^ jArr4[6], jArr5[5] ^ jArr5[6], jArr3, 11);
        long j21 = jArr3[0];
        long j22 = jArr3[1];
        long j23 = jArr3[2];
        long j24 = jArr3[3];
        long j25 = jArr3[4];
        long j26 = jArr3[5];
        long j27 = jArr3[6];
        long j28 = jArr3[7];
        long j29 = jArr3[8];
        long j30 = jArr3[9];
        long j31 = jArr3[10];
        long j32 = jArr3[11];
        long j33 = jArr3[12];
        long j34 = jArr3[13];
        jArr3[0] = j21 ^ (j22 << 59);
        jArr3[1] = (j22 >>> 5) ^ (j23 << 54);
        jArr3[2] = (j23 >>> 10) ^ (j24 << 49);
        jArr3[3] = (j24 >>> 15) ^ (j25 << 44);
        jArr3[4] = (j25 >>> 20) ^ (j26 << 39);
        jArr3[5] = (j26 >>> 25) ^ (j27 << 34);
        jArr3[6] = (j27 >>> 30) ^ (j28 << 29);
        jArr3[7] = (j28 >>> 35) ^ (j29 << 24);
        jArr3[8] = (j29 >>> 40) ^ (j30 << 19);
        jArr3[9] = (j30 >>> 45) ^ (j31 << 14);
        jArr3[10] = (j31 >>> 50) ^ (j32 << 9);
        jArr3[11] = ((j32 >>> 55) ^ (j33 << 4)) ^ (j34 << 63);
        jArr3[12] = j34 >>> 1;
    }

    public static void m(long[] jArr, long j, long j2, long[] jArr2, int i) {
        jArr[1] = j2;
        long j3 = j2 << 1;
        jArr[2] = j3;
        long j4 = j3 ^ j2;
        jArr[3] = j4;
        long j5 = j2 << 2;
        jArr[4] = j5;
        jArr[5] = j5 ^ j2;
        long j6 = j4 << 1;
        jArr[6] = j6;
        jArr[7] = j6 ^ j2;
        int i2 = (int) j;
        long j7 = jArr[i2 & 7] ^ (jArr[(i2 >>> 3) & 7] << 3);
        long j8 = 0;
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = jArr[i4 & 7] ^ (jArr[(i4 >>> 3) & 7] << 3);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr2[i] = jArr2[i] ^ (576460752303423487L & j7);
        int i5 = i + 1;
        jArr2[i5] = jArr2[i5] ^ ((j7 >>> 59) ^ (j8 << 5));
    }

    public static void n(long[] jArr, long[] jArr2) {
        ui6.t(jArr, jArr2, 6);
        jArr2[12] = ui6.s((int) jArr[6]);
    }

    public static boolean o(int i, int i2, double d) {
        return d >= ((double) i) && d < ((double) i2);
    }

    public static dsk p(dsk dskVar) {
        return ((dskVar instanceof gsk) || (dskVar instanceof fsk)) ? dskVar : dskVar instanceof Serializable ? new fsk(dskVar) : new gsk(dskVar);
    }

    public static void q(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[14];
        l(jArr, jArr2, jArr4);
        z(jArr4, jArr3);
    }

    public static tw7 r(String str) {
        tw7 tw7VarU = zch.u(str);
        if (tw7VarU instanceof rw7) {
            tw7VarU = new rw7(new z5j("enabled_news_categories"));
        } else if (!(tw7VarU instanceof sw7)) {
            h9o.p();
            return null;
        }
        if (tw7VarU instanceof rw7) {
            return tw7VarU;
        }
        if (tw7VarU instanceof sw7) {
            return new sw7(new adh((List) ((sw7) tw7VarU).a));
        }
        h9o.p();
        return null;
    }

    public static final Pair[] s(ax7 ax7Var) throws DOMException, NumberFormatException {
        List listG = y1j.g(y1j.c(y1j.c(new d82(new rao(ax7Var, null), (byte) 3), u91.t), new q0n((byte) 25)));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listG) {
            int i2 = i + 1;
            if (i < 0) {
                j95.n();
                throw null;
            }
            ax7 ax7Var2 = (ax7) obj;
            float f = i;
            int iH = j95.h(listG);
            if (iH < 1) {
                iH = 1;
            }
            float f2 = f / iH;
            String strE = e(ax7Var2, "offset");
            if (strE != null) {
                f2 = Float.parseFloat(strE);
            }
            String strE2 = e(ax7Var2, "color");
            Pair pair = strE2 != null ? new Pair(Float.valueOf(f2), new u95(cs5.c(t0h.n(strE2)))) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
            i = i2;
        }
        if (arrayList.isEmpty()) {
            String strE3 = e(ax7Var, "startColor");
            Integer numValueOf = strE3 != null ? Integer.valueOf(t0h.n(strE3)) : null;
            String strE4 = e(ax7Var, "centerColor");
            Integer numValueOf2 = strE4 != null ? Integer.valueOf(t0h.n(strE4)) : null;
            String strE5 = e(ax7Var, "endColor");
            Integer numValueOf3 = strE5 != null ? Integer.valueOf(t0h.n(strE5)) : null;
            if (numValueOf != null) {
                arrayList.add(new Pair(Float.valueOf(0.0f), new u95(cs5.c(numValueOf.intValue()))));
            }
            if (numValueOf2 != null) {
                arrayList.add(new Pair(Float.valueOf(0.5f), new u95(cs5.c(numValueOf2.intValue()))));
            }
            if (numValueOf3 != null) {
                arrayList.add(new Pair(Float.valueOf(1.0f), new u95(cs5.c(numValueOf3.intValue()))));
            }
        }
        return (Pair[]) arrayList.toArray(new Pair[0]);
    }

    public static final haj t(ax7 ax7Var) throws DOMException, NumberFormatException {
        Object next;
        String strE;
        u39 u39Var = new u39(y1j.c(new d82(new rao(ax7Var, null), (byte) 3), u91.u));
        while (true) {
            if (!u39Var.hasNext()) {
                next = null;
                break;
            }
            next = u39Var.next();
            if (Intrinsics.a(((Node) ((i4d) ((ax7) next)).b).getNodeName(), "gradient")) {
                break;
            }
        }
        ax7 ax7Var2 = (ax7) next;
        if (ax7Var2 != null && (strE = e(ax7Var2, "type")) != null) {
            int iHashCode = strE.hashCode();
            int i = 0;
            if (iHashCode != -1102672091) {
                if (iHashCode != -938579425) {
                    if (iHashCode == 109850348 && strE.equals("sweep")) {
                        Pair[] pairArrS = s(ax7Var2);
                        Pair[] pairArr = (Pair[]) Arrays.copyOf(pairArrS, pairArrS.length);
                        String strE2 = e(ax7Var2, "centerX");
                        float f = strE2 != null ? Float.parseFloat(strE2) : 0.0f;
                        long jFloatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(e(ax7Var2, "centerY") != null ? Float.parseFloat(r0) : 0.0f) & 4294967295L);
                        ArrayList arrayList = new ArrayList(pairArr.length);
                        for (Pair pair : pairArr) {
                            u95 u95Var = (u95) pair.b;
                            long j = u95Var.a;
                            arrayList.add(u95Var);
                        }
                        int length = pairArr.length;
                        ArrayList arrayList2 = new ArrayList(length);
                        while (i < length) {
                            arrayList2.add(Float.valueOf(((Number) pairArr[i].a).floatValue()));
                            i++;
                        }
                        return new gvk(jFloatToRawIntBits, arrayList, arrayList2);
                    }
                } else if (strE.equals("radial")) {
                    Pair[] pairArrS2 = s(ax7Var2);
                    Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArrS2, pairArrS2.length);
                    String strE3 = e(ax7Var2, "centerX");
                    float f2 = strE3 != null ? Float.parseFloat(strE3) : 0.0f;
                    long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(e(ax7Var2, "centerY") != null ? Float.parseFloat(r3) : 0.0f) & 4294967295L);
                    String strE4 = e(ax7Var2, "gradientRadius");
                    float f3 = strE4 != null ? Float.parseFloat(strE4) : 0.0f;
                    String strE5 = e(ax7Var2, "tileMode");
                    int iP = strE5 != null ? t0h.p(strE5) : 0;
                    ArrayList arrayList3 = new ArrayList(pairArr2.length);
                    for (Pair pair2 : pairArr2) {
                        u95 u95Var2 = (u95) pair2.b;
                        long j2 = u95Var2.a;
                        arrayList3.add(u95Var2);
                    }
                    int length2 = pairArr2.length;
                    ArrayList arrayList4 = new ArrayList(length2);
                    while (i < length2) {
                        arrayList4.add(Float.valueOf(((Number) pairArr2[i].a).floatValue()));
                        i++;
                    }
                    return new nih(arrayList3, arrayList4, jFloatToRawIntBits2, f3, iP);
                }
            } else if (strE.equals("linear")) {
                Pair[] pairArrS3 = s(ax7Var2);
                Pair[] pairArr3 = (Pair[]) Arrays.copyOf(pairArrS3, pairArrS3.length);
                String strE6 = e(ax7Var2, "startX");
                float f4 = strE6 != null ? Float.parseFloat(strE6) : 0.0f;
                long jFloatToRawIntBits3 = (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(e(ax7Var2, "startY") != null ? Float.parseFloat(r3) : 0.0f) & 4294967295L);
                String strE7 = e(ax7Var2, "endX");
                float f5 = strE7 != null ? Float.parseFloat(strE7) : 0.0f;
                long jFloatToRawIntBits4 = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(e(ax7Var2, "endY") != null ? Float.parseFloat(r3) : 0.0f) & 4294967295L);
                String strE8 = e(ax7Var2, "tileMode");
                int iP2 = strE8 != null ? t0h.p(strE8) : 0;
                ArrayList arrayList5 = new ArrayList(pairArr3.length);
                for (Pair pair3 : pairArr3) {
                    u95 u95Var3 = (u95) pair3.b;
                    long j3 = u95Var3.a;
                    arrayList5.add(u95Var3);
                }
                int length3 = pairArr3.length;
                ArrayList arrayList6 = new ArrayList(length3);
                while (i < length3) {
                    arrayList6.add(Float.valueOf(((Number) pairArr3[i].a).floatValue()));
                    i++;
                }
                return new vec(arrayList5, arrayList6, jFloatToRawIntBits3, jFloatToRawIntBits4, iP2);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(defpackage.ax7 r21, defpackage.xza r22, defpackage.d14 r23) throws org.w3c.dom.DOMException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jym.u(ax7, xza, d14):void");
    }

    public static lxd v(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = tym.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                w7d.K("Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(ieg.d(new g1g(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    w7d.L("Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new hcn(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new lxd(arrayList);
    }

    public static final Object w(rpb rpbVar, b bVar, KSerializer kSerializer, mng mngVar) {
        msb asbVar;
        if (mngVar == null) {
            mngVar = null;
        }
        String strW = mngVar != null ? mngVar.w() : null;
        if (bVar instanceof c) {
            asbVar = new msb(rpbVar, (c) bVar, kSerializer.getDescriptor(), strW, 16);
        } else if (bVar instanceof a) {
            asbVar = new nsb(rpbVar, (a) bVar);
        } else {
            if (!(bVar instanceof irb) && !Intrinsics.a(bVar, JsonNull.INSTANCE)) {
                h9o.p();
                return null;
            }
            asbVar = new asb(rpbVar, (d) bVar, (String) null);
        }
        return asbVar.q(kSerializer);
    }

    public static final Object x(rpb rpbVar, String str, c cVar, KSerializer kSerializer) {
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        return new msb(rpbVar, cVar, descriptor, str, descriptor).q(kSerializer);
    }

    public static oji y(g1g g1gVar, boolean z, boolean z2) throws s1g {
        if (z) {
            B(3, g1gVar, false);
        }
        g1gVar.y((int) g1gVar.r(), StandardCharsets.UTF_8);
        long jR = g1gVar.r();
        String[] strArr = new String[(int) jR];
        for (int i = 0; i < jR; i++) {
            strArr[i] = g1gVar.y((int) g1gVar.r(), StandardCharsets.UTF_8);
        }
        if (z2 && (g1gVar.A() & 1) == 0) {
            throw s1g.d("framing bit expected to be set", null);
        }
        return new oji(strArr);
    }

    public static void z(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[12];
        long j10 = j6 ^ (j9 << 39);
        long j11 = j7 ^ ((j9 >>> 25) ^ (j9 << 62));
        long j12 = j8 ^ (j9 >>> 2);
        long j13 = jArr[11];
        long j14 = j5 ^ (j13 << 39);
        long j15 = j10 ^ ((j13 >>> 25) ^ (j13 << 62));
        long j16 = j11 ^ (j13 >>> 2);
        long j17 = jArr[10];
        long j18 = j4 ^ (j17 << 39);
        long j19 = j14 ^ ((j17 >>> 25) ^ (j17 << 62));
        long j20 = j15 ^ (j17 >>> 2);
        long j21 = jArr[9];
        long j22 = j3 ^ (j21 << 39);
        long j23 = j18 ^ ((j21 >>> 25) ^ (j21 << 62));
        long j24 = j19 ^ (j21 >>> 2);
        long j25 = jArr[8];
        long j26 = j ^ (j12 << 39);
        long j27 = (j2 ^ (j25 << 39)) ^ ((j12 >>> 25) ^ (j12 << 62));
        long j28 = (j22 ^ ((j25 >>> 25) ^ (j25 << 62))) ^ (j12 >>> 2);
        long j29 = j16 >>> 25;
        jArr2[0] = j26 ^ j29;
        jArr2[1] = j27 ^ (j29 << 23);
        jArr2[2] = j28;
        jArr2[3] = j23 ^ (j25 >>> 2);
        jArr2[4] = j24;
        jArr2[5] = j20;
        jArr2[6] = j16 & 33554431;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String g(byte[] r10, int r11, int r12) throws defpackage.cjb {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jym.g(byte[], int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(java.lang.String r25, byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jym.h(java.lang.String, byte[], int, int):int");
    }
}

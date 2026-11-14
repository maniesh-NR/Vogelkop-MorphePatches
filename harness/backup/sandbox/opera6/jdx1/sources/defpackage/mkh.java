package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class mkh {
    public static final h7h a = new h7h(new nd3((byte) 0));
    public static final ue5 b = new ue5(-813320237, new gf5((byte) 15), false);
    public static final ue5 c = new ue5(-883721363, new lf5((byte) 4), false);
    public static final s49 d = new s49((byte) 13);
    public static final odf e = new odf((byte) 22);
    public static final iml f = new iml(0, new long[0], new Object[0]);
    public static final String[] g = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] h = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] i = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static final eko j = new eko(1);

    public static csh A(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        z0b z0bVarP = h1b.p();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (zch.s(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strM = zch.m(xmlPullParser, strConcat3);
                String strM2 = zch.m(xmlPullParser, strConcat4);
                String strM3 = zch.m(xmlPullParser, strConcat5);
                String strM4 = zch.m(xmlPullParser, strConcat6);
                if (strM == null || strM2 == null) {
                    return csh.e;
                }
                z0bVarP.c(new fae(strM, strM3 != null ? Long.parseLong(strM3) : 0L, strM4 != null ? Long.parseLong(strM4) : 0L));
            }
        } while (!zch.r(xmlPullParser, strConcat2));
        return z0bVarP.g();
    }

    public static final tt9 B(ih5 ih5Var) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.T(206, mh5.e);
        if (vt9Var.S) {
            lqj.y(vt9Var.I);
        }
        Object objC = vt9Var.C();
        zt9 l1iVar = objC instanceof zt9 ? (zt9) objC : null;
        if (l1iVar == null) {
            l1iVar = new l1i(new st9(new tt9(vt9Var, vt9Var.T, vt9Var.q, vt9Var.C, vt9Var.h.t)), -1);
            vt9Var.h0(l1iVar);
        }
        tt9 tt9Var = ((st9) l1iVar.a).a;
        tt9Var.f.setValue(vt9Var.l());
        vt9Var.p(false);
        return tt9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(cg5 r9, defpackage.b2c r10, defpackage.b2c r11, defpackage.qs3 r12, defpackage.nba r13) {
        /*
            r0 = 0
            if (r11 != 0) goto Lf
            java.lang.Object r9 = r12.a(r0, r13)
            px5 r10 = px5.a
            if (r9 != r10) goto Lc
            return r9
        Lc:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        Lf:
            int r1 = r9.ordinal()
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L3d
            if (r1 == r3) goto L22
            if (r1 == r2) goto L22
            h9o.p()
            return r0
        L22:
            voh r1 = defpackage.rm5.j(r10, r4)
            voh r5 = defpackage.rm5.j(r11, r4)
            float r6 = r1.b
            float r7 = r5.b
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L3d
            float r1 = r1.d
            float r5 = r5.d
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L3d
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L3d:
            long r5 = r10.h()
            r1 = 32
            long r5 = r5 >> r1
            int r1 = (int) r5
            float r1 = (float) r1
            long r5 = r10.h()
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            int r10 = (int) r5
            long r5 = r11.h()
            long r5 = r5 & r7
            int r11 = (int) r5
            int r9 = r9.ordinal()
            r5 = 0
            if (r9 == 0) goto L70
            if (r9 == r4) goto L68
            if (r9 == r3) goto L70
            if (r9 == r2) goto L68
            h9o.p()
            return r0
        L68:
            if (r10 > r11) goto L70
            int r11 = r11 - r10
            float r9 = (float) r11
            r11 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r11
            goto L71
        L70:
            r9 = r5
        L71:
            voh r11 = new voh
            float r0 = -r9
            float r10 = (float) r10
            float r10 = r10 + r9
            r11.<init>(r5, r0, r1, r10)
            java.lang.Object r9 = r12.a(r11, r13)
            px5 r10 = px5.a
            if (r9 != r10) goto L82
            return r9
        L82:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkh.C(cg5, b2c, b2c, qs3, nba):java.lang.Object");
    }

    public static final BigInteger D(int i2) {
        return new BigInteger(String.valueOf(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final c52 E(orb r12) {
        /*
            org.json.JSONObject r0 = r12.a
            java.lang.String r1 = "type"
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = r0.optInt(r1, r2)
            r4 = 0
            if (r3 != r2) goto L1b
            r2 = 0
            int r0 = r0.optInt(r1, r2)
            if (r0 != 0) goto L16
            r0 = r4
            goto L1f
        L16:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L1f
        L1b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L1f:
            if (r0 == 0) goto L47
            qii r1 = b52.b
            int r0 = r0.intValue()
            r1.getClass()
            h58 r1 = b52.g
            java.util.Iterator r1 = r1.iterator()
        L30:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            r3 = r2
            b52 r3 = (b52) r3
            byte r3 = r3.a
            if (r3 != r0) goto L30
            goto L43
        L42:
            r2 = r4
        L43:
            b52 r2 = (b52) r2
            if (r2 != 0) goto L49
        L47:
            b52 r2 = b52.c
        L49:
            int r0 = r2.ordinal()
            java.lang.String r1 = "id"
            if (r0 == 0) goto L81
            r2 = 1
            if (r0 == r2) goto L65
            r2 = 2
            if (r0 != r2) goto L61
            d52 r0 = new d52
            java.lang.String r12 = r12.e(r1)
            r0.<init>(r12)
            return r0
        L61:
            h9o.p()
            return r4
        L65:
            f52 r0 = new f52
            java.lang.String r1 = r12.e(r1)
            java.lang.String r2 = "text"
            java.lang.String r2 = r12.e(r2)
            java.lang.String r3 = "pageUrl"
            java.lang.String r12 = r12.m(r3, r4)
            if (r12 == 0) goto L7d
            android.net.Uri r4 = android.net.Uri.parse(r12)
        L7d:
            r0.<init>(r4, r1, r2)
            return r0
        L81:
            java.lang.String r6 = r12.m(r1, r4)
            if (r6 == 0) goto L97
            java.lang.String r0 = "shodanId"
            java.lang.String r8 = r12.m(r0, r4)
            if (r8 == 0) goto L97
            java.lang.String r0 = "mimeType"
            java.lang.String r9 = r12.m(r0, r4)
            if (r9 != 0) goto L98
        L97:
            return r4
        L98:
            e52 r5 = new e52
            java.lang.String r0 = "name"
            java.lang.String r7 = r12.e(r0)
            java.lang.String r0 = "thumbnailUrl"
            java.lang.String r10 = r12.m(r0, r4)
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkh.E(orb):c52");
    }

    public static final void a(c2e c2eVar, Function0 function0, ih5 ih5Var, int i2) {
        Function0 function02 = function0;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1771069842);
        int i3 = (vt9Var.f(c2eVar) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= vt9Var.h(function02) ? 32 : 16;
        }
        int i4 = i3;
        if (vt9Var.N(i4 & 1, (i4 & 19) != 18)) {
            z7e z7eVar = z7e.b;
            c8e c8eVarX = a26.X(wxe.Q(z7eVar).d(mpj.a), 24.0f);
            byte b2 = 19;
            x62 x62Var = new x62(24.0f, true, new t40(b2));
            rd3 rd3Var = rbe.n;
            db5 db5VarA = cb5.a(x62Var, rd3Var, vt9Var, 6);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarX);
            bh5.To.getClass();
            vt9Var.a0();
            boolean z = vt9Var.S;
            fza fzaVar = m3c.S;
            if (z) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            ah5 ah5Var = ujp.f;
            y4h.o(vt9Var, db5VarA, ah5Var);
            ah5 ah5Var2 = ujp.e;
            y4h.o(vt9Var, oagVarL, ah5Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            ah5 ah5Var3 = ujp.g;
            y4h.o(vt9Var, numValueOf, ah5Var3);
            y4h.m(vt9Var);
            ah5 ah5Var4 = ujp.d;
            y4h.o(vt9Var, c8eVarP, ah5Var4);
            o9i o9iVarA = m9i.a(new x62(24.0f, true, new t40(b2)), rbe.k, vt9Var, 6);
            int iHashCode2 = Long.hashCode(vt9Var.T);
            oag oagVarL2 = vt9Var.l();
            c8e c8eVarP2 = qyn.P(vt9Var, z7eVar);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ah5Var);
            y4h.o(vt9Var, oagVarL2, ah5Var2);
            u35.j(iHashCode2, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP2, ah5Var4);
            hp7 hp7Var = ua5.a;
            wta.b(iza.a((dl7) tk7.o.getValue(), vt9Var), null, a26.X(mpj.h(lcp.j(z7eVar, 1.0f, ((sa5) vt9Var.j(hp7Var)).B, v8i.a(8.0f)), 48.0f), 8.0f), ((sa5) vt9Var.j(hp7Var)).a, vt9Var, 56, 0);
            g4c g4cVar = new g4c(1.0f, true);
            db5 db5VarA2 = cb5.a(new x62(12.0f, true, new t40((byte) 19)), rd3Var, vt9Var, 6);
            int iHashCode3 = Long.hashCode(vt9Var.T);
            oag oagVarL3 = vt9Var.l();
            c8e c8eVarP3 = qyn.P(vt9Var, g4cVar);
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(fzaVar);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, db5VarA2, ah5Var);
            y4h.o(vt9Var, oagVarL3, ah5Var2);
            u35.j(iHashCode3, vt9Var, ah5Var3, vt9Var);
            y4h.o(vt9Var, c8eVarP3, ah5Var4);
            String str = c2eVar.a;
            hp7 hp7Var2 = abm.a;
            ijl.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var2)).f, vt9Var, 0, 0, 131070);
            ijl.b(c2eVar.b, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, ((wam) vt9Var.j(hp7Var2)).k, vt9Var, 0, 0, 131070);
            vt9Var.p(true);
            vt9Var.p(true);
            function02 = function0;
            yi4.a(function02, new kga(rbe.p), false, (paj) null, (z14) null, (e24) null, (go3) null, (zvf) null, xf8.g, vt9Var, ((i4 >> 3) & 14) | 805306368, 508);
            vt9Var = vt9Var;
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new kx0(c2eVar, function02, i2, (byte) 7);
        }
    }

    public static final void b(ue5 ue5Var, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-709502251);
        if (vt9Var.N(i2 & 1, (i2 & 3) != 2)) {
            hp7 hp7Var = xji.a;
            vji vjiVar = (vji) vt9Var.j(hp7Var);
            uji ujiVarN = w0h.n(vt9Var);
            Object[] objArr = {vjiVar};
            c67 c67Var = new c67((Function2) new nf8((byte) 13), (Function1) new ry7(vjiVar, ujiVarN, (byte) 23));
            boolean zH = vt9Var.h(vjiVar) | vt9Var.h(ujiVarN);
            Object objK = vt9Var.K();
            if (zH || objK == hh5.a) {
                objK = new gv8(vjiVar, ujiVarN, (byte) 16);
                vt9Var.g0(objK);
            }
            z6c z6cVar = (z6c) w1h.u(objArr, c67Var, (Function0) objK, vt9Var, 0);
            kfo.c(hp7Var.a(z6cVar), gyg.P(-412824043, new hda(ue5Var, z6cVar, (byte) 5), vt9Var), vt9Var, 56);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new bg5(ue5Var, i2, (byte) 4);
        }
    }

    public static final void c(c2e c2eVar, Function0 function0, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1220377425);
        int i3 = i2 | (vt9Var2.f(c2eVar) ? 4 : 2) | (vt9Var2.h(function0) ? 32 : 16);
        if (vt9Var2.N(i3 & 1, (i3 & 19) != 18)) {
            vt9Var = vt9Var2;
            i7e.a(function0, null, i7e.f(null, vt9Var2, 0, 3), 0.0f, false, null, 0L, 0L, 0L, null, null, null, gyg.P(-124920943, new b57((Object) c2eVar, (Object) function0, (byte) 12), vt9Var2), vt9Var, (i3 >> 3) & 14, 7162);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new hda(c2eVar, function0, i2, (byte) 13);
        }
    }

    public static final void d(bng bngVar, c8e c8eVar, ih5 ih5Var, int i2) {
        vt9 vt9Var;
        c8e c8eVar2;
        String str;
        int i3;
        zpa zpaVar;
        bng bngVar2 = bngVar;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(2078399734);
        int i4 = (vt9Var2.f(bngVar2) ? 4 : 2) | i2 | 48;
        if (vt9Var2.N(i4 & 1, (i4 & 19) != 18)) {
            afe afeVarH = dyg.h(((hng) bngVar2).o, vt9Var2);
            hng hngVar = (hng) bngVar2;
            afe afeVarH2 = dyg.h(hngVar.r, vt9Var2);
            fsl fslVar = (fsl) dyg.h(hngVar.l, vt9Var2).getValue();
            hdg hdgVar = hngVar.m;
            ang angVar = (ang) afeVarH.getValue();
            String str2 = hngVar.p;
            fum fumVar = (fum) afeVarH2.getValue();
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object objK = vt9Var2.K();
            zpa zpaVar2 = hh5.a;
            if (z || objK == zpaVar2) {
                str = str2;
                i3 = i5;
                zpaVar = zpaVar2;
                e6g e6gVar = new e6g(0, bngVar2, bng.class, "onBack", "onBack()V", 0, (byte) 3);
                vt9Var2.g0(e6gVar);
                objK = e6gVar;
            } else {
                i3 = i5;
                str = str2;
                zpaVar = zpaVar2;
            }
            Function0 function0 = (mtb) objK;
            boolean z2 = i3 == 4;
            Object objK2 = vt9Var2.K();
            if (z2 || objK2 == zpaVar) {
                e6g e6gVar2 = new e6g(0, bngVar, bng.class, "onNext", "onNext()V", 0, (byte) 4);
                vt9Var2.g0(e6gVar2);
                objK2 = e6gVar2;
            }
            Function0 function02 = (mtb) objK2;
            boolean z3 = i3 == 4;
            Object objK3 = vt9Var2.K();
            if (z3 || objK3 == zpaVar) {
                s2e s2eVar = new s2e(1, bngVar, bng.class, "onRedeem", "onRedeem(Ljava/lang/String;)V", 0, (byte) 27);
                vt9Var2.g0(s2eVar);
                objK3 = s2eVar;
            }
            Function1 function1 = (mtb) objK3;
            boolean z4 = i3 == 4;
            Object objK4 = vt9Var2.K();
            if (z4 || objK4 == zpaVar) {
                e6g e6gVar3 = new e6g(0, bngVar, bng.class, "onBottomSheetDismissed", "onBottomSheetDismissed()V", 0, (byte) 5);
                vt9Var2.g0(e6gVar3);
                objK4 = e6gVar3;
            }
            Function0 function03 = (mtb) objK4;
            boolean z5 = i3 == 4;
            Object objK5 = vt9Var2.K();
            if (z5 || objK5 == zpaVar) {
                e6g e6gVar4 = new e6g(0, bngVar, bng.class, "onMessageShown", "onMessageShown()V", 0, (byte) 6);
                vt9Var2.g0(e6gVar4);
                objK5 = e6gVar4;
            }
            Function0 function04 = (mtb) objK5;
            boolean z6 = i3 == 4;
            Object objK6 = vt9Var2.K();
            if (z6 || objK6 == zpaVar) {
                bngVar2 = bngVar;
                objK6 = new e6g(0, bngVar2, bng.class, "onGetMiniPayClick", "onGetMiniPayClick()V", 0, (byte) 7);
                vt9Var2.g0(objK6);
            } else {
                bngVar2 = bngVar;
            }
            z7e z7eVar = z7e.b;
            vt9Var = vt9Var2;
            e(fslVar, hdgVar, angVar, str, fumVar, function0, function02, function1, function03, function04, (mtb) objK6, z7eVar, vt9Var, 0, 48, 0);
            c8eVar2 = z7eVar;
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new hda(bngVar2, c8eVar2, i2, (byte) 26);
        }
    }

    public static final void e(final fsl fslVar, final hdg hdgVar, final ang angVar, final String str, final fum fumVar, final Function0 function0, final Function0 function02, final Function1 function1, final Function0 function03, final Function0 function04, final Function0 function05, c8e c8eVar, ih5 ih5Var, final int i2, final int i3, final int i4) {
        String str2;
        int i5;
        c8e c8eVar2;
        vt9 vt9Var;
        final c8e c8eVar3;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1640651072);
        int i6 = (vt9Var2.f(fslVar) ? 4 : 2) | i2 | (vt9Var2.f(hdgVar) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i6 |= vt9Var2.f(angVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i2 & 3072) == 0) {
            str2 = str;
            i6 |= vt9Var2.f(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        if ((i2 & 24576) == 0) {
            i6 |= vt9Var2.f(fumVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i6 |= vt9Var2.h(function0) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i6 |= vt9Var2.h(function02) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i6 |= vt9Var2.h(function1) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i6 |= vt9Var2.h(function03) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i6 |= vt9Var2.h(function04) ? 536870912 : 268435456;
        }
        int i7 = i6;
        if ((i3 & 6) == 0) {
            i5 = i3 | (vt9Var2.h(function05) ? 4 : 2);
        } else {
            i5 = i3;
        }
        int i8 = i4 & 2048;
        if (i8 != 0) {
            i5 |= 48;
            c8eVar2 = c8eVar;
        } else {
            c8eVar2 = c8eVar;
            if ((i3 & 48) == 0) {
                i5 |= vt9Var2.f(c8eVar2) ? 32 : 16;
            }
        }
        if (vt9Var2.N(i7 & 1, ((i7 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            c8e c8eVar4 = i8 != 0 ? z7e.b : c8eVar2;
            boolean z = (i7 & 1879048192) == 536870912;
            Object objK = vt9Var2.K();
            if (z || objK == hh5.a) {
                objK = new p01(function04, (byte) 10);
                vt9Var2.g0(objK);
            }
            w1h.a(c8eVar4, gyg.P(-73752964, new hda(fslVar, function0, (byte) 25), vt9Var2), null, gyg.P(1472330938, new z47(coh.g(fumVar, (Function1) objK, vt9Var2, (i7 >> 12) & 14), (byte) 4), vt9Var2), null, 0, 0L, 0L, null, gyg.P(2072737809, new e8c(hdgVar, ((String) hdgVar.a.getValue()).length() >= 5, function02, str2, function05), vt9Var2), vt9Var2, ((i5 >> 3) & 14) | 805309488, 500);
            c8e c8eVar5 = c8eVar4;
            vt9Var = vt9Var2;
            if (angVar != null) {
                vt9Var.W(94286576);
                i7e.a(function03, null, i7e.f(null, vt9Var, 0, 3), 0.0f, false, null, 0L, 0L, 0L, null, null, null, gyg.P(-867853273, new l5c(angVar, function03, function1, function05, (byte) 8), vt9Var), vt9Var, (i7 >> 24) & 14, 7162);
                vt9Var.p(false);
            } else {
                vt9Var.W(94734402);
                vt9Var.p(false);
            }
            c8eVar3 = c8eVar5;
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            c8eVar3 = c8eVar2;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: ing
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(i2 | 1);
                    int iM2 = aoh.m(i3);
                    mkh.e(fslVar, hdgVar, angVar, str, fumVar, function0, function02, function1, function03, function04, function05, c8eVar3, (ih5) obj, iM, iM2, i4);
                    return Unit.a;
                }
            };
        }
    }

    public static final mng f(Decoder decoder) {
        mng mngVar = decoder instanceof mng ? (mng) decoder : null;
        if (mngVar != null) {
            return mngVar;
        }
        j9h.u(uqh.a(decoder.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static final wqb g(Encoder encoder) {
        wqb wqbVar = encoder instanceof wqb ? (wqb) encoder : null;
        if (wqbVar != null) {
            return wqbVar;
        }
        j9h.u(uqh.a(encoder.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
        return null;
    }

    public static IOException h(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static IOException i(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile != null && parentFile.exists()) {
            return parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? h(file, iOException) : h(file, iOException) : parentFile.canWrite() ? h(file, iOException) : h(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? h(file, iOException) : h(file, iOException) : parentFile.canWrite() ? h(file, iOException) : h(file, iOException);
        }
        return h(file, iOException);
    }

    public static final void j(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        e22 e22VarK = k(function1, obj, null);
        if (e22VarK != null) {
            c09.s(e22VarK, coroutineContext);
        }
    }

    public static final e22 k(Function1 function1, Object obj, e22 e22Var) {
        try {
            function1.invoke(obj);
            return e22Var;
        } catch (Throwable th) {
            if (e22Var == null || e22Var.getCause() == th) {
                return new e22(rfp.o(obj, "Exception in undelivered element handler for "), th);
            }
            wf8.a(e22Var, th);
            return e22Var;
        }
    }

    public static void l(long[] jArr, long[] jArr2, int i2) {
        jArr2[i2] = jArr[0];
        jArr2[i2 + 1] = jArr[1];
        jArr2[i2 + 2] = jArr[2];
        jArr2[i2 + 3] = jArr[3];
        jArr2[i2 + 4] = jArr[4];
        jArr2[i2 + 5] = jArr[5];
        jArr2[i2 + 6] = jArr[6];
    }

    public static rb4 m(rb4... rb4VarArr) {
        List listAsList = Arrays.asList(rb4VarArr);
        return listAsList.isEmpty() ? new tb4() : listAsList.size() == 1 ? (rb4) listAsList.get(0) : new sb4(listAsList);
    }

    public static t87 n(q0 q0Var, int i2) {
        qci vciVar;
        if (q0Var.p(kge.a)) {
            vciVar = new qci();
        } else {
            if (!q0Var.p(kge.m)) {
                s49.l(q0Var, "unrecognized digest OID: ");
                return null;
            }
            vciVar = new vci(NotificationCompat.FLAG_LOCAL_ONLY);
        }
        return (kge.m.p(q0Var) || vciVar.d() != i2) ? new w87(vciVar, i2, (byte) 0) : vciVar;
    }

    public static final mh9 o(Context context) {
        return new mh9(new h61(context), new u61(Build.VERSION.SDK_INT >= 31 ? li9.a.a(context) : 0));
    }

    public static final long p(sxf sxfVar) {
        return zed.c(sxfVar.l() * sxfVar.p()) + (sxfVar.k() * sxfVar.p());
    }

    public static void q(Object obj, String str, String str2) {
        if (Log.isLoggable("TRuntime.".concat(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static final hn2 r(hn2 hn2Var, Size size, Range range) {
        int i2 = hn2Var.c;
        int i3 = hn2Var.h;
        int i4 = hn2Var.d;
        return new hn2(hn2Var.a, hn2Var.b, ((Number) range.clamp(Integer.valueOf(k3n.c(i2, i3, i3, i4, i4, size.getWidth(), hn2Var.e, size.getHeight(), hn2Var.f)))).intValue(), hn2Var.d, size.getWidth(), size.getHeight(), hn2Var.g, hn2Var.h, hn2Var.i, hn2Var.j);
    }

    public static final int s(Cursor cursor, String str) {
        String strX;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            strX = e82.x(cursor.getColumnNames(), (String) null, (String) null, (String) null, (tb6) null, 63);
        } catch (Exception unused) {
            strX = "unknown";
        }
        qp2.o(p3p.w("column '", str, "' does not exist. Available columns: ", strX));
        return 0;
    }

    public static final int t(ih5 ih5Var) {
        ih5Var.getClass();
        return Long.hashCode(((vt9) ih5Var).T);
    }

    public static nv0 u(Bundle bundle) {
        String string;
        if (bundle != null && (string = bundle.getString("session_source")) != null) {
            h58 h58Var = nv0.g;
            w4 w4VarE = sko.e(h58Var, h58Var);
            while (w4VarE.hasNext()) {
                nv0 nv0Var = (nv0) w4VarE.next();
                if (nv0Var.a.equals(string)) {
                    return nv0Var;
                }
            }
            h9o.h("Collection contains no element matching the predicate.");
            return null;
        }
        return nv0.b;
    }

    public static String v(String str) {
        return "TRuntime.".concat(str);
    }

    public static c8e w(int i2) {
        return qyn.q(z7e.b, new mba(kfo.i, i2));
    }

    public static /* synthetic */ bw4 x(i3j i3jVar, Object obj, String str, k2j k2jVar, int i2) {
        if ((i2 & 4) != 0) {
            k2jVar = null;
        }
        return i3jVar.D(obj, str, k2jVar, (nrl) null);
    }

    public static boolean y(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.yv4 z(java.lang.String r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r20
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = defpackage.zch.s(r0, r1)
            r3 = 0
            if (r2 == 0) goto Lcf
            a1b r2 = h1b.b
            csh r2 = csh.e
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = defpackage.zch.s(r0, r8)
            r9 = 4
            if (r8 == 0) goto L9b
            r2 = 0
            r6 = r2
        L36:
            if (r6 >= r9) goto Lc8
            java.lang.String[] r7 = defpackage.mkh.g
            r7 = r7[r6]
            java.lang.String r7 = defpackage.zch.m(r0, r7)
            if (r7 == 0) goto L98
            int r6 = java.lang.Integer.parseInt(r7)
            r7 = 1
            if (r6 != r7) goto Lc8
            r6 = r2
        L4a:
            if (r6 >= r9) goto L64
            java.lang.String[] r7 = defpackage.mkh.h
            r7 = r7[r6]
            java.lang.String r7 = defpackage.zch.m(r0, r7)
            if (r7 == 0) goto L61
            long r6 = java.lang.Long.parseLong(r7)
            r10 = -1
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 != 0) goto L65
            goto L64
        L61:
            int r6 = r6 + 1
            goto L4a
        L64:
            r6 = r4
        L65:
            r8 = 2
            if (r2 >= r8) goto L93
            java.lang.String[] r8 = defpackage.mkh.i
            r8 = r8[r2]
            java.lang.String r8 = defpackage.zch.m(r0, r8)
            if (r8 == 0) goto L90
            long r12 = java.lang.Long.parseLong(r8)
            fae r14 = new fae
            r16 = 0
            r18 = 0
            java.lang.String r15 = "image/jpeg"
            r14.<init>(r15, r16, r18)
            r2 = r14
            fae r10 = new fae
            java.lang.String r11 = "video/mp4"
            r14 = 0
            r10.<init>(r11, r12, r14)
            csh r2 = h1b.w(r2, r10)
            goto Lbc
        L90:
            int r2 = r2 + 1
            goto L65
        L93:
            a1b r2 = h1b.b
            csh r2 = csh.e
            goto Lbc
        L98:
            int r6 = r6 + 1
            goto L36
        L9b:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = defpackage.zch.s(r0, r8)
            if (r8 == 0) goto Lac
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            csh r2 = A(r0, r2, r8)
            goto Lbc
        Lac:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = defpackage.zch.s(r0, r8)
            if (r8 == 0) goto Lbc
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            csh r2 = A(r0, r2, r8)
        Lbc:
            boolean r8 = defpackage.zch.r(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lc9
        Lc8:
            return r3
        Lc9:
            yv4 r0 = new yv4
            r0.<init>(r6, r2, r9)
            return r0
        Lcf:
            java.lang.String r0 = "Couldn't find xmp metadata"
            s1g r0 = defpackage.s1g.d(r0, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkh.z(java.lang.String):yv4");
    }
}

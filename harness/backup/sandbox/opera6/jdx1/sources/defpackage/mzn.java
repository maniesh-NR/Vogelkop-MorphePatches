package defpackage;

import android.text.TextUtils;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class mzn implements cn8 {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final pql b;
    public final r16 d;
    public final boolean e;
    public en8 f;
    public int h;
    public final g1g c = new g1g();
    public byte[] g = new byte[1024];

    public mzn(String str, pql pqlVar, r16 r16Var, boolean z) {
        this.a = str;
        this.b = pqlVar;
        this.d = r16Var;
        this.e = z;
    }

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        lp6 lp6Var = (lp6) dn8Var;
        lp6Var.peekFully(this.g, 0, 6, false);
        byte[] bArr = this.g;
        g1g g1gVar = this.c;
        g1gVar.L(bArr, 6);
        if (nzn.a(g1gVar)) {
            return true;
        }
        lp6Var.peekFully(this.g, 6, 3, false);
        g1gVar.L(this.g, 9);
        return nzn.a(g1gVar);
    }

    @Override // defpackage.cn8
    public final int b(dn8 dn8Var, hp2 hp2Var) throws s1g, NumberFormatException, InterruptedIOException {
        String strN;
        this.f.getClass();
        int i2 = (int) ((lp6) dn8Var).c;
        int i3 = this.h;
        byte[] bArrCopyOf = this.g;
        if (i3 == bArrCopyOf.length) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, ((i2 != -1 ? i2 : bArrCopyOf.length) * 3) / 2);
            this.g = bArrCopyOf;
        }
        int i4 = this.h;
        int i5 = ((lp6) dn8Var).read(bArrCopyOf, i4, bArrCopyOf.length - i4);
        if (i5 != -1) {
            int i6 = this.h + i5;
            this.h = i6;
            if (i2 == -1 || i6 != i2) {
                return 0;
            }
        }
        g1g g1gVar = new g1g(this.g);
        nzn.d(g1gVar);
        String strN2 = g1gVar.n(StandardCharsets.UTF_8);
        long jW = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strN2)) {
                while (true) {
                    String strN3 = g1gVar.n(StandardCharsets.UTF_8);
                    if (strN3 == null) {
                        break;
                    }
                    if (nzn.a.matcher(strN3).matches()) {
                        do {
                            strN = g1gVar.n(StandardCharsets.UTF_8);
                            if (strN != null) {
                            }
                        } while (!strN.isEmpty());
                    } else {
                        Matcher matcher2 = lzn.a.matcher(strN3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    e(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = nzn.c(strGroup);
                String str = tym.a;
                long jB = this.b.b(tym.W((jW + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                hyl hylVarE = e(jB - jC2);
                byte[] bArr = this.g;
                int i7 = this.h;
                g1g g1gVar2 = this.c;
                g1gVar2.L(bArr, i7);
                hylVarE.f(this.h, g1gVar2);
                hylVarE.a(jB, 1, this.h, 0, null);
                return -1;
            }
            if (strN2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(strN2);
                if (!matcher3.find()) {
                    throw s1g.d("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strN2), null);
                }
                Matcher matcher4 = j.matcher(strN2);
                if (!matcher4.find()) {
                    throw s1g.d("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strN2), null);
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = nzn.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j2 = Long.parseLong(strGroup3);
                String str2 = tym.a;
                jW = tym.W(j2, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strN2 = g1gVar.n(StandardCharsets.UTF_8);
        }
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        if (this.e) {
            en8Var = new h5k(en8Var, this.d);
        }
        this.f = en8Var;
        en8Var.h(new rv2(-9223372036854775807L));
    }

    public final hyl e(long j2) {
        hyl hylVarTrack = this.f.track(0, 3);
        nj9 nj9Var = new nj9();
        nj9Var.m = dzd.p("text/vtt");
        nj9Var.d = this.a;
        nj9Var.r = j2;
        z1m.q(nj9Var, hylVarTrack);
        this.f.endTracks();
        return hylVarTrack;
    }

    @Override // defpackage.cn8
    public final void release() {
    }

    @Override // defpackage.cn8
    public final void seek(long j2, long j3) {
        throw new IllegalStateException();
    }
}

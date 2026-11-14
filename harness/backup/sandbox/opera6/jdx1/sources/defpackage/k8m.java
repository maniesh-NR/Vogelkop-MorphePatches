package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes.dex */
public final class k8m implements vnk {
    public final g1g a = new g1g();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int g;

    public k8m(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = tym.h((((bArr[10] & 255) << 8) | (bArr[11] & 255)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(((i & 255) << 24) | (i >>> 8)), i3, i4, i5 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (z || z2) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vnk
    public final void j(byte[] bArr, int i, int i2, unk unkVar, op5 op5Var) {
        String strY;
        int i3;
        g1g g1gVar = this.a;
        g1gVar.L(bArr, i + i2);
        g1gVar.N(i);
        int i4 = 1;
        int i5 = 0;
        z4o.w(g1gVar.a() >= 2);
        int iH = g1gVar.H();
        if (iH == 0) {
            strY = "";
        } else {
            int i6 = g1gVar.b;
            Charset charsetJ = g1gVar.J();
            int i7 = iH - (g1gVar.b - i6);
            if (charsetJ == null) {
                charsetJ = StandardCharsets.UTF_8;
            }
            strY = g1gVar.y(i7, charsetJ);
        }
        if (strY.isEmpty()) {
            a1b a1bVar = h1b.b;
            op5Var.accept(new a46(csh.e, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strY);
        b(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fH = this.f;
        while (g1gVar.a() >= 8) {
            int i8 = g1gVar.b;
            int iM = g1gVar.m();
            int iM2 = g1gVar.m();
            if (iM2 == 1937013100) {
                z4o.w(g1gVar.a() >= 2 ? i4 : i5);
                int iH2 = g1gVar.H();
                int i9 = i5;
                while (i9 < iH2) {
                    z4o.w(g1gVar.a() >= 12 ? i4 : i5);
                    int iH3 = g1gVar.H();
                    int iH4 = g1gVar.H();
                    g1gVar.O(2);
                    int i10 = i9;
                    int iA = g1gVar.A();
                    g1gVar.O(i4);
                    int iM3 = g1gVar.m();
                    if (iH4 > spannableStringBuilder.length()) {
                        StringBuilder sbO = p3p.o(iH4, "Truncating styl end (", ") to cueText.length() (");
                        sbO.append(spannableStringBuilder.length());
                        sbO.append(").");
                        w7d.K(sbO.toString());
                        iH4 = spannableStringBuilder.length();
                    }
                    if (iH3 >= iH4) {
                        w7d.K("Ignoring styl with start (" + iH3 + ") >= end (" + iH4 + ").");
                        i3 = i10;
                    } else {
                        i3 = i10;
                        int i11 = iH4;
                        b(spannableStringBuilder, iA, this.c, iH3, i11, 0);
                        a(spannableStringBuilder, iM3, this.d, iH3, i11, 0);
                    }
                    i9 = i3 + 1;
                    i4 = 1;
                    i5 = 0;
                }
            } else if (iM2 == 1952608120 && this.b) {
                z4o.w(g1gVar.a() >= 2);
                fH = tym.h(g1gVar.H() / this.g, 0.0f, 0.95f);
            }
            g1gVar.N(i8 + iM);
            i4 = 1;
            i5 = 0;
        }
        op5Var.accept(new a46(h1b.v(new x36(spannableStringBuilder, null, null, null, fH, 0, 0, -3.4028235E38f, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, LinearLayoutManager.INVALID_OFFSET, 0.0f, 0)), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // defpackage.vnk
    public final int z() {
        return 2;
    }
}

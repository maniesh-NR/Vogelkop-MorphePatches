package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class ComplexColorCompat {
    public final Shader a;
    public final ColorStateList b;
    public int c;

    public ComplexColorCompat(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.b = colorStateList;
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f9, code lost:
    
        if (r11 == 2) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fb, code lost:
    
        r16 = (int[]) r0.b;
        r17 = (float[]) r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0209, code lost:
    
        if (r10 == 1) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x020b, code lost:
    
        if (r10 == 2) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020d, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x021a, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x021d, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0220, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0224, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.b, (float[]) r0.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0236, code lost:
    
        if (r25 <= 0.0f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0238, code lost:
    
        r20 = (int[]) r0.b;
        r21 = (float[]) r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0247, code lost:
    
        if (r10 == 1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x024a, code lost:
    
        if (r10 == 2) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x024c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0257, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x025a, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x025d, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0269, code lost:
    
        return new androidx.core.content.res.ComplexColorCompat(r11, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0271, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01db, code lost:
    
        if (r13.size() <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01dd, code lost:
    
        r0 = new defpackage.pad(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e3, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e4, code lost:
    
        if (r0 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e8, code lost:
    
        if (r20 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ea, code lost:
    
        r0 = new defpackage.pad(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f0, code lost:
    
        r0 = new defpackage.pad(r6, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f6, code lost:
    
        if (r11 == 1) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.core.content.res.ComplexColorCompat a(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ComplexColorCompat.a(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.core.content.res.ComplexColorCompat");
    }

    public final boolean b() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.b) != null && colorStateList.isStateful();
    }
}

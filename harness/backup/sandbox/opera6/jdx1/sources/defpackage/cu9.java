package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class cu9 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) throws NumberFormatException {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = tym.a;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.a = i;
            this.b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.lxd r11) {
        /*
            r10 = this;
            r11.getClass()
            z0b r0 = h1b.p()
            jxd[] r11 = r11.a
            int r1 = r11.length
            r2 = 0
            r3 = r2
        Lc:
            r4 = 0
            java.lang.String r5 = "iTunSMPB"
            if (r3 >= r1) goto L39
            r6 = r11[r3]
            java.lang.Class r7 = r6.getClass()
            java.lang.Class<xb5> r8 = defpackage.xb5.class
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 == 0) goto L31
            java.lang.Object r6 = r8.cast(r6)
            jxd r6 = (defpackage.jxd) r6
            r7 = r6
            xb5 r7 = (defpackage.xb5) r7
            java.lang.String r7 = r7.c
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L31
            r4 = r6
        L31:
            if (r4 == 0) goto L36
            r0.c(r4)
        L36:
            int r3 = r3 + 1
            goto Lc
        L39:
            csh r0 = r0.g()
            a1b r0 = r0.u(r2)
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            xb5 r1 = (defpackage.xb5) r1
            java.lang.String r1 = r1.d
            boolean r1 = r10.a(r1)
            if (r1 == 0) goto L41
            goto Lb1
        L56:
            z0b r0 = h1b.p()
            int r1 = r11.length
            r3 = r2
        L5c:
            if (r3 >= r1) goto L95
            r6 = r11[r3]
            java.lang.Class r7 = r6.getClass()
            java.lang.Class<hgb> r8 = defpackage.hgb.class
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 == 0) goto L8c
            java.lang.Object r6 = r8.cast(r6)
            jxd r6 = (defpackage.jxd) r6
            r7 = r6
            hgb r7 = (defpackage.hgb) r7
            java.lang.String r8 = r7.b
            java.lang.String r9 = "com.apple.iTunes"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L89
            java.lang.String r7 = r7.c
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L89
            r7 = 1
            goto L8a
        L89:
            r7 = r2
        L8a:
            if (r7 != 0) goto L8d
        L8c:
            r6 = r4
        L8d:
            if (r6 == 0) goto L92
            r0.c(r6)
        L92:
            int r3 = r3 + 1
            goto L5c
        L95:
            csh r11 = r0.g()
            a1b r11 = r11.u(r2)
        L9d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r11.next()
            hgb r0 = (defpackage.hgb) r0
            java.lang.String r0 = r0.d
            boolean r0 = r10.a(r0)
            if (r0 == 0) goto L9d
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu9.b(lxd):void");
    }
}

package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class ml {
    public String a;
    public String b;
    public rn9 c;
    public rn9 d;
    public jl e;
    public hl f;
    public kl g;
    public il h;
    public long i;
    public final HashSet j = new HashSet();

    public ml(String str) {
        if (str != null) {
            d(str, new ix5((byte) 21));
            this.i = 0L;
        }
    }

    public static Set a(rn9 rn9Var) {
        if (rn9Var == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet();
        List list = (List) rn9Var.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(((dl) it.next()).c);
            }
        }
        gl glVar = (gl) rn9Var.d;
        if (glVar != null) {
            Iterator it2 = glVar.b.iterator();
            while (it2.hasNext()) {
                hashSet.add(((dl) it2.next()).c);
            }
        }
        return hashSet;
    }

    public static ll b(gm gmVar, ll llVar) {
        if (llVar.a != 3) {
            return llVar;
        }
        gmVar.b("style", "small");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.rn9 c(defpackage.gm r7, defpackage.rn9 r8) {
        /*
            java.lang.Object r0 = r8.c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r8.d
            gl r1 = (gl) r1
            r2 = 3
            if (r0 == 0) goto L20
            java.util.Iterator r3 = r0.iterator()
        Lf:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L20
            java.lang.Object r4 = r3.next()
            dl r4 = (defpackage.dl) r4
            int r4 = r4.a
            if (r4 != r2) goto Lf
            goto L38
        L20:
            if (r1 == 0) goto Lac
            java.util.List r3 = r1.b
            java.util.Iterator r3 = r3.iterator()
        L28:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lac
            java.lang.Object r4 = r3.next()
            dl r4 = (defpackage.dl) r4
            int r4 = r4.a
            if (r4 != r2) goto L28
        L38:
            java.lang.String r3 = "style"
            java.lang.String r4 = "small"
            r7.b(r3, r4)
            r7 = 0
            if (r0 == 0) goto L69
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r0.size()
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L4f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r0.next()
            el r4 = (defpackage.el) r4
            int r5 = r4.a
            if (r5 == r2) goto L4f
            r3.add(r4)
            goto L4f
        L63:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L6a
        L69:
            r3 = r7
        L6a:
            if (r1 == 0) goto L95
            java.util.List r0 = r1.b
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r0.size()
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L7b:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L8f
            java.lang.Object r5 = r0.next()
            fl r5 = (defpackage.fl) r5
            int r6 = r5.a
            if (r6 == r2) goto L7b
            r4.add(r5)
            goto L7b
        L8f:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L96
        L95:
            r4 = r7
        L96:
            if (r3 != 0) goto L9b
            if (r4 != 0) goto L9b
            return r7
        L9b:
            rn9 r0 = new rn9
            if (r4 == 0) goto La6
            gl r7 = new gl
            int r1 = r1.a
            r7.<init>(r1, r4)
        La6:
            boolean r8 = r8.b
            r0.<init>(r3, r7, r8)
            return r0
        Lac:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml.c(gm, rn9):rn9");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0166 A[Catch: IllegalArgumentException | JSONException -> 0x01f6, PHI: r9
      0x0166: PHI (r9v23 java.lang.String) = (r9v12 java.lang.String), (r9v13 java.lang.String), (r9v24 java.lang.String) binds: [B:54:0x015c, B:51:0x0144, B:49:0x013b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {IllegalArgumentException | JSONException -> 0x01f6, blocks: (B:7:0x002b, B:10:0x0043, B:16:0x0063, B:18:0x006b, B:19:0x0090, B:56:0x0166, B:57:0x016d, B:21:0x0095, B:23:0x009d, B:24:0x00a3, B:26:0x00ab, B:27:0x00b4, B:30:0x00bd, B:32:0x00c5, B:33:0x00d4, B:35:0x00dc, B:36:0x00e4, B:38:0x00ec, B:39:0x00fb, B:41:0x0103, B:42:0x0113, B:44:0x011b, B:46:0x0124, B:48:0x012c, B:50:0x013d, B:52:0x0146, B:53:0x0155, B:55:0x015e, B:60:0x0182, B:62:0x0188, B:63:0x018b, B:65:0x0193, B:67:0x0197, B:69:0x019d, B:71:0x01a7, B:73:0x01ab, B:75:0x01b1, B:77:0x01de, B:78:0x01e3, B:80:0x01e7, B:81:0x01ec, B:83:0x01f0, B:13:0x0052), top: B:88:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.lang.String r21, defpackage.gm r22) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml.d(java.lang.String, gm):boolean");
    }
}

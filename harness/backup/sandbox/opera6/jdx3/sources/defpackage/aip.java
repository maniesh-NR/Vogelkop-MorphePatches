package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class aip {
    public final Context a;
    public final whp c;
    public Bitmap d;
    public iy8 f;
    public yhp g;
    public boolean h;
    public int i;
    public byte[] j;
    public Drawable k;
    public final ArrayList b = new ArrayList();
    public int e = 1;

    public aip(Context context, whp whpVar) {
        this.a = context;
        this.c = whpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.io.File r5) throws java.io.IOException {
        /*
            r0 = 0
            if (r5 == 0) goto L27
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.IOException -> L27
            r1.<init>(r5)     // Catch: java.io.IOException -> L27
            r2 = 6
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L1d
            int r4 = r1.read(r3, r0, r2)     // Catch: java.lang.Throwable -> L1d
            if (r4 == r2) goto L15
            r1.close()     // Catch: java.io.IOException -> L27
            goto L27
        L15:
            boolean r2 = d(r3)     // Catch: java.lang.Throwable -> L1d
            r1.close()     // Catch: java.io.IOException -> L27
            goto L28
        L1d:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L22
            goto L26
        L22:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch: java.io.IOException -> L27
        L26:
            throw r2     // Catch: java.io.IOException -> L27
        L27:
            r2 = r0
        L28:
            if (r2 != 0) goto L54
            if (r5 == 0) goto L51
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.IOException -> L51
            r1.<init>(r5)     // Catch: java.io.IOException -> L51
            r5 = 12
            byte[] r2 = new byte[r5]     // Catch: java.lang.Throwable -> L47
            int r3 = r1.read(r2, r0, r5)     // Catch: java.lang.Throwable -> L47
            if (r3 == r5) goto L3f
            r1.close()     // Catch: java.io.IOException -> L51
            goto L51
        L3f:
            boolean r5 = f(r2)     // Catch: java.lang.Throwable -> L47
            r1.close()     // Catch: java.io.IOException -> L51
            goto L52
        L47:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L4c
            goto L50
        L4c:
            r1 = move-exception
            r5.addSuppressed(r1)     // Catch: java.io.IOException -> L51
        L50:
            throw r5     // Catch: java.io.IOException -> L51
        L51:
            r5 = r0
        L52:
            if (r5 == 0) goto L55
        L54:
            r0 = 1
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aip.c(java.io.File):boolean");
    }

    public static boolean d(byte[] bArr) {
        if (bArr.length < 6) {
            return false;
        }
        String str = new String(bArr, 0, 6, StandardCharsets.US_ASCII);
        return str.equals("GIF87a") || str.equals("GIF89a");
    }

    public static boolean f(byte[] bArr) {
        if (bArr.length < 12) {
            return false;
        }
        Charset charset = StandardCharsets.US_ASCII;
        return "RIFF".equals(new String(bArr, 0, 4, charset)) && "WEBP".equals(new String(bArr, 8, 4, charset));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[Catch: IOException -> 0x0062, IOException | ClassCastException -> 0x006e, all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:9:0x0021, B:11:0x0027, B:13:0x002f, B:14:0x0037, B:17:0x003d, B:20:0x0045, B:22:0x004e, B:32:0x006b), top: B:43:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r7, int r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "MD5"
            whp r1 = r6.c
            vhp r2 = r1.e
            z9p r3 = defpackage.fip.c(r2)
            r4 = 0
            if (r3 == 0) goto L78
            java.lang.String r5 = dyg.d(r9, r0)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L67 java.lang.ClassCastException -> L69
            if (r5 != 0) goto L1b
            int r9 = r9.hashCode()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L67 java.lang.ClassCastException -> L69
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L67 java.lang.ClassCastException -> L69
        L1b:
            gt6 r9 = r3.o(r5)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L67 java.lang.ClassCastException -> L69
            if (r9 == 0) goto L6e
            z9p r2 = defpackage.fip.c(r2)     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L6e java.lang.Throwable -> L72
            if (r2 == 0) goto L3c
            java.lang.String r1 = r1.b     // Catch: java.io.IOException -> L3c java.lang.Throwable -> L6e java.lang.Throwable -> L72
            java.lang.String r0 = dyg.d(r1, r0)     // Catch: java.io.IOException -> L3c java.lang.Throwable -> L6e java.lang.Throwable -> L72
            if (r0 != 0) goto L37
            int r0 = r1.hashCode()     // Catch: java.io.IOException -> L3c java.lang.Throwable -> L6e java.lang.Throwable -> L72
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.io.IOException -> L3c java.lang.Throwable -> L6e java.lang.Throwable -> L72
        L37:
            java.io.File r0 = r2.p(r0)     // Catch: java.io.IOException -> L3c java.lang.Throwable -> L6e java.lang.Throwable -> L72
            goto L3d
        L3c:
            r0 = r4
        L3d:
            boolean r1 = c(r0)     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L6e java.lang.Throwable -> L72
            if (r1 == 0) goto L4e
            if (r0 == 0) goto L6e
            android.graphics.ImageDecoder$Source r7 = android.graphics.ImageDecoder.createSource(r0)     // Catch: java.lang.Throwable -> L6e java.lang.Throwable -> L72
            android.graphics.drawable.Drawable r4 = android.graphics.ImageDecoder.decodeDrawable(r7)     // Catch: java.lang.Throwable -> L6e java.lang.Throwable -> L72
            goto L6e
        L4e:
            java.lang.Object r0 = r9.b     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L6e java.lang.Throwable -> L72
            java.io.InputStream[] r0 = (java.io.InputStream[]) r0     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L6e java.lang.Throwable -> L72
            r1 = 0
            r0 = r0[r1]     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L6e java.lang.Throwable -> L72
            java.io.FileInputStream r0 = (java.io.FileInputStream) r0     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L6e java.lang.Throwable -> L72
            java.io.FileDescriptor r0 = r0.getFD()     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L6e java.lang.Throwable -> L72
            android.graphics.Bitmap r4 = defpackage.nro.b(r0, r7, r8)     // Catch: java.io.IOException -> L62 java.lang.Throwable -> L6e java.lang.Throwable -> L72
            goto L6e
        L60:
            r4 = r9
            goto L74
        L62:
            r7 = move-exception
            goto L6b
        L64:
            r7 = move-exception
            r9 = r4
            goto L6b
        L67:
            r6 = move-exception
            goto L74
        L69:
            r9 = r4
            goto L6e
        L6b:
            r7.getMessage()     // Catch: java.lang.Throwable -> L72
        L6e:
            r9h.l(r9)
            goto L78
        L72:
            r6 = move-exception
            goto L60
        L74:
            r9h.l(r4)
            throw r6
        L78:
            if (r4 != 0) goto L7d
            r7 = 1
            r6.h = r7
        L7d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aip.a(int, int, java.lang.String):java.lang.Object");
    }

    public final void b(String str) throws Throwable {
        z9p z9pVarC = fip.c(this.c.e);
        if (z9pVarC == null) {
            return;
        }
        eyi eyiVar = null;
        try {
            try {
                try {
                    String strD = dyg.d(str, "MD5");
                    if (strD == null) {
                        strD = String.valueOf(str.hashCode());
                    }
                    eyi eyiVarH = z9pVarC.h(strD);
                    if (eyiVarH != null) {
                        try {
                            m9p m9pVarB = eyiVarH.b();
                            m9pVarB.write(this.j);
                            m9pVarB.close();
                            eyiVarH.e();
                        } catch (IOException e) {
                            e = e;
                            eyiVar = eyiVarH;
                            e.getMessage();
                            if (eyiVar != null) {
                                eyiVar.d();
                                return;
                            }
                            return;
                        } catch (IllegalStateException e2) {
                            e = e2;
                            eyiVar = eyiVarH;
                            e.getMessage();
                            if (eyiVar == null) {
                                return;
                            }
                            eyiVar.d();
                            return;
                        } catch (Throwable th) {
                            th = th;
                            eyiVar = eyiVarH;
                            if (eyiVar != null) {
                                try {
                                    eyiVar.d();
                                } catch (IOException e3) {
                                    e3.getMessage();
                                }
                            }
                            throw th;
                        }
                    } else {
                        eyiVar = eyiVarH;
                    }
                    if (eyiVar != null) {
                        eyiVar.d();
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e4) {
                e = e4;
            } catch (IllegalStateException e5) {
                e = e5;
            }
        } catch (IOException e6) {
            e6.getMessage();
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((zhp) obj).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r8 = this;
            gxo r0 = defpackage.gxo.c
            whp r0 = r8.c
            int r1 = r0.d
            int r2 = r0.c
            r3 = 0
            r8.f = r3
            r8.g = r3
            boolean r3 = r8.h
            r4 = 0
            r5 = 1
            java.util.ArrayList r6 = r8.b
            if (r3 == 0) goto L31
            r8.h = r4
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L31
            java.util.ArrayList r1 = defpackage.fip.d
            r1.add(r0)
            r8.e()
            boolean r8 = defpackage.fip.f
            if (r8 != 0) goto La4
            defpackage.fip.f = r5
            koj r8 = defpackage.fip.h
            defpackage.gxo.c(r8)
            return
        L31:
            java.util.HashMap r3 = defpackage.fip.a
            r3.remove(r0)
            android.graphics.Bitmap r0 = r8.d
            if (r0 != 0) goto L5c
            android.graphics.drawable.Drawable r0 = r8.k
            if (r0 == 0) goto L73
            r0.getIntrinsicWidth()
            android.graphics.drawable.Drawable r0 = r8.k
            r0.getIntrinsicHeight()
            android.graphics.drawable.Drawable r0 = r8.k
            int r0 = r0.getIntrinsicWidth()
            int r0 = r0 * 100
            android.graphics.drawable.Drawable r3 = r8.k
            int r3 = r3.getIntrinsicHeight()
        L54:
            int r3 = r3 * r0
            int r2 = r2 * r1
            int r0 = java.lang.Math.max(r5, r2)
            int r3 = r3 / r0
            goto L73
        L5c:
            r0.getWidth()
            android.graphics.Bitmap r0 = r8.d
            r0.getHeight()
            android.graphics.Bitmap r0 = r8.d
            int r0 = r0.getWidth()
            int r0 = r0 * 100
            android.graphics.Bitmap r3 = r8.d
            int r3 = r3.getHeight()
            goto L54
        L73:
            r6.size()
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto La4
            android.graphics.Bitmap r0 = r8.d
            android.graphics.drawable.Drawable r1 = r8.k
            int r2 = r6.size()
            r3 = r4
        L85:
            if (r3 >= r2) goto La1
            java.lang.Object r5 = r6.get(r3)
            int r3 = r3 + 1
            zhp r5 = (defpackage.zhp) r5
            android.graphics.Bitmap r7 = r8.d
            if (r7 != 0) goto L9d
            android.graphics.drawable.Drawable r7 = r8.k
            if (r7 != 0) goto L9d
            int r7 = r8.e
            r5.a(r7)
            goto L85
        L9d:
            r5.b(r0, r1, r4)
            goto L85
        La1:
            r6.clear()
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aip.g():void");
    }
}

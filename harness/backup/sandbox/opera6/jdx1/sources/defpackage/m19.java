package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class m19 implements yb6 {
    public final /* synthetic */ byte a;
    public final Comparable b;
    public final Object c;
    public Object d;

    public /* synthetic */ m19(byte b, Comparable comparable, Object obj) {
        this.a = b;
        this.b = comparable;
        this.c = obj;
    }

    private final void b() {
    }

    private final void d() {
    }

    @Override // defpackage.yb6
    public final Class a() {
        switch (this.a) {
            case 0:
                return ((n19) this.c).a();
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.yb6
    public final void c() throws IOException {
        switch (this.a) {
            case 0:
                Object obj = this.d;
                if (obj != null) {
                    try {
                        ((n19) this.c).G(obj);
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // defpackage.yb6
    public final void cancel() {
        byte b = this.a;
    }

    @Override // defpackage.yb6
    public final void e(nyg nygVar, xb6 xb6Var) throws Throwable {
        switch (this.a) {
            case 0:
                try {
                    Object objR = ((n19) this.c).r((File) this.b);
                    this.d = objR;
                    xb6Var.g(objR);
                    break;
                } catch (FileNotFoundException e) {
                    xb6Var.d(e);
                    return;
                }
            default:
                try {
                    InputStream inputStreamG = g();
                    this.d = inputStreamG;
                    xb6Var.g(inputStreamG);
                    break;
                } catch (FileNotFoundException e2) {
                    xb6Var.d(e2);
                }
        }
    }

    @Override // defpackage.yb6
    public final int f() {
        byte b = this.a;
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.InputStream g() throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            java.lang.Object r1 = r10.c
            s9i r1 = (s9i) r1
            java.lang.Object r2 = r1.d
            android.content.ContentResolver r2 = (android.content.ContentResolver) r2
            java.lang.Comparable r10 = r10.b
            android.net.Uri r10 = (android.net.Uri) r10
            r3 = 3
            r4 = 0
            java.lang.Object r5 = r1.b     // Catch: java.lang.Throwable -> L2e java.lang.SecurityException -> L31
            nol r5 = (defpackage.nol) r5     // Catch: java.lang.Throwable -> L2e java.lang.SecurityException -> L31
            android.database.Cursor r5 = r5.e(r10)     // Catch: java.lang.Throwable -> L2e java.lang.SecurityException -> L31
            if (r5 == 0) goto L2c
            boolean r6 = r5.moveToFirst()     // Catch: java.lang.SecurityException -> L32 java.lang.Throwable -> Lbf
            if (r6 == 0) goto L29
            r6 = 0
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.SecurityException -> L32 java.lang.Throwable -> Lbf
            r5.close()
            goto L3e
        L29:
            r5.close()
        L2c:
            r6 = r4
            goto L3e
        L2e:
            r10 = move-exception
            goto Lc1
        L31:
            r5 = r4
        L32:
            boolean r6 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> Lbf
            if (r6 == 0) goto L3b
            java.util.Objects.toString(r10)     // Catch: java.lang.Throwable -> Lbf
        L3b:
            if (r5 == 0) goto L2c
            goto L29
        L3e:
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L85
            java.io.File r5 = new java.io.File
            r5.<init>(r6)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L85
            r6 = 0
            long r8 = r5.length()
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L85
            android.net.Uri r5 = android.net.Uri.fromFile(r5)
            java.io.InputStream r5 = r2.openInputStream(r5)     // Catch: java.lang.NullPointerException -> L62
            goto L86
        L62:
            r0 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "NPE opening uri: "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r10 = " -> "
            r2.append(r10)
            r2.append(r5)
            java.lang.String r10 = r2.toString()
            r1.<init>(r10)
            java.lang.Throwable r10 = r1.initCause(r0)
            java.io.FileNotFoundException r10 = (java.io.FileNotFoundException) r10
            throw r10
        L85:
            r5 = r4
        L86:
            r6 = -1
            if (r5 == 0) goto Lb5
            java.io.InputStream r4 = r2.openInputStream(r10)     // Catch: java.lang.Throwable -> L9f java.lang.Throwable -> Lae
            java.lang.Object r2 = r1.e     // Catch: java.lang.Throwable -> L9f java.lang.Throwable -> Lae
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L9f java.lang.Throwable -> Lae
            java.lang.Object r1 = r1.c     // Catch: java.lang.Throwable -> L9f java.lang.Throwable -> Lae
            jl6 r1 = (jl6) r1     // Catch: java.lang.Throwable -> L9f java.lang.Throwable -> Lae
            int r10 = defpackage.p37.I(r1, r4, r2)     // Catch: java.lang.Throwable -> L9f java.lang.Throwable -> Lae
            if (r4 == 0) goto Lb6
            r4.close()     // Catch: java.io.IOException -> Lb6
            goto Lb6
        L9f:
            boolean r0 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto La8
            java.util.Objects.toString(r10)     // Catch: java.lang.Throwable -> Lae
        La8:
            if (r4 == 0) goto Lb5
            r4.close()     // Catch: java.io.IOException -> Lb5
            goto Lb5
        Lae:
            r10 = move-exception
            if (r4 == 0) goto Lb4
            r4.close()     // Catch: java.io.IOException -> Lb4
        Lb4:
            throw r10
        Lb5:
            r10 = r6
        Lb6:
            if (r10 == r6) goto Lbe
            jh8 r0 = new jh8
            r0.<init>(r5, r10)
            r5 = r0
        Lbe:
            return r5
        Lbf:
            r10 = move-exception
            r4 = r5
        Lc1:
            if (r4 == 0) goto Lc6
            r4.close()
        Lc6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m19.g():java.io.InputStream");
    }
}

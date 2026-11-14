package defpackage;

import J.N;
import android.content.res.Resources;
import android.net.Uri;
import android.provider.DocumentsContract;
import com.opera.android.downloads.DownloadItem;
import com.opera.android.downloads.DownloadPauseManager;
import com.opera.api.Callback;
import java.io.File;

/* loaded from: classes.dex */
public final class re7 {
    public boolean A;
    public final xf7 a;
    public final int b;
    public String c;
    public Uri d;
    public Uri e;
    public int g;
    public boolean h;
    public long i;
    public long j;
    public long k;
    public long l;
    public final String m;
    public boolean n;
    public final long o;
    public String p;
    public long q;
    public long r;
    public final DownloadItem t;
    public int v;
    public boolean w;
    public cx3 x;
    public Callback y;
    public boolean z;
    public final h7f u = new h7f();
    public boolean s = false;
    public int f = 4;

    public re7(xf7 xf7Var, DownloadItem downloadItem, Uri uri, int i, int i2) {
        this.a = xf7Var;
        this.b = i2;
        this.e = uri;
        this.m = downloadItem.c();
        this.j = downloadItem.b();
        this.i = downloadItem.i();
        this.t = downloadItem;
        B(i, N.MNFDpvSY(xf7Var.b.a, downloadItem.getId()) != 0);
        this.o = downloadItem.getId() | (xf7Var.a() ? 4611686018427387904L : 0L);
        downloadItem.j(this);
    }

    public final void A(int i, int i2) {
        this.g = i2;
        if (this.f != i) {
            this.f = i;
            h7f h7fVar = this.u;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((qe7) g7fVarH.next()).a(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(int r13, boolean r14) {
        /*
            r12 = this;
            r0 = 3
            r1 = 2
            r2 = 30
            r3 = 15
            r4 = 1
            r5 = 0
            com.opera.android.downloads.DownloadItem r6 = r12.t
            if (r14 == 0) goto L1d
            xf7 r7 = r12.a
            com.opera.android.downloads.DownloadPauseManager r7 = r7.b
            long r8 = r6.getId()
            long r10 = r7.a
            int r7 = J.N.MNFDpvSY(r10, r8)
            if (r7 != r1) goto L2b
            goto L2d
        L1d:
            if (r13 != r0) goto L2b
            int r7 = r6.e()
            if (r7 == r3) goto L2d
            if (r7 == r2) goto L2d
            r8 = 31
            if (r7 == r8) goto L2d
        L2b:
            r7 = r5
            goto L2e
        L2d:
            r7 = r4
        L2e:
            r12.w = r7
            if (r13 != r4) goto L37
            r13 = 4
            r12.A(r13, r5)
            return
        L37:
            if (r14 == 0) goto L3d
            r12.A(r1, r5)
            return
        L3d:
            if (r13 == 0) goto L7f
            if (r13 == r1) goto L7b
            if (r13 == r0) goto L44
            return
        L44:
            int r13 = r6.e()
            boolean r14 = r6.l()
            if (r13 == r0) goto L6f
            if (r13 == r3) goto L6f
            r3 = 17
            if (r13 == r3) goto L6f
            r3 = 22
            if (r13 == r3) goto L6f
            r3 = 25
            if (r13 == r3) goto L6f
            r3 = 27
            if (r13 == r3) goto L6f
            r3 = 19
            if (r13 == r3) goto L6f
            r3 = 20
            if (r13 == r3) goto L6f
            r3 = 29
            if (r13 == r3) goto L6f
            if (r13 == r2) goto L6f
            r4 = r5
        L6f:
            if (r14 == 0) goto L77
            if (r4 != 0) goto L77
            r12.A(r1, r13)
            return
        L77:
            r12.A(r0, r13)
            return
        L7b:
            r12.A(r0, r5)
            return
        L7f:
            r12.A(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re7.B(int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0031 A[FALL_THROUGH, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C() {
        /*
            r3 = this;
            boolean r0 = r3.A
            r1 = 1
            if (r0 != 0) goto L31
            int r0 = r3.f
            r2 = 3
            if (r0 != r2) goto L2f
            com.opera.android.downloads.DownloadItem r3 = r3.t
            int r3 = r3.e()
            if (r3 == 0) goto L31
            if (r3 == r1) goto L31
            if (r3 == r2) goto L31
            r0 = 8
            if (r3 == r0) goto L31
            r0 = 11
            if (r3 == r0) goto L31
            r0 = 17
            if (r3 == r0) goto L31
            r0 = 25
            if (r3 == r0) goto L31
            switch(r3) {
                case 13: goto L31;
                case 14: goto L31;
                case 15: goto L31;
                default: goto L29;
            }
        L29:
            switch(r3) {
                case 19: goto L31;
                case 20: goto L31;
                case 21: goto L31;
                case 22: goto L31;
                default: goto L2c;
            }
        L2c:
            switch(r3) {
                case 27: goto L31;
                case 28: goto L31;
                case 29: goto L31;
                case 30: goto L31;
                case 31: goto L31;
                default: goto L2f;
            }
        L2f:
            r3 = 0
            return r3
        L31:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re7.C():boolean");
    }

    public final boolean a() {
        return e() != null && e().d();
    }

    public final void b() {
        if (this.f == 2 && !n()) {
            u();
        }
        w();
    }

    public final nc0 c() {
        int[][] iArr = lg7.a;
        String strH = rf7.h(this);
        switch (lg7.g(c5o.m().o(f(), strH)).ordinal()) {
            case 1:
                return nc0.e;
            case 2:
                return nc0.d;
            case 3:
                return nc0.c;
            case 4:
                return nc0.b;
            case 5:
                return nc0.g;
            case 6:
                return nc0.f;
            case 7:
                return nc0.i;
            case 8:
                return nc0.h;
            default:
                return nc0.j;
        }
    }

    public final String d(Resources resources) {
        int i = this.g;
        if (i != 0) {
            return resources.getString(i != 2 ? i != 12 ? i != 16 ? i != 18 ? i != 26 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? i != 9 ? i != 10 ? i != 23 ? i != 24 ? 2132018605 : 2132018669 : 2132018673 : 2132018654 : 2132018672 : 2132018658 : 2132018666 : 2132018661 : 2132018653 : 2132018674 : 2132018670 : 2132018664 : 2132018659 : 2132018663);
        }
        return null;
    }

    public final dd7 e() {
        Uri uriG = g();
        if (uriG == null) {
            return null;
        }
        return uriG.getScheme().equals("file") ? new bkh(new File(uriG.getPath())) : dd7.e(this.a.d.b, uriG);
    }

    public final String f() {
        String str = this.c;
        return str == null ? this.t.g() : str;
    }

    public final Uri g() {
        Uri uri;
        if (this.e == null && (uri = this.d) != null && this.c != null) {
            boolean zEquals = uri.getScheme().equals("file");
            Uri uri2 = this.d;
            if (zEquals) {
                this.e = uri2.buildUpon().appendPath(this.c).build();
            } else {
                try {
                    this.e = DocumentsContract.createDocument(this.a.d.b.getContentResolver(), DocumentsContract.buildDocumentUriUsingTree(uri2, DocumentsContract.getTreeDocumentId(uri2)), this.m, this.c);
                } catch (Exception unused) {
                }
            }
        }
        return this.e;
    }

    public final File h() {
        return s29.e(this.a.d.b);
    }

    public final boolean i() {
        return this.j > 0;
    }

    public final boolean j() {
        return m() || this.w;
    }

    public final boolean k() {
        return this.f == 4;
    }

    public final boolean l() {
        int i = this.f;
        return i == 4 || i == 3;
    }

    public final boolean m() {
        return this.f == 1;
    }

    public final boolean n() {
        if (this.f == 2) {
            return N.MNFDpvSY(this.a.b.a, this.t.getId()) == 3;
        }
        return false;
    }

    public final boolean o() {
        Uri uri = this.e;
        if (uri != null) {
            return uri.getScheme().equals("content");
        }
        Uri uri2 = this.d;
        if (uri2 != null) {
            return uri2.getScheme().equals("content");
        }
        return false;
    }

    public final boolean p() {
        if (this.n) {
            return !this.h || m();
        }
        return false;
    }

    public final boolean q() {
        return this.n && !this.h;
    }

    public final void r() {
        h7f h7fVar = this.u;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((qe7) g7fVarH.next()).e(this);
        }
        this.t.remove();
        this.y = null;
        this.f = 2;
        this.g = 0;
    }

    public final void s() {
        DownloadPauseManager downloadPauseManager = this.a.b;
        N.MUhg9A8g(downloadPauseManager.a, this.t.getId(), 1);
    }

    public final void t(qe7 qe7Var) {
        this.u.c(qe7Var);
    }

    public final void u() {
        this.v = 0;
        DownloadPauseManager downloadPauseManager = this.a.b;
        N.MCe2yFpu(downloadPauseManager.a, this.t.getId());
    }

    public final void v() {
        Uri uriG = g();
        if (uriG != null) {
            boolean zEquals = uriG.getScheme().equals("file");
            Callback callback = this.y;
            if (zEquals) {
                callback.run(uriG.getPath());
            } else {
                callback.run(uriG.toString());
            }
        } else {
            this.y.run("");
        }
        this.y = null;
    }

    public final void w() {
        this.n = true;
        if (this.y == null) {
            this.z = true;
        } else {
            v();
        }
        h7f h7fVar = this.u;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((qe7) g7fVarH.next()).c(this);
        }
    }

    public final void x(String str) {
        if (str.equals(this.c)) {
            return;
        }
        this.t.a(str);
        this.c = str;
        this.e = null;
    }

    public final void y(int i) {
        Uri uriFromFile = Uri.fromFile(h());
        if (!uriFromFile.equals(this.d)) {
            this.d = uriFromFile;
            this.e = null;
        }
        this.t.o(i);
        this.h = true;
    }

    public final void z(boolean z) {
        if (this.A != z) {
            this.A = z;
            h7f h7fVar = this.u;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((qe7) g7fVarH.next()).d(this);
            }
        }
    }
}

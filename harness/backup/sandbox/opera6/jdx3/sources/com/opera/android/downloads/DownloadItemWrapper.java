package com.opera.android.downloads;

import J.N;
import defpackage.g7f;
import defpackage.h7f;
import defpackage.qe7;
import defpackage.re7;
import defpackage.sle;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public class DownloadItemWrapper implements DownloadItem {
    public long a;
    public final h7f b = new h7f();
    public byte c = 0;

    public DownloadItemWrapper(long j) {
        this.a = j;
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final void a(String str) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.MxRxyxjm(j, str);
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final long b() {
        long j = this.a;
        if (j == 0) {
            return 0L;
        }
        return N.MGRXh7P_(j);
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final String c() {
        long j = this.a;
        return j == 0 ? "" : (String) N.MY2A$B8A(j);
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final void cancel() {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.MibYHGiY(j, false);
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final void d(String str) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.Mb4IY7ak(j, str);
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final int e() {
        long j = this.a;
        if (j == 0) {
            return 0;
        }
        return N.MlyMuNZ_(j);
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final WebContents f() {
        long j = this.a;
        if (j == 0) {
            return null;
        }
        return (WebContents) N.Mt8u9gXm(j);
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final String g() {
        long j = this.a;
        return j == 0 ? "" : (String) N.MSDDruyz(j);
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final long getId() {
        long j = this.a;
        if (j == 0) {
            return 0L;
        }
        return N.MsCG5nFy(j);
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final int getState() {
        long j = this.a;
        if (j == 0) {
            return 0;
        }
        return N.MZJBKWfH(j);
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final String getUrl() {
        long j = this.a;
        return j == 0 ? "" : (String) N.Mi9OoezY(j);
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final String h() {
        long j = this.a;
        return j == 0 ? "" : (String) N.MYqjgXx_(j);
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final long i() {
        long j = this.a;
        if (j == 0) {
            return 0L;
        }
        return N.Mim06BuT(j);
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final boolean j(re7 re7Var) {
        return this.b.b(re7Var);
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final long k() {
        long j = this.a;
        if (j == 0) {
            return 0L;
        }
        return N.M6ybzcxh(j);
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final boolean l() {
        long j = this.a;
        if (j == 0) {
            return false;
        }
        return N.MTk8hRbC(j);
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final int m() {
        return this.c;
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final long n() {
        long j = this.a;
        if (j == 0) {
            return 0L;
        }
        return N.MBn5fRYt(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.downloads.DownloadItem
    public final void o(int i) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        this.c = i;
        N.MTYRKIE2(j);
    }

    public final void onDestroyed() {
        this.a = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStateChanged(int r26) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.downloads.DownloadItemWrapper.onStateChanged(int):void");
    }

    public final void onUpdated(long j, long j2, long j3) {
        g7f g7fVar = new g7f(this.b);
        while (g7fVar.hasNext()) {
            re7 re7Var = (re7) g7fVar.next();
            long j4 = re7Var.i;
            if (j > j4) {
                long j5 = j - j4;
                int iC = sle.c();
                if (iC == 3 || iC == 4 || iC == 5 || iC == 8) {
                    re7Var.r += j5;
                } else {
                    re7Var.q += j5;
                }
            }
            re7Var.i = j;
            re7Var.j = j2;
            re7Var.k = j3;
            if (j3 > re7Var.l) {
                re7Var.l = j3;
            }
            h7f h7fVar = re7Var.u;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((qe7) g7fVarH.next()).b(re7Var);
            }
        }
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final String p() {
        long j = this.a;
        return j == 0 ? "" : (String) N.MFbAnp5O(j);
    }

    @Override // com.opera.android.downloads.DownloadItem
    public final void remove() {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.MtU6MpDb(j);
    }
}

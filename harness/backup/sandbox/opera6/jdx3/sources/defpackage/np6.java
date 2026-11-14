package defpackage;

import J.N;
import android.graphics.Bitmap;
import com.opera.android.favorites.FavoritesBridge;
import com.opera.android.favorites.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class np6 {
    public final e84 a;
    public final td2 b;
    public final pp6 c;
    public final qfb d;
    public final long e;
    public final String f;
    public final String g;
    public String h;
    public Bitmap i;
    public final ArrayList j = new ArrayList();
    public int k = 2;

    public np6(e84 e84Var, td2 td2Var, pp6 pp6Var, qfb qfbVar, hq8 hq8Var) {
        this.a = e84Var;
        this.b = td2Var;
        this.c = pp6Var;
        this.d = qfbVar;
        this.e = hq8Var.e();
        this.f = hq8Var.i(p6l.a);
        this.g = hq8Var.c();
        this.h = hq8Var.h();
    }

    public final void a() {
        if (this.k == 0) {
            hq8 hq8VarG = nr8.g(new rh2(this.e), ((e) this.d.b).f);
            String str = this.g;
            e84 e84Var = this.a;
            if (hq8VarG == null) {
                e84Var.b(str);
                return;
            }
            ArrayList arrayList = this.j;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((op6) obj).a) {
                        return;
                    }
                }
            }
            e84Var.b(str);
            String str2 = this.h;
            Bitmap bitmap = this.i;
            if (!str2.isEmpty() && bitmap == null) {
                if (str2.equals(hq8VarG.h())) {
                    return;
                }
                hq8VarG.q(str2);
            } else if (bitmap != null) {
                N.MwmLujL6(bitmap, str2, wqm.b("https://", wqm.C(hq8VarG.i(p6l.a))).g());
                long jE = hq8VarG.e();
                i7f i7fVar = FavoritesBridge.a;
                N.MzRSq0ia(jE, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r11) {
        /*
            r10 = this;
            java.lang.String r8 = r10.f
            java.lang.String r9 = z7h.l(r8)
            java.lang.String r0 = r10.h
            int r0 = r0.length()
            if (r0 != 0) goto L32
            r2 r0 = new r2
            r6 = 0
            r7 = 26
            r1 = 1
            java.lang.Class<np6> r3 = defpackage.np6.class
            java.lang.String r4 = "onTitleFetched"
            java.lang.String r5 = "onTitleFetched(Lcom/opera/android/utilities/Either;)V"
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            td2 r1 = r10.b
            umi r1 = r1.a
            p6l r3 = defpackage.p6l.a
            qe6 r4 = new qe6
            r2 = 2
            r4.<init>(r0, r2)
            com.opera.android.browser.b r0 = new com.opera.android.browser.b
            r5 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            goto L38
        L32:
            int r0 = r10.k
            int r0 = r0 + (-1)
            r10.k = r0
        L38:
            if (r11 != 0) goto L73
            a36 r0 = defpackage.hk6.e
            r0.getClass()
            boolean r0 = a36.p(r8)
            if (r0 != 0) goto L73
            boolean r0 = z5i.a0(r8)
            if (r0 != 0) goto L73
            r2 r0 = new r2
            r6 = 0
            r7 = 27
            r1 = 1
            java.lang.Class<np6> r3 = defpackage.np6.class
            java.lang.String r4 = "onIconFetched"
            java.lang.String r5 = "onIconFetched(Lcom/opera/android/utilities/Either;)V"
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            pp6 r1 = r10.c
            android.content.Context r4 = r1.a
            iu2 r6 = new iu2
            r1 = 26
            r6.<init>(r0, r1)
            com.opera.android.favorites.SpeedDialDataFetcher r0 = new com.opera.android.favorites.SpeedDialDataFetcher
            r1 = 0
            int r5 = defpackage.nr8.e(r4)
            r3 = 2
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L79
        L73:
            int r0 = r10.k
            int r0 = r0 + (-1)
            r10.k = r0
        L79:
            r10.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np6.b(boolean):void");
    }
}

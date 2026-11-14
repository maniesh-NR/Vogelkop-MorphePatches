package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.opera.android.OperaApplication;
import java.util.Objects;

/* loaded from: classes.dex */
public final class py implements Runnable {
    public final bi a;
    public final Uri.Builder b;
    public final oy c;
    public final ry d;
    public final /* synthetic */ i5o e;
    public final /* synthetic */ i5o f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ i5o h;

    public py(i5o i5oVar, Uri.Builder builder, oy oyVar, ry ryVar) {
        Objects.requireNonNull(i5oVar);
        this.f = i5oVar;
        this.e = i5oVar;
        this.b = builder;
        this.c = oyVar;
        this.a = new bi(this, (byte) 14);
        this.d = ryVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public py(i5o i5oVar, Uri.Builder builder, qy qyVar, bi biVar) {
        this(i5oVar, builder, (oy) qyVar, (ry) biVar);
        this.g = (byte) 1;
        Objects.requireNonNull(i5oVar);
        this.h = i5oVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public py(i5o i5oVar, Uri.Builder builder, qy qyVar, zx zxVar) {
        this(i5oVar, builder, (oy) qyVar, (ry) zxVar);
        this.g = (byte) 0;
        Objects.requireNonNull(i5oVar);
        this.h = i5oVar;
    }

    public final void a() {
        i5o i5oVar = this.f;
        String str = (String) ((esk) i5oVar.h).get();
        String[] strArr = aik.a;
        if (str == null) {
            str = "";
        }
        bi biVar = this.a;
        biVar.i("gaid", str);
        biVar.i("adoptout", yi4.m((Context) i5oVar.d) ? "false" : "true");
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x011b A[PHI: r9
      0x011b: PHI (r9v1 int) = (r9v0 int), (r9v2 int) binds: [B:14:0x0110, B:18:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py.b():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.g;
        bi biVar = this.a;
        i5o i5oVar = this.h;
        switch (b) {
            case 0:
                Context context = (Context) i5oVar.d;
                String[] strArr = OperaApplication.K;
                long j = ((SharedPreferences) ((ete) ((OperaApplication) context.getApplicationContext()).r.f0.get()).b.get()).getLong("last_session", -1L);
                if (j != -1) {
                    biVar.i("last_news_session_time", String.valueOf(j / 1000));
                }
                a();
                break;
            default:
                biVar.i("newsProvider", (String) i5oVar.n);
                biVar.i("newsLanguageCode", (String) i5oVar.m);
                if (!"zz".equals((String) i5oVar.l)) {
                    biVar.i("newsCountryCode", (String) i5oVar.l);
                }
                a();
                break;
        }
    }
}

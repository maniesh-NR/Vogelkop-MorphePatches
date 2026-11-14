package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;
import java.util.Locale;

/* loaded from: classes.dex */
public final class jvl extends bwf {
    public final Context a;
    public l0c b;

    public jvl(Context context, p0c p0cVar) {
        this.a = context.getApplicationContext();
        o0c o0cVar = new o0c() { // from class: ivl
            @Override // defpackage.o0c
            public final void p(l0c l0cVar) {
                this.a.b = l0cVar;
            }
        };
        p0cVar.c.b(o0cVar);
        o0cVar.p(p0cVar.d);
    }

    @Override // defpackage.bwf
    public final String b() {
        String[] strArr = OperaApplication.K;
        Context contextH = this.a;
        fue fueVarZ = ((OperaApplication) contextH.getApplicationContext()).z();
        fueVarZ.d();
        int i = fueVarZ.a == cue.NewsFeed ? 2132019999 : 2132020016;
        Locale locale = Locale.getDefault();
        l0c l0cVar = this.b;
        Locale localeB = l0cVar == null ? locale : l0cVar.b();
        if (!locale.equals(localeB)) {
            contextH = wwc.h(contextH, localeB);
        }
        return contextH.getString(i);
    }
}

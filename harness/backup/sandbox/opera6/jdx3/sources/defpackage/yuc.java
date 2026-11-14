package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class yuc implements q8j {
    public final /* synthetic */ zuc a;

    public yuc(zuc zucVar) {
        this.a = zucVar;
    }

    @Override // defpackage.q8j
    public final void a() {
        zuc zucVar = this.a;
        if (zucVar.g != this) {
            return;
        }
        Context context = zucVar.d.getContext();
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).y().c().g(zucVar.g);
    }

    @Override // defpackage.q8j
    public final void c(Object obj) {
        bre breVar;
        nre nreVar = (nre) obj;
        zuc zucVar = this.a;
        if (zucVar.g != this || nreVar == null || nreVar.c == null || (breVar = nreVar.g) == null) {
            return;
        }
        zucVar.e.setText(x77.h(breVar));
        zucVar.f.b = new x77(nreVar);
    }
}

package defpackage;

import com.opera.android.settings.SettingsManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j6g implements ywk {
    public final db a;
    public final SettingsManager b;
    public final zwk c;
    public final e6g d;
    public i6g e;

    public j6g(db dbVar, SettingsManager settingsManager, zwk zwkVar, e6g e6gVar) {
        this.a = dbVar;
        this.b = settingsManager;
        this.c = zwkVar;
        this.d = e6gVar;
        boolean zA = a();
        zwkVar.getClass();
        this.e = new i6g(zA, zwk.c(3));
    }

    @Override // defpackage.ywk
    public final void G(int i) {
    }

    public final boolean a() {
        db dbVar = this.a;
        return dbVar.f() && this.b.i("enable_sync") && !xgh.s(dbVar, this.c);
    }

    @Override // defpackage.ywk
    public final void e(boolean z) {
        boolean zA = a();
        this.c.getClass();
        i6g i6gVar = new i6g(zA, zwk.c(3));
        if (Intrinsics.a(this.e, i6gVar)) {
            return;
        }
        this.e = i6gVar;
        this.d.invoke();
    }
}

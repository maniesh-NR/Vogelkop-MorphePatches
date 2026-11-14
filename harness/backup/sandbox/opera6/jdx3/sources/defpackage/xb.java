package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class xb {
    public final db a;
    public final zwk b;
    public final SettingsManager c;
    public final kze d;
    public final jze e;

    public xb(db dbVar, zwk zwkVar, SettingsManager settingsManager) {
        kze kzeVar = new kze(epf.a);
        this.d = kzeVar;
        jze jzeVar = new jze(new dpf((ipf) kzeVar.g()));
        this.e = jzeVar;
        this.a = dbVar;
        this.b = zwkVar;
        this.c = settingsManager;
        jzeVar.l.s(kzeVar, new k9((Object) this, (byte) 1));
        wb wbVar = new wb(new c4(this, (byte) 4));
        dbVar.a(wbVar);
        zwkVar.F(wbVar);
        settingsManager.F(wbVar);
        b();
    }

    public final int a() {
        db dbVar = this.a;
        boolean zF = dbVar.f();
        boolean zS = xgh.s(dbVar, this.b);
        boolean z = zF && !this.c.i("enable_sync");
        if (zS || z) {
            return 2;
        }
        return zF ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb.b():void");
    }
}

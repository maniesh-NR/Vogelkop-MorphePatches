package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class teg implements zy {
    public final /* synthetic */ zy a;
    public final /* synthetic */ az b;
    public final /* synthetic */ ueg c;

    public teg(ueg uegVar, zy zyVar, az azVar) {
        this.a = zyVar;
        this.b = azVar;
        this.c = uegVar;
    }

    @Override // defpackage.zy
    public final boolean a(yz yzVar) {
        return this.a.a(yzVar);
    }

    @Override // defpackage.zy
    public final void b(yz yzVar) {
        this.a.b(yzVar);
    }

    @Override // defpackage.zy
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.zy
    public final void onFailed(String str) {
        az azVar = this.b;
        ueg uegVar = this.c;
        yz yzVarM = uegVar.m(azVar);
        zy zyVar = this.a;
        if (yzVarM != null) {
            if (zyVar.a(yzVarM)) {
                return;
            }
            yzVarM.b();
            return;
        }
        Locale locale = Locale.US;
        zyVar.onFailed("pid=" + uegVar.d.c + "\n" + str);
    }
}

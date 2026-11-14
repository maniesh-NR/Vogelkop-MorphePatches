package defpackage;

import com.opera.android.autofill.PasswordManager;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class m6g extends j93 {
    public final ot2 d;
    public final hxk e;
    public final k6g f;
    public final PasswordManager g;
    public final x5g h;
    public final yu2 i;
    public final ysj j;
    public final n6g k;
    public final ru9 l;
    public final jvg m;
    public boolean n;

    public m6g(gjm gjmVar, ot2 ot2Var, d8j d8jVar, hxk hxkVar, SettingsManager settingsManager, k6g k6gVar, PasswordManager passwordManager, x5g x5gVar, yu2 yu2Var, ysj ysjVar, n6g n6gVar, ru9 ru9Var) {
        super(settingsManager, d8jVar);
        this.d = ot2Var;
        this.e = hxkVar;
        this.f = k6gVar;
        this.g = passwordManager;
        this.h = x5gVar;
        this.i = yu2Var;
        this.j = ysjVar;
        this.k = n6gVar;
        this.l = ru9Var;
        this.m = new jvg(this, gjmVar);
    }

    public final void g() {
        this.f.a();
    }
}

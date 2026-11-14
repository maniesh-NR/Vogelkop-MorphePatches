package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import com.opera.android.Lazy;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.settings.SettingsManager;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class hq3 extends s62 {
    public final hv F;
    public final Uri G;
    public final rii H;
    public final yyn I;

    public hq3(WebContentsWrapper webContentsWrapper, a12 a12Var, wth wthVar, l02 l02Var, h62 h62Var, f62 f62Var, hv hvVar, Uri uri, SettingsManager settingsManager, rii riiVar, Lazy lazy, g7m g7mVar, p12 p12Var, wyn wynVar, ky1 ky1Var, yk6 yk6Var, a52 a52Var, qb qbVar, g62 g62Var, r2 r2Var, yv3 yv3Var) {
        super(t62.a, webContentsWrapper, a12Var, wthVar, l02Var, h62Var, f62Var, settingsManager, lazy, g7mVar, p12Var, wynVar, ky1Var, yk6Var, a52Var, qbVar, g62Var, new f32((byte) 29), r2Var, yv3Var);
        this.F = hvVar;
        this.G = uri;
        this.H = riiVar;
        this.I = (yyn) new agm(webContentsWrapper.c()).c;
        n();
        j();
    }

    public static final Unit o(hq3 hq3Var, Boolean bool) {
        if (bool.booleanValue()) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) ((a12) hq3Var.H.b).b.get()).edit();
            editorEdit.putString("ofa-migration-version", String.valueOf(0));
            editorEdit.apply();
            super.n();
        }
        return Unit.a;
    }

    @Override // defpackage.s62
    public final void b(l62 l62Var) {
        ksc kscVar = new ksc(this.G.toString(), 0);
        WebContentsWrapper webContentsWrapper = this.b;
        new stn(webContentsWrapper, l62Var);
        webContentsWrapper.d().r(kscVar);
    }

    @Override // defpackage.s62
    public final ikc g() {
        return this.I;
    }

    @Override // defpackage.s62
    public final void n() {
        if (this.H.j()) {
            ((kze) ((qb7) this.F.invoke()).c).j(this, new pb(new bo3(this, (byte) 5), (byte) 26));
        } else {
            super.n();
        }
    }
}

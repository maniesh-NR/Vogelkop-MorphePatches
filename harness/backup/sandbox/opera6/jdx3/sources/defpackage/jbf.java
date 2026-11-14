package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public final class jbf extends no7 {
    public static final ir5 k = new ir5();

    public static jbf t(Context context) {
        return (jbf) no7.n(context, io7.m, k);
    }

    @Override // defpackage.no7
    public final Object h() {
        return new ibf();
    }

    @Override // defpackage.no7
    public final Object k(izd izdVar) {
        return new ibf(izdVar);
    }

    @Override // defpackage.no7
    public final Object q(byte[] bArr) {
        return new ibf(new izd(new ByteArrayInputStream(bArr)));
    }

    @Override // defpackage.no7
    public final void r(Object obj) {
        ibf ibfVar = (ibf) obj;
        String[] strArr = OperaApplication.K;
        SettingsManager settingsManagerJ = ((OperaApplication) this.a.getApplicationContext()).J();
        if (settingsManagerJ.J()) {
            settingsManagerJ.R(ibfVar.a(1024) ? 1 : 0, "enable_frequently_visited_sites");
        }
    }
}

package defpackage;

import android.content.SharedPreferences;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class sdf {
    public final SettingsManager a;
    public final udf b;
    public final vx c;
    public final r65 d;

    public sdf(nx5 nx5Var, SettingsManager settingsManager, udf udfVar, cq5 cq5Var, r65 r65Var) {
        vx vxVar = new vx(cq5Var, (byte) 28);
        this.a = settingsManager;
        this.b = udfVar;
        this.c = vxVar;
        this.d = r65Var;
        j14.Y(new z99(cq5Var, new bz1((byte) 21, null, this), (byte) 2), nx5Var);
    }

    public final int a() {
        return wyh.K(((SharedPreferences) this.b.a.get()).getInt("pending.consents", 0));
    }

    public final int b() {
        return wyh.K(((SharedPreferences) this.b.a.get()).getInt("processed.consents", 0));
    }

    public final void c(int i) {
        int iK = wyh.K(i);
        int iB = b() | iK;
        int iA = a() & (~iK);
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.b.a.get()).edit();
        editorEdit.putInt("processed.consents", iB);
        editorEdit.putInt("pending.consents", iA);
        editorEdit.apply();
    }
}

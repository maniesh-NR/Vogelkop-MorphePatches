package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p0c {
    public final bqe a;
    public final SettingsManager b;
    public final i7f c = new i7f();
    public l0c d;
    public final ud7 e;
    public final s9 f;

    public p0c(bqe bqeVar, SettingsManager settingsManager) {
        ud7 ud7Var = new ud7(this, (byte) 1);
        this.e = ud7Var;
        s9 s9Var = new s9(this, (byte) 18);
        this.f = s9Var;
        this.a = bqeVar;
        this.b = settingsManager;
        bqeVar.F(ud7Var);
        settingsManager.F(s9Var);
    }

    public final void a() {
        l0c l0cVarV = this.b.v();
        if (l0cVarV == null) {
            l0cVarV = ((cqe) this.a.i()).a;
        }
        if (Objects.equals(this.d, l0cVarV)) {
            return;
        }
        this.d = l0cVarV;
        i7f i7fVar = this.c;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            ((o0c) g7fVarC.next()).p(this.d);
        }
    }
}

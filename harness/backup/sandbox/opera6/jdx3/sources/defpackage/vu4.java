package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.Collection;

/* loaded from: classes.dex */
public final class vu4 extends mqk {
    public final /* synthetic */ byte j = 1;
    public final Object k;

    public vu4(SettingsManager settingsManager, iv7 iv7Var, qde qdeVar, ndc ndcVar, nqi nqiVar, ibf ibfVar) {
        super(kqk.r, "enable_suggested_speed_dials", settingsManager, iv7Var, qdeVar, ndcVar, nqiVar);
        this.k = ibfVar;
    }

    public vu4(SettingsManager settingsManager, iv7 iv7Var, qde qdeVar, ndc ndcVar, nqi nqiVar, wih wihVar) {
        super(kqk.o, "enable_suggestion_provider_ai_prompts", settingsManager, iv7Var, qdeVar, ndcVar, nqiVar);
        this.k = wihVar;
    }

    @Override // defpackage.mqk
    public final boolean a() {
        byte b = this.j;
        Object obj = this.k;
        switch (b) {
            case 0:
                if (super.a() && this.d.b() && !((Collection) ((wih) obj).b.g()).isEmpty()) {
                    break;
                }
                break;
            default:
                if (((ibf) obj).a(2048) && super.a()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.mqk
    public final boolean b() {
        switch (this.j) {
            case 0:
                return true;
            default:
                return super.b();
        }
    }

    @Override // defpackage.mqk
    public final boolean d() {
        switch (this.j) {
            case 0:
                return false;
            default:
                return super.d();
        }
    }

    @Override // defpackage.mqk
    public final void f() {
        switch (this.j) {
            case 0:
                super.f();
                ((wih) this.k).b.j(this.f, new t7d(new bo3(this, (byte) 18), (byte) 22));
                break;
            default:
                super.f();
                break;
        }
    }
}

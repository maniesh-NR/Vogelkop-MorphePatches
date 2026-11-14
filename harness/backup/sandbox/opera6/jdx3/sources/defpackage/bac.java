package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class bac implements k9k {
    public final Activity a;
    public final m9c b;
    public boolean d;
    public final kze c = new kze(Boolean.FALSE);
    public final aac e = new aac(this);

    public bac(Activity activity, m9c m9cVar) {
        this.a = activity;
        this.b = m9cVar;
    }

    @Override // defpackage.k9k
    public final ize a() {
        return this.c;
    }

    @Override // defpackage.k9k
    public final void b(boolean z) {
        kze kzeVar = this.c;
        if (((Boolean) kzeVar.g()).booleanValue()) {
            return;
        }
        m9c m9cVar = this.b;
        i7f i7fVar = m9cVar.d;
        if (i7fVar.c(this.e) && i7fVar.c == 0) {
            ((SharedPreferences) m9cVar.b.get()).unregisterOnSharedPreferenceChangeListener(m9cVar.e);
        }
        kzeVar.r(Boolean.TRUE);
    }

    public final void c() {
        kze kzeVar = this.c;
        if (((Boolean) kzeVar.g()).booleanValue()) {
            return;
        }
        String[] strArr = OperaApplication.K;
        Activity activity = this.a;
        ((OperaApplication) activity.getApplication()).W(activity);
        kzeVar.r(Boolean.TRUE);
    }

    @Override // defpackage.k9k
    public final void start() {
        if (this.d) {
            return;
        }
        this.d = true;
        m9c m9cVar = this.b;
        if (m9cVar.a() != null) {
            c();
            return;
        }
        i7f i7fVar = m9cVar.d;
        if (i7fVar.b(this.e) && i7fVar.c == 1) {
            ((SharedPreferences) m9cVar.b.get()).registerOnSharedPreferenceChangeListener(m9cVar.e);
        }
    }
}

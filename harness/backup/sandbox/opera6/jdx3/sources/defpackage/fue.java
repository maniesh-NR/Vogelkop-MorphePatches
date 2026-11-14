package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.opera.android.annotations.WeakOwner;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class fue {
    public l1c b;

    @NonNull
    @WeakOwner
    private final eue c;
    public final b59 d;
    public final SettingsManager f;
    public cue a = cue.None;
    public final h7f e = new h7f();

    public fue(Context context, fqe fqeVar, SettingsManager settingsManager) {
        this.d = w1h.l(context, vml.d, "news_source_tracker", new bg1[0]);
        this.f = settingsManager;
        settingsManager.F(new s9(this, (byte) 25));
        eue eueVar = new eue(fqeVar, this);
        this.c = eueVar;
        fqeVar.a(eueVar);
    }

    public static cue c(Context context) {
        cue cueVarD = cue.d(context.getSharedPreferences("news_source_tracker", 0).getInt("last_active_news_source", 0));
        return cueVarD == null ? cue.None : cueVarD;
    }

    public final void b(due dueVar) {
        this.e.b(dueVar);
    }

    public final void d() {
        boolean zI = this.f.i("news_is_blocked_by_personalization_change");
        l1c l1cVar = this.b;
        cue cueVar = cue.None;
        if (l1cVar != null && !zI && l1cVar.b.contains(l1cVar.c)) {
            cueVar = cue.NewsFeed;
        }
        if (this.a == cueVar) {
            return;
        }
        this.a = cueVar;
        ((SharedPreferences) this.d.get()).edit().putInt("last_active_news_source", cueVar.a).apply();
        h7f h7fVar = this.e;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((due) g7fVarH.next()).b(cueVar);
        }
        ac8.a(new r16());
    }

    public final void e(due dueVar) {
        this.e.c(dueVar);
    }
}

package defpackage;

import com.opera.android.favorites.PushedSpeedDialFavorite;
import com.opera.android.suggestion.Suggestion;

/* loaded from: classes.dex */
public final class wqi implements odb {
    public final qdh a;

    public wqi(qdh qdhVar) {
        this.a = qdhVar;
    }

    public final void a(Suggestion suggestion) {
        Object obj = suggestion.k;
        if (obj instanceof PushedSpeedDialFavorite) {
            this.a.b(((PushedSpeedDialFavorite) obj).e);
        }
    }

    public final void b(Suggestion suggestion) {
        Object obj = suggestion.k;
        if (obj instanceof PushedSpeedDialFavorite) {
            tqi tqiVar = ((PushedSpeedDialFavorite) obj).e;
            qdh qdhVar = this.a;
            qdhVar.getClass();
            qdhVar.a(tqiVar, idh.a);
        }
    }

    public final void reset() {
        this.a.c.clear();
    }
}

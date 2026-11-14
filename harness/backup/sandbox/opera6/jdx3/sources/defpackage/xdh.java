package defpackage;

import com.opera.android.favorites.PushedSpeedDialFavorite;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class xdh extends o63 {
    public final qdh f;
    public final skm g;

    public xdh(qdh qdhVar, skm skmVar) {
        this.f = qdhVar;
        this.g = skmVar;
    }

    @Override // defpackage.o63
    public final void h(hq8 hq8Var) {
        if (hq8Var != null) {
            if (hq8Var instanceof PushedSpeedDialFavorite) {
                PushedSpeedDialFavorite pushedSpeedDialFavorite = (PushedSpeedDialFavorite) hq8Var;
                this.f.b(pushedSpeedDialFavorite.e);
                sfe.u0(this.g, pushedSpeedDialFavorite.e, sfe.W(pushedSpeedDialFavorite), 0L, 1);
                return;
            }
            if (hq8Var instanceof kdh) {
                ArrayList arrayList = ((kdh) hq8Var).e;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    hq8 hq8Var2 = (hq8) obj;
                    if (hq8Var2 instanceof PushedSpeedDialFavorite) {
                        PushedSpeedDialFavorite pushedSpeedDialFavorite2 = (PushedSpeedDialFavorite) hq8Var2;
                        sfe.u0(this.g, pushedSpeedDialFavorite2.e, sfe.W(pushedSpeedDialFavorite2), 0L, 5);
                    }
                }
            }
        }
    }
}

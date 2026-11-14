package defpackage;

import com.opera.android.favorites.PushedSpeedDialFavorite;

/* loaded from: classes.dex */
public final /* synthetic */ class qpm implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cbk b;
    public final /* synthetic */ PushedSpeedDialFavorite c;

    public /* synthetic */ qpm(cbk cbkVar, PushedSpeedDialFavorite pushedSpeedDialFavorite, byte b) {
        this.a = b;
        this.b = cbkVar;
        this.c = pushedSpeedDialFavorite;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        PushedSpeedDialFavorite pushedSpeedDialFavorite = this.c;
        cbk cbkVar = this.b;
        switch (b) {
            case 0:
                ((qdh) ((lgf) cbkVar.e).h).b(pushedSpeedDialFavorite.e);
                break;
            default:
                lgf lgfVar = (lgf) cbkVar.e;
                qdh qdhVar = (qdh) lgfVar.h;
                tqi tqiVar = pushedSpeedDialFavorite.e;
                qdhVar.getClass();
                qdhVar.a(tqiVar, idh.a);
                ((cul) lgfVar.i).c(pushedSpeedDialFavorite);
                break;
        }
    }
}

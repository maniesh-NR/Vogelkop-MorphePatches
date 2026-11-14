package defpackage;

import com.opera.android.media.PlayerContainerView;
import com.opera.android.media.PlayerService;

/* loaded from: classes.dex */
public final class we7 extends hkg {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    public we7(Object obj, eig eigVar, byte b) {
        this.c = b;
        this.d = obj;
        this.b = eigVar;
    }

    @Override // defpackage.hkg
    public final void d(gig gigVar) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((ze7) obj).K();
                break;
            case 1:
                ((zkd) obj).T();
                break;
            case 2:
                ((gld) obj).J0();
                break;
            case 3:
                ((se3) ((p12) obj).h).d();
                break;
            case 4:
                ((zld) obj).H();
                break;
            case 5:
                int i = PlayerContainerView.k;
                ((PlayerContainerView) obj).f();
                break;
            case 6:
                ((akg) obj).w();
                break;
            case 7:
                ((se3) ((hd) obj).e).d();
                break;
            default:
                PlayerService playerService = (PlayerService) obj;
                playerService.c.P(gigVar.e0());
                gkg gkgVar = playerService.b;
                if (gkgVar != null) {
                    gkgVar.b(new rkg(playerService, gigVar));
                    break;
                }
                break;
        }
    }
}

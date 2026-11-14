package defpackage;

import android.os.SystemClock;
import com.opera.android.live_score.LiveCommentaryService;

/* loaded from: classes.dex */
public final class vjc implements eig {
    public final /* synthetic */ LiveCommentaryService a;

    public vjc(LiveCommentaryService liveCommentaryService) {
        this.a = liveCommentaryService;
    }

    public final void F(rhg rhgVar) {
        nak nakVar = cs6.c;
        LiveCommentaryService liveCommentaryService = this.a;
        String str = liveCommentaryService.f;
        if (str == null) {
            str = "";
        }
        String message = rhgVar.getMessage();
        if (message == null) {
            message = "Playback error";
        }
        wjc wjcVar = new wjc(str, message);
        nakVar.getClass();
        nakVar.k((Object) null, wjcVar);
        liveCommentaryService.stopSelf();
    }

    public final void P(boolean z) {
        LiveCommentaryService liveCommentaryService = this.a;
        if (z) {
            liveCommentaryService.j = SystemClock.elapsedRealtime();
            liveCommentaryService.k = true;
            nak nakVar = cs6.c;
            String str = liveCommentaryService.f;
            zjc zjcVar = new zjc(str != null ? str : "");
            nakVar.getClass();
            nakVar.k((Object) null, zjcVar);
            return;
        }
        if (liveCommentaryService.k) {
            liveCommentaryService.i = (SystemClock.elapsedRealtime() - liveCommentaryService.j) + liveCommentaryService.i;
            liveCommentaryService.k = false;
            ujc ujcVar = liveCommentaryService.a;
            if ((ujcVar != null ? Integer.valueOf(((gk9) ujcVar).b.getPlaybackState()) : null) != null) {
                ujc ujcVar2 = liveCommentaryService.a;
                if (ujcVar2 == null || ((gk9) ujcVar2).b.getPlaybackState() != 4) {
                    ujc ujcVar3 = liveCommentaryService.a;
                    if ((ujcVar3 != null ? ((gk9) ujcVar3).b.s() : null) == null) {
                        nak nakVar2 = cs6.c;
                        String str2 = liveCommentaryService.f;
                        yjc yjcVar = new yjc(str2 != null ? str2 : "");
                        nakVar2.getClass();
                        nakVar2.k((Object) null, yjcVar);
                    }
                }
            }
        }
    }

    public final void h(int i) {
        if (i == 4) {
            nak nakVar = cs6.c;
            nakVar.getClass();
            nakVar.k((Object) null, xjc.a);
            this.a.stopSelf();
        }
    }
}

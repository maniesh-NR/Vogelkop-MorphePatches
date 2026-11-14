package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class vkg implements eig, View.OnClickListener {
    public final dql a = new dql();
    public Object b;
    public final /* synthetic */ PlayerView c;

    public vkg(PlayerView playerView) {
        this.c = playerView;
    }

    @Override // defpackage.eig
    public final void E(y36 y36Var) {
        SubtitleView subtitleView = this.c.h;
        if (subtitleView != null) {
            List list = y36Var.a;
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            subtitleView.a = list;
            subtitleView.a();
        }
    }

    @Override // defpackage.eig
    public final void G(fzl fzlVar) {
        PlayerView playerView = this.c;
        gig gigVar = playerView.q;
        gigVar.getClass();
        gql currentTimeline = gigVar.C(17) ? gigVar.getCurrentTimeline() : gql.a;
        if (currentTimeline.p()) {
            this.b = null;
        } else {
            boolean zC = gigVar.C(30);
            dql dqlVar = this.a;
            if (!zC || gigVar.w().a.isEmpty()) {
                Object obj = this.b;
                if (obj != null) {
                    int iB = currentTimeline.b(obj);
                    if (iB != -1) {
                        if (gigVar.f0() == currentTimeline.f(iB, dqlVar, false).c) {
                            return;
                        }
                    }
                    this.b = null;
                }
            } else {
                this.b = currentTimeline.f(gigVar.getCurrentPeriodIndex(), dqlVar, true).b;
            }
        }
        playerView.n(false);
    }

    @Override // defpackage.eig
    public final void a(r4n r4nVar) {
        PlayerView playerView;
        gig gigVar;
        if (r4nVar.equals(r4n.d) || (gigVar = (playerView = this.c).q) == null || gigVar.getPlaybackState() == 1) {
            return;
        }
        playerView.k();
    }

    @Override // defpackage.eig
    public final void h(int i) {
        int i2 = PlayerView.C;
        PlayerView playerView = this.c;
        playerView.l();
        TextView textView = playerView.j;
        if (textView != null) {
            gig gigVar = playerView.q;
            if (gigVar != null) {
                gigVar.s();
            }
            textView.setVisibility(8);
        }
        if (!playerView.c() || !playerView.A) {
            playerView.d(false);
            return;
        }
        uig uigVar = playerView.k;
        if (uigVar != null) {
            uigVar.d();
        }
    }

    @Override // defpackage.eig
    public final void n(int i, fig figVar, fig figVar2) {
        uig uigVar;
        int i2 = PlayerView.C;
        PlayerView playerView = this.c;
        if (playerView.c() && playerView.A && (uigVar = playerView.k) != null) {
            uigVar.d();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = PlayerView.C;
        this.c.j();
    }

    @Override // defpackage.eig
    public final void onRenderedFirstFrame() {
        PlayerView playerView = this.c;
        View view = playerView.c;
        if (view != null) {
            view.setVisibility(4);
            if (!playerView.a()) {
                playerView.b();
                return;
            }
            ImageView imageView = playerView.f;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        }
    }

    @Override // defpackage.eig
    public final void s(int i, int i2) {
    }

    @Override // defpackage.eig
    public final void z(int i, boolean z) {
        int i2 = PlayerView.C;
        PlayerView playerView = this.c;
        playerView.l();
        if (!playerView.c() || !playerView.A) {
            playerView.d(false);
            return;
        }
        uig uigVar = playerView.k;
        if (uigVar != null) {
            uigVar.d();
        }
    }
}

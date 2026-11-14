package defpackage;

import android.app.Notification;
import android.os.Build;
import com.opera.android.media.PlayerService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class qkg implements eig, ekg, rjg {
    public boolean b;
    public int c;
    public Notification d;
    public final /* synthetic */ PlayerService f;
    public final q65 a = new q65(new pjg(this, 3), (byte) 4);
    public boolean e = true;

    public qkg(PlayerService playerService) {
        this.f = playerService;
    }

    public final void P(boolean z) {
        this.b = z;
        u();
    }

    public final void f(boolean z) {
        PlayerService playerService = this.f;
        if (z) {
            int i = PlayerService.e;
            playerService.c(yh0.i);
        }
        int i2 = PlayerService.e;
        playerService.b("cancel");
        this.c = 0;
        this.d = null;
        this.a.S();
    }

    public final void j(Notification notification, int i) {
        this.c = i;
        this.d = notification;
        if (this.e) {
            this.e = false;
            t(notification, i);
            int i2 = PlayerService.e;
            this.f.b("force-fg");
        }
        u();
    }

    @Override // defpackage.rjg
    public final void k() {
        if (this.b) {
            this.b = false;
            u();
        }
        int i = PlayerService.e;
        this.f.a();
    }

    public final void t(Notification notification, int i) {
        int i2 = Build.VERSION.SDK_INT;
        PlayerService playerService = this.f;
        if (i2 < 31) {
            playerService.startForeground(i, notification);
            return;
        }
        if (m41.L(playerService, i, notification)) {
            return;
        }
        int i3 = PlayerService.e;
        playerService.b("denied-fg");
        if (this.b) {
            this.a.B0(vml.d, 30L, TimeUnit.SECONDS);
        }
    }

    public final void u() {
        Notification notification;
        this.a.S();
        boolean z = this.b;
        PlayerService playerService = this.f;
        if (z && (notification = this.d) != null) {
            t(notification, this.c);
            int i = PlayerService.e;
            playerService.b("start-fg");
            return;
        }
        gig gigVar = (gig) ((ode) playerService.a.c).g();
        boolean z2 = gigVar.getPlaybackState() == 4 && gigVar.g() == null;
        playerService.stopForeground(2);
        playerService.b("stop-fg");
        if (!z2 || this.d == null) {
            return;
        }
        new l2f(playerService).a(this.c, (String) null);
    }
}

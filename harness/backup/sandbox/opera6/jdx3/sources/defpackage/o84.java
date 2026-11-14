package defpackage;

import android.content.Intent;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaStatus;
import com.opera.android.browser.chromium.media.OperaMediaRouterClient;
import org.chromium.components.media_router.caf.remoting.CafExpandedControllerActivity;

/* loaded from: classes.dex */
public final class o84 implements kkd, a93 {
    public ikd a;
    public final c93 b;
    public final /* synthetic */ byte c;

    public o84(c93 c93Var, byte b) {
        this.c = b;
        this.b = c93Var;
    }

    public final void a() {
        if (this.b.g()) {
            c93.c();
        }
    }

    public final void b(int i) {
    }

    public final int c() {
        switch (this.c) {
            case 0:
                OperaMediaRouterClient.b.getClass();
                return 2131363775;
            default:
                OperaMediaRouterClient.b.getClass();
                return 2131363882;
        }
    }

    public final void d() {
        c93 c93Var = this.b;
        if (c93Var.g()) {
            c93Var.e();
            c93Var.e().pause();
        }
    }

    public final void e() {
        MediaMetadata metadata;
        String friendlyName;
        org.chromium.services.media_session.MediaMetadata mediaMetadata = new org.chromium.services.media_session.MediaMetadata("Chromecast", "", "");
        this.a.a = mediaMetadata;
        c93 c93Var = this.b;
        if (c93Var.g()) {
            CastDevice castDevice = c93Var.a.getCastDevice();
            if (castDevice != null && (friendlyName = castDevice.getFriendlyName()) != null && !friendlyName.isEmpty()) {
                mediaMetadata.a = friendlyName;
            }
            MediaInfo mediaInfo = c93Var.e().getMediaInfo();
            if (mediaInfo == null || (metadata = mediaInfo.getMetadata()) == null) {
                return;
            }
            String string = metadata.getString("com.google.android.gms.cast.metadata.TITLE");
            if (string != null && !string.isEmpty()) {
                mediaMetadata.a = string;
            }
            String string2 = metadata.getString("com.google.android.gms.cast.metadata.ARTIST");
            if (string2 == null) {
                string2 = metadata.getString("com.google.android.gms.cast.metadata.ALBUM_ARTIST");
            }
            if (string2 != null) {
                mediaMetadata.b = string2;
            }
            String string3 = metadata.getString("com.google.android.gms.cast.metadata.ALBUM_TITLE");
            if (string3 != null) {
                mediaMetadata.c = string3;
            }
        }
    }

    public final void f() {
        Intent intentPutExtra;
        ikd ikdVar = new ikd();
        ikdVar.b = false;
        c93 c93Var = this.b;
        vz5 vz5Var = c93Var.c;
        ikdVar.c = (String) vz5Var.g;
        ikdVar.d = vz5Var.a;
        ikdVar.e = vz5Var.c;
        ikdVar.i = (byte) 2;
        switch (this.c) {
            case 0:
                OperaMediaRouterClient operaMediaRouterClient = OperaMediaRouterClient.b;
                int i = c93Var.c.a;
                operaMediaRouterClient.getClass();
                intentPutExtra = mdb.b(t8.a).setAction("com.opera.android.action.ACTIVATE_TAB").putExtra("tabId", i);
                break;
            default:
                intentPutExtra = new Intent(t8.a, (Class<?>) CafExpandedControllerActivity.class);
                break;
        }
        ikdVar.k = intentPutExtra;
        ikdVar.f = 2131232468;
        ikdVar.j = c();
        ikdVar.l = this;
        this.a = ikdVar;
        e();
        OperaMediaRouterClient.b.a(this.a.a());
    }

    public final void i(long j) {
    }

    public final void k() {
        lkd.a(c());
        this.a = null;
    }

    public final void l() {
        c93 c93Var = this.b;
        if (c93Var.g()) {
            c93Var.e();
            c93Var.e().play();
        }
    }

    public final void onMetadataUpdated() {
        if (this.a == null) {
            return;
        }
        e();
        OperaMediaRouterClient.b.a(this.a.a());
    }

    public final void onStatusUpdated() {
        ikd ikdVar;
        if (this.a != null) {
            c93 c93Var = this.b;
            if (c93Var.g()) {
                c93Var.e();
                MediaStatus mediaStatus = c93Var.e().getMediaStatus();
                if (mediaStatus == null) {
                    return;
                }
                int playerState = mediaStatus.getPlayerState();
                if (playerState == 3 || playerState == 2) {
                    ikdVar = this.a;
                    ikdVar.b = playerState != 2;
                    ikdVar.i = (byte) 3;
                } else {
                    ikdVar = this.a;
                    ikdVar.i = (byte) 2;
                }
                OperaMediaRouterClient.b.a(ikdVar.a());
            }
        }
    }
}

package defpackage;

import android.app.Notification;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* loaded from: classes.dex */
public final class m1f extends n1f {
    public final /* synthetic */ byte e = 0;
    public int[] f;
    public Parcelable g;

    public m1f() {
        super((byte) 0);
        this.f = null;
    }

    public m1f(MediaSession.Token token, int[] iArr) {
        super((byte) 0);
        this.g = token;
        this.f = iArr;
    }

    public final void a(s9i s9iVar) {
        switch (this.e) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                Notification.Builder builder = (Notification.Builder) s9iVar.c;
                if (i < 34) {
                    Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
                    int[] iArr = this.f;
                    MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.g;
                    if (iArr != null) {
                        mediaStyle.setShowActionsInCompactView(iArr);
                    }
                    if (mediaSessionCompat$Token != null) {
                        mediaStyle.setMediaSession((MediaSession.Token) mediaSessionCompat$Token.b);
                    }
                    builder.setStyle(mediaStyle);
                    break;
                } else {
                    Notification.MediaStyle mediaStyle2 = new Notification.MediaStyle();
                    int[] iArr2 = this.f;
                    MediaSessionCompat$Token mediaSessionCompat$Token2 = (MediaSessionCompat$Token) this.g;
                    if (iArr2 != null) {
                        mediaStyle2.setShowActionsInCompactView(iArr2);
                    }
                    if (mediaSessionCompat$Token2 != null) {
                        mediaStyle2.setMediaSession((MediaSession.Token) mediaSessionCompat$Token2.b);
                    }
                    builder.setStyle(mediaStyle2);
                    break;
                }
            default:
                Notification.MediaStyle mediaStyle3 = new Notification.MediaStyle();
                mediaStyle3.setShowActionsInCompactView(this.f);
                MediaSession.Token token = (MediaSession.Token) this.g;
                if (token != null) {
                    mediaStyle3.setMediaSession(token);
                }
                ((Notification.Builder) s9iVar.c).setStyle(mediaStyle3);
                break;
        }
    }
}

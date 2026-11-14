package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.mediarouter.app.d;

/* loaded from: classes.dex */
public final class wmd implements IBinder.DeathRecipient {
    public final ihd a = new ihd(this);
    public rn6 b;
    public jhd c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ zp1 e;

    public wmd(zp1 zp1Var, byte b) {
        this.d = b;
        this.e = zp1Var;
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        byte b = this.d;
        zp1 zp1Var = this.e;
        switch (b) {
            case 0:
                d dVar = (d) zp1Var;
                dVar.W = mediaMetadataCompat != null ? mediaMetadataCompat.a() : null;
                dVar.s();
                dVar.r(false);
                break;
            default:
                ond ondVar = (ond) zp1Var;
                ondVar.M = mediaMetadataCompat != null ? mediaMetadataCompat.a() : null;
                ondVar.g();
                ondVar.l();
                break;
        }
    }

    public final void b(PlaybackStateCompat playbackStateCompat) {
        switch (this.d) {
            case 0:
                d dVar = (d) this.e;
                dVar.V = playbackStateCompat;
                dVar.r(false);
                break;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        e(8, null, null);
    }

    public final void c(PlaybackStateCompat playbackStateCompat) {
    }

    public final void d() {
        byte b = this.d;
        zp1 zp1Var = this.e;
        switch (b) {
            case 0:
                d dVar = (d) zp1Var;
                z8b z8bVar = dVar.T;
                if (z8bVar != null) {
                    z8bVar.N(dVar.U);
                    dVar.T = null;
                    break;
                }
                break;
            default:
                ond ondVar = (ond) zp1Var;
                z8b z8bVar2 = ondVar.K;
                if (z8bVar2 != null) {
                    z8bVar2.N(ondVar.L);
                    ondVar.K = null;
                    break;
                }
                break;
        }
    }

    public final void e(int i, Object obj, Bundle bundle) {
        rn6 rn6Var = this.b;
        if (rn6Var != null) {
            Message messageObtainMessage = rn6Var.obtainMessage(i, obj);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
        }
    }

    public final void f(Handler handler) {
        if (handler != null) {
            rn6 rn6Var = new rn6(this, handler.getLooper());
            this.b = rn6Var;
            rn6Var.b = true;
        } else {
            rn6 rn6Var2 = this.b;
            if (rn6Var2 != null) {
                rn6Var2.b = false;
                rn6Var2.removeCallbacksAndMessages(null);
                this.b = null;
            }
        }
    }
}

package defpackage;

import android.app.Notification;

/* loaded from: classes.dex */
public final class g1f extends n1f {
    public CharSequence e;

    @Override // defpackage.n1f
    public final void a(s9i s9iVar) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) s9iVar.c).setBigContentTitle((CharSequence) this.c).bigText(this.e);
        if (this.a) {
            bigTextStyleBigText.setSummaryText((CharSequence) this.d);
        }
    }

    @Override // defpackage.n1f
    public final String b() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}

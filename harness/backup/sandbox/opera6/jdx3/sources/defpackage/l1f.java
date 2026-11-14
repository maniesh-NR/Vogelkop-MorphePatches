package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l1f {
    public Notification A;
    public RemoteViews B;
    public RemoteViews C;
    public String D;
    public final boolean F;
    public final Notification G;
    public Icon H;
    public final ArrayList I;
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public boolean l;
    public n1f m;
    public CharSequence n;
    public int o;
    public int p;
    public boolean q;
    public String r;
    public boolean s;
    public boolean u;
    public boolean v;
    public String w;
    public Bundle x;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean k = true;
    public boolean t = false;
    public int y = 0;
    public int z = 0;
    public boolean E = false;

    public l1f(Context context, String str) {
        Notification notification = new Notification();
        this.G = notification;
        this.a = context;
        this.D = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.I = new ArrayList();
        this.F = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(int i, String str, PendingIntent pendingIntent) {
        this.b.add(new d1f(i, str, pendingIntent));
    }

    public final Notification b() {
        s9i s9iVar = new s9i(this);
        l1f l1fVar = (l1f) s9iVar.d;
        n1f n1fVar = l1fVar.m;
        if (n1fVar != null) {
            n1fVar.a(s9iVar);
        }
        Notification notificationBuild = ((Notification.Builder) s9iVar.c).build();
        RemoteViews remoteViews = l1fVar.B;
        if (remoteViews != null) {
            notificationBuild.contentView = remoteViews;
        }
        if (n1fVar != null) {
            l1fVar.m.getClass();
            Bundle extras = NotificationCompat.getExtras(notificationBuild);
            if (extras != null) {
                if (n1fVar.a) {
                    extras.putCharSequence("android.summaryText", (CharSequence) n1fVar.d);
                }
                CharSequence charSequence = (CharSequence) n1fVar.c;
                if (charSequence != null) {
                    extras.putCharSequence("android.title.big", charSequence);
                }
                String strB = n1fVar.b();
                if (strB != null) {
                    extras.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strB);
                }
            }
        }
        return notificationBuild;
    }

    public final void d(boolean z) {
        h(16, z);
    }

    public final void e(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void f(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void g(int i) {
        Notification notification = this.G;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void h(int i, boolean z) {
        Notification notification = this.G;
        if (z) {
            notification.flags |= i;
        } else {
            notification.flags &= ~i;
        }
    }

    public final void i(Bitmap bitmap) {
        this.h = bitmap == null ? null : IconCompat.b(NotificationCompat.reduceLargeIconSize(this.a, bitmap));
    }

    public final void j(n1f n1fVar) {
        if (this.m != n1fVar) {
            this.m = n1fVar;
            if (((l1f) n1fVar.b) != this) {
                n1fVar.b = this;
                j(n1fVar);
            }
        }
    }
}

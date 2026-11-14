package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class f1f extends n1f {
    public IconCompat e;
    public IconCompat f;
    public boolean g;

    public final void a(s9i s9iVar) {
        Bitmap bitmapA;
        Notification.Builder builder = (Notification.Builder) s9iVar.c;
        Context context = (Context) s9iVar.b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle((CharSequence) ((n1f) this).c);
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                e1f.a(bigContentTitle, fr3.f0(iconCompat, context));
            } else {
                int type = iconCompat.a;
                if (type == -1) {
                    type = ((Icon) iconCompat.b).getType();
                }
                if (type == 1) {
                    IconCompat iconCompat2 = this.e;
                    int i = iconCompat2.a;
                    if (i == -1) {
                        Object obj = iconCompat2.b;
                        bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i == 1) {
                        bitmapA = (Bitmap) iconCompat2.b;
                    } else {
                        if (i != 5) {
                            pza.i(iconCompat2, "called getBitmap() on ");
                            return;
                        }
                        bitmapA = IconCompat.a((Bitmap) iconCompat2.b);
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmapA);
                }
            }
        }
        if (this.g) {
            IconCompat iconCompat3 = this.f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(fr3.f0(iconCompat3, context));
            }
        }
        if (((n1f) this).a) {
            bigContentTitle.setSummaryText((CharSequence) ((n1f) this).d);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            e1f.c(bigContentTitle, false);
            e1f.b(bigContentTitle, null);
        }
    }

    public final String b() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}

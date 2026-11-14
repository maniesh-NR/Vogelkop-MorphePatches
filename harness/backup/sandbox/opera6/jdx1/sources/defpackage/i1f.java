package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public abstract class i1f {
    public static k1f a(Notification.BubbleMetadata bubbleMetadata) {
        j1f j1fVar;
        if (bubbleMetadata == null) {
            return null;
        }
        if (bubbleMetadata.getShortcutId() != null) {
            String shortcutId = bubbleMetadata.getShortcutId();
            j1fVar = new j1f();
            if (TextUtils.isEmpty(shortcutId)) {
                t3p.q("Bubble requires a non-null shortcut id");
                return null;
            }
            j1fVar.g = shortcutId;
        } else {
            PendingIntent intent = bubbleMetadata.getIntent();
            Icon icon = bubbleMetadata.getIcon();
            PorterDuff.Mode mode = IconCompat.k;
            IconCompat iconCompatA = fr3.A(icon);
            j1fVar = new j1f();
            if (intent == null) {
                t3p.q("Bubble requires non-null pending intent");
                return null;
            }
            j1fVar.d = intent;
            j1fVar.f = iconCompatA;
        }
        j1fVar.b(1, bubbleMetadata.getAutoExpandBubble());
        j1fVar.e = bubbleMetadata.getDeleteIntent();
        j1fVar.b(2, bubbleMetadata.isNotificationSuppressed());
        if (bubbleMetadata.getDesiredHeight() != 0) {
            j1fVar.a = Math.max(bubbleMetadata.getDesiredHeight(), 0);
            j1fVar.b = 0;
        }
        if (bubbleMetadata.getDesiredHeightResId() != 0) {
            j1fVar.b = bubbleMetadata.getDesiredHeightResId();
            j1fVar.a = 0;
        }
        IconCompat iconCompat = (IconCompat) j1fVar.f;
        PendingIntent pendingIntent = (PendingIntent) j1fVar.d;
        if (((String) j1fVar.g) == null) {
            if (pendingIntent == null) {
                t3p.q("Must supply pending intent or shortcut to bubble");
                return null;
            }
            if (iconCompat == null) {
                t3p.q("Must supply an icon or shortcut for the bubble");
                return null;
            }
        }
        return new k1f();
    }
}

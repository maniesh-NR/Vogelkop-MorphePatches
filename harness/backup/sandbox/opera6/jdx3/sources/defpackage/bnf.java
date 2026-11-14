package defpackage;

import android.util.SparseArray;
import com.opera.android.media.OperaMediaNotificationControllerDelegate$CastListenerService;
import com.opera.android.media.OperaMediaNotificationControllerDelegate$PlaybackListenerService;
import com.opera.android.media.OperaMediaNotificationControllerDelegate$PresentationListenerService;

/* loaded from: classes.dex */
public final class bnf {
    public static final SparseArray c;
    public final int a;
    public final int b;

    static {
        SparseArray sparseArray = new SparseArray();
        c = sparseArray;
        int i = OperaMediaNotificationControllerDelegate$PlaybackListenerService.c;
        sparseArray.put(2131363343, new zmf(OperaMediaNotificationControllerDelegate$PlaybackListenerService.class, "MediaPlayback"));
        int i2 = OperaMediaNotificationControllerDelegate$PresentationListenerService.b;
        sparseArray.put(2131363775, new zmf(OperaMediaNotificationControllerDelegate$PresentationListenerService.class, "MediaPresentation"));
        int i3 = OperaMediaNotificationControllerDelegate$CastListenerService.b;
        sparseArray.put(2131363882, new zmf(OperaMediaNotificationControllerDelegate$CastListenerService.class, "MediaRemote"));
    }

    public bnf(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static ua7 a(int i) {
        return zi4.t("media", new cm((String) null, i, (byte) 5));
    }
}

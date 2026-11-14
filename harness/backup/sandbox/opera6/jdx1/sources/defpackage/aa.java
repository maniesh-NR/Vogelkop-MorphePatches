package defpackage;

import J.N;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import kotlin.Unit;
import org.chromium.base.ThreadUtils;
import org.chromium.media.AudioManagerAndroid;

/* loaded from: classes.dex */
public final class aa extends ContentObserver {
    public final /* synthetic */ byte a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(Handler handler, Runnable runnable) {
        super(handler);
        this.a = (byte) 0;
        this.b = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aa(Object obj, Handler handler, byte b) {
        super(handler);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(tqk tqkVar) {
        super(new Handler());
        this.a = (byte) 2;
        this.b = tqkVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.a) {
            case 2:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                onChange(z, null);
                break;
            case 1:
                super.onChange(z);
                AudioManagerAndroid audioManagerAndroid = (AudioManagerAndroid) obj;
                N.MCgftn_d(audioManagerAndroid.b, audioManagerAndroid.a.getStreamVolume(0) == 0);
                break;
            case 2:
                tqk tqkVar = (tqk) obj;
                if (tqkVar.b && (cursor = tqkVar.c) != null && !cursor.isClosed()) {
                    tqkVar.a = tqkVar.c.requery();
                    break;
                }
                break;
            default:
                super.onChange(z);
                break;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ThreadUtils.a().post((Runnable) obj);
                break;
            case 3:
                ((p04) obj).b(Unit.a);
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }
}

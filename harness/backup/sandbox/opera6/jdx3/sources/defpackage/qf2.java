package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.format.DateFormat;
import androidx.fragment.app.r;
import com.opera.android.history.f;

/* loaded from: classes.dex */
public final class qf2 extends BroadcastReceiver {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;
    public final Object d;

    public qf2(r rVar, ztn ztnVar, f fVar) {
        this.b = rVar;
        this.c = ztnVar;
        this.d = fVar;
    }

    public qf2(tn tnVar, szk szkVar, mi8 mi8Var) {
        this.d = tnVar;
        this.c = szkVar;
        this.b = mi8Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    ((szk) obj).c(new q02(this, (byte) 14));
                    break;
                }
                break;
            default:
                ztn ztnVar = (ztn) obj;
                r rVar = (r) this.b;
                ztnVar.getClass();
                ztnVar.i = DateFormat.getTimeFormat(rVar);
                ((ysi) ((f) this.d).f.b).l();
                break;
        }
    }
}

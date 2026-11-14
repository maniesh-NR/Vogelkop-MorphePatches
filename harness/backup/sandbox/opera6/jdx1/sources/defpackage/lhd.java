package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class lhd {
    public final MediaController a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final apd e;

    public lhd(Context context, apd apdVar) {
        this.e = apdVar;
        MediaController mediaController = new MediaController(context, apdVar.b);
        this.a = mediaController;
        if (apdVar.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new khd(this));
        }
    }

    public final void a() {
        tsa tsaVarA = this.e.a();
        if (tsaVarA == null) {
            return;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hid hidVar = (hid) obj;
            hhd hhdVar = new hhd(hidVar);
            this.d.put(hidVar, hhdVar);
            hidVar.getClass();
            try {
                tsaVarA.J(hhdVar);
                hidVar.a(13, null);
            } catch (RemoteException | SecurityException e) {
                w7d.r("Dead object in registerCallback.", e);
            }
        }
        arrayList.clear();
    }
}

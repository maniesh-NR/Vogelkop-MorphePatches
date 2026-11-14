package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class imd extends MediaRouter2$TransferCallback {
    public final /* synthetic */ jmd a;

    public imd(jmd jmdVar) {
        this.a = jmdVar;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        cod codVarC;
        jmd jmdVar = this.a;
        jmdVar.s = null;
        snd sndVar = (snd) jmdVar.k.remove(routingController);
        if (sndVar == null) {
            Objects.toString(routingController);
            return;
        }
        ez9 ez9Var = (ez9) jmdVar.j.b;
        if (sndVar != ez9Var.e || ez9Var.h() == (codVarC = ez9Var.c())) {
            return;
        }
        ez9Var.m(codVarC, 2, 2, true);
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        int i = Build.VERSION.SDK_INT;
        jmd jmdVar = this.a;
        int iH = i >= 35 ? kg1.h(routingController2) : jmdVar.s != null ? 1 : 2;
        cod codVar = null;
        jmdVar.s = null;
        jmdVar.k.remove(routingController);
        if (routingController2 == jmdVar.i.getSystemController()) {
            ez9 ez9Var = (ez9) jmdVar.j.b;
            cod codVarC = ez9Var.c();
            if (ez9Var.h() != codVarC) {
                ez9Var.m(codVarC, 3, iH, true);
                return;
            }
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            return;
        }
        int i2 = 0;
        String id = uac.e(selectedRoutes.get(0)).getId();
        jmdVar.k.put(routingController2, new fmd(jmdVar, routingController2, id));
        ez9 ez9Var2 = (ez9) jmdVar.j.b;
        ArrayList arrayList = ez9Var2.j;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            cod codVar2 = (cod) obj;
            if (codVar2.c() == ez9Var2.s && TextUtils.equals(id, codVar2.b)) {
                codVar = codVar2;
                break;
            }
        }
        if (codVar == null) {
            ArrayList arrayList2 = new ArrayList();
            int size2 = arrayList.size();
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                cod codVar3 = (cod) obj2;
                if (codVar3.c() == ez9Var2.s) {
                    arrayList2.add(codVar3.b);
                }
            }
            arrayList2.toString();
        } else {
            ez9Var2.m(codVar, 3, iH, true);
        }
        jmdVar.l(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        this.a.s = null;
        Objects.toString(mediaRoute2Info);
    }
}

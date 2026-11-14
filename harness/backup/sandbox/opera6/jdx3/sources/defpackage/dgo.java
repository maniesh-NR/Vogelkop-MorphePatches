package defpackage;

import android.view.View;
import com.opera.ad.interstitial.AdActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class dgo implements g94, v2p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dgo(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void accept(Object obj) {
        boolean zBooleanValue;
        jro jroVar = (jro) this.b;
        c0p c0pVar = (c0p) obj;
        Iterator it = g1p.n.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                zBooleanValue = false;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (c0pVar == entry.getKey()) {
                zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                break;
            }
        }
        if (zBooleanValue) {
            return;
        }
        jroVar.b = c0pVar.a.concat("api/v1/sdk_fetch");
        jroVar.i = 0;
        jroVar.j = true;
    }

    @Override // defpackage.g94
    public final void l(Object obj) {
        byte b = this.a;
        ahb ahbVar = ahb.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                rjo rjoVar = (rjo) obj2;
                if (((ahb) obj) == ahbVar) {
                    ((AdActivity) rjoVar.b).finish();
                    break;
                }
                break;
            case 1:
                ((xho) obj2).F = ((Long) obj).longValue();
                break;
            case 2:
                t9l t9lVar = (t9l) obj2;
                l4n l4nVar = ((int) ((ujo) t9lVar.b).a.getDuration()) > 0 ? new l4n((int) r6.getCurrentPosition(), (int) r6.getDuration()) : l4n.c;
                n9h n9hVar = (n9h) t9lVar.d;
                if (((jn) n9hVar.c) != null) {
                    m5h.c((ArrayList) n9hVar.b, new roj(n9hVar, l4nVar, (byte) 21));
                    break;
                }
                break;
            case 3:
            case 4:
            case 5:
            default:
                ((u2p) obj2).j((View) obj);
                break;
            case 6:
                qjo qjoVar = (qjo) obj2;
                if (((ahb) obj) == ahbVar) {
                    ((AdActivity) qjoVar.b).finish();
                    break;
                }
                break;
            case 7:
                ((bzo) obj2).b.m(((zno) ((Exception) obj)).a);
                break;
        }
    }
}

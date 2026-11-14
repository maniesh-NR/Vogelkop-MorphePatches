package defpackage;

import com.google.ads.interactivemedia.v3.impl.data.zzc;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rwo implements em, hm {
    public final /* synthetic */ nxo a;

    public rwo(nxo nxoVar) {
        this.a = nxoVar;
    }

    public final void a(jvg jvgVar) {
        dn dnVar;
        dm dmVar = (dm) jvgVar.b;
        dmVar.toString();
        nxo nxoVar = this.a;
        nxoVar.k = null;
        ujo ujoVar = nxoVar.d;
        if ((ujoVar.c & 1) != 0) {
            ujoVar.a.stop();
            ujoVar.c = (short) 128;
        }
        bm bmVar = bm.VAST_PLAYBACK_ERROR;
        nxoVar.l = bmVar;
        if (dmVar.b == 1) {
            bm bmVar2 = bm.d;
            nxoVar.l = bmVar2;
            fzo fzoVar = nxoVar.g;
            if (fzoVar == null || (dnVar = (dn) fzoVar.b) == null) {
                return;
            }
            dnVar.p(bmVar2);
            return;
        }
        nxoVar.l = bmVar;
        xup xupVar = nxoVar.i;
        if (xupVar != null) {
            xupVar.b();
        }
        fzo fzoVar2 = nxoVar.g;
        if (fzoVar2 != null) {
            bm bmVar3 = nxoVar.l;
            wm wmVar = (wm) fzoVar2.a;
            if (wmVar != null) {
                wmVar.d(bmVar3);
            }
        }
    }

    public final void b(zrp zrpVar) {
        wm wmVar;
        fzo fzoVar;
        wm wmVar2;
        nxo nxoVar = this.a;
        ArrayList arrayList = nxoVar.f;
        int i = iwo.a[vep.A(zrpVar.a)];
        if (i == 1) {
            fzo fzoVar2 = nxoVar.g;
            if (fzoVar2 == null || (wmVar = (wm) fzoVar2.a) == null) {
                return;
            }
            wmVar.g();
            return;
        }
        if (i == 2) {
            zzc zzcVar = zrpVar.b;
            zzcVar.getClass();
            nxoVar.o = zzcVar.a();
            int iC = zzcVar.c();
            int iB = zzcVar.b();
            nxoVar.m = iC;
            nxoVar.n = iB;
            return;
        }
        if (i != 3 && i != 4) {
            if (i != 5 || (fzoVar = nxoVar.g) == null || (wmVar2 = (wm) fzoVar.a) == null) {
                return;
            }
            wmVar2.onAdClicked();
            return;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((nwo) obj).a();
        }
        arrayList.clear();
        nxoVar.p = true;
    }
}

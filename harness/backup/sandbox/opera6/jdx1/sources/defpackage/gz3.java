package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.PendingResult;
import com.opera.android.bubbleview.BubbleView;
import com.opera.android.startpage.layout.feed_specific.HiddenStartPageContentHintView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class gz3 implements jz3, fjc, xo4, ykj, kid, op5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ gz3(byte b, int i) {
        this.a = b;
        this.b = i;
    }

    public /* synthetic */ gz3(int i, n3j n3jVar, Bundle bundle) {
        this.a = (byte) 9;
        this.b = i;
    }

    public /* synthetic */ gz3(int i, n3j n3jVar, Bundle bundle, Bundle bundle2) {
        this.a = (byte) 8;
        this.b = i;
    }

    public /* synthetic */ gz3(d11 d11Var, int i, fig figVar, fig figVar2) {
        this.a = (byte) 3;
        this.b = i;
    }

    public final BubbleView a(lz3 lz3Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(this.b, viewGroup, false);
    }

    @Override // defpackage.op5
    public final void accept(Object obj) {
        byte b = this.a;
        int i = this.b;
        xkg xkgVar = (xkg) obj;
        switch (b) {
            case 10:
                xkgVar.v(i);
                break;
            case 11:
                xkgVar.k(i);
                break;
            case 12:
                xkgVar.setRepeatMode(i);
                break;
            default:
                xkgVar.n0(i);
                break;
        }
    }

    public final void f(gid gidVar) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 8:
                if (gidVar.r() && gidVar.l.get(i) != null) {
                    h9o.t();
                    break;
                }
                break;
            default:
                ghd ghdVar = gidVar.a;
                if (gidVar.r()) {
                    ghdVar.getClass();
                    z4o.H(Looper.myLooper() == ghdVar.f.getLooper());
                    ghdVar.e.getClass();
                    r0b r0bVarC = yr9.c(new e4j(-6));
                    r0bVarC.addListener(new d50((Object) gidVar, (Object) r0bVarC, i, (byte) 6), m97.a);
                    break;
                }
                break;
        }
    }

    public final void invoke(Object obj) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 1:
                ((eig) obj).onRepeatModeChanged(i);
                break;
            case 2:
            default:
                ((eig) obj).onRepeatModeChanged(i);
                break;
            case 3:
                e11 e11Var = (e11) obj;
                e11Var.getClass();
                dkd dkdVar = (dkd) e11Var;
                if (i == 1) {
                    dkdVar.v = true;
                }
                dkdVar.l = i;
                break;
            case 4:
                ((eig) obj).onRepeatModeChanged(i);
                break;
            case 5:
                ((eig) obj).g(i);
                break;
        }
    }

    @Override // defpackage.ykj
    public final Object k(g3d g3dVar) {
        rxh rxhVar = HiddenStartPageContentHintView.p;
        return Integer.valueOf(this.b);
    }

    public final PendingResult m(RemoteMediaClient remoteMediaClient) {
        return remoteMediaClient.queueSetRepeatMode(this.b, (JSONObject) null);
    }
}

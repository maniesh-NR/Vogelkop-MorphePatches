package defpackage;

import android.content.SharedPreferences;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class jfn implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pfn b;

    public /* synthetic */ jfn(pfn pfnVar, byte b) {
        this.a = b;
        this.b = pfnVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        pfn pfnVar = this.b;
        switch (b) {
            case 0:
                axc axcVar = (axc) obj;
                if (axcVar != null) {
                    int iOrdinal = (axcVar.ordinal() + 1) % lfn.a.d();
                    nv6 nv6VarB = ru9.c(pfnVar.a).b();
                    ((SharedPreferences.Editor) nv6VarB.a).putInt("vpn.vpnpro.upsell_banner_version", iOrdinal);
                    nv6VarB.w();
                    break;
                }
                break;
            default:
                ((yah) obj).s0(pfnVar);
                break;
        }
    }
}

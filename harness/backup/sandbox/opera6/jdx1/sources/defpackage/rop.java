package defpackage;

import ads_mobile_sdk.o01;
import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.playcore_hsdp.zzb;
import com.google.android.gms.internal.playcore_hsdp.zzc;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class rop extends zzb {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ gpp b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rop(gpp gppVar) {
        super("com.google.android.play.core.hsdp.protocol.IHsdpServiceListener");
        this.c = gppVar;
        this.b = gppVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rop(gpp gppVar, o01 o01Var) {
        super("com.google.android.play.core.hsdp.protocol.IHsdpServicePrewarmListener");
        this.c = o01Var;
        this.b = gppVar;
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        final byte b = 0;
        switch (this.a) {
            case 0:
                if (i == 1) {
                    Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                    zzc.zzb(parcel);
                    o01 o01Var = (o01) this.c;
                    AtomicBoolean atomicBoolean = o01Var.b;
                    nh4 nh4Var = o01Var.a;
                    int i3 = bundle.getInt("hsdpPrewarmStatusCode", 1);
                    bundle.containsKey("hsdpPrewarmStatusCode");
                    String string = bundle.getString("errorMessage", "");
                    if (i3 != 2) {
                        if (i3 == 6) {
                            if ((nh4Var.r() instanceof c0f) && atomicBoolean.compareAndSet(false, true)) {
                                p0i p0iVar = t0i.b;
                                nh4Var.resumeWith(Unit.a);
                                break;
                            }
                        } else {
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("errorCode", i3);
                            bundle2.putString("errorMessage", string);
                            if ((nh4Var.r() instanceof c0f) && atomicBoolean.compareAndSet(false, true)) {
                                p0i p0iVar2 = t0i.b;
                                nh4Var.resumeWith(new q0i(new Exception("HSDP prewarm failed: " + bundle2)));
                                break;
                            }
                        }
                    }
                } else if (i == 2) {
                    zzc.zzb(parcel);
                    final g7m g7mVar = this.b.b;
                    g7mVar.s(new Runnable() { // from class: lqp
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            g7m g7mVar2 = g7mVar;
                            switch (b2) {
                                case 0:
                                    if (((IInterface) g7mVar2.k) != null) {
                                        Context context = (Context) g7mVar2.d;
                                        tko tkoVar = (tko) g7mVar2.j;
                                        tkoVar.getClass();
                                        context.unbindService(tkoVar);
                                        g7mVar2.a = false;
                                        g7mVar2.k = null;
                                        g7mVar2.j = null;
                                        ArrayList arrayList = (ArrayList) g7mVar2.f;
                                        synchronized (arrayList) {
                                            arrayList.clear();
                                        }
                                        g7mVar2.r();
                                        return;
                                    }
                                    return;
                                default:
                                    if (((IInterface) g7mVar2.k) != null) {
                                        g7mVar2.k = null;
                                        g7mVar2.r();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    break;
                } else {
                    break;
                }
                break;
            default:
                if (i == 1) {
                    Bundle bundle3 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                    zzc.zzb(parcel);
                    gpp gppVar = (gpp) this.c;
                    int i4 = bundle3.getInt("hsdpStatusCode", 1);
                    bundle3.containsKey("hsdpStatusCode");
                    String string2 = bundle3.getString("targetPackage", "");
                    if (!string2.isEmpty()) {
                        byte b2 = 27;
                        switch (i4) {
                            case 1:
                                gpp.b(gppVar, string2, 4, new ky(this, string2, i4, bundle3.getString("errorMessage", "HSDP service unknown status")));
                                break;
                            case 3:
                                gpp.b(gppVar, string2, 2, (Runnable) null);
                                break;
                            case 4:
                                gpp.b(gppVar, string2, 3, (Runnable) null);
                                break;
                            case 5:
                                gpp.b(gppVar, string2, 4, new vr9(this, string2, b2));
                                break;
                            case 6:
                                gpp.b(gppVar, string2, 4, new ky(this, string2, i4, bundle3.getString("errorMessage", "HSDP service error")));
                                break;
                            case 7:
                                gpp.b(gppVar, string2, 5, new wr9(this, string2, (byte) 27));
                                break;
                            case 8:
                                gpp.b(gppVar, string2, 4, new ky(this, string2, i4, bundle3.getString("errorMessage", "HSDP service cancelled")));
                                break;
                        }
                    }
                } else if (i == 2) {
                    zzc.zzb(parcel);
                    final g7m g7mVar2 = this.b.b;
                    g7mVar2.s(new Runnable() { // from class: lqp
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b22 = b;
                            g7m g7mVar22 = g7mVar2;
                            switch (b22) {
                                case 0:
                                    if (((IInterface) g7mVar22.k) != null) {
                                        Context context = (Context) g7mVar22.d;
                                        tko tkoVar = (tko) g7mVar22.j;
                                        tkoVar.getClass();
                                        context.unbindService(tkoVar);
                                        g7mVar22.a = false;
                                        g7mVar22.k = null;
                                        g7mVar22.j = null;
                                        ArrayList arrayList = (ArrayList) g7mVar22.f;
                                        synchronized (arrayList) {
                                            arrayList.clear();
                                        }
                                        g7mVar22.r();
                                        return;
                                    }
                                    return;
                                default:
                                    if (((IInterface) g7mVar22.k) != null) {
                                        g7mVar22.k = null;
                                        g7mVar22.r();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    break;
                } else {
                    break;
                }
                break;
        }
        return true;
    }
}

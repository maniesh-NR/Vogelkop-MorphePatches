package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.internal.play_billing.zza;
import com.google.android.gms.internal.play_billing.zzar;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzjn;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class hpp implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cf3 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hpp(cf3 cf3Var, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = cf3Var;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        zzar zzarVar;
        Exception exc;
        zg zgVar;
        zzar zzarVar2;
        int i;
        int i2;
        switch (this.a) {
            case 0:
                cf3 cf3Var = this.b;
                String str = (String) this.c;
                String str2 = (String) this.d;
                try {
                    synchronized (cf3Var.a) {
                        zzarVar = cf3Var.i;
                    }
                    return zzarVar == null ? zzc.zzd(xrp.g, zzjn.zzbc) : zzarVar.zzf(3, cf3Var.g.getPackageName(), str, str2, (String) null);
                } catch (DeadObjectException e) {
                    return zzc.zze(xrp.g, zzjn.zze, nrp.a(e));
                } catch (Exception e2) {
                    return zzc.zze(xrp.e, zzjn.zze, nrp.a(e2));
                }
            default:
                cf3 cf3Var2 = this.b;
                cz8 cz8Var = (cz8) this.c;
                qie qieVar = (qie) this.d;
                Exception exc2 = null;
                if (!cf3Var2.u(n1h.b)) {
                    zzjn zzjnVar = zzjn.zzb;
                    mf3 mf3Var = xrp.g;
                    cf3Var2.y(7, mf3Var, zzjnVar);
                    cz8Var.a(mf3Var, new yqa(zzca.zzk(), zzca.zzk(), (byte) 28));
                } else {
                    if (cf3Var2.r) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i3 = 0;
                        ((egh) ((zzca) qieVar.b).get(0)).getClass();
                        List list = (zzca) qieVar.b;
                        int size = list.size();
                        int i4 = 0;
                        while (i4 < size) {
                            int i5 = i4 + 20;
                            ArrayList arrayList3 = new ArrayList(list.subList(i4, i5 > size ? size : i5));
                            ArrayList<String> arrayList4 = new ArrayList<>();
                            int size2 = arrayList3.size();
                            for (int i6 = i3; i6 < size2; i6++) {
                                arrayList4.add(((egh) arrayList3.get(i6)).a);
                            }
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
                            String str3 = cf3Var2.c;
                            bundle.putString("playBillingLibraryVersion", str3);
                            try {
                                synchronized (cf3Var2.a) {
                                    try {
                                        zzarVar2 = cf3Var2.i;
                                    } catch (Throwable th) {
                                        th = th;
                                        exc = exc2;
                                        while (true) {
                                            try {
                                                try {
                                                    throw th;
                                                } catch (DeadObjectException e3) {
                                                    e = e3;
                                                    zgVar = cf3Var2.g(xrp.g, zzjn.zzQ, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                                                    cz8Var.a(xrp.a(zgVar.a, (String) zgVar.d), new yqa((ArrayList) zgVar.b, (ArrayList) zgVar.c, (byte) 28));
                                                    return exc;
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    zgVar = cf3Var2.g(xrp.e, zzjn.zzQ, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                                                    cz8Var.a(xrp.a(zgVar.a, (String) zgVar.d), new yqa((ArrayList) zgVar.b, (ArrayList) zgVar.c, (byte) 28));
                                                    return exc;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        }
                                    }
                                }
                                if (zzarVar2 == null) {
                                    zgVar = cf3Var2.g(xrp.g, zzjn.zzbc, "Service has been reset to null.", exc2);
                                } else {
                                    if (cf3Var2.s) {
                                        cf3Var2.y.getClass();
                                    }
                                    cf3Var2.g.getPackageName();
                                    cf3Var2.g.getPackageName();
                                    cf3Var2.g.getPackageName();
                                    cf3Var2.g.getPackageName();
                                    Bundle bundleZzj = zzarVar2.zzj(true != cf3Var2.t ? 17 : 20, cf3Var2.g.getPackageName(), "subs", bundle, zzc.zzg(str3, cf3Var2.d, arrayList3, null, null, zza.zza(false, true, true, true, false, true), cf3Var2.E.longValue()));
                                    if (bundleZzj == null) {
                                        zgVar = cf3Var2.g(xrp.o, zzjn.zzR, "queryProductDetailsAsync got empty product details response.", exc2);
                                    } else if (bundleZzj.containsKey("DETAILS_LIST")) {
                                        ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("DETAILS_LIST");
                                        if (stringArrayList == null) {
                                            zgVar = cf3Var2.g(xrp.o, zzjn.zzT, "queryProductDetailsAsync got null response list", exc2);
                                        } else {
                                            ArrayList arrayList5 = new ArrayList();
                                            int size3 = stringArrayList.size();
                                            int i7 = 0;
                                            while (i7 < size3) {
                                                exc = exc2;
                                                try {
                                                    h2h h2hVar = new h2h(stringArrayList.get(i7));
                                                    zzc.zzn("BillingClient", "Got product details: ".concat(h2hVar.toString()));
                                                    arrayList5.add(h2hVar);
                                                    i7++;
                                                    exc2 = exc;
                                                    list = list;
                                                } catch (JSONException e5) {
                                                    zgVar = cf3Var2.g(xrp.a(6, "Error trying to decode SkuDetails."), zzjn.zzU, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e5);
                                                }
                                            }
                                            List list2 = list;
                                            exc = exc2;
                                            ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                                            try {
                                                ArrayList arrayList6 = new ArrayList();
                                                if (stringArrayList2 != null) {
                                                    int size4 = stringArrayList2.size();
                                                    int i8 = 0;
                                                    while (i8 < size4) {
                                                        String str4 = stringArrayList2.get(i8);
                                                        i8++;
                                                        qkm qkmVar = new qkm(str4);
                                                        zzc.zzn("BillingClient", "Got unfetchedProduct: ".concat(qkmVar.toString()));
                                                        arrayList6.add(qkmVar);
                                                    }
                                                } else {
                                                    int size5 = arrayList3.size();
                                                    int i9 = 0;
                                                    while (i9 < size5) {
                                                        Object obj = arrayList3.get(i9);
                                                        int i10 = i9 + 1;
                                                        egh eghVar = (egh) obj;
                                                        int size6 = arrayList5.size();
                                                        int i11 = 0;
                                                        while (true) {
                                                            if (i11 < size6) {
                                                                Object obj2 = arrayList5.get(i11);
                                                                i11++;
                                                                h2h h2hVar2 = (h2h) obj2;
                                                                i = size5;
                                                                i2 = i10;
                                                                if (!eghVar.a.equals(h2hVar2.c) || !"subs".equals(h2hVar2.d)) {
                                                                    size5 = i;
                                                                    i10 = i2;
                                                                }
                                                            } else {
                                                                i = size5;
                                                                i2 = i10;
                                                                arrayList6.add(new qkm(new JSONObject().put("productId", eghVar.a).put("type", "subs").put("statusCode", 0).toString()));
                                                            }
                                                        }
                                                        size5 = i;
                                                        i9 = i2;
                                                    }
                                                }
                                                arrayList.addAll(arrayList5);
                                                arrayList2.addAll(arrayList6);
                                                i4 = i5;
                                                exc2 = exc;
                                                list = list2;
                                                i3 = 0;
                                            } catch (JSONException e6) {
                                                zgVar = cf3Var2.g(xrp.a(6, "Error trying to decode SkuDetails."), zzjn.zzU, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e6);
                                            }
                                        }
                                    } else {
                                        int iZzb = zzc.zzb(bundleZzj, "BillingClient");
                                        String strZzk = zzc.zzk(bundleZzj, "BillingClient");
                                        zgVar = iZzb != 0 ? cf3Var2.g(xrp.a(iZzb, strZzk), zzjn.zzw, sko.i(iZzb, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), exc2) : cf3Var2.g(xrp.a(6, strZzk), zzjn.zzS, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", exc2);
                                    }
                                }
                                exc = exc2;
                            } catch (DeadObjectException e7) {
                                e = e7;
                                exc = exc2;
                            } catch (Exception e8) {
                                e = e8;
                                exc = exc2;
                            }
                            cz8Var.a(xrp.a(zgVar.a, (String) zgVar.d), new yqa((ArrayList) zgVar.b, (ArrayList) zgVar.c, (byte) 28));
                            return exc;
                        }
                        exc = exc2;
                        zgVar = new zg(0, "", arrayList, arrayList2);
                        cz8Var.a(xrp.a(zgVar.a, (String) zgVar.d), new yqa((ArrayList) zgVar.b, (ArrayList) zgVar.c, (byte) 28));
                        return exc;
                    }
                    zzc.zzo("BillingClient", "Querying product details is not supported.");
                    zzjn zzjnVar2 = zzjn.zzt;
                    mf3 mf3Var2 = xrp.m;
                    cf3Var2.y(7, mf3Var2, zzjnVar2);
                    cz8Var.a(mf3Var2, new yqa(zzca.zzk(), zzca.zzk(), (byte) 28));
                }
                return null;
        }
    }
}

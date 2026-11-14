package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import defpackage.a14;
import defpackage.kf3;
import defpackage.lf3;
import defpackage.mf3;
import defpackage.p3p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzc {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Intent intent, String str) {
        if (intent != null) {
            return zzq(intent.getExtras(), "ProxyBillingActivity");
        }
        zzo("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzo(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzn(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        zzo(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle zzc(Bundle bundle, String str, @Nullable String str2, long j) {
        bundle.putString("playBillingLibraryVersion", a14.a);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j);
        return bundle;
    }

    public static Bundle zzd(mf3 mf3Var, zzjn zzjnVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", mf3Var.a);
        bundle.putString("DEBUG_MESSAGE", mf3Var.c);
        bundle.putInt("LOG_REASON", zzjnVar.zza());
        return bundle;
    }

    public static Bundle zze(mf3 mf3Var, zzjn zzjnVar, @Nullable String str) {
        Bundle bundleZzd = zzd(mf3Var, zzjnVar);
        if (str != null) {
            bundleZzd.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return bundleZzd;
    }

    public static Bundle zzf(lf3 lf3Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, @Nullable String str2, long j, String str3, long j2) {
        Bundle bundle = new Bundle();
        zzc(bundle, a14.a, str2, j);
        bundle.putLong("billingClientTransactionId", j2);
        lf3Var.c.getClass();
        if (!TextUtils.isEmpty(lf3Var.b)) {
            bundle.putString("accountId", lf3Var.b);
        }
        if (lf3Var.f) {
            bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
        }
        if (!TextUtils.isEmpty(lf3Var.c.b)) {
            bundle.putString("oldSkuPurchaseToken", lf3Var.c.b);
        }
        lf3Var.c.getClass();
        if (z && z3) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z2 && z4) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        if (z5) {
            bundle.putBoolean("enableAlternativeBilling", true);
        }
        ArrayList arrayList = new ArrayList();
        for (kf3 kf3Var : lf3Var.d) {
            g40 g40Var = kf3Var.a;
            if (g40Var != null) {
                String str4 = kf3Var.b.c;
                zzeb zzebVarZza = zzec.zza();
                zzel zzelVarZza = zzem.zza();
                zzelVarZza.zza(zzs(str4, "subs", str3));
                zzebVarZza.zza(zzelVarZza);
                zzel zzelVarZza2 = zzem.zza();
                zzelVarZza2.zza(zzs(g40Var.b, "subs", str3));
                zzebVarZza.zzb(zzelVarZza2);
                zzebVarZza.zzc(4);
                arrayList.add(zzebVarZza.zzi());
            }
        }
        if (!arrayList.isEmpty()) {
            zzed zzedVarZza = zzee.zza();
            zzedVarZza.zza(arrayList);
            bundle.putByteArray("subscriptionProductReplacementParamsList", zzedVarZza.zzi().zzQ());
        }
        return bundle;
    }

    public static Bundle zzg(String str, @Nullable String str2, ArrayList arrayList, @Nullable String str3, @Nullable String str4, zza zzaVar, long j) {
        Bundle bundle = new Bundle();
        zzc(bundle, a14.a, str2, j);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>((Collection) zzca.zzm("subs", "inapp")));
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList<>((Collection) zzca.zzl("inapp")));
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>((Collection) zzca.zzl("inapp")));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        if (zzaVar.zza) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            egh eghVar = (egh) arrayList.get(i);
            arrayList2.add(null);
            eghVar.getClass();
            arrayList4.add(null);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        return bundle;
    }

    public static Bundle zzh(String str, @Nullable String str2, long j) {
        Bundle bundle = new Bundle();
        zzc(bundle, a14.a, str2, j);
        return bundle;
    }

    public static mf3 zzi(Intent intent, String str) {
        if (intent != null) {
            o1 o1VarA = mf3.a();
            o1VarA.c = zzb(intent.getExtras(), str);
            o1VarA.b = zzk(intent.getExtras(), str);
            return o1VarA.a();
        }
        zzo("BillingHelper", "Got null intent!");
        o1 o1VarA2 = mf3.a();
        o1VarA2.c = 6;
        o1VarA2.b = "An internal error occurred.";
        return o1VarA2.a();
    }

    public static c4b zzj(Bundle bundle, String str) {
        if (bundle == null) {
            return new c4b();
        }
        zzq(bundle, "BillingClient");
        bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
        return new c4b();
    }

    public static String zzk(Bundle bundle, String str) {
        if (bundle == null) {
            zzo(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzn(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        zzo(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String zzl(int i) {
        return zzb.zza(i).toString();
    }

    @Nullable
    public static List zzm(Bundle bundle, Set set) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            vah vahVarZzr = zzr(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"), set);
            if (vahVarZzr == null) {
                zzn("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(vahVarZzr);
            return arrayList;
        }
        zzn("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
            vah vahVarZzr2 = zzr(stringArrayList.get(i), stringArrayList2.get(i), set);
            if (vahVarZzr2 != null) {
                arrayList.add(vahVarZzr2);
            }
        }
        return arrayList;
    }

    public static void zzn(String str, String str2) {
        if (!Log.isLoggable(str, 2) || str2.isEmpty()) {
            return;
        }
        int i = 40000;
        while (!str2.isEmpty() && i > 0) {
            int iMin = Math.min(str2.length(), Math.min(4000, i));
            str2.substring(0, iMin);
            str2 = str2.substring(iMin);
            i -= iMin;
        }
    }

    public static void zzo(String str, String str2) {
    }

    public static void zzp(String str, String str2, @Nullable Throwable th) {
    }

    private static int zzq(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        zzo(str, "Unexpected null bundle received!");
        return 0;
    }

    @Nullable
    private static vah zzr(String str, String str2, Set set) {
        vah vahVar;
        vah vahVar2 = null;
        if (str == null || str2 == null) {
            zzn("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            vahVar = new vah(str, str2);
        } catch (JSONException e) {
            e = e;
        }
        try {
            set.isEmpty();
            return vahVar;
        } catch (JSONException e2) {
            e = e2;
            vahVar2 = vahVar;
            zzo("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return vahVar2;
        }
    }

    private static String zzs(String str, String str2, String str3) {
        return p3p.w("subs:", str3, ":", str);
    }
}

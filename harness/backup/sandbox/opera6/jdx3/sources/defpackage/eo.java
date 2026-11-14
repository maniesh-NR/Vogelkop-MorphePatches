package defpackage;

import ads_mobile_sdk.l31;
import ads_mobile_sdk.ov;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class eo extends ln implements nq {
    public final ArrayList w;

    public eo(ArrayList arrayList, String str, boolean z, dl dlVar, int i, bp bpVar, i3j i3jVar, ap apVar, String str2) {
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            arrayList2.add(((l31) obj).d);
        }
        String strP = CollectionsKt.P(arrayList2, ":", (CharSequence) null, (String) null, 0, (Function1) null, 62);
        ArrayList arrayList3 = new ArrayList(k95.o(arrayList, 10));
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList3.add(((l31) obj2).f);
        }
        String strP2 = CollectionsKt.P(arrayList3, ":", (CharSequence) null, (String) null, 0, (Function1) null, 62);
        ArrayList arrayList4 = new ArrayList(k95.o(arrayList, 10));
        int size3 = arrayList.size();
        while (i2 < size3) {
            Object obj3 = arrayList.get(i2);
            i2++;
            l31 l31Var = (l31) obj3;
            arrayList4.add(String.valueOf(Arrays.hashCode(new Object[]{l31Var.d, l31Var.f})));
        }
        String str3 = CollectionsKt.P(arrayList4, ",", (CharSequence) null, (String) null, 0, (Function1) null, 62) + "," + i;
        yo yoVar = yo.ADMOB;
        super(strP, "", null, null, strP2, str3, str, z, dlVar, null, rm.ICON, bpVar, i3jVar, apVar, str2);
        this.w = arrayList;
    }

    @Override // defpackage.nq
    public final mq a(dl dlVar, km kmVar, k8 k8Var, kq kqVar, List list) {
        return new fo(this, dlVar, kmVar, k8Var, kqVar, list);
    }

    @Override // defpackage.aqi, defpackage.yz
    public final void c() {
        super.c();
        ArrayList arrayList = this.w;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((l31) obj).destroy();
        }
    }

    @Override // defpackage.yz
    public final v50 e() {
        return v50.o;
    }

    @Override // defpackage.yz
    public final String l() {
        xzh responseInfo;
        ov ovVar = (l31) CollectionsKt.firstOrNull(this.w);
        if (ovVar == null || (responseInfo = ovVar.getResponseInfo()) == null) {
            return null;
        }
        return responseInfo.c();
    }

    @Override // defpackage.yz
    public final long m() {
        return this.w.size();
    }
}

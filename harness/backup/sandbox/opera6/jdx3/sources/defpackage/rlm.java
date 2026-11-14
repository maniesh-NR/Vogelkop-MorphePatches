package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rlm extends l7n {
    public final w6j b;
    public final pde c;
    public final ArrayList d = new ArrayList();
    public final LinkedHashMap e = new LinkedHashMap();
    public final sa2 f = new sa2((byte) 6);
    public boolean g;

    public rlm(w6j w6jVar) {
        this.b = w6jVar;
        klm klmVar = klm.a;
        rxh rxhVar = new rxh(2132022036);
        blm blmVar = blm.a;
        clm clmVar = clm.NOT_WORKING;
        rxh rxhVar2 = new rxh(2132022016);
        klm klmVar2 = klm.b;
        rxh rxhVar3 = new rxh(2132022033);
        blm blmVar2 = blm.b;
        this.c = new pde(f(new llm(klmVar, rxhVar, blmVar, Arrays.asList(new dlm(clmVar, rxhVar2, new llm(klmVar2, rxhVar3, blmVar2, Arrays.asList(new dlm(clm.NOT_WORKING_VITALS, new rxh(2132022022), null), new dlm(clm.NOT_WORKING_PAGE_LOADS, new rxh(2132022019), null), new dlm(clm.NOT_WORKING_SLOW_APP, new rxh(2132022020), null), new dlm(clm.NOT_WORKING_BATTERY_USAGE, new rxh(2132022017), null), new dlm(clm.NOT_WORKING_DEVICE_HEAT, new rxh(2132022018), null), new dlm(clm.NOT_WORKING_UI, new rxh(2132022021), null), new dlm(clm.NOT_WORKING_OTHER, new rxh(2132019047), null)))), new dlm(clm.AD_ISSUES, new rxh(2132022004), new llm(klm.c, new rxh(2132022031), blmVar2, Arrays.asList(new dlm(clm.AD_ISSUES_NEWS_FEED, new rxh(2132022006), null), new dlm(clm.AD_ISSUES_UNWANTED_SHORTCUTS, new rxh(2132022009), null), new dlm(clm.AD_ISSUES_AD_BLOCKER, new rxh(2132022005), null), new dlm(clm.AD_ISSUES_POPUPS, new rxh(2132022007), null), new dlm(clm.AD_ISSUES_QUALITY, new rxh(2132022008), null), new dlm(clm.AD_ISSUES_OTHER, new rxh(2132019047), null)))), new dlm(clm.UPDATE_ISSUES, new rxh(2132022023), new llm(klm.d, new rxh(2132022034), blmVar2, Arrays.asList(new dlm(clm.UPDATE_ISSUES_VITALS, new rxh(2132022022), null), new dlm(clm.UPDATE_ISSUES_NEW_UI, new rxh(2132022025), null), new dlm(clm.UPDATE_ISSUES_STARTUP, new rxh(2132022027), null), new dlm(clm.UPDATE_ISSUES_SLOW_APP, new rxh(2132022026), null), new dlm(clm.UPDATE_ISSUES_OTHER, new rxh(2132019047), null)))), new dlm(clm.MISSING_FEATURES, new rxh(2132022010), new llm(klm.e, new rxh(2132022032), blmVar2, Arrays.asList(new dlm(clm.MISSING_FEATURES_PERSONALIZATION, new rxh(2132022015), null), new dlm(clm.MISSING_FEATURES_DATA_IMPORT, new rxh(2132022012), null), new dlm(clm.MISSING_FEATURES_AI_EXPERIENCE, new rxh(2132022011), null), new dlm(clm.MISSING_FEATURES_EXTENSION_SUPPORT, new rxh(2132022014), null), new dlm(clm.MISSING_FEATURES_OTHER, new rxh(2132019047), null)))), new dlm(clm.OTHER, new rxh(2132019047), null))), v08.a));
    }

    public static r22 g(nlm nlmVar) {
        List list;
        dlm dlmVar;
        Integer num = (Integer) CollectionsKt.a0(nlmVar.c);
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        r22 r22Var = nlmVar.b;
        if (r22Var == null || (list = (List) r22Var.d) == null || (dlmVar = (dlm) list.get(iIntValue)) == null) {
            return null;
        }
        return dlmVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nlm f(defpackage.r22 r11, java.util.Set r12) {
        /*
            r10 = this;
            nlm r0 = new nlm
            java.util.ArrayList r1 = r10.d
            boolean r1 = r1.isEmpty()
            olm r2 = defpackage.qlm.a
            boolean r3 = r2.h(r11, r12)
            if (r3 == 0) goto L1a
            rxh r3 = new rxh
            r4 = 2132019049(0x7f140769, float:1.9676422E38)
            r3.<init>(r4)
        L18:
            r4 = r3
            goto L3a
        L1a:
            if (r11 != 0) goto L31
            rxh r3 = new rxh
            r4 = 2132017591(0x7f1401b7, float:1.9673465E38)
            r3.<init>(r4)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            sxh r4 = new sxh
            r5 = 2132022041(0x7f141319, float:1.968249E38)
            r4.<init>(r5, r3)
            goto L3a
        L31:
            rxh r3 = new rxh
            r4 = 2132020022(0x7f140b36, float:1.9678395E38)
            r3.<init>(r4)
            goto L18
        L3a:
            r3 = 1
            r5 = 0
            if (r11 == 0) goto L49
            r6 = r12
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L49
            r6 = r5
            goto L4b
        L49:
            r6 = r5
            r5 = r3
        L4b:
            if (r11 != 0) goto L56
            rxh r7 = new rxh
            r8 = 2132022028(0x7f14130c, float:1.9682464E38)
            r7.<init>(r8)
            goto L5e
        L56:
            rxh r7 = new rxh
            r8 = 2132022037(0x7f141315, float:1.9682482E38)
            r7.<init>(r8)
        L5e:
            w6j r8 = r10.b
            java.lang.Object r8 = r8.e
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L70
            boolean r2 = r2.h(r11, r12)
            if (r2 == 0) goto L70
            r2 = r6
            r6 = r7
            r7 = r3
            goto L73
        L70:
            r2 = r6
            r6 = r7
            r7 = r2
        L73:
            if (r11 != 0) goto L77
            r8 = r3
            goto L78
        L77:
            r8 = r2
        L78:
            boolean r9 = r10.g
            r2 = r11
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlm.f(r22, java.util.Set):nlm");
    }

    public final void h(int i, String str, boolean z) {
        pde pdeVar = this.c;
        nlm nlmVar = (nlm) pdeVar.g();
        r22 r22Var = nlmVar.b;
        Set setSingleton = nlmVar.c;
        dlm dlmVar = r22Var != null ? (dlm) ((List) r22Var.d).get(i) : null;
        if (dlmVar != null) {
            clm clmVar = dlmVar.a;
            boolean zContains = setSingleton.contains(Integer.valueOf(i));
            LinkedHashMap linkedHashMap = this.e;
            String str2 = (String) linkedHashMap.get(clmVar);
            if (zContains == z) {
                if (Intrinsics.a(str2, str)) {
                    return;
                }
            } else if (r22Var == null || ((blm) r22Var.c) != blm.b) {
                setSingleton = z ? Collections.singleton(Integer.valueOf(i)) : v08.a;
            } else {
                setSingleton = CollectionsKt.m0(setSingleton);
                if (zContains) {
                    setSingleton.remove(Integer.valueOf(i));
                } else {
                    setSingleton.add(Integer.valueOf(i));
                }
            }
            if (clmVar.a) {
                if (z) {
                    linkedHashMap.put(clmVar, str);
                } else {
                    linkedHashMap.remove(clmVar);
                }
            }
            xf8.F0(pdeVar, f(r22Var, setSingleton));
        }
    }

    public final void i(qlm qlmVar) {
        pde pdeVar = this.c;
        nlm nlmVar = (nlm) pdeVar.g();
        r22 r22Var = nlmVar.b;
        Set set = nlmVar.c;
        if (r22Var != null) {
            Set set2 = set;
            ArrayList arrayList = new ArrayList(k95.o(set2, 10));
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair((klm) r22Var.a, ((dlm) ((List) r22Var.d).get(((Number) it.next()).intValue())).a));
            }
            this.d.addAll(arrayList);
        }
        boolean z = nlmVar.g;
        w6j w6jVar = this.b;
        String str = z ? (String) w6jVar.e : null;
        if (!this.g && qlmVar.h(nlmVar.b, set)) {
            eek eekVar = new eek((Object) this, (Object) str, (byte) 19);
            if (this.f.e()) {
                eekVar.invoke();
            }
        }
        boolean z2 = nlmVar.h;
        if (qlmVar.d(z2)) {
            w6jVar.l(qlmVar.g(z2));
        } else {
            if (this.g) {
                return;
            }
            pdeVar.r(f(g(nlmVar), v08.a));
        }
    }
}

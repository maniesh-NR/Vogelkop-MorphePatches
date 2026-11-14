package defpackage;

import ads_mobile_sdk.pd;
import ads_mobile_sdk.w1;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ujp implements g, fel, iuj, etm, qro, scc, w62, z62, w7e {
    public static final /* synthetic */ ujp b = new ujp((byte) 2);
    public static final mf5 c = new mf5(10);
    public static final ah5 d = new ah5((byte) 0);
    public static final ah5 e = new ah5((byte) 1);
    public static final ah5 f = new ah5((byte) 2);
    public static final ah5 g = new ah5((byte) 3);
    public static final hf5 h = new hf5((byte) 9);
    public static final ujp i = new ujp((byte) 3);
    public static final voh j = new voh(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final /* synthetic */ ujp k = new ujp((byte) 6);
    public static final ujp l = new ujp((byte) 7);
    public static final ujp m = new ujp((byte) 8);
    public static final ujp n = new ujp((byte) 9);
    public static final hai o = new hai((byte) 25);
    public static final hai p = new hai((byte) 26);
    public static final hai q = new hai((byte) 27);
    public static final hai r = new hai((byte) 28);
    public static final ujp s = new ujp((byte) 11);
    public static final ujp t = new ujp((byte) 12);
    public static final ujp u = new ujp((byte) 13);
    public static ujp v;
    public final /* synthetic */ byte a;

    public /* synthetic */ ujp(byte b2) {
        this.a = b2;
    }

    public ujp(ClassLoader classLoader) {
        this.a = (byte) 29;
    }

    public static w1 g(int i2) throws Exception {
        w1 w1Var = (w1) w1.c.get(Integer.valueOf(i2));
        if (w1Var != null) {
            return w1Var;
        }
        throw new Exception("Invalid value for enum " + ujp.class.getName() + ": " + i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(int r12, java.lang.String r13) throws java.lang.NumberFormatException {
        /*
            android.content.SharedPreferences r0 = defpackage.ht5.a
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.String r2 = "bts_cached_uma"
            java.util.Set r1 = r0.getStringSet(r2, r1)
            r3 = 0
            if (r1 == 0) goto L19
            boolean r4 = r1.contains(r3)
            if (r4 == 0) goto L19
            r1.remove(r3)
        L19:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r13)
            java.lang.String r5 = ":"
            r4.append(r5)
            r4.append(r12)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.util.Iterator r6 = r1.iterator()
        L31:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L44
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = r7.startsWith(r4)
            if (r8 == 0) goto L31
            goto L45
        L44:
            r7 = r3
        L45:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r1)
            r1 = 2
            r6 = 1
            if (r7 == 0) goto L94
            java.lang.String[] r5 = r7.split(r5)
            int r8 = r5.length
            r9 = 3
            if (r8 != r9) goto L83
            r8 = 0
            r9 = r5[r8]
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L83
            r9 = r5[r6]
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L83
            r9 = r5[r1]
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L83
            r9 = r5[r6]     // Catch: java.lang.NumberFormatException -> L83
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L83
            r10 = r5[r1]     // Catch: java.lang.NumberFormatException -> L83
            int r10 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.NumberFormatException -> L83
            o1 r11 = new o1
            r5 = r5[r8]
            r11.<init>(r5, r9, r10, r1)
            goto L84
        L83:
            r11 = r3
        L84:
            if (r11 != 0) goto L8b
            o1 r11 = new o1
            r11.<init>(r13, r12, r6, r1)
        L8b:
            r4.remove(r7)
            int r12 = r11.d
            int r12 = r12 + r6
            r11.d = r12
            goto L99
        L94:
            o1 r11 = new o1
            r11.<init>(r13, r12, r6, r1)
        L99:
            java.lang.String r12 = r11.toString()
            r4.add(r12)
            android.content.SharedPreferences$Editor r12 = r0.edit()
            boolean r13 = r4.contains(r3)
            if (r13 == 0) goto Lad
            r4.remove(r3)
        Lad:
            r12.putStringSet(r2, r4)
            r12.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ujp.h(int, java.lang.String):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static tfb j(orb orbVar) throws JSONException {
        lfb lfbVar;
        mfb mfbVar;
        String strE = orbVar.e("type");
        JSONObject jSONObject = orbVar.a;
        ofb ofbVar = null;
        switch (strE.hashCode()) {
            case -1399120732:
                if (strE.equals("aria-chat-item")) {
                    long j2 = jSONObject.getLong("userChatItemId");
                    String strM = orbVar.m("messageId", (String) null);
                    String strE2 = orbVar.e("type");
                    String strE3 = orbVar.e("message");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    orb orbVarC = orbVar.c("links");
                    Iterator<String> itKeys = orbVarC.a.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        ArrayList arrayList = new ArrayList();
                        String str = strE2;
                        vpb vpbVarB = orbVarC.b(next);
                        String str2 = strM;
                        String str3 = strE3;
                        int i2 = 0;
                        for (int length = vpbVarB.a.length(); i2 < length; length = length) {
                            arrayList.add(vpbVarB.d(i2));
                            i2++;
                        }
                        linkedHashMap.put(next, arrayList);
                        strE2 = str;
                        strM = str2;
                        strE3 = str3;
                    }
                    String str4 = strE2;
                    String str5 = strM;
                    String str6 = strE3;
                    ArrayList arrayList2 = new ArrayList();
                    vpb vpbVarB2 = orbVar.b("sia");
                    int length2 = vpbVarB2.a.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        orb orbVarC2 = vpbVarB2.c(i3);
                        arrayList2.add(new kij(orbVarC2.e("searchTerm"), orbVarC2.e("searchUrl")));
                    }
                    String strM2 = orbVar.m("feedback", (String) null);
                    if (strM2 == null) {
                        lfbVar = null;
                    } else {
                        lfb[] lfbVarArrValues = lfb.values();
                        int length3 = lfbVarArrValues.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length3) {
                                lfbVar = lfb.UNDEFINED;
                            } else {
                                lfb lfbVar2 = lfbVarArrValues[i4];
                                if (lfbVar2 == lfb.UNDEFINED || !strM2.equals(lfbVar2.a)) {
                                    i4++;
                                } else {
                                    lfbVar = lfbVar2;
                                }
                            }
                        }
                    }
                    String strM3 = orbVar.m(NotificationCompat.CATEGORY_STATUS, (String) null);
                    if (strM3 == null) {
                        mfbVar = null;
                    } else {
                        mfb[] mfbVarArrValues = mfb.values();
                        int length4 = mfbVarArrValues.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length4) {
                                mfbVar = mfb.UNDEFINED;
                            } else {
                                mfbVar = mfbVarArrValues[i5];
                                if (mfbVar == mfb.UNDEFINED || !strM3.equals(mfbVar.a)) {
                                    i5++;
                                }
                            }
                        }
                    }
                    return new kfb(j2, str5, str4, str6, linkedHashMap, arrayList2, lfbVar, mfbVar, jSONObject.getLong("chatItemId"), jSONObject.getLong("chatId"), jSONObject.getLong("created"), jSONObject.getLong("modified"));
                }
                break;
            case -1166716360:
                if (strE.equals("blob-chat-item")) {
                    return new pfb(orbVar.e("type"), orbVar.e("blob"), jSONObject.getLong("chatItemId"), jSONObject.getLong("chatId"), jSONObject.getLong("created"), jSONObject.getLong("modified"));
                }
                break;
            case 81472742:
                if (strE.equals("user-chat-item")) {
                    return new qgb(orbVar.e("type"), orbVar.e("message"), jSONObject.getLong("chatItemId"), jSONObject.getLong("chatId"), jSONObject.getLong("created"), jSONObject.getLong("modified"));
                }
                break;
            case 826288867:
                if (strE.equals("error-chat-item")) {
                    long j3 = jSONObject.getLong("userChatItemId");
                    String strE4 = orbVar.e("type");
                    String strE5 = orbVar.e("error");
                    String strM4 = orbVar.m("stack", (String) null);
                    String strM5 = orbVar.m("code", (String) null);
                    if (strM5 != null) {
                        ofb[] ofbVarArrValues = ofb.values();
                        int length5 = ofbVarArrValues.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length5) {
                                ofbVar = ofb.UNDEFINED;
                            } else {
                                ofbVar = ofbVarArrValues[i6];
                                if (ofbVar == ofb.UNDEFINED || !strM5.equals(ofbVar.a)) {
                                    i6++;
                                }
                            }
                        }
                    }
                    return new nfb(j3, strE4, strE5, strM4, ofbVar, jSONObject.getLong("chatItemId"), jSONObject.getLong("chatId"), jSONObject.getLong("created"), jSONObject.getLong("modified"));
                }
                break;
        }
        return new ufb(orbVar);
    }

    public static n03 k(View view) {
        Object tag = view.getTag(2131362117);
        n03 n03Var = tag instanceof n03 ? (n03) tag : null;
        if (n03Var != null) {
            return n03Var;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            return k(view2);
        }
        return null;
    }

    public static ujp l() {
        ujp ujpVar = v;
        if (ujpVar != null) {
            return ujpVar;
        }
        ujp ujpVar2 = new ujp((byte) 23);
        v = ujpVar2;
        return ujpVar2;
    }

    public static int n(int i2) {
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 15;
        }
        if (i2 == 21) {
            return 3;
        }
        if (i2 == 22) {
            return 14;
        }
        if (i2 == 42) {
            return 4;
        }
        if (i2 == 43) {
            return 5;
        }
        if (i2 == 77) {
            return 6;
        }
        if (i2 == 83) {
            return 10;
        }
        if (i2 == 91) {
            return 12;
        }
        if (i2 == 110) {
            return 27;
        }
        if (i2 == 221) {
            return 31;
        }
        if (i2 == 33656) {
            return 0;
        }
        if (i2 == 71300) {
            return 1;
        }
        switch (i2) {
            case 53:
                return 8;
            case 54:
                return 9;
            case 55:
                return 13;
            case 56:
                return 18;
            case 57:
                return 25;
            case 58:
                return 29;
            case 59:
                return 30;
            default:
                switch (i2) {
                    case pd.U0 /* 102 */:
                        return 19;
                    case pd.K0 /* 103 */:
                        return 20;
                    case pd.V0 /* 104 */:
                        return 21;
                    case pd.W0 /* 105 */:
                        return 22;
                    case pd.g1 /* 106 */:
                        return 23;
                    case pd.h1 /* 107 */:
                        return 24;
                    default:
                        switch (i2) {
                            case 112:
                                return 32;
                            case 113:
                                return 33;
                            case 114:
                                return 34;
                            case 115:
                                return 35;
                            case 116:
                                return 36;
                            case 117:
                                return 37;
                            case 118:
                                return 38;
                            case 119:
                                return 39;
                            default:
                                return -1;
                        }
                }
        }
    }

    @Override // defpackage.fel
    public final Map a(wwh wwhVar) {
        return n08.a;
    }

    @Override // defpackage.w62, defpackage.z62
    public final float b() {
        return 0.0f;
    }

    @Override // defpackage.w62
    public final void c(n27 n27Var, int i2, int[] iArr, d2c d2cVar, int[] iArr2) {
        if (d2cVar == d2c.a) {
            b72.d(i2, iArr, iArr2, false);
        } else {
            b72.d(i2, iArr, iArr2, true);
        }
    }

    @Override // defpackage.scc
    public final void d(kdc kdcVar) {
        kdcVar.onStart();
    }

    @Override // defpackage.z62
    public final void e(n27 n27Var, int i2, int[] iArr, int[] iArr2) {
        b72.d(i2, iArr, iArr2, false);
    }

    @Override // defpackage.scc
    public final void f(kdc kdcVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    @Override // defpackage.qro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList i(zjo r23, pro r24) {
        /*
            r22 = this;
            r0 = r23
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r2 = r0.c
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lce
            java.lang.Object r3 = r2.next()
            gho r3 = (gho) r3
            java.util.List r4 = r3.a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L24:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L4e
            java.lang.Object r6 = r4.next()
            r7 = r6
            oho r7 = (oho) r7
            r10 = r24
            sm r8 = r10.b
            qto r9 = fuo.Companion
            sho r7 = r7.l
            int r7 = r7.a
            r9.getClass()
            fuo r7 = qto.a(r7)
            java.util.List r8 = r8.a
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L24
            r5.add(r6)
            goto L24
        L4e:
            r10 = r24
            int r4 = r5.size()
            r7 = 0
        L55:
            if (r7 >= r4) goto Ld
            java.lang.Object r8 = r5.get(r7)
            int r7 = r7 + 1
            oho r8 = (oho) r8
            sho r9 = r8.l
            iio r9 = r9.e
            if (r9 == 0) goto Lcb
            gzo r15 = new gzo
            java.lang.String r12 = r0.a
            java.lang.String r13 = r3.b
            java.lang.String r14 = r0.b
            r11 = r15
            java.lang.String r15 = r8.b
            java.lang.String r6 = r8.f
            java.lang.String r19 = ""
            if (r6 != 0) goto L79
            r16 = r19
            goto L7b
        L79:
            r16 = r6
        L7b:
            java.lang.Double r6 = r8.p
            r21 = r2
            java.lang.String r2 = r0.d
            if (r2 != 0) goto L88
            r18 = r19
        L85:
            r17 = r6
            goto L8b
        L88:
            r18 = r2
            goto L85
        L8b:
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r2 = r0.a
            java.lang.String r12 = r3.b
            java.lang.String r13 = r0.b
            java.lang.String r6 = r0.d
            if (r6 != 0) goto L9b
            r14 = r19
            goto L9c
        L9b:
            r14 = r6
        L9c:
            java.lang.String r6 = r8.c
            z8p r15 = aap.f()
            boolean r15 = r15.A
            if (r15 == 0) goto Lb2
            zyk r15 = fap.a
            boolean r15 = fap.c
            if (r15 == 0) goto Lb2
            r15 = 1
            r19 = r15
        Laf:
            r16 = r8
            goto Lb5
        Lb2:
            r19 = 0
            goto Laf
        Lb5:
            ylp r8 = new ylp
            r18 = r9
            r9 = 0
            r20 = 1
            r17 = r6
            r15 = r11
            r11 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1.add(r8)
            r10 = r24
            r2 = r21
            goto L55
        Lcb:
            r10 = r24
            goto L55
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ujp.i(zjo, pro):java.util.ArrayList");
    }

    public final Object m(orb orbVar) throws JSONException {
        if (orbVar.m("id", "").isEmpty()) {
            o.a("id can't be empty for a Board");
            return null;
        }
        if (orbVar.m("name", "").isEmpty()) {
            o.a("name can't be empty for a Board");
            return null;
        }
        orbVar.m("description", "");
        orbVar.e("type");
        orb orbVarI = orbVar.i("cover");
        if (orbVarI != null) {
            int iG = orbVarI.g("width");
            int iG2 = orbVarI.g("height");
            if (iG == 0 || iG2 == 0) {
                o.a("width & height can not be null on Thumbnail.");
                return null;
            }
            orbVarI.m("url", "");
            orbVarI.m("preview_url", "");
            orbVarI.m("format", "");
            orbVarI.m("id", "");
        }
        orb orbVarI2 = orbVar.i("thumbnail");
        if (orbVarI2 != null) {
            int iG3 = orbVarI2.g("width");
            int iG4 = orbVarI2.g("height");
            if (iG3 == 0 || iG4 == 0) {
                o.a("width & height can not be null on Thumbnail.");
                return null;
            }
            orbVarI2.m("url", "");
            orbVarI2.m("preview_url", "");
            orbVarI2.m("format", "");
            orbVarI2.m("id", "");
        }
        orbVar.g("post_count");
        orbVar.g("active_users");
        vpb vpbVarH = orbVar.h("admin_list");
        ArrayList arrayList = new ArrayList();
        if (vpbVarH != null) {
            for (int i2 = 0; i2 < vpbVarH.a.length(); i2++) {
                if (vpbVarH.e(i2) != null) {
                    arrayList.add((evj) evj.d.t(vpbVarH.e(i2)));
                }
            }
        }
        vpb vpbVarH2 = orbVar.h("hot_tags");
        ArrayList arrayList2 = new ArrayList();
        if (vpbVarH2 != null) {
            for (int i3 = 0; i3 < vpbVarH2.a.length(); i3++) {
                orb orbVarE = vpbVarH2.e(i3);
                if (orbVarE != null) {
                    arrayList2.add((gbl) gbl.b.t(orbVarE));
                }
            }
        }
        vpb vpbVarH3 = orbVar.h("posts");
        ArrayList arrayList3 = new ArrayList();
        if (vpbVarH3 != null) {
            for (int i4 = 0; i4 < vpbVarH3.a.length(); i4++) {
                orb orbVarE2 = vpbVarH3.e(i4);
                if (orbVarE2 != null) {
                    arrayList3.add((log) log.h.d(orbVarE2));
                }
            }
        }
        orbVar.j("create_time");
        orbVar.a.optInt("post_desc_max_lines", 2);
        tk3 tk3Var = new tk3(arrayList, arrayList2, arrayList3);
        tk3Var.b(orbVar);
        return tk3Var;
    }

    @Override // defpackage.iuj
    public final boolean o(Object obj, Object obj2) {
        return obj == obj2;
    }

    public final String toString() {
        switch (this.a) {
            case 9:
                return "ReferentialEqualityPolicy";
            case 22:
                return "Arrangement#SpaceBetween";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.etm
    public final boolean v() {
        return true;
    }

    @Override // defpackage.w7e
    public final v7e w(d5o d5oVar) {
        return new v24(new ydp((byte) 26), (byte) 0);
    }
}

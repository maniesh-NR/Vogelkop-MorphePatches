package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import defpackage.cip;
import defpackage.cpo;
import defpackage.cs5;
import defpackage.flp;
import defpackage.hzo;
import defpackage.r1p;
import defpackage.v1p;
import defpackage.yso;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.chromium.net.CronetProvider;

/* loaded from: classes.dex */
public final class fo extends ozb implements Function1 {
    public static final fo a;
    public static final fo a$1;
    public static final fo a$10;
    public static final fo a$11;
    public static final fo a$12;
    public static final fo a$13;
    public static final fo a$14;
    public static final fo a$15;
    public static final fo a$16;
    public static final fo a$17;
    public static final fo a$18;
    public static final fo a$19;
    public static final fo a$2;
    public static final fo a$20;
    public static final fo a$21;
    public static final fo a$22;
    public static final fo a$23;
    public static final fo a$24;
    public static final fo a$25;
    public static final fo a$26;
    public static final fo a$27;
    public static final fo a$28;
    public static final fo a$29;
    public static final fo a$3;
    public static final fo a$4;
    public static final fo a$5;
    public static final fo a$6;
    public static final fo a$7;
    public static final fo a$8;
    public static final fo a$9;
    public final /* synthetic */ byte i;

    static {
        int i = 1;
        a$1 = new fo((byte) 1, i);
        a$2 = new fo((byte) 2, i);
        a$3 = new fo((byte) 3, i);
        a = new fo((byte) 0, i);
        a$4 = new fo((byte) 4, i);
        a$5 = new fo((byte) 5, i);
        a$6 = new fo((byte) 6, i);
        a$7 = new fo((byte) 7, i);
        a$8 = new fo((byte) 8, i);
        a$9 = new fo((byte) 9, i);
        a$10 = new fo((byte) 10, i);
        a$11 = new fo((byte) 11, i);
        a$12 = new fo((byte) 12, i);
        a$13 = new fo((byte) 13, i);
        a$14 = new fo((byte) 14, i);
        a$15 = new fo((byte) 15, i);
        a$16 = new fo((byte) 16, i);
        a$17 = new fo((byte) 17, i);
        a$18 = new fo((byte) 18, i);
        a$19 = new fo((byte) 19, i);
        a$20 = new fo((byte) 20, i);
        a$21 = new fo((byte) 21, i);
        a$22 = new fo((byte) 22, i);
        a$23 = new fo((byte) 23, i);
        a$24 = new fo((byte) 24, i);
        a$25 = new fo((byte) 25, i);
        a$26 = new fo((byte) 26, i);
        a$27 = new fo((byte) 27, i);
        a$28 = new fo((byte) 28, i);
        a$29 = new fo((byte) 29, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fo(byte b, int i) {
        super(i);
        this.i = b;
    }

    public final Object invoke(Object obj) {
        switch (this.i) {
            case 0:
                return Boolean.valueOf(((pqb) obj).c());
            case 1:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                return entry.getKey() + ":" + entry.getValue();
            case 3:
                return Boolean.valueOf(((y31) obj) == null);
            case 4:
                cip cipVar = ((c33) obj).a;
                cipVar.b$1();
                u23 u23Var = (u23) cipVar.b;
                u23Var.bitField0_ |= 1;
                u23Var.isInstallReferrerReported_ = true;
                return Unit.a;
            case 5:
                Map.Entry entry2 = (Map.Entry) obj;
                return entry2.getKey() + " = " + entry2.getValue();
            case 6:
                on7 on7Var = pn7.b;
                return new pn7(cs5.x0(((pqb) obj).f(), un7.h));
            case 7:
                return Double.valueOf(((pqb) obj).d());
            case 8:
                return h1.q();
            case 9:
                hgc hgcVar = ((pqb) obj).h().a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(qbd.a(hgcVar.d));
                egc it = hgcVar.entrySet().iterator();
                while (it.hasNext()) {
                    ggc ggcVarA = it.a();
                    linkedHashMap.put(ggcVarA.getKey(), Double.valueOf(((pqb) ggcVarA.getValue()).d()));
                }
                return linkedHashMap;
            case 10:
                return Float.valueOf(((pqb) obj).e());
            case 11:
                return Integer.valueOf(((pqb) obj).f());
            case 12:
                List listY = StringsKt.Y(((pqb) obj).n(), new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList(k95.o(listY, 10));
                Iterator it2 = listY.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
                }
                return arrayList;
            case 13:
                return ((pqb) obj).h();
            case 14:
                i70 i70Var = (i70) obj;
                long jL = pn7.l(i70Var.c, i70Var.b.b);
                return i70Var.a + "." + pn7.f(jL);
            case 15:
                return StringsKt.Y(((pqb) obj).n(), new String[]{","}, 0, 6);
            case 16:
                return Long.valueOf(((pqb) obj).j());
            case 17:
                return Double.valueOf(((pqb) obj).d());
            case 18:
                on7 on7Var2 = pn7.b;
                return new pn7(cs5.x0(((pqb) obj).f(), un7.d));
            case 19:
                return Integer.valueOf(((pqb) obj).f());
            case 20:
                on7 on7Var3 = pn7.b;
                return new pn7(cs5.x0(((pqb) obj).f(), un7.f));
            case 21:
                on7 on7Var4 = pn7.b;
                return new pn7(cs5.x0(((pqb) obj).f(), un7.e));
            case 22:
                return StringsKt.Y(((pqb) obj).n(), new String[]{";"}, 0, 6);
            case 23:
                return ((pqb) obj).n();
            case 24:
                hgc hgcVar2 = ((pqb) obj).h().a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(qbd.a(hgcVar2.d));
                egc it3 = hgcVar2.entrySet().iterator();
                while (it3.hasNext()) {
                    ggc ggcVarA2 = it3.a();
                    linkedHashMap2.put(ggcVarA2.getKey(), ((pqb) ggcVarA2.getValue()).n());
                }
                return linkedHashMap2;
            case 25:
                h1 h1Var = (h1) obj;
                Collection collectionValues = h1Var.u().values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    return h1Var;
                }
                Iterator it4 = collectionValues.iterator();
                while (it4.hasNext()) {
                    Collection collectionValues2 = ((ds0) it4.next()).o().values();
                    if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                        Iterator it5 = collectionValues2.iterator();
                        while (it5.hasNext()) {
                            flp flpVarR = ((h6) it5.next()).r();
                            if (!(flpVarR instanceof Collection) || !flpVarR.isEmpty()) {
                                Iterator<E> it6 = flpVarR.iterator();
                                while (it6.hasNext()) {
                                    if (((c6) it6.next()).r$1() != 2) {
                                        hzo hzoVar = (hzo) h1Var.n();
                                        for (String str : CollectionsKt.k0(new v1p(hzoVar.e().keySet()))) {
                                            ds0 ds0Var = (ds0) hzoVar.e().get(str);
                                            if (ds0Var != null) {
                                                hzoVar.e();
                                                yso ysoVar = (yso) ds0Var.n();
                                                for (String str2 : CollectionsKt.k0(new v1p(ysoVar.e().keySet()))) {
                                                    h6 h6Var = (h6) ysoVar.e().get(str2);
                                                    if (h6Var != null) {
                                                        ysoVar.e();
                                                        r1p r1pVar = (r1p) h6Var.n();
                                                        int i = 0;
                                                        for (c6 c6Var : r1pVar.f()) {
                                                            int i2 = i + 1;
                                                            if (c6Var.r$1() != 2) {
                                                                r1pVar.f();
                                                                cpo cpoVar = (cpo) c6Var.n();
                                                                cpoVar.b(2);
                                                                c6 c6Var2 = (c6) cpoVar.a();
                                                                r1pVar.b$1();
                                                                ((h6) r1pVar.b).a(i, c6Var2);
                                                            }
                                                            i = i2;
                                                        }
                                                        ysoVar.c(str2, (h6) r1pVar.a());
                                                    }
                                                }
                                                hzoVar.c(str, (ds0) ysoVar.a());
                                            }
                                        }
                                        return (h1) hzoVar.a();
                                    }
                                }
                            }
                        }
                    }
                }
                return h1Var;
            case 26:
                return new ls1((td1) obj);
            case 27:
                return Boolean.valueOf(Intrinsics.a(((CronetProvider) obj).getName(), "Google-Play-Services-Cronet-Provider"));
            case 28:
                String str3 = (String) obj;
                return Boolean.valueOf(!(str3 == null || str3.length() == 0));
            default:
                return new ms1((InternalNativeAd) obj);
        }
    }
}

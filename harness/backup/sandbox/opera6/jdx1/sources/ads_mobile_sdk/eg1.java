package ads_mobile_sdk;

import android.text.TextUtils;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import defpackage.ao;
import defpackage.dvj;
import defpackage.en;
import defpackage.esg;
import defpackage.fn;
import defpackage.qcp;
import defpackage.qn;
import defpackage.rnp;
import defpackage.rzo;
import defpackage.s6h;
import defpackage.un;
import defpackage.wn;
import defpackage.xrc;
import defpackage.xzh;
import defpackage.y7h;
import defpackage.yn;
import defpackage.yrc;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class eg1 extends y7h {
    public static final dvj b = new dvj((byte) 12);
    public final Object a;
    public final /* synthetic */ byte d;

    public /* synthetic */ eg1(Object obj, byte b2) {
        this.d = b2;
        this.a = obj;
    }

    private final void a$ads_mobile_sdk$eg1() {
    }

    private final void a$ads_mobile_sdk$ge1() {
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.qcp r22, nt5 r23) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.eg1.a(qcp, nt5):java.lang.Object");
    }

    @Override // defpackage.y7h
    public final Object a(rnp rnpVar, kuk kukVar) {
        Object fnVar;
        byte b2 = this.d;
        Object obj = this.a;
        switch (b2) {
            case 0:
                return a((qcp) rnpVar, (nt5) kukVar);
            case 1:
                pyl pylVar = (pyl) obj;
                qcp qcpVar = (qcp) rnpVar;
                if (qcpVar instanceof ls1) {
                    xrc xrcVar = xrc.INTERNAL_ERROR;
                    xzh xzhVar = ((ls1) qcpVar).a.k;
                    fnVar = new en(new yrc(xrcVar, "Invalid native ad response, icon ad requests should never return a banner ad.", xzhVar != null ? xzhVar : null));
                } else {
                    if (!(qcpVar instanceof ms1)) {
                        h9o.p();
                        return null;
                    }
                    InternalNativeAd internalNativeAd = ((ms1) qcpVar).a;
                    zf1 zf1Var = internalNativeAd.a.g;
                    if (zf1Var == null) {
                        xrc xrcVar2 = xrc.INVALID_AD_RESPONSE;
                        xzh xzhVar2 = internalNativeAd.k;
                        fnVar = new en(new yrc(xrcVar2, "Icon ad response does not contain icon", xzhVar2 != null ? xzhVar2 : null));
                    } else {
                        fnVar = new fn(new l31(new bu1(internalNativeAd), new yqa(zf1Var.a, zf1Var.b, (byte) 19)));
                    }
                }
                if (fnVar instanceof fn) {
                    ((ArrayList) pylVar.c).add(((fn) fnVar).a);
                } else if (fnVar instanceof en) {
                    pylVar.d = ((en) fnVar).a;
                }
                return Unit.a;
            default:
                esg esgVar = (esg) obj;
                ai1 ai1Var = new ai1((rzo) rnpVar);
                yn ynVar = (yn) esgVar.c;
                String str = ((k43) ynVar).c;
                ao aoVar = ynVar.n;
                boolean z = aoVar.p;
                dl dlVar = ((k43) ynVar).d;
                int i = ao.u + 1;
                ao.u = i;
                bp bpVar = (bp) esgVar.b;
                i3j i3jVar = ((bqi) aoVar).h;
                ap apVar = ((bqi) aoVar).i;
                xzh responseInfo = ai1Var.getResponseInfo();
                go goVar = new go(ai1Var, str, z, dlVar, i, bpVar, i3jVar, apVar, responseInfo != null ? responseInfo.getAdapterClassName() : null);
                ai1Var.c.setValue(ai1.e[0], new defpackage.xn(esgVar, bpVar, goVar));
                vml.e(new xa(ynVar, goVar, (byte) 4));
                return Unit.a;
        }
    }

    @Override // defpackage.y7h
    public final void a() {
        switch (this.d) {
            case 1:
                pyl pylVar = (pyl) this.a;
                un unVar = (un) pylVar.f;
                ArrayList arrayList = (ArrayList) pylVar.c;
                int i = 0;
                if (arrayList.size() < Math.min(3, pylVar.b)) {
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((l31) obj).destroy();
                    }
                    yrc yrcVar = (yrc) pylVar.d;
                    if (yrcVar == null) {
                        yrcVar = new yrc(xrc.INTERNAL_ERROR, "", null);
                    }
                    yrc yrcVar2 = yrcVar;
                    Long lValueOf = Long.valueOf(arrayList.size());
                    unVar.getClass();
                    vml.e(new qn(unVar, yrcVar2, v50.o, lValueOf, (byte) 0));
                    break;
                } else {
                    bp bpVar = new bp();
                    TreeSet treeSet = new TreeSet();
                    l31 l31Var = (l31) arrayList.get(0);
                    ap[] apVarArr = new ap[arrayList.size()];
                    AtomicReference atomicReference = new AtomicReference();
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        l31 l31Var2 = (l31) arrayList.get(i2);
                        xzh responseInfo = l31Var2.getResponseInfo();
                        int i3 = ao.s;
                        String adapterClassName = responseInfo != null ? responseInfo.getAdapterClassName() : null;
                        if (adapterClassName != null) {
                            treeSet.add(adapterClassName);
                        }
                        l31Var2.i.setValue(l31.k[0], new wn(pylVar, bpVar, l31Var2, l31Var, apVarArr, i2, atomicReference));
                        i2++;
                        atomicReference = atomicReference;
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    String strJoin = treeSet.isEmpty() ? null : TextUtils.join(":", treeSet);
                    String str = (String) pylVar.e;
                    ao aoVar = unVar.n;
                    boolean z = aoVar.p;
                    dl dlVar = ((k43) unVar).d;
                    int i4 = ao.u + 1;
                    ao.u = i4;
                    eo eoVar = new eo(arrayList, str, z, dlVar, i4, bpVar, ((bqi) aoVar).h, ((bqi) aoVar).i, strJoin);
                    atomicReference2.set(eoVar);
                    vml.e(new xa(unVar, eoVar, (byte) 4));
                    break;
                }
        }
    }

    @Override // defpackage.y7h
    public final void a(yrc yrcVar) {
        byte b2 = this.d;
        Object obj = this.a;
        switch (b2) {
            case 0:
                vml.e(new qn((yn) ((s6h) obj).b, yrcVar, null, null, (byte) 0));
                break;
            case 1:
                ((pyl) obj).d = yrcVar;
                break;
            default:
                vml.e(new qn((yn) ((esg) obj).c, yrcVar, v50.k, null, (byte) 0));
                break;
        }
    }
}

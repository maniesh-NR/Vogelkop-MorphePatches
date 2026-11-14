package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;

/* loaded from: classes.dex */
public final /* synthetic */ class gv8 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gv8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: oqb */
    public final Object invoke() throws oqb {
        String[] strArrNames;
        byte b = this.a;
        byte b2 = 15;
        boolean z = false;
        z = false;
        byte b3 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(((hv8) obj2).b().a.k((Context) obj));
            case 1:
                k99 k99Var = (k99) obj2;
                bf9 bf9VarS = k99Var.a.b.s();
                aib.B(bf9VarS, (BrowserActivity) obj, new j99(k99Var, z ? (byte) 1 : (byte) 0), new vme((byte) 19));
                return bf9VarS;
            case 2:
                ((pqh) obj2).a = z4o.N((tg9) obj, yeg.a);
                return Unit.a;
            case 3:
                ((pqh) obj2).a = ((vg9) obj).V0();
                return Unit.a;
            case 4:
                ((pqh) obj2).a = z4o.N((ah9) obj, yeg.a);
                return Unit.a;
            case 5:
                ((eq9) obj2).c.c((fq9) obj);
                return Unit.a;
            case 6:
                ((Function1) obj2).invoke((cof) obj);
                return Unit.a;
            case 7:
                ((Function1) obj2).invoke((zca) obj);
                return Unit.a;
            case 8:
                ((lea) obj2).d((b8e) obj);
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return Http2Connection.ReaderRunnable.c((Http2Connection) obj2, (Http2Stream) obj);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return Http2Connection.ReaderRunnable.a((Http2Connection) obj2, (pqh) obj);
            case 11:
                ((k6l) obj2).s.H((wjb) obj);
                return Unit.a;
            case 12:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                rpb rpbVar = (rpb) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                gqb gqbVar = rpbVar.a;
                lrb.d(rpbVar, serialDescriptor);
                int iE = serialDescriptor.e();
                for (int i = 0; i < iE; i++) {
                    List listG = serialDescriptor.g(i);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listG) {
                        if (obj3 instanceof krb) {
                            arrayList.add(obj3);
                        }
                    }
                    krb krbVar = (krb) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (krbVar != null && (strArrNames = krbVar.names()) != null) {
                        for (String str : strArrNames) {
                            String str2 = Intrinsics.a(serialDescriptor.d(), g2j.b) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                throw new oqb(wyh.v(-1, "The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.f(i) + " is already one of the names for " + str2 + ' ' + serialDescriptor.f(((Number) rbd.b(linkedHashMap, str)).intValue()) + " in " + serialDescriptor, (String) null, (String) null, (String) null), null);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? n08.a : linkedHashMap;
            case 13:
                ((jvj) obj2).a.c((tv3) obj);
                return Unit.a;
            case 14:
                pqh pqhVar = (pqh) obj;
                tah tahVar = ((m3c) obj2).F;
                if ((((b8e) tahVar.g).d & 8) != 0) {
                    for (b8e b8eVar = (lbl) tahVar.f; b8eVar != null; b8eVar = b8eVar.e) {
                        if ((b8eVar.c & 8) != 0) {
                            b8e b8eVarU = b8eVar;
                            dfe dfeVar = null;
                            while (b8eVarU != null) {
                                if (b8eVarU instanceof i0j) {
                                    i0j i0jVar = (i0j) b8eVarU;
                                    if (i0jVar.t()) {
                                        f0j f0jVar = new f0j();
                                        pqhVar.a = f0jVar;
                                        f0jVar.d = true;
                                    }
                                    if (i0jVar.D0()) {
                                        ((f0j) pqhVar.a).c = true;
                                    }
                                    i0jVar.R((q0j) pqhVar.a);
                                } else if ((b8eVarU.c & 8) != 0 && (b8eVarU instanceof i17)) {
                                    int i2 = 0;
                                    for (b8e b8eVar2 = ((i17) b8eVarU).p; b8eVar2 != null; b8eVar2 = b8eVar2.f) {
                                        if ((b8eVar2.c & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                b8eVarU = b8eVar2;
                                            } else {
                                                if (dfeVar == null) {
                                                    dfeVar = new dfe(new b8e[16]);
                                                }
                                                if (b8eVarU != null) {
                                                    dfeVar.c(b8eVarU);
                                                    b8eVarU = null;
                                                }
                                                dfeVar.c(b8eVar2);
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                b8eVarU = ui6.U(dfeVar);
                            }
                        }
                    }
                }
                return Unit.a;
            case 15:
                gu6 gu6Var = (gu6) obj;
                gxf gxfVar = (gxf) ((i37) obj2).getValue();
                return new hxf(gu6Var, gxfVar, new ro9((IntRange) ((o5c) ((sxf) gu6Var).d.g).getValue(), gxfVar));
            case 16:
                return new z6c((vji) obj2, n08.a, (uji) obj);
            case 17:
                ((Function1) obj2).invoke((l7c) obj);
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                ((tjc) obj2).g((s3g) obj);
                return Unit.a;
            case 19:
                ekc ekcVar = (ekc) obj;
                if (((ekc) obj2).i() && ekcVar.i()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case SizeUtil.textSize0 /* 20 */:
                qkc qkcVar = (qkc) obj2;
                boolean zBooleanValue = ((Boolean) ((tkc) qkcVar.f.a).i.a.e.g()).booleanValue();
                ehc ehcVarB = a.b();
                ehcVarB.add(new gtd(new rxh(2132018989), null, new jf7(qkcVar, (zmc) obj, b2)));
                if (zBooleanValue) {
                    boolean z2 = qkcVar.m;
                    ehcVarB.add(new gtd(new rxh(!z2 ? 2132019521 : 2132019516), null, new hz3(b3, qkcVar, !z2)));
                }
                ehcVarB.add(new gtd(new rxh(2132019234), null, new sma(qkcVar, (byte) 10)));
                return a.a(ehcVarB);
            case 21:
                tkc tkcVar = (tkc) obj2;
                return new cu5(tkcVar.h, tkcVar.j, tkcVar.k, (tsd) obj, tkcVar.p, tkcVar.o, new q4b(tkcVar, b2), new qe6(tkcVar, (byte) 25));
            case SizeUtil.textSize1 /* 22 */:
                SettingsManager settingsManager = (SettingsManager) ((j4c) obj2).get();
                xnc xncVar = ((snc) obj).g;
                return new fs6(settingsManager, xncVar.a, xncVar.c, xncVar.e, xf8.u(xncVar.f));
            case 23:
                return Boolean.valueOf(Intrinsics.a((jmc) obj2, (jmc) ((igi) obj).g));
            case SizeUtil.textSize2 /* 24 */:
                ((Function1) obj2).invoke((String) obj);
                return Unit.a;
            case 25:
                acd acdVar = (acd) obj;
                n27 n27Var = ui6.e0(acdVar).y;
                acdVar.s.h();
                int iH = acdVar.t.h();
                ((uac) obj2).getClass();
                return Integer.valueOf(zed.b(0.33333334f * iH));
            case 26:
                ncd ncdVar = (ncd) obj2;
                ViewGroup viewGroup = (RecyclerView) obj;
                ab2 ab2VarK = ncdVar.e.k(viewGroup, ncdVar.g);
                return ab2VarK == null ? new mcd(new View(viewGroup.getContext())) : ab2VarK;
            case 27:
                ((Function1) obj2).invoke((f2e) obj);
                return Unit.a;
            case 28:
                pej pejVar = (pej) obj2;
                nx5 nx5Var = (nx5) obj;
                if (((Boolean) ((Function1) pejVar.d.d).invoke(qej.c)).booleanValue()) {
                    na2.B(nx5Var, (CoroutineContext) null, (rx5) null, new c7e(pejVar, (mt5) null, (byte) 7), 3);
                }
                return Boolean.TRUE;
            default:
                boh bohVar = (boh) obj;
                if (((cf2) ((g77) obj2).a).get() == 0) {
                    bohVar.invoke();
                }
                return Unit.a;
        }
    }
}

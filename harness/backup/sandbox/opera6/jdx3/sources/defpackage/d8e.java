package defpackage;

import android.content.SharedPreferences;
import android.os.Trace;
import androidx.fragment.app.r;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.CircleImageView;
import com.opera.android.suggestion.adapter.ProductSuggestionListItem;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketWriter;

/* loaded from: classes.dex */
public final /* synthetic */ class d8e implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d8e(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke() {
        aln alnVar;
        Pair pair;
        int iO;
        Pair pair2;
        byte b = this.a;
        byte b2 = 10;
        char c = 1;
        String id = null;
        b2cVar = null;
        b2c b2cVar = null;
        Object obj = null;
        id = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hd hdVar = (hd) obj2;
                hdVar.b = false;
                HashSet hashSet = new HashSet();
                dee deeVar = (dee) hdVar.f;
                if (deeVar != null) {
                    Object[] objArr = deeVar.a;
                    int i = deeVar.b;
                    for (int i2 = 0; i2 < i; i2++) {
                        m3c m3cVar = (m3c) objArr[i2];
                        dee deeVar2 = (dee) hdVar.g;
                        if (deeVar2 == null) {
                            deeVar2 = new dee();
                            hdVar.g = deeVar2;
                        }
                        h7h h7hVar = (h7h) deeVar2.g(i2);
                        b8e b8eVar = (b8e) m3cVar.F.g;
                        if (b8eVar.n) {
                            hd.q(b8eVar, h7hVar);
                        }
                    }
                    deeVar.d();
                    dee deeVar3 = (dee) hdVar.g;
                    if (deeVar3 != null) {
                        deeVar3.d();
                    }
                }
                dee deeVar4 = (dee) hdVar.d;
                if (deeVar4 != null) {
                    Object[] objArr2 = deeVar4.a;
                    int i3 = deeVar4.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        d13 d13Var = (d13) objArr2[i4];
                        dee deeVar5 = (dee) hdVar.e;
                        if (deeVar5 == null) {
                            deeVar5 = new dee();
                            hdVar.e = deeVar5;
                        }
                        h7h h7hVar2 = (h7h) deeVar5.g(i4);
                        if (((b8e) d13Var).n) {
                            hd.q(d13Var, h7hVar2);
                        }
                    }
                    deeVar4.d();
                    dee deeVar6 = (dee) hdVar.e;
                    if (deeVar6 != null) {
                        deeVar6.d();
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((d13) it.next()).V0();
                }
                return Unit.a;
            case 1:
                return (nx5) ((s9i) obj2).e;
            case 2:
                return ((hle) obj2).T0();
            case 3:
                return (vlh) ((ylh) obj2).a.e.getValue();
            case 4:
                return "Unexpected end of input: yet to parse ".concat(((t4f) obj2).b());
            case 5:
                lx6 lx6Var = (jtf) obj2;
                switch (lx6Var.a) {
                    case 0:
                        return (d44) lx6Var.d;
                    default:
                        InputStream inputStream = (InputStream) lx6Var.d;
                        cv6 cv6Var = bb7.a;
                        mr6 mr6Var = mr6.b;
                        int i5 = a34.a;
                        int i6 = ctb.a;
                        return new jkh(new j9b(inputStream));
                }
            case 6:
                return (m0a) ((wt3) obj2).get();
            case 7:
                return (u0a) obj2;
            case 8:
                zaf zafVar = ((gbf) obj2).l;
                b2l b2lVar = zafVar.b.h.o;
                if (b2lVar != null) {
                    zafVar.a0(b2lVar);
                }
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return new icf((kcf) obj2);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                lsf lsfVar = (lsf) obj2;
                g77 g77Var = new g77((byte) 20);
                g77Var.b = (pna) lsfVar.b.get();
                String string = ((f3j) lsfVar.a.get()).b.toString();
                if (!c.l(string, "/", false)) {
                    string = string.concat("/");
                }
                g77.d(g77Var, string);
                o95.s((LinkedHashSet) g77Var.c, new pw6[]{new pw6((byte) 2)});
                jyb jybVarF = g77Var.f();
                return new zfo(jybVarF.a, jybVarF.b, new qe6(jybVarF, (byte) 23));
            case 11:
                return Integer.valueOf(((sxf) obj2).n());
            case 12:
                l3g l3gVar = (l3g) obj2;
                qie qieVar = l3gVar.a;
                String str = l3gVar.b;
                qsk qskVar = (qsk) qieVar.b;
                String databaseName = qskVar.getDatabaseName();
                if (databaseName == null) {
                    if (!Intrinsics.a(str, ":memory:")) {
                        bxl.d(sko.k("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                        return null;
                    }
                } else if (!databaseName.equals(str) && !Intrinsics.a(StringsKt.f0('/', databaseName, databaseName), StringsKt.f0('/', str, str))) {
                    j9h.o("This driver is configured to open a database named '", qskVar.getDatabaseName(), "' but '", str, "' was requested.");
                    return null;
                }
                return new osk(qskVar.getWritableDatabase());
            case 13:
                zcg zcgVarF0 = ((ocg) obj2).f0();
                vbg vbgVar = zcgVarF0.d;
                List listK0 = CollectionsKt.k0(zcgVarF0.j);
                eef eefVar = zcgVarF0.p;
                if (eefVar != null && (alnVar = eefVar.a) != null) {
                    id = alnVar.getId();
                }
                Iterable<rdf> iterable = (Iterable) ((wnm) zcgVarF0.h.h).g();
                ArrayList arrayList = new ArrayList(k95.o(iterable, 10));
                for (rdf rdfVar : iterable) {
                    arrayList.add(new wcg(rdfVar.a.name().toLowerCase(Locale.ROOT), rdfVar.b, zcgVarF0.k.contains(rdfVar.a)));
                }
                vbgVar.a(new xcg(listK0, id, arrayList, ((ycg) ((zyk) zcgVarF0.i.c).getValue()).c), true);
                nv6 nv6VarB = zcgVarF0.b.b();
                ((SharedPreferences.Editor) nv6VarB.a).putBoolean("personalization.onboarding.completed", true);
                nv6VarB.w();
                zcgVarF0.g.W();
                return Unit.a;
            case 14:
                shf shfVar = (shf) obj2;
                qln qlnVar = (qln) shfVar.b;
                cq5 cq5Var = (cq5) shfVar.a;
                boolean zI = ((vq8) qlnVar.f.e).i();
                if (zI) {
                    List list = (List) ((kze) qlnVar.f.g).g();
                    int iA = qbd.a(k95.o(list, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    for (Object obj3 : list) {
                        linkedHashMap.put(((aln) obj3).getId(), obj3);
                    }
                    List listG = y1j.g(new m2m(new v39(new m2m(new ec7(new m2m(new d82(((bef) cq5Var.getValue()).g(), (byte) 1), new m3g(shfVar, b2)), new bli((byte) 11), (byte) 0), new x37(linkedHashMap, (byte) 3)), false, new bli((byte) 13)), new m3g((byte) 11)));
                    if (!listG.isEmpty()) {
                        String strF = ((bef) cq5Var.getValue()).f();
                        if (Intrinsics.a(strF, "<default>")) {
                            strF = "NETWORK_529";
                        }
                        Iterator it2 = listG.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (Intrinsics.a(((eef) next).a.getId(), strF)) {
                                    obj = next;
                                }
                            }
                        }
                        return new ycg(listG, (eef) obj, hff.b);
                    }
                }
                return new ycg(Arrays.asList(new eef(ami.m), new eef(ami.l, g7j.TEAL)), null, zI ? hff.c : hff.d);
            case 15:
                return ((ijd) obj2).a();
            case 16:
                pe4 pe4Var = ((aeg) obj2).a;
                ka4 ka4Var = new ka4();
                String str2 = pe4Var.a.b;
                return ka4Var;
            case 17:
                return o18.p(new StringBuilder("Unexpected end of input: yet to parse '"), ((ufg) obj2).a, '\'');
            case SizeUtil.textSize0_1 /* 18 */:
                ong ongVar = (ong) obj2;
                return new bs5(xug.f("kotlinx.serialization.Polymorphic", nng.b, new SerialDescriptor[0], new rmg(ongVar, c == true ? 1 : 0)), ongVar.a);
            case 19:
                aog aogVar = (aog) obj2;
                b2c b2cVar2 = (b2c) aogVar.r.getValue();
                if (b2cVar2 != null && b2cVar2.f()) {
                    b2cVar = b2cVar2;
                }
                return Boolean.valueOf((b2cVar == null || ((gcb) aogVar.q.getValue()) == null) ? false : true);
            case SizeUtil.textSize0 /* 20 */:
                File file = (File) ((s4f) obj2).invoke();
                if (Intrinsics.a(StringsKt.f0('.', file.getName(), ""), "preferences_pb")) {
                    return file.getAbsoluteFile();
                }
                kp5.b(file, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                return null;
            case 21:
                ((CircleImageView) ((ProductSuggestionListItem) obj2).q.c).setVisibility(8);
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                ((t59) obj2).c();
                return Unit.a;
            case 23:
                return Float.valueOf(((u89) obj2).invoke() < 1.0f ? 0.3f : 1.0f);
            case SizeUtil.textSize2 /* 24 */:
                return RealWebSocket.b((RealWebSocket) obj2);
            case 25:
                return RealWebSocket.a((WebSocketWriter) obj2);
            case 26:
                yoh yohVar = (yoh) obj2;
                yohVar.i = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    yohVar.a();
                    Trace.endSection();
                    return Unit.a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 27:
                return (File) ((esk) obj2).get();
            case 28:
                xyh xyhVar = (xyh) obj2;
                ClassLoader classLoader = xyhVar.a;
                g29 g29Var = xyhVar.b;
                ArrayList list2 = Collections.list(classLoader.getResources(""));
                ArrayList arrayList2 = new ArrayList();
                int size = list2.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj4 = list2.get(i7);
                    i7++;
                    URL url = (URL) obj4;
                    if (Intrinsics.a(url.getProtocol(), "file")) {
                        String str3 = w6g.b;
                        pair2 = new Pair(g29Var, s16.p(new File(url.toURI())));
                    } else {
                        pair2 = null;
                    }
                    if (pair2 != null) {
                        arrayList2.add(pair2);
                    }
                }
                ArrayList list3 = Collections.list(classLoader.getResources("META-INF/MANIFEST.MF"));
                ArrayList arrayList3 = new ArrayList();
                int size2 = list3.size();
                int i8 = 0;
                while (i8 < size2) {
                    Object obj5 = list3.get(i8);
                    i8++;
                    String string2 = ((URL) obj5).toString();
                    if (!c.q(string2, "jar:file:", false) || (iO = StringsKt.O(6, string2, "!")) == -1) {
                        pair = null;
                    } else {
                        String str4 = w6g.b;
                        pair = new Pair(upj.u(s16.p(new File(URI.create(string2.substring(4, iO)))), g29Var, new u4h((byte) 17)), xyh.d);
                    }
                    if (pair != null) {
                        arrayList3.add(pair);
                    }
                }
                return CollectionsKt.V(arrayList3, arrayList2);
            default:
                r activity = ((s3i) obj2).getActivity();
                return Boolean.valueOf(activity != null ? activity.isChangingConfigurations() : false);
        }
    }
}

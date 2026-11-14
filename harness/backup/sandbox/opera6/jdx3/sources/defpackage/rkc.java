package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.live_score.LivescoreSheetLayoutSwitcher;
import com.opera.android.settings.SettingsManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes.dex */
public final /* synthetic */ class rkc implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rkc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ rkc(pfe pfeVar, ofe ofeVar) {
        this.a = (byte) 23;
        this.b = pfeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        nrc nrcVar;
        hf0 hf0Var;
        byte b = this.a;
        final byte b2 = 12;
        final byte b3 = 8;
        final byte b4 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                yzb yzbVar = (yzb) obj2;
                orb orbVar = (orb) obj;
                if (orbVar.a.has("error")) {
                    orb orbVarC = orbVar.c("error");
                    yzbVar.n(new rw7(new cqb(orbVarC.a.getInt("code"), orbVarC.e(Constants.Params.MESSAGE))));
                } else {
                    yzbVar.n(new sw7(Unit.a));
                }
                break;
            case 2:
                yqc yqcVar = (yqc) obj2;
                orb orbVar2 = (orb) obj;
                if (orbVar2.a.has("error")) {
                    orb orbVarC2 = orbVar2.c("error");
                    yqcVar.n(new rw7(new cqb(orbVarC2.a.getInt("code"), orbVarC2.e(Constants.Params.MESSAGE))));
                } else {
                    yqcVar.n(new sw7(new epc(orbVar2.c("result").c(Constants.Params.STATE).e(Constants.Params.STATE))));
                }
                break;
            case 3:
                pqc pqcVar = (pqc) obj2;
                pqcVar.e = ((Boolean) obj).booleanValue();
                pqcVar.d.c();
                break;
            case 4:
                lrc lrcVar = (lrc) obj2;
                int iOrdinal = ((prc) obj).a.ordinal();
                if (iOrdinal == 0) {
                    nrcVar = nrc.a;
                } else if (iOrdinal == 1) {
                    nrcVar = nrc.b;
                } else if (iOrdinal != 2) {
                    h9o.p();
                    break;
                } else {
                    nrcVar = nrc.c;
                }
                LivescoreSheetLayoutSwitcher livescoreSheetLayoutSwitcher = lrcVar.v;
                if (livescoreSheetLayoutSwitcher == null) {
                    livescoreSheetLayoutSwitcher = null;
                }
                if (livescoreSheetLayoutSwitcher.a != nrcVar) {
                    livescoreSheetLayoutSwitcher.a = nrcVar;
                    livescoreSheetLayoutSwitcher.b().b.setVisibility(8);
                    livescoreSheetLayoutSwitcher.a().b.setVisibility(8);
                    int iOrdinal2 = nrcVar.ordinal();
                    if (iOrdinal2 == 0) {
                        livescoreSheetLayoutSwitcher.b().b.setVisibility(0);
                    } else if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            h9o.p();
                            break;
                        } else {
                            livescoreSheetLayoutSwitcher.a().b.setVisibility(0);
                        }
                    }
                }
                break;
            case 5:
                OperaApplication operaApplication = (OperaApplication) obj2;
                if (((Boolean) obj).booleanValue()) {
                    z8b z8bVar = (z8b) dp7.a.a;
                    ua7 ua7Var = (ua7) z8bVar.a;
                    if (ua7Var != null) {
                        ua7Var.C(null);
                    }
                    z8bVar.E(operaApplication);
                }
                break;
            case 6:
                ((dka) obj2).n(new rw7(new dqb((Throwable) obj)));
                break;
            case 7:
                ((dka) obj2).n(new rw7(new dqb((Throwable) obj)));
                break;
            case 8:
                u02 u02Var = (u02) obj2;
                ((kze) u02Var.o).r(u02Var.F());
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                vrc vrcVar = (vrc) obj2;
                j4c j4cVar = vrcVar.c;
                kze kzeVar = (kze) ((vs6) j4cVar.get()).e.d.b;
                hx5 hx5VarU = xf8.u(((vs6) j4cVar.get()).b.q);
                OperaApplication operaApplication2 = vrcVar.d.b;
                jze jzeVar = operaApplication2.v().e;
                hx5 hx5VarU2 = xf8.u(((vs6) j4cVar.get()).b.s);
                hx5 hx5VarU3 = xf8.u(((vs6) j4cVar.get()).b.t);
                hx5 hx5VarU4 = xf8.u(((vs6) j4cVar.get()).b.u);
                fp1 fp1Var = vrcVar.a;
                po7 po7Var = new po7(dj9.t(fp1Var));
                SettingsManager settingsManager = vrcVar.b;
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((vzc) obj2).b = null;
                break;
            case 11:
                ((StatusBarDrawingFrameLayout) ((wub) obj2).a).setAlpha(((Float) obj).floatValue());
                break;
            case 12:
                final n9d n9dVar = (n9d) obj2;
                final Set set = (Set) obj;
                if (set != null) {
                    n9dVar.g = set;
                    rml rmlVar = new rml(Unit.a, n9dVar.a);
                    final Object[] objArr3 = objArr == true ? 1 : 0;
                    rmlVar.b(new Function1() { // from class: k9d
                        public final Object invoke(Object obj3) throws NoSuchAlgorithmException, IOException {
                            File[] fileArrListFiles;
                            v08 v08VarN0;
                            Object q0iVar;
                            String[] list;
                            v08 v08VarN02;
                            Object next;
                            byte b5 = objArr3;
                            n9d n9dVar2 = n9dVar;
                            Set set2 = set;
                            switch (b5) {
                                case 0:
                                    LinkedHashMap linkedHashMap = n9dVar2.e;
                                    File file = (File) n9dVar2.b.get();
                                    AssetManager assetManager = n9dVar2.c;
                                    int i = 0;
                                    if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                                        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
                                        for (File file2 : fileArrListFiles) {
                                            f8a f8aVar = f8a.h;
                                            FileInputStream fileInputStream = new FileInputStream(file2);
                                            MessageDigest messageDigest = MessageDigest.getInstance(f8aVar.a);
                                            messageDigest.reset();
                                            l8a l8aVar = new l8a(fileInputStream, new c5o(f8aVar, messageDigest, false));
                                            try {
                                                p0i p0iVar = t0i.b;
                                                try {
                                                    xvg.n(l8aVar, new e4f());
                                                    l8aVar.close();
                                                    q0iVar = l8aVar.b;
                                                    if (q0iVar == null) {
                                                        throw new IllegalStateException("Required value was null.");
                                                    }
                                                } finally {
                                                    try {
                                                        break;
                                                    } catch (Throwable th) {
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                p0i p0iVar2 = t0i.b;
                                                q0iVar = new q0i(th2);
                                            }
                                            Function1 function1 = f8aVar.c;
                                            if (!(q0iVar instanceof q0i)) {
                                                q0iVar = function1.invoke(q0iVar);
                                            }
                                            arrayList.add(t0i.d(q0iVar) == null ? new ak3(file2, ((c8a) q0iVar).a) : null);
                                        }
                                        ArrayList arrayList2 = new ArrayList();
                                        CollectionsKt.I(arrayList, arrayList2);
                                        v08VarN0 = CollectionsKt.n0(arrayList2);
                                    } else {
                                        v08VarN0 = v08.a;
                                    }
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    for (ak3 ak3Var : (Iterable) v08VarN0) {
                                        ak3 ak3Var2 = (ak3) linkedHashMap2.put(new c8a(ak3Var.b), ak3Var);
                                        if (ak3Var2 != null) {
                                            linkedHashMap2.put(new c8a(ak3Var.b), ak3Var2);
                                        }
                                    }
                                    Set setN0 = CollectionsKt.n0(linkedHashMap2.values());
                                    try {
                                        list = assetManager.list("abp_files/op");
                                    } catch (IOException unused) {
                                        list = null;
                                    }
                                    if (list == null) {
                                        v08VarN02 = v08.a;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList(list.length);
                                        for (String str : list) {
                                            arrayList3.add(new zj3(str));
                                        }
                                        v08VarN02 = CollectionsKt.n0(arrayList3);
                                    }
                                    LinkedHashSet linkedHashSetE = b5j.e(b5j.e(setN0, (Iterable) v08VarN02), v08.a);
                                    ArrayList arrayList4 = new ArrayList();
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj4 : set2) {
                                        if (((yj3) obj4).a) {
                                            arrayList4.add(obj4);
                                        } else {
                                            arrayList5.add(obj4);
                                        }
                                    }
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    int size = arrayList4.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        Object obj5 = arrayList4.get(i2);
                                        i2++;
                                        linkedHashSet.add(((yj3) obj5).b);
                                    }
                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                    int size2 = arrayList5.size();
                                    while (i < size2) {
                                        Object obj6 = arrayList5.get(i);
                                        i++;
                                        linkedHashSet2.add(((yj3) obj6).b);
                                    }
                                    p4j p4jVarE = uup.E(linkedHashSetE, linkedHashSet);
                                    p4j p4jVarE2 = uup.E(linkedHashSetE, linkedHashSet2);
                                    for (l9d l9dVar : b5j.e(p4jVarE, p4jVarE2)) {
                                        String str2 = l9dVar.b;
                                        vj3 vj3Var = l9dVar.a;
                                        linkedHashMap.put(new Pair(str2, vj3Var.a), new c8a(vj3Var.b.a()));
                                    }
                                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                    r9d it = p4jVarE.iterator();
                                    while (((t9d) it).hasNext()) {
                                        l9d l9dVar2 = (l9d) it.next();
                                        vj3 vj3Var2 = l9dVar2.a;
                                        linkedHashSet3.add(new xj3(new wj3(vj3Var2.a, vj3Var2.b.a()), l9dVar2.b));
                                    }
                                    Set setD = b5j.d(linkedHashSet, linkedHashSet3);
                                    p4j p4jVar = new p4j();
                                    Set<xj3> set3 = setD;
                                    for (xj3 xj3Var : set3) {
                                        String str3 = xj3Var.b;
                                        wj3 wj3Var = xj3Var.a;
                                        sj3 sj3Var = wj3Var.a;
                                        c8a c8aVar = (c8a) linkedHashMap.get(new Pair(str3, sj3Var));
                                        String str4 = c8aVar != null ? c8aVar.a : null;
                                        if (str4 != null && !str4.equals(wj3Var.b)) {
                                            Iterator it2 = linkedHashSetE.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    next = it2.next();
                                                    if (Intrinsics.a(((tj3) next).a(), str4)) {
                                                    }
                                                } else {
                                                    next = null;
                                                }
                                            }
                                            tj3 tj3Var = (tj3) next;
                                            if (tj3Var != null) {
                                                p4jVar.add(new uj3(new vj3(sj3Var, tj3Var), wj3Var));
                                            }
                                        }
                                    }
                                    p4j p4jVarA = z4j.a(p4jVar);
                                    LinkedHashSet linkedHashSetE2 = b5j.e(p4jVarE, p4jVarE2);
                                    LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                                    Iterator it3 = linkedHashSetE2.iterator();
                                    while (it3.hasNext()) {
                                        linkedHashSet4.add(((l9d) it3.next()).a.b);
                                    }
                                    LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                                    r9d it4 = p4jVarA.iterator();
                                    while (((t9d) it4).hasNext()) {
                                        linkedHashSet5.add(((uj3) it4.next()).a.b);
                                    }
                                    LinkedHashSet linkedHashSetE3 = b5j.e(linkedHashSet4, linkedHashSet5);
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj7 : linkedHashSetE3) {
                                        if (obj7 instanceof ak3) {
                                            arrayList6.add(obj7);
                                        }
                                    }
                                    Set setD2 = b5j.d(v08VarN0, CollectionsKt.n0(arrayList6));
                                    LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                                    Iterator it5 = setD2.iterator();
                                    while (it5.hasNext()) {
                                        linkedHashSet6.add(((ak3) it5.next()).a);
                                    }
                                    LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                                    r9d it6 = p4jVarE.iterator();
                                    while (((t9d) it6).hasNext()) {
                                        linkedHashSet7.add(((l9d) it6.next()).a);
                                    }
                                    LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                                    Iterator it7 = set3.iterator();
                                    while (it7.hasNext()) {
                                        linkedHashSet8.add(((xj3) it7.next()).a);
                                    }
                                    LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                                    r9d it8 = p4jVarE2.iterator();
                                    while (((t9d) it8).hasNext()) {
                                        linkedHashSet9.add(((l9d) it8.next()).a);
                                    }
                                    LinkedHashSet linkedHashSet10 = new LinkedHashSet();
                                    Iterator it9 = linkedHashSet2.iterator();
                                    while (it9.hasNext()) {
                                        linkedHashSet10.add(((xj3) it9.next()).a);
                                    }
                                    return new m9d(linkedHashSet7, linkedHashSet8, p4jVarA, linkedHashSet6, linkedHashSet9, linkedHashSet10);
                                default:
                                    Object obj8 = ((t0i) obj3).a;
                                    if (!(obj8 instanceof q0i)) {
                                        m9d m9dVar = (m9d) obj8;
                                        if (set2 == n9dVar2.g) {
                                            n9dVar2.d.r(m9dVar);
                                        }
                                    }
                                    return Unit.a;
                            }
                        }
                    }).t(new Function1() { // from class: k9d
                        public final Object invoke(Object obj3) throws NoSuchAlgorithmException, IOException {
                            File[] fileArrListFiles;
                            v08 v08VarN0;
                            Object q0iVar;
                            String[] list;
                            v08 v08VarN02;
                            Object next;
                            byte b5 = b;
                            n9d n9dVar2 = n9dVar;
                            Set set2 = set;
                            switch (b5) {
                                case 0:
                                    LinkedHashMap linkedHashMap = n9dVar2.e;
                                    File file = (File) n9dVar2.b.get();
                                    AssetManager assetManager = n9dVar2.c;
                                    int i = 0;
                                    if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                                        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
                                        for (File file2 : fileArrListFiles) {
                                            f8a f8aVar = f8a.h;
                                            FileInputStream fileInputStream = new FileInputStream(file2);
                                            MessageDigest messageDigest = MessageDigest.getInstance(f8aVar.a);
                                            messageDigest.reset();
                                            l8a l8aVar = new l8a(fileInputStream, new c5o(f8aVar, messageDigest, false));
                                            try {
                                                p0i p0iVar = t0i.b;
                                                try {
                                                    xvg.n(l8aVar, new e4f());
                                                    l8aVar.close();
                                                    q0iVar = l8aVar.b;
                                                    if (q0iVar == null) {
                                                        throw new IllegalStateException("Required value was null.");
                                                    }
                                                } finally {
                                                    try {
                                                        break;
                                                    } catch (Throwable th) {
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                p0i p0iVar2 = t0i.b;
                                                q0iVar = new q0i(th2);
                                            }
                                            Function1 function1 = f8aVar.c;
                                            if (!(q0iVar instanceof q0i)) {
                                                q0iVar = function1.invoke(q0iVar);
                                            }
                                            arrayList.add(t0i.d(q0iVar) == null ? new ak3(file2, ((c8a) q0iVar).a) : null);
                                        }
                                        ArrayList arrayList2 = new ArrayList();
                                        CollectionsKt.I(arrayList, arrayList2);
                                        v08VarN0 = CollectionsKt.n0(arrayList2);
                                    } else {
                                        v08VarN0 = v08.a;
                                    }
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    for (ak3 ak3Var : (Iterable) v08VarN0) {
                                        ak3 ak3Var2 = (ak3) linkedHashMap2.put(new c8a(ak3Var.b), ak3Var);
                                        if (ak3Var2 != null) {
                                            linkedHashMap2.put(new c8a(ak3Var.b), ak3Var2);
                                        }
                                    }
                                    Set setN0 = CollectionsKt.n0(linkedHashMap2.values());
                                    try {
                                        list = assetManager.list("abp_files/op");
                                    } catch (IOException unused) {
                                        list = null;
                                    }
                                    if (list == null) {
                                        v08VarN02 = v08.a;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList(list.length);
                                        for (String str : list) {
                                            arrayList3.add(new zj3(str));
                                        }
                                        v08VarN02 = CollectionsKt.n0(arrayList3);
                                    }
                                    LinkedHashSet linkedHashSetE = b5j.e(b5j.e(setN0, (Iterable) v08VarN02), v08.a);
                                    ArrayList arrayList4 = new ArrayList();
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj4 : set2) {
                                        if (((yj3) obj4).a) {
                                            arrayList4.add(obj4);
                                        } else {
                                            arrayList5.add(obj4);
                                        }
                                    }
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    int size = arrayList4.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        Object obj5 = arrayList4.get(i2);
                                        i2++;
                                        linkedHashSet.add(((yj3) obj5).b);
                                    }
                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                    int size2 = arrayList5.size();
                                    while (i < size2) {
                                        Object obj6 = arrayList5.get(i);
                                        i++;
                                        linkedHashSet2.add(((yj3) obj6).b);
                                    }
                                    p4j p4jVarE = uup.E(linkedHashSetE, linkedHashSet);
                                    p4j p4jVarE2 = uup.E(linkedHashSetE, linkedHashSet2);
                                    for (l9d l9dVar : b5j.e(p4jVarE, p4jVarE2)) {
                                        String str2 = l9dVar.b;
                                        vj3 vj3Var = l9dVar.a;
                                        linkedHashMap.put(new Pair(str2, vj3Var.a), new c8a(vj3Var.b.a()));
                                    }
                                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                    r9d it = p4jVarE.iterator();
                                    while (((t9d) it).hasNext()) {
                                        l9d l9dVar2 = (l9d) it.next();
                                        vj3 vj3Var2 = l9dVar2.a;
                                        linkedHashSet3.add(new xj3(new wj3(vj3Var2.a, vj3Var2.b.a()), l9dVar2.b));
                                    }
                                    Set setD = b5j.d(linkedHashSet, linkedHashSet3);
                                    p4j p4jVar = new p4j();
                                    Set<xj3> set3 = setD;
                                    for (xj3 xj3Var : set3) {
                                        String str3 = xj3Var.b;
                                        wj3 wj3Var = xj3Var.a;
                                        sj3 sj3Var = wj3Var.a;
                                        c8a c8aVar = (c8a) linkedHashMap.get(new Pair(str3, sj3Var));
                                        String str4 = c8aVar != null ? c8aVar.a : null;
                                        if (str4 != null && !str4.equals(wj3Var.b)) {
                                            Iterator it2 = linkedHashSetE.iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    next = it2.next();
                                                    if (Intrinsics.a(((tj3) next).a(), str4)) {
                                                    }
                                                } else {
                                                    next = null;
                                                }
                                            }
                                            tj3 tj3Var = (tj3) next;
                                            if (tj3Var != null) {
                                                p4jVar.add(new uj3(new vj3(sj3Var, tj3Var), wj3Var));
                                            }
                                        }
                                    }
                                    p4j p4jVarA = z4j.a(p4jVar);
                                    LinkedHashSet linkedHashSetE2 = b5j.e(p4jVarE, p4jVarE2);
                                    LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                                    Iterator it3 = linkedHashSetE2.iterator();
                                    while (it3.hasNext()) {
                                        linkedHashSet4.add(((l9d) it3.next()).a.b);
                                    }
                                    LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                                    r9d it4 = p4jVarA.iterator();
                                    while (((t9d) it4).hasNext()) {
                                        linkedHashSet5.add(((uj3) it4.next()).a.b);
                                    }
                                    LinkedHashSet linkedHashSetE3 = b5j.e(linkedHashSet4, linkedHashSet5);
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj7 : linkedHashSetE3) {
                                        if (obj7 instanceof ak3) {
                                            arrayList6.add(obj7);
                                        }
                                    }
                                    Set setD2 = b5j.d(v08VarN0, CollectionsKt.n0(arrayList6));
                                    LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                                    Iterator it5 = setD2.iterator();
                                    while (it5.hasNext()) {
                                        linkedHashSet6.add(((ak3) it5.next()).a);
                                    }
                                    LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                                    r9d it6 = p4jVarE.iterator();
                                    while (((t9d) it6).hasNext()) {
                                        linkedHashSet7.add(((l9d) it6.next()).a);
                                    }
                                    LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                                    Iterator it7 = set3.iterator();
                                    while (it7.hasNext()) {
                                        linkedHashSet8.add(((xj3) it7.next()).a);
                                    }
                                    LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                                    r9d it8 = p4jVarE2.iterator();
                                    while (((t9d) it8).hasNext()) {
                                        linkedHashSet9.add(((l9d) it8.next()).a);
                                    }
                                    LinkedHashSet linkedHashSet10 = new LinkedHashSet();
                                    Iterator it9 = linkedHashSet2.iterator();
                                    while (it9.hasNext()) {
                                        linkedHashSet10.add(((xj3) it9.next()).a);
                                    }
                                    return new m9d(linkedHashSet7, linkedHashSet8, p4jVarA, linkedHashSet6, linkedHashSet9, linkedHashSet10);
                                default:
                                    Object obj8 = ((t0i) obj3).a;
                                    if (!(obj8 instanceof q0i)) {
                                        m9d m9dVar = (m9d) obj8;
                                        if (set2 == n9dVar2.g) {
                                            n9dVar2.d.r(m9dVar);
                                        }
                                    }
                                    return Unit.a;
                            }
                        }
                    }).m(n9dVar.f);
                }
                break;
            case 13:
                q0n q0nVar = (q0n) obj2;
                List list = (List) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (list.size() % 2 == 0) {
                    for (int i = 0; i < list.size(); i += 2) {
                        linkedHashMap.put((String) list.get(i), list.get(i + 1));
                    }
                    break;
                } else {
                    qp2.n("non-zero remainder");
                    break;
                }
            case 14:
                kbd kbdVar = (kbd) obj2;
                kbdVar.r(((t14) kbdVar.p).apply(obj));
                break;
            case 15:
                ((o3c) obj2).a();
                break;
            case 16:
                break;
            case 17:
                ((sf2) obj2).b.setImageDrawable((Drawable) obj);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                ((e0e) obj2).Z();
                break;
            case 19:
                ((wa1) obj).w(0, ((w2e) obj2).d);
                break;
            case SizeUtil.textSize0 /* 20 */:
                ((wa1) obj).w(0, ((w2e) obj2).d);
                break;
            case 21:
                final lld lldVar = (lld) obj2;
                i8e i8eVar = (i8e) obj;
                final byte b5 = 10;
                Function2 function2 = new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b6 = b5;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b6) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                };
                rhk rhkVar = c37.d;
                xwb xwbVar = xwb.b;
                l08 l08Var = l08.a;
                i8eVar.a(new vn8(new qc3(uqh.a(il5.class), (rhk) null, function2, xwbVar, l08Var)));
                i8eVar.a(new vn8(new qc3(uqh.a(u3e.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b6 = b;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b6) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar, l08Var)));
                i8eVar.a(new vn8(new qc3(uqh.a(p5e.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b6 = b4;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b6) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar, l08Var)));
                final byte b6 = 3;
                qc3 qc3Var = new qc3(uqh.a(tr1.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b62 = b6;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b62) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar, l08Var);
                vn8 vn8VarB = u35.b(qc3Var, i8eVar);
                s15 s15VarA = uqh.a(lrh.class);
                qc3Var.a(s15VarA);
                i8eVar.b(j7c.p(new StringBuilder(jtb.a(s15VarA)), ':', "", ':', rhkVar), vn8VarB);
                final byte b7 = 4;
                i8eVar.a(new vn8(new qc3(uqh.a(a4e.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b62 = b7;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b62) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar, l08Var)));
                final byte b8 = 5;
                i8eVar.a(new vn8(new qc3(uqh.a(x3e.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b62 = b8;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b62) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar, l08Var)));
                final byte b9 = 6;
                i8eVar.a(new vn8(new qc3(uqh.a(v3e.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b62 = b9;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b62) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar, l08Var)));
                final byte b10 = 7;
                i8eVar.a(new vn8(new qc3(uqh.a(b6e.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b62 = b10;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b62) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar, l08Var)));
                i8eVar.a(new vn8(new qc3(uqh.a(i5e.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b62 = b3;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b62) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar, l08Var)));
                final byte b11 = 9;
                i8eVar.a(new vn8(new qc3(uqh.a(mzd.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b62 = b11;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b62) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar, l08Var)));
                final byte b12 = 11;
                i8eVar.a(new vn8(new qc3(uqh.a(s5e.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b62 = b12;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b62) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar, l08Var)));
                i8eVar.a(new vn8(new qc3(uqh.a(v3e.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b62 = b2;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b62) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar, l08Var)));
                final byte b13 = 13;
                i8eVar.a(new vn8(new qc3(uqh.a(a2e.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b62 = b13;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b62) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar, l08Var)));
                final byte b14 = 14;
                i8eVar.a(new vn8(new qc3(uqh.a(i2h.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b62 = b14;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b62) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar, l08Var)));
                final byte b15 = 15;
                i8eVar.a(new vn8(new qc3(uqh.a(m3i.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b62 = b15;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b62) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar, l08Var)));
                final byte b16 = 16;
                i8eVar.a(new vn8(new qc3(uqh.a(u4i.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b62 = b16;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b62) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar, l08Var)));
                final byte b17 = 17;
                i8eVar.a(new vn8(new qc3(uqh.a(y5e.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b62 = b17;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b62) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar, l08Var)));
                final byte b18 = 18;
                i8eVar.a(new vn8(new qc3(uqh.a(r5e.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b62 = b18;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b62) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar, l08Var)));
                final Object[] objArr4 = objArr2 == true ? 1 : 0;
                Function2 function22 = new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b62 = objArr4;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b62) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                };
                xwb xwbVar2 = xwb.a;
                qc3 qc3Var2 = new qc3(uqh.a(ab7.class), (rhk) null, function22, xwbVar2, l08Var);
                tlj tljVarM = j7c.m(qc3Var2, i8eVar);
                s15 s15VarA2 = uqh.a(ab7.class);
                qc3Var2.a(s15VarA2);
                i8eVar.b(j7c.p(new StringBuilder(jtb.a(s15VarA2)), ':', "", ':', rhkVar), tljVarM);
                final byte b19 = 19;
                qc3 qc3Var3 = new qc3(uqh.a(Context.class), (rhk) null, new Function2() { // from class: q5e
                    public final Object invoke(Object obj3, Object obj4) {
                        byte b62 = b19;
                        lld lldVar2 = lldVar;
                        ini iniVar = (ini) obj3;
                        switch (b62) {
                            case 0:
                                ab7 ab7VarL = ((r3b) lldVar2.b).L();
                                return ab7VarL == null ? za7.a : ab7VarL;
                            case 1:
                                return ((r3b) lldVar2.b).t();
                            case 2:
                                return ((r3b) lldVar2.b).h();
                            case 3:
                                return new tr1(((r3b) lldVar2.b).M(), (ur1) iniVar.a(uqh.a(ur1.class), (rhk) null, (Function0) null));
                            case 4:
                                return ((r3b) lldVar2.b).s();
                            case 5:
                                return ((r3b) lldVar2.b).p();
                            case 6:
                                return ((r3b) lldVar2.b).J();
                            case 7:
                                return ((r3b) lldVar2.b).o();
                            case 8:
                                return ((r3b) lldVar2.b).I();
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                mzd mzdVarD = ((r3b) lldVar2.b).D();
                                return mzdVarD == null ? (mzd) u5e.b.getValue() : mzdVarD;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                return ((r3b) lldVar2.b).getConfiguration();
                            case 11:
                                s5e s5eVarE = ((r3b) lldVar2.b).E();
                                return s5eVarE == null ? (s5e) u5e.c.getValue() : s5eVarE;
                            case 12:
                                return ((r3b) lldVar2.b).A();
                            case 13:
                                return ((r3b) lldVar2.b).x();
                            case 14:
                                return ((r3b) lldVar2.b).G();
                            case 15:
                                return ((r3b) lldVar2.b).y();
                            case 16:
                                return ((r3b) lldVar2.b).H();
                            case 17:
                                return ((r3b) lldVar2.b).R();
                            case SizeUtil.textSize0_1 /* 18 */:
                                r5e r5eVarN = ((r3b) lldVar2.b).N();
                                return r5eVarN == null ? (r5e) u5e.d.getValue() : r5eVarN;
                            default:
                                return ((r3b) lldVar2.b).getContext();
                        }
                    }
                }, xwbVar2, l08Var);
                tlj tljVarM2 = j7c.m(qc3Var3, i8eVar);
                s15 s15VarA3 = uqh.a(Context.class);
                qc3Var3.a(s15VarA3);
                i8eVar.b(j7c.p(new StringBuilder(jtb.a(s15VarA3)), ':', "", ':', rhkVar), tljVarM2);
                t9f t9fVarO = ((r3b) lldVar.b).O();
                if (t9fVarO != null) {
                    i8eVar.a(new tlj(new qc3(uqh.a(t9f.class), (rhk) null, new a7b(t9fVarO, b15), xwbVar2, l08Var)));
                } else {
                    i8eVar.a(new tlj(new qc3(uqh.a(t9f.class), (rhk) null, new nf8(b18), xwbVar2, l08Var)));
                }
                break;
            case SizeUtil.textSize1 /* 22 */:
                w6e w6eVar = (w6e) obj2;
                w6eVar.show();
                break;
            case 23:
                ((pfe) obj2).l((Object) null);
                break;
            case SizeUtil.textSize2 /* 24 */:
                ((dee) obj2).a((a8e) obj);
                break;
            case 25:
                xg0 xg0Var = (xg0) obj2;
                td0 td0Var = (td0) obj;
                td0Var.a.getClass();
                wg0 wg0Var = new wg0(2443, -1, 1);
                qd0 qd0Var = td0Var.b;
                List list2 = (List) qd0Var.n(69);
                ((list2 == null || list2.isEmpty()) ? new hf0(qd0Var, 69, vep.t(qd0Var, 69, 1)) : new hf0(qd0Var, 69, list2)).add(wg0Var);
                wg0Var.q(0, 1, xg0Var);
                break;
            case 26:
                gd0[] gd0VarArr = {(gd0) obj2};
                ed0 ed0Var = ((fd0) obj).a;
                List list3 = (List) ed0Var.n(0);
                if (list3 == null || list3.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    ed0Var.q(0, 1, arrayList);
                    hf0Var = new hf0(ed0Var, 0, arrayList);
                } else {
                    hf0Var = new hf0(ed0Var, 0, list3);
                }
                hf0Var.addAll(Arrays.asList(gd0VarArr));
                break;
            case 27:
                xl0 xl0Var = (xl0) obj2;
                td0 td0VarD = ((ck0) obj).d();
                td0VarD.a.getClass();
                wl0 wl0Var = new wl0(2443, -1, 1);
                qd0 qd0Var2 = td0VarD.b;
                List list4 = (List) qd0Var2.n(8);
                ((list4 == null || list4.isEmpty()) ? new hf0(qd0Var2, 8, vep.t(qd0Var2, 8, 1)) : new hf0(qd0Var2, 8, list4)).add(wl0Var);
                wl0Var.q(0, xl0Var == null ? (byte) 0 : (byte) 1, xl0Var);
                break;
            case 28:
                tb0 tb0VarC = ((ck0) obj).c();
                for (String str : (ehc) obj2) {
                    tb0VarC.a.getClass();
                    zc0 zc0Var = new zc0(2443, -1, 2);
                    tb0VarC.b.B().add(zc0Var);
                    zc0Var.p(0, 1, 22L);
                    zc0Var.q(1, str == null ? 0 : 1, str);
                }
                break;
            default:
                ve0 ve0Var = (ve0) ((ck0) obj).f().c.getValue();
                String queryParameter = ((Uri) obj2).getQueryParameter(Constants.Params.CLIENT);
                if (queryParameter == null) {
                    queryParameter = "<none>";
                } else if (!queryParameter.equals("ms-opera-mobile") && !c.q(queryParameter, "android-ofa-", false) && !queryParameter.equals("opera")) {
                    queryParameter.equals("ms-opera-mi-android");
                }
                ve0Var.a(queryParameter, new zbe((byte) 26));
                break;
        }
        return Unit.a;
    }
}

package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.leanplum.internal.ResourceQualifiers;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class cp8 implements r0k {
    public final Handler a;
    public final Context b;
    public final pup c;
    public final arp d;
    public final q1p e;
    public final z4k f;
    public final z4k g;
    public final ThreadPoolExecutor h;
    public final File i;
    public final AtomicReference j;
    public final Set k;
    public final Set l;
    public final AtomicBoolean m;

    public cp8(Context context, File file, pup pupVar, arp arpVar) {
        ThreadPoolExecutor threadPoolExecutorR = ocp.r();
        q1p q1pVar = new q1p();
        q1pVar.a = context;
        this.a = new Handler(Looper.getMainLooper());
        this.j = new AtomicReference();
        this.k = Collections.synchronizedSet(new HashSet());
        this.l = Collections.synchronizedSet(new HashSet());
        this.m = new AtomicBoolean(false);
        this.b = context;
        this.i = file;
        this.c = pupVar;
        this.d = arpVar;
        this.h = threadPoolExecutorR;
        this.e = q1pVar;
        this.g = new z4k((byte) 26);
        this.f = new z4k((byte) 26);
        AtomicReference atomicReference = ytp.a;
    }

    @Override // defpackage.r0k
    public final Task a(List list) {
        return Tasks.forException(new p0k(-5));
    }

    @Override // defpackage.r0k
    public final Task b(int i) {
        qop qopVar;
        try {
            synchronized (this) {
                qop qopVarN = n();
                qopVar = (qop) zqp.h(new aup(qopVarN, i));
                AtomicReference atomicReference = this.j;
                while (true) {
                    if (!atomicReference.compareAndSet(qopVarN, qopVar)) {
                        if (atomicReference.get() != qopVarN && atomicReference.get() != qopVarN) {
                            qopVar = null;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (qopVar != null) {
                this.a.post(new iqp(this, qopVar, (byte) 3));
            }
            return Tasks.forResult((Object) null);
        } catch (zqp e) {
            return Tasks.forException(e.g());
        }
    }

    @Override // defpackage.r0k
    public final Task c() {
        qop qopVarN = n();
        return Tasks.forResult(qopVarN != null ? Collections.singletonList(qopVarN) : Collections.EMPTY_LIST);
    }

    @Override // defpackage.r0k
    public final boolean d(qop qopVar, gdb gdbVar, int i) {
        return false;
    }

    @Override // defpackage.r0k
    public final void e(a9e a9eVar) {
        z4k z4kVar = this.g;
        synchronized (z4kVar) {
            ((HashSet) z4kVar.b).add(a9eVar);
        }
    }

    @Override // defpackage.r0k
    public final void f(a9e a9eVar) {
        z4k z4kVar = this.g;
        synchronized (z4kVar) {
            ((HashSet) z4kVar.b).remove(a9eVar);
        }
    }

    @Override // defpackage.r0k
    public final Task g(int i) {
        qop qopVarN = n();
        return (qopVarN == null || qopVarN.a != i) ? Tasks.forException(new p0k(-4)) : Tasks.forResult(qopVarN);
    }

    @Override // defpackage.r0k
    public final Set h() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.c.b());
        hashSet.addAll(this.k);
        return hashSet;
    }

    @Override // defpackage.r0k
    public final Task i(n9h n9hVar) {
        qop qopVar;
        Integer num;
        int i;
        File[] fileArr;
        int i2;
        HashMap map;
        int i3;
        String strConcat;
        try {
            synchronized (this) {
                qop qopVarN = n();
                qopVar = (qop) zqp.h(new sxd(qopVarN, n9hVar, (byte) 6));
                AtomicReference atomicReference = this.j;
                while (true) {
                    if (atomicReference.compareAndSet(qopVarN, qopVar)) {
                        break;
                    }
                    if (atomicReference.get() != qopVarN && atomicReference.get() != qopVarN) {
                        qopVar = null;
                        break;
                    }
                }
            }
            if (qopVar == null) {
                return l(-100);
            }
            int i4 = qopVar.a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) n9hVar.c;
            int size = arrayList2.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList2.get(i6);
                i6++;
                arrayList.add(((Locale) obj).getLanguage());
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            File[] fileArrListFiles = this.i.listFiles(ltp.b);
            if (fileArrListFiles == null) {
                return l(-5);
            }
            int i7 = 0;
            long length = 0;
            while (i7 < fileArrListFiles.length) {
                File file = fileArrListFiles[i7];
                String strQ = w0h.q(file);
                String str = strQ.split("\\.config\\.", 2)[i5];
                hashSet.add(strQ);
                if (((ArrayList) n9hVar.b).contains(str)) {
                    String str2 = strQ.split("\\.config\\.", 2)[i5];
                    LocaleList locales = this.e.a.getResources().getConfiguration().getLocales();
                    i2 = i5;
                    i = i4;
                    ArrayList arrayList4 = new ArrayList(locales.size());
                    fileArr = fileArrListFiles;
                    int i8 = i2;
                    while (i8 < locales.size()) {
                        Locale locale = locales.get(i8);
                        String language = locale.getLanguage();
                        if (locale.getCountry().isEmpty()) {
                            strConcat = "";
                            i3 = i8;
                        } else {
                            i3 = i8;
                            strConcat = "_".concat(String.valueOf(locale.getCountry()));
                        }
                        arrayList4.add(String.valueOf(language).concat(strConcat));
                        i8 = i3 + 1;
                    }
                    HashSet hashSet2 = new HashSet(arrayList4);
                    HashMap mapA = m().a(Arrays.asList(str2));
                    HashSet hashSet3 = new HashSet();
                    Iterator it = mapA.values().iterator();
                    while (it.hasNext()) {
                        hashSet3.addAll((Set) it.next());
                    }
                    HashSet hashSet4 = new HashSet();
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        String str3 = (String) it2.next();
                        if (str3.contains("_")) {
                            map = mapA;
                            str3 = str3.split("_", -1)[i2];
                        } else {
                            map = mapA;
                        }
                        hashSet4.add(str3);
                        mapA = map;
                    }
                    HashMap map2 = mapA;
                    hashSet4.addAll(this.l);
                    hashSet4.addAll(arrayList);
                    HashSet hashSet5 = new HashSet();
                    for (Map.Entry entry : map2.entrySet()) {
                        if (hashSet4.contains(entry.getKey())) {
                            hashSet5.addAll((Collection) entry.getValue());
                        }
                    }
                    if (!hashSet3.contains(strQ) || hashSet5.contains(strQ)) {
                        length += file.length();
                        arrayList3.add(file);
                        break;
                    }
                    i7++;
                    i5 = i2;
                    i4 = i;
                    fileArrListFiles = fileArr;
                } else {
                    i = i4;
                    fileArr = fileArrListFiles;
                    i2 = i5;
                }
                ArrayList arrayList5 = (ArrayList) n9hVar.c;
                ArrayList arrayList6 = new ArrayList(this.k);
                arrayList6.addAll(Arrays.asList("", "base"));
                HashMap mapA2 = m().a(arrayList6);
                int size2 = arrayList5.size();
                int i9 = i2;
                while (i9 < size2) {
                    Object obj2 = arrayList5.get(i9);
                    i9++;
                    Locale locale2 = (Locale) obj2;
                    if (mapA2.containsKey(locale2.getLanguage()) && ((Set) mapA2.get(locale2.getLanguage())).contains(strQ)) {
                        length += file.length();
                        arrayList3.add(file);
                        break;
                        break;
                    }
                }
                i7++;
                i5 = i2;
                i4 = i;
                fileArrListFiles = fileArr;
            }
            int i10 = i4;
            int i11 = i5;
            hashSet.toString();
            String.valueOf((ArrayList) n9hVar.b);
            if (((ArrayList) n9hVar.b).size() != 1 || (num = (Integer) ((irp) this.d.zza()).b.get(((ArrayList) n9hVar.b).get(i11))) == null) {
                num = ((irp) this.d.zza()).a;
            }
            if (num != null) {
                return l(num.intValue());
            }
            if (!hashSet.containsAll(new HashSet((ArrayList) n9hVar.b))) {
                return l(-2);
            }
            Long lValueOf = Long.valueOf(length);
            ArrayList arrayList7 = (ArrayList) n9hVar.b;
            Integer numValueOf = Integer.valueOf(i10);
            p(1, 0, numValueOf, 0L, lValueOf, arrayList7, arrayList);
            this.h.execute(new iv(this, arrayList3, arrayList, false, (byte) 20));
            return Tasks.forResult(numValueOf);
        } catch (zqp e) {
            return l(e.g().d());
        }
    }

    @Override // defpackage.r0k
    public final Set j() {
        HashSet hashSet = new HashSet();
        pup pupVar = this.c;
        if (pupVar.c() != null) {
            hashSet.addAll(pupVar.c());
        }
        hashSet.addAll(this.l);
        return hashSet;
    }

    @Override // defpackage.r0k
    public final Task k(ArrayList arrayList) {
        return Tasks.forException(new p0k(-5));
    }

    public final Task l(int i) {
        o(new sa2((byte) 23, i, false));
        return Tasks.forException(new p0k(i));
    }

    public final ppp m() throws Resources.NotFoundException {
        Context context = this.b;
        try {
            ppp pppVarA = this.c.a(context.getPackageManager().getPackageInfo(context.getPackageName(), ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL).applicationInfo.metaData);
            if (pppVarA != null) {
                return pppVarA;
            }
            qp2.n("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            h9o.m("App is not found in PackageManager", e);
            return null;
        }
    }

    public final qop n() {
        return (qop) this.j.get();
    }

    public final synchronized qop o(nup nupVar) {
        qop qopVarN = n();
        qop qopVarD = nupVar.d(qopVarN);
        AtomicReference atomicReference = this.j;
        while (!atomicReference.compareAndSet(qopVarN, qopVarD)) {
            if (atomicReference.get() != qopVarN && atomicReference.get() != qopVarN) {
                return null;
            }
        }
        return qopVarD;
    }

    public final boolean p(int i, int i2, Integer num, Long l, Long l2, ArrayList arrayList, ArrayList arrayList2) {
        qop qopVarO = o(new usp(i, i2, num, l, l2, arrayList, arrayList2));
        if (qopVarO == null) {
            return false;
        }
        this.a.post(new iqp(this, qopVarO, (byte) 3));
        return true;
    }
}

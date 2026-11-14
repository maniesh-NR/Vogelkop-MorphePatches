package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.icu.text.Collator;
import android.icu.text.RuleBasedCollator;
import android.icu.text.StringSearch;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.TabInfo;
import com.opera.android.settings.settings_search.database.SettingsSearchDatabase;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal._CacheControlCommonKt;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public class a21 implements f94, w9l, x9l {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public Object l;
    public Object m;

    public a21(Context context, tcl tclVar, rf7 rf7Var, BrowserActivity browserActivity, uk6 uk6Var, Uri uri, String str, String str2, Uri uri2, String str3, hu5 hu5Var, x5f x5fVar) {
        this.a = context;
        this.b = tclVar;
        this.c = rf7Var;
        this.d = browserActivity;
        this.e = uk6Var;
        this.f = uri;
        this.g = str;
        this.h = uri2;
        this.i = str3;
        this.m = hu5Var;
        this.l = x5fVar;
        String[] strArr = OperaApplication.K;
        bf9 bf9VarS = ((OperaApplication) context.getApplicationContext()).s();
        bf9VarS.getClass();
        byte[] bArrDecode = Base64.decode(str2, 0);
        SecretKeySpec secretKeySpecX = bf9VarS.x();
        Cipher cipherA = secretKeySpecX == null ? null : p36.a(2, secretKeySpecX, bArrDecode, false);
        this.k = cipherA;
        if (cipherA == null) {
            this.j = null;
            vml.c(new bl6(this, (byte) 19));
            return;
        }
        t9f t9fVar = (t9f) xne.b.get();
        fvh fvhVar = new fvh();
        fvhVar.c();
        fvhVar.h(uri.toString());
        c74 c74VarCommonNoCache = _CacheControlCommonKt.commonNoCache(new c74());
        c74VarCommonNoCache.getClass();
        c74 c74VarCommonNoStore = _CacheControlCommonKt.commonNoStore(c74VarCommonNoCache);
        c74VarCommonNoStore.getClass();
        fvhVar.b(_CacheControlCommonKt.commonBuild(c74VarCommonNoStore));
        RealCall realCallC = t9fVar.c(new kvh(fvhVar));
        this.j = realCallC;
        realCallC.enqueue(this);
    }

    public a21(Context context, w6j... w6jVarArr) {
        SettingsSearchDatabase settingsSearchDatabase = (SettingsSearchDatabase) xih.f(context.getApplicationContext(), SettingsSearchDatabase.class, "settings_search.db").b();
        i06 i06Var = new i06((byte) 29);
        Locale locale = Locale.getDefault();
        h9j h9jVar = h9j.e;
        this.a = context;
        this.b = settingsSearchDatabase;
        this.c = i06Var;
        this.d = w6jVarArr;
        this.e = h9jVar;
        ami amiVar = new ami(context, (byte) 11);
        this.f = amiVar;
        Collator collator = Collator.getInstance(locale);
        final byte b = 0;
        collator.setStrength(0);
        this.g = (RuleBasedCollator) collator;
        h42 h42Var = new h42();
        zyk zykVar = (zyk) amiVar.c;
        h42Var.s((ekc) zykVar.getValue(), new t7d(new tji((Object) this, (byte) 14), (byte) 11));
        this.h = h42Var;
        ekc ekcVar = (ekc) zykVar.getValue();
        pjb pjbVar = settingsSearchDatabase.x().a.f;
        this.i = new kbd(ekcVar, (pjbVar == null ? null : pjbVar).a(new String[]{"recent_searches"}, false, new u4h((byte) 9)), new nqi((Object) this, (byte) 4));
        this.j = new f7f(this) { // from class: g9j
            public final /* synthetic */ a21 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                a21 a21Var = this.b;
                switch (b2) {
                    case 0:
                        r6j r6jVar = (r6j) obj;
                        ami amiVar2 = (ami) a21Var.f;
                        amiVar2.C(r6jVar);
                        Iterator it = r6jVar.j.b.iterator();
                        while (it.hasNext()) {
                            amiVar2.C((r6j) it.next());
                        }
                        if (!((ekc) ((zyk) amiVar2.c).getValue()).h()) {
                            ((AtomicBoolean) amiVar2.h).set(true);
                            break;
                        } else {
                            amiVar2.q();
                            break;
                        }
                    default:
                        ix4 ix4Var = (ix4) obj;
                        ami amiVar3 = (ami) a21Var.f;
                        LinkedHashSet linkedHashSetM0 = CollectionsKt.m0((Set) amiVar3.g);
                        linkedHashSetM0.removeAll(ix4Var.a);
                        linkedHashSetM0.addAll(ix4Var.b);
                        if (!Intrinsics.a((Set) amiVar3.g, linkedHashSetM0)) {
                            amiVar3.g = linkedHashSetM0;
                            if (!((ekc) ((zyk) amiVar3.c).getValue()).h()) {
                                ((AtomicBoolean) amiVar3.h).set(true);
                                break;
                            } else {
                                amiVar3.q();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.k = new f7f(this) { // from class: g9j
            public final /* synthetic */ a21 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                a21 a21Var = this.b;
                switch (b22) {
                    case 0:
                        r6j r6jVar = (r6j) obj;
                        ami amiVar2 = (ami) a21Var.f;
                        amiVar2.C(r6jVar);
                        Iterator it = r6jVar.j.b.iterator();
                        while (it.hasNext()) {
                            amiVar2.C((r6j) it.next());
                        }
                        if (!((ekc) ((zyk) amiVar2.c).getValue()).h()) {
                            ((AtomicBoolean) amiVar2.h).set(true);
                            break;
                        } else {
                            amiVar2.q();
                            break;
                        }
                    default:
                        ix4 ix4Var = (ix4) obj;
                        ami amiVar3 = (ami) a21Var.f;
                        LinkedHashSet linkedHashSetM0 = CollectionsKt.m0((Set) amiVar3.g);
                        linkedHashSetM0.removeAll(ix4Var.a);
                        linkedHashSetM0.addAll(ix4Var.b);
                        if (!Intrinsics.a((Set) amiVar3.g, linkedHashSetM0)) {
                            amiVar3.g = linkedHashSetM0;
                            if (!((ekc) ((zyk) amiVar3.c).getValue()).h()) {
                                ((AtomicBoolean) amiVar3.h).set(true);
                                break;
                            } else {
                                amiVar3.q();
                                break;
                            }
                        }
                        break;
                }
            }
        };
    }

    public a21(da6 da6Var, fa6 fa6Var, srm srmVar) {
        this.a = srmVar;
        this.b = ie7.a(new r72(da6Var, fa6Var, this, 1));
        this.c = ie7.a(new r72(da6Var, fa6Var, this, 2));
        this.d = ie7.a(new r72(da6Var, fa6Var, this, 7));
        this.e = ie7.a(new r72(da6Var, fa6Var, this, 8));
        this.f = ie7.a(new r72(da6Var, fa6Var, this, 6));
        this.g = ie7.a(new r72(da6Var, fa6Var, this, 9));
        this.h = ie7.a(new r72(da6Var, fa6Var, this, 5));
        this.i = ie7.a(new r72(da6Var, fa6Var, this, 11));
        this.j = ie7.a(new r72(da6Var, fa6Var, this, 10));
        this.k = ie7.a(new r72(da6Var, fa6Var, this, 4));
        this.l = ie7.a(new r72(da6Var, fa6Var, this, 3));
        this.m = ie7.a(new r72(da6Var, fa6Var, this, 0));
    }

    public a21(qdb qdbVar, Function0 function0, z77 z77Var, k6l k6lVar, i53 i53Var, nr8 nr8Var, u4l u4lVar, s9i s9iVar, ysj ysjVar, Function0 function02, w9l w9lVar) {
        this.a = qdbVar;
        this.b = function0;
        this.c = z77Var;
        this.d = k6lVar;
        this.e = i53Var;
        this.f = nr8Var;
        this.g = u4lVar;
        this.h = s9iVar;
        this.i = ysjVar;
        this.j = function02;
        this.k = w9lVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(mzg.i(k6lVar, p6l.a));
        linkedHashSet.addAll(mzg.i(k6lVar, p6l.b));
        this.m = new pde(CollectionsKt.n0(linkedHashSet));
    }

    public a21(qej qejVar, p01 p01Var, Function0 function0, j3i j3iVar, Function1 function1) {
        this.a = p01Var;
        this.b = function0;
        this.c = j3iVar;
        this.d = function1;
        this.e = new pgb();
        this.f = new z11(this);
        this.g = hyg.k(qejVar);
        final byte b = 0;
        this.j = luj.b(new Function0(this) { // from class: s11
            public final /* synthetic */ a21 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                a21 a21Var = this.b;
                switch (b2) {
                    case 0:
                        Object value = ((t0g) a21Var.h).getValue();
                        if (value != null) {
                            return value;
                        }
                        float fH = ((p0g) a21Var.k).h();
                        boolean zIsNaN = Float.isNaN(fH);
                        t0g t0gVar = (t0g) a21Var.g;
                        return !zIsNaN ? a21Var.c(fH, 0.0f, t0gVar.getValue()) : t0gVar.getValue();
                    case 1:
                        Object value2 = ((t0g) a21Var.h).getValue();
                        if (value2 != null) {
                            return value2;
                        }
                        float fH2 = ((p0g) a21Var.k).h();
                        boolean zIsNaN2 = Float.isNaN(fH2);
                        t0g t0gVar2 = (t0g) a21Var.g;
                        if (zIsNaN2) {
                            return t0gVar2.getValue();
                        }
                        Object value3 = t0gVar2.getValue();
                        x9d x9dVarH = a21Var.h();
                        float fD = x9dVarH.d(value3);
                        if (fD != fH2 && !Float.isNaN(fD)) {
                            if (fD < fH2) {
                                Object objB = x9dVarH.b(fH2, true);
                                if (objB != null) {
                                    return objB;
                                }
                            } else {
                                Object objB2 = x9dVarH.b(fH2, false);
                                if (objB2 != null) {
                                    return objB2;
                                }
                            }
                        }
                        return value3;
                    case 2:
                        return a21Var.h();
                    default:
                        return new Pair(a21Var.h(), ((i37) a21Var.j).getValue());
                }
            }
        });
        final byte b2 = 1;
        luj.b(new Function0(this) { // from class: s11
            public final /* synthetic */ a21 b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                a21 a21Var = this.b;
                switch (b22) {
                    case 0:
                        Object value = ((t0g) a21Var.h).getValue();
                        if (value != null) {
                            return value;
                        }
                        float fH = ((p0g) a21Var.k).h();
                        boolean zIsNaN = Float.isNaN(fH);
                        t0g t0gVar = (t0g) a21Var.g;
                        return !zIsNaN ? a21Var.c(fH, 0.0f, t0gVar.getValue()) : t0gVar.getValue();
                    case 1:
                        Object value2 = ((t0g) a21Var.h).getValue();
                        if (value2 != null) {
                            return value2;
                        }
                        float fH2 = ((p0g) a21Var.k).h();
                        boolean zIsNaN2 = Float.isNaN(fH2);
                        t0g t0gVar2 = (t0g) a21Var.g;
                        if (zIsNaN2) {
                            return t0gVar2.getValue();
                        }
                        Object value3 = t0gVar2.getValue();
                        x9d x9dVarH = a21Var.h();
                        float fD = x9dVarH.d(value3);
                        if (fD != fH2 && !Float.isNaN(fD)) {
                            if (fD < fH2) {
                                Object objB = x9dVarH.b(fH2, true);
                                if (objB != null) {
                                    return objB;
                                }
                            } else {
                                Object objB2 = x9dVarH.b(fH2, false);
                                if (objB2 != null) {
                                    return objB2;
                                }
                            }
                        }
                        return value3;
                    case 2:
                        return a21Var.h();
                    default:
                        return new Pair(a21Var.h(), ((i37) a21Var.j).getValue());
                }
            }
        });
        this.k = new p0g(Float.NaN);
        new cf2(0);
        new h37(ytj.h().g());
        this.l = new p0g(0.0f);
        this.h = hyg.k((Object) null);
        this.i = hyg.k(new x9d(n08.a));
        this.m = new w11(this);
    }

    public static List g(v6j v6jVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(v6jVar);
        Iterator it = v6jVar.d().iterator();
        while (it.hasNext()) {
            arrayList.addAll(g((ex4) it.next()));
        }
        return CollectionsKt.k0(arrayList);
    }

    public static void s(a21 a21Var, List list, String str, int i) {
        String string;
        if ((i & 1) != 0) {
            list = (List) ((ekc) ((zyk) ((ami) a21Var.f).c).getValue()).g();
        }
        if ((i & 2) != 0 && (str = (String) a21Var.m) == null) {
            str = (String) ((shf) a21Var.e).a;
        }
        if (str != null) {
            a21Var.getClass();
            string = StringsKt.l0(str).toString();
        } else {
            string = null;
        }
        a21Var.m = string;
        if (list == null) {
            return;
        }
        if (string == null) {
            string = "";
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ehc ehcVar = ((l6j) obj).h;
            if (ehcVar == null || !ehcVar.isEmpty()) {
                Iterator it = ehcVar.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (new StringSearch(string, new StringCharacterIterator((String) it.next()), (RuleBasedCollator) a21Var.g).next() >= 0) {
                            arrayList.add(obj);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        List listK0 = CollectionsKt.k0(arrayList);
        ((shf) a21Var.e).S(listK0.isEmpty() ? null : (String) a21Var.m);
        ((h42) a21Var.h).n(listK0);
    }

    @Override // defpackage.x9l
    public final ikc C() {
        return (pde) this.m;
    }

    @Override // defpackage.x9l
    public boolean D(int i) {
        return false;
    }

    @Override // defpackage.x9l
    public b2l E(int i) {
        k6l k6lVar = (k6l) this.d;
        s3l s3lVar = u3l.a;
        ArrayList arrayListP = exg.p(k6lVar, new r3l(i), y6l.a);
        p6l p6lVarT = !arrayListP.isEmpty() ? ((b2l) CollectionsKt.K(arrayListP)).T() : p6l.a;
        ((qdb) this.a).b(vr0.i);
        return ((w9l) this.k).j0(p6lVarT, new TabInfo(0, i, System.currentTimeMillis(), 0L));
    }

    @Override // defpackage.w9l
    public final void L(Long l) {
        ((w9l) this.k).L(l);
    }

    @Override // defpackage.x9l
    public final void N(z3 z3Var) {
        ((qdb) this.a).b(vr0.l);
        int iL = ((vzk) ((k6l) this.d).a.b).L(false);
        z77 z77Var = (z77) this.c;
        dw7 dw7Var = new dw7((Context) ((Function0) this.b).invoke(), (u4l) this.g, iL, new ug5(z3Var, iL, (byte) 4));
        z77Var.getClass();
        z77Var.b(dw7Var, ijm.b);
    }

    @Override // defpackage.x9l
    public final void O(Iterable iterable, boolean z, boolean z2) {
        ((qdb) this.a).b(z ? vr0.s : vr0.u);
        t6l t6lVar = new t6l((k6l) this.d, z, iterable, (byte) 1);
        if (z2) {
            q(t6lVar);
        }
    }

    @Override // defpackage.x9l
    public final void P(Integer num, Set set, vr0 vr0Var) {
        ((qdb) this.a).b(vr0Var);
        if (set.isEmpty()) {
            return;
        }
        k6l k6lVar = (k6l) this.d;
        m4l m4lVarA = ((u4l) this.g).a(num != null ? num.intValue() : ((vzk) k6lVar.a.b).L(false));
        boolean z = num == null;
        List listK0 = CollectionsKt.k0(Collections.unmodifiableList(k6lVar.b));
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b2l b2lVar = (b2l) it.next();
            arrayList.add(new s6l(b2lVar, ((d7l) b2lVar).j.a().d));
        }
        h6l h6lVar = h6l.d;
        k6lVar.h(h6lVar);
        try {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                b2l b2lVar2 = (b2l) it2.next();
                ((d7l) b2lVar2).s(TabInfo.a(((d7l) b2lVar2).j.a(), 0L, 0, m4lVarA.a, 7));
            }
            k6lVar.n(h6lVar);
            exg.d(k6lVar);
            q(new s14(k6lVar, m4lVarA, z, listK0, arrayList, (byte) 21));
        } catch (Throwable th) {
            k6lVar.n(h6lVar);
            throw th;
        }
    }

    @Override // defpackage.x9l
    public boolean X(List list) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gfe r15, x11 r16, nt5 r17) {
        /*
            r14 = this;
            r0 = r17
            java.lang.Object r1 = r14.d
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r2 = r14.k
            p0g r2 = (p0g) r2
            boolean r3 = r0 instanceof defpackage.t11
            if (r3 == 0) goto L1d
            r3 = r0
            t11 r3 = (defpackage.t11) r3
            int r4 = r3.v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1d
            int r4 = r4 - r5
            r3.v = r4
            goto L22
        L1d:
            t11 r3 = new t11
            r3.<init>(r14, r0)
        L22:
            java.lang.Object r0 = r3.t
            px5 r4 = px5.a
            int r5 = r3.v
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 1
            if (r5 == 0) goto L3a
            if (r5 != r7) goto L33
            ybh.y(r0)     // Catch: java.lang.Throwable -> L93
            goto L5e
        L33:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r14)
            r14 = 0
            return r14
        L3a:
            ybh.y(r0)
            java.lang.Object r0 = r14.e     // Catch: java.lang.Throwable -> L93
            r10 = r0
            pgb r10 = (pgb) r10     // Catch: java.lang.Throwable -> L93
            u11 r11 = new u11     // Catch: java.lang.Throwable -> L93
            r0 = 0
            r12 = 0
            r5 = r16
            r11.<init>(r14, r5, r12, r0)     // Catch: java.lang.Throwable -> L93
            r3.v = r7     // Catch: java.lang.Throwable -> L93
            r10.getClass()     // Catch: java.lang.Throwable -> L93
            ogb r8 = new ogb     // Catch: java.lang.Throwable -> L93
            r13 = 0
            r9 = r15
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L93
            java.lang.Object r15 = sgb.q(r8, r3)     // Catch: java.lang.Throwable -> L93
            if (r15 != r4) goto L5e
            return r4
        L5e:
            x9d r15 = r14.h()
            float r0 = r2.h()
            java.lang.Object r15 = r15.a(r0)
            if (r15 == 0) goto L90
            float r0 = r2.h()
            x9d r2 = r14.h()
            float r2 = r2.d(r15)
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L90
            java.lang.Object r0 = r1.invoke(r15)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L90
            r14.n(r15)
        L90:
            kotlin.Unit r14 = kotlin.Unit.a
            return r14
        L93:
            r0 = move-exception
            r15 = r0
            x9d r0 = r14.h()
            float r3 = r2.h()
            java.lang.Object r0 = r0.a(r3)
            if (r0 == 0) goto Lc7
            float r2 = r2.h()
            x9d r3 = r14.h()
            float r3 = r3.d(r0)
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 > 0) goto Lc7
            java.lang.Object r1 = r1.invoke(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lc7
            r14.n(r0)
        Lc7:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a21.a(gfe, x11, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r19, gfe r20, dr9 r21, nt5 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a21.b(java.lang.Object, gfe, dr9, nt5):java.lang.Object");
    }

    public final Object c(float f, float f2, Object obj) {
        p01 p01Var = (p01) this.a;
        x9d x9dVarH = h();
        float fD = x9dVarH.d(obj);
        float fFloatValue = ((Number) ((Function0) this.b).invoke()).floatValue();
        if (fD != f && !Float.isNaN(fD)) {
            if (fD < f) {
                if (f2 >= fFloatValue) {
                    return x9dVarH.b(f, true);
                }
                Object objB = x9dVarH.b(f, true);
                if (f >= Math.abs(Math.abs(((Number) p01Var.invoke(Float.valueOf(Math.abs(x9dVarH.d(objB) - fD)))).floatValue()) + fD)) {
                    return objB;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    return x9dVarH.b(f, false);
                }
                Object objB2 = x9dVarH.b(f, false);
                float fAbs = Math.abs(fD - Math.abs(((Number) p01Var.invoke(Float.valueOf(Math.abs(fD - x9dVarH.d(objB2))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objB2;
                }
            }
        }
        return obj;
    }

    public final android.util.Pair d(vzh vzhVar, FileOutputStream fileOutputStream) throws BadPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, ShortBufferException {
        MessageDigest messageDigest;
        int i;
        int iUpdate;
        Cipher cipher = (Cipher) this.k;
        if (cipher == null) {
            return null;
        }
        InputStream inputStreamByteStream = vzhVar.byteStream();
        byte[] bArr = new byte[65536];
        byte[] bArr2 = new byte[65536];
        long j = 0;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        do {
            i = inputStreamByteStream.read(bArr);
            while (true) {
                int i2 = 0;
                if (i != -1) {
                    iUpdate = cipher.update(bArr, 0, i, bArr2);
                    break;
                }
                try {
                    int outputSize = cipher.getOutputSize(0);
                    if (outputSize > bArr2.length) {
                        bArr2 = new byte[outputSize];
                    }
                    iUpdate = cipher.doFinal(bArr2, 0);
                } catch (ShortBufferException unused2) {
                    if (i != -1) {
                        i2 = i;
                    }
                    bArr2 = new byte[cipher.getOutputSize(i2)];
                }
            }
            j += iUpdate;
            if (messageDigest != null) {
                messageDigest.update(bArr2, 0, iUpdate);
            }
            fileOutputStream.write(bArr2, 0, iUpdate);
        } while (i != -1);
        fileOutputStream.close();
        return new android.util.Pair(Long.valueOf(j), messageDigest != null ? messageDigest.digest() : null);
    }

    @Override // defpackage.x9l
    public final void d0(b2l b2lVar) {
        ((qdb) this.a).b(vr0.m);
        ((k6l) this.d).i(b2lVar, false);
    }

    public final void e(int i) {
        pde pdeVar = (pde) this.m;
        if (i != 0) {
            LinkedHashSet linkedHashSetM0 = CollectionsKt.m0((Iterable) pdeVar.g());
            if (linkedHashSetM0.add(Integer.valueOf(i))) {
                pdeVar.r(linkedHashSetM0);
            }
        }
    }

    public final void f() {
        RealCall realCall = (RealCall) this.j;
        if (realCall != null) {
            realCall.cancel();
        }
        Uri uri = (Uri) this.h;
        (uri.getScheme().equals("file") ? new bkh(new File(uri.getPath())) : dd7.e((Context) this.a, uri)).c();
        ((uk6) this.e).f(new glj(2132018657, 2500));
        hu5 hu5Var = (hu5) this.m;
        if (hu5Var == null) {
            return;
        }
        this.m = null;
        hu5Var.run(Boolean.FALSE);
    }

    @Override // defpackage.x9l
    public final void g0(final Set set, final pdb pdbVar, final vr0 vr0Var, boolean z) {
        Object v6lVar;
        qdb qdbVar = (qdb) this.a;
        if (z) {
            Context context = (Context) ((Function0) this.b).invoke();
            g25 g25Var = new g25(context, 2132018252, new txh(new Object[]{Integer.valueOf(set.size())}, 2131886155, set.size()), 2132018256, new DialogInterface.OnClickListener() { // from class: y9l
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.g0(set, pdbVar, vr0Var, false);
                }
            });
            z77 z77VarU = sfe.U(context);
            z77VarU.getClass();
            z77VarU.b(g25Var, ijm.b);
            return;
        }
        qdbVar.b(vr0Var);
        qdbVar.a(pdbVar);
        if (set.isEmpty()) {
            return;
        }
        k6l k6lVar = (k6l) this.d;
        Function0 function0 = (Function0) this.j;
        shf shfVar = new shf();
        shfVar.a = k6lVar;
        shfVar.b = function0;
        shfVar.c = new ArrayList();
        List listUnmodifiableList = Collections.unmodifiableList(k6lVar.b);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b2l b2lVar = (b2l) it.next();
            int iIndexOf = listUnmodifiableList.indexOf(b2lVar);
            if (iIndexOf != -1) {
                ArrayList arrayList = (ArrayList) shfVar.c;
                if (((d7l) b2lVar).j.m()) {
                    d7l d7lVar = (d7l) b2lVar;
                    v6lVar = new u6l(iIndexOf, d7lVar.j.getUrl(), d7lVar.j.a());
                } else {
                    d7l d7lVar2 = (d7l) b2lVar;
                    v6lVar = new v6l(iIndexOf, d7lVar2.j.getId(), d7lVar2.j.getUrl(), d7lVar2.j.a());
                }
                arrayList.add(v6lVar);
            }
        }
        n95.r(new vd3(new voj((byte) 20), (byte) 5), (ArrayList) shfVar.c);
        ((k6l) shfVar.a).l(set);
        q(shfVar);
    }

    public final x9d h() {
        return (x9d) ((t0g) this.i).getValue();
    }

    @Override // defpackage.w9l
    public final b2l h0(b2l b2lVar, TabInfo tabInfo) {
        ((qdb) this.a).b(vr0.b);
        return ((w9l) this.k).h0(b2lVar, tabInfo);
    }

    public final float i(float f) {
        Float fValueOf;
        p0g p0gVar = (p0g) this.k;
        float fH = (Float.isNaN(p0gVar.h()) ? 0.0f : p0gVar.h()) + f;
        float fC = h().c();
        Iterator it = h().a.values().iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return djh.b(fH, fC, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    public final void j() {
        ArrayList arrayList = (ArrayList) this.l;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                v6j v6jVar = (v6j) obj;
                v6jVar.b.p((g9j) this.j);
                v6jVar.c().p((g9j) this.k);
            }
        }
        this.l = null;
    }

    @Override // defpackage.w9l
    public final b2l j0(p6l p6lVar, TabInfo tabInfo) {
        vr0 vr0Var;
        qdb qdbVar = (qdb) this.a;
        int iOrdinal = p6lVar.ordinal();
        if (iOrdinal == 0) {
            vr0Var = vr0.b;
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                return null;
            }
            vr0Var = vr0.c;
        }
        qdbVar.b(vr0Var);
        return ((w9l) this.k).j0(p6lVar, tabInfo);
    }

    @Override // defpackage.w9l
    public final b2l k(p6l p6lVar) {
        ((qdb) this.a).b(vr0.b);
        return ((w9l) this.k).k(p6lVar);
    }

    @Override // defpackage.x9l
    public void k0() {
    }

    public final float l() {
        p0g p0gVar = (p0g) this.k;
        if (!Float.isNaN(p0gVar.h())) {
            return p0gVar.h();
        }
        qp2.n("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    @Override // defpackage.x9l
    public void m(b2l b2lVar) {
        ((k6l) this.d).C(b2lVar, 3);
    }

    @Override // defpackage.x9l
    public final void m0(LinkedHashSet linkedHashSet) {
        ((qdb) this.a).b(vr0.A);
        wjj wjjVar = new wjj((Context) ((Function0) this.b).invoke(), (i53) this.e, linkedHashSet);
        ehc ehcVar = (ehc) wjjVar.d;
        if (ehcVar.isEmpty()) {
            return;
        }
        al3 al3Var = (ml3) wjjVar.c;
        if (al3Var == null) {
            al3Var = (al3) CollectionsKt.firstOrNull(ehcVar);
        }
        Long lValueOf = al3Var != null ? Long.valueOf(al3Var.getId()) : null;
        pxh pxhVarH = wjjVar.h();
        rxh rxhVar = new rxh(2132022116);
        eek eekVar = new eek((Object) this, (Object) lValueOf, (byte) 12);
        r2f r2fVar = (r2f) this.l;
        if (r2fVar != null) {
            r2fVar.b(hjm.b, 3);
        }
        hf hfVar = new hf((txh) pxhVarH, rxhVar, eekVar);
        ysj ysjVar = (ysj) this.i;
        ysjVar.getClass();
        ysjVar.b(hfVar, ijm.b);
    }

    public final void n(Object obj) {
        ((t0g) this.g).setValue(obj);
    }

    @Override // defpackage.x9l
    public void o() {
    }

    @Override // defpackage.x9l
    public final void o0(Iterable iterable, boolean z, boolean z2) {
        ((qdb) this.a).b(z ? vr0.r : vr0.t);
        t6l t6lVar = new t6l((k6l) this.d, z, iterable, (byte) 0);
        if (z2) {
            q(t6lVar);
        }
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        vml.e(new bl6(this, (byte) 19));
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        tcl tclVar = (tcl) this.b;
        if (!pzhVar.q) {
            pzhVar.close();
            tclVar.d(new bl6(this, (byte) 19)).a(null);
        } else {
            nml nmlVarB = tclVar.b(new ow3(this, pzhVar, (byte) 1));
            nmlVarB.b(((umi) tclVar).f(new uk6((Object) this, (byte) 13)));
            nmlVarB.a(null);
        }
    }

    public final void p(Object obj) {
        ((t0g) this.h).setValue(obj);
    }

    @Override // defpackage.x9l
    public final void p0(int i) {
        ((qdb) this.a).b(vr0.l);
        z77 z77Var = (z77) this.c;
        dw7 dw7Var = new dw7((Context) ((Function0) this.b).invoke(), (u4l) this.g, i, new thk((byte) 11));
        z77Var.getClass();
        z77Var.b(dw7Var, ijm.b);
    }

    public final void q(r6l r6lVar) {
        r2f r2fVar = (r2f) this.l;
        if (r2fVar != null) {
            r2fVar.b(hjm.b, 3);
        }
        r2f r2fVar2 = new r2f(r6lVar);
        this.l = r2fVar2;
        ysj ysjVar = (ysj) this.i;
        ysjVar.getClass();
        ysjVar.b(r2fVar2, ijm.b);
    }

    public final void r(u3l u3lVar, int i, View view) {
        new ge(new bl3(this, u3lVar, i, (byte) 3)).o(view);
    }

    @Override // defpackage.x9l
    public final void w(LinkedHashSet linkedHashSet) {
        ((qdb) this.a).b(vr0.B);
        p8f p8fVar = new p8f((nr8) this.f, linkedHashSet);
        if (((ehc) p8fVar.c).isEmpty()) {
            return;
        }
        q(p8fVar);
    }

    @Override // defpackage.w9l
    public final void y() {
        ((w9l) this.k).y();
    }
}

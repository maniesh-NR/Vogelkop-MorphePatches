package defpackage;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.URLUtil;
import com.opera.android.settings.SettingsManager;
import com.opera.android.settings.UserSettingsContentProvider;
import com.opera.api.Callback;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public class agm implements jw1, ovm, rba, bpo, cpp, jrp {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;
    public Object d;

    public agm(UserSettingsContentProvider userSettingsContentProvider, ContentValues contentValues, Uri uri) {
        this.a = (byte) 3;
        this.b = contentValues;
        this.c = uri;
        this.d = userSettingsContentProvider;
    }

    public agm(dx3 dx3Var) {
        this.a = (byte) 7;
        this.b = dx3Var;
        this.c = new yyn(this, dx3Var.getResources().getConfiguration().fontScale);
        this.d = new it5(this, (byte) 5);
    }

    public agm(File file) {
        this.a = (byte) 5;
        this.c = new nb9((byte) 1);
        this.d = new nb9((byte) 2);
        this.b = file;
    }

    public /* synthetic */ agm(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public agm(Function0 function0) {
        this.a = (byte) 4;
        this.b = function0;
    }

    public static Intent o(String str) {
        Intent q0iVar;
        try {
            p0i p0iVar = t0i.b;
            q0iVar = Intent.parseUri(str, 1);
            q0iVar.addCategory("android.intent.category.BROWSABLE");
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        if (q0iVar instanceof q0i) {
            q0iVar = null;
        }
        return q0iVar;
    }

    @Override // defpackage.bpo
    public final void a() {
    }

    @Override // defpackage.bpo
    public final void a(String str) {
        guo guoVar = (guo) this.b;
        uuj uujVar = guoVar.c;
        if (uujVar != null) {
            uujVar.onAdClicked();
        }
        agm agmVar = new agm(guoVar.a, sm.d, null, (byte) 9);
        ylp ylpVar = (ylp) this.c;
        agmVar.e(new h1p(ylpVar.o, ylpVar.p, str, (String) null), guoVar.i);
    }

    @Override // defpackage.bpo
    public final void a(boolean z) {
        ((of3) this.d).invoke(Boolean.valueOf(z));
    }

    @Override // defpackage.bpo
    public final void b() {
    }

    @Override // defpackage.bpo
    public final void c() {
    }

    @Override // defpackage.rba
    public final void d() {
        kdo kdoVar = (kdo) this.b;
        nv6 nv6VarB = kdoVar.a.b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("default_zoom.page_menu_hint.shown", true);
        nv6VarB.w();
        kdoVar.X();
        f6l f6lVar = kdoVar.k;
        if (f6lVar == null) {
            return;
        }
        kdoVar.c.H(f6lVar);
        kdoVar.k = null;
    }

    public final void e(h1p h1pVar, p7p p7pVar) {
        xmo xmoVarL;
        Intent intentO;
        String str = h1pVar.a;
        if (str == null || (intentO = o(str)) == null) {
            xmoVarL = null;
        } else {
            String stringExtra = intentO.getStringExtra("browser_fallback_url");
            intentO.removeExtra("browser_fallback_url");
            xmoVarL = j(intentO, k0l.G) ? new xmo("app", str) : null;
            if (xmoVarL == null && (xmoVarL = m(str)) == null) {
                xmoVarL = m(stringExtra);
            }
        }
        if (xmoVarL == null && (xmoVarL = l(h1pVar.b)) == null && (xmoVarL = l(h1pVar.c)) == null) {
            xmo xmoVarL2 = ((sm) this.c) == sm.c ? l(h1pVar.d) : null;
            if (xmoVarL2 == null) {
                return;
            } else {
                xmoVarL = xmoVarL2;
            }
        }
        if (p7pVar != null) {
            String str2 = xmoVarL.a;
            String str3 = xmoVarL.b;
            String str4 = (String) this.d;
            voo vooVar = p7pVar.a;
            p7p.e(new i1p(vooVar.c, vooVar.b.a, vooVar.j, vooVar.l, str2, str3, str4), vooVar.b(), p7pVar.b);
        }
    }

    @Override // defpackage.ovm
    public final int f(String str) {
        synchronized (((UserSettingsContentProvider) this.d).b) {
            String strB = UserSettingsContentProvider.b(str);
            String asString = ((ContentValues) this.b).getAsString(str);
            SharedPreferences sharedPreferences = (SharedPreferences) ((UserSettingsContentProvider) this.d).a.get();
            String string = sharedPreferences.contains(str) ? sharedPreferences.getString(str, null) : sharedPreferences.contains(strB) ? sharedPreferences.getString(strB, null) : ((ContentValues) this.b).getAsString("__uscp_predefined_default");
            sharedPreferences.edit().putString(str, asString).apply();
            if (TextUtils.equals(asString, string)) {
                return 0;
            }
            ((UserSettingsContentProvider) this.d).i((Uri) this.c);
            return 1;
        }
    }

    public final void g(ylp ylpVar, n1p n1pVar) {
        yjo yjoVarE = ylpVar.e();
        File file = yjoVarE.c;
        if (!file.exists()) {
            file.mkdirs();
        }
        wjh wjhVar = (wjh) this.c;
        zyk zykVar = (zyk) wjhVar.e;
        gep gepVar = new gep(yjoVarE, n1pVar, this, ylpVar, (byte) 0);
        if (((yjo) zykVar.getValue()).a().exists()) {
            p0i p0iVar = t0i.b;
            gepVar.invoke(new t0i((yjo) zykVar.getValue()));
        } else {
            sa7 sa7Var = l1p.a;
            l1p.a("https://img-odx.op-mobile.opera.com/a/js/mraid.js", ((yjo) zykVar.getValue()).a(), new l5b((byte) 14, false), null, new gqo(gepVar, wjhVar, (byte) 0));
        }
    }

    @Override // defpackage.ovm
    public final int h(String str) {
        synchronized (((UserSettingsContentProvider) this.d).b) {
            String strB = UserSettingsContentProvider.b(str);
            long jLongValue = ((ContentValues) this.b).getAsLong(str).longValue();
            SharedPreferences sharedPreferences = (SharedPreferences) ((UserSettingsContentProvider) this.d).a.get();
            long j = sharedPreferences.contains(str) ? sharedPreferences.getLong(str, 0L) : sharedPreferences.contains(strB) ? sharedPreferences.getLong(strB, 0L) : ((ContentValues) this.b).getAsLong("__uscp_predefined_default").longValue();
            sharedPreferences.edit().putLong(str, jLongValue).apply();
            if (j == jLongValue) {
                return 0;
            }
            ((UserSettingsContentProvider) this.d).i((Uri) this.c);
            return 1;
        }
    }

    @Override // defpackage.ovm
    public final int i(String str) {
        synchronized (((UserSettingsContentProvider) this.d).b) {
            if ("previous_version_code".equals(str)) {
                return 0;
            }
            if ("version_code".equals(str)) {
                ((UserSettingsContentProvider) this.d).h();
            }
            String strB = UserSettingsContentProvider.b(str);
            int iIntValue = ((ContentValues) this.b).getAsInteger(str).intValue();
            SharedPreferences sharedPreferences = (SharedPreferences) ((UserSettingsContentProvider) this.d).a.get();
            int i = sharedPreferences.contains(str) ? sharedPreferences.getInt(str, 0) : sharedPreferences.contains(strB) ? sharedPreferences.getInt(strB, 0) : ((ContentValues) this.b).getAsInteger("__uscp_predefined_default").intValue();
            sharedPreferences.edit().putInt(str, iIntValue).apply();
            if (i == iIntValue) {
                return 0;
            }
            ((UserSettingsContentProvider) this.d).i((Uri) this.c);
            return 1;
        }
    }

    public final boolean j(Intent intent, Function1 function1) {
        Unit q0iVar;
        Context context = (Context) this.b;
        Uri data = intent.getData();
        String scheme = data != null ? data.getScheme() : null;
        if (scheme != null && scheme.length() != 0 && ((Boolean) function1.invoke(intent)).booleanValue() && !n5p.a(context.getPackageManager(), intent, 131072).isEmpty()) {
            try {
                p0i p0iVar = t0i.b;
                intent.addFlags(268435456);
                context.startActivity(intent);
                q0iVar = Unit.a;
            } catch (Throwable th) {
                p0i p0iVar2 = t0i.b;
                q0iVar = new q0i(th);
            }
            if (!(q0iVar instanceof q0i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jw1
    public final void k(wj5 wj5Var, Callback callback) {
        z77 z77Var = (z77) this.b;
        yj5 yj5Var = new yj5(wj5Var, (x5f) this.d, new wtm(this, wj5Var, (su) callback));
        z77Var.getClass();
        z77Var.b(yj5Var, ijm.b);
    }

    public final xmo l(String str) {
        Intent intentO;
        xmo xmoVar = (str == null || (intentO = o(str)) == null || !j(intentO, k0l.H)) ? null : new xmo("app", str);
        if (xmoVar != null || (xmoVar = m(str)) != null) {
            return xmoVar;
        }
        if (str != null && str.length() != 0) {
            Set set = blp.a;
            if (blp.c((Context) this.b, Uri.parse(str))) {
                return new xmo("browser", str);
            }
        }
        return null;
    }

    public final xmo m(String str) {
        Object next;
        ComponentName componentNameA;
        if (str != null && str.length() != 0) {
            Set set = blp.a;
            Context context = (Context) this.b;
            Uri uri = Uri.parse(str);
            if (URLUtil.isNetworkUrl(uri.toString())) {
                PackageManager packageManager = context.getPackageManager();
                Intent intentAddCategory = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.DEFAULT").addCategory("android.intent.category.BROWSABLE");
                List<ResolveInfo> listK0 = CollectionsKt.k0(n5p.a(packageManager, intentAddCategory, 131136));
                ArrayList arrayList = new ArrayList();
                for (ResolveInfo resolveInfo : listK0) {
                    IntentFilter intentFilter = resolveInfo.filter;
                    int i = resolveInfo.match;
                    if (i != -2 && (i & 268369920) >= 3145728) {
                        if (intentFilter != null) {
                            if (intentFilter.matchAction("android.intent.action.VIEW") && intentFilter.hasCategory("android.intent.category.DEFAULT") && intentFilter.hasCategory("android.intent.category.BROWSABLE") && intentFilter.hasDataScheme(uri.getScheme())) {
                                Iterator it = v1j.b(intentFilter.schemesIterator()).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        String str2 = (String) it.next();
                                        if (!Intrinsics.a(str2, "http") && !Intrinsics.a(str2, "https")) {
                                            break;
                                        }
                                    } else if (intentFilter.countDataAuthorities() > 0) {
                                        Iterator it2 = v1j.b(intentFilter.authoritiesIterator()).iterator();
                                        while (it2.hasNext()) {
                                            int iMatch = ((IntentFilter.AuthorityEntry) it2.next()).match(uri);
                                            if (iMatch == -2 || (iMatch & 268369920) < 3145728) {
                                            }
                                        }
                                    }
                                }
                            }
                            componentNameA = null;
                        }
                        componentNameA = blp.a(resolveInfo);
                        break;
                    }
                    componentNameA = null;
                    if (componentNameA != null) {
                        arrayList.add(componentNameA);
                    }
                }
                Set setN0 = CollectionsKt.n0(arrayList);
                if (!setN0.isEmpty()) {
                    ResolveInfo resolveInfoD = n5p.d(packageManager, intentAddCategory);
                    ComponentName componentNameA2 = resolveInfoD != null ? blp.a(resolveInfoD) : null;
                    try {
                        if (componentNameA2 != null) {
                            if (setN0.contains(componentNameA2)) {
                                intentAddCategory.setComponent(componentNameA2);
                            }
                            intentAddCategory.addFlags(268435456);
                            context.startActivity(intentAddCategory);
                            return new xmo("app", str);
                        }
                        componentNameA2 = null;
                        context.startActivity(intentAddCategory);
                        return new xmo("app", str);
                    } catch (RuntimeException unused) {
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        intentAddCategory.addFlags(1024);
                    } else if (componentNameA2 != null) {
                        Iterator it3 = listK0.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            if (Intrinsics.a(blp.a((ResolveInfo) next), componentNameA2)) {
                                break;
                            }
                        }
                        ResolveInfo resolveInfo2 = (ResolveInfo) next;
                        if (resolveInfo2 != null) {
                            try {
                                Field declaredField = ResolveInfo.class.getDeclaredField("handleAllWebDataURI");
                                declaredField.setAccessible(true);
                                if (!declaredField.getBoolean(resolveInfo2)) {
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                    intentAddCategory.addFlags(268435456);
                }
            }
        }
        return null;
    }

    public final String n(String str) {
        List listY;
        String string = ((ru9) this.c).a.getString("wallpaper.rotation.list", null);
        int i = 0;
        if (string == null || (listY = StringsKt.Y(string, new String[]{","}, 0, 6)) == null) {
            listY = l08.a;
        }
        if (listY.isEmpty()) {
            return str;
        }
        Iterator it = listY.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.a((String) it.next(), str)) {
                break;
            }
            i++;
        }
        return (String) listY.get((i + 1) % listY.size());
    }

    public final boolean p() {
        SettingsManager settingsManager = (SettingsManager) this.b;
        return settingsManager.a.contains("wallpaper_rotation_enabled") && settingsManager.i("wallpaper_rotation_enabled");
    }

    public final ab2 q() {
        ab2 ab2Var = (ab2) this.d;
        if (ab2Var != null) {
            return ab2Var;
        }
        ab2 ab2Var2 = (ab2) this.c;
        if (ab2Var2 != null) {
            return ab2Var2;
        }
        ab2 ab2Var3 = (ab2) ((Function0) this.b).invoke();
        this.c = ab2Var3;
        return ab2Var3;
    }

    public final ab2 r() {
        ab2 ab2Var = (ab2) this.c;
        if (ab2Var != null) {
            this.c = null;
            this.d = ab2Var;
            return ab2Var;
        }
        ab2 ab2Var2 = (ab2) ((Function0) this.b).invoke();
        this.d = ab2Var2;
        return ab2Var2;
    }

    @Override // defpackage.rba
    public final void s() {
        ((rn9) this.c).J(kf0.b);
        ((kdo) this.b).f.i = 2131363836;
        ((View) this.d).callOnClick();
    }

    @Override // defpackage.rba
    public final void t() {
        ((rn9) this.c).J(kf0.e);
    }

    public final void u(String str, Function0 function0) {
        SettingsManager settingsManager = (SettingsManager) this.b;
        settingsManager.Y("wallpaper_rotation_category", str);
        List list = (List) function0.invoke();
        onn onnVar = (onn) this.d;
        String strZ = settingsManager.z("wallpaper_rotation_category");
        List list2 = list;
        ArrayList arrayList = new ArrayList(k95.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((aln) it.next()).getId());
        }
        x5f x5fVar = onnVar.d;
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = (String) obj;
            if (str2.startsWith("FILE_storefront_wallpaper_")) {
                str2 = "store-wallpaper";
            } else if (str2.startsWith("FILE_user_wallpaper_")) {
                str2 = "user-wallpaper";
            }
            arrayList2.add(str2);
        }
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            nu0 nu0Var = new nu0(2443, 1, 3);
            nu0Var.q(1, strZ != null ? 1 : 0, strZ);
            nu0Var.q(2, 1, arrayList2);
            b66 b66VarF = x56VarF.F(zpaVar);
            b66VarF.getClass();
            b66VarF.q(70, 1, nu0Var);
            x5fVar.U0(x56VarF);
        }
        nv6 nv6VarB = ((ru9) this.c).b();
        ((SharedPreferences.Editor) nv6VarB.a).putString("wallpaper.rotation.list", CollectionsKt.P(list2, ",", (CharSequence) null, (String) null, 0, new q0n((byte) 7), 30));
        nv6VarB.w();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e22 */
    public final Object v() throws e22 {
        Object obj = this.b;
        Field field = (Field) this.c;
        Class cls = (Class) this.d;
        try {
            return cls.cast(field.get(obj));
        } catch (Exception e) {
            String name = field.getName();
            String name2 = obj.getClass().getName();
            String name3 = cls.getName();
            StringBuilder sbN = z1m.n("Failed to get value of field ", name, " of type ", name2, " on object of type ");
            sbN.append(name3);
            throw new e22(sbN.toString(), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e22 */
    public final void w(Object obj) throws IllegalAccessException, e22, IllegalArgumentException {
        Object obj2 = this.b;
        Field field = (Field) this.c;
        try {
            field.set(obj2, obj);
        } catch (Exception e) {
            String name = field.getName();
            String name2 = obj2.getClass().getName();
            String name3 = ((Class) this.d).getName();
            StringBuilder sbN = z1m.n("Failed to set value of field ", name, " of type ", name2, " on object of type ");
            sbN.append(name3);
            throw new e22(sbN.toString(), e);
        }
    }

    @Override // defpackage.rba
    public final void z() {
        ((rn9) this.c).J(kf0.d);
    }

    @Override // defpackage.cpp, defpackage.jrp
    /* renamed from: zza */
    public final Object mo1zza() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 13:
                return new rsp((jup) ((cpp) obj).mo1zza(), (erp) ((cpp) this.c).mo1zza(), ((n0c) ((uto) this.d).b).a);
            default:
                return new ktp(arp.a((jrp) obj), arp.a((jrp) this.c), arp.a((jrp) this.d));
        }
    }
}

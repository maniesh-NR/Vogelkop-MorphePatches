package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class pup {
    public static final g40 c = new g40("SplitInstallInfoProvider");
    public final Context a;
    public final String b;

    public pup(Context context) {
        this.a = context;
        this.b = context.getPackageName();
    }

    public static boolean d(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final HashSet e(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        Iterator it = f(packageInfo).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!d(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static final HashSet f(PackageInfo packageInfo) {
        HashSet hashSet;
        g40 g40Var = c;
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet2 = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                g40Var.a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet2, string.split(",", -1));
                hashSet2.remove("");
                hashSet2.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            g40Var.a("Adding splits from package manager: %s", new Object[]{Arrays.toString(strArr)});
            Collections.addAll(hashSet2, strArr);
        } else {
            g40Var.a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        fup fupVar = (fup) mup.a.get();
        if (fupVar == null) {
            return hashSet2;
        }
        n0k n0kVar = fupVar.a;
        synchronized (n0kVar.c) {
            hashSet = new HashSet(n0kVar.c);
        }
        hashSet2.addAll(hashSet);
        return hashSet2;
    }

    public final ppp a(Bundle bundle) throws Resources.NotFoundException {
        ppp pppVarC = null;
        g40 g40Var = c;
        if (bundle == null) {
            g40Var.e("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = bundle.getInt("com.android.vending.splits");
        if (i == 0) {
            g40Var.e("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            XmlResourceParser xml = this.a.getResources().getXml(i);
            rc6 rc6Var = new rc6((byte) 3);
            while (xml.next() != 1) {
                try {
                    if (xml.getEventType() == 2) {
                        if (xml.getName().equals("splits")) {
                            while (xml.next() != 3) {
                                if (xml.getEventType() == 2) {
                                    if (xml.getName().equals("module")) {
                                        String strS = t0h.s(Constants.Params.NAME, xml);
                                        if (strS != null) {
                                            while (xml.next() != 3) {
                                                if (xml.getEventType() == 2) {
                                                    if (xml.getName().equals("language")) {
                                                        while (xml.next() != 3) {
                                                            if (xml.getEventType() == 2) {
                                                                if (xml.getName().equals("entry")) {
                                                                    String strS2 = t0h.s("key", xml);
                                                                    String strS3 = t0h.s("split", xml);
                                                                    t0h.t(xml);
                                                                    if (strS2 != null && strS3 != null) {
                                                                        rc6Var.b(strS, strS2, strS3);
                                                                    }
                                                                } else {
                                                                    t0h.t(xml);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        t0h.t(xml);
                                                    }
                                                }
                                            }
                                        } else {
                                            t0h.t(xml);
                                        }
                                    } else {
                                        t0h.t(xml);
                                    }
                                }
                            }
                        } else {
                            t0h.t(xml);
                        }
                    }
                } catch (IOException | IllegalStateException | XmlPullParserException unused) {
                }
            }
            pppVarC = rc6Var.c();
            if (pppVarC == null) {
                g40Var.e("Can't parse languages metadata.", new Object[0]);
            }
            return pppVarC;
        } catch (Resources.NotFoundException unused2) {
            g40Var.e("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    public final HashSet b() throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        try {
            packageInfo = this.a.getPackageManager().getPackageInfo(this.b, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL);
        } catch (PackageManager.NameNotFoundException unused) {
            c.b("App is not found in PackageManager", new Object[0]);
            packageInfo = null;
        }
        return (packageInfo == null || packageInfo.applicationInfo == null) ? new HashSet() : e(packageInfo);
    }

    public final HashSet c() throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        ppp pppVarA;
        HashSet hashSet = null;
        try {
            packageInfo = this.a.getPackageManager().getPackageInfo(this.b, ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL);
        } catch (PackageManager.NameNotFoundException unused) {
            c.b("App is not found in PackageManager", new Object[0]);
            packageInfo = null;
        }
        if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null && (pppVarA = a(applicationInfo.metaData)) != null) {
            hashSet = new HashSet();
            HashSet hashSetF = f(packageInfo);
            hashSetF.add("");
            HashSet hashSetE = e(packageInfo);
            hashSetE.add("");
            for (Map.Entry entry : pppVarA.a(hashSetE).entrySet()) {
                if (hashSetF.containsAll((Collection) entry.getValue())) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }
}

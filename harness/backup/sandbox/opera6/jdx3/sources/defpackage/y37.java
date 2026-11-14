package defpackage;

import android.content.Context;
import android.os.Build;
import com.leanplum.core.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class y37 extends n1 {
    public static final Set d = e82.E(new String[]{"magisk", "su"});
    public static final Set e = e82.E(new String[]{"/cache", "/data", "/data/local", "/data/local/bin", "/data/local/xbin", "/dev", "/sbin", "/su/bin", "/system/bin", "/system/bin/.ext", "/system/bin/failsafe", "/system/sd/xbin", "/system/usr/we-need-root", "/system/xbin"});
    public static final Set f = e82.E(new String[]{"/etc", "/sbin", "/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin"});
    public static final Set g = e82.E(new String[]{"com.alephzain.framaroot", "com.kingo.root", "com.kingroot.kinguser", "com.koushikdutta.superuser", "com.noshufou.android.su", "com.noshufou.android.su.elite", "com.smedialink.oneclickroot", "com.thirdparty.superuser", "com.topjohnwu.magisk", "com.yellowes.su", "com.zhiqupk.root.global", "eu.chainfire.supersu"});
    public static final Regex h = new Regex("\\[([^]]+)]: \\[([^]]*)]");
    public final Context c;

    public y37(Context context, umi umiVar) {
        super(umiVar, (byte) 27);
        this.c = context;
    }

    @Override // defpackage.n1
    public final z37 b0() {
        Set set;
        Iterator it = g.iterator();
        while (true) {
            if (it.hasNext()) {
                if (r9n.D(this.c, (String) it.next())) {
                    break;
                }
            } else if (!sgb.R("getprop", new w37(rbd.c(new Pair[]{new Pair("ro.debuggable", "1"), new Pair("ro.secure", BuildConfig.BUILD_NUMBER)}), (byte) 0))) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Set set2 = e;
                Iterator it2 = set2.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    set = d;
                    if (!zHasNext) {
                        break;
                    }
                    String str = (String) it2.next();
                    Iterator it3 = set.iterator();
                    while (it3.hasNext()) {
                        linkedHashSet.add(str + "/" + ((String) it3.next()));
                    }
                }
                String str2 = System.getenv("PATH");
                if (str2 != null) {
                    ArrayList arrayListR = aik.r(false, str2, ':');
                    int size = arrayListR.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListR.get(i);
                        i++;
                        String str3 = (String) obj;
                        if (!set2.contains(str3)) {
                            if (StringsKt.I(str3, '/')) {
                                Iterator it4 = set.iterator();
                                while (it4.hasNext()) {
                                    linkedHashSet.add(str3 + ((String) it4.next()));
                                }
                            } else {
                                Iterator it5 = set.iterator();
                                while (it5.hasNext()) {
                                    linkedHashSet.add(str3 + "/" + ((String) it5.next()));
                                }
                            }
                        }
                    }
                }
                Iterator it6 = linkedHashSet.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        sgb.R("mount", new x37(linkedHashMap, (byte) 0));
                        for (String strSubstring : f) {
                            while (true) {
                                Boolean bool = (Boolean) linkedHashMap.get(strSubstring);
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                    }
                                } else if (!Intrinsics.a(strSubstring, "/")) {
                                    int iP = StringsKt.P(strSubstring, '/', 0, 6);
                                    strSubstring = iP > 0 ? strSubstring.substring(0, iP) : "/";
                                }
                            }
                        }
                        return z37.a;
                    }
                    if (new File((String) it6.next()).exists()) {
                        break;
                    }
                }
            }
        }
        return z37.b;
    }

    @Override // defpackage.n1
    public final void y(Function1 function1) {
        String str = Build.TAGS;
        if (str == null) {
            str = "";
        }
        int i = 0;
        ArrayList arrayListR = aik.r(false, str, ',');
        int size = arrayListR.size();
        while (i < size) {
            Object obj = arrayListR.get(i);
            i++;
            if (Intrinsics.a((String) obj, "test-keys")) {
                function1.invoke(z37.b);
                return;
            }
        }
        super.y(function1);
    }
}

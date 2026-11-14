package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class n0k {
    public static final AtomicReference e = new AtomicReference(null);
    public final qq8 a;
    public final mqp b;
    public final HashSet c = new HashSet();
    public final dcl d;

    /* JADX INFO: Thrown type has an unknown type hierarchy: e22 */
    public n0k(Context context) throws e22 {
        try {
            qq8 qq8Var = new qq8(context);
            this.a = qq8Var;
            this.d = new dcl(qq8Var);
            this.b = new mqp(context);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new e22("Failed to initialize FileStorage", e2);
        }
    }

    public static void a(Context context) {
        HashSet hashSet;
        StrictMode.ThreadPolicy threadPolicy;
        n0k n0kVar = (n0k) e.get();
        if (n0kVar == null) {
            if (context.getApplicationContext() != null) {
                d(context.getApplicationContext(), false);
            }
            d(context, false);
            return;
        }
        dcl dclVar = n0kVar.d;
        synchronized (n0kVar.c) {
            hashSet = new HashSet(n0kVar.c);
        }
        synchronized (dclVar) {
            try {
                threadPolicy = StrictMode.getThreadPolicy();
                try {
                    StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                threadPolicy = null;
            }
            try {
                HashSet hashSet2 = new HashSet();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    File file = new File(((qq8) dclVar.a).x(), "verified-splits");
                    qq8.v(file);
                    hashSet2.add(qq8.u(file, String.valueOf(str).concat(".apk")));
                }
                dclVar.j(context, hashSet2);
            } catch (Exception unused3) {
                if (threadPolicy != null) {
                }
            } catch (Throwable th) {
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th;
            }
            if (threadPolicy != null) {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
    }

    public static boolean d(Context context, boolean z) {
        AtomicReference atomicReference;
        boolean z2;
        n0k n0kVar = new n0k(context);
        while (true) {
            atomicReference = e;
            if (!atomicReference.compareAndSet(null, n0kVar)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        n0k n0kVar2 = (n0k) atomicReference.get();
        if (z2) {
            AtomicReference atomicReference2 = ytp.a;
            ytp.a.set(new ipp(context, ocp.r(), new wjj(context, n0kVar2.a), n0kVar2.a));
            fup fupVar = new fup(n0kVar2);
            AtomicReference atomicReference3 = mup.a;
            while (!atomicReference3.compareAndSet(null, fupVar) && (atomicReference3.get() == null || atomicReference3.get() == null)) {
            }
            ocp.r().execute(new c9d(context, (byte) 3));
        }
        try {
            n0kVar2.c(context, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void b(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            qq8 qq8Var = this.a;
            qq8Var.getClass();
            File file = new File(qq8Var.x(), "verified-splits");
            qq8.v(file);
            qq8.s(qq8.u(file, String.valueOf(str).concat(".apk")));
        }
        mqp mqpVar = this.b;
        mqpVar.getClass();
        synchronized (mqp.class) {
            mqpVar.a.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x033f A[Catch: all -> 0x0413, TRY_LEAVE, TryCatch #4 {, blocks: (B:5:0x0007, B:7:0x001a, B:8:0x001e, B:10:0x002b, B:12:0x0035, B:13:0x004a, B:15:0x0051, B:17:0x005f, B:21:0x0074, B:20:0x006c, B:23:0x007a, B:25:0x0083, B:29:0x0099, B:30:0x00a2, B:32:0x00a8, B:34:0x00b6, B:35:0x00ba, B:36:0x00be, B:38:0x00c4, B:40:0x00d0, B:41:0x00d4, B:42:0x00e1, B:44:0x00e7, B:46:0x00f9, B:50:0x010e, B:49:0x0106, B:52:0x0114, B:53:0x0118, B:55:0x0128, B:57:0x0132, B:58:0x013b, B:60:0x0141, B:61:0x014f, B:62:0x0157, B:63:0x015f, B:64:0x016e, B:67:0x0184, B:69:0x019e, B:71:0x01ab, B:72:0x01b1, B:74:0x01c7, B:75:0x01c8, B:80:0x01da, B:84:0x01de, B:88:0x01e2, B:89:0x0215, B:133:0x0330, B:134:0x0339, B:136:0x033f, B:137:0x0345, B:138:0x034c, B:140:0x0357, B:142:0x038b, B:143:0x0397, B:151:0x03a5, B:155:0x03bf, B:154:0x03aa, B:156:0x03c0, B:157:0x03d0, B:159:0x03d6, B:161:0x03e4, B:162:0x03ea, B:163:0x03ec, B:169:0x03f6, B:90:0x0216, B:91:0x021a, B:93:0x0220, B:97:0x0242, B:98:0x0246, B:100:0x024c, B:101:0x0255, B:103:0x025b, B:104:0x0269, B:105:0x0271, B:106:0x0279, B:107:0x0288, B:110:0x029e, B:112:0x02b8, B:114:0x02c5, B:115:0x02cb, B:117:0x02e1, B:118:0x02e2, B:123:0x02f4, B:127:0x02f8, B:131:0x02fc, B:132:0x032f, B:26:0x0087, B:28:0x008d, B:11:0x0031, B:173:0x03fa, B:174:0x0410, B:6:0x000d, B:119:0x02e3, B:120:0x02f0, B:164:0x03ed, B:165:0x03f2, B:108:0x0289, B:109:0x029d, B:76:0x01c9, B:77:0x01d6, B:65:0x016f, B:66:0x0183), top: B:189:0x0005, inners: #2, #5, #6, #7, #9, #10, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03d6 A[Catch: all -> 0x0413, TryCatch #4 {, blocks: (B:5:0x0007, B:7:0x001a, B:8:0x001e, B:10:0x002b, B:12:0x0035, B:13:0x004a, B:15:0x0051, B:17:0x005f, B:21:0x0074, B:20:0x006c, B:23:0x007a, B:25:0x0083, B:29:0x0099, B:30:0x00a2, B:32:0x00a8, B:34:0x00b6, B:35:0x00ba, B:36:0x00be, B:38:0x00c4, B:40:0x00d0, B:41:0x00d4, B:42:0x00e1, B:44:0x00e7, B:46:0x00f9, B:50:0x010e, B:49:0x0106, B:52:0x0114, B:53:0x0118, B:55:0x0128, B:57:0x0132, B:58:0x013b, B:60:0x0141, B:61:0x014f, B:62:0x0157, B:63:0x015f, B:64:0x016e, B:67:0x0184, B:69:0x019e, B:71:0x01ab, B:72:0x01b1, B:74:0x01c7, B:75:0x01c8, B:80:0x01da, B:84:0x01de, B:88:0x01e2, B:89:0x0215, B:133:0x0330, B:134:0x0339, B:136:0x033f, B:137:0x0345, B:138:0x034c, B:140:0x0357, B:142:0x038b, B:143:0x0397, B:151:0x03a5, B:155:0x03bf, B:154:0x03aa, B:156:0x03c0, B:157:0x03d0, B:159:0x03d6, B:161:0x03e4, B:162:0x03ea, B:163:0x03ec, B:169:0x03f6, B:90:0x0216, B:91:0x021a, B:93:0x0220, B:97:0x0242, B:98:0x0246, B:100:0x024c, B:101:0x0255, B:103:0x025b, B:104:0x0269, B:105:0x0271, B:106:0x0279, B:107:0x0288, B:110:0x029e, B:112:0x02b8, B:114:0x02c5, B:115:0x02cb, B:117:0x02e1, B:118:0x02e2, B:123:0x02f4, B:127:0x02f8, B:131:0x02fc, B:132:0x032f, B:26:0x0087, B:28:0x008d, B:11:0x0031, B:173:0x03fa, B:174:0x0410, B:6:0x000d, B:119:0x02e3, B:120:0x02f0, B:164:0x03ed, B:165:0x03f2, B:108:0x0289, B:109:0x029d, B:76:0x01c9, B:77:0x01d6, B:65:0x016f, B:66:0x0183), top: B:189:0x0005, inners: #2, #5, #6, #7, #9, #10, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(android.content.Context r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n0k.c(android.content.Context, boolean):void");
    }
}

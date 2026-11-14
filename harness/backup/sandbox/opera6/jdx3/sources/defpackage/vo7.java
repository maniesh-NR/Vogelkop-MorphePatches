package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class vo7 implements as6, q9g {
    public static final long j;
    public final esk a;
    public final esk b;
    public final Function1 c;
    public final yqa d;
    public final esk e;
    public final c37 f;
    public final x77 g;
    public uo7 h;
    public Long i;

    static {
        on7 on7Var = pn7.b;
        j = pn7.f(cs5.x0(60, un7.e));
    }

    public vo7(esk eskVar, esk eskVar2, Function1 function1, yqa yqaVar, esk eskVar3, qq6 qq6Var, esk eskVar4) {
        this.a = eskVar;
        this.b = eskVar2;
        this.c = function1;
        this.d = yqaVar;
        this.e = eskVar3;
        c37 c37Var = new c37();
        c37Var.a = eskVar3;
        c37Var.b = new LinkedHashMap();
        this.f = c37Var;
        this.g = new x77((Object) this, (Object) qq6Var, (Object) eskVar4, (byte) 3);
    }

    public static boolean c(qo7 qo7Var, GURL gurl) {
        if (qo7Var.c.a(gurl.c()) != -1) {
            return true;
        }
        String str = (String) qo7Var.d.get(gurl.c());
        return str != null && c.q(gurl.e(), str, false) && (gurl.e().length() == str.length() || gurl.e().charAt(str.length()) == '/');
    }

    @Override // defpackage.q9g
    public final void A() {
        ((LinkedHashMap) this.f.b).clear();
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        aib.B((s9g) this.e.get(), ndcVar, this, new vme((byte) 19));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final defpackage.uo7 a(org.chromium.url.GURL r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo7.a(org.chromium.url.GURL, boolean):uo7");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.to7 b(org.chromium.url.GURL r6) {
        /*
            r5 = this;
            boolean r0 = r6.b
            r1 = 0
            if (r0 == 0) goto L76
            java.lang.String r0 = r6.f()
            java.lang.String r2 = "http"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1d
            java.lang.String r0 = r6.f()
            java.lang.String r2 = "https"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L76
        L1d:
            java.lang.String r0 = r6.c()
            int r0 = r0.length()
            if (r0 == 0) goto L76
            esk r0 = r5.a
            java.lang.Object r0 = r0.get()
            ro7 r0 = (defpackage.ro7) r0
            java.util.Set r0 = r0.a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L37:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r0.next()
            r3 = r2
            qo7 r3 = (defpackage.qo7) r3
            boolean r3 = c(r3, r6)
            if (r3 == 0) goto L37
            goto L4c
        L4b:
            r2 = r1
        L4c:
            qo7 r2 = (defpackage.qo7) r2
            if (r2 == 0) goto L76
            to7 r6 = new to7
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto L71
            esk r5 = r5.b
            java.lang.Object r5 = r5.get()
            android.content.pm.PackageManager r5 = (android.content.pm.PackageManager) r5
            r0 = 0
            qab r1 = defpackage.rab.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6e
            java.lang.String r1 = r2.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6e
            p4j r3 = r2.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6e
            qab r4 = defpackage.qab.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6e
            boolean r5 = defpackage.rab.d(r5, r1, r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6e
            goto L6f
        L6e:
            r5 = r0
        L6f:
            if (r5 == 0) goto L72
        L71:
            r0 = 1
        L72:
            r6.<init>(r2, r0)
            return r6
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo7.b(org.chromium.url.GURL):to7");
    }

    @Override // defpackage.q9g
    public final void d(List list) {
        to7 to7VarB;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            loj lojVar = (loj) it.next();
            lag lagVar = lojVar.b;
            lag lagVar2 = lag.g;
            boolean zEquals = lagVar != null ? lagVar.equals(lagVar2) : true;
            String str = lojVar.a;
            if (zEquals && (to7VarB = b(new GURL(str))) != null) {
                String str2 = to7VarB.a.a;
                c37 c37Var = this.f;
                LinkedHashMap linkedHashMap = (LinkedHashMap) c37Var.b;
                wo7 wo7Var = (wo7) linkedHashMap.get(str2);
                if (wo7Var != null && ((s9g) ((esk) c37Var.a).get()).g(lagVar2, str, false) != wo7Var.a) {
                    linkedHashMap.remove(str2);
                }
            }
        }
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        String string;
        x77 x77Var = this.g;
        vo7 vo7Var = (vo7) x77Var.d;
        esk eskVar = (esk) x77Var.c;
        long j2 = ((ru9) eskVar.get()).a.getLong("dynamic_external_apps.open_in_opera_timestamp", -1L);
        String str = null;
        Long lValueOf = j2 == -1 ? null : Long.valueOf(j2);
        if (lValueOf != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - lValueOf.longValue();
            if (1 > jCurrentTimeMillis || jCurrentTimeMillis >= j || (string = ((ru9) eskVar.get()).a.getString("dynamic_external_apps.open_in_opera_url", "")) == null || string.length() == 0) {
                string = null;
            }
            if (string != null && string.length() != 0) {
                str = string;
            }
        }
        if (str != null) {
            nv6 nv6VarB = ((ru9) eskVar.get()).b();
            SharedPreferences.Editor editor = (SharedPreferences.Editor) nv6VarB.a;
            editor.remove("dynamic_external_apps.open_in_opera_timestamp");
            editor.remove("dynamic_external_apps.open_in_opera_url");
            nv6VarB.w();
            GURL gurl = new GURL(str);
            qq6 qq6Var = (qq6) x77Var.b;
            String strC = gurl.c();
            g77 g77Var = new g77(x77Var, gurl, vo7Var);
            z77 z77Var = (z77) ((esk) qq6Var.b).get();
            s12 s12Var = new s12(g77Var, strC);
            z77Var.getClass();
            z77Var.b(s12Var, ijm.b);
        }
    }
}

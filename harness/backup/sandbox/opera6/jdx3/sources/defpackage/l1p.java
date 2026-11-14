package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public abstract class l1p {
    public static final sa7 a;
    public static final Set b;

    static {
        sa7 sa7Var = new sa7();
        synchronized (sa7Var) {
            sa7Var.a = (byte) 20;
        }
        sa7.c(sa7Var, (RealCall.AsyncCall) null, (RealCall) null, (RealCall.AsyncCall) null, 7);
        sa7Var.d(10);
        a = sa7Var;
        b = Collections.synchronizedSet(new LinkedHashSet());
    }

    public static void a(String str, File file, l5b l5bVar, Set set, n1p n1pVar) {
        String authority;
        String string;
        if (!b.add(file)) {
            pfp.a(new wr9(n1pVar, file, (byte) 24));
            return;
        }
        ArrayList arrayListJ = j95.j(new String[]{str});
        if (set != null && !set.isEmpty()) {
            try {
                authority = Uri.parse(str).getAuthority();
            } catch (Exception unused) {
                authority = null;
            }
            if (authority != null && !StringsKt.N(authority)) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (!c.m(str2, authority, true)) {
                        try {
                            string = Uri.parse(str).buildUpon().authority(str2).build().toString();
                        } catch (Exception unused2) {
                            string = null;
                        }
                        if (string != null) {
                            arrayListJ.add(string);
                        }
                    }
                }
            }
        }
        String str3 = (String) arrayListJ.get(0);
        dap.c(str3, new cno(l5bVar, (byte) 8), new p9p(l5bVar, (byte) 10), new d5a(file, 0, arrayListJ, n1pVar, l5bVar, str3));
    }
}

package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class cbp {
    public static final long a = SystemClock.uptimeMillis();
    public static volatile Application b;
    public static t0i c;
    public static ArrayList d;

    static {
        Unit q0iVar;
        try {
            p0i p0iVar = t0i.b;
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        if (!fcp.b) {
            throw new IllegalStateException(("Required min SDK API level 24, but current API is " + Build.VERSION.SDK_INT + '!').toString());
        }
        q0iVar = Unit.a;
        t0i t0iVar = new t0i(q0iVar);
        if (!(q0iVar instanceof q0i)) {
            t0iVar = null;
        }
        c = t0iVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: vjo */
    public static void a(Application application, ypi ypiVar) throws vjo {
        Unit unit;
        List listA;
        String str = ypiVar.a;
        final byte b2 = 0;
        for (int i = 0; i < str.length() && !CharsKt.c(str.charAt(i)); i++) {
        }
        ucd ucdVarD = Regex.d(new Regex("^(pub\\d+)/(ep\\d+)/(app\\d+)$"), StringsKt.l0(ypiVar.a).toString());
        if (ucdVarD == null || (listA = ucdVarD.a()) == null) {
            unit = null;
        } else {
            List listG = CollectionsKt.G(listA, 1);
            String str2 = (String) listG.get(0);
            String str3 = (String) listG.get(1);
            String str4 = (String) listG.get(2);
            ynh.c = str2;
            ynh.f = str3;
            ynh.e = str4;
            ynh.d = ypiVar.b;
            unit = Unit.a;
        }
        if (unit == null) {
            throw new vjo(1, "Initialization failed due to malformed application id");
        }
        fcp.c = ypiVar.c;
        mzg.a = ypiVar.d;
        tmj tmjVar = qb7.h;
        tmjVar.f(application).a(new n1p() { // from class: fto
            @Override // defpackage.n1p
            public final void invoke(Object obj) {
                switch (b2) {
                    case 0:
                        break;
                    default:
                        Application application2 = cbp.b;
                        break;
                }
            }
        });
        tmjVar.f(application).c(new n1p() { // from class: fto
            @Override // defpackage.n1p
            public final void invoke(Object obj) {
                switch (b2) {
                    case 0:
                        break;
                    default:
                        Application application2 = cbp.b;
                        break;
                }
            }
        });
    }

    public static void b(Context context) {
        Application application;
        Application application2 = null;
        if (b == null) {
            zyk zykVar = fcp.a;
            Application application3 = context instanceof Application ? (Application) context : null;
            if (application3 == null) {
                Context applicationContext = context.getApplicationContext();
                application3 = applicationContext instanceof Application ? (Application) applicationContext : null;
            }
            if (application3 != null) {
                application2 = application3;
            } else {
                Context baseContext = context;
                while (true) {
                    if (!(baseContext instanceof ContextWrapper) || (baseContext = ((ContextWrapper) baseContext).getBaseContext()) == null) {
                        break;
                    }
                    Application application4 = baseContext instanceof Application ? (Application) baseContext : null;
                    if (application4 == null) {
                        Context applicationContext2 = baseContext.getApplicationContext();
                        application4 = applicationContext2 instanceof Application ? (Application) applicationContext2 : null;
                    }
                    if (application4 != null) {
                        application2 = application4;
                        break;
                    }
                }
            }
            b = application2;
            if (fcp.b && (application = b) != null && fko.a == null) {
                fko.b.isEmpty();
                fko.a = new bko(application, new h9o((byte) 9));
                pfp.a(new bw1((byte) 8));
            }
        } else {
            zyk zykVar2 = fcp.a;
            Application application5 = context instanceof Application ? (Application) context : null;
            if (application5 == null) {
                Context applicationContext3 = context.getApplicationContext();
                application5 = applicationContext3 instanceof Application ? (Application) applicationContext3 : null;
            }
            if (application5 == null) {
                Context baseContext2 = context;
                while ((baseContext2 instanceof ContextWrapper) && (baseContext2 = ((ContextWrapper) baseContext2).getBaseContext()) != null) {
                    Application application6 = baseContext2 instanceof Application ? (Application) baseContext2 : null;
                    if (application6 == null) {
                        Context applicationContext4 = baseContext2.getApplicationContext();
                        application6 = applicationContext4 instanceof Application ? (Application) applicationContext4 : null;
                    }
                    if (application6 != null) {
                        break;
                    }
                }
            }
        }
        if (!fcp.b || b == null) {
            return;
        }
        ejo ejoVar = fko.a;
        fko.a(context);
    }

    public static void c(Runnable runnable, Runnable runnable2) {
        t0i t0iVar = c;
        if (t0iVar == null) {
            ArrayList arrayList = d;
            if (arrayList != null) {
                arrayList.isEmpty();
                arrayList.add(new wap(runnable, runnable2));
                return;
            }
        } else if (t0i.d(t0iVar.a) == null) {
            runnable.run();
            return;
        }
        runnable2.run();
    }
}

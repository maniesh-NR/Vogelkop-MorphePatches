package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class ya1 implements ComponentCallbacks2 {
    public final /* synthetic */ byte a;
    public final Object b;

    public ya1() {
        this.a = (byte) 1;
        this.b = "Android.MemoryPressureNotification.ChildService";
    }

    public ya1(s14 s14Var) {
        this.a = (byte) 0;
        this.b = s14Var;
    }

    private final void a(Configuration configuration) {
    }

    public final void b(int i) {
        ioh.y(i, 9, (String) this.b);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 0:
                s14 s14Var = (s14) this.b;
                synchronized (s14Var) {
                    if (((ylh) ((WeakReference) s14Var.c).get()) == null) {
                        s14Var.I();
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        switch (this.a) {
            case 0:
                onTrimMemory(80);
                break;
            default:
                b(8);
                break;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        amh amhVarC;
        long jK;
        long j;
        switch (this.a) {
            case 0:
                s14 s14Var = (s14) this.b;
                synchronized (s14Var) {
                    ylh ylhVar = (ylh) ((WeakReference) s14Var.c).get();
                    if (ylhVar != null) {
                        wlh wlhVar = ylhVar.a;
                        if (i >= 40) {
                            amh amhVarC2 = ylhVar.c();
                            if (amhVarC2 != null) {
                                synchronized (amhVarC2.c) {
                                    ((tr3) amhVarC2.a.c).p(-1L);
                                    bp bpVar = amhVarC2.b;
                                    bpVar.a = 0;
                                    ((LinkedHashMap) bpVar.b).clear();
                                }
                            }
                        } else if (i >= 20) {
                            xa1 xa1Var = (xa1) s14Var.d;
                            Context context = wlhVar.a;
                            double d = xa1Var.a;
                            if (d != 1.0d) {
                                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(xa1Var);
                                s14 s14Var2 = xa1Var.b;
                                ylh ylhVar2 = (ylh) ((WeakReference) s14Var2.c).get();
                                if (ylhVar2 != null) {
                                    amh amhVarC3 = ylhVar2.c();
                                    if (amhVarC3 != null) {
                                        synchronized (amhVarC3.c) {
                                            j = amhVarC3.a.a;
                                        }
                                        amhVarC3.a((long) (d * j));
                                    }
                                } else {
                                    s14Var2.I();
                                }
                            }
                        } else if (i >= 10 && (amhVarC = ylhVar.c()) != null) {
                            synchronized (amhVarC.c) {
                                jK = ((tr3) amhVarC.a.c).k();
                            }
                            long j2 = jK / 2;
                            synchronized (amhVarC.c) {
                                ((tr3) amhVarC.a.c).p(j2);
                            }
                        }
                    } else {
                        s14Var.I();
                    }
                }
                return;
            default:
                if (i == 5) {
                    b(7);
                    return;
                }
                if (i == 10) {
                    b(6);
                    return;
                }
                if (i == 15) {
                    b(5);
                    return;
                }
                if (i == 20) {
                    b(4);
                    return;
                }
                if (i == 40) {
                    b(3);
                    return;
                }
                if (i == 60) {
                    b(2);
                    return;
                } else if (i != 80) {
                    b(0);
                    return;
                } else {
                    b(1);
                    return;
                }
        }
    }
}

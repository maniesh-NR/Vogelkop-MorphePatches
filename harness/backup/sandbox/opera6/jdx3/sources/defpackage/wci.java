package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.PowerManager;
import com.opera.android.browser.dialog.DialogDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.content.browser.webcontents.WebContentsImpl;

/* loaded from: classes.dex */
public final class wci implements rr9, DialogDelegate, cpp {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public /* synthetic */ wci() {
        this.a = (byte) 3;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public wci(Context context) {
        this.a = (byte) 9;
        this.b = context;
    }

    public /* synthetic */ wci(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public wci(WebContentsImpl webContentsImpl) {
        this.a = (byte) 10;
        this.b = webContentsImpl;
        this.c = new tvk(this);
    }

    public wci(zkl zklVar, SurfaceTexture surfaceTexture) {
        this.a = (byte) 7;
        this.c = zklVar;
        this.b = surfaceTexture;
    }

    @Override // com.opera.android.browser.dialog.DialogDelegate
    public final void a(nz0 nz0Var) {
        ((aal) this.c).Q(nz0Var, (d7l) this.b);
    }

    @Override // com.opera.android.browser.dialog.DialogDelegate
    public final void b(qq6 qq6Var, boolean z, String str, String str2, String str3) {
        ((aal) this.c).Q(new mpb(qq6Var, z, str, str2, str3), (d7l) this.b);
    }

    @Override // com.opera.android.browser.dialog.DialogDelegate
    public final void c(List list, List list2, u59 u59Var) {
        a(new gi4(list, list2, u59Var));
    }

    @Override // com.opera.android.browser.dialog.DialogDelegate
    public final void d(cej cejVar) {
        ((aal) this.c).R(cejVar, (d7l) this.b);
    }

    @Override // com.opera.android.browser.dialog.DialogDelegate
    public final void e(o93 o93Var) {
        ((aal) this.c).S(o93Var, (d7l) this.b, false);
    }

    @Override // com.opera.android.browser.dialog.DialogDelegate
    public final void f(qq6 qq6Var, boolean z) {
        ((aal) this.c).Q(new kpb(qq6Var, z), (d7l) this.b);
    }

    @Override // com.opera.android.browser.dialog.DialogDelegate
    public final void g(qq6 qq6Var, boolean z, String str, String str2) {
        ((aal) this.c).Q(new jpb(qq6Var, z, str, str2, (byte) 0), (d7l) this.b);
    }

    @Override // com.opera.android.browser.dialog.DialogDelegate
    public final void h(int i, String str, ole oleVar) {
        int i2;
        int i3;
        if (i != 0) {
            i2 = 0;
            i3 = 0;
        } else {
            i2 = 2132020601;
            i3 = 2132020600;
        }
        a(new u9g(i2, i3, str, oleVar));
    }

    @Override // com.opera.android.browser.dialog.DialogDelegate
    public final void i() {
        ((aal) this.c).T((d7l) this.b);
    }

    @Override // com.opera.android.browser.dialog.DialogDelegate
    public final void j(s2f s2fVar) {
        aal aalVar = (aal) this.c;
        d7l d7lVar = (d7l) this.b;
        aalVar.getClass();
        aalVar.b(new z9l(d7lVar, 4, s2fVar, true), s2fVar.getDefaultPriority());
    }

    @Override // com.opera.android.browser.dialog.DialogDelegate
    public final void k(qq6 qq6Var, boolean z, String str, String str2) {
        ((aal) this.c).Q(new jpb(qq6Var, z, str, str2, (byte) 1), (d7l) this.b);
    }

    @Override // com.opera.android.browser.dialog.DialogDelegate
    public final void l(b87 b87Var) {
        b87Var.finish(hjm.b);
    }

    @Override // com.opera.android.browser.dialog.DialogDelegate
    public final void m() {
        ((aal) this.c).T((d7l) this.b);
    }

    public final void n(String str, boolean z) {
        ArrayList arrayList;
        ((xho) this.b).s = str;
        if (z || (arrayList = (ArrayList) this.c) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            phj.t((String) it.next(), 7);
        }
    }

    public final void o(rjf rjfVar) {
        kf0 kf0Var;
        if (rjfVar != rjf.f) {
            nv6 nv6VarB = ru9.c(((nw3) this.b).b).b();
            ((SharedPreferences.Editor) nv6VarB.a).putBoolean("tab_gallery.tabui2_selection_menu_hint_bubble_shown", true);
            nv6VarB.w();
            oji ojiVar = (oji) this.c;
            int iOrdinal = rjfVar.ordinal();
            if (iOrdinal != 0) {
                kf0Var = kf0.b;
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        kf0Var = kf0.e;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            kf0Var = kf0.d;
                        } else {
                            if (iOrdinal != 5) {
                                h9o.p();
                                return;
                            }
                            kf0Var = null;
                        }
                    }
                }
            } else {
                kf0Var = kf0.c;
            }
            if (kf0Var != null) {
                ((x5f) ((orm) ((nw3) ojiVar.a).get())).W(kf0Var, mf0.l);
            }
        }
    }

    @Override // defpackage.rr9
    public final void onFailure(Throwable th) {
        switch (this.a) {
            case 5:
                if (th instanceof ztk) {
                    jpo.n((String) null, ((o94) this.c).cancel(false));
                    return;
                } else {
                    jpo.n((String) null, ((l94) this.b).b((Object) null));
                    return;
                }
            default:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }
    }

    @Override // defpackage.rr9
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 5:
                jpo.n((String) null, ((l94) this.b).b((Object) null));
                break;
            default:
                jpo.n("Unexpected result from SurfaceRequest. Surface was provided twice.", ((xo2) obj).a != 3);
                ((SurfaceTexture) this.b).release();
                all allVar = ((zkl) this.c).a;
                if (allVar.j != null) {
                    allVar.j = null;
                    break;
                }
                break;
        }
    }

    public final synchronized void p(boolean z, boolean z2) {
        boolean z3 = false;
        if (z) {
            if (((PowerManager.WakeLock) this.c) == null) {
                if (((Context) this.b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    w7d.K("WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                PowerManager powerManager = (PowerManager) ((Context) this.b).getSystemService("power");
                if (powerManager == null) {
                    w7d.K("PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.c = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
        }
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
        if (wakeLock == null) {
            return;
        }
        if (z && z2) {
            z3 = true;
        }
        if (z3) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    @Override // defpackage.cpp, defpackage.jrp
    /* renamed from: zza */
    public final Object mo1zza() {
        return new jup(((n0c) ((uto) this.b).b).a, (tup) ((cpp) this.c).mo1zza());
    }
}

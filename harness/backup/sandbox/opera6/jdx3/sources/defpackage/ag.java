package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import com.opera.android.BrowserActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class ag extends e63 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ag(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.e63, defpackage.qf7
    public final void a(re7 re7Var) throws Resources.NotFoundException {
        ota otaVar;
        Uri uriG;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 1:
                wjh wjhVar = (wjh) obj;
                int iA = vep.A(re7Var.f);
                if (iA == 2) {
                    wjhVar.s(new df7(re7Var));
                    break;
                } else if (iA == 3) {
                    mta mtaVar = (mta) ((HashMap) wjhVar.e).get(new df7(re7Var));
                    if (mtaVar != null && (otaVar = (ota) mtaVar.a.get()) != null) {
                        otaVar.b();
                        break;
                    }
                }
                break;
            case 2:
                if (re7Var.q() && re7Var.k()) {
                    igi igiVar = (igi) obj;
                    igi.u0((BrowserActivity) igiVar.b, (BrowserActivity) igiVar.c, (pt3) igiVar.d, (rf7) igiVar.e, re7Var, (orm) igiVar.g);
                    break;
                }
                break;
            case 3:
                ((wf7) ((igi) obj).f).a(re7Var, false);
                break;
            case 4:
                if (re7Var.k()) {
                    c5o c5oVar = (c5o) obj;
                    if (!re7Var.o() && (uriG = re7Var.g()) != null) {
                        lg7.a((Context) c5oVar.a, uriG);
                        break;
                    }
                }
                break;
            case 5:
                ((ev4) obj).p();
                break;
            case 6:
                fg7 fg7Var = (fg7) obj;
                ig igVar = fg7Var.h;
                ArrayList arrayList = fg7Var.b;
                if (!arrayList.isEmpty() && fg7.c(re7Var)) {
                    if (re7Var.f != 1) {
                        if (fg7Var.f) {
                            fg7Var.b();
                            if (!fg7Var.f) {
                                vml.a(igVar);
                                int size = arrayList.size();
                                while (i < size) {
                                    Object obj2 = arrayList.get(i);
                                    i++;
                                    bg bgVar = (bg) obj2;
                                    switch (bgVar.a) {
                                        case 0:
                                            break;
                                        default:
                                            bgVar.c(0L, 0L, false);
                                            break;
                                    }
                                }
                                break;
                            }
                        }
                    } else {
                        fg7Var.f = true;
                        fg7Var.g = 0;
                        vml.a(igVar);
                        igVar.run();
                        break;
                    }
                }
                break;
            case 8:
                if (re7Var.q() && re7Var.k()) {
                    jnm jnmVar = (jnm) obj;
                    HashSet hashSetM = w1h.m((SharedPreferences) jnmVar.a.get(), "unseen_download_ids");
                    if (hashSetM.add(Long.toString(re7Var.o))) {
                        jnmVar.b(hashSetM);
                        jnmVar.c(true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.e63, defpackage.qf7
    public final void b(re7 re7Var) {
        switch (this.a) {
            case 3:
                ((wf7) ((igi) this.b).f).a(re7Var, false);
                break;
        }
    }

    @Override // defpackage.e63, defpackage.qf7
    public final void c(re7 re7Var) throws Resources.NotFoundException {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                if (re7Var.n()) {
                    igi igiVar = (igi) obj;
                    fp1 fp1Var = (BrowserActivity) igiVar.b;
                    ((pt3) igiVar.d).f(new cf7(fp1Var.getString(2132018643), (BrowserActivity) igiVar.c, re7Var));
                    break;
                }
                break;
            case 3:
                ((wf7) ((igi) obj).f).a(re7Var, false);
                break;
            case 5:
                ev4 ev4Var = (ev4) obj;
                if (!ev4Var.c) {
                    ev4Var.p();
                    break;
                }
                break;
            case 6:
                if (fg7.c(re7Var)) {
                    a(re7Var);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.e63, defpackage.qf7
    public final void d(re7 re7Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((cg) obj).g.remove(re7Var);
                break;
            case 3:
                ((wf7) ((igi) obj).f).a(re7Var, false);
                break;
            case 5:
                ev4 ev4Var = (ev4) obj;
                if (ev4Var.c) {
                    ev4Var.p();
                    break;
                }
                break;
            case 7:
                okg okgVar = (okg) obj;
                okgVar.c.h(new mgf((Object) okgVar, (Object) re7Var, (byte) 6), false);
                break;
            case 8:
                ((jnm) obj).a(re7Var);
                break;
        }
    }

    @Override // defpackage.e63, defpackage.qf7
    public final void e(re7 re7Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                ((wf7) ((igi) obj).f).a(re7Var, true);
                break;
            case 8:
                ((jnm) obj).a(re7Var);
                break;
        }
    }

    @Override // defpackage.e63, defpackage.qf7
    public final void f(re7 re7Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                if (!re7Var.k()) {
                    ((wf7) ((igi) obj).f).a(re7Var, false);
                    break;
                }
                break;
            case 5:
                ev4 ev4Var = (ev4) obj;
                if (!ev4Var.c) {
                    ev4Var.p();
                    break;
                }
                break;
            case 8:
                if (re7Var.q() && re7Var.k()) {
                    jnm jnmVar = (jnm) obj;
                    HashSet hashSetM = w1h.m((SharedPreferences) jnmVar.a.get(), "unseen_download_ids");
                    if (hashSetM.add(Long.toString(re7Var.o))) {
                        jnmVar.b(hashSetM);
                        jnmVar.c(true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.e63, defpackage.qf7
    public final void h(re7 re7Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((cg) obj).g.remove(re7Var);
                break;
            case 3:
                ((wf7) ((igi) obj).f).a(re7Var, false);
                break;
            case 5:
                ev4 ev4Var = (ev4) obj;
                if (ev4Var.c) {
                    ev4Var.p();
                    break;
                }
                break;
            case 7:
                okg okgVar = (okg) obj;
                okgVar.c.h(new mgf((Object) okgVar, (Object) re7Var, (byte) 6), false);
                break;
            case 8:
                ((jnm) obj).a(re7Var);
                break;
        }
    }
}

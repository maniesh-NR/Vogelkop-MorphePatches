package defpackage;

import android.view.View;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class hv0 implements id {
    public final BrowserActivity a;
    public final BrowserActivity b;
    public final fd c;
    public final j4c d;
    public final SettingsManager e;
    public final d8j f;
    public final pt3 g;
    public final Lazy h;
    public Boolean i;

    public hv0(BrowserActivity browserActivity, BrowserActivity browserActivity2, fd fdVar, j4c j4cVar, SettingsManager settingsManager, d8j d8jVar, pt3 pt3Var, Lazy lazy) {
        this.a = browserActivity;
        this.b = browserActivity2;
        this.c = fdVar;
        this.d = j4cVar;
        this.e = settingsManager;
        this.f = d8jVar;
        this.g = pt3Var;
        this.h = lazy;
        aib.B(settingsManager, browserActivity2, new s9(this, (byte) 1), new vme((byte) 19));
    }

    @Override // defpackage.id
    public final jf a(yk5 yk5Var, pc pcVar) {
        int iOrdinal = pcVar.ordinal();
        if (iOrdinal == 9) {
            if (!c()) {
                return null;
            }
            final byte b = 0;
            Function2 function2 = new Function2(this) { // from class: gv0
                public final /* synthetic */ hv0 b;

                {
                    this.b = this;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Object next;
                    byte b2 = b;
                    hv0 hv0Var = this.b;
                    View view = (View) obj;
                    switch (b2) {
                        case 0:
                            z5i.s0(hv0Var.a, hv0Var.e, hv0Var.f, (String) null, false, hv0Var.g);
                            break;
                        case 1:
                            if (hv0Var.b()) {
                                new dd(hv0Var.c, Arrays.asList(new zc(pc.s), ad.a, new zc(pc.t), new zc(pc.p))).o(view);
                            } else {
                                z5i.s0(hv0Var.a, hv0Var.e, hv0Var.f, (String) null, false, hv0Var.g);
                            }
                            break;
                        case 2:
                            fp1 fp1Var = hv0Var.a;
                            pt3 pt3Var = hv0Var.g;
                            String[] strArr = OperaApplication.K;
                            Iterator it = Collections.unmodifiableList(((OperaApplication) fp1Var.getApplicationContext()).I().a).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (((eri) next) instanceof l42) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            eri eriVar = (eri) next;
                            if (eriVar != null) {
                                pt3Var.b(eriVar, "", true, false);
                            }
                            break;
                        case 3:
                            ((gjm) hv0Var.h.get()).e(new tca(sca.b), false);
                            break;
                        default:
                            z5i.s0(hv0Var.a, hv0Var.e, hv0Var.f, (String) null, false, hv0Var.g);
                            break;
                    }
                    return Unit.a;
                }
            };
            final byte b2 = 1;
            return new jf(function2, new Function2(this) { // from class: gv0
                public final /* synthetic */ hv0 b;

                {
                    this.b = this;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Object next;
                    byte b22 = b2;
                    hv0 hv0Var = this.b;
                    View view = (View) obj;
                    switch (b22) {
                        case 0:
                            z5i.s0(hv0Var.a, hv0Var.e, hv0Var.f, (String) null, false, hv0Var.g);
                            break;
                        case 1:
                            if (hv0Var.b()) {
                                new dd(hv0Var.c, Arrays.asList(new zc(pc.s), ad.a, new zc(pc.t), new zc(pc.p))).o(view);
                            } else {
                                z5i.s0(hv0Var.a, hv0Var.e, hv0Var.f, (String) null, false, hv0Var.g);
                            }
                            break;
                        case 2:
                            fp1 fp1Var = hv0Var.a;
                            pt3 pt3Var = hv0Var.g;
                            String[] strArr = OperaApplication.K;
                            Iterator it = Collections.unmodifiableList(((OperaApplication) fp1Var.getApplicationContext()).I().a).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (((eri) next) instanceof l42) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            eri eriVar = (eri) next;
                            if (eriVar != null) {
                                pt3Var.b(eriVar, "", true, false);
                            }
                            break;
                        case 3:
                            ((gjm) hv0Var.h.get()).e(new tca(sca.b), false);
                            break;
                        default:
                            z5i.s0(hv0Var.a, hv0Var.e, hv0Var.f, (String) null, false, hv0Var.g);
                            break;
                    }
                    return Unit.a;
                }
            }, false, this.e.i("ai_assistant_menu_shortcut"), 28);
        }
        switch (iOrdinal) {
            case SizeUtil.textSize2 /* 24 */:
                if (!b() || !wxe.J(this.a)) {
                    return null;
                }
                final byte b3 = 2;
                return new jf(new Function2(this) { // from class: gv0
                    public final /* synthetic */ hv0 b;

                    {
                        this.b = this;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        Object next;
                        byte b22 = b3;
                        hv0 hv0Var = this.b;
                        View view = (View) obj;
                        switch (b22) {
                            case 0:
                                z5i.s0(hv0Var.a, hv0Var.e, hv0Var.f, (String) null, false, hv0Var.g);
                                break;
                            case 1:
                                if (hv0Var.b()) {
                                    new dd(hv0Var.c, Arrays.asList(new zc(pc.s), ad.a, new zc(pc.t), new zc(pc.p))).o(view);
                                } else {
                                    z5i.s0(hv0Var.a, hv0Var.e, hv0Var.f, (String) null, false, hv0Var.g);
                                }
                                break;
                            case 2:
                                fp1 fp1Var = hv0Var.a;
                                pt3 pt3Var = hv0Var.g;
                                String[] strArr = OperaApplication.K;
                                Iterator it = Collections.unmodifiableList(((OperaApplication) fp1Var.getApplicationContext()).I().a).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (((eri) next) instanceof l42) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                eri eriVar = (eri) next;
                                if (eriVar != null) {
                                    pt3Var.b(eriVar, "", true, false);
                                }
                                break;
                            case 3:
                                ((gjm) hv0Var.h.get()).e(new tca(sca.b), false);
                                break;
                            default:
                                z5i.s0(hv0Var.a, hv0Var.e, hv0Var.f, (String) null, false, hv0Var.g);
                                break;
                        }
                        return Unit.a;
                    }
                }, null, false, false, 62);
            case 25:
                if (!b()) {
                    return null;
                }
                final byte b4 = 3;
                return new jf(new Function2(this) { // from class: gv0
                    public final /* synthetic */ hv0 b;

                    {
                        this.b = this;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        Object next;
                        byte b22 = b4;
                        hv0 hv0Var = this.b;
                        View view = (View) obj;
                        switch (b22) {
                            case 0:
                                z5i.s0(hv0Var.a, hv0Var.e, hv0Var.f, (String) null, false, hv0Var.g);
                                break;
                            case 1:
                                if (hv0Var.b()) {
                                    new dd(hv0Var.c, Arrays.asList(new zc(pc.s), ad.a, new zc(pc.t), new zc(pc.p))).o(view);
                                } else {
                                    z5i.s0(hv0Var.a, hv0Var.e, hv0Var.f, (String) null, false, hv0Var.g);
                                }
                                break;
                            case 2:
                                fp1 fp1Var = hv0Var.a;
                                pt3 pt3Var = hv0Var.g;
                                String[] strArr = OperaApplication.K;
                                Iterator it = Collections.unmodifiableList(((OperaApplication) fp1Var.getApplicationContext()).I().a).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (((eri) next) instanceof l42) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                eri eriVar = (eri) next;
                                if (eriVar != null) {
                                    pt3Var.b(eriVar, "", true, false);
                                }
                                break;
                            case 3:
                                ((gjm) hv0Var.h.get()).e(new tca(sca.b), false);
                                break;
                            default:
                                z5i.s0(hv0Var.a, hv0Var.e, hv0Var.f, (String) null, false, hv0Var.g);
                                break;
                        }
                        return Unit.a;
                    }
                }, null, false, false, 62);
            case 26:
                if (!b()) {
                    return null;
                }
                final byte b5 = 4;
                return new jf(new Function2(this) { // from class: gv0
                    public final /* synthetic */ hv0 b;

                    {
                        this.b = this;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        Object next;
                        byte b22 = b5;
                        hv0 hv0Var = this.b;
                        View view = (View) obj;
                        switch (b22) {
                            case 0:
                                z5i.s0(hv0Var.a, hv0Var.e, hv0Var.f, (String) null, false, hv0Var.g);
                                break;
                            case 1:
                                if (hv0Var.b()) {
                                    new dd(hv0Var.c, Arrays.asList(new zc(pc.s), ad.a, new zc(pc.t), new zc(pc.p))).o(view);
                                } else {
                                    z5i.s0(hv0Var.a, hv0Var.e, hv0Var.f, (String) null, false, hv0Var.g);
                                }
                                break;
                            case 2:
                                fp1 fp1Var = hv0Var.a;
                                pt3 pt3Var = hv0Var.g;
                                String[] strArr = OperaApplication.K;
                                Iterator it = Collections.unmodifiableList(((OperaApplication) fp1Var.getApplicationContext()).I().a).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (((eri) next) instanceof l42) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                eri eriVar = (eri) next;
                                if (eriVar != null) {
                                    pt3Var.b(eriVar, "", true, false);
                                }
                                break;
                            case 3:
                                ((gjm) hv0Var.h.get()).e(new tca(sca.b), false);
                                break;
                            default:
                                z5i.s0(hv0Var.a, hv0Var.e, hv0Var.f, (String) null, false, hv0Var.g);
                                break;
                        }
                        return Unit.a;
                    }
                }, null, false, false, 62);
            default:
                return null;
        }
    }

    public final boolean b() {
        return c() && this.e.i("ai_assistant_menu_shortcut");
    }

    public final boolean c() {
        Boolean bool = this.i;
        if (bool != null) {
            return bool.booleanValue();
        }
        yk6 yk6Var = (yk6) this.d.get();
        yk6Var.i.j(this.b, new pb(new z3((Object) this, (byte) 14), (byte) 8));
        return ((Boolean) yk6Var.i.g()).booleanValue();
    }
}

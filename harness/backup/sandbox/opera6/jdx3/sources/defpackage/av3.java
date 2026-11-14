package defpackage;

import J.N;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import com.opera.android.BrowserActivity;
import com.opera.android.RootView;
import com.opera.android.bar.BottomBar;
import com.opera.android.bar.TopToolbarContainer;
import com.opera.android.browser.NavigationHistory;
import com.opera.android.browser.SessionStore;
import com.opera.android.browser.chromium.ChromiumContainerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final class av3 implements l24 {
    public final LinkedHashSet a = new LinkedHashSet();
    public vvb b;
    public View c;
    public final /* synthetic */ BrowserActivity d;

    public av3(BrowserActivity browserActivity) {
        this.d = browserActivity;
    }

    @Override // defpackage.l24
    public final void L() {
        BrowserActivity browserActivity = this.d;
        RootView rootView = browserActivity.Q;
        if (rootView == null) {
            rootView = null;
        }
        this.c = rootView.findFocus();
        ChromiumContainerView chromiumContainerViewE0 = browserActivity.e0();
        chromiumContainerViewE0.setDescendantFocusability(393216);
        LinkedHashSet linkedHashSet = this.a;
        linkedHashSet.add(chromiumContainerViewE0);
        BottomBar bottomBar = browserActivity.A;
        if (bottomBar == null) {
            bottomBar = null;
        }
        bottomBar.setDescendantFocusability(393216);
        linkedHashSet.add(bottomBar);
        TopToolbarContainer topToolbarContainer = browserActivity.W;
        TopToolbarContainer topToolbarContainer2 = topToolbarContainer != null ? topToolbarContainer : null;
        topToolbarContainer2.setDescendantFocusability(393216);
        linkedHashSet.add(topToolbarContainer2);
    }

    @Override // defpackage.l24
    public final void S() {
        BrowserActivity browserActivity = this.d;
        if (browserActivity.e0().getVisibility() == 0 && browserActivity.e0().requestFocus()) {
            return;
        }
        RootView rootView = browserActivity.Q;
        if (rootView == null) {
            rootView = null;
        }
        rootView.requestFocus();
    }

    @Override // defpackage.l24
    public final boolean V() {
        int i = BrowserActivity.E1;
        BrowserActivity browserActivity = this.d;
        qim qimVar = browserActivity.o;
        Objects.requireNonNull(qimVar);
        if (!qimVar.b()) {
            browserActivity.M0().b0(null);
            gbf gbfVar = browserActivity.M;
            if (gbfVar == null) {
                gbfVar = null;
            }
            if (gbfVar.j.p()) {
                gbf gbfVar2 = browserActivity.M;
                zqi zqiVar = (zqi) (gbfVar2 != null ? gbfVar2 : null).s.get();
                mri mriVar = zqiVar.a;
                if (!mriVar.k()) {
                    mriVar.o(zqiVar.c.findViewById(2131363320));
                    return true;
                }
                if (mriVar.k()) {
                    mriVar.b();
                    return true;
                }
            } else {
                if (browserActivity.B0() != null) {
                    return true;
                }
                int iD0 = cqp.d0(browserActivity.getSupportFragmentManager());
                if (iD0 == 0) {
                    browserActivity.v1();
                    return true;
                }
                if (iD0 == 2) {
                    browserActivity.getSupportFragmentManager().Y(-1, 1, (String) null);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.l24
    public final boolean Z() {
        int i = BrowserActivity.E1;
        BrowserActivity browserActivity = this.d;
        b2l b2lVarW0 = browserActivity.w0();
        if (b2lVarW0 == null || !((d7l) b2lVarW0).n()) {
            return false;
        }
        browserActivity.c1(new by3(2, 2));
        return true;
    }

    public final void a() {
        BrowserActivity browserActivity = this.d;
        gbf gbfVar = browserActivity.M;
        if (gbfVar == null) {
            gbfVar = null;
        }
        if (gbfVar.j.p()) {
            return;
        }
        browserActivity.o1(1);
        gbf gbfVar2 = browserActivity.M;
        if (gbfVar2 == null) {
            gbfVar2 = null;
        }
        gbfVar2.l(null, hbf.c);
    }

    @Override // defpackage.l24
    public final vvb b() {
        vvb vvbVar = this.b;
        if (vvbVar != null) {
            return vvbVar;
        }
        final BrowserActivity browserActivity = this.d;
        uvb uvbVar = new uvb(2131363279, 2, 48, new pt3(browserActivity, (byte) 18));
        uvb uvbVar2 = new uvb(2131363274, 2, 51, new pt3(browserActivity, (byte) 20));
        uvb uvbVar3 = new uvb(2131363287, 2, 46, new pt3(browserActivity, (byte) 22));
        uvb uvbVar4 = new uvb(2131363277, 1, 21, new pt3(browserActivity, (byte) 23));
        uvb uvbVar5 = new uvb(2131363278, 1, 22, new pt3(browserActivity, (byte) 24));
        uvb uvbVar6 = new uvb(2131363289, 6, 61, new pt3(browserActivity, (byte) 25));
        uvb uvbVar7 = new uvb(2131363288, 2, 61, new pt3(browserActivity, (byte) 26));
        uvb uvbVar8 = new uvb(2131363289, 2, 92, new pt3(browserActivity, (byte) 27));
        uvb uvbVar9 = new uvb(2131363288, 2, 93, new pt3(browserActivity, (byte) 28));
        final byte b = 0;
        uvb uvbVar10 = new uvb(0, 6, 51, new pt3(browserActivity, (byte) 29));
        uvb uvbVar11 = new uvb(0, 6, 42, new pt3(browserActivity, (byte) 21));
        uvb uvbVar12 = new uvb(0, 6, 48, new tvb() { // from class: xu3
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v1, types: [android.content.Context, com.opera.android.BrowserActivity] */
            @Override // defpackage.tvb
            public final void run() {
                byte b2 = b;
                enh enhVar = null;
                int i = 0;
                ?? r8 = browserActivity;
                switch (b2) {
                    case 0:
                        int i2 = BrowserActivity.E1;
                        b2l b2lVarW0 = r8.w0();
                        if (b2lVarW0 != null) {
                            fnh fnhVar = r8.C;
                            if (fnhVar == null) {
                                fnhVar = null;
                            }
                            SessionStore sessionStore = fnhVar.f;
                            sessionStore.getClass();
                            ArrayList arrayList = new ArrayList();
                            N.MqkthI77(sessionStore.a, arrayList);
                            int size = arrayList.size();
                            while (true) {
                                if (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    enh enhVar2 = (enh) obj;
                                    if (enhVar2.e) {
                                        enhVar = enhVar2;
                                    }
                                }
                            }
                            if (enhVar != null) {
                                fnhVar.b(enhVar, b2lVarW0, true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        int i3 = BrowserActivity.E1;
                        b2l b2lVarW02 = r8.w0();
                        if (b2lVarW02 != null && ((d7l) b2lVarW02).j.R() != null) {
                            gbf gbfVar = r8.M;
                            (gbfVar != null ? gbfVar : null).t(true);
                            break;
                        }
                        break;
                    case 2:
                        r8.P0().e(new tca(0), false);
                        break;
                    case 3:
                        zhj.b(wg7.class).c(r8);
                        break;
                    default:
                        ((ul3) r8.y.a.f.get()).a();
                        break;
                }
            }
        });
        final byte b2 = 1;
        final byte b3 = 2;
        uvb uvbVar13 = new uvb(2131363275, 2, 34, new tvb() { // from class: xu3
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v1, types: [android.content.Context, com.opera.android.BrowserActivity] */
            @Override // defpackage.tvb
            public final void run() {
                byte b22 = b2;
                enh enhVar = null;
                int i = 0;
                ?? r8 = browserActivity;
                switch (b22) {
                    case 0:
                        int i2 = BrowserActivity.E1;
                        b2l b2lVarW0 = r8.w0();
                        if (b2lVarW0 != null) {
                            fnh fnhVar = r8.C;
                            if (fnhVar == null) {
                                fnhVar = null;
                            }
                            SessionStore sessionStore = fnhVar.f;
                            sessionStore.getClass();
                            ArrayList arrayList = new ArrayList();
                            N.MqkthI77(sessionStore.a, arrayList);
                            int size = arrayList.size();
                            while (true) {
                                if (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    enh enhVar2 = (enh) obj;
                                    if (enhVar2.e) {
                                        enhVar = enhVar2;
                                    }
                                }
                            }
                            if (enhVar != null) {
                                fnhVar.b(enhVar, b2lVarW0, true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        int i3 = BrowserActivity.E1;
                        b2l b2lVarW02 = r8.w0();
                        if (b2lVarW02 != null && ((d7l) b2lVarW02).j.R() != null) {
                            gbf gbfVar = r8.M;
                            (gbfVar != null ? gbfVar : null).t(true);
                            break;
                        }
                        break;
                    case 2:
                        r8.P0().e(new tca(0), false);
                        break;
                    case 3:
                        zhj.b(wg7.class).c(r8);
                        break;
                    default:
                        ((ul3) r8.y.a.f.get()).a();
                        break;
                }
            }
        });
        uvb uvbVar14 = new uvb(2131363282, 2, 36, new tvb() { // from class: xu3
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v1, types: [android.content.Context, com.opera.android.BrowserActivity] */
            @Override // defpackage.tvb
            public final void run() {
                byte b22 = b3;
                enh enhVar = null;
                int i = 0;
                ?? r8 = browserActivity;
                switch (b22) {
                    case 0:
                        int i2 = BrowserActivity.E1;
                        b2l b2lVarW0 = r8.w0();
                        if (b2lVarW0 != null) {
                            fnh fnhVar = r8.C;
                            if (fnhVar == null) {
                                fnhVar = null;
                            }
                            SessionStore sessionStore = fnhVar.f;
                            sessionStore.getClass();
                            ArrayList arrayList = new ArrayList();
                            N.MqkthI77(sessionStore.a, arrayList);
                            int size = arrayList.size();
                            while (true) {
                                if (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    enh enhVar2 = (enh) obj;
                                    if (enhVar2.e) {
                                        enhVar = enhVar2;
                                    }
                                }
                            }
                            if (enhVar != null) {
                                fnhVar.b(enhVar, b2lVarW0, true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        int i3 = BrowserActivity.E1;
                        b2l b2lVarW02 = r8.w0();
                        if (b2lVarW02 != null && ((d7l) b2lVarW02).j.R() != null) {
                            gbf gbfVar = r8.M;
                            (gbfVar != null ? gbfVar : null).t(true);
                            break;
                        }
                        break;
                    case 2:
                        r8.P0().e(new tca(0), false);
                        break;
                    case 3:
                        zhj.b(wg7.class).c(r8);
                        break;
                    default:
                        ((ul3) r8.y.a.f.get()).a();
                        break;
                }
            }
        });
        final byte b4 = 3;
        uvb uvbVar15 = new uvb(2131363281, 2, 38, new tvb() { // from class: xu3
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v1, types: [android.content.Context, com.opera.android.BrowserActivity] */
            @Override // defpackage.tvb
            public final void run() {
                byte b22 = b4;
                enh enhVar = null;
                int i = 0;
                ?? r8 = browserActivity;
                switch (b22) {
                    case 0:
                        int i2 = BrowserActivity.E1;
                        b2l b2lVarW0 = r8.w0();
                        if (b2lVarW0 != null) {
                            fnh fnhVar = r8.C;
                            if (fnhVar == null) {
                                fnhVar = null;
                            }
                            SessionStore sessionStore = fnhVar.f;
                            sessionStore.getClass();
                            ArrayList arrayList = new ArrayList();
                            N.MqkthI77(sessionStore.a, arrayList);
                            int size = arrayList.size();
                            while (true) {
                                if (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    enh enhVar2 = (enh) obj;
                                    if (enhVar2.e) {
                                        enhVar = enhVar2;
                                    }
                                }
                            }
                            if (enhVar != null) {
                                fnhVar.b(enhVar, b2lVarW0, true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        int i3 = BrowserActivity.E1;
                        b2l b2lVarW02 = r8.w0();
                        if (b2lVarW02 != null && ((d7l) b2lVarW02).j.R() != null) {
                            gbf gbfVar = r8.M;
                            (gbfVar != null ? gbfVar : null).t(true);
                            break;
                        }
                        break;
                    case 2:
                        r8.P0().e(new tca(0), false);
                        break;
                    case 3:
                        zhj.b(wg7.class).c(r8);
                        break;
                    default:
                        ((ul3) r8.y.a.f.get()).a();
                        break;
                }
            }
        });
        final byte b5 = 4;
        uvb uvbVar16 = new uvb(2131363272, 2, 32, new tvb() { // from class: xu3
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v1, types: [android.content.Context, com.opera.android.BrowserActivity] */
            @Override // defpackage.tvb
            public final void run() {
                byte b22 = b5;
                enh enhVar = null;
                int i = 0;
                ?? r8 = browserActivity;
                switch (b22) {
                    case 0:
                        int i2 = BrowserActivity.E1;
                        b2l b2lVarW0 = r8.w0();
                        if (b2lVarW0 != null) {
                            fnh fnhVar = r8.C;
                            if (fnhVar == null) {
                                fnhVar = null;
                            }
                            SessionStore sessionStore = fnhVar.f;
                            sessionStore.getClass();
                            ArrayList arrayList = new ArrayList();
                            N.MqkthI77(sessionStore.a, arrayList);
                            int size = arrayList.size();
                            while (true) {
                                if (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    enh enhVar2 = (enh) obj;
                                    if (enhVar2.e) {
                                        enhVar = enhVar2;
                                    }
                                }
                            }
                            if (enhVar != null) {
                                fnhVar.b(enhVar, b2lVarW0, true);
                                break;
                            }
                        }
                        break;
                    case 1:
                        int i3 = BrowserActivity.E1;
                        b2l b2lVarW02 = r8.w0();
                        if (b2lVarW02 != null && ((d7l) b2lVarW02).j.R() != null) {
                            gbf gbfVar = r8.M;
                            (gbfVar != null ? gbfVar : null).t(true);
                            break;
                        }
                        break;
                    case 2:
                        r8.P0().e(new tca(0), false);
                        break;
                    case 3:
                        zhj.b(wg7.class).c(r8);
                        break;
                    default:
                        ((ul3) r8.y.a.f.get()).a();
                        break;
                }
            }
        });
        final byte b6 = 9;
        final byte b7 = 10;
        final byte b8 = 11;
        final byte b9 = 0;
        final byte b10 = 2;
        final byte b11 = 1;
        final byte b12 = 3;
        final byte b13 = 4;
        final byte b14 = 5;
        final byte b15 = 6;
        final byte b16 = 7;
        final byte b17 = 8;
        vvb vvbVar2 = new vvb(new uvb[]{uvbVar, uvbVar2, uvbVar3, uvbVar4, uvbVar5, uvbVar6, uvbVar7, uvbVar8, uvbVar9, uvbVar10, uvbVar11, uvbVar12, uvbVar13, uvbVar14, uvbVar15, uvbVar16, new uvb(0, 2, 33, new tvb(this) { // from class: wu3
            public final /* synthetic */ av3 b;

            {
                this.b = this;
            }

            @Override // defpackage.tvb
            public final void run() {
                byte b18 = b6;
                av3 av3Var = this.b;
                switch (b18) {
                    case 0:
                        av3Var.c(0);
                        break;
                    case 1:
                        av3Var.c(1);
                        break;
                    case 2:
                        av3Var.c(2);
                        break;
                    case 3:
                        av3Var.c(3);
                        break;
                    case 4:
                        av3Var.c(4);
                        break;
                    case 5:
                        av3Var.c(5);
                        break;
                    case 6:
                        av3Var.c(6);
                        break;
                    case 7:
                        av3Var.c(7);
                        break;
                    case 8:
                        av3Var.c(8);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        av3Var.a();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        av3Var.a();
                        break;
                    default:
                        av3Var.a();
                        break;
                }
            }
        }), new uvb(0, 2, 39, new tvb(this) { // from class: wu3
            public final /* synthetic */ av3 b;

            {
                this.b = this;
            }

            @Override // defpackage.tvb
            public final void run() {
                byte b18 = b7;
                av3 av3Var = this.b;
                switch (b18) {
                    case 0:
                        av3Var.c(0);
                        break;
                    case 1:
                        av3Var.c(1);
                        break;
                    case 2:
                        av3Var.c(2);
                        break;
                    case 3:
                        av3Var.c(3);
                        break;
                    case 4:
                        av3Var.c(4);
                        break;
                    case 5:
                        av3Var.c(5);
                        break;
                    case 6:
                        av3Var.c(6);
                        break;
                    case 7:
                        av3Var.c(7);
                        break;
                    case 8:
                        av3Var.c(8);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        av3Var.a();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        av3Var.a();
                        break;
                    default:
                        av3Var.a();
                        break;
                }
            }
        }), new uvb(0, 2, 40, new tvb(this) { // from class: wu3
            public final /* synthetic */ av3 b;

            {
                this.b = this;
            }

            @Override // defpackage.tvb
            public final void run() {
                byte b18 = b8;
                av3 av3Var = this.b;
                switch (b18) {
                    case 0:
                        av3Var.c(0);
                        break;
                    case 1:
                        av3Var.c(1);
                        break;
                    case 2:
                        av3Var.c(2);
                        break;
                    case 3:
                        av3Var.c(3);
                        break;
                    case 4:
                        av3Var.c(4);
                        break;
                    case 5:
                        av3Var.c(5);
                        break;
                    case 6:
                        av3Var.c(6);
                        break;
                    case 7:
                        av3Var.c(7);
                        break;
                    case 8:
                        av3Var.c(8);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        av3Var.a();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        av3Var.a();
                        break;
                    default:
                        av3Var.a();
                        break;
                }
            }
        }), new uvb(2131363273, 2, 47, new pt3(browserActivity, (byte) 19)), new uvb(2131363276, 1, 33, new yu3(browserActivity)), new uvb(2131363285, 1, 34, new zu3(browserActivity)), new uvb(0, 2, 8, new tvb(this) { // from class: wu3
            public final /* synthetic */ av3 b;

            {
                this.b = this;
            }

            @Override // defpackage.tvb
            public final void run() {
                byte b18 = b9;
                av3 av3Var = this.b;
                switch (b18) {
                    case 0:
                        av3Var.c(0);
                        break;
                    case 1:
                        av3Var.c(1);
                        break;
                    case 2:
                        av3Var.c(2);
                        break;
                    case 3:
                        av3Var.c(3);
                        break;
                    case 4:
                        av3Var.c(4);
                        break;
                    case 5:
                        av3Var.c(5);
                        break;
                    case 6:
                        av3Var.c(6);
                        break;
                    case 7:
                        av3Var.c(7);
                        break;
                    case 8:
                        av3Var.c(8);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        av3Var.a();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        av3Var.a();
                        break;
                    default:
                        av3Var.a();
                        break;
                }
            }
        }), new uvb(0, 2, 9, new tvb(this) { // from class: wu3
            public final /* synthetic */ av3 b;

            {
                this.b = this;
            }

            @Override // defpackage.tvb
            public final void run() {
                byte b18 = b11;
                av3 av3Var = this.b;
                switch (b18) {
                    case 0:
                        av3Var.c(0);
                        break;
                    case 1:
                        av3Var.c(1);
                        break;
                    case 2:
                        av3Var.c(2);
                        break;
                    case 3:
                        av3Var.c(3);
                        break;
                    case 4:
                        av3Var.c(4);
                        break;
                    case 5:
                        av3Var.c(5);
                        break;
                    case 6:
                        av3Var.c(6);
                        break;
                    case 7:
                        av3Var.c(7);
                        break;
                    case 8:
                        av3Var.c(8);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        av3Var.a();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        av3Var.a();
                        break;
                    default:
                        av3Var.a();
                        break;
                }
            }
        }), new uvb(0, 2, 10, new tvb(this) { // from class: wu3
            public final /* synthetic */ av3 b;

            {
                this.b = this;
            }

            @Override // defpackage.tvb
            public final void run() {
                byte b18 = b10;
                av3 av3Var = this.b;
                switch (b18) {
                    case 0:
                        av3Var.c(0);
                        break;
                    case 1:
                        av3Var.c(1);
                        break;
                    case 2:
                        av3Var.c(2);
                        break;
                    case 3:
                        av3Var.c(3);
                        break;
                    case 4:
                        av3Var.c(4);
                        break;
                    case 5:
                        av3Var.c(5);
                        break;
                    case 6:
                        av3Var.c(6);
                        break;
                    case 7:
                        av3Var.c(7);
                        break;
                    case 8:
                        av3Var.c(8);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        av3Var.a();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        av3Var.a();
                        break;
                    default:
                        av3Var.a();
                        break;
                }
            }
        }), new uvb(0, 2, 11, new tvb(this) { // from class: wu3
            public final /* synthetic */ av3 b;

            {
                this.b = this;
            }

            @Override // defpackage.tvb
            public final void run() {
                byte b18 = b12;
                av3 av3Var = this.b;
                switch (b18) {
                    case 0:
                        av3Var.c(0);
                        break;
                    case 1:
                        av3Var.c(1);
                        break;
                    case 2:
                        av3Var.c(2);
                        break;
                    case 3:
                        av3Var.c(3);
                        break;
                    case 4:
                        av3Var.c(4);
                        break;
                    case 5:
                        av3Var.c(5);
                        break;
                    case 6:
                        av3Var.c(6);
                        break;
                    case 7:
                        av3Var.c(7);
                        break;
                    case 8:
                        av3Var.c(8);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        av3Var.a();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        av3Var.a();
                        break;
                    default:
                        av3Var.a();
                        break;
                }
            }
        }), new uvb(0, 2, 12, new tvb(this) { // from class: wu3
            public final /* synthetic */ av3 b;

            {
                this.b = this;
            }

            @Override // defpackage.tvb
            public final void run() {
                byte b18 = b13;
                av3 av3Var = this.b;
                switch (b18) {
                    case 0:
                        av3Var.c(0);
                        break;
                    case 1:
                        av3Var.c(1);
                        break;
                    case 2:
                        av3Var.c(2);
                        break;
                    case 3:
                        av3Var.c(3);
                        break;
                    case 4:
                        av3Var.c(4);
                        break;
                    case 5:
                        av3Var.c(5);
                        break;
                    case 6:
                        av3Var.c(6);
                        break;
                    case 7:
                        av3Var.c(7);
                        break;
                    case 8:
                        av3Var.c(8);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        av3Var.a();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        av3Var.a();
                        break;
                    default:
                        av3Var.a();
                        break;
                }
            }
        }), new uvb(0, 2, 13, new tvb(this) { // from class: wu3
            public final /* synthetic */ av3 b;

            {
                this.b = this;
            }

            @Override // defpackage.tvb
            public final void run() {
                byte b18 = b14;
                av3 av3Var = this.b;
                switch (b18) {
                    case 0:
                        av3Var.c(0);
                        break;
                    case 1:
                        av3Var.c(1);
                        break;
                    case 2:
                        av3Var.c(2);
                        break;
                    case 3:
                        av3Var.c(3);
                        break;
                    case 4:
                        av3Var.c(4);
                        break;
                    case 5:
                        av3Var.c(5);
                        break;
                    case 6:
                        av3Var.c(6);
                        break;
                    case 7:
                        av3Var.c(7);
                        break;
                    case 8:
                        av3Var.c(8);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        av3Var.a();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        av3Var.a();
                        break;
                    default:
                        av3Var.a();
                        break;
                }
            }
        }), new uvb(0, 2, 14, new tvb(this) { // from class: wu3
            public final /* synthetic */ av3 b;

            {
                this.b = this;
            }

            @Override // defpackage.tvb
            public final void run() {
                byte b18 = b15;
                av3 av3Var = this.b;
                switch (b18) {
                    case 0:
                        av3Var.c(0);
                        break;
                    case 1:
                        av3Var.c(1);
                        break;
                    case 2:
                        av3Var.c(2);
                        break;
                    case 3:
                        av3Var.c(3);
                        break;
                    case 4:
                        av3Var.c(4);
                        break;
                    case 5:
                        av3Var.c(5);
                        break;
                    case 6:
                        av3Var.c(6);
                        break;
                    case 7:
                        av3Var.c(7);
                        break;
                    case 8:
                        av3Var.c(8);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        av3Var.a();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        av3Var.a();
                        break;
                    default:
                        av3Var.a();
                        break;
                }
            }
        }), new uvb(0, 2, 15, new tvb(this) { // from class: wu3
            public final /* synthetic */ av3 b;

            {
                this.b = this;
            }

            @Override // defpackage.tvb
            public final void run() {
                byte b18 = b16;
                av3 av3Var = this.b;
                switch (b18) {
                    case 0:
                        av3Var.c(0);
                        break;
                    case 1:
                        av3Var.c(1);
                        break;
                    case 2:
                        av3Var.c(2);
                        break;
                    case 3:
                        av3Var.c(3);
                        break;
                    case 4:
                        av3Var.c(4);
                        break;
                    case 5:
                        av3Var.c(5);
                        break;
                    case 6:
                        av3Var.c(6);
                        break;
                    case 7:
                        av3Var.c(7);
                        break;
                    case 8:
                        av3Var.c(8);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        av3Var.a();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        av3Var.a();
                        break;
                    default:
                        av3Var.a();
                        break;
                }
            }
        }), new uvb(0, 2, 16, new tvb(this) { // from class: wu3
            public final /* synthetic */ av3 b;

            {
                this.b = this;
            }

            @Override // defpackage.tvb
            public final void run() {
                byte b18 = b17;
                av3 av3Var = this.b;
                switch (b18) {
                    case 0:
                        av3Var.c(0);
                        break;
                    case 1:
                        av3Var.c(1);
                        break;
                    case 2:
                        av3Var.c(2);
                        break;
                    case 3:
                        av3Var.c(3);
                        break;
                    case 4:
                        av3Var.c(4);
                        break;
                    case 5:
                        av3Var.c(5);
                        break;
                    case 6:
                        av3Var.c(6);
                        break;
                    case 7:
                        av3Var.c(7);
                        break;
                    case 8:
                        av3Var.c(8);
                        break;
                    case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                        av3Var.a();
                        break;
                    case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                        av3Var.a();
                        break;
                    default:
                        av3Var.a();
                        break;
                }
            }
        })});
        this.b = vvbVar2;
        return vvbVar2;
    }

    public final void c(int i) {
        b2l b2lVar;
        int i2 = BrowserActivity.E1;
        BrowserActivity browserActivity = this.d;
        b2l b2lVarW0 = browserActivity.w0();
        if (b2lVarW0 != null) {
            k6l k6lVar = browserActivity.V;
            if (k6lVar == null) {
                k6lVar = null;
            }
            boolean zM = ((d7l) b2lVarW0).j.m();
            if (i >= 0) {
                if (i < k6lVar.t(zM)) {
                    ArrayList arrayList = k6lVar.b;
                    b2lVar = zM ? (b2l) arrayList.get(k6lVar.q() + i) : (b2l) arrayList.get(i);
                }
                if (b2lVar != b2lVarW0 || b2lVar == null) {
                }
                k6l k6lVar2 = browserActivity.V;
                (k6lVar2 != null ? k6lVar2 : null).C(b2lVar, 3);
                return;
            }
            k6lVar.getClass();
            b2lVar = null;
            if (b2lVar != b2lVarW0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r0.j.M(false) != false) goto L12;
     */
    @Override // defpackage.l24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j() {
        /*
            r4 = this;
            int r0 = com.opera.android.BrowserActivity.E1
            com.opera.android.BrowserActivity r4 = r4.d
            qim r0 = r4.o
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.b()
            r1 = 1
            if (r0 != 0) goto L2d
            b2l r0 = r4.w0()
            r2 = 0
            if (r0 == 0) goto L2e
            d7l r0 = (defpackage.d7l) r0
            e7l r3 = r0.j
            boolean r3 = r3.isLoading()
            if (r3 == 0) goto L25
            r0.V()
            return r1
        L25:
            e7l r0 = r0.j
            boolean r0 = r0.M(r2)
            if (r0 == 0) goto L2e
        L2d:
            return r1
        L2e:
            eq9 r4 = r4.S()
            d37 r0 = r4.a
            boolean r0 = r0.p()
            if (r0 == 0) goto L3e
            r4.b()
            return r1
        L3e:
            boolean r0 = r4.b
            if (r0 == 0) goto L46
            r4.d(r2)
            return r1
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av3.j():boolean");
    }

    @Override // defpackage.l24
    public final void l() {
        LinkedHashSet linkedHashSet = this.a;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((ViewGroup) it.next()).setDescendantFocusability(131072);
        }
        linkedHashSet.clear();
        View view = this.c;
        this.c = null;
        if (view != null && view.isAttachedToWindow() && view.findFocus() == null) {
            view.requestFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.l24
    public final boolean u() {
        int iT;
        r rVar = this.d;
        if (!rVar.g1.a.a) {
            rVar.moveTaskToBack(true);
            return true;
        }
        Object[] objArr = rVar.B0() != null;
        if (!rVar.m0()) {
            qim qimVar = rVar.o;
            Objects.requireNonNull(qimVar);
            if (!qimVar.b()) {
                gbf gbfVar = rVar.M;
                if (gbfVar == null) {
                    gbfVar = null;
                }
                if (gbfVar.j.p()) {
                    gbf gbfVar2 = rVar.M;
                    if (gbfVar2 == null) {
                        gbfVar2 = null;
                    }
                    boolean zI = gbfVar2.i();
                    gbf gbfVar3 = rVar.M;
                    if (zI) {
                        (gbfVar3 != null ? gbfVar3 : null).f();
                        return true;
                    }
                    (gbfVar3 != null ? gbfVar3 : null).m(false);
                    return true;
                }
                b2l b2lVarW0 = rVar.w0();
                lqm lqmVar = lqm.i;
                if (objArr == true) {
                    rVar.getSupportFragmentManager().X();
                    if (b2lVarW0 != null) {
                        d7l d7lVar = (d7l) b2lVarW0;
                        if (d7lVar.l == lqmVar && ((NavigationHistory) ((iuh) d7lVar.i()).b).d() == 0) {
                            k6l k6lVar = rVar.V;
                            k6l k6lVar2 = k6lVar != null ? k6lVar : null;
                            k6lVar2.getClass();
                            d7lVar.N();
                            k6lVar2.p = d7lVar;
                            return false;
                        }
                    }
                } else if (b2lVarW0 == null || !((d7l) b2lVarW0).j.M(true)) {
                    if (rVar.S().a.p()) {
                        rVar.S().b();
                        return true;
                    }
                    if (rVar.S().b) {
                        rVar.S().d(false);
                        return true;
                    }
                    if (b2lVarW0 != null) {
                        d7l d7lVar2 = (d7l) b2lVarW0;
                        if (d7lVar2.f()) {
                            rVar.c1(new by3(1, 2));
                            return true;
                        }
                        if (d7lVar2.l != lqmVar) {
                            boolean zM = d7lVar2.j.m();
                            k6l k6lVar3 = rVar.V;
                            if (zM) {
                                if (k6lVar3 == null) {
                                    k6lVar3 = null;
                                }
                                iT = k6lVar3.b.size();
                            } else {
                                if (k6lVar3 == null) {
                                    k6lVar3 = null;
                                }
                                iT = k6lVar3.t(false);
                            }
                            if (!d7lVar2.n0() && iT > 1) {
                                k6l k6lVar4 = rVar.V;
                                (k6lVar4 != null ? k6lVar4 : null).k(b2lVarW0);
                                return true;
                            }
                            if (d7lVar2.n0()) {
                                p6l p6lVarT = b2lVarW0.T();
                                p6l p6lVar = p6l.b;
                                if (p6lVarT == p6lVar) {
                                    k6l k6lVar5 = rVar.V;
                                    if (k6lVar5 == null) {
                                        k6lVar5 = null;
                                    }
                                    if (k6lVar5.s(p6lVar) == 1) {
                                        k6l k6lVar6 = rVar.V;
                                        (k6lVar6 != null ? k6lVar6 : null).k(b2lVarW0);
                                        return true;
                                    }
                                }
                            }
                        } else {
                            k6l k6lVar7 = rVar.V;
                            k6l k6lVar8 = k6lVar7 != null ? k6lVar7 : null;
                            k6lVar8.getClass();
                            d7lVar2.N();
                            k6lVar8.p = d7lVar2;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}

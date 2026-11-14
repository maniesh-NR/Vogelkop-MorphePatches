package com.opera.android.translate_web_pages;

import J.N;
import androidx.annotation.NonNull;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.translate_web_pages.NavEntryTranslationDataHelper;
import defpackage.b2l;
import defpackage.d5m;
import defpackage.j5m;
import defpackage.k6l;
import defpackage.kze;
import defpackage.pje;
import defpackage.uy3;
import defpackage.vz5;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class NavEntryTranslationDataHelper {
    public final pje a;
    public final pje b;
    public final pje c;
    public final k6l d;
    public kze e;
    public vz5 f;
    public j5m g;
    public boolean h;

    /* JADX WARN: Type inference failed for: r0v0, types: [pje] */
    /* JADX WARN: Type inference failed for: r0v1, types: [pje] */
    /* JADX WARN: Type inference failed for: r0v2, types: [pje] */
    public NavEntryTranslationDataHelper(k6l k6lVar) {
        final byte b = 0;
        this.a = new f7f(this) { // from class: pje
            public final /* synthetic */ NavEntryTranslationDataHelper b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                NavEntryTranslationDataHelper navEntryTranslationDataHelper = this.b;
                switch (b2) {
                    case 0:
                        j5m j5mVar = (j5m) obj;
                        pje pjeVar = navEntryTranslationDataHelper.b;
                        j5m j5mVar2 = navEntryTranslationDataHelper.g;
                        if (j5mVar2 != null) {
                            j5mVar2.d.p(pjeVar);
                        }
                        navEntryTranslationDataHelper.g = j5mVar;
                        if (j5mVar != null) {
                            j5mVar.d.k(pjeVar);
                            break;
                        }
                        break;
                    case 1:
                        navEntryTranslationDataHelper.b();
                        break;
                    default:
                        navEntryTranslationDataHelper.b();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.b = new f7f(this) { // from class: pje
            public final /* synthetic */ NavEntryTranslationDataHelper b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                NavEntryTranslationDataHelper navEntryTranslationDataHelper = this.b;
                switch (b22) {
                    case 0:
                        j5m j5mVar = (j5m) obj;
                        pje pjeVar = navEntryTranslationDataHelper.b;
                        j5m j5mVar2 = navEntryTranslationDataHelper.g;
                        if (j5mVar2 != null) {
                            j5mVar2.d.p(pjeVar);
                        }
                        navEntryTranslationDataHelper.g = j5mVar;
                        if (j5mVar != null) {
                            j5mVar.d.k(pjeVar);
                            break;
                        }
                        break;
                    case 1:
                        navEntryTranslationDataHelper.b();
                        break;
                    default:
                        navEntryTranslationDataHelper.b();
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.c = new f7f(this) { // from class: pje
            public final /* synthetic */ NavEntryTranslationDataHelper b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b3;
                NavEntryTranslationDataHelper navEntryTranslationDataHelper = this.b;
                switch (b22) {
                    case 0:
                        j5m j5mVar = (j5m) obj;
                        pje pjeVar = navEntryTranslationDataHelper.b;
                        j5m j5mVar2 = navEntryTranslationDataHelper.g;
                        if (j5mVar2 != null) {
                            j5mVar2.d.p(pjeVar);
                        }
                        navEntryTranslationDataHelper.g = j5mVar;
                        if (j5mVar != null) {
                            j5mVar.d.k(pjeVar);
                            break;
                        }
                        break;
                    case 1:
                        navEntryTranslationDataHelper.b();
                        break;
                    default:
                        navEntryTranslationDataHelper.b();
                        break;
                }
            }
        };
        this.d = k6lVar;
    }

    @NonNull
    public static TranslationData createTranslationData(int i, @NonNull String str) {
        return new TranslationData(i, str);
    }

    public final WebContents a() {
        b2l b2lVar = this.d.o;
        if (b2lVar == null) {
            return null;
        }
        uy3 uy3VarF = uy3.F(b2lVar);
        ChromiumContent chromiumContent = uy3VarF != null ? uy3VarF.b : null;
        if (chromiumContent == null) {
            return null;
        }
        return chromiumContent.e();
    }

    public final void b() {
        WebContents webContentsA;
        if (!this.h || (webContentsA = a()) == null) {
            return;
        }
        j5m j5mVar = this.g;
        int i = 1;
        if (j5mVar != null && ((d5m) j5mVar.d.g()).b()) {
            i = 2;
        }
        kze kzeVar = this.e;
        N.M0t0GVr5(webContentsA, i, kzeVar == null ? "" : (String) kzeVar.g());
    }

    public final void c(vz5 vz5Var) {
        vz5 vz5Var2 = this.f;
        pje pjeVar = this.a;
        if (vz5Var2 != null) {
            ((kze) vz5Var2.f).p(pjeVar);
        }
        if (this.h) {
            this.h = false;
        }
        this.f = vz5Var;
        if (vz5Var != null) {
            ((kze) vz5Var.f).k(pjeVar);
        }
    }
}
